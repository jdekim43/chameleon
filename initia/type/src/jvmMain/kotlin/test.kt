import io.ktor.util.*
import kr.jadekim.common.crypto.hash.SHA_256
import kr.jadekim.common.crypto.hash.hash
import kr.jadekim.common.encoder.Base64
import kr.jadekim.common.encoder.decode
import kr.jadekim.common.extension.bigEndian
import kr.jadekim.common.extension.padStart
import kr.jadekim.common.extension.toLongWithinLittleEndian
import tendermint.types.Block
import tendermint.types.Commit
import tendermint.types.converter
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.File
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.util.zip.GZIPInputStream

fun main() {
//    println(BatchDataHeader.parse("AAAAAAAAC8r+AAAAAAAL0rwAAAAAAAAAA/DzccOwTY6w+RXjplpJ8oR7mEK7B4ooIKpF2G32UYtKL8hQ75a0irehciPfQ4kRcUtAGNMmZAwLiMKYF8xqZ2BtNxGMtzk/NleFH/aBZBTzdt9vh08iN72ly6oKh2nTtQ==".decodeBase64()))

    val blobsDirectory = File("/Users/jade/Desktop/inertia-sync/blobs-8498303")
    val blobs = blobsDirectory.listFiles()
        .map { it.readBytes() }

    val parsed = blobs.map {
        when (it[0]) {
            0.toByte() -> BatchDataHeader.parse(it)
            1.toByte() -> BatchDataChunk.parse(it)
            else -> throw IllegalArgumentException("Invalid blob")
        }
    }
        .onEach { println(it) }

//    val header = parsed.first { it is BatchDataHeader } as BatchDataHeader
    val header = BatchDataHeader(
        start = 15980484,
        end = 15982802,
        checksums = listOf(
            "mC+AaBvXwxR+cdjQ8xBKfpTMfmjROrhlP8TSUAwFTjs=".decode(Base64),
            "Ao7lNUFGt+E4wB9nThE6U5343qG8Rc6LJ5j4G2+HCzo=".decode(Base64),
            "AfUR/XrR1E8eBth0Cy9OUy69BWW3mH9zLQRR0HEk4YI=".decode(Base64),
        )
    )
    val chunks = parsed.filter { it is BatchDataChunk }.map { it as BatchDataChunk }

    chunks.forEach { chunk ->
        println(chunk)
        if (!chunk.data.hash(SHA_256).contentEquals(header.checksums[chunk.index.toInt()])) {
            throw IllegalStateException("Invalid checksum")
        }
    }

    if (chunks.size != header.checksums.size) {
        throw IllegalStateException("Invalid checksum size")
    }
    val batchBytes = chunks.sortedBy { it.index }.flatMap { it.data.asIterable() }.toByteArray()
    val decompressed = decompressBatch(batchBytes)
//    val decompressed = File(blobsDirectory, "chunks.bin.recovered").readBytes()
    val rawData = parseBatch(decompressed)
    val rawBlocks = rawData.dropLast(1)
    val rawCommit = rawData.takeLast(1)

    val blocks = rawBlocks.map { Block.converter.deserialize(it) }
        .forEach { println("height=${it.header.height}, dataHash=${it.header.dataHash.encodeBase64()}") }

    val commits = rawCommit.map { Commit.converter.deserialize(it) }
        .forEach { println("height=${it.height}, blockHash=${it.blockId.hash.encodeBase64()}") }
}

data class BatchDataHeader(
    val start: Long,
    val end: Long,
    val checksums: List<ByteArray>,
) {

    companion object {
        fun parse(bytes: ByteArray): BatchDataHeader {
            if (bytes[0] != 0.toByte()) {
                throw IllegalArgumentException("Maybe it's not BatchDataHeader")
            }

            if (bytes.size < 25) {
                throw IllegalArgumentException("Invalid data length")
            }

            val buffer = ByteBuffer.wrap(bytes)
            buffer.order(ByteOrder.BIG_ENDIAN)

            val start = buffer.getLong(1)
            val end = buffer.getLong(9)

            if (start > end) {
                throw IllegalStateException("Invalid start")
            }

            val checksumLength = buffer.getLong(17)

            if ((bytes.size - 25) % 32 != 0 || ((bytes.size - 25) / 32) != checksumLength.toInt()) {
                throw IllegalStateException("Checksum length mismatch")
            }

            val checksums = mutableListOf<ByteArray>()
            for (i in 25 until bytes.size step 32) {
                checksums.add(bytes.sliceArray(i until i + 32))
            }

            if (checksumLength.toInt() != checksums.size) {
                throw IllegalStateException("Checksum length mismatch")
            }

            return BatchDataHeader(start, end, checksums)
        }
    }

    fun toByteArray(): ByteArray = ByteArrayOutputStream().use {
        it.write(byteArrayOf(0))
        it.write(start.bigEndian)
        it.write(end.bigEndian)
        it.write(checksums.size.toLong().bigEndian)
        checksums.forEach { checksum -> it.write(checksum.padStart(32)) }
        it.toByteArray()
    }

    override fun toString(): String {
        return "BatchDataHeader(start=$start, end=$end, checksums=${
            checksums.joinToString(
                prefix = "[",
                postfix = "]"
            ) { it.encodeBase64() }
        })"
    }
}

data class BatchDataChunk(
    val start: Long,
    val end: Long,
    val index: Long,
    val length: Long,
    val data: ByteArray,
) {

    companion object {
        fun parse(bytes: ByteArray): BatchDataChunk {
            if (bytes[0] != 1.toByte()) {
                throw IllegalArgumentException("Maybe it's not BatchDataChunk")
            }

            if (bytes.size < 33) {
                throw IllegalArgumentException("Invalid data length")
            }

            val buffer = ByteBuffer.wrap(bytes)
            buffer.order(ByteOrder.BIG_ENDIAN)

            val start = buffer.getLong(1)
            val end = buffer.getLong(9)
            if (start > end) {
                throw IllegalStateException("Invalid start")
            }

            val index = buffer.getLong(17)
            val length = buffer.getLong(25)
            val data = bytes.sliceArray(33 until bytes.size)

            return BatchDataChunk(start, end, index, length, data)
        }
    }

    override fun toString(): String {
        return "BatchDataChunk(start=$start, end=$end, index=$index, length=$length, dataLength=${data.size})"
    }
}

fun decompressBatch(bytes: ByteArray): ByteArray {
    return ByteArrayInputStream(bytes).use { inputStream ->
        GZIPInputStream(inputStream).use { gzip ->
            gzip.readBytes()
        }
    }}

fun parseBatch(bytes: ByteArray): List<ByteArray> {
    val blockBytes = mutableListOf<ByteArray>()

    var offset = 0
    while (offset < bytes.size) {
        val bytesLength = bytes.sliceArray(offset until offset + 8).toLongWithinLittleEndian().toInt()
        offset += 8
        blockBytes.add(bytes.sliceArray(offset until offset + bytesLength))
        offset += bytesLength
    }

    return blockBytes
}
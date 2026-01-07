package kr.jadekim.chameleon.core.hd

import kr.jadekim.common.crypto.mac.HMAC_SHA_512
import kr.jadekim.common.crypto.mac.hash
import kr.jadekim.common.encoder.Base58WithChecksum
import kr.jadekim.common.encoder.decode
import kr.jadekim.common.encoder.encode
import kr.jadekim.common.extension.toUIntWithinBigEndian
import kr.jadekim.common.extension.write

data class ExtendedPublicKey(
    val publicKey: HDPublicKey,
    val chainCode: ByteArray,
    val depth: UByte,
    val path: KeyPath,
    val parentFingerprint: UInt,
) {

    companion object {
        fun fromBase58(
            input: String,
            checkVersion: (UInt) -> Boolean,
            parentPath: KeyPath = KeyPath.EMPTY
        ): Pair<UInt, ExtendedPublicKey> {
            val decoded = input.decode(Base58WithChecksum)
            if (decoded.size != 78) {
                throw IllegalArgumentException("Invalid length")
            }

            val version = decoded.sliceArray(0 until 4).toUIntWithinBigEndian()
            require(checkVersion(version)) { "Invalid network version" }

            val depth = decoded[4].toUByte()

            val parentFingerprint = decoded.sliceArray(5 until 9).toUIntWithinBigEndian()
            if (depth == 0.toUByte() && parentFingerprint != 0x00000000u) {
                throw IllegalArgumentException("Invalid parent fingerprint")
            }

            val index = decoded.sliceArray(9 until 13).toUIntWithinBigEndian()
            if (depth == 0.toUByte() && index != 0u) {
                throw IllegalArgumentException("Invalid index")
            }

            val chainCode = decoded.sliceArray(13 until 45)

            val publicKey = decoded.sliceArray(45 until 78)

            return version to ExtendedPublicKey(
                HDPublicKey(publicKey),
                chainCode,
                depth,
                parentPath + index,
                parentFingerprint,
            )
        }
    }

    val index = path.last()

    val fingerprint: UInt by lazy { publicKey.hash160.sliceArray(0 until 4).toUIntWithinBigEndian() }

    init {
        require(publicKey.isValid()) { "Invalid public key" }
        require(depth != 0.toUByte() || parentFingerprint == 0u) { "zero depth with non-zero parent fingerprint" }
        require(depth != 0.toUByte() || index == 0u) { "zero depth with non-zero child number" }
    }

    fun derive(index: UInt): ExtendedPublicKey {
        require(!index.isHardened) { "Cannot derive public keys from public hardened keys" }

        val data = ByteArray(37).apply {
            write(0, publicKey.compressed)
            write(33, index)
        }

        val I = data.hash(HMAC_SHA_512, chainCode)
        val IL = I.sliceArray(0 until 32)
        val IR = I.sliceArray(32 until I.size)

        val newPrivateKey = HDPrivateKey(IL)
        require(newPrivateKey.isValid()) { "cannot generate child public key: IL is invalid" }

        val newPublicKey = newPrivateKey.createPublicKey() + publicKey
        require(newPublicKey.isValid()) { "cannot generate child public key: resulting public key is invalid" }

        return ExtendedPublicKey(
            newPublicKey,
            IR,
            depth.inc(),
            path + index,
            fingerprint
        )
    }

    fun derive(path: List<UInt>): ExtendedPublicKey = path.fold(this) { acc, index -> acc.derive(index) }

    fun derive(path: KeyPath): ExtendedPublicKey = derive(path.path)

    fun derive(path: String): ExtendedPublicKey = derive(KeyPath(path))

    fun toBase58(version: UInt): String = ByteArray(78).apply {
        write(0, version)
        write(4, depth)
        write(5, parentFingerprint)
        write(9, index)
        write(13, chainCode)
        write(45, publicKey.compressed)
    }.encode(Base58WithChecksum)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ExtendedPublicKey

        if (publicKey != other.publicKey) return false
        if (!chainCode.contentEquals(other.chainCode)) return false
        if (depth != other.depth) return false
        if (path != other.path) return false
        if (parentFingerprint != other.parentFingerprint) return false

        return true
    }

    override fun hashCode(): Int {
        var result = publicKey.hashCode()
        result = 31 * result + chainCode.contentHashCode()
        result = 31 * result + depth.hashCode()
        result = 31 * result + path.hashCode()
        result = 31 * result + parentFingerprint.hashCode()
        return result
    }
}
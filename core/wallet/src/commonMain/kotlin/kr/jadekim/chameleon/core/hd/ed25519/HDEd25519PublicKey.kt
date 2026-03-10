package kr.jadekim.chameleon.core.hd.ed25519

import kr.jadekim.chameleon.core.crypto.ed25519.Ed25519
import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.common.crypto.hash.RIPEMD160
import kr.jadekim.common.crypto.hash.SHA_256
import kr.jadekim.common.crypto.hash.hash
import kr.jadekim.common.encoder.Hex
import kr.jadekim.common.encoder.encode

open class HDEd25519PublicKey(bytes: ByteArray) : PublicKey {

    val compressed: ByteArray =
        if (isCompressed(bytes)) bytes.copyOf()
        else if (isUncompressed(bytes)) Ed25519.compressPublicKey(bytes)
        else throw IllegalArgumentException("Invalid public key")

    val uncompressed: ByteArray by lazy {
        if (isCompressed(bytes)) Ed25519.decompressPublicKey(bytes)
        else if (isUncompressed(bytes)) bytes.copyOf()
        else throw IllegalArgumentException("Invalid public key")
    }

    val hash160: ByteArray by lazy {
        compressed.hash(SHA_256).hash(RIPEMD160)
    }

    init {
        require(bytes.size == BYTE_SIZE_COMPRESSED || bytes.size == BYTE_SIZE_UNCOMPRESSED) { "Invalid public key size" }
        require(isValid()) { "Invalid public key" }
    }

    override val bytes: ByteArray = compressed

    companion object {
        const val BYTE_SIZE_COMPRESSED = 33
        const val BYTE_SIZE_UNCOMPRESSED = 32

        fun isCompressed(bytes: ByteArray) = bytes.size == BYTE_SIZE_COMPRESSED

        fun isUncompressed(bytes: ByteArray) = bytes.size == BYTE_SIZE_UNCOMPRESSED
    }

    override fun verify(message: ByteArray, signature: ByteArray): Boolean =
        Ed25519.verify(signature, message, uncompressed)

    fun isValid(): Boolean = Ed25519.isValidPublicKey(uncompressed)

    override fun toAddressBytes(): ByteArray = hash160

    fun toHex(): String = bytes.encode(Hex)

    override fun toString(): String = toHex()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as HDEd25519PublicKey

        return bytes.contentEquals(other.bytes)
    }

    override fun hashCode(): Int {
        return bytes.contentHashCode()
    }
}
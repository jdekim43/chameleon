package kr.jadekim.chameleon.core.hd

import kr.jadekim.chameleon.core.crypto.secp256k1.Secp256k1
import kr.jadekim.chameleon.core.hd.schnorr.XOnlyPublicKey
import kr.jadekim.common.annotation.InDevelopment
import kr.jadekim.common.crypto.hash.RIPEMD160
import kr.jadekim.common.crypto.hash.SHA_256
import kr.jadekim.common.crypto.hash.hash
import kr.jadekim.common.encoder.Hex
import kr.jadekim.common.encoder.encode

open class HDPublicKey(bytes: ByteArray) {

    val compressed: ByteArray =
        if (isCompressed(bytes)) bytes
        else if (isUncompressed(bytes)) Secp256k1.compressPublicKey(bytes)
        else throw IllegalArgumentException("Invalid public key")

    val uncompressed: ByteArray by lazy {
        if (isCompressed(bytes)) Secp256k1.decompressPublicKey(bytes)
        else if (isUncompressed(bytes)) bytes
        else throw IllegalArgumentException("Invalid public key")
    }

    val hash160: ByteArray by lazy {
        compressed.hash(SHA_256).hash(RIPEMD160)
    }

    init {
        require(bytes.size == BYTE_SIZE_COMPRESSED || bytes.size == BYTE_SIZE_UNCOMPRESSED) { "Invalid public key size" }
        require(isValid()) { "Invalid public key" }
    }

    companion object {
        const val BYTE_SIZE_COMPRESSED = 33
        const val BYTE_SIZE_UNCOMPRESSED = 65

        fun isCompressed(bytes: ByteArray) =
            bytes.size == BYTE_SIZE_COMPRESSED && (bytes[0] == 2.toByte() || bytes[0] == 3.toByte())

        fun isUncompressed(bytes: ByteArray) = bytes.size == BYTE_SIZE_UNCOMPRESSED && bytes[0] == 4.toByte()

        fun recovery(signature: ByteArray, message: ByteArray, recoveryId: Int): HDPublicKey {
            return HDPublicKey(Secp256k1.recoveryPublicKey(signature, message, recoveryId))
        }

        /**
         * Recover public keys from a signature and the message that was signed. This method will return 2 public keys, and the signature
         * can be verified with both, but only one of them matches that private key that was used to generate the signature.
         * @param signature signature
         * @param message message that was signed
         * @return a (key1, key2) tuple where key1 and key2 are candidates public keys. If you have the recovery id then use
         *         key1 if the recovery id is even and key2 if it is odd
         */
        fun recovery(signature: ByteArray, message: ByteArray): Pair<HDPublicKey, HDPublicKey> {
            val key1 = HDPublicKey(Secp256k1.recoveryPublicKey(signature, message, 0))
            val key2 = HDPublicKey(Secp256k1.recoveryPublicKey(signature, message, 1))

            return key1 to key2
        }
    }

    operator fun plus(that: HDPublicKey): HDPublicKey = HDPublicKey(
        Secp256k1.combinePublicKey(arrayOf(compressed, that.compressed))
    )

    operator fun unaryMinus(): HDPublicKey = HDPublicKey(Secp256k1.publicKeyNegate(compressed))

    operator fun minus(that: HDPublicKey): HDPublicKey = this + -that

    operator fun times(that: HDPublicKey): HDPublicKey =
        HDPublicKey(Secp256k1.publicKeyTweakMul(compressed, that.compressed))

    fun verify(message: ByteArray, signature: ByteArray): Boolean =
        Secp256k1.verify(signature, message, compressed)

    fun isValid(): Boolean = Secp256k1.isValidPublicKey(compressed)

    fun isEven(): Boolean = compressed[0] == 2.toByte()

    fun isOdd(): Boolean = !isEven()

    @InDevelopment
    fun toXOnly(): XOnlyPublicKey = XOnlyPublicKey(this)

    fun toHex(): String = compressed.encode(Hex)

    override fun toString(): String = toHex()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as HDPublicKey

        return compressed.contentEquals(other.compressed)
    }

    override fun hashCode(): Int {
        return compressed.contentHashCode()
    }
}
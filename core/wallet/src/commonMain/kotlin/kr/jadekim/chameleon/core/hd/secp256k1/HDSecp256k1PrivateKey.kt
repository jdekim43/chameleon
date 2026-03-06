package kr.jadekim.chameleon.core.hd.secp256k1

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Deferred
import kr.jadekim.chameleon.core.crypto.secp256k1.Secp256k1
import kr.jadekim.chameleon.core.hd.Curve
import kr.jadekim.chameleon.core.key.PrivateKey
import kr.jadekim.common.encoder.Base58WithChecksum
import kr.jadekim.common.encoder.Hex
import kr.jadekim.common.encoder.decode
import kr.jadekim.common.encoder.encode

open class HDSecp256k1PrivateKey(bytes: ByteArray) : PrivateKey {

    val uncompressed: ByteArray = if (!isCompressed(bytes)) bytes.copyOf() else bytes.copyOf(BYTE_SIZE_UNCOMPRESSED)
    val compressed: ByteArray by lazy { uncompressed + 1.toByte() }

    init {
        require(bytes.size == BYTE_SIZE_COMPRESSED || bytes.size == BYTE_SIZE_UNCOMPRESSED) { "Invalid private key size" }
        require(isValid()) { "Invalid private key" }
    }

    override val bytes: ByteArray = compressed

    companion object {
        const val BYTE_SIZE_COMPRESSED = 33
        const val BYTE_SIZE_UNCOMPRESSED = Curve.ECDSA.PRIVATE_KEY_SIZE

        fun fromBase58(input: String): Pair<UByte, HDSecp256k1PrivateKey> {
            val decoded = input.decode(Base58WithChecksum)

            return decoded.first().toUByte() to HDSecp256k1PrivateKey(decoded.sliceArray(1 until decoded.size))
        }

        fun fromHex(input: String): HDSecp256k1PrivateKey = HDSecp256k1PrivateKey(input.decode(Hex))

        fun isCompressed(bytes: ByteArray): Boolean = bytes.size == BYTE_SIZE_COMPRESSED && bytes.last() == 1.toByte()
    }

    operator fun plus(that: HDSecp256k1PrivateKey): HDSecp256k1PrivateKey =
        HDSecp256k1PrivateKey(Secp256k1.privateKeyTweakAdd(uncompressed, that.uncompressed))

    operator fun unaryMinus(): HDSecp256k1PrivateKey = HDSecp256k1PrivateKey(Secp256k1.privateKeyNegate(uncompressed))

    operator fun minus(that: HDSecp256k1PrivateKey): HDSecp256k1PrivateKey = plus(-that)

    operator fun times(that: HDSecp256k1PrivateKey): HDSecp256k1PrivateKey =
        HDSecp256k1PrivateKey(Secp256k1.privateKeyTweakMul(uncompressed, that.uncompressed))

    override fun sign(message: ByteArray): Deferred<ByteArray> = CompletableDeferred(signSync(message))

    open fun signSync(message: ByteArray): ByteArray = Secp256k1.sign(message, uncompressed)

    fun tweak(tweak: HDSecp256k1PrivateKey): HDSecp256k1PrivateKey {
        val key = if (createPublicKey().isEven()) this else -this

        return key + tweak
    }

    fun isValid(): Boolean = Secp256k1.isValidPrivateKey(uncompressed)

    override fun createPublicKey(): HDSecp256k1PublicKey = HDSecp256k1PublicKey(Secp256k1.createPublicKey(uncompressed))

    fun toBase58(version: UByte): String = (byteArrayOf(version.toByte()) + compressed).encode(Base58WithChecksum)

    fun toHex(): String = uncompressed.encode(Hex)

    override fun toString(): String = "<private_key>"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as HDSecp256k1PrivateKey

        return !uncompressed.contentEquals(other.uncompressed)
    }

    override fun hashCode(): Int {
        return uncompressed.contentHashCode()
    }
}

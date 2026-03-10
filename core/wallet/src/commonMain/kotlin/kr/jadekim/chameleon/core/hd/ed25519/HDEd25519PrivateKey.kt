package kr.jadekim.chameleon.core.hd.ed25519

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Deferred
import kr.jadekim.chameleon.core.crypto.ed25519.Ed25519
import kr.jadekim.chameleon.core.key.PrivateKey
import kr.jadekim.common.encoder.Hex
import kr.jadekim.common.encoder.decode
import kr.jadekim.common.encoder.encode

open class HDEd25519PrivateKey(bytes: ByteArray) : PrivateKey {

    override val bytes: ByteArray = bytes.copyOf()

    val seed: ByteArray by lazy {
        bytes.copyOfRange(0, BYTE_SIZE_SEED)
    }

    init {
        require(bytes.size == BYTE_SIZE || bytes.size == BYTE_SIZE_SEED) { "Invalid private key size" }
        require(isValid()) { "Invalid private key" }
    }

    companion object {
        const val BYTE_SIZE_SEED = 32
        const val BYTE_SIZE = BYTE_SIZE_SEED + HDEd25519PublicKey.BYTE_SIZE_UNCOMPRESSED

        fun fromHex(input: String): HDEd25519PrivateKey = HDEd25519PrivateKey(input.decode(Hex))
    }

    override fun sign(message: ByteArray): Deferred<ByteArray> = CompletableDeferred(signSync(message))

    open fun signSync(message: ByteArray): ByteArray = Ed25519.sign(message, bytes)

    fun isValid(): Boolean = Ed25519.isValidPrivateKey(bytes)

    override fun createPublicKey(): HDEd25519PublicKey = HDEd25519PublicKey(Ed25519.createPublicKey(bytes))

    fun toHex(): String = bytes.encode(Hex)

    override fun toString(): String = "<private_key>"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as HDEd25519PrivateKey

        return !bytes.contentEquals(other.bytes)
    }

    override fun hashCode(): Int {
        return bytes.contentHashCode()
    }
}

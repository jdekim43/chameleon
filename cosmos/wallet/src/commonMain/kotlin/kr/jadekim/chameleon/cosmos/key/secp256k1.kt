package kr.jadekim.chameleon.cosmos.key

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Deferred
import kr.jadekim.chameleon.core.crypto.Bip32
import kr.jadekim.chameleon.core.crypto.Ripemd160
import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.core.key.KeyPair
import kr.jadekim.common.encoder.decodeBase64
import kr.jadekim.common.extension.toFixed
import kr.jadekim.common.extension.utf8
import kr.jadekim.common.hash.SHA_256

const val COSMOS_KEY_SIZE = 33

fun ByteArray.truncateAsCosmosKeySize() = toFixed(COSMOS_KEY_SIZE)

interface Secp256k1PublicKey : Key {

    override val address: ByteArray
        get() = Ripemd160.hash(SHA_256.hash(publicKey))

    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        return Bip32.verify(SHA_256.hash(message), publicKey, signature)
    }

    companion object {

        @JvmStatic
        fun recoverFromSignature(message: ByteArray, signature: ByteArray) = object : Secp256k1PublicKey {
            override val publicKey: ByteArray = Bip32.recoverPublicKey(SHA_256.hash(message), signature)
        }

        @JvmStatic
        fun recoverFromSignature(message: String, signature: ByteArray) =
            recoverFromSignature(message.utf8(), signature)

        @JvmStatic
        fun recoverFromSignature(message: ByteArray, signature: String) =
            recoverFromSignature(message, signature.decodeBase64())

        @JvmStatic
        fun recoverFromSignature(message: String, signature: String) =
            recoverFromSignature(message.utf8(), signature.decodeBase64())
    }
}

interface Secp256k1KeyPair : KeyPair, Secp256k1PublicKey {

    fun signSync(message: ByteArray): ByteArray = Bip32.sign(SHA_256.hash(message), privateKey)

    fun signSync(message: String): ByteArray = signSync(message.utf8())

    override fun sign(message: ByteArray): Deferred<ByteArray> = CompletableDeferred(signSync(message))
}

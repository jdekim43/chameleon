package kr.jadekim.chameleon.cosmos.key

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Deferred
import kr.jadekim.chameleon.core.crypto.Bech32
import kr.jadekim.chameleon.core.crypto.Bip32
import kr.jadekim.chameleon.core.crypto.Ripemd160
import kr.jadekim.chameleon.core.key.KeyPair
import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.common.extension.utf8
import kr.jadekim.common.hash.SHA_256

interface Secp256k1PublicKey : PublicKey {

    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        return Bip32.verify(SHA_256.hash(message), publicKey, signature)
    }
}

fun Secp256k1PublicKey.toAddress(): ByteArray = Ripemd160.hash(SHA_256.hash(publicKey))

interface Secp256k1KeyPair : KeyPair, Secp256k1PublicKey {

    fun signSync(message: ByteArray): ByteArray = Bip32.sign(SHA_256.hash(message), privateKey)

    fun signSync(message: String): ByteArray = signSync(message.utf8())

    override fun sign(message: ByteArray): Deferred<ByteArray> = CompletableDeferred(signSync(message))
}
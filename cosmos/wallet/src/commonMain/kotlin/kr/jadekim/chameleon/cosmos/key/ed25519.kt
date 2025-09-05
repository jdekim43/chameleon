package kr.jadekim.chameleon.cosmos.key

import kr.jadekim.chameleon.core.key.Key

interface Ed25519PublicKey : Key {

    override val address: ByteArray
        get() = addressFromPublicKeyHash

    @Deprecated("Not yet implemented")
    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        TODO("Not yet implemented")
    }
}

//interface Ed25519KeyPair : KeyPair, Secp256k1PublicKey {
//    override fun sign(message: ByteArray): Deferred<ByteArray> = CompletableDeferred(/*todo*/)
//}
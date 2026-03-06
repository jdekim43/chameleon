package kr.jadekim.chameleon.sei.key

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Deferred
import kr.jadekim.chameleon.core.hd.secp256k1.HDSecp256k1PrivateKey
import kr.jadekim.chameleon.core.hd.secp256k1.HDSecp256k1PublicKey
import kr.jadekim.common.crypto.hash.SHA_256
import kr.jadekim.common.crypto.hash.hash

open class SeiPublicKey(bytes: ByteArray) : HDSecp256k1PublicKey(bytes) {

    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        return super.verify(message.hash(SHA_256), signature)
    }
}

open class SeiPrivateKey(bytes: ByteArray) : HDSecp256k1PrivateKey(bytes) {

    override fun createPublicKey(): SeiPublicKey = SeiPublicKey(super.createPublicKey().bytes)

    override fun signSync(message: ByteArray) = super.signSync(message.hash(SHA_256))

    override fun sign(message: ByteArray): Deferred<ByteArray> = CompletableDeferred(signSync(message))
}

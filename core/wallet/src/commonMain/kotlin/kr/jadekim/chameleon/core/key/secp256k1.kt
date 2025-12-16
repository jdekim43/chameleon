package kr.jadekim.chameleon.core.key

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Deferred
import kr.jadekim.chameleon.core.hd.HDPrivateKey
import kr.jadekim.chameleon.core.hd.HDPublicKey
import kr.jadekim.common.crypto.hash.SHA_256
import kr.jadekim.common.crypto.hash.hash
import kr.jadekim.common.extension.utf8

interface Secp256k1PublicKey : PublicKey

interface HDSecp256k1PublicKey : Secp256k1PublicKey {

    val hdPublicKey: HDPublicKey

    override val publicKey: ByteArray
        get() = hdPublicKey.compressed

    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        return hdPublicKey.verify(message.hash(SHA_256), signature)
    }

    fun toAddress(): ByteArray = hdPublicKey.hash160
}

interface Secp256k1PrivateKey : PrivateKey {

    fun signSync(message: ByteArray): ByteArray

    fun signSync(message: String): ByteArray = signSync(message.utf8())

    override fun sign(message: ByteArray): Deferred<ByteArray> = CompletableDeferred(signSync(message))
}

interface HDSecp256k1PrivateKey : Secp256k1PrivateKey {
    val hdPrivateKey: HDPrivateKey

    override val privateKey: ByteArray
        get() = hdPrivateKey.uncompressed

    override fun signSync(message: ByteArray) = hdPrivateKey.signSync(message.hash(SHA_256))
}

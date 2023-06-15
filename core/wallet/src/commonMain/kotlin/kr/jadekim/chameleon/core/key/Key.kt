package kr.jadekim.chameleon.core.key

import kotlinx.coroutines.Deferred
import kr.jadekim.common.encoder.decodeBase64
import kr.jadekim.common.encoder.encodeHex
import kr.jadekim.common.extension.utf8

interface Key {

    val publicKey: ByteArray

    fun sign(message: ByteArray): Deferred<ByteArray>

    fun sign(message: String): Deferred<ByteArray> = sign(message.utf8())

    fun verify(message: ByteArray, signature: ByteArray): Boolean

    fun verify(message: String, signature: ByteArray) = verify(message.utf8(), signature)

    fun verify(message: ByteArray, signature: String) = verify(message, signature.decodeBase64())

    fun verify(message: String, signature: String) = verify(message.utf8(), signature.decodeBase64())
}

interface PublicKey : Key {

    override fun sign(message: ByteArray): Deferred<ByteArray> {
        throw NotImplementedError()
    }
}

val PublicKey.publicKeyHex: String
    get() = publicKey.encodeHex()

interface KeyPair : PublicKey {

    val privateKey: ByteArray
}

val KeyPair.privateKeyHex: String
    get() = privateKey.encodeHex()

interface MnemonicKey : KeyPair {

    val mnemonic: String
    val passphrase: String?
}

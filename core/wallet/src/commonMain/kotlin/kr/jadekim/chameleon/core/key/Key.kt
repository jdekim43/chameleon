package kr.jadekim.chameleon.core.key

import kotlinx.coroutines.Deferred
import kr.jadekim.common.encoder.decodeBase64
import kr.jadekim.common.encoder.encodeHex
import kr.jadekim.common.extension.utf8

interface Key {

    val publicKey: ByteArray
    val address: ByteArray

    fun verify(message: ByteArray, signature: ByteArray): Boolean

    fun verify(message: String, signature: ByteArray) = verify(message.utf8(), signature)

    fun verify(message: ByteArray, signature: String) = verify(message, signature.decodeBase64())

    fun verify(message: String, signature: String) = verify(message.utf8(), signature.decodeBase64())
}

val Key.publicKeyHex: String
    get() = publicKey.encodeHex()

val Key.addressHex: String
    get() = address.encodeHex()

interface SignableKey : Key {

    fun sign(message: ByteArray): Deferred<ByteArray>

    fun sign(message: String): Deferred<ByteArray> = sign(message.utf8())
}

interface KeyPair : SignableKey {

    val privateKey: ByteArray
}

val KeyPair.privateKeyHex: String
    get() = privateKey.encodeHex()

interface MnemonicKey : KeyPair {

    val mnemonic: String
    val passphrase: String?
}

interface BIP44MnemonicKey : MnemonicKey {
    val coinType: Int
    val account: Int
    val change: Int
    val index: Int
}

package kr.jadekim.chameleon.core.crypto.secp256k1

import fr.acinq.secp256k1.Secp256k1 as Secp256k1Lib

object Secp256k1 {

    private val delegate = Secp256k1Lib

    fun verify(signature: ByteArray, message: ByteArray, publicKey: ByteArray): Boolean =
        delegate.verify(signature, message, publicKey)

    fun isValidPrivateKey(privateKey: ByteArray): Boolean = delegate.secKeyVerify(privateKey)

    fun isValidPublicKey(publicKey: ByteArray): Boolean = try {
        delegate.pubkeyParse(publicKey)
        true
    } catch (e: Exception) {
        false
    }

    fun privateKeyTweakAdd(privateKey: ByteArray, tweak: ByteArray): ByteArray =
        delegate.privKeyTweakAdd(privateKey, tweak)

    fun privateKeyNegate(privateKey: ByteArray): ByteArray = delegate.privKeyNegate(privateKey)

    fun privateKeyTweakMul(privateKey: ByteArray, tweak: ByteArray): ByteArray =
        delegate.privKeyTweakMul(privateKey, tweak)

    fun createPublicKey(privateKey: ByteArray): ByteArray = delegate.pubkeyCreate(privateKey)

    fun publicKeyNegate(publicKey: ByteArray): ByteArray = delegate.pubKeyNegate(publicKey)

    fun publicKeyTweakMul(publicKey: ByteArray, tweak: ByteArray) = delegate.pubKeyTweakMul(publicKey, tweak)

    fun combinePublicKey(publicKeys: Array<ByteArray>): ByteArray = delegate.pubKeyCombine(publicKeys)

    fun compressPublicKey(uncompressed: ByteArray): ByteArray = delegate.pubKeyCompress(uncompressed)

    fun decompressPublicKey(compressed: ByteArray): ByteArray = delegate.pubkeyParse(compressed)

    fun recoveryPublicKey(signature: ByteArray, message: ByteArray, recoveryId: Int): ByteArray =
        delegate.ecdsaRecover(signature, message, recoveryId)

    fun sign(message: ByteArray, privateKey: ByteArray): ByteArray = delegate.sign(message, privateKey)
}
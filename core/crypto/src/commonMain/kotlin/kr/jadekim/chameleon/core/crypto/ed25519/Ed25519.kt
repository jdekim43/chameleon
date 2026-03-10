package kr.jadekim.chameleon.core.crypto.ed25519

import io.github.andreypfau.curve25519.ed25519.Ed25519PrivateKey
import io.github.andreypfau.curve25519.ed25519.Ed25519PublicKey
import io.github.andreypfau.curve25519.ed25519.Ed25519 as Ed25519Lib

object Ed25519 {

    fun verify(signature: ByteArray, message: ByteArray, publicKey: ByteArray): Boolean {
        val pubKey = Ed25519PublicKey(publicKey)
        return pubKey.verify(message, signature)
    }

    fun isValidPrivateKey(privateKey: ByteArray): Boolean {
        return privateKey.size == Ed25519Lib.SEED_SIZE_BYTES || privateKey.size == Ed25519PrivateKey.SIZE_BYTES
    }

    fun isValidPublicKey(publicKey: ByteArray): Boolean {
        if (publicKey.size != Ed25519Lib.PUBLIC_KEY_SIZE_BYTES) return false
        return try {
            Ed25519PublicKey(publicKey)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun createPublicKey(privateKey: ByteArray): ByteArray {
        val key = Ed25519Lib.keyFromSeed(privateKey.copyOfRange(0, Ed25519Lib.SEED_SIZE_BYTES))

        return key.publicKey().toByteArray()
    }

    fun compressPublicKey(uncompressed: ByteArray): ByteArray = ByteArray(33).apply { uncompressed.copyInto(this, 1) }

    fun decompressPublicKey(compressed: ByteArray): ByteArray = compressed.copyOfRange(1, compressed.size)

    fun sign(message: ByteArray, privateKey: ByteArray): ByteArray {
        val key = Ed25519Lib.keyFromSeed(privateKey.sliceArray(0 until Ed25519Lib.SEED_SIZE_BYTES))
        return key.sign(message)
    }
}
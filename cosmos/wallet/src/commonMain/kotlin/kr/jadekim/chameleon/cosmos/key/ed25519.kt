package kr.jadekim.chameleon.cosmos.key

import kr.jadekim.chameleon.core.crypto.Bech32
import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.common.hash.SHA_256

interface Ed25519PublicKey : PublicKey

private const val TRUNCATE_LENGTH = 20

fun Ed25519PublicKey.toAddress(): ByteArray = Bech32.toWords(SHA_256.hash(publicKey).sliceArray(0 until TRUNCATE_LENGTH))

//interface Ed25519KeyPair : KeyPair, Secp256k1PublicKey {
//    override fun sign(message: ByteArray): Deferred<ByteArray> = CompletableDeferred(/*todo*/)
//}
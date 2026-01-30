package kr.jadekim.chameleon.core.key

import kr.jadekim.common.encoder.Hex
import kr.jadekim.common.encoder.encode

interface Key

interface PublicKey : Key, Verifier {

    val publicKey: ByteArray

    fun toAddressBytes(): ByteArray
}

val PublicKey.publicKeyHex: String
    get() = publicKey.encode(Hex)

interface PrivateKey : Key, Signer {

    val privateKey: ByteArray
}

val PrivateKey.privateKeyHex: String
    get() = privateKey.encode(Hex)

interface KeyPair : PrivateKey, PublicKey
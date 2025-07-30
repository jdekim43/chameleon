package kr.jadekim.chameleon.initia.key

import kr.jadekim.chameleon.cosmos.key.BaseCosmosMnemonicKey
import kr.jadekim.chameleon.cosmos.key.Ed25519PublicKey
import kr.jadekim.chameleon.cosmos.key.Secp256k1KeyPair
import kr.jadekim.chameleon.cosmos.key.Secp256k1PublicKey

interface InitiaPublicKey : Secp256k1PublicKey

interface InitiaKeyPair : Secp256k1KeyPair

interface InitiaMnemonicKey : BaseCosmosMnemonicKey

open class InitiaConsensusPublicKey(override val publicKey: ByteArray) : Ed25519PublicKey {

    @Deprecated("Not yet implemented")
    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        TODO("Not yet implemented")
    }
}
package kr.jadekim.chameleon.initia.key

import kr.jadekim.chameleon.cosmos.key.Ed25519PublicKey

typealias InitiaPublicKey = InitiaEthPublicKey

typealias InitiaKeyPair = InitiaEthKeyPair

typealias InitiaMnemonicKey = InitiaEthMnemonicKey

open class InitiaConsensusPublicKey(override val publicKey: ByteArray) : Ed25519PublicKey {

    @Deprecated("Not yet implemented")
    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        TODO("Not yet implemented")
    }
}
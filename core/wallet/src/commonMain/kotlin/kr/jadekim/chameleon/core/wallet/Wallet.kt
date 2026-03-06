package kr.jadekim.chameleon.core.wallet

import kotlinx.coroutines.Deferred
import kr.jadekim.chameleon.core.key.PrivateKey
import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.chameleon.core.key.Signer
import kr.jadekim.chameleon.core.key.Verifier

interface Wallet : Verifier, Signer {

    val address: Address
    val privateKey: PrivateKey?
    val publicKey: PublicKey?

    val verifier: Verifier?
        get() = publicKey as? Verifier

    val signer: Signer?
        get() = privateKey as? Signer

    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        val verifier = verifier ?: throw IllegalStateException("verifier is not initialized")

        return verifier.verify(message, signature)
    }

    override fun sign(message: ByteArray): Deferred<ByteArray> {
        val signer = signer ?: throw IllegalStateException("signer is not initialized")

        return signer.sign(message)
    }
}
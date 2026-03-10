package kr.jadekim.chameleon.solana.key

import kr.jadekim.chameleon.core.hd.ed25519.HDEd25519PrivateKey
import kr.jadekim.chameleon.core.hd.ed25519.HDEd25519PublicKey

open class SolanaPublicKey(bytes: ByteArray) : HDEd25519PublicKey(bytes) {

    override fun toAddressBytes(): ByteArray = bytes
}

open class SolanaPrivateKey(bytes: ByteArray) : HDEd25519PrivateKey(bytes) {

    override fun createPublicKey(): SolanaPublicKey = SolanaPublicKey(super.createPublicKey().bytes)
}

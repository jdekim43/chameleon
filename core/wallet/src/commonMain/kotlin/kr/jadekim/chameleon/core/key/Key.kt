package kr.jadekim.chameleon.core.key

interface Key

interface PublicKey : Key, Verifier {

    val bytes: ByteArray

    fun toAddressBytes(): ByteArray
}

interface PrivateKey : Key, Signer {

    val bytes: ByteArray

    fun createPublicKey(): PublicKey
}

data class KeyPair(
    val privateKey: PrivateKey,
    val publicKey: PublicKey,
) {

    constructor(privateKey: PrivateKey) : this(privateKey, privateKey.createPublicKey())
}

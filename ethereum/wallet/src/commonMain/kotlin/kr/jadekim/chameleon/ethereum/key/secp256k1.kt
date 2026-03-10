package kr.jadekim.chameleon.ethereum.key

import kr.jadekim.chameleon.core.hd.secp256k1.HDSecp256k1PrivateKey
import kr.jadekim.chameleon.core.hd.secp256k1.HDSecp256k1PublicKey
import kr.jadekim.common.crypto.hash.KECCAK_256
import kr.jadekim.common.crypto.hash.hash

open class EthereumPublicKey(bytes: ByteArray) : HDSecp256k1PublicKey(bytes) {

    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        return super.verify(message.hash(KECCAK_256), signature)
    }

    override fun toAddressBytes(): ByteArray = uncompressed
        .let { it.sliceArray(1 until it.size).hash(KECCAK_256) }
        .let { it.sliceArray(it.size - 20 until it.size) }
}

open class EthereumPrivateKey(bytes: ByteArray) : HDSecp256k1PrivateKey(bytes) {

    override fun createPublicKey(): EthereumPublicKey =
        EthereumPublicKey(super.createPublicKey().bytes)

    override fun signSync(message: ByteArray) = super.signSync(message.hash(KECCAK_256))
}

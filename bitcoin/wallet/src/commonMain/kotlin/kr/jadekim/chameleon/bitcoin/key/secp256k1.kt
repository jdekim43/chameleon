package kr.jadekim.chameleon.bitcoin.key

import kr.jadekim.chameleon.core.hd.secp256k1.HDSecp256k1PrivateKey
import kr.jadekim.chameleon.core.hd.secp256k1.HDSecp256k1PublicKey
import kr.jadekim.common.crypto.hash.SHA_256
import kr.jadekim.common.crypto.hash.hash

open class BitcoinPublicKey(bytes: ByteArray) : HDSecp256k1PublicKey(bytes) {

    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        return super.verify(message.hash(SHA_256).hash(SHA_256), signature)
    }
}

open class BitcoinPrivateKey(bytes: ByteArray) : HDSecp256k1PrivateKey(bytes) {

    override fun createPublicKey(): BitcoinPublicKey = BitcoinPublicKey(super.createPublicKey().bytes)

    override fun signSync(message: ByteArray) = super.signSync(message.hash(SHA_256).hash(SHA_256))
}

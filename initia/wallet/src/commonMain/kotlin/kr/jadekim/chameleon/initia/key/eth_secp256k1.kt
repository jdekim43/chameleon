package kr.jadekim.chameleon.initia.key

import kr.jadekim.chameleon.core.hd.HDPrivateKey
import kr.jadekim.chameleon.core.hd.HDPublicKey
import kr.jadekim.chameleon.core.key.HDSecp256k1PrivateKey
import kr.jadekim.chameleon.core.key.HDSecp256k1PublicKey
import kr.jadekim.chameleon.core.key.KeyPair
import kr.jadekim.common.crypto.hash.KECCAK_256
import kr.jadekim.common.crypto.hash.hash

open class InitiaEtherSecp256k1PublicKey(override val hdPublicKey: HDPublicKey) : HDSecp256k1PublicKey {

    constructor(publicKey: ByteArray) : this(HDPublicKey(publicKey))

    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        return hdPublicKey.verify(message.hash(KECCAK_256), signature)
    }

    override fun toAddress(): ByteArray = hdPublicKey.uncompressed
        .let { it.sliceArray(1 until it.size).hash(KECCAK_256) }
        .let { it.sliceArray(it.size - 20 until it.size) }
}

open class InitiaEtherSecp256k1PrivateKey(
    override val hdPrivateKey: HDPrivateKey,
    hdPublicKey: HDPublicKey? = null,
) : KeyPair,
    HDSecp256k1PrivateKey,
    InitiaEtherSecp256k1PublicKey(hdPublicKey ?: hdPrivateKey.createPublicKey()) {

    constructor(
        privateKey: ByteArray,
        publicKey: ByteArray? = null,
    ) : this(HDPrivateKey(privateKey), publicKey?.let { HDPublicKey(it) })

    init {
        //todo: check public key and private key are paired correctly.
    }

    override fun signSync(message: ByteArray) = hdPrivateKey.signSync(message.hash(KECCAK_256))
}

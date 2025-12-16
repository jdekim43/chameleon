package kr.jadekim.chameleon.initia.key

import kr.jadekim.chameleon.core.hd.HDPrivateKey
import kr.jadekim.chameleon.core.hd.HDPublicKey
import kr.jadekim.chameleon.core.key.HDSecp256k1PrivateKey
import kr.jadekim.chameleon.core.key.HDSecp256k1PublicKey
import kr.jadekim.chameleon.core.key.KeyPair

open class InitiaSecp256k1PublicKey(override val hdPublicKey: HDPublicKey) : HDSecp256k1PublicKey {

    constructor(publicKey: ByteArray) : this(HDPublicKey(publicKey))
}

open class InitiaSecp256k1PrivateKey(
    override val hdPrivateKey: HDPrivateKey,
    hdPublicKey: HDPublicKey? = null,
) : KeyPair,
    HDSecp256k1PrivateKey,
    InitiaSecp256k1PublicKey(hdPublicKey ?: hdPrivateKey.createPublicKey()) {

    constructor(
        privateKey: ByteArray,
        publicKey: ByteArray? = null,
    ) : this(HDPrivateKey(privateKey), publicKey?.let { HDPublicKey(it) })

    init {
        //todo: check public key and private key are paired correctly.
    }
}

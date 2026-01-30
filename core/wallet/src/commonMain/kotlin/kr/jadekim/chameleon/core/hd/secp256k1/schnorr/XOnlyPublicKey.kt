package kr.jadekim.chameleon.core.hd.secp256k1.schnorr

import kr.jadekim.chameleon.core.hd.secp256k1.HDSecp256k1PublicKey
import kr.jadekim.common.annotation.InDevelopment

@InDevelopment
data class XOnlyPublicKey(val bytes: ByteArray) {

    constructor(publicKey: HDSecp256k1PublicKey) : this(publicKey.compressed.sliceArray(1 until publicKey.compressed.size))

    init {
        require(bytes.size == 32)
    }

    val publicKey: HDSecp256k1PublicKey = HDSecp256k1PublicKey(byteArrayOf(2) + bytes)
}
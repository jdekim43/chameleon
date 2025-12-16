package kr.jadekim.chameleon.core.hd.schnorr

import kr.jadekim.chameleon.core.hd.HDPublicKey
import kr.jadekim.common.annotation.InDevelopment

@InDevelopment
data class XOnlyPublicKey(val bytes: ByteArray) {

    constructor(publicKey: HDPublicKey) : this(publicKey.compressed.sliceArray(1 until publicKey.compressed.size))

    init {
        require(bytes.size == 32)
    }

    val publicKey: HDPublicKey = HDPublicKey(byteArrayOf(2) + bytes)
}
package kr.jadekim.chameleon.cosmos.key

import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.common.hash.SHA_256

private const val TRUNCATE_LENGTH = 20

val Key.addressFromPublicKeyHash: ByteArray
    get() = SHA_256.hash(publicKey).sliceArray(0 until TRUNCATE_LENGTH)

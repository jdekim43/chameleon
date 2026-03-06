package kr.jadekim.chameleon.core.hd

import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.common.crypto.hash.RIPEMD160
import kr.jadekim.common.crypto.hash.SHA_256
import kr.jadekim.common.crypto.hash.hash
import kr.jadekim.common.extension.toUIntWithinBigEndian

internal const val HARDENED_SUFFIX: Char = '\''
internal const val HARDENING_FLAG: UInt = 0x80000000u

internal val UInt.isHardened: Boolean
    get() = this >= HARDENING_FLAG

internal val UInt.hardened: UInt
    get() = if (isHardened) this else (HARDENING_FLAG + this)

internal val UInt.unhardened: UInt
    get() = if (!isHardened) this else (this - HARDENING_FLAG)

internal val PublicKey.fingerprint: UInt
    get() = bytes.hash(SHA_256).hash(RIPEMD160)
        .sliceArray(0 until 4).toUIntWithinBigEndian()

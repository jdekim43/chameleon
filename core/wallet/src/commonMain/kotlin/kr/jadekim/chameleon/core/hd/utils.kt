package kr.jadekim.chameleon.core.hd

internal const val HARDENED_SUFFIX: Char = '\''
internal const val HARDENING_FLAG: UInt = 0x80000000u

internal val UInt.isHardened: Boolean
    get() = this >= HARDENING_FLAG

internal val UInt.hardened: UInt
    get() = if (isHardened) this else (HARDENING_FLAG + this)

internal val UInt.unhardened: UInt
    get() = if (!isHardened) this else (this - HARDENING_FLAG)

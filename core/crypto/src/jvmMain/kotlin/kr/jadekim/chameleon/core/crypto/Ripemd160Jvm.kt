package kr.jadekim.chameleon.core.crypto

import kr.jadekim.chameleon.core.crypto.library.ripemd160.Ripemd160 as Ripemd160Lib

actual object Ripemd160 {

    actual fun hash(data: ByteArray): ByteArray = Ripemd160Lib.getHash(data)
}
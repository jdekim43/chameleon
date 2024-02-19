package kr.jadekim.chameleon.core.crypto

import kr.jadekim.chameleon.core.crypto.library.bech32.Bech32 as Bech32Lib

actual object Bech32 {

    actual fun encode(hrp: String, data: ByteArray): String = Bech32Lib.encode(hrp, data)

    actual fun decode(str: String): Pair<String, ByteArray> {
        val result = Bech32Lib.decode(str)

        return result.hrp to result.words
    }

    actual fun toWords(data: ByteArray): ByteArray = Bech32Lib.toWords(data)

    actual fun fromWords(data: ByteArray): ByteArray = Bech32Lib.fromWords(data)
}
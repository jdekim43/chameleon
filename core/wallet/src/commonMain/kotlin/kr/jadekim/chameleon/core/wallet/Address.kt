package kr.jadekim.chameleon.core.wallet

import kr.jadekim.chameleon.core.crypto.Bech32

interface Address {

    val text: String
    val data: ByteArray
}

interface Bech32Address<HRP> : Address {

    val hrp: HRP
        get() {
            val (hrp, _) = Bech32.decode(text)

            return parseHrp(hrp)
        }

    override val data: ByteArray
        get() {
            val (_, words) = Bech32.decode(text)

            return Bech32.fromWords(words)
        }

    fun parseHrp(text: String): HRP
}

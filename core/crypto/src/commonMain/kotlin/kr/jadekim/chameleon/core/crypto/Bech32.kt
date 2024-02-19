package kr.jadekim.chameleon.core.crypto

expect object Bech32 {

    fun encode(hrp: String, data: ByteArray): String

    fun decode(str: String): Pair<String, ByteArray>

    fun toWords(data: ByteArray): ByteArray

    fun fromWords(data: ByteArray): ByteArray
}

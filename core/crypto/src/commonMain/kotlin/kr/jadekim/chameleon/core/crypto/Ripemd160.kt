package kr.jadekim.chameleon.core.crypto

expect object Ripemd160 {

    fun hash(data: ByteArray): ByteArray
}
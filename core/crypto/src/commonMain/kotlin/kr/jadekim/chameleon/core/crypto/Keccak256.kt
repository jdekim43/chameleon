package kr.jadekim.chameleon.core.crypto

expect object Keccak256 {

    fun hash(data: ByteArray): ByteArray
}
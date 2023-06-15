package kr.jadekim.chameleon.core.crypto

expect object Mnemonic {

    fun generate(): String

    fun seedFrom(mnemonic: String, passphrase: String? = null): ByteArray
}

typealias Bip39 = Mnemonic

package kr.jadekim.chameleon.core.crypto

import org.web3j.crypto.Hash

actual object Keccak256 {

    actual fun hash(data: ByteArray): ByteArray = Hash.sha3(data)
}
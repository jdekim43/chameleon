package kr.jadekim.chameleon.core.wallet

import kr.jadekim.chameleon.core.key.Key

interface Wallet {

    val address: Address
    val key: Key?
}
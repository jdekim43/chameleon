package kr.jadekim.chameleon.core.key

import kr.jadekim.chameleon.core.mnemonic.Mnemonic

interface MnemonicAware {

    val mnemonic: Mnemonic
    val password: String?
}

interface BIP44Aware {

    val coinType: UInt
    val account: UInt
    val change: UInt
    val index: UInt
}

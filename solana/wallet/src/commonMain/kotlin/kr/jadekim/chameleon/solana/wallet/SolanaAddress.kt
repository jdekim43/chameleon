package kr.jadekim.chameleon.solana.wallet

import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Base58Address
import kr.jadekim.chameleon.solana.key.SolanaPublicKey
import kotlin.jvm.JvmStatic

object SolanaAddress {

    @JvmStatic
    fun createAddress(key: SolanaPublicKey): Address =
        Base58Address(key.toAddressBytes())
}

package kr.jadekim.chameleon.ethereum.wallet

import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.HexAddress
import kr.jadekim.chameleon.ethereum.key.EthereumPublicKey
import kotlin.jvm.JvmStatic

object EthereumAddress {

    @JvmStatic
    fun createAccountAddress(key: EthereumPublicKey): Address = HexAddress(key.toAddressBytes())

    @JvmStatic
    fun isValidAddress(address: String): Boolean = try {
        HexAddress(address).data.size == 20
    } catch (e: Exception) {
        false
    }
}

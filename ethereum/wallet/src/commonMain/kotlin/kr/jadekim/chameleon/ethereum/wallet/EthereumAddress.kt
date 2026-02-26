package kr.jadekim.chameleon.ethereum.wallet

import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.HexAddress
import kr.jadekim.chameleon.ethereum.key.EthereumSecp256k1PublicKey
import kotlin.jvm.JvmStatic

object EthereumAddress {

    @JvmStatic
    fun createAccountAddress(key: EthereumSecp256k1PublicKey): Address = HexAddress(key.toAddressBytes())

    @JvmStatic
    fun isValidAddress(address: String): Boolean = try {
        HexAddress(address).data.size == 20
    } catch (e: Exception) {
        false
    }
}

package kr.jadekim.chameleon.bitcoin.wallet

import kr.jadekim.chameleon.bitcoin.key.BitcoinPublicKey
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Base58CheckAddress
import kr.jadekim.chameleon.core.wallet.Bech32Address
import kr.jadekim.common.crypto.hash.SHA_256
import kr.jadekim.common.crypto.hash.hash
import kotlin.jvm.JvmStatic

object BitcoinAddress {

    enum class Version(val value: UByte) {
        P2PKH(0x0u),
        P2SH(0x5u);

        companion object {

            @JvmStatic
            fun from(version: UByte): Version? = entries.firstOrNull { it.value == version }
        }
    }

    enum class Hrp(val value: String) {
        SEGWIT("bc1q"),
        TAPROOT("bc1p");

        companion object {

            @JvmStatic
            fun from(text: String): Hrp? = entries.firstOrNull { it.value.equals(text, true) }
        }
    }

    @JvmStatic
    fun createP2PKHAddress(key: BitcoinPublicKey): Address =
        Base58CheckAddress(Version.P2PKH.value, key.toAddressBytes())

    @JvmStatic
    fun createP2SHAddress(key: BitcoinPublicKey): Address = Base58CheckAddress(Version.P2SH.value, key.toAddressBytes())

    @JvmStatic
    fun createP2WPKHAddress(key: BitcoinPublicKey): Address = Bech32Address(Hrp.SEGWIT.value, key.toAddressBytes())

    @JvmStatic
    fun createP2WSHAddress(key: BitcoinPublicKey): Address = Bech32Address(Hrp.SEGWIT.value, key.bytes.hash(SHA_256))
}

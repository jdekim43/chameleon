package kr.jadekim.chameleon.initia.wallet

import kr.jadekim.chameleon.core.crypto.bech32.Bech32
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Bech32Address
import kr.jadekim.chameleon.core.wallet.HexAddress
import kr.jadekim.chameleon.initia.key.InitiaEd25519PublicKey
import kr.jadekim.chameleon.initia.key.InitiaEtherSecp256k1PublicKey
import kr.jadekim.chameleon.initia.key.InitiaSecp256k1PublicKey
import kr.jadekim.common.encoder.Hex
import kr.jadekim.common.encoder.decode
import kotlin.jvm.JvmStatic

object InitiaAddress {

    enum class Hrp(val value: String) {
        ACCOUNT("init"),
        ACCOUNT_PUBLIC_KEY("initpub"),
        VALIDATOR_OPERATOR("initvaloper"),
        VALIDATOR_OPERATOR_PUBLIC_KEY("initvaloperpub"),
        CONSENSUS_NODE("initvalcons"),
        CONSENSUS_NODE_PUBLIC_KEY("initvalconspub");

        companion object {

            @JvmStatic
            fun from(text: String): InitiaAddress.Hrp? =
                InitiaAddress.Hrp.entries.firstOrNull { it.value.equals(text, true) }
        }
    }

    @JvmStatic
    fun createAccountAddress(key: InitiaSecp256k1PublicKey): Address = Bech32Address(Hrp.ACCOUNT.value, key.toAddressBytes())

    @JvmStatic
    fun createAccountAddress(key: InitiaEtherSecp256k1PublicKey): Address =
        Bech32Address(Hrp.ACCOUNT.value, key.toAddressBytes())

    @JvmStatic
    fun createAccountEtherAddress(key: InitiaSecp256k1PublicKey): Address = HexAddress(key.toAddressBytes())

    @JvmStatic
    fun createAccountEtherAddress(key: InitiaEtherSecp256k1PublicKey): Address = HexAddress(key.toAddressBytes())

    @JvmStatic
    fun createAccountPublicKeyAddress(key: InitiaSecp256k1PublicKey): Address = Bech32Address(
        Hrp.ACCOUNT_PUBLIC_KEY.value,
        "eb5ae98721".decode(Hex) + key.publicKey,
    )

    @JvmStatic
    fun createConsensusAddress(key: InitiaEd25519PublicKey): Address =
        Bech32Address(Hrp.CONSENSUS_NODE.value, key.toAddressBytes())

    @JvmStatic
    fun isValidAddress(address: String, expectedHrps: List<String>? = Hrp.entries.map { it.value }): Boolean = try {
        val (parsedHrp, _) = Bech32.decode(address)

        expectedHrps == null || expectedHrps.contains(parsedHrp)
    } catch (e: Exception) {
        false
    }
}
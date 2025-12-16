package kr.jadekim.chameleon.terra.wallet

import kr.jadekim.chameleon.core.crypto.bech32.Bech32
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Bech32Address
import kr.jadekim.chameleon.terra.key.TerraSecp256k1PublicKey
import kr.jadekim.common.encoder.Hex
import kr.jadekim.common.encoder.decode
import kotlin.jvm.JvmStatic

object TerraAddress {

    enum class Hrp(val value: String) {
        ACCOUNT("terra"),
        ACCOUNT_PUBLIC_KEY("terrapub"),
        VALIDATOR_OPERATOR("terravaloper"),
        VALIDATOR_OPERATOR_PUBLIC_KEY("terravaloperpub"),
        CONSENSUS_NODE("terravalcons"),
        CONSENSUS_NODE_PUBLIC_KEY("terravalconspub");

        companion object {

            @JvmStatic
            fun fromHrp(hrp: String): Hrp? = entries.firstOrNull { it.value.equals(hrp, true) }
        }
    }

    @JvmStatic
    fun createAccountAddress(key: TerraSecp256k1PublicKey): Address = Bech32Address(
        Hrp.ACCOUNT.value, key.toAddress()
    )

    @JvmStatic
    fun createAccountPublicKeyAddress(key: TerraSecp256k1PublicKey): Address = Bech32Address(
        Hrp.ACCOUNT_PUBLIC_KEY.value,
        "eb5ae98721".decode(Hex) + key.publicKey,
    )

    @JvmStatic
    fun createConsensusAddress(key: TerraSecp256k1PublicKey): Address =
        Bech32Address(Hrp.CONSENSUS_NODE.value, key.toAddress())

    @JvmStatic
    fun isValidAddress(address: String, expectedHrps: List<String>? = Hrp.entries.map { it.value }): Boolean = try {
        val (parsedHrp, _) = Bech32.decode(address)

        expectedHrps == null || expectedHrps.contains(parsedHrp)
    } catch (e: Exception) {
        false
    }
}
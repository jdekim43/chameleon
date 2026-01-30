package kr.jadekim.chameleon.sei.wallet

import kr.jadekim.chameleon.core.crypto.bech32.Bech32
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Bech32Address
import kr.jadekim.chameleon.sei.key.SeiEd25519PublicKey
import kr.jadekim.chameleon.sei.key.SeiSecp256k1PublicKey
import kr.jadekim.common.encoder.Hex
import kr.jadekim.common.encoder.decode
import kotlin.jvm.JvmStatic

object SeiAddress {

    enum class Hrp(val value: String) {
        ACCOUNT("sei"),
        ACCOUNT_PUBLIC_KEY("seipub"),
        VALIDATOR_OPERATOR("seivaloper"),
        VALIDATOR_OPERATOR_PUBLIC_KEY("seivaloperpub"),
        CONSENSUS_NODE("seivalcons"),
        CONSENSUS_NODE_PUBLIC_KEY("seivalconspub");

        companion object {

            @JvmStatic
            fun fromHrp(hrp: String): Hrp? = entries.firstOrNull { it.value.equals(hrp, true) }
        }
    }

    @JvmStatic
    fun createAccountAddress(key: SeiSecp256k1PublicKey): Address = Bech32Address(
        Hrp.ACCOUNT.value,
        key.toAddressBytes(),
    )

    @JvmStatic
    fun createAccountPublicKeyAddress(key: SeiSecp256k1PublicKey): Address = Bech32Address(
        Hrp.ACCOUNT_PUBLIC_KEY.value,
        "eb5ae98721".decode(Hex) + key.publicKey,
    )

    @JvmStatic
    fun createConsensusAddress(key: SeiEd25519PublicKey): Address = Bech32Address(
        Hrp.CONSENSUS_NODE.value,
        key.toAddressBytes(),
    )

    @JvmStatic
    fun isValidAddress(address: String, expectedHrps: List<String>? = Hrp.entries.map { it.value }): Boolean = try {
        val (parsedHrp, _) = Bech32.decode(address)

        expectedHrps == null || expectedHrps.contains(parsedHrp)
    } catch (e: Exception) {
        false
    }
}
package kr.jadekim.chameleon.injective.wallet

import kr.jadekim.chameleon.core.crypto.bech32.Bech32
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Bech32Address
import kr.jadekim.chameleon.injective.key.InjectiveEd25519PublicKey
import kr.jadekim.chameleon.injective.key.InjectiveSecp256k1PublicKey
import kr.jadekim.common.encoder.Hex
import kr.jadekim.common.encoder.decode
import kotlin.jvm.JvmStatic

object InjectiveAddress {

    enum class Hrp(val value: String) {
        ACCOUNT("inj"),
        ACCOUNT_PUBLIC_KEY("injpub"),
        VALIDATOR_OPERATOR("injvaloper"),
        VALIDATOR_OPERATOR_PUBLIC_KEY("injvaloperpub"),
        CONSENSUS_NODE("injvalcons"),
        CONSENSUS_NODE_PUBLIC_KEY("injvalconspub");

        companion object {

            @JvmStatic
            fun fromHrp(hrp: String): Hrp? = entries.firstOrNull { it.value.equals(hrp, true) }
        }
    }

    @JvmStatic
    fun createAccountAddress(key: InjectiveSecp256k1PublicKey): Address =
        Bech32Address(Hrp.ACCOUNT.value, key.toAddressBytes())

    @JvmStatic
    fun createAccountPublicKeyAddress(key: InjectiveSecp256k1PublicKey): Address = Bech32Address(
        Hrp.ACCOUNT_PUBLIC_KEY.value,
        "eb5ae98721".decode(Hex) + key.publicKey
    )

    @JvmStatic
    fun createConsensusAddress(key: InjectiveEd25519PublicKey): Address = Bech32Address(
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

package kr.jadekim.chameleon.cosmos.wallet

import kr.jadekim.chameleon.core.crypto.bech32.Bech32
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Bech32Address
import kr.jadekim.chameleon.cosmos.key.CosmosEd25519PublicKey
import kr.jadekim.chameleon.cosmos.key.CosmosSecp256k1PublicKey
import kr.jadekim.common.encoder.Hex
import kr.jadekim.common.encoder.decode
import kotlin.jvm.JvmStatic

object CosmosAddress {

    enum class Hrp(val value: String) {
        ACCOUNT("cosmos"),
        ACCOUNT_PUBLIC_KEY("cosmospub"),
        VALIDATOR_OPERATOR("cosmosvaloper"),
        VALIDATOR_OPERATOR_PUBLIC_KEY("cosmosvaloperpub"),
        CONSENSUS_NODE("cosmosvalcons"),
        CONSENSUS_NODE_PUBLIC_KEY("cosmosvalconspub");

        companion object {

            @JvmStatic
            fun from(text: String): Hrp? = entries.firstOrNull { it.value.equals(text, true) }
        }
    }

    @JvmStatic
    fun createAccountAddress(key: CosmosSecp256k1PublicKey): Address = Bech32Address(Hrp.ACCOUNT.value, key.toAddress())

    @JvmStatic
    fun createAccountPublicKeyAddress(key: CosmosSecp256k1PublicKey): Address = Bech32Address(
        Hrp.ACCOUNT_PUBLIC_KEY.value,
        "eb5ae98721".decode(Hex) + key.publicKey,
    )

    @JvmStatic
    fun createConsensusAddress(key: CosmosEd25519PublicKey): Address =
        Bech32Address(Hrp.CONSENSUS_NODE.value, key.toAddress())

    @JvmStatic
    fun isValidAddress(address: String, expectedHrps: List<String>? = Hrp.entries.map { it.value }): Boolean = try {
        val (parsedHrp, _) = Bech32.decode(address)

        expectedHrps == null || expectedHrps.contains(parsedHrp)
    } catch (e: Exception) {
        false
    }
}

package kr.jadekim.chameleon.cosmos.wallet

import kr.jadekim.chameleon.core.crypto.Bech32
import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.core.wallet.Bech32Address
import kr.jadekim.common.encoder.HEX

@JvmInline
value class CosmosAddress(override val text: String) : Bech32Address<CosmosAddress.Hrp> {

    enum class Hrp(val value: String) {
        ACCOUNT("cosmos"),
        ACCOUNT_PUBLIC_KEY("cosmospub"),
        VALIDATOR_OPERATOR("cosmosvaloper"),
        VALIDATOR_OPERATOR_PUBLIC_KEY("cosmosvaloperpub"),
        CONSENSUS_NODE("cosmosvalcons"),
        CONSENSUS_NODE_PUBLIC_KEY("cosmosvalconspub");

        companion object {

            @JvmStatic
            fun fromHrp(hrp: String): Hrp? = entries.firstOrNull { it.value.equals(hrp, true) }
        }
    }

    companion object {

        @JvmStatic
        fun createAccountAddress(key: Key): CosmosAddress = CosmosAddress(
            Bech32.encode(Hrp.ACCOUNT.value, Bech32.toWords(key.address)),
        )

        @JvmStatic
        fun createAccountPublicKeyAddress(key: Key): CosmosAddress = CosmosAddress(
            Bech32.encode(
                Hrp.ACCOUNT_PUBLIC_KEY.value,
                Bech32.toWords(HEX.decode("eb5ae98721") + key.publicKey),
            )
        )

        @JvmStatic
        fun createConsensusAddress(key: Key): CosmosAddress = CosmosAddress(
            Bech32.encode(Hrp.CONSENSUS_NODE.value, Bech32.toWords(key.address))
        )

        @JvmStatic
        fun isValidAddress(address: String, hrp: Hrp): Boolean = try {
            val (parsedHrp, _) = Bech32.decode(address)

            Hrp.fromHrp(parsedHrp) == hrp
        } catch (e: Exception) {
            false
        }
    }

    override fun parseHrp(text: String): Hrp = Hrp.fromHrp(text)
        ?: throw IllegalArgumentException("Unknown bech32 hrp for cosmos address")
}

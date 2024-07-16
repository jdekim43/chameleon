package kr.jadekim.chameleon.cosmos.wallet

import kr.jadekim.chameleon.core.crypto.Bech32
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.cosmos.key.Ed25519PublicKey
import kr.jadekim.chameleon.cosmos.key.Secp256k1PublicKey
import kr.jadekim.chameleon.cosmos.key.toAddress
import kr.jadekim.common.encoder.HEX

interface Bech32Address<HRP> : Address {

    val hrp: HRP
        get() {
            val (hrp, _) = Bech32.decode(text)

            return parseHrp(hrp)
        }

    override val data: ByteArray
        get() {
            val (_, words) = Bech32.decode(text)

            return Bech32.fromWords(words)
        }

    fun parseHrp(text: String): HRP
}

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
        fun createAccountAddress(publicKey: Secp256k1PublicKey): CosmosAddress = CosmosAddress(
            Bech32.encode(
                CosmosAddress.Hrp.ACCOUNT.value,
                Bech32.toWords(publicKey.toAddress()),
            ),
        )

        @JvmStatic
        fun createAccountPublicKeyAddress(publicKey: Secp256k1PublicKey): CosmosAddress = CosmosAddress(
            Bech32.encode(
                CosmosAddress.Hrp.ACCOUNT_PUBLIC_KEY.value,
                Bech32.toWords(HEX.decode("eb5ae98721") + publicKey.publicKey),
            )
        )

        @JvmStatic
        fun createConsensusAddress(publicKey: Ed25519PublicKey): CosmosAddress = CosmosAddress(
            Bech32.encode(
                CosmosAddress.Hrp.CONSENSUS_NODE.value,
                publicKey.toAddress()
            )
        )

        @JvmStatic
        fun createConsensusAddress(bytes: ByteArray): CosmosAddress = CosmosAddress(
            Bech32.encode(
                Hrp.CONSENSUS_NODE.value,
                Bech32.toWords(bytes),
            )
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

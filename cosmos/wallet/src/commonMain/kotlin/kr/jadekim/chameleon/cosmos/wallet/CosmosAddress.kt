package kr.jadekim.chameleon.cosmos.wallet

import kr.jadekim.chameleon.core.crypto.Bech32
import kr.jadekim.chameleon.core.crypto.Ripemd160
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.cosmos.key.BaseCosmosPublicKey
import kr.jadekim.common.encoder.HEX
import kr.jadekim.common.hash.SHA_256

interface Bech32Address<HRP> : Address {

    val hrp: HRP
        get() {
            val (hrp, _) = Bech32.decode(text)

            return parseHrp(hrp)
        }

    override val data: ByteArray
        get() {
            val (_, data) = Bech32.decode(text)

            return data
        }

    fun parseHrp(text: String): HRP
}

fun BaseCosmosPublicKey.toBech32Words(): ByteArray = Bech32.toWords(Ripemd160.hash(SHA_256.hash(publicKey)))

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
            fun fromHrp(hrp: String): Hrp? = values().firstOrNull { it.value.equals(hrp, true) }
        }
    }

    companion object {

        @JvmStatic
        fun createAccountAddress(publicKey: BaseCosmosPublicKey): CosmosAddress = CosmosAddress(
            Bech32.encode(
                CosmosAddress.Hrp.ACCOUNT.value,
                publicKey.toBech32Words(),
            ),
        )

        @JvmStatic
        fun createAccountPublicKeyAddress(publicKey: BaseCosmosPublicKey): CosmosAddress = CosmosAddress(
            Bech32.encode(
                CosmosAddress.Hrp.ACCOUNT_PUBLIC_KEY.value,
                Bech32.toWords(HEX.decode("eb5ae98721") + publicKey.publicKey),
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

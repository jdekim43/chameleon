package kr.jadekim.chameleon.terra.wallet

import kr.jadekim.chameleon.core.crypto.Bech32
import kr.jadekim.chameleon.cosmos.key.BaseCosmosPublicKey
import kr.jadekim.chameleon.cosmos.wallet.Bech32Address
import kr.jadekim.chameleon.cosmos.wallet.toBech32Words
import kr.jadekim.common.encoder.HEX

@JvmInline
value class TerraAddress(override val text: String) : Bech32Address<TerraAddress.Hrp> {

    enum class Hrp(val value: String) {
        ACCOUNT("terra"),
        ACCOUNT_PUBLIC_KEY("terrapub"),
        VALIDATOR_OPERATOR("terravaloper"),
        VALIDATOR_OPERATOR_PUBLIC_KEY("terravaloperpub"),
        CONSENSUS_NODE("terravalcons"),
        CONSENSUS_NODE_PUBLIC_KEY("terravalconspub");

        companion object {

            @JvmStatic
            fun fromHrp(hrp: String): Hrp? = values().firstOrNull { it.value.equals(hrp, true) }
        }
    }

    companion object {

        @JvmStatic
        fun createAccountAddress(publicKey: BaseCosmosPublicKey): TerraAddress = TerraAddress(
            Bech32.encode(
                Hrp.ACCOUNT.value,
                publicKey.toBech32Words(),
            ),
        )

        @JvmStatic
        fun createAccountPublicKeyAddress(publicKey: BaseCosmosPublicKey): TerraAddress = TerraAddress(
            Bech32.encode(
                TerraAddress.Hrp.ACCOUNT_PUBLIC_KEY.value,
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
        ?: throw IllegalArgumentException("Unknown bech32 hrp for terra address")
}
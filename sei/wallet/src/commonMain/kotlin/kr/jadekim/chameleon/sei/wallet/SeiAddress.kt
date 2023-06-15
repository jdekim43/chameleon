package kr.jadekim.chameleon.sei.wallet

import kr.jadekim.chameleon.core.crypto.Bech32
import kr.jadekim.chameleon.cosmos.key.BaseCosmosPublicKey
import kr.jadekim.chameleon.cosmos.wallet.Bech32Address
import kr.jadekim.chameleon.cosmos.wallet.toBech32Words
import kr.jadekim.common.encoder.HEX

@JvmInline
value class SeiAddress(override val text: String) : Bech32Address<SeiAddress.Hrp> {

    enum class Hrp(val value: String) {
        ACCOUNT("sei"),
        ACCOUNT_PUBLIC_KEY("seipub"),
        VALIDATOR_OPERATOR("seivaloper"),
        VALIDATOR_OPERATOR_PUBLIC_KEY("seivaloperpub"),
        CONSENSUS_NODE("seivalcons"),
        CONSENSUS_NODE_PUBLIC_KEY("seivalconspub");

        companion object {

            @JvmStatic
            fun fromHrp(hrp: String): Hrp? = values().firstOrNull { it.value.equals(hrp, true) }
        }
    }

    companion object {

        @JvmStatic
        fun createAccountAddress(publicKey: BaseCosmosPublicKey): SeiAddress = SeiAddress(
            Bech32.encode(
                Hrp.ACCOUNT.value,
                publicKey.toBech32Words(),
            ),
        )

        @JvmStatic
        fun createAccountPublicKeyAddress(publicKey: BaseCosmosPublicKey): SeiAddress = SeiAddress(
            Bech32.encode(
                SeiAddress.Hrp.ACCOUNT_PUBLIC_KEY.value,
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
        ?: throw IllegalArgumentException("Unknown bech32 hrp for sei address")
}
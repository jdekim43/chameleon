package kr.jadekim.chameleon.injective.wallet

import kr.jadekim.chameleon.core.crypto.Bech32
import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.core.wallet.Bech32Address
import kr.jadekim.common.encoder.HEX
import kr.jadekim.common.encoder.encodeHex

@JvmInline
value class InjectiveAddress(override val text: String) : Bech32Address<InjectiveAddress.Hrp> {

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

    companion object {

        @JvmStatic
        fun createAccountAddress(key: Key): InjectiveAddress = InjectiveAddress(
            Bech32.encode(Hrp.ACCOUNT.value, Bech32.toWords(key.address)),
        )

        @JvmStatic
        fun createAccountPublicKeyAddress(key: Key): InjectiveAddress = InjectiveAddress(
            Bech32.encode(
                Hrp.ACCOUNT_PUBLIC_KEY.value,
                Bech32.toWords(HEX.decode("eb5ae98721") + key.publicKey),
            )
        )

        @JvmStatic
        fun createConsensusAddress(key: Key): InjectiveAddress = InjectiveAddress(
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

    val ethereumAddress: String
        get() = "0x${data.encodeHex()}"

    override fun parseHrp(text: String): Hrp = Hrp.fromHrp(text)
        ?: throw IllegalArgumentException("Unknown bech32 hrp for injective address")
}

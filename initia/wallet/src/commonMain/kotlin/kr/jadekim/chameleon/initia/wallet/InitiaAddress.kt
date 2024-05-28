package kr.jadekim.chameleon.initia.wallet

import kr.jadekim.chameleon.core.crypto.Bech32
import kr.jadekim.chameleon.cosmos.key.Ed25519PublicKey
import kr.jadekim.chameleon.cosmos.key.Secp256k1PublicKey
import kr.jadekim.chameleon.cosmos.key.toAddress
import kr.jadekim.chameleon.cosmos.wallet.Bech32Address
import kr.jadekim.common.encoder.HEX

@JvmInline
value class InitiaAddress(override val text: String) : Bech32Address<InitiaAddress.Hrp> {

    enum class Hrp(val value: String) {
        ACCOUNT("init"),
        ACCOUNT_PUBLIC_KEY("initpub"),
        VALIDATOR_OPERATOR("initvaloper"),
        VALIDATOR_OPERATOR_PUBLIC_KEY("initvaloperpub"),
        CONSENSUS_NODE("initvalcons"),
        CONSENSUS_NODE_PUBLIC_KEY("initvalconspub");

        companion object {

            @JvmStatic
            fun fromHrp(hrp: String): Hrp? = values().firstOrNull { it.value.equals(hrp, true) }
        }
    }

    companion object {

        @JvmStatic
        fun createAccountAddress(publicKey: Secp256k1PublicKey): InitiaAddress = InitiaAddress(
            Bech32.encode(
                Hrp.ACCOUNT.value,
                publicKey.toAddress(),
            ),
        )

        @JvmStatic
        fun createAccountPublicKeyAddress(publicKey: Secp256k1PublicKey): InitiaAddress = InitiaAddress(
            Bech32.encode(
                Hrp.ACCOUNT_PUBLIC_KEY.value,
                Bech32.toWords(HEX.decode("eb5ae98721") + publicKey.publicKey),
            )
        )

        @JvmStatic
        fun createConsensusAddress(publicKey: Ed25519PublicKey): InitiaAddress = InitiaAddress(
            Bech32.encode(
                Hrp.CONSENSUS_NODE.value,
                publicKey.toAddress()
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
        ?: throw IllegalArgumentException("Unknown bech32 hrp for initia address")
}
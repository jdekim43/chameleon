package kr.jadekim.chameleon.injective.wallet

import kr.jadekim.chameleon.core.crypto.Bech32
import kr.jadekim.chameleon.core.crypto.Bip32
import kr.jadekim.chameleon.core.crypto.Keccak256
import kr.jadekim.chameleon.cosmos.key.Ed25519PublicKey
import kr.jadekim.chameleon.cosmos.key.Secp256k1PublicKey
import kr.jadekim.chameleon.cosmos.key.toAddress
import kr.jadekim.chameleon.cosmos.wallet.Bech32Address
import kr.jadekim.common.encoder.HEX
import kr.jadekim.common.encoder.encodeHex

private fun Secp256k1PublicKey.toEtherBasedAddress(): ByteArray {
    val uncompressedPublicKey = Bip32.decompressPublicKey(publicKey)
    val hashed = Keccak256.hash(uncompressedPublicKey.sliceArray(1 until uncompressedPublicKey.size))

    return hashed.sliceArray(hashed.size - 20 until hashed.size)
}

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
        fun createAccountAddress(publicKey: Secp256k1PublicKey): InjectiveAddress = InjectiveAddress(
            Bech32.encode(
                Hrp.ACCOUNT.value,
                Bech32.toWords(publicKey.toEtherBasedAddress()),
            ),
        )

        @JvmStatic
        fun createAccountPublicKeyAddress(publicKey: Secp256k1PublicKey): InjectiveAddress = InjectiveAddress(
            Bech32.encode(
                Hrp.ACCOUNT_PUBLIC_KEY.value,
                Bech32.toWords(HEX.decode("eb5ae98721") + publicKey.publicKey),
            )
        )

        @JvmStatic
        fun createConsensusAddress(publicKey: Ed25519PublicKey): InjectiveAddress = InjectiveAddress(
            Bech32.encode(
                Hrp.CONSENSUS_NODE.value,
                publicKey.toAddress()
            )
        )

        @JvmStatic
        fun createConsensusAddress(bytes: ByteArray): InjectiveAddress = InjectiveAddress(
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

    val ethereumAddress: String
        get() = "0x${data.encodeHex()}"

    override fun parseHrp(text: String): Hrp = Hrp.fromHrp(text)
        ?: throw IllegalArgumentException("Unknown bech32 hrp for injective address")
}

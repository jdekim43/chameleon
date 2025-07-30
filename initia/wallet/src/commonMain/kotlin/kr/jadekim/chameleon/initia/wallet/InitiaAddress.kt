package kr.jadekim.chameleon.initia.wallet

import kr.jadekim.chameleon.core.crypto.Bech32
import kr.jadekim.chameleon.core.crypto.Bip32
import kr.jadekim.chameleon.core.crypto.Keccak256
import kr.jadekim.chameleon.cosmos.key.Ed25519PublicKey
import kr.jadekim.chameleon.cosmos.key.Secp256k1PublicKey
import kr.jadekim.chameleon.cosmos.wallet.Bech32Address
import kr.jadekim.chameleon.initia.key.InitiaEthPublicKey
import kr.jadekim.common.encoder.HEX
import kr.jadekim.common.encoder.encodeHex
import kr.jadekim.chameleon.cosmos.key.toAddress as toCosmosBasedAddress

private fun Secp256k1PublicKey.toEtherBasedAddress(): ByteArray {
    val uncompressedPublicKey = Bip32.decompressPublicKey(publicKey)
    val hashed = Keccak256.hash(uncompressedPublicKey.sliceArray(1 until uncompressedPublicKey.size))

    return hashed.sliceArray(hashed.size - 20 until hashed.size)
}

private fun Secp256k1PublicKey.toAddress(): ByteArray {
    if (this is InitiaEthPublicKey) {
        return toEtherBasedAddress()
    }

    return toCosmosBasedAddress()
}

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
            fun fromHrp(hrp: String): Hrp? = entries.firstOrNull { it.value.equals(hrp, true) }
        }
    }

    companion object {

        @JvmStatic
        fun createAccountAddress(publicKey: Secp256k1PublicKey): InitiaAddress = InitiaAddress(
            Bech32.encode(
                Hrp.ACCOUNT.value,
                Bech32.toWords(publicKey.toAddress()),
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
                publicKey.toCosmosBasedAddress(),
            )
        )

        @JvmStatic
        fun createConsensusAddress(bytes: ByteArray): InitiaAddress = InitiaAddress(
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
        ?: throw IllegalArgumentException("Unknown bech32 hrp for initia address")
}
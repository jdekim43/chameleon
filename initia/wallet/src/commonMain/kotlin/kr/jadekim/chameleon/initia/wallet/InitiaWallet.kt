package kr.jadekim.chameleon.initia.wallet

import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.initia.key.*
import kr.jadekim.common.encoder.decodeHex

class InitiaWallet(override val address: InitiaAddress, override val key: InitiaPublicKey? = null) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        fun createEtherKey(
            coinType: Int = InitiaEthMnemonicKey.COIN_TYPE,
            account: Int = 0,
            index: Int = 0,
            passphrase: String? = null,
        ): Pair<InitiaWallet, InitiaMnemonicKey> {
            val key = InitiaEthMnemonicKey.create(coinType, account, index, passphrase)

            return InitiaWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        fun createCosmosKey(
            coinType: Int = InitiaCosmosMnemonicKey.COIN_TYPE,
            account: Int = 0,
            index: Int = 0,
            passphrase: String? = null,
        ): Pair<InitiaWallet, InitiaMnemonicKey> {
            val key = InitiaCosmosMnemonicKey.create(coinType, account, index, passphrase)

            return InitiaWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        fun fromMnemonicWithEtherKey(
            mnemonic: String,
            coinType: Int = InitiaEthMnemonicKey.COIN_TYPE,
            account: Int = 0,
            index: Int = 0,
            passphrase: String? = null,
        ) = InitiaWallet(InitiaEthMnemonicKey(mnemonic, coinType, account, index, passphrase))

        @JvmStatic
        @JvmOverloads
        fun fromMnemonicWithCosmosKey(
            mnemonic: String,
            coinType: Int = InitiaCosmosMnemonicKey.COIN_TYPE,
            account: Int = 0,
            index: Int = 0,
            passphrase: String? = null,
        ) = InitiaWallet(InitiaCosmosMnemonicKey(mnemonic, coinType, account, index, passphrase))

        @JvmStatic
        @JvmOverloads
        fun fromEtherKeyPair(
            privateKey: ByteArray,
            publicKey: ByteArray? = null,
        ) = InitiaWallet(InitiaEthKeyPair(privateKey, publicKey))

        @JvmStatic
        @JvmOverloads
        fun fromCosmosKeyPair(
            privateKey: ByteArray,
            publicKey: ByteArray? = null,
        ) = InitiaWallet(InitiaCosmosKeyPair(privateKey, publicKey))

        @JvmStatic
        @JvmOverloads
        fun fromEtherKeyPair(
            privateKey: String,
            publicKey: String? = null,
        ) = InitiaWallet(InitiaEthKeyPair(privateKey.decodeHex(), publicKey?.decodeHex()))

        @JvmStatic
        @JvmOverloads
        fun fromCosmosKeyPair(
            privateKey: String,
            publicKey: String? = null,
        ) = InitiaWallet(InitiaCosmosKeyPair(privateKey.decodeHex(), publicKey?.decodeHex()))
    }

    constructor(key: InitiaPublicKey) : this(InitiaAddress.createAccountAddress(key), key)
}
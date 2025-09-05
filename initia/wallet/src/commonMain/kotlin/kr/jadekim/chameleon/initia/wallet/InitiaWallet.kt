package kr.jadekim.chameleon.initia.wallet

import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.initia.key.InitiaCosmosMnemonicKey
import kr.jadekim.chameleon.initia.key.InitiaCosmosSecp256k1KeyPair
import kr.jadekim.chameleon.initia.key.InitiaEtherMnemonicKey
import kr.jadekim.chameleon.initia.key.InitiaEtherSecp256k1KeyPair
import kr.jadekim.common.encoder.decodeHex

class InitiaWallet(override val address: InitiaAddress, override val key: Key? = null) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        fun createEtherKey(
            coinType: Int = InitiaEtherMnemonicKey.COIN_TYPE,
            account: Int = 0,
            index: Int = 0,
            passphrase: String? = null,
        ): Pair<InitiaWallet, InitiaEtherMnemonicKey> {
            val key = InitiaEtherMnemonicKey.create(coinType, account, index, passphrase)

            return InitiaWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        fun createCosmosKey(
            coinType: Int = InitiaCosmosMnemonicKey.COIN_TYPE,
            account: Int = 0,
            index: Int = 0,
            passphrase: String? = null,
        ): Pair<InitiaWallet, InitiaCosmosMnemonicKey> {
            val key = InitiaCosmosMnemonicKey.create(coinType, account, index, passphrase)

            return InitiaWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        fun fromMnemonicWithEtherKey(
            mnemonic: String,
            coinType: Int = InitiaEtherMnemonicKey.COIN_TYPE,
            account: Int = 0,
            index: Int = 0,
            passphrase: String? = null,
        ) = InitiaWallet(InitiaEtherMnemonicKey(mnemonic, coinType, account, index, passphrase))

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
        ) = InitiaWallet(InitiaEtherSecp256k1KeyPair(privateKey, publicKey))

        @JvmStatic
        @JvmOverloads
        fun fromCosmosKeyPair(
            privateKey: ByteArray,
            publicKey: ByteArray? = null,
        ) = InitiaWallet(InitiaCosmosSecp256k1KeyPair(privateKey, publicKey))

        @JvmStatic
        @JvmOverloads
        fun fromEtherKeyPair(
            privateKey: String,
            publicKey: String? = null,
        ) = InitiaWallet(InitiaEtherSecp256k1KeyPair(privateKey.decodeHex(), publicKey?.decodeHex()))

        @JvmStatic
        @JvmOverloads
        fun fromCosmosKeyPair(
            privateKey: String,
            publicKey: String? = null,
        ) = InitiaWallet(InitiaCosmosSecp256k1KeyPair(privateKey.decodeHex(), publicKey?.decodeHex()))
    }

    constructor(key: Key) : this(InitiaAddress.createAccountAddress(key), key)
}
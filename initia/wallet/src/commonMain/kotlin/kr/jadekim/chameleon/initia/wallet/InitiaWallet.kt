package kr.jadekim.chameleon.initia.wallet

import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.initia.key.InitiaKeyPair
import kr.jadekim.chameleon.initia.key.InitiaMnemonicKey
import kr.jadekim.chameleon.initia.key.InitiaPublicKey
import kr.jadekim.common.encoder.decodeHex

class InitiaWallet(override val address: InitiaAddress, override val key: InitiaPublicKey? = null) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        fun create(
            coinType: Int = InitiaMnemonicKey.COIN_TYPE,
            account: Int = 0,
            index: Int = 0,
            passphrase: String? = null,
        ): Pair<InitiaWallet, InitiaMnemonicKey> {
            val key = InitiaMnemonicKey.create(coinType, account, index, passphrase)

            return InitiaWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        fun fromMnemonic(
            mnemonic: String,
            coinType: Int = InitiaMnemonicKey.COIN_TYPE,
            account: Int = 0,
            index: Int = 0,
            passphrase: String? = null,
        ) = InitiaWallet(InitiaMnemonicKey(mnemonic, coinType, account, index, passphrase))

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: ByteArray,
            publicKey: ByteArray? = null,
        ) = InitiaWallet(InitiaKeyPair(privateKey, publicKey))

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: String,
            publicKey: String? = null,
        ) = InitiaWallet(InitiaKeyPair(privateKey.decodeHex(), publicKey?.decodeHex()))
    }

    constructor(key: InitiaPublicKey) : this(InitiaAddress.createAccountAddress(key), key)

    constructor(publicKey: ByteArray) : this(InitiaPublicKey(publicKey))
}
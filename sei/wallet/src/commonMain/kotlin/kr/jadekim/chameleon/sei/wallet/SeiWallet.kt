package kr.jadekim.chameleon.sei.wallet

import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.sei.key.SeiMnemonicKey
import kr.jadekim.chameleon.sei.key.SeiSecp256k1KeyPair
import kr.jadekim.chameleon.sei.key.SeiSecp256k1PublicKey
import kr.jadekim.common.encoder.decodeHex

class SeiWallet(override val address: SeiAddress, override val key: Key? = null) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        fun create(
            coinType: Int = SeiMnemonicKey.COIN_TYPE,
            account: Int = 0,
            index: Int = 0,
            passphrase: String? = null,
        ): Pair<SeiWallet, SeiMnemonicKey> {
            val key = SeiMnemonicKey.create(coinType, account, index, passphrase)

            return SeiWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        fun fromMnemonic(
            mnemonic: String,
            coinType: Int = SeiMnemonicKey.COIN_TYPE,
            account: Int = 0,
            index: Int = 0,
            passphrase: String? = null,
        ) = SeiWallet(SeiMnemonicKey(mnemonic, coinType, account, index, passphrase))

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: ByteArray,
            publicKey: ByteArray? = null,
        ) = SeiWallet(SeiSecp256k1KeyPair(privateKey, publicKey))

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: String,
            publicKey: String? = null,
        ) = SeiWallet(SeiSecp256k1KeyPair(privateKey.decodeHex(), publicKey?.decodeHex()))
    }

    constructor(key: Key) : this(SeiAddress.createAccountAddress(key), key)

    constructor(publicKey: ByteArray) : this(SeiSecp256k1PublicKey(publicKey))
}
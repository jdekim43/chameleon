package kr.jadekim.chameleon.sei.wallet

import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.sei.key.SeiKeyPair
import kr.jadekim.chameleon.sei.key.SeiMnemonicKey
import kr.jadekim.chameleon.sei.key.SeiPublicKey
import kr.jadekim.common.encoder.decodeHex

class SeiWallet(override val address: SeiAddress, override val key: SeiPublicKey? = null) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        fun create(index: Int = 0, passphrase: String? = null): Pair<SeiWallet, SeiMnemonicKey> {
            val key = SeiMnemonicKey.create(index, passphrase)

            return SeiWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        fun fromMnemonic(
            mnemonic: String,
            index: Int = 0,
            passphrase: String? = null,
        ) = SeiWallet(SeiMnemonicKey(mnemonic, index, passphrase))

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: ByteArray,
            publicKey: ByteArray? = null,
        ) = SeiWallet(SeiKeyPair(privateKey, publicKey))

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: String,
            publicKey: String? = null,
        ) = SeiWallet(SeiKeyPair(privateKey.decodeHex(), publicKey?.decodeHex()))
    }

    constructor(key: SeiPublicKey) : this(SeiAddress.createAccountAddress(key), key)

    constructor(publicKey: ByteArray) : this(SeiPublicKey(publicKey))
}
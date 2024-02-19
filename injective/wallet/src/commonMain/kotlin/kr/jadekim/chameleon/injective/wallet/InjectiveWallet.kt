package kr.jadekim.chameleon.injective.wallet

import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.injective.key.InjectiveKeyPair
import kr.jadekim.chameleon.injective.key.InjectiveMnemonicKey
import kr.jadekim.chameleon.injective.key.InjectivePublicKey
import kr.jadekim.common.encoder.decodeHex

class InjectiveWallet(override val address: InjectiveAddress, override val key: InjectivePublicKey? = null) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        fun create(index: Int = 0, passphrase: String? = null): Pair<InjectiveWallet, InjectiveMnemonicKey> {
            val key = InjectiveMnemonicKey.create(index, passphrase)

            return InjectiveWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        fun fromMnemonic(
            mnemonic: String,
            index: Int = 0,
            passphrase: String? = null,
        ) = InjectiveWallet(InjectiveMnemonicKey(mnemonic, index, passphrase))

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: ByteArray,
            publicKey: ByteArray? = null,
        ) = InjectiveWallet(InjectiveKeyPair(privateKey, publicKey))

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: String,
            publicKey: String? = null,
        ) = InjectiveWallet(InjectiveKeyPair(privateKey.decodeHex(), publicKey?.decodeHex()))
    }

    constructor(key: InjectivePublicKey) : this(InjectiveAddress.createAccountAddress(key), key)

    constructor(publicKey: ByteArray) : this(InjectivePublicKey(publicKey))
}
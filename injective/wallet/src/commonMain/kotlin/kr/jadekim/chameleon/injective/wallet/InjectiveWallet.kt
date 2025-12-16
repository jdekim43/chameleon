package kr.jadekim.chameleon.injective.wallet

import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.core.mnemonic.Mnemonic
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.injective.key.InjectiveMnemonicKey
import kr.jadekim.chameleon.injective.key.InjectiveSecp256k1PrivateKey
import kr.jadekim.chameleon.injective.key.InjectiveSecp256k1PublicKey
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

class InjectiveWallet(override val address: Address, override val key: Key? = null) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        suspend fun create(
            mnemonic: Mnemonic = Mnemonic.generate(Mnemonic.Strength.WORD_24),
            coinType: UInt = InjectiveMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = InjectiveMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ): Pair<InjectiveWallet, InjectiveMnemonicKey> {
            val key = InjectiveMnemonicKey.from(mnemonic, coinType, account, change, index, password)

            return InjectiveWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        suspend fun fromMnemonic(
            mnemonic: String,
            coinType: UInt = InjectiveMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = InjectiveMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ) = create(Mnemonic(mnemonic), coinType, account, change, index, password)

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: ByteArray,
            publicKey: ByteArray? = null,
        ) = InjectiveWallet(InjectiveSecp256k1PrivateKey(privateKey, publicKey))
    }

    constructor(key: InjectiveSecp256k1PublicKey) : this(InjectiveAddress.createAccountAddress(key), key)

    constructor(publicKey: ByteArray) : this(InjectiveSecp256k1PublicKey(publicKey))
}
package kr.jadekim.chameleon.initia.wallet

import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.core.mnemonic.Mnemonic
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.initia.key.*
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

class InitiaWallet(override val address: Address, override val key: Key? = null) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        suspend fun createEtherKey(
            mnemonic: Mnemonic = Mnemonic.generate(Mnemonic.Strength.WORD_24),
            coinType: UInt = InitiaEtherMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = InitiaEtherMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ): Pair<InitiaWallet, InitiaEtherMnemonicKey> {
            val key = InitiaEtherMnemonicKey.from(mnemonic, coinType, account, change, index, password)

            return InitiaWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        suspend fun createCosmosKey(
            mnemonic: Mnemonic = Mnemonic.generate(Mnemonic.Strength.WORD_24),
            coinType: UInt = InitiaEtherMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = InitiaEtherMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ): Pair<InitiaWallet, InitiaMnemonicKey> {
            val key = InitiaMnemonicKey.from(mnemonic, coinType, account, change, index, password)

            return InitiaWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        suspend fun fromMnemonicWithEtherKey(
            mnemonic: String,
            coinType: UInt = InitiaEtherMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = InitiaEtherMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ) = createEtherKey(Mnemonic(mnemonic), coinType, account, change, index, password)

        @JvmStatic
        @JvmOverloads
        suspend fun fromMnemonicWithCosmosKey(
            mnemonic: String,
            coinType: UInt = InitiaEtherMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = InitiaEtherMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ) = createCosmosKey(Mnemonic(mnemonic), coinType, account, change, index, password)

        @JvmStatic
        @JvmOverloads
        fun fromWithEtherKey(
            privateKey: ByteArray,
            publicKey: ByteArray? = null,
        ) = InitiaWallet(InitiaEtherSecp256k1PrivateKey(privateKey, publicKey))

        @JvmStatic
        @JvmOverloads
        fun fromWithCosmosKey(
            privateKey: ByteArray,
            publicKey: ByteArray? = null,
        ) = InitiaWallet(InitiaSecp256k1PrivateKey(privateKey, publicKey))
    }

    constructor(key: InitiaSecp256k1PublicKey) : this(InitiaAddress.createAccountAddress(key), key)

    constructor(key: InitiaEtherSecp256k1PublicKey) : this(InitiaAddress.createAccountAddress(key), key)
}
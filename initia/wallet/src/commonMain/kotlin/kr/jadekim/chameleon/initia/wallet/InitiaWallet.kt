package kr.jadekim.chameleon.initia.wallet

import kr.jadekim.chameleon.core.key.PrivateKey
import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.chameleon.core.mnemonic.Mnemonic
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.initia.key.*
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

class InitiaWallet(
    override val address: Address,
    override val privateKey: PrivateKey? = null,
    override val publicKey: PublicKey? = privateKey?.createPublicKey(),
) : Wallet {

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
    }

    constructor(
        publicKey: InitiaCosmosPublicKey,
        privateKey: InitiaCosmosPrivateKey? = null
    ) : this(InitiaAddress.createAccountAddress(publicKey), privateKey, publicKey)

    constructor(privateKey: InitiaCosmosPrivateKey) : this(privateKey.createPublicKey(), privateKey)

    constructor(
        publicKey: InitiaEtherPublicKey,
        privateKey: InitiaEtherPrivateKey? = null
    ) : this(InitiaAddress.createAccountAddress(publicKey), privateKey, publicKey)

    constructor(privateKey: InitiaEtherPrivateKey) : this(privateKey.createPublicKey(), privateKey)

    constructor(publicKey: ByteArray, privateKey: ByteArray? = null) : this(
        InitiaEtherPublicKey(publicKey),
        privateKey?.let { InitiaEtherPrivateKey(it) },
    )
}
package kr.jadekim.chameleon.cosmos.wallet

import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.core.mnemonic.Mnemonic
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.cosmos.key.CosmosMnemonicKey
import kr.jadekim.chameleon.cosmos.key.CosmosSecp256k1PrivateKey
import kr.jadekim.chameleon.cosmos.key.CosmosSecp256k1PublicKey
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

class CosmosWallet(override val address: Address, override val key: Key? = null) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        suspend fun create(
            mnemonic: Mnemonic = Mnemonic.generate(Mnemonic.Strength.WORD_24),
            coinType: UInt = CosmosMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = CosmosMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ): Pair<CosmosWallet, CosmosMnemonicKey> {
            val key = CosmosMnemonicKey.from(mnemonic, coinType, account, change, index, password)

            return CosmosWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        suspend fun fromMnemonic(
            mnemonic: String,
            coinType: UInt = CosmosMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = CosmosMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ) = create(Mnemonic(mnemonic), coinType, account, change, index, password)

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: ByteArray,
            publicKey: ByteArray? = null,
        ) = CosmosWallet(CosmosSecp256k1PrivateKey(privateKey, publicKey))
    }

    constructor(key: CosmosSecp256k1PublicKey) : this(CosmosAddress.createAccountAddress(key), key)

    constructor(publicKey: ByteArray) : this(CosmosSecp256k1PublicKey(publicKey))
}
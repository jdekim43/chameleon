package kr.jadekim.chameleon.cosmos.wallet

import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.cosmos.key.CosmosMnemonicKey
import kr.jadekim.chameleon.cosmos.key.CosmosSecp256k1KeyPair
import kr.jadekim.chameleon.cosmos.key.CosmosSecp256k1PublicKey
import kr.jadekim.common.encoder.decodeHex

class CosmosWallet(override val address: CosmosAddress, override val key: Key? = null) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        fun create(
            coinType: Int = CosmosMnemonicKey.COIN_TYPE,
            account: Int = 0,
            index: Int = 0,
            passphrase: String? = null,
        ): Pair<CosmosWallet, CosmosMnemonicKey> {
            val key = CosmosMnemonicKey.create(coinType, account, index, passphrase)

            return CosmosWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        fun fromMnemonic(
            mnemonic: String,
            coinType: Int = CosmosMnemonicKey.COIN_TYPE,
            account: Int = 0,
            index: Int = 0,
            passphrase: String? = null,
        ) = CosmosWallet(CosmosMnemonicKey(mnemonic, coinType, account, index, passphrase))

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: ByteArray,
            publicKey: ByteArray? = null,
        ) = CosmosWallet(CosmosSecp256k1KeyPair(privateKey, publicKey))

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: String,
            publicKey: String? = null,
        ) = CosmosWallet(CosmosSecp256k1KeyPair(privateKey.decodeHex(), publicKey?.decodeHex()))
    }

    constructor(key: Key) : this(CosmosAddress.createAccountAddress(key), key)

    constructor(publicKey: ByteArray) : this(CosmosSecp256k1PublicKey(publicKey))
}
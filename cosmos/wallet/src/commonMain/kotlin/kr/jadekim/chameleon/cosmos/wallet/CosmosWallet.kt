package kr.jadekim.chameleon.cosmos.wallet

import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.cosmos.key.CosmosKeyPair
import kr.jadekim.chameleon.cosmos.key.CosmosMnemonicKey
import kr.jadekim.chameleon.cosmos.key.CosmosPublicKey
import kr.jadekim.common.encoder.decodeHex

class CosmosWallet(override val address: CosmosAddress, override val key: CosmosPublicKey? = null) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        fun create(index: Int = 0, passphrase: String? = null): Pair<CosmosWallet, CosmosMnemonicKey> {
            val key = CosmosMnemonicKey.create(index, passphrase)

            return CosmosWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        fun fromMnemonic(
            mnemonic: String,
            index: Int = 0,
            passphrase: String? = null,
        ) = CosmosWallet(CosmosMnemonicKey(mnemonic, index, passphrase))

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: ByteArray,
            publicKey: ByteArray? = null,
        ) = CosmosWallet(CosmosKeyPair(privateKey, publicKey))

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: String,
            publicKey: String? = null,
        ) = CosmosWallet(CosmosKeyPair(privateKey.decodeHex(), publicKey?.decodeHex()))
    }

    constructor(key: CosmosPublicKey) : this(CosmosAddress.createAccountAddress(key), key)

    constructor(publicKey: ByteArray) : this(CosmosPublicKey(publicKey))
}
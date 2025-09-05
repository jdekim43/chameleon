package kr.jadekim.chameleon.terra.wallet

import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.terra.key.TerraMnemonicKey
import kr.jadekim.chameleon.terra.key.TerraSecp256k1KeyPair
import kr.jadekim.chameleon.terra.key.TerraSecp256k1PublicKey
import kr.jadekim.common.encoder.decodeHex

class TerraWallet(override val address: TerraAddress, override val key: Key? = null) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        fun create(
            coinType: Int = TerraMnemonicKey.COIN_TYPE,
            account: Int = 0,
            index: Int = 0,
            passphrase: String? = null,
        ): Pair<TerraWallet, TerraMnemonicKey> {
            val key = TerraMnemonicKey.create(coinType, account, index, passphrase)

            return TerraWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        fun fromMnemonic(
            mnemonic: String,
            coinType: Int = TerraMnemonicKey.COIN_TYPE,
            account: Int = 0,
            index: Int = 0,
            passphrase: String? = null,
        ) = TerraWallet(TerraMnemonicKey(mnemonic, coinType, account, index, passphrase))

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: ByteArray,
            publicKey: ByteArray? = null,
        ) = TerraWallet(TerraSecp256k1KeyPair(privateKey, publicKey))

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: String,
            publicKey: String? = null,
        ) = TerraWallet(TerraSecp256k1KeyPair(privateKey.decodeHex(), publicKey?.decodeHex()))
    }

    constructor(key: Key) : this(TerraAddress.createAccountAddress(key), key)

    constructor(publicKey: ByteArray) : this(TerraSecp256k1PublicKey(publicKey))
}
package kr.jadekim.chameleon.terra.wallet

import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.terra.key.TerraKeyPair
import kr.jadekim.chameleon.terra.key.TerraMnemonicKey
import kr.jadekim.chameleon.terra.key.TerraPublicKey
import kr.jadekim.common.encoder.decodeHex

class TerraWallet(override val address: TerraAddress, override val key: TerraPublicKey? = null) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        fun create(index: Int = 0, passphrase: String? = null): Pair<TerraWallet, TerraMnemonicKey> {
            val key = TerraMnemonicKey.create(index, passphrase)

            return TerraWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        fun fromMnemonic(
            mnemonic: String,
            index: Int = 0,
            passphrase: String? = null,
        ) = TerraWallet(TerraMnemonicKey(mnemonic, index, passphrase))

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: ByteArray,
            publicKey: ByteArray? = null,
        ) = TerraWallet(TerraKeyPair(privateKey, publicKey))

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: String,
            publicKey: String? = null,
        ) = TerraWallet(TerraKeyPair(privateKey.decodeHex(), publicKey?.decodeHex()))
    }

    constructor(key: TerraPublicKey) : this(TerraAddress.createAccountAddress(key), key)

    constructor(publicKey: ByteArray) : this(TerraPublicKey(publicKey))
}
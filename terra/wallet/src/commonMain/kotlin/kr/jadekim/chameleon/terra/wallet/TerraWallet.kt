package kr.jadekim.chameleon.terra.wallet

import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.core.mnemonic.Mnemonic
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.terra.key.TerraMnemonicKey
import kr.jadekim.chameleon.terra.key.TerraSecp256k1PrivateKey
import kr.jadekim.chameleon.terra.key.TerraSecp256k1PublicKey
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

class TerraWallet(override val address: Address, override val key: Key? = null) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        suspend fun create(
            mnemonic: Mnemonic = Mnemonic.generate(Mnemonic.Strength.WORD_24),
            coinType: UInt = TerraMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = TerraMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ): Pair<TerraWallet, TerraMnemonicKey> {
            val key = TerraMnemonicKey.from(mnemonic, coinType, account, change, index, password)

            return TerraWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        suspend fun fromMnemonic(
            mnemonic: String,
            coinType: UInt = TerraMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = TerraMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ) = create(Mnemonic(mnemonic), coinType, account, change, index, password)

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: ByteArray,
            publicKey: ByteArray? = null,
        ) = TerraWallet(TerraSecp256k1PrivateKey(privateKey, publicKey))
    }

    constructor(key: TerraSecp256k1PublicKey) : this(TerraAddress.createAccountAddress(key), key)

    constructor(publicKey: ByteArray) : this(TerraSecp256k1PublicKey(publicKey))
}
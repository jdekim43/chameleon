package kr.jadekim.chameleon.ethereum.wallet

import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.core.mnemonic.Mnemonic
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.ethereum.key.EthereumMnemonicKey
import kr.jadekim.chameleon.ethereum.key.EthereumSecp256k1PrivateKey
import kr.jadekim.chameleon.ethereum.key.EthereumSecp256k1PublicKey
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

class EthereumWallet(override val address: Address, override val key: Key? = null) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        suspend fun create(
            mnemonic: Mnemonic = Mnemonic.generate(Mnemonic.Strength.WORD_24),
            coinType: UInt = EthereumMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = EthereumMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ): Pair<EthereumWallet, EthereumMnemonicKey> {
            val key = EthereumMnemonicKey.from(mnemonic, coinType, account, change, index, password)

            return EthereumWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        suspend fun fromMnemonic(
            mnemonic: String,
            coinType: UInt = EthereumMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = EthereumMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ) = create(Mnemonic(mnemonic), coinType, account, change, index, password)

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: ByteArray,
            publicKey: ByteArray? = null,
        ) = EthereumWallet(EthereumSecp256k1PrivateKey(privateKey, publicKey))
    }

    constructor(key: EthereumSecp256k1PublicKey) : this(EthereumAddress.createAccountAddress(key), key)

    constructor(publicKey: ByteArray) : this(EthereumSecp256k1PublicKey(publicKey))
}

package kr.jadekim.chameleon.sei.wallet

import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.core.mnemonic.Mnemonic
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.sei.key.SeiMnemonicKey
import kr.jadekim.chameleon.sei.key.SeiSecp256k1PrivateKey
import kr.jadekim.chameleon.sei.key.SeiSecp256k1PublicKey
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

class SeiWallet(override val address: Address, override val key: Key? = null) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        suspend fun create(
            mnemonic: Mnemonic = Mnemonic.generate(Mnemonic.Strength.WORD_24),
            coinType: UInt = SeiMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = SeiMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ): Pair<SeiWallet, SeiMnemonicKey> {
            val key = SeiMnemonicKey.from(mnemonic, coinType, account, change, index, password)

            return SeiWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        suspend fun fromMnemonic(
            mnemonic: String,
            coinType: UInt = SeiMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = SeiMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ) = create(Mnemonic(mnemonic), coinType, account, change, index, password)

        @JvmStatic
        @JvmOverloads
        fun fromKeyPair(
            privateKey: ByteArray,
            publicKey: ByteArray? = null,
        ) = SeiWallet(SeiSecp256k1PrivateKey(privateKey, publicKey))
    }

    constructor(key: SeiSecp256k1PublicKey) : this(SeiAddress.createAccountAddress(key), key)

    constructor(publicKey: ByteArray) : this(SeiSecp256k1PublicKey(publicKey))
}
package kr.jadekim.chameleon.injective.wallet

import kr.jadekim.chameleon.core.key.PrivateKey
import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.chameleon.core.mnemonic.Mnemonic
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.injective.key.InjectiveMnemonicKey
import kr.jadekim.chameleon.injective.key.InjectivePrivateKey
import kr.jadekim.chameleon.injective.key.InjectivePublicKey
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

class InjectiveWallet(
    override val address: Address,
    override val privateKey: PrivateKey? = null,
    override val publicKey: PublicKey? = privateKey?.createPublicKey(),
) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        suspend fun create(
            mnemonic: Mnemonic = Mnemonic.generate(Mnemonic.Strength.WORD_24),
            coinType: UInt = InjectiveMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = InjectiveMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ): Pair<InjectiveWallet, InjectiveMnemonicKey> {
            val key = InjectiveMnemonicKey.from(mnemonic, coinType, account, change, index, password)

            return InjectiveWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        suspend fun fromMnemonic(
            mnemonic: String,
            coinType: UInt = InjectiveMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = InjectiveMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ) = create(Mnemonic(mnemonic), coinType, account, change, index, password)
    }

    constructor(
        publicKey: InjectivePublicKey,
        privateKey: InjectivePrivateKey? = null
    ) : this(InjectiveAddress.createAccountAddress(publicKey), privateKey, publicKey)

    constructor(privateKey: InjectivePrivateKey) : this(privateKey.createPublicKey(), privateKey)

    constructor(publicKey: ByteArray, privateKey: ByteArray? = null) : this(
        InjectivePublicKey(publicKey),
        privateKey?.let { InjectivePrivateKey(it) },
    )
}
package kr.jadekim.chameleon.sei.wallet

import kr.jadekim.chameleon.core.key.PrivateKey
import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.chameleon.core.mnemonic.Mnemonic
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.sei.key.SeiMnemonicKey
import kr.jadekim.chameleon.sei.key.SeiPrivateKey
import kr.jadekim.chameleon.sei.key.SeiPublicKey
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

class SeiWallet(
    override val address: Address,
    override val privateKey: PrivateKey? = null,
    override val publicKey: PublicKey? = privateKey?.createPublicKey(),
) : Wallet {
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
    }

    constructor(
        publicKey: SeiPublicKey,
        privateKey: SeiPrivateKey? = null
    ) : this(SeiAddress.createAccountAddress(publicKey), privateKey, publicKey)

    constructor(privateKey: SeiPrivateKey) : this(privateKey.createPublicKey(), privateKey)

    constructor(publicKey: ByteArray, privateKey: ByteArray? = null) : this(
        SeiPublicKey(publicKey),
        privateKey?.let { SeiPrivateKey(it) },
    )
}
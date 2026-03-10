package kr.jadekim.chameleon.solana.wallet

import kr.jadekim.chameleon.core.key.PrivateKey
import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.chameleon.core.mnemonic.Mnemonic
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.solana.key.SolanaMnemonicKey
import kr.jadekim.chameleon.solana.key.SolanaPrivateKey
import kr.jadekim.chameleon.solana.key.SolanaPublicKey
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

class SolanaWallet(
    override val address: Address,
    override val privateKey: PrivateKey? = null,
    override val publicKey: PublicKey? = privateKey?.createPublicKey(),
) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        suspend fun create(
            mnemonic: Mnemonic = Mnemonic.generate(Mnemonic.Strength.WORD_24),
            coinType: UInt = SolanaMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = SolanaMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ): Pair<SolanaWallet, SolanaMnemonicKey> {
            val key = SolanaMnemonicKey.from(mnemonic, coinType, account, change, index, password)

            return SolanaWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        suspend fun fromMnemonic(
            mnemonic: String,
            coinType: UInt = SolanaMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = SolanaMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ) = create(Mnemonic(mnemonic), coinType, account, change, index, password)
    }

    constructor(
        publicKey: SolanaPublicKey,
        privateKey: SolanaPrivateKey? = null
    ) : this(SolanaAddress.createAddress(publicKey), privateKey, publicKey)

    constructor(privateKey: SolanaPrivateKey) : this(privateKey.createPublicKey(), privateKey)

    constructor(publicKey: ByteArray, privateKey: ByteArray? = null) : this(
        SolanaPublicKey(publicKey),
        privateKey?.let { SolanaPrivateKey(it) },
    )
}
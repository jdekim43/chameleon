package kr.jadekim.chameleon.bitcoin.wallet

import kr.jadekim.chameleon.bitcoin.key.BitcoinMnemonicKey
import kr.jadekim.chameleon.bitcoin.key.BitcoinPrivateKey
import kr.jadekim.chameleon.bitcoin.key.BitcoinPublicKey
import kr.jadekim.chameleon.core.key.PrivateKey
import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.chameleon.core.mnemonic.Mnemonic
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Wallet
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

class BitcoinWallet(
    override val address: Address,
    override val privateKey: PrivateKey? = null,
    override val publicKey: PublicKey? = privateKey?.createPublicKey(),
) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        suspend fun create(
            mnemonic: Mnemonic = Mnemonic.generate(Mnemonic.Strength.WORD_24),
            coinType: UInt = BitcoinMnemonicKey.COIN_TYPE_MAINNET,
            account: UInt = 0u,
            change: UInt = BitcoinMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ): Pair<BitcoinWallet, BitcoinMnemonicKey> {
            val key = BitcoinMnemonicKey.from(mnemonic, coinType, account, change, index, password)

            return BitcoinWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        suspend fun fromMnemonic(
            mnemonic: String,
            coinType: UInt = BitcoinMnemonicKey.COIN_TYPE_MAINNET,
            account: UInt = 0u,
            change: UInt = BitcoinMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ) = create(Mnemonic(mnemonic), coinType, account, change, index, password)
    }

    constructor(
        publicKey: BitcoinPublicKey,
        privateKey: BitcoinPrivateKey? = null
    ) : this(BitcoinAddress.createP2WPKHAddress(publicKey), privateKey, publicKey)

    constructor(privateKey: BitcoinPrivateKey) : this(privateKey.createPublicKey(), privateKey)

    constructor(publicKey: ByteArray, privateKey: ByteArray? = null) : this(
        BitcoinPublicKey(publicKey),
        privateKey?.let { BitcoinPrivateKey(it) },
    )
}
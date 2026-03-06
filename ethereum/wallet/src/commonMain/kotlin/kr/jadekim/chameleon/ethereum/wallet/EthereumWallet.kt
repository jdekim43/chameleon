package kr.jadekim.chameleon.ethereum.wallet

import kr.jadekim.chameleon.core.key.PrivateKey
import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.chameleon.core.mnemonic.Mnemonic
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.ethereum.key.EthereumMnemonicKey
import kr.jadekim.chameleon.ethereum.key.EthereumPrivateKey
import kr.jadekim.chameleon.ethereum.key.EthereumPublicKey
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

class EthereumWallet(
    override val address: Address,
    override val privateKey: PrivateKey? = null,
    override val publicKey: PublicKey? = privateKey?.createPublicKey(),
) : Wallet {

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
    }

    constructor(
        publicKey: EthereumPublicKey,
        privateKey: EthereumPrivateKey? = null
    ) : this(EthereumAddress.createAccountAddress(publicKey), privateKey, publicKey)

    constructor(privateKey: EthereumPrivateKey) : this(privateKey.createPublicKey(), privateKey)

    constructor(publicKey: ByteArray, privateKey: ByteArray? = null) : this(
        EthereumPublicKey(publicKey),
        privateKey?.let { EthereumPrivateKey(it) },
    )
}

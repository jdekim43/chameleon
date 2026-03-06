package kr.jadekim.chameleon.cosmos.wallet

import kr.jadekim.chameleon.core.key.PrivateKey
import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.chameleon.core.mnemonic.Mnemonic
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.cosmos.key.CosmosMnemonicKey
import kr.jadekim.chameleon.cosmos.key.CosmosPrivateKey
import kr.jadekim.chameleon.cosmos.key.CosmosPublicKey
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

class CosmosWallet(
    override val address: Address,
    override val privateKey: PrivateKey? = null,
    override val publicKey: PublicKey? = privateKey?.createPublicKey(),
) : Wallet {

    companion object {

        @JvmStatic
        @JvmOverloads
        suspend fun create(
            mnemonic: Mnemonic = Mnemonic.generate(Mnemonic.Strength.WORD_24),
            coinType: UInt = CosmosMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = CosmosMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ): Pair<CosmosWallet, CosmosMnemonicKey> {
            val key = CosmosMnemonicKey.from(mnemonic, coinType, account, change, index, password)

            return CosmosWallet(key) to key
        }

        @JvmStatic
        @JvmOverloads
        suspend fun fromMnemonic(
            mnemonic: String,
            coinType: UInt = CosmosMnemonicKey.COIN_TYPE,
            account: UInt = 0u,
            change: UInt = CosmosMnemonicKey.CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ) = create(Mnemonic(mnemonic), coinType, account, change, index, password)
    }

    constructor(
        publicKey: CosmosPublicKey,
        privateKey: CosmosPrivateKey? = null
    ) : this(CosmosAddress.createAccountAddress(publicKey), privateKey, publicKey)

    constructor(privateKey: CosmosPrivateKey) : this(privateKey.createPublicKey(), privateKey)

    constructor(publicKey: ByteArray, privateKey: ByteArray? = null) : this(
        CosmosPublicKey(publicKey),
        privateKey?.let { CosmosPrivateKey(it) },
    )
}
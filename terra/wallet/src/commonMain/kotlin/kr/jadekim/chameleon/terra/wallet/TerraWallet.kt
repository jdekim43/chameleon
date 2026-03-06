package kr.jadekim.chameleon.terra.wallet

import kr.jadekim.chameleon.core.key.PrivateKey
import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.chameleon.core.mnemonic.Mnemonic
import kr.jadekim.chameleon.core.wallet.Address
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.terra.key.TerraMnemonicKey
import kr.jadekim.chameleon.terra.key.TerraPrivateKey
import kr.jadekim.chameleon.terra.key.TerraPublicKey
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

class TerraWallet(
    override val address: Address,
    override val privateKey: PrivateKey? = null,
    override val publicKey: PublicKey? = privateKey?.createPublicKey(),
) : Wallet {

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
    }

    constructor(
        publicKey: TerraPublicKey,
        privateKey: TerraPrivateKey? = null
    ) : this(TerraAddress.createAccountAddress(publicKey), privateKey, publicKey)

    constructor(privateKey: TerraPrivateKey) : this(privateKey.createPublicKey(), privateKey)

    constructor(publicKey: ByteArray, privateKey: ByteArray? = null) : this(
        TerraPublicKey(publicKey),
        privateKey?.let { TerraPrivateKey(it) },
    )
}
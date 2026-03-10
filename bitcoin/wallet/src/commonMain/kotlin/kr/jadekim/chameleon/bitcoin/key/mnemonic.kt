package kr.jadekim.chameleon.bitcoin.key

import kr.jadekim.chameleon.core.hd.Curve
import kr.jadekim.chameleon.core.hd.KeyPath
import kr.jadekim.chameleon.core.key.BIP44Aware
import kr.jadekim.chameleon.core.key.MnemonicAware
import kr.jadekim.chameleon.core.mnemonic.Mnemonic

open class BitcoinMnemonicKey private constructor(
    override val mnemonic: Mnemonic,
    override val coinType: UInt = COIN_TYPE_MAINNET,
    override val account: UInt = 0u,
    override val change: UInt = CHANGE,
    override val index: UInt = 0u,
    override val password: String? = null,
    privateKey: ByteArray,
) : BIP44Aware, MnemonicAware, BitcoinPrivateKey(privateKey) {

    companion object {
        const val COIN_TYPE_MAINNET = 1u
        const val COIN_TYPE_TESTNET = 1u
        const val CHANGE = 0u

        suspend fun from(
            mnemonic: Mnemonic = Mnemonic.generate(Mnemonic.Strength.WORD_24),
            coinType: UInt = COIN_TYPE_MAINNET,
            account: UInt = 0u,
            change: UInt = CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ): BitcoinMnemonicKey {
            val seed = mnemonic.toSeed(password)
            val privateKey = KeyPath.bip44(coinType, account, change, index).derive(seed, Curve.Secp256k1)

            return BitcoinMnemonicKey(
                mnemonic,
                coinType,
                change,
                account,
                index,
                password,
                privateKey.bytes,
            )
        }
    }
}
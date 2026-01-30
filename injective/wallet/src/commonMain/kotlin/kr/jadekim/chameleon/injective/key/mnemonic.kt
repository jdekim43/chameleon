package kr.jadekim.chameleon.injective.key

import kr.jadekim.chameleon.core.hd.KeyPath
import kr.jadekim.chameleon.core.hd.secp256k1.ExtendedPrivateKey
import kr.jadekim.chameleon.core.hd.secp256k1.HDSecp256k1PrivateKey
import kr.jadekim.chameleon.core.hd.secp256k1.HDSecp256k1PublicKey
import kr.jadekim.chameleon.core.key.BIP44Aware
import kr.jadekim.chameleon.core.key.MnemonicAware
import kr.jadekim.chameleon.core.mnemonic.Mnemonic

open class InjectiveMnemonicKey private constructor(
    override val mnemonic: Mnemonic,
    override val coinType: UInt = COIN_TYPE,
    override val account: UInt = 0u,
    override val change: UInt = CHANGE,
    override val index: UInt = 0u,
    override val password: String? = null,
    privateKey: HDSecp256k1PrivateKey,
    publicKey: HDSecp256k1PublicKey,
) : BIP44Aware, MnemonicAware, InjectiveSecp256k1PrivateKey(privateKey, publicKey) {

    companion object {
        const val COIN_TYPE = 60u
        const val CHANGE = 0u

        suspend fun from(
            mnemonic: Mnemonic = Mnemonic.generate(Mnemonic.Strength.WORD_24),
            coinType: UInt = COIN_TYPE,
            account: UInt = 0u,
            change: UInt = CHANGE,
            index: UInt = 0u,
            password: String? = null,
        ): InjectiveMnemonicKey {
            val seed = mnemonic.toSeed(password)
            val privateKey = ExtendedPrivateKey.from(seed)
                .derive(KeyPath.bip44(coinType, account, change, index))

            return InjectiveMnemonicKey(
                mnemonic,
                coinType,
                change,
                account,
                index,
                password,
                privateKey.privateKey,
                privateKey.publicKey,
            )
        }
    }
}
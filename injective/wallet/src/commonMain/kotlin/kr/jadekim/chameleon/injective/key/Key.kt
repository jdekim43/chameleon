package kr.jadekim.chameleon.injective.key

import kotlinx.coroutines.Deferred
import kr.jadekim.chameleon.core.crypto.*
import kr.jadekim.chameleon.cosmos.key.BaseCosmosMnemonicKey
import kr.jadekim.chameleon.cosmos.key.Ed25519PublicKey
import kr.jadekim.chameleon.cosmos.key.Secp256k1KeyPair
import kr.jadekim.chameleon.cosmos.key.Secp256k1PublicKey
import kr.jadekim.common.extension.toFixed

const val INJECTIVE_KEY_SIZE = 33

internal fun ByteArray.toFixedKeySize() = toFixed(INJECTIVE_KEY_SIZE)

open class InjectivePublicKey(publicKey: ByteArray) : Secp256k1PublicKey {

    override val publicKey: ByteArray = publicKey.toFixedKeySize()

    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        return Bip32.verify(Keccak256.hash(message), publicKey, signature)
    }
}

open class InjectiveKeyPair private constructor(
    override val privateKey: ByteArray,
    override val publicKey: ByteArray,
    unit: Unit, //avoid jvm duplicate signature
) : Secp256k1KeyPair, InjectivePublicKey(publicKey) {

    internal constructor(keyPair: Bip32KeyPair) : this(keyPair.privateKey, keyPair.publicKey)

    constructor(privateKey: ByteArray, publicKey: ByteArray? = null) : this(
        privateKey.toFixedKeySize(),
        publicKey?.toFixedKeySize() ?: Bip32.keyPair(privateKey.toFixedKeySize()).publicKey,
        Unit,
    )

    override fun signSync(message: ByteArray): ByteArray = Bip32.sign(Keccak256.hash(message), privateKey)

    override fun sign(message: ByteArray): Deferred<ByteArray> = super<Secp256k1KeyPair>.sign(message)
}

open class InjectiveMnemonicKey private constructor(
    override val mnemonic: String,
    override val coinType: Int,
    override val account: Int,
    override val index: Int,
    override val passphrase: String?,
    bip32KeyPair: Bip32KeyPair,
) : BaseCosmosMnemonicKey, InjectiveKeyPair(bip32KeyPair) {

    override val change = CHANGE

    constructor(
        mnemonic: String,
        coinType: Int = COIN_TYPE,
        account: Int = 0,
        index: Int = 0,
        passphrase: String? = null,
    ) : this(
        mnemonic,
        coinType,
        account,
        index,
        passphrase,
        Bip32.keyPair(Mnemonic.seedFrom(mnemonic, passphrase), Bip44.hdPath(coinType, account, CHANGE, index)),
    )

    companion object {
        const val COIN_TYPE = 60
        const val CHANGE = 0

        fun create(
            coinType: Int = COIN_TYPE,
            account: Int = 0,
            index: Int = 0,
            passphrase: String? = null,
        ) = InjectiveMnemonicKey(Mnemonic.generate(), coinType, account, index, passphrase)
    }
}

open class InjectiveConsensusPublicKey(override val publicKey: ByteArray) : Ed25519PublicKey {

    @Deprecated("Not yet implemented")
    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        TODO("Not yet implemented")
    }
}

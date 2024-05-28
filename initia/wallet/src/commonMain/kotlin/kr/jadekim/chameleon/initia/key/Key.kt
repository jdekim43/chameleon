package kr.jadekim.chameleon.initia.key

import kotlinx.coroutines.Deferred
import kr.jadekim.chameleon.core.crypto.Bip32
import kr.jadekim.chameleon.core.crypto.Bip32KeyPair
import kr.jadekim.chameleon.core.crypto.Bip44
import kr.jadekim.chameleon.core.crypto.Mnemonic
import kr.jadekim.chameleon.cosmos.key.BaseCosmosMnemonicKey
import kr.jadekim.chameleon.cosmos.key.Ed25519PublicKey
import kr.jadekim.chameleon.cosmos.key.Secp256k1KeyPair
import kr.jadekim.chameleon.cosmos.key.Secp256k1PublicKey
import kr.jadekim.common.extension.toFixed

const val INITIA_KEY_SIZE = 33

internal fun ByteArray.toFixedKeySize() = toFixed(INITIA_KEY_SIZE)

open class InitiaPublicKey(publicKey: ByteArray) : Secp256k1PublicKey {

    override val publicKey: ByteArray = publicKey.toFixedKeySize()
}

open class InitiaKeyPair private constructor(
    override val privateKey: ByteArray,
    override val publicKey: ByteArray,
    unit: Unit, //avoid jvm duplicate signature
) : Secp256k1KeyPair, InitiaPublicKey(publicKey) {

    internal constructor(keyPair: Bip32KeyPair) : this(keyPair.privateKey, keyPair.publicKey)

    constructor(privateKey: ByteArray, publicKey: ByteArray? = null) : this(
        privateKey.toFixedKeySize(),
        publicKey?.toFixedKeySize() ?: Bip32.publicKeyFor(privateKey.toFixedKeySize()),
        Unit,
    )

    override fun sign(message: ByteArray): Deferred<ByteArray> = super<Secp256k1KeyPair>.sign(message)
}

open class InitiaMnemonicKey private constructor(
    override val mnemonic: String,
    override val coinType: Int = 0,
    override val account: Int = 0,
    override val index: Int = 0,
    override val passphrase: String? = null,
    bip32KeyPair: Bip32KeyPair,
) : BaseCosmosMnemonicKey, InitiaKeyPair(bip32KeyPair) {

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
        const val COIN_TYPE = 118
        const val CHANGE = 0

        fun create(
            coinType: Int = COIN_TYPE,
            account: Int = 0,
            index: Int = 0,
            passphrase: String? = null,
        ) = InitiaMnemonicKey(Mnemonic.generate(), coinType, account, index, passphrase)
    }
}

open class InitiaConsensusPublicKey(override val publicKey: ByteArray) : Ed25519PublicKey {

    @Deprecated("Not yet implemented")
    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        TODO("Not yet implemented")
    }
}

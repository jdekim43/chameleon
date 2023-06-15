package kr.jadekim.chameleon.sei.key

import kotlinx.coroutines.Deferred
import kr.jadekim.chameleon.core.crypto.Bip32
import kr.jadekim.chameleon.core.crypto.Bip32KeyPair
import kr.jadekim.chameleon.core.crypto.Bip44
import kr.jadekim.chameleon.core.crypto.Mnemonic
import kr.jadekim.chameleon.cosmos.key.BaseCosmosKeyPair
import kr.jadekim.chameleon.cosmos.key.BaseCosmosMnemonicKey
import kr.jadekim.chameleon.cosmos.key.BaseCosmosPublicKey
import kr.jadekim.common.extension.toFixed

const val SEI_KEY_SIZE = 33

internal fun ByteArray.toFixedKeySize() = toFixed(SEI_KEY_SIZE)

open class SeiPublicKey(publicKey: ByteArray) : BaseCosmosPublicKey {

    override val publicKey: ByteArray = publicKey.toFixedKeySize()
}

open class SeiKeyPair private constructor(
    override val privateKey: ByteArray,
    override val publicKey: ByteArray,
    unit: Unit, //avoid jvm duplicate signature
) : BaseCosmosKeyPair, SeiPublicKey(publicKey) {

    internal constructor(keyPair: Bip32KeyPair) : this(keyPair.privateKey, keyPair.publicKey)

    constructor(privateKey: ByteArray, publicKey: ByteArray? = null) : this(
        privateKey.toFixedKeySize(),
        publicKey?.toFixedKeySize() ?: Bip32.publicKeyFor(privateKey.toFixedKeySize()),
        Unit,
    )

    override fun sign(message: ByteArray): Deferred<ByteArray> = super<BaseCosmosKeyPair>.sign(message)
}

open class SeiMnemonicKey private constructor(
    override val mnemonic: String,
    override val index: Int = 0,
    override val passphrase: String? = null,
    bip32KeyPair: Bip32KeyPair,
) : BaseCosmosMnemonicKey, SeiKeyPair(bip32KeyPair) {

    override val coinType = COIN_TYPE
    override val account = ACCOUNT
    override val change = CHANGE

    constructor(
        mnemonic: String,
        index: Int = 0,
        passphrase: String? = null,
    ) : this(
        mnemonic,
        index,
        passphrase,
        Bip32.keyPair(Mnemonic.seedFrom(mnemonic, passphrase), Bip44.hdPath(COIN_TYPE, ACCOUNT, CHANGE, index)),
    )

    companion object {
        const val COIN_TYPE = 118
        const val ACCOUNT = 0
        const val CHANGE = 0

        fun create(
            index: Int = 0,
            passphrase: String? = null,
        ) = SeiMnemonicKey(Mnemonic.generate(), index, passphrase)
    }
}

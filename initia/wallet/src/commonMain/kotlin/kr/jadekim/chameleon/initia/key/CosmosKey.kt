package kr.jadekim.chameleon.initia.key

import kotlinx.coroutines.Deferred
import kr.jadekim.chameleon.core.crypto.Bip32
import kr.jadekim.chameleon.core.crypto.Bip32KeyPair
import kr.jadekim.chameleon.core.crypto.Bip44
import kr.jadekim.chameleon.core.crypto.Mnemonic
import kr.jadekim.chameleon.cosmos.key.BaseCosmosMnemonicKey
import kr.jadekim.chameleon.cosmos.key.Secp256k1KeyPair
import kr.jadekim.chameleon.cosmos.key.Secp256k1PublicKey
import kr.jadekim.common.extension.toFixed

const val INITIA_COSMOS_KEY_SIZE = 33

internal fun ByteArray.toFixedCosmosKeySize() = toFixed(INITIA_COSMOS_KEY_SIZE)

open class InitiaCosmosPublicKey(publicKey: ByteArray) : Secp256k1PublicKey {

    override val publicKey: ByteArray = publicKey.toFixedCosmosKeySize()
}

open class InitiaCosmosKeyPair private constructor(
    override val privateKey: ByteArray,
    override val publicKey: ByteArray,
    unit: Unit, //avoid jvm duplicate signature
) : Secp256k1KeyPair, InitiaCosmosPublicKey(publicKey) {

    internal constructor(keyPair: Bip32KeyPair) : this(keyPair.privateKey, keyPair.publicKey)

    constructor(privateKey: ByteArray, publicKey: ByteArray? = null) : this(
        privateKey.toFixedCosmosKeySize(),
        publicKey?.toFixedCosmosKeySize() ?: Bip32.keyPair(privateKey.toFixedCosmosKeySize()).publicKey,
        Unit,
    )

    override fun sign(message: ByteArray): Deferred<ByteArray> = super<Secp256k1KeyPair>.sign(message)
}

open class InitiaCosmosMnemonicKey private constructor(
    override val mnemonic: String,
    override val coinType: Int,
    override val account: Int,
    override val index: Int,
    override val passphrase: String?,
    bip32KeyPair: Bip32KeyPair,
) : BaseCosmosMnemonicKey, InitiaCosmosKeyPair(bip32KeyPair) {

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
        ) = InitiaCosmosMnemonicKey(Mnemonic.generate(), coinType, account, index, passphrase)
    }
}

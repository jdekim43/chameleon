package kr.jadekim.chameleon.terra.key

import kotlinx.coroutines.Deferred
import kr.jadekim.chameleon.core.crypto.Bip32
import kr.jadekim.chameleon.core.crypto.Bip32KeyPair
import kr.jadekim.chameleon.core.crypto.Bip44
import kr.jadekim.chameleon.core.crypto.Mnemonic
import kr.jadekim.chameleon.cosmos.key.Secp256k1KeyPair
import kr.jadekim.chameleon.cosmos.key.BaseCosmosMnemonicKey
import kr.jadekim.chameleon.cosmos.key.Ed25519PublicKey
import kr.jadekim.chameleon.cosmos.key.Secp256k1PublicKey
import kr.jadekim.common.extension.toFixed

const val TERRA_KEY_SIZE = 33

internal fun ByteArray.toFixedKeySize() = toFixed(TERRA_KEY_SIZE)

open class TerraPublicKey(publicKey: ByteArray) : Secp256k1PublicKey {

    override val publicKey: ByteArray = publicKey.toFixedKeySize()
}

open class TerraKeyPair private constructor(
    override val privateKey: ByteArray,
    override val publicKey: ByteArray,
    unit: Unit, //avoid jvm duplicate signature
) : Secp256k1KeyPair, TerraPublicKey(publicKey) {

    internal constructor(keyPair: Bip32KeyPair) : this(keyPair.privateKey, keyPair.publicKey)

    constructor(privateKey: ByteArray, publicKey: ByteArray? = null) : this(
        privateKey.toFixedKeySize(),
        publicKey?.toFixedKeySize() ?: Bip32.keyPair(privateKey.toFixedKeySize()).publicKey,
        Unit,
    )

    override fun sign(message: ByteArray): Deferred<ByteArray> = super<Secp256k1KeyPair>.sign(message)
}

open class TerraMnemonicKey private constructor(
    override val mnemonic: String,
    override val index: Int = 0,
    override val passphrase: String? = null,
    bip32KeyPair: Bip32KeyPair,
) : BaseCosmosMnemonicKey, TerraKeyPair(bip32KeyPair) {

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
        const val COIN_TYPE = 330
        const val ACCOUNT = 0
        const val CHANGE = 0

        fun create(
            index: Int = 0,
            passphrase: String? = null,
        ) = TerraMnemonicKey(Mnemonic.generate(), index, passphrase)
    }
}

open class TerraConsensusPublicKey(override val publicKey: ByteArray) : Ed25519PublicKey {

    @Deprecated("Not yet implemented")
    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        TODO("Not yet implemented")
    }
}

package kr.jadekim.chameleon.cosmos.key

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Deferred
import kr.jadekim.chameleon.core.crypto.Bip32
import kr.jadekim.chameleon.core.crypto.Bip32KeyPair
import kr.jadekim.chameleon.core.crypto.Bip44
import kr.jadekim.chameleon.core.crypto.Mnemonic
import kr.jadekim.chameleon.core.key.KeyPair
import kr.jadekim.chameleon.core.key.MnemonicKey
import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.common.encoder.decodeBase64
import kr.jadekim.common.extension.toFixed
import kr.jadekim.common.extension.utf8
import kr.jadekim.common.hash.SHA_256

const val COSMOS_KEY_SIZE = 33

internal fun ByteArray.toFixedKeySize() = toFixed(COSMOS_KEY_SIZE)

interface BaseCosmosPublicKey : PublicKey {

    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        return Bip32.verify(SHA_256.hash(message), publicKey, signature)
    }
}

open class CosmosPublicKey(publicKey: ByteArray) : BaseCosmosPublicKey {

    companion object {

        @JvmStatic
        fun recoverFromSignature(message: ByteArray, signature: ByteArray) = CosmosPublicKey(
            Bip32.recoverPublicKey(SHA_256.hash(message), signature),
        )

        @JvmStatic
        fun recoverFromSignature(message: String, signature: ByteArray) =
            recoverFromSignature(message.utf8(), signature)

        @JvmStatic
        fun recoverFromSignature(message: ByteArray, signature: String) =
            recoverFromSignature(message, signature.decodeBase64())

        @JvmStatic
        fun recoverFromSignature(message: String, signature: String) =
            recoverFromSignature(message.utf8(), signature.decodeBase64())
    }

    override val publicKey: ByteArray = publicKey.toFixedKeySize()
}

interface BaseCosmosKeyPair : KeyPair, BaseCosmosPublicKey {

    fun signSync(message: ByteArray): ByteArray = Bip32.sign(SHA_256.hash(message), privateKey)

    fun signSync(message: String): ByteArray = signSync(message.utf8())

    override fun sign(message: ByteArray): Deferred<ByteArray> = CompletableDeferred(signSync(message))
}

open class CosmosKeyPair private constructor(
    override val privateKey: ByteArray,
    override val publicKey: ByteArray,
    unit: Unit, //avoid jvm duplicate signature
) : BaseCosmosKeyPair, CosmosPublicKey(publicKey) {

    internal constructor(keyPair: Bip32KeyPair) : this(keyPair.privateKey, keyPair.publicKey)

    constructor(privateKey: ByteArray, publicKey: ByteArray? = null) : this(
        privateKey.toFixedKeySize(),
        publicKey?.toFixedKeySize() ?: Bip32.publicKeyFor(privateKey.toFixedKeySize()),
        Unit,
    )

    override fun sign(message: ByteArray): Deferred<ByteArray> = super<BaseCosmosKeyPair>.sign(message)
}

interface BaseCosmosMnemonicKey : MnemonicKey, BaseCosmosKeyPair {
    val coinType: Int
    val account: Int
    val change: Int
    val index: Int
}

open class CosmosMnemonicKey private constructor(
    override val mnemonic: String,
    override val index: Int = 0,
    override val passphrase: String? = null,
    bip32KeyPair: Bip32KeyPair,
) : BaseCosmosMnemonicKey, CosmosKeyPair(bip32KeyPair) {

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
        ) = CosmosMnemonicKey(Mnemonic.generate(), index, passphrase)
    }
}

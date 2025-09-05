package kr.jadekim.chameleon.initia.key

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Deferred
import kr.jadekim.chameleon.core.crypto.*
import kr.jadekim.chameleon.core.key.BIP44MnemonicKey
import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.core.key.KeyPair
import kr.jadekim.chameleon.cosmos.key.truncateAsCosmosKeySize
import kr.jadekim.common.extension.utf8

open class InitiaEtherSecp256k1PublicKey(publicKey: ByteArray) : Key {

    override val publicKey: ByteArray = publicKey.truncateAsCosmosKeySize()

    override val address: ByteArray
        get() {
            val uncompressedPublicKey = Bip32.decompressPublicKey(publicKey)
            val hashed = Keccak256.hash(uncompressedPublicKey.sliceArray(1 until uncompressedPublicKey.size))

            return hashed.sliceArray(hashed.size - 20 until hashed.size)
        }

    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        return Bip32.verify(Keccak256.hash(message), publicKey, signature)
    }
}

open class InitiaEtherSecp256k1KeyPair private constructor(
    privateKey: ByteArray,
    publicKey: ByteArray,
    unit: Unit, //avoid jvm duplicate signature
) : KeyPair, InitiaEtherSecp256k1PublicKey(publicKey) {

    override val privateKey: ByteArray = privateKey.truncateAsCosmosKeySize()

    constructor(
        privateKey: ByteArray,
        publicKey: ByteArray? = null,
    ) : this(privateKey, publicKey ?: Bip32.keyPair(privateKey.truncateAsCosmosKeySize()).publicKey, Unit)

    constructor(keyPair: Bip32KeyPair) : this(keyPair.privateKey, keyPair.publicKey)

    fun signSync(message: ByteArray): ByteArray = Bip32.sign(Keccak256.hash(message), privateKey)

    fun signSync(message: String): ByteArray = signSync(message.utf8())

    override fun sign(message: ByteArray): Deferred<ByteArray> = CompletableDeferred(signSync(message))
}

open class InitiaEtherMnemonicKey private constructor(
    override val mnemonic: String,
    override val coinType: Int = COIN_TYPE,
    override val account: Int = 0,
    override val index: Int = 0,
    override val passphrase: String? = null,
    bip32KeyPair: Bip32KeyPair,
) : BIP44MnemonicKey, InitiaEtherSecp256k1KeyPair(bip32KeyPair) {

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
        ) = InitiaEtherMnemonicKey(Mnemonic.generate(), coinType, account, index, passphrase)
    }
}


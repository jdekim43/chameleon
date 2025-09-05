package kr.jadekim.chameleon.initia.key

import kr.jadekim.chameleon.core.crypto.Bip32
import kr.jadekim.chameleon.core.crypto.Bip32KeyPair
import kr.jadekim.chameleon.core.crypto.Bip44
import kr.jadekim.chameleon.core.crypto.Mnemonic
import kr.jadekim.chameleon.core.key.BIP44MnemonicKey
import kr.jadekim.chameleon.cosmos.key.Ed25519PublicKey
import kr.jadekim.chameleon.cosmos.key.Secp256k1KeyPair
import kr.jadekim.chameleon.cosmos.key.Secp256k1PublicKey
import kr.jadekim.chameleon.cosmos.key.truncateAsCosmosKeySize

open class InitiaCosmosSecp256k1PublicKey(publicKey: ByteArray) : Secp256k1PublicKey {

    override val publicKey: ByteArray = publicKey.truncateAsCosmosKeySize()
}

open class InitiaCosmosSecp256k1KeyPair(
    privateKey: ByteArray,
    publicKey: ByteArray,
    unit: Unit, //avoid jvm duplicate signature
) : Secp256k1KeyPair, InitiaCosmosSecp256k1PublicKey(publicKey) {

    override val privateKey: ByteArray = privateKey.truncateAsCosmosKeySize()

    constructor(
        privateKey: ByteArray,
        publicKey: ByteArray? = null,
    ) : this(privateKey, publicKey ?: Bip32.keyPair(privateKey.truncateAsCosmosKeySize()).publicKey, Unit)

    internal constructor(keyPair: Bip32KeyPair) : this(keyPair.privateKey, keyPair.publicKey)
}

open class InitiaCosmosMnemonicKey private constructor(
    override val mnemonic: String,
    override val coinType: Int = COIN_TYPE,
    override val account: Int = 0,
    override val index: Int = 0,
    override val passphrase: String? = null,
    bip32KeyPair: Bip32KeyPair,
) : BIP44MnemonicKey, InitiaCosmosSecp256k1KeyPair(bip32KeyPair) {

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

open class InitiaEd25519PublicKey(override val publicKey: ByteArray) : Ed25519PublicKey

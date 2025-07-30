package kr.jadekim.chameleon.initia.key

import kotlinx.coroutines.Deferred
import kr.jadekim.chameleon.core.crypto.*
import kr.jadekim.chameleon.cosmos.key.BaseCosmosMnemonicKey
import kr.jadekim.chameleon.cosmos.key.Secp256k1KeyPair
import kr.jadekim.chameleon.cosmos.key.Secp256k1PublicKey
import kr.jadekim.common.extension.toFixed

const val INITIA_ETH_KEY_SIZE = 33

internal fun ByteArray.toFixedEthKeySize() = toFixed(INITIA_ETH_KEY_SIZE)

open class InitiaEthPublicKey(publicKey: ByteArray) : Secp256k1PublicKey, InitiaPublicKey {

    override val publicKey: ByteArray = publicKey.toFixedEthKeySize()

    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        return Bip32.verify(Keccak256.hash(message), publicKey, signature)
    }
}

open class InitiaEthKeyPair private constructor(
    override val privateKey: ByteArray,
    override val publicKey: ByteArray,
    unit: Unit, //avoid jvm duplicate signature
) : Secp256k1KeyPair, InitiaEthPublicKey(publicKey), InitiaKeyPair {

    internal constructor(keyPair: Bip32KeyPair) : this(keyPair.privateKey, keyPair.publicKey)

    constructor(privateKey: ByteArray, publicKey: ByteArray? = null) : this(
        privateKey.toFixedEthKeySize(),
        publicKey?.toFixedEthKeySize() ?: Bip32.keyPair(privateKey.toFixedEthKeySize()).publicKey,
        Unit,
    )

    override fun signSync(message: ByteArray): ByteArray = Bip32.sign(Keccak256.hash(message), privateKey)

    override fun sign(message: ByteArray): Deferred<ByteArray> = super<Secp256k1KeyPair>.sign(message)
}

open class InitiaEthMnemonicKey private constructor(
    override val mnemonic: String,
    override val coinType: Int,
    override val account: Int,
    override val index: Int,
    override val passphrase: String?,
    bip32KeyPair: Bip32KeyPair,
) : BaseCosmosMnemonicKey, InitiaEthKeyPair(bip32KeyPair), InitiaMnemonicKey {

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
        ) = InitiaEthMnemonicKey(Mnemonic.generate(), coinType, account, index, passphrase)
    }
}


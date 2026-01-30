package kr.jadekim.chameleon.terra.key

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Deferred
import kr.jadekim.chameleon.core.hd.secp256k1.HDSecp256k1PrivateKey
import kr.jadekim.chameleon.core.hd.secp256k1.HDSecp256k1PublicKey
import kr.jadekim.chameleon.core.key.KeyPair
import kr.jadekim.chameleon.core.key.PrivateKey
import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.common.crypto.hash.SHA_256
import kr.jadekim.common.crypto.hash.hash
import kr.jadekim.common.extension.utf8

open class TerraSecp256k1PublicKey(private val hdPublicKey: HDSecp256k1PublicKey) : PublicKey {

    constructor(publicKey: ByteArray) : this(HDSecp256k1PublicKey(publicKey))

    override val publicKey: ByteArray = hdPublicKey.compressed

    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        return hdPublicKey.verify(message.hash(SHA_256), signature)
    }

    override fun toAddressBytes(): ByteArray = hdPublicKey.hash160
}

open class TerraSecp256k1PrivateKey(
    private val hdPrivateKey: HDSecp256k1PrivateKey,
    hdPublicKey: HDSecp256k1PublicKey? = null,
) : KeyPair,
    PrivateKey,
    TerraSecp256k1PublicKey(hdPublicKey ?: hdPrivateKey.createPublicKey()) {

    constructor(
        privateKey: ByteArray,
        publicKey: ByteArray? = null,
    ) : this(HDSecp256k1PrivateKey(privateKey), publicKey?.let { HDSecp256k1PublicKey(it) })

    init {
        //todo: check public key and private key are paired correctly.
    }

    override val privateKey: ByteArray = hdPrivateKey.uncompressed

    fun signSync(message: ByteArray) = hdPrivateKey.signSync(message.hash(SHA_256))

    fun signSync(message: String): ByteArray = signSync(message.utf8())

    override fun sign(message: ByteArray): Deferred<ByteArray> = CompletableDeferred(signSync(message))
}

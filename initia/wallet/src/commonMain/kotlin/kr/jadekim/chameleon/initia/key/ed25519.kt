package kr.jadekim.chameleon.initia.key

import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.common.crypto.hash.SHA_256
import kr.jadekim.common.crypto.hash.hash

private const val ADDRESS_TRUNCATE_LENGTH = 20

open class InitiaEd25519PublicKey(override val publicKey: ByteArray) : PublicKey {

    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        TODO("Not yet implemented")
    }

    override fun toAddressBytes(): ByteArray = publicKey.hash(SHA_256)
        .sliceArray(0 until ADDRESS_TRUNCATE_LENGTH)
}
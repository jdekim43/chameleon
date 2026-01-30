package kr.jadekim.chameleon.injective.key

import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.common.crypto.hash.SHA_256
import kr.jadekim.common.crypto.hash.hash

private const val ADDRESS_TRUNCATE_LENGTH = 20

open class InjectiveEd25519PublicKey(override val publicKey: ByteArray) : PublicKey {

    override fun verify(message: ByteArray, signature: ByteArray): Boolean {
        TODO("Not yet implemented")
    }

    override fun toAddressBytes(): ByteArray = publicKey.hash(SHA_256)
        .sliceArray(0 until ADDRESS_TRUNCATE_LENGTH)
}
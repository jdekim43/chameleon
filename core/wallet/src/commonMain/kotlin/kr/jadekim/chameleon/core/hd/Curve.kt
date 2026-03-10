package kr.jadekim.chameleon.core.hd

import kr.jadekim.chameleon.core.hd.Curve.ECDSA.Companion.PRIVATE_KEY_SIZE
import kr.jadekim.chameleon.core.hd.ed25519.HDEd25519PrivateKey
import kr.jadekim.chameleon.core.hd.secp256k1.HDSecp256k1PrivateKey
import kr.jadekim.chameleon.core.hd.secp256k1.HDSecp256k1PublicKey
import kr.jadekim.chameleon.core.hd.secp256r1.HDSecp256r1PrivateKey
import kr.jadekim.chameleon.core.hd.secp256r1.HDSecp256r1PublicKey
import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.core.key.PrivateKey
import kr.jadekim.chameleon.core.key.PublicKey
import kr.jadekim.common.crypto.mac.HMAC_SHA_512
import kr.jadekim.common.crypto.mac.hash
import kr.jadekim.common.extension.utf8
import kr.jadekim.common.extension.write

interface Curve<P : PrivateKey> {

    fun from(seed: ByteArray): ExtendedKey<P>

    fun <K : Key> derive(extendedKey: ExtendedKey<K>, index: UInt): ExtendedKey<K>

    object Secp256k1 : ECDSA<HDSecp256k1PrivateKey>() {

        override fun from(seed: ByteArray): ExtendedKey<HDSecp256k1PrivateKey> {
            if (seed.size < 16) {
                throw IllegalArgumentException("Seed should be at least 128 bits")
            }
            if (seed.size > 64) {
                throw IllegalArgumentException("Seed should be at most 512 bits")
            }

            val I = seed.hash(HMAC_SHA_512, "Bitcoin seed".utf8())
            val IL = I.sliceArray(0 until HDSecp256k1PrivateKey.BYTE_SIZE_UNCOMPRESSED)
            val IR = I.sliceArray(HDSecp256k1PrivateKey.BYTE_SIZE_UNCOMPRESSED until I.size)

            return ExtendedKey(HDSecp256k1PrivateKey(IL), IR, 0u, KeyPath.EMPTY, 0u)
        }

        override fun <K : Key> tweak(sourceKey: K, IL: ByteArray): K {
            var newPrivateKey = HDSecp256k1PrivateKey(IL)
            require(newPrivateKey.isValid()) { "cannot generate child private key: IL is invalid" }

            when (sourceKey) {
                is HDSecp256k1PrivateKey -> {
                    newPrivateKey += sourceKey
                    require(newPrivateKey.isValid()) { "cannot generate child private key: resulting private key is invalid" }

                    return newPrivateKey as K
                }

                is HDSecp256k1PublicKey -> {
                    val newPrivateKey = HDSecp256k1PrivateKey(IL)
                    require(newPrivateKey.isValid()) { "cannot generate child public key: IL is invalid" }

                    val newPublicKey = newPrivateKey.createPublicKey() + sourceKey
                    require(newPublicKey.isValid()) { "cannot generate child public key: resulting public key is invalid" }

                    return newPublicKey as K
                }

                else -> throw IllegalArgumentException("Not supported key type")
            }
        }
    }

    object Secp256r1 : ECDSA<HDSecp256r1PrivateKey>() {

        override fun from(seed: ByteArray): ExtendedKey<HDSecp256r1PrivateKey> {
            if (seed.size < 16) {
                throw IllegalArgumentException("Seed should be at least 128 bits")
            }
            if (seed.size > 64) {
                throw IllegalArgumentException("Seed should be at most 512 bits")
            }

            val I = seed.hash(HMAC_SHA_512, "Nist256p1 seed".utf8())
            val IL = I.sliceArray(0 until HDSecp256r1PrivateKey.BYTE_SIZE_UNCOMPRESSED)
            val IR = I.sliceArray(HDSecp256r1PrivateKey.BYTE_SIZE_UNCOMPRESSED until I.size)

            return ExtendedKey(HDSecp256r1PrivateKey(IL), IR, 0u, KeyPath.EMPTY, 0u)
        }

        override fun <K : Key> tweak(sourceKey: K, IL: ByteArray): K {
            var newPrivateKey = HDSecp256r1PrivateKey(IL)
            require(newPrivateKey.isValid()) { "cannot generate child private key: IL is invalid" }

            when (sourceKey) {
                is HDSecp256r1PrivateKey -> {
                    newPrivateKey += sourceKey
                    require(newPrivateKey.isValid()) { "cannot generate child private key: resulting private key is invalid" }

                    return newPrivateKey as K
                }

                is HDSecp256r1PublicKey -> {
                    val newPrivateKey = HDSecp256r1PrivateKey(IL)
                    require(newPrivateKey.isValid()) { "cannot generate child public key: IL is invalid" }

                    val newPublicKey = newPrivateKey.createPublicKey() + sourceKey
                    require(newPublicKey.isValid()) { "cannot generate child public key: resulting public key is invalid" }

                    return newPublicKey as K
                }

                else -> throw IllegalArgumentException("Not supported key type")
            }
        }
    }

    object Ed25519 : EdDSA<HDEd25519PrivateKey>() {

        override fun from(seed: ByteArray): ExtendedKey<HDEd25519PrivateKey> {
            if (seed.size < 16) {
                throw IllegalArgumentException("Seed should be at least 128 bits")
            }
            if (seed.size > 64) {
                throw IllegalArgumentException("Seed should be at most 512 bits")
            }

            val I = seed.hash(HMAC_SHA_512, "ed25519 seed".utf8())
            val IL = I.sliceArray(0 until HDEd25519PrivateKey.BYTE_SIZE_SEED)
            val IR = I.sliceArray(HDEd25519PrivateKey.BYTE_SIZE_SEED until I.size)

            return ExtendedKey(HDEd25519PrivateKey(IL), IR, 0u, KeyPath.EMPTY, 0u)
        }

        override fun newPrivateKey(bytes: ByteArray): HDEd25519PrivateKey = HDEd25519PrivateKey(bytes)
    }

    abstract class ECDSA<P : PrivateKey> : Curve<P> {

        companion object {
            const val PRIVATE_KEY_SIZE = 32
        }

        protected abstract fun <K : Key> tweak(sourceKey: K, IL: ByteArray): K

        override fun <K : Key> derive(extendedKey: ExtendedKey<K>, index: UInt): ExtendedKey<K> {
            val data = ByteArray(37).apply {
                if (index.isHardened) {
                    val privateKey = extendedKey.key as? PrivateKey
                        ?: throw IllegalArgumentException("Cannot derive hardened key from non-private key")

                    write(0, 0.toByte())
                    write(1, privateKey.bytes)
                    write(33, index)
                } else {
                    val publicKey = when (extendedKey.key) {
                        is PrivateKey -> extendedKey.key.createPublicKey()
                        is PublicKey -> extendedKey.key
                        else -> throw IllegalArgumentException("Can derive only non-hardened key from public key")
                    }

                    write(0, publicKey.bytes)
                    write(33, index)
                }
            }

            val I = data.hash(HMAC_SHA_512, extendedKey.chainCode)
            val IL = I.sliceArray(0 until PRIVATE_KEY_SIZE)
            val IR = I.sliceArray(PRIVATE_KEY_SIZE until I.size)

            val newPrivateKey = tweak(extendedKey.key, IL)

            return ExtendedKey(
                newPrivateKey,
                IR,
                extendedKey.depth.inc(),
                extendedKey.path + index,
                extendedKey.fingerprint,
            )
        }
    }

    abstract class EdDSA<P : PrivateKey> : Curve<P> {

        abstract fun newPrivateKey(bytes: ByteArray): P

        @Suppress("UNCHECKED_CAST")
        override fun <K : Key> derive(
            extendedKey: ExtendedKey<K>,
            index: UInt
        ): ExtendedKey<K> {
            if (!index.isHardened) {
                throw IllegalArgumentException("Unhardened paths not supported for Ed25519")
            }
            val privateKey = extendedKey.key as? PrivateKey
                ?: throw IllegalArgumentException("Cannot derive hardened key from non-private key")

            val data = ByteArray(37).apply {
                write(0, 0.toByte())
                write(1, privateKey.bytes)
                write(33, index)
            }

            val I = data.hash(HMAC_SHA_512, extendedKey.chainCode)
            val IL = I.sliceArray(0 until PRIVATE_KEY_SIZE)
            val IR = I.sliceArray(PRIVATE_KEY_SIZE until I.size)

            val newPrivateKey = newPrivateKey(IL) as K

            return ExtendedKey(
                newPrivateKey,
                IR,
                extendedKey.depth.inc(),
                extendedKey.path + index,
                extendedKey.fingerprint,
            )
        }
    }
}

package kr.jadekim.chameleon.core.hd.secp256k1

import kr.jadekim.chameleon.core.hd.KeyPath
import kr.jadekim.chameleon.core.hd.isHardened
import kr.jadekim.chameleon.core.wif.WalletImportFormat
import kr.jadekim.common.crypto.mac.HMAC_SHA_512
import kr.jadekim.common.crypto.mac.hash
import kr.jadekim.common.encoder.Base58WithChecksum
import kr.jadekim.common.encoder.decode
import kr.jadekim.common.encoder.encode
import kr.jadekim.common.extension.toUIntWithinBigEndian
import kr.jadekim.common.extension.utf8
import kr.jadekim.common.extension.write

internal data class ExtendedPrivateKey(
    val privateKey: HDSecp256k1PrivateKey,
    val chainCode: ByteArray,
    val depth: UByte,
    val path: KeyPath,
    val parentFingerprint: UInt
) {

    companion object {
        fun from(seed: ByteArray): ExtendedPrivateKey {
            if (seed.size < 16) {
                throw IllegalArgumentException("Seed should be at least 128 bits")
            }
            if (seed.size > 64) {
                throw IllegalArgumentException("Seed should be at most 512 bits")
            }

            val I = seed.hash(HMAC_SHA_512, "Bitcoin seed".utf8())
            val IL = I.sliceArray(0 until 32)
            val IR = I.sliceArray(32 until I.size)

            return ExtendedPrivateKey(HDSecp256k1PrivateKey(IL), IR, 0u, KeyPath.Companion.EMPTY, 0u)
        }

        fun fromBase58(
            input: String,
            checkVersion: (UInt) -> Boolean,
            parentPath: KeyPath = KeyPath.Companion.EMPTY
        ): Pair<UInt, ExtendedPrivateKey> {
            val decoded = input.decode(Base58WithChecksum)
            if (decoded.size != 78) {
                throw IllegalArgumentException("Invalid length")
            }

            val version = decoded.sliceArray(0 until 4).toUIntWithinBigEndian()
            require(checkVersion(version)) { "Invalid network version" }

            val depth = decoded[4].toUByte()

            val parentFingerprint = decoded.sliceArray(5 until 9).toUIntWithinBigEndian()
            if (depth == 0.toUByte() && parentFingerprint != 0x00000000u) {
                throw IllegalArgumentException("Invalid parent fingerprint")
            }

            val index = decoded.sliceArray(9 until 13).toUIntWithinBigEndian()
            if (depth == 0.toUByte() && index != 0u) {
                throw IllegalArgumentException("Invalid index")
            }

            val chainCode = decoded.sliceArray(13 until 45)

            if (decoded[45] != 0x0.toByte()) {
                throw IllegalArgumentException("Invalid private key")
            }

            val privateKey = decoded.sliceArray(46 until 78)

            return version to ExtendedPrivateKey(
                HDSecp256k1PrivateKey(privateKey),
                chainCode,
                depth,
                parentPath + index,
                parentFingerprint,
            )
        }
    }

    val index = path.last()

    val publicKey = privateKey.createPublicKey()
    val extendedPublicKey = ExtendedPublicKey(publicKey, chainCode, depth, path, parentFingerprint)

    val fingerprint: UInt by lazy { extendedPublicKey.fingerprint }

    init {
        require(privateKey.isValid()) { "Invalid private key" }
        require(depth != 0.toUByte() || parentFingerprint == 0u) { "zero depth with non-zero parent fingerprint" }
        require(depth != 0.toUByte() || index == 0u) { "zero depth with non-zero child number" }
    }

    fun derive(index: UInt): ExtendedPrivateKey {
        val data = ByteArray(37).apply {
            if (index.isHardened) {
                write(0, 0.toByte())
                write(1, privateKey.uncompressed)
                write(33, index)
            } else {
                write(0, publicKey.compressed)
                write(33, index)
            }
        }

        val I = data.hash(HMAC_SHA_512, chainCode)
        val IL = I.sliceArray(0 until 32)
        val IR = I.sliceArray(32 until I.size)

        var newPrivateKey = HDSecp256k1PrivateKey(IL)
        require(newPrivateKey.isValid()) { "cannot generate child private key: IL is invalid" }

        newPrivateKey += privateKey
        require(newPrivateKey.isValid()) { "cannot generate child private key: resulting private key is invalid" }

        return ExtendedPrivateKey(newPrivateKey, IR, depth.inc(), path + index, fingerprint)
    }

    fun derive(path: List<UInt>): ExtendedPrivateKey = path.fold(this) { acc, index -> acc.derive(index) }

    fun derive(path: KeyPath): ExtendedPrivateKey = derive(path.path)

    fun derive(path: String): ExtendedPrivateKey = derive(KeyPath(path))

    fun toBase58(version: UInt): String = ByteArray(78).apply {
        write(0, version)
        write(4, depth)
        write(5, parentFingerprint)
        write(9, index)
        write(13, chainCode)
        write(45, 0)
        write(46, privateKey.uncompressed)
    }.encode(Base58WithChecksum)

    fun toWIF(version: UByte): String = WalletImportFormat(version, privateKey.uncompressed, true).toString()

    override fun toString(): String = "<extended_private_key>"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ExtendedPrivateKey

        if (privateKey != other.privateKey) return false
        if (!chainCode.contentEquals(other.chainCode)) return false
        if (depth != other.depth) return false
        if (path != other.path) return false
        if (parentFingerprint != other.parentFingerprint) return false

        return true
    }

    override fun hashCode(): Int {
        var result = privateKey.hashCode()
        result = 31 * result + chainCode.contentHashCode()
        result = 31 * result + depth.hashCode()
        result = 31 * result + path.hashCode()
        result = 31 * result + parentFingerprint.hashCode()
        return result
    }
}
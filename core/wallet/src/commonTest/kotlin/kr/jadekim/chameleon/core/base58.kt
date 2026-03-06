package kr.jadekim.chameleon.core

import kr.jadekim.chameleon.core.hd.ExtendedKey
import kr.jadekim.chameleon.core.hd.KeyPath
import kr.jadekim.chameleon.core.hd.secp256k1.HDSecp256k1PrivateKey
import kr.jadekim.chameleon.core.hd.secp256k1.HDSecp256k1PublicKey
import kr.jadekim.common.encoder.Base58WithChecksum
import kr.jadekim.common.encoder.decode
import kr.jadekim.common.encoder.encode
import kr.jadekim.common.extension.toUIntWithinBigEndian
import kr.jadekim.common.extension.write

fun ExtendedKey<HDSecp256k1PrivateKey>.toBase58PrivateKey(version: UInt): String = ByteArray(78).apply {
    write(0, version)
    write(4, depth)
    write(5, parentFingerprint)
    write(9, index)
    write(13, chainCode)
    write(45, 0)
    write(46, key.uncompressed)
}.encode(Base58WithChecksum)

fun ExtendedKey<HDSecp256k1PublicKey>.toBase58PublicKey(version: UInt): String = ByteArray(78).apply {
    write(0, version)
    write(4, depth)
    write(5, parentFingerprint)
    write(9, index)
    write(13, chainCode)
    write(45, key.compressed)
}.encode(Base58WithChecksum)

fun privateKeyFromBase58(
    input: String,
    checkVersion: (UInt) -> Boolean,
    parentPath: KeyPath = KeyPath.Companion.EMPTY
): Pair<UInt, ExtendedKey<HDSecp256k1PrivateKey>> {
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

    return version to ExtendedKey(
        HDSecp256k1PrivateKey(privateKey),
        chainCode,
        depth,
        parentPath + index,
        parentFingerprint,
    )
}

fun publicKeyFromBase58(
    input: String,
    checkVersion: (UInt) -> Boolean,
    parentPath: KeyPath = KeyPath.Companion.EMPTY
): Pair<UInt, ExtendedKey<HDSecp256k1PublicKey>> {
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

    val publicKey = decoded.sliceArray(45 until 78)

    return version to ExtendedKey(
        HDSecp256k1PublicKey(publicKey),
        chainCode,
        depth,
        parentPath + index,
        parentFingerprint,
    )
}

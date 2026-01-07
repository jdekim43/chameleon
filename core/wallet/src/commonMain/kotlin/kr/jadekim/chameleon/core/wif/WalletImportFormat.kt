package kr.jadekim.chameleon.core.wif

import kr.jadekim.common.encoder.Base58WithChecksum
import kr.jadekim.common.encoder.decode
import kr.jadekim.common.encoder.encode
import kr.jadekim.common.extension.write

data class WalletImportFormat(
    val version: UByte,
    val privateKey: ByteArray,
    val compressed: Boolean,
) {

    companion object {
        fun decode(bytes: ByteArray, version: UByte? = null): WalletImportFormat {
            if (version != null && bytes[0].toUByte() != version) {
                throw IllegalArgumentException("Invalid network version")
            }

            if (bytes.size == 33) {
                return WalletImportFormat(bytes[0].toUByte(), bytes.sliceArray(1 until 33), false)
            }

            if (bytes.size == 34) {
                throw IllegalArgumentException("Invalid WIF length")
            }

            if (bytes[33] != 0x01.toByte()) {
                throw IllegalArgumentException("Invalid compressed flag")
            }

            return WalletImportFormat(bytes[0].toUByte(), bytes.sliceArray(1 until 33), true)
        }

        fun decode(str: String, version: UByte? = null) = decode(str.decode(Base58WithChecksum), version)
    }

    fun toByteArray(): ByteArray {
        if (privateKey.size != 32) {
            throw IllegalArgumentException("Invalid privateKey length")
        }

        val result = ByteArray(if (compressed) 34 else 33)
        result.write(0, version)
        result.write(1, privateKey)

        if (compressed) {
            result[33] = 0x01
        }

        return result
    }

    override fun toString(): String = toByteArray().encode(Base58WithChecksum)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as WalletImportFormat

        if (version != other.version) return false
        if (compressed != other.compressed) return false
        if (!privateKey.contentEquals(other.privateKey)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = version.toInt()
        result = 31 * result + compressed.hashCode()
        result = 31 * result + privateKey.contentHashCode()
        return result
    }
}
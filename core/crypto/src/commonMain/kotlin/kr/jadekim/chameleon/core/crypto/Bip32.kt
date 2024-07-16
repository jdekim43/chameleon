package kr.jadekim.chameleon.core.crypto

expect object Bip32 {

    fun keyPair(seed: ByteArray, hdPath: IntArray): Bip32KeyPair

    fun keyPair(privateKey: ByteArray): Bip32KeyPair

    fun sign(messageHash: ByteArray, privateKey: ByteArray): ByteArray

    fun verify(messageHash: ByteArray, publicKey: ByteArray, signature: ByteArray): Boolean

    fun recoverPublicKey(messageHash: ByteArray, signature: ByteArray): ByteArray

    fun decompressPublicKey(publicKey: ByteArray): ByteArray
}

object Bip32Utils {

    fun hard(value: Int): Int = value or -0x80000000

    fun isHardened(value: Int): Boolean = (value and -0x80000000) != 0
}

internal fun concatRandS(r: ByteArray, s: ByteArray): ByteArray {
    var index = 0
    val start = if (r.size > 32) r.size - 32 else 0

    val result = ByteArray(r.size + s.size - start)

    for (i in start until r.size) {
        result[index++] = r[i]
    }

    for (i in s.indices) {
        result[index++] = s[i]
    }

    return result
}

internal fun splitRandS(bytes: ByteArray): Pair<ByteArray, ByteArray> {
    return bytes.sliceArray(0 until 32) to bytes.sliceArray(32 until bytes.size)
}

data class Bip32KeyPair(
    val publicKey: ByteArray,
    val privateKey: ByteArray
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Bip32KeyPair

        if (!publicKey.contentEquals(other.publicKey)) return false
        if (!privateKey.contentEquals(other.privateKey)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = publicKey.contentHashCode()
        result = 31 * result + privateKey.contentHashCode()
        return result
    }
}
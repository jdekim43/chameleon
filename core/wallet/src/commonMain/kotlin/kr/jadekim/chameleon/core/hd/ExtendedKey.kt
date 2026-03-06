package kr.jadekim.chameleon.core.hd

import kr.jadekim.chameleon.core.key.Key
import kr.jadekim.chameleon.core.key.PrivateKey
import kr.jadekim.chameleon.core.key.PublicKey

data class ExtendedKey<K : Key>(
    val key: K,
    val chainCode: ByteArray,
    val depth: UByte,
    val path: KeyPath,
    val parentFingerprint: UInt,
) {

    companion object {
        fun <P : PrivateKey> from(seed: ByteArray, curve: Curve<P>): ExtendedKey<P> = curve.from(seed)
    }

    val index = path.last()

    val fingerprint: UInt by lazy {
        when (key) {
            is PublicKey -> key.fingerprint
            is PrivateKey -> key.createPublicKey().fingerprint
            else -> throw IllegalArgumentException("Not supported key type")
        }
    }

    init {
        require(depth != 0.toUByte() || parentFingerprint == 0u) { "zero depth with non-zero parent fingerprint" }
        require(depth != 0.toUByte() || index == 0u) { "zero depth with non-zero child number" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ExtendedKey<K>

        if (key != other.key) return false
        if (!chainCode.contentEquals(other.chainCode)) return false
        if (depth != other.depth) return false
        if (path != other.path) return false

        return true
    }

    override fun hashCode(): Int {
        var result = key.hashCode()
        result = 31 * result + chainCode.contentHashCode()
        result = 31 * result + depth.hashCode()
        result = 31 * result + path.hashCode()
        return result
    }
}

fun <K : Key> ExtendedKey<K>.derive(index: UInt, curve: Curve<*>): ExtendedKey<K> = curve.derive(this, index)

fun <K : Key> ExtendedKey<K>.derive(path: List<UInt>, curve: Curve<*>): ExtendedKey<K> =
    path.fold(this) { acc, index -> acc.derive(index, curve) }

fun <K : Key> ExtendedKey<K>.derive(path: KeyPath, curve: Curve<*>): ExtendedKey<K> = derive(path.path, curve)

fun <K : Key> ExtendedKey<K>.derive(path: String, curve: Curve<*>): ExtendedKey<K> = derive(KeyPath(path), curve)

val <K : PrivateKey> ExtendedKey<K>.extendedPublicKey: ExtendedKey<PublicKey>
    get() = ExtendedKey(key.createPublicKey(), chainCode, depth, path, parentFingerprint)
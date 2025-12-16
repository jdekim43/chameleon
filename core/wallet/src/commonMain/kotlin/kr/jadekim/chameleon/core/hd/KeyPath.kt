package kr.jadekim.chameleon.core.hd

import kr.jadekim.chameleon.core.hd.KeyPath.Companion.MASTER_ELEMENT_STRING
import kotlin.jvm.JvmInline

@JvmInline
value class KeyPath(val path: List<UInt>) {

    companion object {
        val EMPTY = KeyPath(emptyList())

        internal const val MASTER_ELEMENT_STRING = "m"
        private const val BIP44_ELEMENT = 44u

        fun bip44(coinType: UInt, addressIndex: UInt): KeyPath {
            return KeyPath(listOf(BIP44_ELEMENT, coinType.hardened, addressIndex.hardened))
        }

        fun bip44(coinType: UInt, account: UInt, change: UInt, addressIndex: UInt): KeyPath {
            return KeyPath(listOf(BIP44_ELEMENT, coinType.hardened, account.hardened, change.unhardened, addressIndex.unhardened))
        }
    }

    constructor(path: String) : this(parsePath(path))

    fun last(): UInt = if (path.isEmpty()) 0u else path.last()

    operator fun plus(index: UInt): KeyPath = KeyPath(path + index)

    operator fun plus(path: KeyPath): KeyPath = KeyPath(this.path + path.path)

    override fun toString() = path.fold(StringBuilder().append(MASTER_ELEMENT_STRING)) { acc, index ->
        acc.append('/')

        if (index.isHardened) {
            acc.append(index.unhardened)
            acc.append(HARDENED_SUFFIX)
        } else {
            acc.append(index)
        }
    }.toString()
}

private fun parsePath(path: String): List<UInt> {
    val polished = polishPathString(path)

    if (polished.isEmpty()) return emptyList()

    return polished.split("/")
        .map { if (it.endsWith(HARDENED_SUFFIX)) it.toUInt().hardened else it.toUInt() }
}

private fun polishPathString(path: String): String {
    if (!path.trim().startsWith(MASTER_ELEMENT_STRING)) {
        throw (IllegalArgumentException("Must start with $MASTER_ELEMENT_STRING"))
    }

    return path.removePrefix(MASTER_ELEMENT_STRING).removePrefix("/").replace(" ", "")
}
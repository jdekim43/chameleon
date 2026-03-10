package kr.jadekim.chameleon.core.wallet

import kr.jadekim.chameleon.core.crypto.bech32.Bech32
import kr.jadekim.common.encoder.*
import kotlin.jvm.JvmInline

interface Address {

    val text: String
    val data: ByteArray
}

@JvmInline
value class Bech32Address(override val text: String) : Address {

    constructor(hrp: String, data: ByteArray) : this(Bech32.encode(hrp, Bech32.toWords(data)))

    val hrp: String
        get() {
            val (hrp, _) = text.decode(Bech32)

            return hrp
        }

    override val data: ByteArray
        get() {
            val (_, words) = text.decode(Bech32)

            return Bech32.fromWords(words)
        }
}

@JvmInline
value class HexAddress(override val text: String) : Address {

    constructor(data: ByteArray) : this(data.encode(Hex))

    private val hexOnlyText: String
        get() {
            if (text.startsWith("0x", true)) {
                return text.substring(2)
            }

            return text.lowercase()
        }

    override val data: ByteArray
        get() = hexOnlyText.decode(Hex)
}

@JvmInline
value class Base58Address(override val text: String) : Address {

    constructor(data: ByteArray) : this(Base58.encode(data))

    constructor(version: UByte, data: ByteArray) : this(byteArrayOf(version.toByte()) + data)

    override val data: ByteArray
        get() = Base58.decode(text)

}

@JvmInline
value class Base58CheckAddress(override val text: String) : Address {

    constructor(data: ByteArray) : this(Base58WithChecksum.encode(data))

    constructor(version: UByte, data: ByteArray) : this(byteArrayOf(version.toByte()) + data)

    override val data: ByteArray
        get() = Base58WithChecksum.decode(text)

}

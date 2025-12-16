package kr.jadekim.chameleon.core.mnemonic

import kr.jadekim.chameleon.core.mnemonic.wordlist.Wordlist
import kr.jadekim.common.crypto.hash.SHA_256
import kr.jadekim.common.crypto.hash.hash
import kr.jadekim.common.encoder.Encoder
import kr.jadekim.common.encoder.Hex
import kr.jadekim.common.encoder.decode
import kr.jadekim.common.extension.toBinary
import kr.jadekim.common.extension.toByteArray
import kr.jadekim.common.extension.toInt
import kotlin.jvm.JvmInline

private const val INDEX_BIT_SIZE = 11

@JvmInline
value class Entropy(val entropy: ByteArray) {

    constructor(entropy: String, decoder: Encoder<ByteArray, String> = Hex) : this(entropy.decode(decoder))

    fun toMnemonic(wordlist: Wordlist = Wordlist.DEFAULT): Mnemonic {
        if (entropy.size !in 16..32 || entropy.size % 4 != 0) {
            throw IllegalArgumentException("Invalid entropy")
        }

        val entropyBits = entropy.toBinary()
        val checksumBits = deriveChecksumBits()
        val bits = entropyBits + checksumBits

        val words = mutableListOf<String>()

        for (i in bits.indices step INDEX_BIT_SIZE) {
            val index = bits.sliceArray(i until i + INDEX_BIT_SIZE).toInt()

            words.add(wordlist.wordlist[index])
        }

        require(words.size == Mnemonic.Strength.fromEntropyByteSize(entropy.size).wordCount) { "Invalid word count" }

        return Mnemonic(words.toTypedArray())
    }

    internal fun deriveChecksumBits(): BooleanArray {
        val ENT = entropy.size * 8
        val CS = ENT / 32
        val hash = entropy.hash(SHA_256)

        return hash.sliceArray(0 until CS).toBinary()
    }
}

fun Mnemonic.toEntropy(wordlist: Wordlist = Wordlist.DEFAULT): Entropy {
    // convert word indices to 11 bit binary strings
    val bits = BooleanArray(words.size * INDEX_BIT_SIZE)

    words.forEachIndexed { i, word ->
        val index = wordlist.wordlist.indexOf(word)
        if (index < 0) {
            throw IllegalArgumentException("Unknown mnemonic word")
        }

        index.toBinary()
            .copyInto(bits, i * INDEX_BIT_SIZE, Int.SIZE_BITS - INDEX_BIT_SIZE, Int.SIZE_BITS)
    }

    // split the binary string into ENT/CS
    val dividerIndex = bits.size / 33 * 32
    val entropyBits = bits.sliceArray(0 until dividerIndex)
    val checksumBits = bits.sliceArray(dividerIndex until bits.size)

    // calculate the checksum and compare
    val entropyBytes = entropyBits.toByteArray()

    if (entropyBytes.size !in 16..32 || entropyBytes.size % 4 != 0) {
        throw IllegalStateException("Invalid entropy")
    }

    val entropy = Entropy(entropyBytes)
    val newChecksum = entropy.deriveChecksumBits()
    if (!newChecksum.contentEquals(checksumBits)) {
        throw IllegalStateException("Invalid checksum")
    }

    return entropy
}
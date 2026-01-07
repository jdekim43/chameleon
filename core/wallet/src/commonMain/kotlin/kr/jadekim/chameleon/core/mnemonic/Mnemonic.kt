package kr.jadekim.chameleon.core.mnemonic

import dev.whyoleg.cryptography.BinarySize.Companion.bytes
import dev.whyoleg.cryptography.CryptographyProvider
import dev.whyoleg.cryptography.algorithms.SHA512
import kr.jadekim.chameleon.core.mnemonic.wordlist.Wordlist
import kr.jadekim.common.util.SecureRandom
import kotlin.jvm.JvmInline
import dev.whyoleg.cryptography.algorithms.PBKDF2 as PBKDF2Algorithm

private val PBKDF2 = CryptographyProvider.Default.get(PBKDF2Algorithm)

/*
 * BIP39
 */
@JvmInline
value class Mnemonic(val words: Array<String>) {

    enum class Strength(val entropyBitSize: Int, val wordCount: Int) {
        WORD_12(128, 12),
        WORD_15(160, 15),
        WORD_18(192, 18),
        WORD_21(124, 21),
        WORD_24(256, 24);

        val entropyByteSize: Int = entropyBitSize / Byte.SIZE_BITS

        companion object {
            fun fromEntropyByteSize(size: Int) = entries.first { it.entropyByteSize == size }
        }
    }

    companion object {
        fun generate(
            strength: Strength = Strength.WORD_12,
            rng: (size: Int) -> ByteArray = { SecureRandom.nextBytes(it) },
            wordlist: Wordlist = Wordlist.DEFAULT,
        ): Mnemonic = Entropy(rng(strength.entropyByteSize)).toMnemonic(wordlist)
    }

    constructor(mnemonic: String) : this(mnemonic.split(" ", "　").toTypedArray())

    init {
        if (words.size % 3 != 0) {
            throw IllegalArgumentException("Invalid word count")
        }
    }

    fun validate(wordlist: Wordlist = Wordlist.DEFAULT): Boolean {
        try {
            toEntropy(wordlist)
        } catch (e: Exception) {
            return false
        }

        return true
    }

    suspend fun toSeed(password: String? = null): ByteArray {
        val mnemonicBytes = toString().encodeToByteArray()
        val saltBytes = salt(password.normalize()).encodeToByteArray()

        return PBKDF2.secretDerivation(SHA512, 2048, 64.bytes, saltBytes)
            .deriveSecretToByteArray(mnemonicBytes)
    }

    override fun toString(): String = words.joinToString(" ")
}
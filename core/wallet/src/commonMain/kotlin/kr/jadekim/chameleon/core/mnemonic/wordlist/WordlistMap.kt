package kr.jadekim.chameleon.core.mnemonic.wordlist

import kotlin.jvm.JvmInline

@JvmInline
value class Wordlist(val wordlist: Array<String>) {

    companion object {
        const val SIZE = 2048

        var DEFAULT = ENGLISH_WORDLIST

        val CZECH = CZECH_WORDLIST
        val ENGLISH = ENGLISH_WORDLIST
        val FRENCH = FRENCH_WORDLIST
        val ITALIAN = ITALIAN_WORDLIST
        val JAPANESE = JAPANESE_WORDLIST
        val KOREAN = KOREAN_WORDLIST
        val PORTUGUESE = PORTUGUESE_WORDLIST
        val SPANISH = SPANISH_WORDLIST
    }

    init {
        require(wordlist.size == SIZE) { "wordlist size must be ${SIZE}, but was ${wordlist.size}" }
    }

    fun toIndexMap(): Map<String, Int> = wordlist.mapIndexed { index, word -> word to index }.toMap()
}

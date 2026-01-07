package kr.jadekim.chameleon.core.mnemonic

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kr.jadekim.chameleon.core.hd.Bip32TestData.VERSION_MAINNET_PRIVATE
import kr.jadekim.chameleon.core.hd.ExtendedPrivateKey
import kr.jadekim.chameleon.core.mnemonic.wordlist.*
import kr.jadekim.common.encoder.Hex
import kr.jadekim.common.encoder.decode
import kr.jadekim.common.encoder.encode

class Bip39Test : FunSpec({
    Bip39TestData.load().forEach { (language, items) ->
        context("Language : $language") {
            val wordlist = when (language) {
                "english" -> ENGLISH_WORDLIST
                "czech" -> CZECH_WORDLIST
                "french" -> FRENCH_WORDLIST
                "italian" -> ITALIAN_WORDLIST
                "japanese" -> JAPANESE_WORDLIST
                "korean" -> KOREAN_WORDLIST
                "portuguese" -> PORTUGUESE_WORDLIST
                "spanish" -> SPANISH_WORDLIST
                else -> return@context
            }

            context("entropy to mnemonic") {
                items.forEach { item ->
                    test(item.entropy) {
                        val entropy = Entropy(item.entropy)
                        val mnemonic = entropy.toMnemonic(wordlist)

                        mnemonic.toString().lowercase() shouldBe Mnemonic(item.mnemonic).toString().lowercase()
                    }
                }
            }

            context("mnemonic to seed") {
                items.forEach { item ->
                    test(item.mnemonic) {
                        val mnemonic = Mnemonic(item.mnemonic)
                        val seed = mnemonic.toSeed(item.passphrase)

                        seed.encode(Hex).lowercase() shouldBe item.seed
                    }
                }
            }

            context("seed to private key") {
                items.forEach { item ->
                    test(item.seed) {
                        val seed = item.seed.decode(Hex)
                        val extendedPrivateKey = ExtendedPrivateKey.from(seed)

                        extendedPrivateKey.toBase58(VERSION_MAINNET_PRIVATE) shouldBe item.extendedPrivateKey
                    }
                }
            }
        }
    }
})
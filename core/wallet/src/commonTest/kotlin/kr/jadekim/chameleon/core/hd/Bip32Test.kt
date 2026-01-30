package kr.jadekim.chameleon.core.hd

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.startWith
import kr.jadekim.chameleon.core.hd.Bip32TestData.VERSION_MAINNET_PRIVATE
import kr.jadekim.chameleon.core.hd.Bip32TestData.VERSION_MAINNET_PUBLIC
import kr.jadekim.chameleon.core.hd.secp256k1.ExtendedPrivateKey
import kr.jadekim.chameleon.core.hd.secp256k1.ExtendedPublicKey
import kr.jadekim.common.encoder.Hex
import kr.jadekim.common.encoder.decode

class Bip32Test : FunSpec({
    Bip32TestData.load().forEach { item ->
        val privateKey = ExtendedPrivateKey.from(item.seed.decode(Hex))

        context("seed = ${item.seed}") {
            item.keys.forEach { key ->
                val childrenPrivateKey = privateKey.derive(KeyPath(key.path))
                context(key.path) {
                    test("private key") {
                        childrenPrivateKey.toBase58(VERSION_MAINNET_PRIVATE) shouldBe key.extendedPrivateKey
                    }
                    test("public key") {
                        childrenPrivateKey.extendedPublicKey.toBase58(VERSION_MAINNET_PUBLIC) shouldBe key.extendedPublicKey
                    }
                }
            }
        }
    }

    context("Error validation") {
        context("private key") {
            test("prvkey version / pubkey mismatch") {
                shouldThrow<IllegalArgumentException> {
                    ExtendedPrivateKey.fromBase58(
                        "xprv9s21ZrQH143K24Mfq5zL5MhWK9hUhhGbd45hLXo2Pq2oqzMMo63oStZzFGTQQD3dC4H2D5GBj7vWvSQaaBv5cxi9gafk7NF3pnBju6dwKvH",
                        { it == VERSION_MAINNET_PRIVATE })
                }.message shouldBe "Invalid private key"
            }
            test("invalid prvkey prefix 04") {
                shouldThrow<IllegalArgumentException> {
                    ExtendedPrivateKey.fromBase58(
                        "xprv9s21ZrQH143K24Mfq5zL5MhWK9hUhhGbd45hLXo2Pq2oqzMMo63oStZzFGpWnsj83BHtEy5Zt8CcDr1UiRXuWCmTQLxEK9vbz5gPstX92JQ",
                        { it == VERSION_MAINNET_PRIVATE })
                }.message shouldBe "Invalid private key"
            }
            test("invalid prvkey prefix 01") {
                shouldThrow<IllegalArgumentException> {
                    ExtendedPrivateKey.fromBase58(
                        "xprv9s21ZrQH143K24Mfq5zL5MhWK9hUhhGbd45hLXo2Pq2oqzMMo63oStZzFAzHGBP2UuGCqWLTAPLcMtD9y5gkZ6Eq3Rjuahrv17fEQ3Qen6J",
                        { it == VERSION_MAINNET_PRIVATE })
                }.message shouldBe "Invalid private key"
            }
            test("zero depth with non-zero parent fingerprint") {
                shouldThrow<IllegalArgumentException> {
                    ExtendedPrivateKey.fromBase58(
                        "xprv9s2SPatNQ9Vc6GTbVMFPFo7jsaZySyzk7L8n2uqKXJen3KUmvQNTuLh3fhZMBoG3G4ZW1N2kZuHEPY53qmbZzCHshoQnNf4GvELZfqTUrcv",
                        { it == VERSION_MAINNET_PRIVATE })
                }.message shouldBe "Invalid parent fingerprint"
            }
            test("zero depth with non-zero index") {
                shouldThrow<IllegalArgumentException> {
                    ExtendedPrivateKey.fromBase58(
                        "xprv9s21ZrQH4r4TsiLvyLXqM9P7k1K3EYhA1kkD6xuquB5i39AU8KF42acDyL3qsDbU9NmZn6MsGSUYZEsuoePmjzsB3eFKSUEh3Gu1N3cqVUN",
                        { it == VERSION_MAINNET_PRIVATE })
                }.message shouldBe "Invalid index"
            }
            test("unknown extended key version") {
                shouldThrow<IllegalArgumentException> {
                    ExtendedPrivateKey.fromBase58(
                        "DMwo58pR1QLEFihHiXPVykYB6fJmsTeHvyTp7hRThAtCX8CvYzgPcn8XnmdfHGMQzT7ayAmfo4z3gY5KfbrZWZ6St24UVf2Qgo6oujFktLHdHY4",
                        { it == VERSION_MAINNET_PRIVATE })
                }.message shouldBe "Invalid network version"
            }
            test("private key 0 not in 1..n-1") {
                shouldThrow<IllegalArgumentException> {
                    ExtendedPrivateKey.fromBase58(
                        "xprv9s21ZrQH143K24Mfq5zL5MhWK9hUhhGbd45hLXo2Pq2oqzMMo63oStZzF93Y5wvzdUayhgkkFoicQZcP3y52uPPxFnfoLZB21Teqt1VvEHx",
                        { it == VERSION_MAINNET_PRIVATE })
                }.message shouldBe "Invalid private key"
            }
        }

        context("public key") {
            test("pubkey version / prvkey mismatch") {
                shouldThrow<IllegalArgumentException> {
                    ExtendedPublicKey.fromBase58(
                        "xpub661MyMwAqRbcEYS8w7XLSVeEsBXy79zSzH1J8vCdxAZningWLdN3zgtU6LBpB85b3D2yc8sfvZU521AAwdZafEz7mnzBBsz4wKY5fTtTQBm",
                        { it == VERSION_MAINNET_PUBLIC })
                }.message shouldBe "Invalid public key"
            }
            test("invalid pubkey prefix 04") {
                shouldThrow<IllegalArgumentException> {
                    ExtendedPublicKey.fromBase58(
                        "xpub661MyMwAqRbcEYS8w7XLSVeEsBXy79zSzH1J8vCdxAZningWLdN3zgtU6Txnt3siSujt9RCVYsx4qHZGc62TG4McvMGcAUjeuwZdduYEvFn",
                        { it == VERSION_MAINNET_PUBLIC })
                }.message shouldBe "Invalid public key"
            }
            test("invalid pubkey prefix 01") {
                shouldThrow<IllegalArgumentException> {
                    ExtendedPublicKey.fromBase58(
                        "xpub661MyMwAqRbcEYS8w7XLSVeEsBXy79zSzH1J8vCdxAZningWLdN3zgtU6N8ZMMXctdiCjxTNq964yKkwrkBJJwpzZS4HS2fxvyYUA4q2Xe4",
                        { it == VERSION_MAINNET_PUBLIC })
                }.message shouldBe "Invalid public key"
            }
            test("zero depth with non-zero parent fingerprint") {
                shouldThrow<IllegalArgumentException> {
                    ExtendedPublicKey.fromBase58(
                        "xpub661no6RGEX3uJkY4bNnPcw4URcQTrSibUZ4NqJEw5eBkv7ovTwgiT91XX27VbEXGENhYRCf7hyEbWrR3FewATdCEebj6znwMfQkhRYHRLpJ",
                        { it == VERSION_MAINNET_PUBLIC })
                }.message shouldBe "Invalid parent fingerprint"
            }
            test("zero depth with non-zero index") {
                shouldThrow<IllegalArgumentException> {
                    ExtendedPublicKey.fromBase58(
                        "xpub661MyMwAuDcm6CRQ5N4qiHKrJ39Xe1R1NyfouMKTTWcguwVcfrZJaNvhpebzGerh7gucBvzEQWRugZDuDXjNDRmXzSZe4c7mnTK97pTvGS8",
                        { it == VERSION_MAINNET_PUBLIC })
                }.message shouldBe "Invalid index"
            }
            test("unknown extended key version") {
                shouldThrow<IllegalArgumentException> {
                    ExtendedPublicKey.fromBase58(
                        "DMwo58pR1QLEFihHiXPVykYB6fJmsTeHvyTp7hRThAtCX8CvYzgPcn8XnmdfHPmHJiEDXkTiJTVV9rHEBUem2mwVbbNfvT2MTcAqj3nesx8uBf9",
                        { it == VERSION_MAINNET_PUBLIC })
                }.message shouldBe "Invalid network version"
            }
            test("private key n not in 1..n-1") {
                shouldThrow<IllegalArgumentException> {
                    ExtendedPrivateKey.fromBase58(
                        "xprv9s21ZrQH143K24Mfq5zL5MhWK9hUhhGbd45hLXo2Pq2oqzMMo63oStZzFAzHGBP2UuGCqWLTAPLcMtD5SDKr24z3aiUvKr9bJpdrcLg1y3G",
                        { it == VERSION_MAINNET_PRIVATE })
                }.message shouldBe "Invalid private key"
            }
            test("invalid pubkey 020000000000000000000000000000000000000000000000000000000000000007") {
                shouldThrow<IllegalArgumentException> {
                    ExtendedPublicKey.fromBase58(
                        "xpub661MyMwAqRbcEYS8w7XLSVeEsBXy79zSzH1J8vCdxAZningWLdN3zgtU6Q5JXayek4PRsn35jii4veMimro1xefsM58PgBMrvdYre8QyULY",
                        { it == VERSION_MAINNET_PUBLIC })
                }.message shouldBe "Invalid public key"
            }
        }
        test("invalid checksum") {
            shouldThrow<IllegalArgumentException> {
                ExtendedPrivateKey.fromBase58(
                    "xprv9s21ZrQH143K3QTDL4LXw2F7HEK3wJUD2nW2nRk4stbPy6cq3jPPqjiChkVvvNKmPGJxWUtg6LnF5kejMRNNU3TGtRBeJgk33yuGBxrMPHL",
                    { it == VERSION_MAINNET_PRIVATE })
            }.message shouldBe startWith("Checksum mismatch")
        }
    }
})
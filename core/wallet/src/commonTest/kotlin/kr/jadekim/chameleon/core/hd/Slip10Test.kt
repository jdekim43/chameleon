package kr.jadekim.chameleon.core.hd

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kr.jadekim.common.encoder.Hex
import kr.jadekim.common.encoder.decode

class Slip10Test : FunSpec({
    context("secp256k1") {
        Slip10TestData.secp256k1.forEach { item ->
            val xPrivateKey = ExtendedKey.from(item.seed.decode(Hex), Curve.Secp256k1)

            context("seed = ${item.seed}") {
                item.keys.forEach { key ->
                    val childrenPrivateKey = xPrivateKey.derive(KeyPath(key.path), Curve.Secp256k1)
                    context(key.path) {
                        test("fingerprint") {
                            childrenPrivateKey.parentFingerprint.toHexString() shouldBe key.fingerprint.lowercase()
                        }
                        test("chain code") {
                            childrenPrivateKey.chainCode.toHexString() shouldBe key.chainCode.lowercase()
                        }
                        test("private key") {
                            childrenPrivateKey.key.toHex().lowercase() shouldBe key.privateKey.lowercase()
                        }
                        test("public key") {
                            childrenPrivateKey.key.createPublicKey().toHex()
                                .lowercase() shouldBe key.publicKey.lowercase()
                        }
                    }
                }
            }
        }
    }
    context("secp256r1") {
        Slip10TestData.secp256r1.forEach { item ->
            val xPrivateKey = ExtendedKey.from(item.seed.decode(Hex), Curve.Secp256r1)

            context("seed = ${item.seed}") {
                item.keys.forEach { key ->
                    val childrenPrivateKey = xPrivateKey.derive(KeyPath(key.path), Curve.Secp256r1)
                    context(key.path) {
                        test("fingerprint") {
                            childrenPrivateKey.parentFingerprint.toHexString() shouldBe key.fingerprint.lowercase()
                        }
                        test("chain code") {
                            childrenPrivateKey.chainCode.toHexString() shouldBe key.chainCode.lowercase()
                        }
                        test("private key") {
                            childrenPrivateKey.key.toHex().lowercase() shouldBe key.privateKey.lowercase()
                        }
                        test("public key") {
                            childrenPrivateKey.key.createPublicKey().toHex()
                                .lowercase() shouldBe key.publicKey.lowercase()
                        }
                    }
                }
            }
        }
    }
    context("ed25519") {
        Slip10TestData.ed25519.forEach { item ->
            val xPrivateKey = ExtendedKey.from(item.seed.decode(Hex), Curve.Ed25519)

            context("seed = ${item.seed}") {
                item.keys.forEach { key ->
                    val childrenPrivateKey = xPrivateKey.derive(KeyPath(key.path), Curve.Ed25519)
                    context(key.path) {
                        test("fingerprint") {
                            childrenPrivateKey.parentFingerprint.toHexString() shouldBe key.fingerprint.lowercase()
                        }
                        test("chain code") {
                            childrenPrivateKey.chainCode.toHexString() shouldBe key.chainCode.lowercase()
                        }
                        test("private key") {
                            childrenPrivateKey.key.toHex().lowercase() shouldBe key.privateKey.lowercase()
                        }
                        test("public key") {
                            childrenPrivateKey.key.createPublicKey().toHex()
                                .lowercase() shouldBe key.publicKey.lowercase()
                        }
                    }
                }
            }
        }
    }
})
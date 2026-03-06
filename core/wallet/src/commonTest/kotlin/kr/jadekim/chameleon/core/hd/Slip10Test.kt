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
package kr.jadekim.chameleon.sei.wallet.test

import kr.jadekim.chameleon.cosmos.key.CosmosPublicKey
import kr.jadekim.chameleon.sei.key.SeiKeyPair
import kr.jadekim.chameleon.sei.wallet.SeiWallet
import kr.jadekim.common.encoder.decodeBase64
import kr.jadekim.common.encoder.encodeBase64
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SignatureTest {

    @Test
    fun succeedSign() {
        val wallet = SeiWallet.fromKeyPair(NORMAL.privateKeyHex)
        val signature = (wallet.key as SeiKeyPair).signSync("text")
        assertEquals(
            "wzShM5fvNKxukZIgVF2uO/f+VNRabi7Xf+TC3pJN2OdIeHM6ClihLFIu3synzy0eXQ/bLz9PMfGS+fLI7cCDTQ==",
            signature.encodeBase64(),
        )
    }

    @Test
    fun succeedVerify() {
        val wallet = SeiWallet.fromKeyPair(NORMAL.privateKeyHex)

        assertTrue {
            wallet.key!!.verify(
                "text",
                "wzShM5fvNKxukZIgVF2uO/f+VNRabi7Xf+TC3pJN2OdIeHM6ClihLFIu3synzy0eXQ/bLz9PMfGS+fLI7cCDTQ=="
            )
        }
    }

    @Test
    fun succeedRecoverPublicKeyFromSignature() {
        val publicKey = CosmosPublicKey.recoverFromSignature(
            "text",
            "wzShM5fvNKxukZIgVF2uO/f+VNRabi7Xf+TC3pJN2OdIeHM6ClihLFIu3synzy0eXQ/bLz9PMfGS+fLI7cCDTQ==",
        )

        assertTrue {
            publicKey.verify(
                "text",
                "wzShM5fvNKxukZIgVF2uO/f+VNRabi7Xf+TC3pJN2OdIeHM6ClihLFIu3synzy0eXQ/bLz9PMfGS+fLI7cCDTQ==",
            )
        }

        val wallet = SeiWallet.fromKeyPair(NORMAL.privateKeyHex)

        assertTrue {
            publicKey.publicKey.contentEquals(wallet.key?.publicKey)
        }
    }

    @Test
    fun succeedRecover65bytesPublicKey() {
        val text =
            "MTY0OTE2OTE1MzMyMXRlcnJhMXV0YXRlOTJkcWdld3BnaGZ5ZnB3eW5xejZsbTllcXJwcXVxdnA5eyJjYW1wYWlnbiI6InRlcnJhMThzaDI0OHd0dXAzemZkamNkanVsNDd1dmRneW40emM4YTNhOHpnIiwicnVsZSI6eyJ0eXBlIjoiQW5kIiwiY2hpbGRyZW4iOlt7InR5cGUiOiJCb29sZWFuTGl0ZXJhbCIsImNoaWxkcmVuIjpbXSwiZGF0YSI6InRydWUifSx7InR5cGUiOiJCb29sZWFuTGl0ZXJhbCIsImNoaWxkcmVuIjpbXSwiZGF0YSI6InRydWUifSx7InR5cGUiOiJCb29sZWFuTGl0ZXJhbCIsImNoaWxkcmVuIjpbXSwiZGF0YSI6InRydWUifV0sImRhdGEiOiJ0cnVlIn19".decodeBase64()

        val publicKey = CosmosPublicKey.recoverFromSignature(
            text,
            "+M3CoRvhoIH7PTCw4A2nNtGONBUO0NToHK03830VG01cpnk68oWL3FA7lYVRpL592YscV6oOG58eZ0tcdpzR6Q=="
        )
        assertTrue {
            publicKey.verify(
                text,
                "+M3CoRvhoIH7PTCw4A2nNtGONBUO0NToHK03830VG01cpnk68oWL3FA7lYVRpL592YscV6oOG58eZ0tcdpzR6Q=="
            )
        }
    }

    @Test
    fun failedVerify() {
        val wallet = SeiWallet.create().first

        assertFalse {
            wallet.key!!.verify(
                "text",
                "XUS608ydbfZ/acnQdlJzFOflrmkv1IuqZlWS3O+ZUZZFC98LO2BiGUbfAv4rtN/uKrzGy8lERwWWNGC9opgjXA=="
            )
        }
    }
}
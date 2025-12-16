package kr.jadekim.chameleon.cosmos.wallet.test

class SignatureTest {

//    @Test
//    fun succeedSign() {
//        val wallet = CosmosWallet.fromKeyPair(NORMAL.privateKeyHex)
//        val signature = (wallet.key as CosmosSecp256k1PrivateKey).signSync("text")
//        assertEquals(
//            "wzShM5fvNKxukZIgVF2uO/f+VNRabi7Xf+TC3pJN2OdIeHM6ClihLFIu3synzy0eXQ/bLz9PMfGS+fLI7cCDTQ==",
//            signature.encode(Base64),
//        )
//    }
//
//    @Test
//    fun succeedVerify() {
//        val wallet = CosmosWallet.fromKeyPair(NORMAL.privateKeyHex.decode(Hex))
//
//        assertTrue {
//            wallet.verify(
//                "text".utf8(),
//                "wzShM5fvNKxukZIgVF2uO/f+VNRabi7Xf+TC3pJN2OdIeHM6ClihLFIu3synzy0eXQ/bLz9PMfGS+fLI7cCDTQ==".decode(Base64)
//            )
//        }
//    }
//
//    @Test
//    fun succeedRecoverPublicKeyFromSignature() {
//        val (publicKey1, publicKey2) = HDPublicKey.recovery(
//            "wzShM5fvNKxukZIgVF2uO/f+VNRabi7Xf+TC3pJN2OdIeHM6ClihLFIu3synzy0eXQ/bLz9PMfGS+fLI7cCDTQ==".decode(Base64),
//            "text".utf8(),
//        )
//
//        assertTrue {
//            publicKey1.verify(
//                "text".utf8(),
//                "wzShM5fvNKxukZIgVF2uO/f+VNRabi7Xf+TC3pJN2OdIeHM6ClihLFIu3synzy0eXQ/bLz9PMfGS+fLI7cCDTQ==".decode(Base64),
//            ) || publicKey2.verify(
//                "text".utf8(),
//                "wzShM5fvNKxukZIgVF2uO/f+VNRabi7Xf+TC3pJN2OdIeHM6ClihLFIu3synzy0eXQ/bLz9PMfGS+fLI7cCDTQ==".decode(Base64),
//            )
//        }
//
//        val wallet = CosmosWallet.fromKeyPair(NORMAL.privateKeyHex.decode(Hex))
//
//        assertTrue {
//            publicKey1.compressed.contentEquals(wallet.publicKey!!.publicKey) || publicKey2.compressed.contentEquals(wallet.publicKey!!.publicKey)
//        }
//    }
//
//    @Test
//    fun succeedRecover65bytesPublicKey() {
//        val text =
//            "MTY0OTE2OTE1MzMyMXRlcnJhMXV0YXRlOTJkcWdld3BnaGZ5ZnB3eW5xejZsbTllcXJwcXVxdnA5eyJjYW1wYWlnbiI6InRlcnJhMThzaDI0OHd0dXAzemZkamNkanVsNDd1dmRneW40emM4YTNhOHpnIiwicnVsZSI6eyJ0eXBlIjoiQW5kIiwiY2hpbGRyZW4iOlt7InR5cGUiOiJCb29sZWFuTGl0ZXJhbCIsImNoaWxkcmVuIjpbXSwiZGF0YSI6InRydWUifSx7InR5cGUiOiJCb29sZWFuTGl0ZXJhbCIsImNoaWxkcmVuIjpbXSwiZGF0YSI6InRydWUifSx7InR5cGUiOiJCb29sZWFuTGl0ZXJhbCIsImNoaWxkcmVuIjpbXSwiZGF0YSI6InRydWUifV0sImRhdGEiOiJ0cnVlIn19".decodeBase64()
//
//        val publicKey = CosmosPublicKey.recoverFromSignature(
//            text,
//            "+M3CoRvhoIH7PTCw4A2nNtGONBUO0NToHK03830VG01cpnk68oWL3FA7lYVRpL592YscV6oOG58eZ0tcdpzR6Q=="
//        )
//        assertTrue {
//            publicKey.verify(
//                text,
//                "+M3CoRvhoIH7PTCw4A2nNtGONBUO0NToHK03830VG01cpnk68oWL3FA7lYVRpL592YscV6oOG58eZ0tcdpzR6Q=="
//            )
//        }
//    }
//
//    @Test
//    fun failedVerify() {
//        val wallet = CosmosWallet.create().first
//
//        assertFalse {
//            wallet.key!!.verify(
//                "text",
//                "XUS608ydbfZ/acnQdlJzFOflrmkv1IuqZlWS3O+ZUZZFC98LO2BiGUbfAv4rtN/uKrzGy8lERwWWNGC9opgjXA=="
//            )
//        }
//    }
}
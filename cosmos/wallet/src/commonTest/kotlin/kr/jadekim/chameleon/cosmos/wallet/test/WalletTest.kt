package kr.jadekim.chameleon.cosmos.wallet.test

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import kr.jadekim.chameleon.core.key.privateKeyHex
import kr.jadekim.chameleon.cosmos.wallet.CosmosWallet

class TerraWalletTest : FunSpec({
    test("test1") {
        val (wallet, mnemonicKey) = CosmosWallet.fromMnemonic(NORMAL.mnemonic)

        mnemonicKey.privateKeyHex.uppercase() shouldBe NORMAL.privateKeyHex
    }
}) {

//    @Test
//    fun succeedValidAddress() {
//        assertTrue {
//            CosmosAddress.isValidAddress("cosmos16s0d5h0q9akz5yaa4znu3yl8j2ea4ul6kl7crp", CosmosAddress.Hrp.ACCOUNT)
//        }
//    }
//
//    @Test
//    fun failedInvalidAddress() {
//        assertFalse {
//            CosmosAddress.isValidAddress(
//                "cosmos16s0d5h0q9akz5yaa4znu3yl8j2ea4ul6kl7cr",
//                CosmosAddress.Hrp.ACCOUNT
//            )
//        }
//        assertFalse {
//            CosmosAddress.isValidAddress(
//                "osmos16s0d5h0q9akz5yaa4znu3yl8j2ea4ul6kl7crp",
//                CosmosAddress.Hrp.ACCOUNT
//            )
//        }
//        assertFalse {
//            CosmosAddress.isValidAddress(
//                "cosmos6s0d5h0q9akz5yaa4znu3yl8j2ea4ul6kl7crp",
//                CosmosAddress.Hrp.ACCOUNT
//            )
//        }
//        assertFalse {
//            CosmosAddress.isValidAddress(
//                "cosmospub16s0d5h0q9akz5yaa4znu3yl8j2ea4ul6kl7crp",
//                CosmosAddress.Hrp.ACCOUNT
//            )
//        }
//        assertFalse { CosmosAddress.isValidAddress("cosmos1", CosmosAddress.Hrp.ACCOUNT) }
//        assertFalse {
//            CosmosAddress.isValidAddress(
//                "16s0d5h0q9akz5yaa4znu3yl8j2ea4ul6kl7crp",
//                CosmosAddress.Hrp.ACCOUNT
//            )
//        }
//        assertFalse { CosmosAddress.isValidAddress("cosmos1aadsf", CosmosAddress.Hrp.ACCOUNT) }
//        assertFalse { CosmosAddress.isValidAddress("cosm1", CosmosAddress.Hrp.ACCOUNT) }
//        assertFalse { CosmosAddress.isValidAddress("tear", CosmosAddress.Hrp.ACCOUNT) }
//        assertFalse { CosmosAddress.isValidAddress("cosm16s0d5h0q9akz5yaa4znu3yl8j2ea4ul6kl7crp", CosmosAddress.Hrp.ACCOUNT) }
//    }
//
//    @Test
//    fun succeedFromKeyPair() {
//        val wallet1 = CosmosWallet.fromKeyPair(NORMAL.privateKeyHex, NORMAL.publicKeyHex)
//        assertEquals(NORMAL.address, wallet1.address.text)
//        assertEquals(NORMAL.privateKeyHex, (wallet1.key as CosmosKeyPair).privateKeyHex)
//        assertEquals(NORMAL.publicKeyHex, (wallet1.key as CosmosKeyPair).publicKeyHex)
//        assertEquals(
//            NORMAL.publicKeyBech32,
//            CosmosAddress.createAccountPublicKeyAddress(wallet1.key as CosmosKeyPair).text
//        )
//    }
//
//    @Test
//    fun succeedFromPrivateKey() {
//        val wallet = CosmosWallet.fromKeyPair(NORMAL.privateKeyHex)
//        assertEquals(NORMAL.address, wallet.address.text)
//        assertEquals(NORMAL.privateKeyHex, (wallet.key as CosmosKeyPair).privateKeyHex)
//        assertEquals(NORMAL.publicKeyHex, (wallet.key as CosmosKeyPair).publicKeyHex)
//        assertEquals(
//            NORMAL.publicKeyBech32,
//            CosmosAddress.createAccountPublicKeyAddress(wallet.key as CosmosKeyPair).text
//        )
//    }
//
//    @Test
//    fun succeedFromMnemonic() {
//        val wallet = CosmosWallet.fromMnemonic(NORMAL.mnemonic)
//        assertEquals(NORMAL.address, wallet.address.text)
//        assertEquals(NORMAL.privateKeyHex, (wallet.key as CosmosKeyPair).privateKeyHex)
//        assertEquals(NORMAL.publicKeyHex, (wallet.key as CosmosKeyPair).publicKeyHex)
//        assertEquals(
//            NORMAL.publicKeyBech32,
//            CosmosAddress.createAccountPublicKeyAddress(wallet.key as CosmosKeyPair).text
//        )
//    }
}
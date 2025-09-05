package kr.jadekim.chameleon.sei.wallet.test

import kr.jadekim.chameleon.core.key.privateKeyHex
import kr.jadekim.chameleon.core.key.publicKeyHex
import kr.jadekim.chameleon.sei.key.SeiSecp256k1KeyPair
import kr.jadekim.chameleon.sei.wallet.SeiAddress
import kr.jadekim.chameleon.sei.wallet.SeiWallet
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SeiWalletTest {

    @Test
    fun succeedValidAddress() {
        assertTrue {
            SeiAddress.isValidAddress("sei16s0d5h0q9akz5yaa4znu3yl8j2ea4ul6mn0w9q", SeiAddress.Hrp.ACCOUNT)
        }
    }

    @Test
    fun failedInvalidAddress() {
        assertFalse {
            SeiAddress.isValidAddress(
                "sei16s0d5h0q9akz5yaa4znu3yl8j2ea4ul6mn0w9",
                SeiAddress.Hrp.ACCOUNT
            )
        }
        assertFalse {
            SeiAddress.isValidAddress(
                "ei16s0d5h0q9akz5yaa4znu3yl8j2ea4ul6mn0w9q",
                SeiAddress.Hrp.ACCOUNT
            )
        }
        assertFalse {
            SeiAddress.isValidAddress(
                "sei6s0d5h0q9akz5yaa4znu3yl8j2ea4ul6mn0w9q",
                SeiAddress.Hrp.ACCOUNT
            )
        }
        assertFalse {
            SeiAddress.isValidAddress(
                "seipub16s0d5h0q9akz5yaa4znu3yl8j2ea4ul6mn0w9q",
                SeiAddress.Hrp.ACCOUNT
            )
        }
        assertFalse { SeiAddress.isValidAddress("sei1", SeiAddress.Hrp.ACCOUNT) }
        assertFalse {
            SeiAddress.isValidAddress(
                "16s0d5h0q9akz5yaa4znu3yl8j2ea4ul6mn0w9q",
                SeiAddress.Hrp.ACCOUNT
            )
        }
        assertFalse { SeiAddress.isValidAddress("sei16s0d5h0", SeiAddress.Hrp.ACCOUNT) }
        assertFalse { SeiAddress.isValidAddress("se1", SeiAddress.Hrp.ACCOUNT) }
        assertFalse { SeiAddress.isValidAddress("mn0w9q", SeiAddress.Hrp.ACCOUNT) }
        assertFalse { SeiAddress.isValidAddress("se16s0d5h0q9akz5yaa4znu3yl8j2ea4ul6mn0w9q", SeiAddress.Hrp.ACCOUNT) }
    }

    @Test
    fun succeedFromKeyPair() {
        val wallet1 = SeiWallet.fromKeyPair(NORMAL.privateKeyHex, NORMAL.publicKeyHex)
        assertEquals(NORMAL.address, wallet1.address.text)
        assertEquals(NORMAL.privateKeyHex, (wallet1.key as SeiSecp256k1KeyPair).privateKeyHex)
        assertEquals(NORMAL.publicKeyHex, (wallet1.key as SeiSecp256k1KeyPair).publicKeyHex)
        assertEquals(
            NORMAL.publicKeyBech32,
            SeiAddress.createAccountPublicKeyAddress(wallet1.key as SeiSecp256k1KeyPair).text
        )
    }

    @Test
    fun succeedFromPrivateKey() {
        val wallet = SeiWallet.fromKeyPair(NORMAL.privateKeyHex)
        assertEquals(NORMAL.address, wallet.address.text)
        assertEquals(NORMAL.privateKeyHex, (wallet.key as SeiSecp256k1KeyPair).privateKeyHex)
        assertEquals(NORMAL.publicKeyHex, (wallet.key as SeiSecp256k1KeyPair).publicKeyHex)
        assertEquals(
            NORMAL.publicKeyBech32,
            SeiAddress.createAccountPublicKeyAddress(wallet.key as SeiSecp256k1KeyPair).text
        )
    }

    @Test
    fun succeedFromMnemonic() {
        val wallet = SeiWallet.fromMnemonic(NORMAL.mnemonic)
        assertEquals(NORMAL.address, wallet.address.text)
        assertEquals(NORMAL.privateKeyHex, (wallet.key as SeiSecp256k1KeyPair).privateKeyHex)
        assertEquals(NORMAL.publicKeyHex, (wallet.key as SeiSecp256k1KeyPair).publicKeyHex)
        assertEquals(
            NORMAL.publicKeyBech32,
            SeiAddress.createAccountPublicKeyAddress(wallet.key as SeiSecp256k1KeyPair).text
        )
    }
}
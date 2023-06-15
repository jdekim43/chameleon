package kr.jadekim.chameleon.core.crypto

object Bip44 {

    fun hdPath(coinType: Int, addressIndex: Int): IntArray {
        if (Bip32Utils.isHardened(coinType)) {
            throw IllegalArgumentException("Already hardened coinType")
        }

        if (Bip32Utils.isHardened(addressIndex)) {
            throw IllegalArgumentException("Already hardened addressIndex")
        }

        return intArrayOf(Bip32Utils.hard(44), Bip32Utils.hard(coinType), Bip32Utils.hard(addressIndex))
    }

    fun hdPath(coinType: Int, account: Int, change: Int, addressIndex: Int): IntArray {
        if (Bip32Utils.isHardened(coinType)) {
            throw IllegalArgumentException("Already hardened coinType")
        }

        if (Bip32Utils.isHardened(account)) {
            throw IllegalArgumentException("Already hardened account")
        }

        return intArrayOf(Bip32Utils.hard(44), Bip32Utils.hard(coinType), Bip32Utils.hard(account), change, addressIndex)
    }
}
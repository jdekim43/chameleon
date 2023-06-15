package kr.jadekim.chameleon.cosmos.tool

import kr.jadekim.chameleon.core.wallet.Wallet

interface AccountInfoProvider {

    suspend fun get(walletAddress: String): AccountInfo?

    suspend fun increaseSequence(walletAddress: String)

    suspend fun refreshSequence(walletAddress: String)
}

data class AccountInfo(
    val address: String,
    val accountNumber: ULong,
    val sequence: ULong,
) {

    constructor(wallet: Wallet) : this(wallet.address.text, 0u, 0u)
}

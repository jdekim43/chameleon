package kr.jadekim.chameleon.core.tool

import kr.jadekim.chameleon.core.wallet.Wallet

interface TransactionSigner<Transaction : Any> {

    suspend operator fun invoke(transaction: Transaction, wallet: Wallet, chainId: String): Transaction
}
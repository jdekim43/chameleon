package kr.jadekim.chameleon.core.tool

import kr.jadekim.chameleon.core.wallet.Wallet

interface FeeEstimator<TransactionType : Any> {

    suspend operator fun invoke(transaction: TransactionType, sender: Wallet): TransactionType
}

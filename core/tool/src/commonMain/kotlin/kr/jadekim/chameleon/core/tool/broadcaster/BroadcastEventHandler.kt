package kr.jadekim.chameleon.core.tool.broadcaster

import kr.jadekim.chameleon.core.wallet.Wallet

interface BroadcastEventHandler<TransactionType : Any, TransactionResult : Any> {

    suspend fun onStart(chainId: String, sender: Wallet, transaction: TransactionType)

    suspend fun onFinish(chainId: String, sender: Wallet, transaction: TransactionType, result: TransactionResult)

    suspend fun onError(chainId: String, sender: Wallet, transaction: TransactionType, reason: Throwable)
}
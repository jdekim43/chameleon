package kr.jadekim.chameleon.cosmos.tool

import cosmos.base.abci.v1beta1.TxResponse
import cosmos.tx.v1beta1.Tx
import kr.jadekim.chameleon.core.tool.SemaphoreProvider
import kr.jadekim.chameleon.core.tool.TransactionSenderLockHandler
import kr.jadekim.chameleon.core.wallet.Wallet

class CosmosBroadcastEventHandler(
    semaphore: SemaphoreProvider,
    private val accountInfoProvider: AccountInfoProvider,
) : TransactionSenderLockHandler<Tx, TxResponse>(semaphore) {

    override suspend fun onFinish(chainId: String, sender: Wallet, transaction: Tx, result: TxResponse) {
        when (result.code) {
            0u -> accountInfoProvider.increaseSequence(sender.address.text)
            4u -> accountInfoProvider.refreshSequence(sender.address.text)
        }

        super.onFinish(chainId, sender, transaction, result)
    }

    override suspend fun onError(chainId: String, sender: Wallet, transaction: Tx, reason: Throwable) {
        accountInfoProvider.refreshSequence(sender.address.text)

        super.onError(chainId, sender, transaction, reason)
    }
}
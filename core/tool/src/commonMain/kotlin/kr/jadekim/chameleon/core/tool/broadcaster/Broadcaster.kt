package kr.jadekim.chameleon.core.tool.broadcaster

import kotlinx.coroutines.*
import kr.jadekim.chameleon.core.tool.*
import kr.jadekim.chameleon.core.wallet.Wallet
import kotlin.coroutines.CoroutineContext

abstract class Broadcaster<Transaction : Any, TransactionResult : Any>(
    val chainId: String,
    val feeEstimator: FeeEstimator<Transaction>? = null,
    val signer: TransactionSigner<Transaction>? = null,
    val hook: BroadcastEventHook<Transaction, TransactionResult>? = null,
    coroutineContext: CoroutineContext? = null,
) : CoroutineScope {

    override val coroutineContext = coroutineContext ?: CoroutineName(this::class.simpleName ?: "Broadcaster")

    abstract suspend fun requestBroadcast(transaction: Transaction): TransactionResult

    abstract suspend fun findTransaction(transactionHash: String): TransactionResult?

    open fun broadcast(transaction: Transaction, sender: Wallet): Deferred<TransactionResult> = async {
        var polishedTransaction = transaction

        try {
            polishedTransaction = feeEstimator?.invoke(polishedTransaction, sender) ?: transaction

            hook?.onStart(chainId, sender, transaction)
            polishedTransaction = signer?.invoke(polishedTransaction, sender, chainId) ?: transaction

            requestBroadcast(polishedTransaction).also {
                hook?.onSucceed(chainId, sender, transaction, it)
            }
        } catch (e: Throwable) {
            hook?.onError(chainId, sender, transaction, e)

            throw e
        }
    }

    fun wait(
        transactionHash: String,
        intervalMillis: Long = 1000,
        initialMillis: Long = 6000,
        maxCheckCount: Int? = null,
    ): Deferred<TransactionResult> = async {
        repeat(maxCheckCount ?: Int.MAX_VALUE) {
            val transactionResult = findTransaction(transactionHash)

            if (transactionResult != null) {
                return@async transactionResult
            }

            delay(if (it == 0) initialMillis else intervalMillis)
        }

        throw IllegalStateException("Reach maximum check count")
    }
}
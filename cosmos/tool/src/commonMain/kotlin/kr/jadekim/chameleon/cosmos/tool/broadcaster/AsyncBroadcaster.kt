package kr.jadekim.chameleon.cosmos.tool.broadcaster

import cosmos.base.abci.v1beta1.TxResponse
import cosmos.tx.v1beta1.Tx
import kr.jadekim.chameleon.core.tool.FeeEstimator
import kr.jadekim.chameleon.core.tool.TransactionSigner
import kr.jadekim.chameleon.core.tool.broadcaster.BroadcastEventHook
import kotlin.coroutines.CoroutineContext

class AsyncBroadcaster(
    chainId: String,
    private val transactionApi: TransactionApi,
    feeEstimator: FeeEstimator<Tx>? = null,
    signer: TransactionSigner<Tx>? = null,
    handler: BroadcastEventHook<Tx, TxResponse>? = null,
    coroutineContext: CoroutineContext? = null,
) : CosmosBroadcaster(chainId, feeEstimator, signer, handler, coroutineContext) {

    override suspend fun requestBroadcast(transaction: Tx): TxResponse = transactionApi.broadcastAsync(transaction)

    override suspend fun findTransaction(transactionHash: String): TxResponse? =
        transactionApi.findByHash(transactionHash)
}
package kr.jadekim.chameleon.cosmos.tool.broadcaster

import cosmos.base.abci.v1beta1.TxResponse
import cosmos.tx.v1beta1.SimulateResponse
import cosmos.tx.v1beta1.Tx

interface TransactionApi {

    suspend fun simulate(transaction: Tx): SimulateResponse

    suspend fun findByHash(transactionHash: String): TxResponse?

    suspend fun broadcastAsync(transaction: Tx): TxResponse

    suspend fun broadcastSync(transaction: Tx): TxResponse

    @Deprecated("")
    suspend fun broadcastBlock(transaction: Tx): TxResponse
}
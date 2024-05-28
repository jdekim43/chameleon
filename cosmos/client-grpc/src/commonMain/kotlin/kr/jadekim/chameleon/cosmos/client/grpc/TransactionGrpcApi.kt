package kr.jadekim.chameleon.cosmos.client.grpc

import cosmos.base.abci.v1beta1.TxResponse
import cosmos.tx.v1beta1.*
import cosmos.tx.v1beta1.TxConverter.toByteArray
import io.grpc.Status
import io.grpc.StatusException
import kr.jadekim.chameleon.cosmos.tool.broadcaster.TransactionApi

class TransactionGrpcApi(
    client: CosmosGrpcClient,
) : TransactionApi {

    private val service = client.service(cosmos.tx.v1beta1.grpc.ServiceGrpc)

    override suspend fun simulate(transaction: Tx): SimulateResponse {
        return service.simulate(SimulateRequest(transaction, transaction.toByteArray()))
    }

    override suspend fun findByHash(transactionHash: String): TxResponse? {
        try {
            return service.getTx(
                GetTxRequest(transactionHash),
            ).txResponse
        } catch (e: StatusException) {
            if (e.status == Status.NOT_FOUND) {
                return null
            }

            throw e
        }
    }

    override suspend fun broadcastAsync(transaction: Tx): TxResponse = service.broadcastTx(
        BroadcastTxRequest(transaction.toByteArray(), BroadcastMode.BROADCAST_MODE_ASYNC)
    ).txResponse

    override suspend fun broadcastSync(transaction: Tx): TxResponse = service.broadcastTx(
        BroadcastTxRequest(transaction.toByteArray(), BroadcastMode.BROADCAST_MODE_SYNC)
    ).txResponse

    @Deprecated("")
    override suspend fun broadcastBlock(transaction: Tx): TxResponse = service.broadcastTx(
        BroadcastTxRequest(transaction.toByteArray(), BroadcastMode.BROADCAST_MODE_BLOCK)
    ).txResponse
}
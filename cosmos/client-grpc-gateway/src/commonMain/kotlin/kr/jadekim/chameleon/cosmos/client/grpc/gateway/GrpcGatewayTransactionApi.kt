package kr.jadekim.chameleon.cosmos.client.grpc.gateway

import cosmos.base.abci.v1beta1.TxResponse
import cosmos.tx.v1beta1.*
import cosmos.tx.v1beta1.TxConverter.toByteArray
import io.ktor.client.plugins.*
import io.ktor.http.*
import kr.jadekim.chameleon.cosmos.tool.broadcaster.TransactionApi

class GrpcGatewayTransactionApi(client: CosmosGrpcGatewayClient) : TransactionApi {

    private val service = client.service(cosmos.tx.v1beta1.grpc.gateway.ServiceGrpcGateway)

    override suspend fun simulate(transaction: Tx): SimulateResponse {
        return service.simulate(SimulateRequest(transaction, transaction.toByteArray()))
    }

    override suspend fun findByHash(transactionHash: String): TxResponse? {
        try {
            return service.getTx(
                GetTxRequest(transactionHash),
            ).txResponse
        } catch (e: ClientRequestException) {
            if (e.response.status == HttpStatusCode.NotFound) {
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
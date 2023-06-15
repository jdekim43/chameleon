package kr.jadekim.chameleon.cosmos

import cosmos.tx.v1beta1.Tx
import kr.jadekim.chameleon.core.tool.SemaphoreProvider
import kr.jadekim.chameleon.core.type.BigDecimal
import kr.jadekim.chameleon.cosmos.client.grpc.AlwaysFetchAccountInfoProvider
import kr.jadekim.chameleon.cosmos.client.grpc.CosmosGrpcClient
import kr.jadekim.chameleon.cosmos.client.grpc.TransactionGrpcApi
import kr.jadekim.chameleon.cosmos.tool.*
import kr.jadekim.chameleon.cosmos.tool.broadcaster.CosmosBroadcaster
import kr.jadekim.chameleon.cosmos.tool.broadcaster.SyncBroadcaster
import kr.jadekim.chameleon.cosmos.wallet.CosmosWallet

data class CosmosOptions(
    val chainId: String,
    val client: CosmosGrpcClient,
    val accountInfoProvider: AccountInfoProvider? = AlwaysFetchAccountInfoProvider(client),
    val gasPriceProvider: CosmosGasPriceProvider? = StaticGasPriceProvider(mapOf("uatom" to BigDecimal("0.15"))),
    val feeEstimator: CosmosFeeEstimator? = gasPriceProvider?.let {
        CosmosNodeFeeEstimator(
            TransactionGrpcApi(client),
            it
        )
    },
    val semaphoreProvider: SemaphoreProvider? = null,
    val broadcaster: CosmosBroadcaster = SyncBroadcaster(
        chainId,
        TransactionGrpcApi(client),
        feeEstimator,
        accountInfoProvider?.let { CosmosTransactionDirectSigner(it) },
        semaphoreProvider?.let {
            accountInfoProvider?.let {
                CosmosBroadcastEventHandler(semaphoreProvider, accountInfoProvider)
            }
        }
    ),
)

class Cosmos(
    val chainId: String,
    val broadcaster: CosmosBroadcaster,
    val client: CosmosGrpcClient,
) {

    constructor(options: CosmosOptions) : this(options.chainId, options.broadcaster, options.client)

    fun broadcast(transaction: Tx, sender: CosmosWallet) = broadcaster.broadcast(transaction, sender)

    fun broadcast(
        sender: CosmosWallet,
        buildTransaction: CosmosTransactionBuilder.() -> Unit,
    ) = broadcast(CosmosTransactionBuilder().apply(buildTransaction).build(), sender)
}
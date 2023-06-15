package kr.jadekim.chameleon.sei

import cosmos.tx.v1beta1.Tx
import kr.jadekim.chameleon.core.tool.SemaphoreProvider
import kr.jadekim.chameleon.core.type.BigDecimal
import kr.jadekim.chameleon.cosmos.client.grpc.AlwaysFetchAccountInfoProvider
import kr.jadekim.chameleon.cosmos.client.grpc.CosmosGrpcClient
import kr.jadekim.chameleon.cosmos.client.grpc.TransactionGrpcApi
import kr.jadekim.chameleon.cosmos.tool.*
import kr.jadekim.chameleon.cosmos.tool.broadcaster.CosmosBroadcaster
import kr.jadekim.chameleon.cosmos.tool.broadcaster.SyncBroadcaster
import kr.jadekim.chameleon.sei.wallet.SeiWallet

data class SeiOptions(
    val chainId: String,
    val client: CosmosGrpcClient,
    val accountInfoProvider: AccountInfoProvider? = AlwaysFetchAccountInfoProvider(client),
    val gasPriceProvider: CosmosGasPriceProvider? = StaticGasPriceProvider(mapOf("usei" to BigDecimal("0.015"))),
    val feeEstimator: CosmosFeeEstimator? = gasPriceProvider?.let {
        CosmosNodeFeeEstimator(TransactionGrpcApi(client), it)
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

class Sei(
    val chainId: String,
    val broadcaster: CosmosBroadcaster,
    val client: CosmosGrpcClient,
) {

    constructor(options: SeiOptions) : this(options.chainId, options.broadcaster, options.client)

    fun broadcast(transaction: Tx, sender: SeiWallet) = broadcaster.broadcast(transaction, sender)

    fun broadcast(
        sender: SeiWallet,
        buildTransaction: CosmosTransactionBuilder.() -> Unit,
    ) = broadcast(CosmosTransactionBuilder().apply(buildTransaction).build(), sender)
}

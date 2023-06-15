package kr.jadekim.chameleon.terraclassic

import cosmos.tx.v1beta1.Tx
import kr.jadekim.chameleon.core.tool.SemaphoreProvider
import kr.jadekim.chameleon.core.type.BigDecimal
import kr.jadekim.chameleon.cosmos.client.grpc.AlwaysFetchAccountInfoProvider
import kr.jadekim.chameleon.cosmos.client.grpc.CosmosGrpcClient
import kr.jadekim.chameleon.cosmos.client.grpc.TransactionGrpcApi
import kr.jadekim.chameleon.cosmos.tool.*
import kr.jadekim.chameleon.cosmos.tool.broadcaster.CosmosBroadcaster
import kr.jadekim.chameleon.cosmos.tool.broadcaster.SyncBroadcaster
import kr.jadekim.chameleon.terra.wallet.TerraWallet

data class TerraClassicOptions(
    val chainId: String,
    val client: CosmosGrpcClient,
    val accountInfoProvider: AccountInfoProvider? = AlwaysFetchAccountInfoProvider(client),
    val gasPriceProvider: CosmosGasPriceProvider? = StaticGasPriceProvider(mapOf("uluna" to BigDecimal("28.325"))),
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

class TerraClassic(
    val chainId: String,
    val broadcaster: CosmosBroadcaster,
    val client: CosmosGrpcClient,
) {

    constructor(options: TerraClassicOptions) : this(options.chainId, options.broadcaster, options.client)

    fun broadcast(transaction: Tx, sender: TerraWallet) = broadcaster.broadcast(transaction, sender)

    fun broadcast(
        sender: TerraWallet,
        buildTransaction: CosmosTransactionBuilder.() -> Unit,
    ) = broadcast(CosmosTransactionBuilder().apply(buildTransaction).build(), sender)
}
package kr.jadekim.chameleon.terra

import cosmos.tx.v1beta1.Tx
import kr.jadekim.chameleon.core.tool.SemaphoreProvider
import kr.jadekim.chameleon.core.type.BigDecimal
import kr.jadekim.chameleon.cosmos.tool.*
import kr.jadekim.chameleon.cosmos.tool.broadcaster.CosmosBroadcaster
import kr.jadekim.chameleon.cosmos.tool.broadcaster.SyncBroadcaster
import kr.jadekim.chameleon.terra.wallet.TerraWallet
import kr.jadekim.protobuf.type.ProtobufServiceClientOption

data class TerraOptions<ClientOption : ProtobufServiceClientOption>(
    val chainId: String,
    val client: CosmosClient<ClientOption>,
    val accountInfoProvider: AccountInfoProvider? = client.accountInfoProvider(),
    val gasPriceProvider: CosmosGasPriceProvider? = StaticGasPriceProvider(mapOf("uluna" to BigDecimal("0.015"))),
    val feeEstimator: CosmosFeeEstimator? = gasPriceProvider?.let {
        CosmosNodeFeeEstimator(client.transactionApi(), it)
    },
    val semaphoreProvider: SemaphoreProvider? = null,
    val broadcaster: CosmosBroadcaster = SyncBroadcaster(
        chainId,
        client.transactionApi(),
        feeEstimator,
        accountInfoProvider?.let { CosmosTransactionDirectSigner(it) },
        semaphoreProvider?.let {
            accountInfoProvider?.let {
                CosmosBroadcastEventHandler(semaphoreProvider, accountInfoProvider)
            }
        }
    ),
)

class Terra<ClientOption : ProtobufServiceClientOption>(
    val chainId: String,
    val broadcaster: CosmosBroadcaster,
    val client: CosmosClient<ClientOption>,
) {

    constructor(options: TerraOptions<ClientOption>) : this(options.chainId, options.broadcaster, options.client)

    fun broadcast(transaction: Tx, sender: TerraWallet) = broadcaster.broadcast(transaction, sender)

    fun broadcast(
        sender: TerraWallet,
        buildTransaction: TerraTransactionBuilder.() -> Unit,
    ) = broadcast(TerraTransactionBuilder().apply(buildTransaction).build(), sender)
}

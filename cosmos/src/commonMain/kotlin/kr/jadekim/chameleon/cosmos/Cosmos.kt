package kr.jadekim.chameleon.cosmos

import cosmos.tx.v1beta1.Tx
import kr.jadekim.chameleon.core.tool.SemaphoreProvider
import kr.jadekim.chameleon.core.type.BigDecimal
import kr.jadekim.chameleon.cosmos.tool.*
import kr.jadekim.chameleon.cosmos.tool.broadcaster.CosmosBroadcaster
import kr.jadekim.chameleon.cosmos.tool.broadcaster.SyncBroadcaster
import kr.jadekim.chameleon.cosmos.wallet.CosmosWallet
import kr.jadekim.protobuf.type.ProtobufServiceClientOption

data class CosmosOptions<ClientOption : ProtobufServiceClientOption>(
    val chainId: String,
    val client: CosmosClient<ClientOption>,
    val accountInfoProvider: AccountInfoProvider? = client.accountInfoProvider(),
    val gasPriceProvider: CosmosGasPriceProvider? = StaticGasPriceProvider(mapOf("uatom" to BigDecimal("0.15"))),
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

class Cosmos<ClientOption : ProtobufServiceClientOption>(
    val chainId: String,
    val broadcaster: CosmosBroadcaster,
    val client: CosmosClient<ClientOption>,
) {

    constructor(options: CosmosOptions<ClientOption>) : this(options.chainId, options.broadcaster, options.client)

    fun broadcast(transaction: Tx, sender: CosmosWallet) = broadcaster.broadcast(transaction, sender)

    fun broadcast(
        sender: CosmosWallet,
        buildTransaction: CosmosTransactionBuilder.() -> Unit,
    ) = broadcast(CosmosTransactionBuilder().apply(buildTransaction).build(), sender)
}
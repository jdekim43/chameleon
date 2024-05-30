package kr.jadekim.chameleon.sei

import cosmos.tx.v1beta1.Tx
import kr.jadekim.chameleon.core.tool.SemaphoreProvider
import kr.jadekim.chameleon.core.type.BigDecimal
import kr.jadekim.chameleon.cosmos.tool.*
import kr.jadekim.chameleon.cosmos.tool.broadcaster.CosmosBroadcaster
import kr.jadekim.chameleon.cosmos.tool.broadcaster.SyncBroadcaster
import kr.jadekim.chameleon.sei.wallet.SeiWallet
import kr.jadekim.protobuf.type.ProtobufServiceClientOption

data class SeiOptions<ClientOption : ProtobufServiceClientOption>(
    val chainId: String,
    val client: CosmosClient<ClientOption>,
    val accountInfoProvider: AccountInfoProvider? = client.accountInfoProvider(),
    val gasPriceProvider: CosmosGasPriceProvider? = StaticGasPriceProvider(mapOf("usei" to BigDecimal("0.015"))),
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

class Sei<ClientOption : ProtobufServiceClientOption>(
    val chainId: String,
    val broadcaster: CosmosBroadcaster,
    val client: CosmosClient<ClientOption>,
) {

    constructor(options: SeiOptions<ClientOption>) : this(options.chainId, options.broadcaster, options.client)

    fun broadcast(transaction: Tx, sender: SeiWallet) = broadcaster.broadcast(transaction, sender)

    fun broadcast(
        sender: SeiWallet,
        buildTransaction: SeiTransactionBuilder.() -> Unit,
    ) = broadcast(SeiTransactionBuilder().apply(buildTransaction).build(), sender)
}

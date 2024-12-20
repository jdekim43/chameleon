package kr.jadekim.chameleon.initia

import cosmos.tx.v1beta1.Tx
import kr.jadekim.chameleon.core.tool.SemaphoreProvider
import kr.jadekim.chameleon.core.type.BigDecimal
import kr.jadekim.chameleon.cosmos.tool.*
import kr.jadekim.chameleon.cosmos.tool.broadcaster.CosmosBroadcaster
import kr.jadekim.chameleon.cosmos.tool.broadcaster.SyncBroadcaster
import kr.jadekim.chameleon.initia.wallet.InitiaWallet
import kr.jadekim.protobuf.type.ProtobufServiceClient
import kr.jadekim.protobuf.type.ProtobufServiceClientOption

data class InitiaOptions<ClientOption : ProtobufServiceClientOption>(
    val chainId: String,
    val client: CosmosClient<ClientOption>,
    val accountInfoProvider: AccountInfoProvider? = client.accountInfoProvider(),
    val gasPriceProvider: CosmosGasPriceProvider? = StaticGasPriceProvider(mapOf("uinit" to BigDecimal("0.15"))),
    val feeEstimator: CosmosFeeEstimator? = accountInfoProvider?.let { accountInfo ->
        gasPriceProvider?.let { gas ->
            CosmosNodeFeeEstimator(client.transactionApi(), accountInfo, gas, "uinit")
        }
    },
    val semaphoreProvider: SemaphoreProvider? = null,
    val broadcaster: CosmosBroadcaster = SyncBroadcaster(
        chainId,
        client.transactionApi(),
        feeEstimator,
        accountInfoProvider?.let { CosmosTransactionDirectSigner(it) },
        semaphoreProvider?.let {
            accountInfoProvider?.let {
                CosmosBroadcastEventHook(semaphoreProvider, accountInfoProvider)
            }
        }
    ),
)

class Initia<ClientOption : ProtobufServiceClientOption>(
    val chainId: String,
    val broadcaster: CosmosBroadcaster,
    val client: ProtobufServiceClient<ClientOption>,
) {

    constructor(options: InitiaOptions<ClientOption>) : this(options.chainId, options.broadcaster, options.client)

    fun broadcast(transaction: Tx, sender: InitiaWallet) = broadcaster.broadcast(transaction, sender)

    fun broadcast(
        sender: InitiaWallet,
        buildTransaction: InitiaTransactionBuilder.() -> Unit,
    ) = broadcast(InitiaTransactionBuilder().apply(buildTransaction).build(), sender)
}

package kr.jadekim.chameleon.terraclassic

import cosmos.tx.v1beta1.Tx
import kr.jadekim.chameleon.core.tool.SemaphoreProvider
import kr.jadekim.chameleon.core.type.BigDecimal
import kr.jadekim.chameleon.cosmos.tool.*
import kr.jadekim.chameleon.cosmos.tool.broadcaster.CosmosBroadcaster
import kr.jadekim.chameleon.cosmos.tool.broadcaster.SyncBroadcaster
import kr.jadekim.chameleon.terra.wallet.TerraWallet
import kr.jadekim.protobuf.type.ProtobufServiceClientOption

data class TerraClassicOptions<ClientOption : ProtobufServiceClientOption>(
    val chainId: String,
    val client: CosmosClient<ClientOption>,
    val accountInfoProvider: AccountInfoProvider? = client.accountInfoProvider(),
    val gasPriceProvider: CosmosGasPriceProvider? = StaticGasPriceProvider(mapOf("uluna" to BigDecimal("28.325"))),
    val feeEstimator: CosmosFeeEstimator? = accountInfoProvider?.let { accountInfo ->
        gasPriceProvider?.let { gas ->
            CosmosNodeFeeEstimator(client.transactionApi(), accountInfo, gas, "uluna")
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

class TerraClassic<ClientOption : ProtobufServiceClientOption>(
    val chainId: String,
    val broadcaster: CosmosBroadcaster,
    val client: CosmosClient<ClientOption>,
) {

    constructor(options: TerraClassicOptions<ClientOption>) : this(options.chainId, options.broadcaster, options.client)

    fun broadcast(transaction: Tx, sender: TerraWallet) = broadcaster.broadcast(transaction, sender)

    fun broadcast(
        sender: TerraWallet,
        buildTransaction: TerraClassicTransactionBuilder.() -> Unit,
    ) = broadcast(TerraClassicTransactionBuilder().apply(buildTransaction).build(), sender)
}
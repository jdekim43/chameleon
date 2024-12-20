package kr.jadekim.chameleon.cosmos.tool

import cosmos.crypto.secp256k1.PubKey
import cosmos.crypto.secp256k1.toAny
import cosmos.tx.signing.v1beta1.SignMode
import cosmos.tx.v1beta1.ModeInfo
import cosmos.tx.v1beta1.SignerInfo
import cosmos.tx.v1beta1.Tx
import kr.jadekim.chameleon.core.tool.FeeEstimator
import kr.jadekim.chameleon.core.type.*
import kr.jadekim.chameleon.core.wallet.Wallet
import kr.jadekim.chameleon.cosmos.tool.broadcaster.TransactionApi
import kr.jadekim.chameleon.cosmos.type.CosmosFee
import kr.jadekim.chameleon.cosmos.type.toProto
import kr.jadekim.chameleon.cosmos.type.toType

open class CosmosEstimateFeeException(
    val transaction: Tx,
    val sender: Wallet,
    val reason: String,
    cause: Throwable? = null,
) : Exception(reason, cause)

abstract class CosmosFeeEstimator(
    val gasPriceProvider: CosmosGasPriceProvider,
    var feeDenomination: String,
) : FeeEstimator<Tx> {

    constructor(
        gasPrices: Map<String, BigDecimal>,
        feeDenomination: String,
    ) : this(StaticGasPriceProvider(gasPrices), feeDenomination)

    protected abstract suspend fun estimate(
        transaction: Tx,
        sender: Wallet,
        gasPrice: CoinDecimal,
    ): CosmosFee

    override suspend fun invoke(transaction: Tx, sender: Wallet): Tx = estimate(transaction, sender).second

    suspend fun estimate(transaction: Tx, sender: Wallet): Pair<CosmosFee, Tx> {
        var fee = transaction.authInfo.fee.toType()
        if (fee.amounts.isNotEmpty()) {
            return fee to transaction
        }

        if (fee.gasAmount > 0u) {
            fee = fee.copy(amounts = listOf(calculateGasFee(fee.gasAmount)))

            return fee to transaction.setFee(fee)
        }

        val gasPrice = gasPriceProvider.get(feeDenomination)

        fee = try {
            estimate(transaction, sender, gasPrice)
        } catch (e: Exception) {
            throw CosmosEstimateFeeException(transaction, sender, e.message ?: "Fail to estimate fee", e)
        }

        return fee to transaction.setFee(fee)
    }

    suspend fun calculateGasFee(gasAmount: ULong): Coin {
        val gasPrice = gasPriceProvider.get(feeDenomination)

        return (gasAmount.toBigDecimal() * gasPrice).toCoin()
    }

    protected fun Tx.setFee(fee: CosmosFee): Tx = copy(authInfo = authInfo.copy(fee = fee.toProto()))
}

open class CosmosNodeFeeEstimator(
    private val transactionApi: TransactionApi,
    private val accountInfoProvider: AccountInfoProvider,
    gasPriceProvider: CosmosGasPriceProvider,
    feeDenomination: String,
    var gasAdjustment: Float = DEFAULT_GAS_ADJUSTMENT,
    var simulateGasLimit: ULong = 10_000_000u,
) : CosmosFeeEstimator(gasPriceProvider, feeDenomination) {

    companion object {
        const val DEFAULT_GAS_ADJUSTMENT: Float = 1.2f
    }

    override suspend fun estimate(
        transaction: Tx,
        sender: Wallet,
        gasPrice: CoinDecimal,
    ): CosmosFee {
        val result = transactionApi.simulate(polishTransaction(transaction, sender))

        return CosmosFee(
            (result.gasInfo.gasUsed.toDouble() * gasAdjustment).toULong(),
            gasPrice,
            sender.address.text,
        )
    }

    protected open suspend fun polishTransaction(transaction: Tx, sender: Wallet): Tx {
        var polishedTransaction = transaction

        val safeLimit = CosmosFee(simulateGasLimit, emptyList(), "", "")
        polishedTransaction = polishedTransaction.setFee(safeLimit)

        if (polishedTransaction.authInfo.signerInfos.isEmpty()) {
            polishedTransaction = polishedTransaction.copy(
                authInfo = polishedTransaction.authInfo.copy(
                    signerInfos = listOf(createSignerInfo(sender)),
                ),
                signatures = listOf(byteArrayOf())
            )
        }

        return polishedTransaction
    }

    protected open suspend fun createSignerInfo(sender: Wallet): SignerInfo {
        val key = sender.key ?: throw IllegalArgumentException("Wallet must have a key")
        val sequence = accountInfoProvider.get(sender.address.text)?.sequence ?: 0u

        return SignerInfo(
            PubKey(key.publicKey).toAny(),
            ModeInfo(ModeInfo.SumOneOf.Single(ModeInfo.Single(SignMode.SIGN_MODE_UNSPECIFIED))),
            sequence,
        )
    }
}

package kr.jadekim.chameleon.cosmos.tool

import cosmos.crypto.secp256k1.PubKey
import cosmos.crypto.secp256k1.PubKeyJvmConverter.toByteArray
import cosmos.tx.signing.v1beta1.SignMode
import cosmos.tx.v1beta1.ModeInfo
import cosmos.tx.v1beta1.SignerInfo
import cosmos.tx.v1beta1.Tx
import google.protobuf.Any
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
    var gasAdjustment: Float = DEFAULT_GAS_ADJUSTMENT,
) : FeeEstimator<Tx> {

    companion object {
        const val DEFAULT_GAS_ADJUSTMENT: Float = 1.2f
    }

    constructor(
        gasPrices: Map<String, BigDecimal>,
        feeDenomination: String,
        gasAdjustment: Float = DEFAULT_GAS_ADJUSTMENT,
    ) : this(StaticGasPriceProvider(gasPrices), feeDenomination, gasAdjustment)

    protected abstract suspend fun estimate(
        transaction: Tx,
        sender: Wallet,
        gasPrice: CoinDecimal,
        gasAdjustment: Float,
    ): CosmosFee

    override suspend fun invoke(transaction: Tx, sender: Wallet): Tx = estimate(transaction, sender).second

    suspend fun estimate(transaction: Tx, sender: Wallet): Pair<CosmosFee, Tx> {
        var fee = transaction.authInfo.fee.toType()
        if (fee.amounts.isNotEmpty()) {
            return fee to transaction
        }

        if (fee.gasAmount > 0u) {
            fee = fee.copy(amounts = listOf(calculateGasFee(transaction.authInfo.fee.gasLimit)))

            return fee to transaction.setFee(fee)
        }

        val gasPrice = gasPriceProvider.get(feeDenomination)

        fee = try {
            estimate(transaction, sender, gasPrice, gasAdjustment)
        } catch (e: Exception) {
            throw CosmosEstimateFeeException(transaction, sender, e.message ?: "Fail to estimate fee", e)
        }

        return fee to transaction.setFee(fee)
    }

    suspend fun calculateGasFee(gasAmount: ULong): Coin {
        val gasPrice = gasPriceProvider.get(feeDenomination)

        return (gasAdjustment.toBigDecimal() * gasAmount.toBigDecimal() * gasPrice).toCoin()
    }

    private fun Tx.setFee(fee: CosmosFee): Tx = copy(authInfo = authInfo.copy(fee = fee.toProto()))
}

class CosmosNodeFeeEstimator(
    private val transactionApi: TransactionApi,
    gasPriceProvider: CosmosGasPriceProvider,
    feeDenomination: String = "uatom",
    gasAdjustment: Float = DEFAULT_GAS_ADJUSTMENT,
) : CosmosFeeEstimator(gasPriceProvider, feeDenomination, gasAdjustment) {

    override suspend fun estimate(
        transaction: Tx,
        sender: Wallet,
        gasPrice: CoinDecimal,
        gasAdjustment: Float,
    ): CosmosFee {
        var polishedTransaction = transaction
        if (polishedTransaction.authInfo.signerInfos.isEmpty()) {
            val key = sender.key ?: throw IllegalArgumentException("Wallet must have a key")
            polishedTransaction = polishedTransaction.copy(
                authInfo = polishedTransaction.authInfo.copy(
                    signerInfos = listOf(
                        SignerInfo(
                            Any(
                                PubKey.TYPE_URL,
                                PubKey(key.publicKey).toByteArray(),
                            ),
                            ModeInfo(ModeInfo.SumOneOf.Single(ModeInfo.Single(SignMode.SIGN_MODE_DIRECT))),
                            0u,
                        ),
                    ),
                ),
            )
        }

        val result = transactionApi.simulate(polishedTransaction)

        return CosmosFee(
            (result.gasInfo.gasUsed.toDouble() * gasAdjustment).toULong(),
            gasPrice,
            sender.address.text,
        )
    }
}

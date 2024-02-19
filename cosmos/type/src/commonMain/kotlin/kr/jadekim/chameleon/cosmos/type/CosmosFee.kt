package kr.jadekim.chameleon.cosmos.type

import kr.jadekim.chameleon.core.type.*

data class CosmosFee(
    val gasAmount: ULong,
    override val amounts: List<Coin>,
    override val payer: String,
    val granter: String = payer,
) : TransactionFee {

    constructor(payer: String) : this(0u, emptyList(), payer)

    constructor(
        gasAmount: ULong,
        gasPrice: CoinDecimal,
        payer: String,
        granter: String = payer,
    ) : this(
        gasAmount,
        listOf((gasPrice * gasAmount.toBigInteger()).toCoin() + BigInteger.ONE),
        payer,
        granter,
    )
}

fun CosmosFee.toProto() = cosmos.tx.v1beta1.Fee(
    amounts.map { it.toProto() },
    gasAmount,
    payer,
    granter,
)

fun cosmos.tx.v1beta1.Fee.toType() = CosmosFee(
    gasLimit,
    amount.map { it.toType() },
    payer,
    granter,
)

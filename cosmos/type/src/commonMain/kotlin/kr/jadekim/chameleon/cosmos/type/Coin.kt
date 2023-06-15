package kr.jadekim.chameleon.cosmos.type

import kr.jadekim.chameleon.core.type.BigDecimal
import kr.jadekim.chameleon.core.type.BigInteger
import kr.jadekim.chameleon.core.type.Coin
import kr.jadekim.chameleon.core.type.CoinDecimal

fun Coin.toProto() = cosmos.base.v1beta1.Coin(
    denom = denomination,
    amount = amount.toString(),
)

fun cosmos.base.v1beta1.Coin.toType() = Coin(denom, BigInteger(amount))

fun CoinDecimal.toProto() = cosmos.base.v1beta1.DecCoin(
    denom = denomination,
    amount = amount.toString(),
)

fun cosmos.base.v1beta1.DecCoin.toType() = CoinDecimal(denom, BigDecimal(amount))

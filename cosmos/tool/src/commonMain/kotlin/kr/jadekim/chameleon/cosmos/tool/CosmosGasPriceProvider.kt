package kr.jadekim.chameleon.cosmos.tool

import kr.jadekim.chameleon.core.type.BigDecimal
import kr.jadekim.chameleon.core.type.CoinDecimal

interface CosmosGasPriceProvider {

    suspend fun get(denomination: String): CoinDecimal
}

class StaticGasPriceProvider(val gasPrices: Map<String, BigDecimal>) : CosmosGasPriceProvider {

    override suspend fun get(denomination: String): CoinDecimal {
        return CoinDecimal(
            denomination,
            gasPrices[denomination] ?: throw IllegalStateException("Can't get gas price for $denomination"),
        )
    }
}

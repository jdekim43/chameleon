package kr.jadekim.chameleon.core.type

data class Coin(
    val amount: BigInteger,
    val denomination: String,
) {

    constructor(denomination: String, amount: BigInteger) : this(amount, denomination)

    override fun toString(): String = amount.toString() + denomination
}

operator fun Coin.plus(amount: BigInteger): Coin = copy(amount = this.amount.plus(amount))

operator fun Coin.minus(amount: BigInteger): Coin = copy(amount = this.amount.minus(amount))

operator fun Coin.times(amount: BigInteger): Coin = copy(amount = this.amount.times(amount))

operator fun Coin.div(amount: BigInteger): Coin = copy(amount = this.amount.div(amount))

operator fun Coin.rem(amount: BigInteger): Coin = copy(amount = this.amount.rem(amount))

operator fun BigInteger.plus(coin: Coin): Coin = coin.copy(amount = coin.amount.plus(this))

operator fun BigInteger.minus(coin: Coin): Coin = coin.copy(amount = coin.amount.minus(this))

operator fun BigInteger.times(coin: Coin): Coin = coin.copy(amount = coin.amount.times(this))

operator fun BigInteger.div(coin: Coin): Coin = coin.copy(amount = coin.amount.div(this))

operator fun BigInteger.rem(coin: Coin): Coin = coin.copy(amount = coin.amount.rem(this))

operator fun List<Coin>.plus(coin: Coin): List<Coin> {
    val index = indexOfFirst { it.denomination == coin.denomination }

    return toMutableList().apply {
        if (index < 0) {
            add(coin)
        }

        set(index, get(index).plus(coin.amount))
    }
}

operator fun List<Coin>.minus(coin: Coin): List<Coin> {
    val index = indexOfFirst { it.denomination == coin.denomination }

    return toMutableList().apply {
        if (index < 0) {
            add(coin)
        }

        set(index, get(index).minus(coin.amount))
    }
}

operator fun List<Coin>.times(coin: Coin): List<Coin> {
    val index = indexOfFirst { it.denomination == coin.denomination }

    return toMutableList().apply {
        if (index < 0) {
            add(coin)
        }

        set(index, get(index).times(coin.amount))
    }
}

operator fun List<Coin>.div(coin: Coin): List<Coin> {
    val index = indexOfFirst { it.denomination == coin.denomination }

    return toMutableList().apply {
        if (index < 0) {
            add(coin)
        }

        set(index, get(index).div(coin.amount))
    }
}

operator fun List<Coin>.rem(coin: Coin): List<Coin> {
    val index = indexOfFirst { it.denomination == coin.denomination }

    return toMutableList().apply {
        if (index < 0) {
            add(coin)
        }

        set(index, get(index).rem(coin.amount))
    }
}

data class CoinDecimal(
    val amount: BigDecimal,
    val denomination: String,
) {

    constructor(denomination: String, amount: BigDecimal) : this(amount, denomination)

    override fun toString(): String = amount.toString() + denomination

    fun toCoin() = Coin(denomination, amount.toBigInteger())
}

operator fun CoinDecimal.plus(amount: BigDecimal): CoinDecimal = copy(amount = this.amount.plus(amount))

operator fun CoinDecimal.minus(amount: BigDecimal): CoinDecimal = copy(amount = this.amount.minus(amount))

operator fun CoinDecimal.times(amount: BigDecimal): CoinDecimal = copy(amount = this.amount.times(amount))

operator fun CoinDecimal.div(amount: BigDecimal): CoinDecimal = copy(amount = this.amount.div(amount))

operator fun CoinDecimal.rem(amount: BigDecimal): CoinDecimal = copy(amount = this.amount.rem(amount))

operator fun BigDecimal.plus(coin: CoinDecimal): CoinDecimal = coin.copy(amount = coin.amount.plus(this))

operator fun BigDecimal.minus(coin: CoinDecimal): CoinDecimal = coin.copy(amount = coin.amount.minus(this))

operator fun BigDecimal.times(coin: CoinDecimal): CoinDecimal = coin.copy(amount = coin.amount.times(this))

operator fun BigDecimal.div(coin: CoinDecimal): CoinDecimal = coin.copy(amount = coin.amount.div(this))

operator fun BigDecimal.rem(coin: CoinDecimal): CoinDecimal = coin.copy(amount = coin.amount.rem(this))

operator fun CoinDecimal.plus(amount: BigInteger): CoinDecimal = copy(amount = this.amount.plus(amount))

operator fun CoinDecimal.minus(amount: BigInteger): CoinDecimal = copy(amount = this.amount.minus(amount))

operator fun CoinDecimal.times(amount: BigInteger): CoinDecimal = copy(amount = this.amount.times(amount))

operator fun CoinDecimal.div(amount: BigInteger): CoinDecimal = copy(amount = this.amount.div(amount))

operator fun CoinDecimal.rem(amount: BigInteger): CoinDecimal = copy(amount = this.amount.rem(amount))

operator fun BigInteger.plus(coin: CoinDecimal): CoinDecimal = coin.copy(amount = coin.amount.plus(this))

operator fun BigInteger.minus(coin: CoinDecimal): CoinDecimal = coin.copy(amount = coin.amount.minus(this))

operator fun BigInteger.times(coin: CoinDecimal): CoinDecimal = coin.copy(amount = coin.amount.times(this))

operator fun BigInteger.div(coin: CoinDecimal): CoinDecimal = coin.copy(amount = coin.amount.div(this))

operator fun BigInteger.rem(coin: CoinDecimal): CoinDecimal = coin.copy(amount = coin.amount.rem(this))

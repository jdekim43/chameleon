package kr.jadekim.chameleon.core.type

interface TransactionFee {
    val amounts: List<Coin>
    val payer: String
}
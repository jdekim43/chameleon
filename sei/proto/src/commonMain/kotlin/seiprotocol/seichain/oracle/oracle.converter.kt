// Transform from oracle/oracle.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.oracle

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ParamsConverter : ProtobufConverter<Params>

public fun Params.toAny(): Any = Any(Params.TYPE_URL, with(ParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Params>): Params {
  if (typeUrl != Params.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DenomConverter : ProtobufConverter<Denom>

public fun Denom.toAny(): Any = Any(Denom.TYPE_URL, with(DenomConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Denom>): Denom {
  if (typeUrl != Denom.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AggregateExchangeRateVoteConverter :
    ProtobufConverter<AggregateExchangeRateVote>

public fun AggregateExchangeRateVote.toAny(): Any = Any(AggregateExchangeRateVote.TYPE_URL,
    with(AggregateExchangeRateVoteConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AggregateExchangeRateVote>):
    AggregateExchangeRateVote {
  if (typeUrl != AggregateExchangeRateVote.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ExchangeRateTupleConverter : ProtobufConverter<ExchangeRateTuple>

public fun ExchangeRateTuple.toAny(): Any = Any(ExchangeRateTuple.TYPE_URL,
    with(ExchangeRateTupleConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ExchangeRateTuple>): ExchangeRateTuple {
  if (typeUrl != ExchangeRateTuple.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OracleExchangeRateConverter : ProtobufConverter<OracleExchangeRate>

public fun OracleExchangeRate.toAny(): Any = Any(OracleExchangeRate.TYPE_URL,
    with(OracleExchangeRateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<OracleExchangeRate>): OracleExchangeRate {
  if (typeUrl != OracleExchangeRate.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PriceSnapshotItemConverter : ProtobufConverter<PriceSnapshotItem>

public fun PriceSnapshotItem.toAny(): Any = Any(PriceSnapshotItem.TYPE_URL,
    with(PriceSnapshotItemConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PriceSnapshotItem>): PriceSnapshotItem {
  if (typeUrl != PriceSnapshotItem.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PriceSnapshotConverter : ProtobufConverter<PriceSnapshot>

public fun PriceSnapshot.toAny(): Any = Any(PriceSnapshot.TYPE_URL, with(PriceSnapshotConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PriceSnapshot>): PriceSnapshot {
  if (typeUrl != PriceSnapshot.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OracleTwapConverter : ProtobufConverter<OracleTwap>

public fun OracleTwap.toAny(): Any = Any(OracleTwap.TYPE_URL, with(OracleTwapConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<OracleTwap>): OracleTwap {
  if (typeUrl != OracleTwap.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object VotePenaltyCounterConverter : ProtobufConverter<VotePenaltyCounter>

public fun VotePenaltyCounter.toAny(): Any = Any(VotePenaltyCounter.TYPE_URL,
    with(VotePenaltyCounterConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<VotePenaltyCounter>): VotePenaltyCounter {
  if (typeUrl != VotePenaltyCounter.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

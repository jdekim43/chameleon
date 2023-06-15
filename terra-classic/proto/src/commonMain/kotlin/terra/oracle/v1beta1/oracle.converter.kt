// Transform from terra/oracle/v1beta1/oracle.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.oracle.v1beta1

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

public expect object AggregateExchangeRatePrevoteConverter :
    ProtobufConverter<AggregateExchangeRatePrevote>

public fun AggregateExchangeRatePrevote.toAny(): Any = Any(AggregateExchangeRatePrevote.TYPE_URL,
    with(AggregateExchangeRatePrevoteConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AggregateExchangeRatePrevote>):
    AggregateExchangeRatePrevote {
  if (typeUrl != AggregateExchangeRatePrevote.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
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

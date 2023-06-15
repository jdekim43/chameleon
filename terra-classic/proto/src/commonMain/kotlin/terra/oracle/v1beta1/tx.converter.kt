// Transform from terra/oracle/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.oracle.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgAggregateExchangeRatePrevoteConverter :
    ProtobufConverter<MsgAggregateExchangeRatePrevote>

public fun MsgAggregateExchangeRatePrevote.toAny(): Any =
    Any(MsgAggregateExchangeRatePrevote.TYPE_URL, with(MsgAggregateExchangeRatePrevoteConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgAggregateExchangeRatePrevote>):
    MsgAggregateExchangeRatePrevote {
  if (typeUrl != MsgAggregateExchangeRatePrevote.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgAggregateExchangeRatePrevoteResponseConverter :
    ProtobufConverter<MsgAggregateExchangeRatePrevoteResponse>

public fun MsgAggregateExchangeRatePrevoteResponse.toAny(): Any =
    Any(MsgAggregateExchangeRatePrevoteResponse.TYPE_URL,
    with(MsgAggregateExchangeRatePrevoteResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgAggregateExchangeRatePrevoteResponse>):
    MsgAggregateExchangeRatePrevoteResponse {
  if (typeUrl != MsgAggregateExchangeRatePrevoteResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgAggregateExchangeRateVoteConverter :
    ProtobufConverter<MsgAggregateExchangeRateVote>

public fun MsgAggregateExchangeRateVote.toAny(): Any = Any(MsgAggregateExchangeRateVote.TYPE_URL,
    with(MsgAggregateExchangeRateVoteConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgAggregateExchangeRateVote>):
    MsgAggregateExchangeRateVote {
  if (typeUrl != MsgAggregateExchangeRateVote.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgAggregateExchangeRateVoteResponseConverter :
    ProtobufConverter<MsgAggregateExchangeRateVoteResponse>

public fun MsgAggregateExchangeRateVoteResponse.toAny(): Any =
    Any(MsgAggregateExchangeRateVoteResponse.TYPE_URL,
    with(MsgAggregateExchangeRateVoteResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgAggregateExchangeRateVoteResponse>):
    MsgAggregateExchangeRateVoteResponse {
  if (typeUrl != MsgAggregateExchangeRateVoteResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgDelegateFeedConsentConverter : ProtobufConverter<MsgDelegateFeedConsent>

public fun MsgDelegateFeedConsent.toAny(): Any = Any(MsgDelegateFeedConsent.TYPE_URL,
    with(MsgDelegateFeedConsentConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgDelegateFeedConsent>): MsgDelegateFeedConsent {
  if (typeUrl != MsgDelegateFeedConsent.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgDelegateFeedConsentResponseConverter :
    ProtobufConverter<MsgDelegateFeedConsentResponse>

public fun MsgDelegateFeedConsentResponse.toAny(): Any =
    Any(MsgDelegateFeedConsentResponse.TYPE_URL, with(MsgDelegateFeedConsentResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgDelegateFeedConsentResponse>):
    MsgDelegateFeedConsentResponse {
  if (typeUrl != MsgDelegateFeedConsentResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

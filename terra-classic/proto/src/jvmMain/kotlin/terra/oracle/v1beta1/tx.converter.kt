// Transform from terra/oracle/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.oracle.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgAggregateExchangeRatePrevoteConverter :
    ProtobufConverter<MsgAggregateExchangeRatePrevote> by
    MsgAggregateExchangeRatePrevoteJvmConverter

public actual object MsgAggregateExchangeRatePrevoteResponseConverter :
    ProtobufConverter<MsgAggregateExchangeRatePrevoteResponse> by
    MsgAggregateExchangeRatePrevoteResponseJvmConverter

public actual object MsgAggregateExchangeRateVoteConverter :
    ProtobufConverter<MsgAggregateExchangeRateVote> by MsgAggregateExchangeRateVoteJvmConverter

public actual object MsgAggregateExchangeRateVoteResponseConverter :
    ProtobufConverter<MsgAggregateExchangeRateVoteResponse> by
    MsgAggregateExchangeRateVoteResponseJvmConverter

public actual object MsgDelegateFeedConsentConverter : ProtobufConverter<MsgDelegateFeedConsent> by
    MsgDelegateFeedConsentJvmConverter

public actual object MsgDelegateFeedConsentResponseConverter :
    ProtobufConverter<MsgDelegateFeedConsentResponse> by MsgDelegateFeedConsentResponseJvmConverter

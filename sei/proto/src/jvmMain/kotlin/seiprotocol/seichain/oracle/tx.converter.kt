// Transform from oracle/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.oracle

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgAggregateExchangeRateVoteConverter :
    ProtobufConverter<MsgAggregateExchangeRateVote> by MsgAggregateExchangeRateVoteJvmConverter

public actual object MsgAggregateExchangeRateVoteResponseConverter :
    ProtobufConverter<MsgAggregateExchangeRateVoteResponse> by
    MsgAggregateExchangeRateVoteResponseJvmConverter

public actual object MsgDelegateFeedConsentConverter : ProtobufConverter<MsgDelegateFeedConsent> by
    MsgDelegateFeedConsentJvmConverter

public actual object MsgDelegateFeedConsentResponseConverter :
    ProtobufConverter<MsgDelegateFeedConsentResponse> by MsgDelegateFeedConsentResponseJvmConverter

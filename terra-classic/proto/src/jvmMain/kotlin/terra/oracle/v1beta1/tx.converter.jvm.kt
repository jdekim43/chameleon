// Transform from terra/oracle/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.oracle.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgAggregateExchangeRatePrevoteJvmConverter :
    ProtobufTypeMapper<MsgAggregateExchangeRatePrevote, Tx.MsgAggregateExchangeRatePrevote> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgAggregateExchangeRatePrevote.getDescriptor()

  public override val parser: Parser<Tx.MsgAggregateExchangeRatePrevote> =
      Tx.MsgAggregateExchangeRatePrevote.parser()

  public override fun convert(obj: Tx.MsgAggregateExchangeRatePrevote):
      MsgAggregateExchangeRatePrevote = MsgAggregateExchangeRatePrevote(
  	hash = obj.getHash(),
  	feeder = obj.getFeeder(),
  	validator = obj.getValidator(),
  )

  public override fun convert(obj: MsgAggregateExchangeRatePrevote):
      Tx.MsgAggregateExchangeRatePrevote {
    val builder = Tx.MsgAggregateExchangeRatePrevote.newBuilder()
    builder.setHash(obj.hash)
    builder.setFeeder(obj.feeder)
    builder.setValidator(obj.validator)
    return builder.build()
  }
}

public object MsgAggregateExchangeRatePrevoteResponseJvmConverter :
    ProtobufTypeMapper<MsgAggregateExchangeRatePrevoteResponse, Tx.MsgAggregateExchangeRatePrevoteResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgAggregateExchangeRatePrevoteResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgAggregateExchangeRatePrevoteResponse> =
      Tx.MsgAggregateExchangeRatePrevoteResponse.parser()

  public override fun convert(obj: Tx.MsgAggregateExchangeRatePrevoteResponse):
      MsgAggregateExchangeRatePrevoteResponse = MsgAggregateExchangeRatePrevoteResponse(
  )

  public override fun convert(obj: MsgAggregateExchangeRatePrevoteResponse):
      Tx.MsgAggregateExchangeRatePrevoteResponse {
    val builder = Tx.MsgAggregateExchangeRatePrevoteResponse.newBuilder()
    return builder.build()
  }
}

public object MsgAggregateExchangeRateVoteJvmConverter :
    ProtobufTypeMapper<MsgAggregateExchangeRateVote, Tx.MsgAggregateExchangeRateVote> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgAggregateExchangeRateVote.getDescriptor()

  public override val parser: Parser<Tx.MsgAggregateExchangeRateVote> =
      Tx.MsgAggregateExchangeRateVote.parser()

  public override fun convert(obj: Tx.MsgAggregateExchangeRateVote): MsgAggregateExchangeRateVote =
      MsgAggregateExchangeRateVote(
  	salt = obj.getSalt(),
  	exchangeRates = obj.getExchangeRates(),
  	feeder = obj.getFeeder(),
  	validator = obj.getValidator(),
  )

  public override fun convert(obj: MsgAggregateExchangeRateVote): Tx.MsgAggregateExchangeRateVote {
    val builder = Tx.MsgAggregateExchangeRateVote.newBuilder()
    builder.setSalt(obj.salt)
    builder.setExchangeRates(obj.exchangeRates)
    builder.setFeeder(obj.feeder)
    builder.setValidator(obj.validator)
    return builder.build()
  }
}

public object MsgAggregateExchangeRateVoteResponseJvmConverter :
    ProtobufTypeMapper<MsgAggregateExchangeRateVoteResponse, Tx.MsgAggregateExchangeRateVoteResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgAggregateExchangeRateVoteResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgAggregateExchangeRateVoteResponse> =
      Tx.MsgAggregateExchangeRateVoteResponse.parser()

  public override fun convert(obj: Tx.MsgAggregateExchangeRateVoteResponse):
      MsgAggregateExchangeRateVoteResponse = MsgAggregateExchangeRateVoteResponse(
  )

  public override fun convert(obj: MsgAggregateExchangeRateVoteResponse):
      Tx.MsgAggregateExchangeRateVoteResponse {
    val builder = Tx.MsgAggregateExchangeRateVoteResponse.newBuilder()
    return builder.build()
  }
}

public object MsgDelegateFeedConsentJvmConverter :
    ProtobufTypeMapper<MsgDelegateFeedConsent, Tx.MsgDelegateFeedConsent> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgDelegateFeedConsent.getDescriptor()

  public override val parser: Parser<Tx.MsgDelegateFeedConsent> = Tx.MsgDelegateFeedConsent.parser()

  public override fun convert(obj: Tx.MsgDelegateFeedConsent): MsgDelegateFeedConsent =
      MsgDelegateFeedConsent(
  	`operator` = obj.getOperator(),
  	`delegate` = obj.getDelegate(),
  )

  public override fun convert(obj: MsgDelegateFeedConsent): Tx.MsgDelegateFeedConsent {
    val builder = Tx.MsgDelegateFeedConsent.newBuilder()
    builder.setOperator(obj.`operator`)
    builder.setDelegate(obj.`delegate`)
    return builder.build()
  }
}

public object MsgDelegateFeedConsentResponseJvmConverter :
    ProtobufTypeMapper<MsgDelegateFeedConsentResponse, Tx.MsgDelegateFeedConsentResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgDelegateFeedConsentResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgDelegateFeedConsentResponse> =
      Tx.MsgDelegateFeedConsentResponse.parser()

  public override fun convert(obj: Tx.MsgDelegateFeedConsentResponse):
      MsgDelegateFeedConsentResponse = MsgDelegateFeedConsentResponse(
  )

  public override fun convert(obj: MsgDelegateFeedConsentResponse):
      Tx.MsgDelegateFeedConsentResponse {
    val builder = Tx.MsgDelegateFeedConsentResponse.newBuilder()
    return builder.build()
  }
}

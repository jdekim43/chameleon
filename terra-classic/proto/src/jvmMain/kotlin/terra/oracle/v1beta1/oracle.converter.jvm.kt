// Transform from terra/oracle/v1beta1/oracle.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.oracle.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ParamsJvmConverter : ProtobufTypeMapper<Params, Oracle.Params> {
  public override val descriptor: Descriptors.Descriptor = Oracle.Params.getDescriptor()

  public override val parser: Parser<Oracle.Params> = Oracle.Params.parser()

  public override fun convert(obj: Oracle.Params): Params = Params(
  	votePeriod = obj.getVotePeriod().asKotlinType,
  	voteThreshold = obj.getVoteThreshold(),
  	rewardBand = obj.getRewardBand(),
  	rewardDistributionWindow = obj.getRewardDistributionWindow().asKotlinType,
  	whitelist = obj.getWhitelistList().map { DenomJvmConverter.convert(it) },
  	slashFraction = obj.getSlashFraction(),
  	slashWindow = obj.getSlashWindow().asKotlinType,
  	minValidPerWindow = obj.getMinValidPerWindow(),
  )

  public override fun convert(obj: Params): Oracle.Params {
    val builder = Oracle.Params.newBuilder()
    builder.setVotePeriod(obj.votePeriod.asJavaType)
    builder.setVoteThreshold(obj.voteThreshold)
    builder.setRewardBand(obj.rewardBand)
    builder.setRewardDistributionWindow(obj.rewardDistributionWindow.asJavaType)
    builder.addAllWhitelist(obj.whitelist.map { DenomJvmConverter.convert(it) })
    builder.setSlashFraction(obj.slashFraction)
    builder.setSlashWindow(obj.slashWindow.asJavaType)
    builder.setMinValidPerWindow(obj.minValidPerWindow)
    return builder.build()
  }
}

public object DenomJvmConverter : ProtobufTypeMapper<Denom, Oracle.Denom> {
  public override val descriptor: Descriptors.Descriptor = Oracle.Denom.getDescriptor()

  public override val parser: Parser<Oracle.Denom> = Oracle.Denom.parser()

  public override fun convert(obj: Oracle.Denom): Denom = Denom(
  	name = obj.getName(),
  	tobinTax = obj.getTobinTax(),
  )

  public override fun convert(obj: Denom): Oracle.Denom {
    val builder = Oracle.Denom.newBuilder()
    builder.setName(obj.name)
    builder.setTobinTax(obj.tobinTax)
    return builder.build()
  }
}

public object AggregateExchangeRatePrevoteJvmConverter :
    ProtobufTypeMapper<AggregateExchangeRatePrevote, Oracle.AggregateExchangeRatePrevote> {
  public override val descriptor: Descriptors.Descriptor =
      Oracle.AggregateExchangeRatePrevote.getDescriptor()

  public override val parser: Parser<Oracle.AggregateExchangeRatePrevote> =
      Oracle.AggregateExchangeRatePrevote.parser()

  public override fun convert(obj: Oracle.AggregateExchangeRatePrevote):
      AggregateExchangeRatePrevote = AggregateExchangeRatePrevote(
  	hash = obj.getHash(),
  	voter = obj.getVoter(),
  	submitBlock = obj.getSubmitBlock().asKotlinType,
  )

  public override fun convert(obj: AggregateExchangeRatePrevote):
      Oracle.AggregateExchangeRatePrevote {
    val builder = Oracle.AggregateExchangeRatePrevote.newBuilder()
    builder.setHash(obj.hash)
    builder.setVoter(obj.voter)
    builder.setSubmitBlock(obj.submitBlock.asJavaType)
    return builder.build()
  }
}

public object AggregateExchangeRateVoteJvmConverter :
    ProtobufTypeMapper<AggregateExchangeRateVote, Oracle.AggregateExchangeRateVote> {
  public override val descriptor: Descriptors.Descriptor =
      Oracle.AggregateExchangeRateVote.getDescriptor()

  public override val parser: Parser<Oracle.AggregateExchangeRateVote> =
      Oracle.AggregateExchangeRateVote.parser()

  public override fun convert(obj: Oracle.AggregateExchangeRateVote): AggregateExchangeRateVote =
      AggregateExchangeRateVote(
  	exchangeRateTuples = obj.getExchangeRateTuplesList().map {
      ExchangeRateTupleJvmConverter.convert(it) },
  	voter = obj.getVoter(),
  )

  public override fun convert(obj: AggregateExchangeRateVote): Oracle.AggregateExchangeRateVote {
    val builder = Oracle.AggregateExchangeRateVote.newBuilder()
    builder.addAllExchangeRateTuples(obj.exchangeRateTuples.map {
        ExchangeRateTupleJvmConverter.convert(it) })
    builder.setVoter(obj.voter)
    return builder.build()
  }
}

public object ExchangeRateTupleJvmConverter :
    ProtobufTypeMapper<ExchangeRateTuple, Oracle.ExchangeRateTuple> {
  public override val descriptor: Descriptors.Descriptor = Oracle.ExchangeRateTuple.getDescriptor()

  public override val parser: Parser<Oracle.ExchangeRateTuple> = Oracle.ExchangeRateTuple.parser()

  public override fun convert(obj: Oracle.ExchangeRateTuple): ExchangeRateTuple = ExchangeRateTuple(
  	denom = obj.getDenom(),
  	exchangeRate = obj.getExchangeRate(),
  )

  public override fun convert(obj: ExchangeRateTuple): Oracle.ExchangeRateTuple {
    val builder = Oracle.ExchangeRateTuple.newBuilder()
    builder.setDenom(obj.denom)
    builder.setExchangeRate(obj.exchangeRate)
    return builder.build()
  }
}

// Transform from oracle/oracle.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.oracle

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
  	whitelist = obj.getWhitelistList().map { DenomJvmConverter.convert(it) },
  	slashFraction = obj.getSlashFraction(),
  	slashWindow = obj.getSlashWindow().asKotlinType,
  	minValidPerWindow = obj.getMinValidPerWindow(),
  	lookbackDuration = obj.getLookbackDuration().asKotlinType,
  )

  public override fun convert(obj: Params): Oracle.Params {
    val builder = Oracle.Params.newBuilder()
    builder.setVotePeriod(obj.votePeriod.asJavaType)
    builder.setVoteThreshold(obj.voteThreshold)
    builder.setRewardBand(obj.rewardBand)
    builder.addAllWhitelist(obj.whitelist.map { DenomJvmConverter.convert(it) })
    builder.setSlashFraction(obj.slashFraction)
    builder.setSlashWindow(obj.slashWindow.asJavaType)
    builder.setMinValidPerWindow(obj.minValidPerWindow)
    builder.setLookbackDuration(obj.lookbackDuration.asJavaType)
    return builder.build()
  }
}

public object DenomJvmConverter : ProtobufTypeMapper<Denom, Oracle.Denom> {
  public override val descriptor: Descriptors.Descriptor = Oracle.Denom.getDescriptor()

  public override val parser: Parser<Oracle.Denom> = Oracle.Denom.parser()

  public override fun convert(obj: Oracle.Denom): Denom = Denom(
  	name = obj.getName(),
  )

  public override fun convert(obj: Denom): Oracle.Denom {
    val builder = Oracle.Denom.newBuilder()
    builder.setName(obj.name)
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

public object OracleExchangeRateJvmConverter :
    ProtobufTypeMapper<OracleExchangeRate, Oracle.OracleExchangeRate> {
  public override val descriptor: Descriptors.Descriptor = Oracle.OracleExchangeRate.getDescriptor()

  public override val parser: Parser<Oracle.OracleExchangeRate> = Oracle.OracleExchangeRate.parser()

  public override fun convert(obj: Oracle.OracleExchangeRate): OracleExchangeRate =
      OracleExchangeRate(
  	exchangeRate = obj.getExchangeRate(),
  	lastUpdate = obj.getLastUpdate(),
  )

  public override fun convert(obj: OracleExchangeRate): Oracle.OracleExchangeRate {
    val builder = Oracle.OracleExchangeRate.newBuilder()
    builder.setExchangeRate(obj.exchangeRate)
    builder.setLastUpdate(obj.lastUpdate)
    return builder.build()
  }
}

public object PriceSnapshotItemJvmConverter :
    ProtobufTypeMapper<PriceSnapshotItem, Oracle.PriceSnapshotItem> {
  public override val descriptor: Descriptors.Descriptor = Oracle.PriceSnapshotItem.getDescriptor()

  public override val parser: Parser<Oracle.PriceSnapshotItem> = Oracle.PriceSnapshotItem.parser()

  public override fun convert(obj: Oracle.PriceSnapshotItem): PriceSnapshotItem = PriceSnapshotItem(
  	denom = obj.getDenom(),
  	oracleExchangeRate = OracleExchangeRateJvmConverter.convert(obj.getOracleExchangeRate()),
  )

  public override fun convert(obj: PriceSnapshotItem): Oracle.PriceSnapshotItem {
    val builder = Oracle.PriceSnapshotItem.newBuilder()
    builder.setDenom(obj.denom)
    builder.setOracleExchangeRate(OracleExchangeRateJvmConverter.convert(obj.oracleExchangeRate))
    return builder.build()
  }
}

public object PriceSnapshotJvmConverter : ProtobufTypeMapper<PriceSnapshot, Oracle.PriceSnapshot> {
  public override val descriptor: Descriptors.Descriptor = Oracle.PriceSnapshot.getDescriptor()

  public override val parser: Parser<Oracle.PriceSnapshot> = Oracle.PriceSnapshot.parser()

  public override fun convert(obj: Oracle.PriceSnapshot): PriceSnapshot = PriceSnapshot(
  	snapshotTimestamp = obj.getSnapshotTimestamp(),
  	priceSnapshotItems = obj.getPriceSnapshotItemsList().map {
      PriceSnapshotItemJvmConverter.convert(it) },
  )

  public override fun convert(obj: PriceSnapshot): Oracle.PriceSnapshot {
    val builder = Oracle.PriceSnapshot.newBuilder()
    builder.setSnapshotTimestamp(obj.snapshotTimestamp)
    builder.addAllPriceSnapshotItems(obj.priceSnapshotItems.map {
        PriceSnapshotItemJvmConverter.convert(it) })
    return builder.build()
  }
}

public object OracleTwapJvmConverter : ProtobufTypeMapper<OracleTwap, Oracle.OracleTwap> {
  public override val descriptor: Descriptors.Descriptor = Oracle.OracleTwap.getDescriptor()

  public override val parser: Parser<Oracle.OracleTwap> = Oracle.OracleTwap.parser()

  public override fun convert(obj: Oracle.OracleTwap): OracleTwap = OracleTwap(
  	denom = obj.getDenom(),
  	twap = obj.getTwap(),
  	lookbackSeconds = obj.getLookbackSeconds(),
  )

  public override fun convert(obj: OracleTwap): Oracle.OracleTwap {
    val builder = Oracle.OracleTwap.newBuilder()
    builder.setDenom(obj.denom)
    builder.setTwap(obj.twap)
    builder.setLookbackSeconds(obj.lookbackSeconds)
    return builder.build()
  }
}

public object VotePenaltyCounterJvmConverter :
    ProtobufTypeMapper<VotePenaltyCounter, Oracle.VotePenaltyCounter> {
  public override val descriptor: Descriptors.Descriptor = Oracle.VotePenaltyCounter.getDescriptor()

  public override val parser: Parser<Oracle.VotePenaltyCounter> = Oracle.VotePenaltyCounter.parser()

  public override fun convert(obj: Oracle.VotePenaltyCounter): VotePenaltyCounter =
      VotePenaltyCounter(
  	missCount = obj.getMissCount().asKotlinType,
  	abstainCount = obj.getAbstainCount().asKotlinType,
  	successCount = obj.getSuccessCount().asKotlinType,
  )

  public override fun convert(obj: VotePenaltyCounter): Oracle.VotePenaltyCounter {
    val builder = Oracle.VotePenaltyCounter.newBuilder()
    builder.setMissCount(obj.missCount.asJavaType)
    builder.setAbstainCount(obj.abstainCount.asJavaType)
    builder.setSuccessCount(obj.successCount.asJavaType)
    return builder.build()
  }
}

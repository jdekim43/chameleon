// Transform from alliance/params.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.DurationJvmConverter
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ParamsJvmConverter : ProtobufTypeMapper<Params, ParamsOuterClass.Params> {
  public override val descriptor: Descriptors.Descriptor = ParamsOuterClass.Params.getDescriptor()

  public override val parser: Parser<ParamsOuterClass.Params> = ParamsOuterClass.Params.parser()

  public override fun convert(obj: ParamsOuterClass.Params): Params = Params(
  	rewardDelayTime = DurationJvmConverter.convert(obj.getRewardDelayTime()),
  	takeRateClaimInterval = DurationJvmConverter.convert(obj.getTakeRateClaimInterval()),
  	lastTakeRateClaimTime = TimestampJvmConverter.convert(obj.getLastTakeRateClaimTime()),
  )

  public override fun convert(obj: Params): ParamsOuterClass.Params {
    val builder = ParamsOuterClass.Params.newBuilder()
    builder.setRewardDelayTime(DurationJvmConverter.convert(obj.rewardDelayTime))
    builder.setTakeRateClaimInterval(DurationJvmConverter.convert(obj.takeRateClaimInterval))
    builder.setLastTakeRateClaimTime(TimestampJvmConverter.convert(obj.lastTakeRateClaimTime))
    return builder.build()
  }
}

public object RewardHistoryJvmConverter :
    ProtobufTypeMapper<RewardHistory, ParamsOuterClass.RewardHistory> {
  public override val descriptor: Descriptors.Descriptor =
      ParamsOuterClass.RewardHistory.getDescriptor()

  public override val parser: Parser<ParamsOuterClass.RewardHistory> =
      ParamsOuterClass.RewardHistory.parser()

  public override fun convert(obj: ParamsOuterClass.RewardHistory): RewardHistory = RewardHistory(
  	denom = obj.getDenom(),
  	index = obj.getIndex(),
  )

  public override fun convert(obj: RewardHistory): ParamsOuterClass.RewardHistory {
    val builder = ParamsOuterClass.RewardHistory.newBuilder()
    builder.setDenom(obj.denom)
    builder.setIndex(obj.index)
    return builder.build()
  }
}

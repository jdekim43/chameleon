// Transform from alliance/alliance.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.DurationJvmConverter
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object RewardWeightRangeJvmConverter :
    ProtobufTypeMapper<RewardWeightRange, Alliance.RewardWeightRange> {
  public override val descriptor: Descriptors.Descriptor =
      Alliance.RewardWeightRange.getDescriptor()

  public override val parser: Parser<Alliance.RewardWeightRange> =
      Alliance.RewardWeightRange.parser()

  public override fun convert(obj: Alliance.RewardWeightRange): RewardWeightRange =
      RewardWeightRange(
  	min = obj.getMin(),
  	max = obj.getMax(),
  )

  public override fun convert(obj: RewardWeightRange): Alliance.RewardWeightRange {
    val builder = Alliance.RewardWeightRange.newBuilder()
    builder.setMin(obj.min)
    builder.setMax(obj.max)
    return builder.build()
  }
}

public object AllianceAssetJvmConverter : ProtobufTypeMapper<AllianceAsset, Alliance.AllianceAsset>
    {
  public override val descriptor: Descriptors.Descriptor = Alliance.AllianceAsset.getDescriptor()

  public override val parser: Parser<Alliance.AllianceAsset> = Alliance.AllianceAsset.parser()

  public override fun convert(obj: Alliance.AllianceAsset): AllianceAsset = AllianceAsset(
  	denom = obj.getDenom(),
  	rewardWeight = obj.getRewardWeight(),
  	takeRate = obj.getTakeRate(),
  	totalTokens = obj.getTotalTokens(),
  	totalValidatorShares = obj.getTotalValidatorShares(),
  	rewardStartTime = TimestampJvmConverter.convert(obj.getRewardStartTime()),
  	rewardChangeRate = obj.getRewardChangeRate(),
  	rewardChangeInterval = DurationJvmConverter.convert(obj.getRewardChangeInterval()),
  	lastRewardChangeTime = TimestampJvmConverter.convert(obj.getLastRewardChangeTime()),
  	rewardWeightRange = RewardWeightRangeJvmConverter.convert(obj.getRewardWeightRange()),
  	isInitialized = obj.getIsInitialized(),
  )

  public override fun convert(obj: AllianceAsset): Alliance.AllianceAsset {
    val builder = Alliance.AllianceAsset.newBuilder()
    builder.setDenom(obj.denom)
    builder.setRewardWeight(obj.rewardWeight)
    builder.setTakeRate(obj.takeRate)
    builder.setTotalTokens(obj.totalTokens)
    builder.setTotalValidatorShares(obj.totalValidatorShares)
    builder.setRewardStartTime(TimestampJvmConverter.convert(obj.rewardStartTime))
    builder.setRewardChangeRate(obj.rewardChangeRate)
    builder.setRewardChangeInterval(DurationJvmConverter.convert(obj.rewardChangeInterval))
    builder.setLastRewardChangeTime(TimestampJvmConverter.convert(obj.lastRewardChangeTime))
    builder.setRewardWeightRange(RewardWeightRangeJvmConverter.convert(obj.rewardWeightRange))
    builder.setIsInitialized(obj.isInitialized)
    return builder.build()
  }
}

public object RewardWeightChangeSnapshotJvmConverter :
    ProtobufTypeMapper<RewardWeightChangeSnapshot, Alliance.RewardWeightChangeSnapshot> {
  public override val descriptor: Descriptors.Descriptor =
      Alliance.RewardWeightChangeSnapshot.getDescriptor()

  public override val parser: Parser<Alliance.RewardWeightChangeSnapshot> =
      Alliance.RewardWeightChangeSnapshot.parser()

  public override fun convert(obj: Alliance.RewardWeightChangeSnapshot): RewardWeightChangeSnapshot
      = RewardWeightChangeSnapshot(
  	prevRewardWeight = obj.getPrevRewardWeight(),
  	rewardHistories = obj.getRewardHistoriesList().map { RewardHistoryJvmConverter.convert(it) },
  )

  public override fun convert(obj: RewardWeightChangeSnapshot):
      Alliance.RewardWeightChangeSnapshot {
    val builder = Alliance.RewardWeightChangeSnapshot.newBuilder()
    builder.setPrevRewardWeight(obj.prevRewardWeight)
    builder.addAllRewardHistories(obj.rewardHistories.map { RewardHistoryJvmConverter.convert(it) })
    return builder.build()
  }
}

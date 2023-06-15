// Transform from alliance/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ValidatorInfoStateJvmConverter :
    ProtobufTypeMapper<ValidatorInfoState, Genesis.ValidatorInfoState> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.ValidatorInfoState.getDescriptor()

  public override val parser: Parser<Genesis.ValidatorInfoState> =
      Genesis.ValidatorInfoState.parser()

  public override fun convert(obj: Genesis.ValidatorInfoState): ValidatorInfoState =
      ValidatorInfoState(
  	validatorAddress = obj.getValidatorAddress(),
  	validator = AllianceValidatorInfoJvmConverter.convert(obj.getValidator()),
  )

  public override fun convert(obj: ValidatorInfoState): Genesis.ValidatorInfoState {
    val builder = Genesis.ValidatorInfoState.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setValidator(AllianceValidatorInfoJvmConverter.convert(obj.validator))
    return builder.build()
  }
}

public object RedelegationStateJvmConverter :
    ProtobufTypeMapper<RedelegationState, Genesis.RedelegationState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.RedelegationState.getDescriptor()

  public override val parser: Parser<Genesis.RedelegationState> = Genesis.RedelegationState.parser()

  public override fun convert(obj: Genesis.RedelegationState): RedelegationState =
      RedelegationState(
  	completionTime = TimestampJvmConverter.convert(obj.getCompletionTime()),
  	redelegation = RedelegationJvmConverter.convert(obj.getRedelegation()),
  )

  public override fun convert(obj: RedelegationState): Genesis.RedelegationState {
    val builder = Genesis.RedelegationState.newBuilder()
    builder.setCompletionTime(TimestampJvmConverter.convert(obj.completionTime))
    builder.setRedelegation(RedelegationJvmConverter.convert(obj.redelegation))
    return builder.build()
  }
}

public object UndelegationStateJvmConverter :
    ProtobufTypeMapper<UndelegationState, Genesis.UndelegationState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.UndelegationState.getDescriptor()

  public override val parser: Parser<Genesis.UndelegationState> = Genesis.UndelegationState.parser()

  public override fun convert(obj: Genesis.UndelegationState): UndelegationState =
      UndelegationState(
  	completionTime = TimestampJvmConverter.convert(obj.getCompletionTime()),
  	undelegation = QueuedUndelegationJvmConverter.convert(obj.getUndelegation()),
  )

  public override fun convert(obj: UndelegationState): Genesis.UndelegationState {
    val builder = Genesis.UndelegationState.newBuilder()
    builder.setCompletionTime(TimestampJvmConverter.convert(obj.completionTime))
    builder.setUndelegation(QueuedUndelegationJvmConverter.convert(obj.undelegation))
    return builder.build()
  }
}

public object RewardWeightChangeSnapshotStateJvmConverter :
    ProtobufTypeMapper<RewardWeightChangeSnapshotState, Genesis.RewardWeightChangeSnapshotState> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.RewardWeightChangeSnapshotState.getDescriptor()

  public override val parser: Parser<Genesis.RewardWeightChangeSnapshotState> =
      Genesis.RewardWeightChangeSnapshotState.parser()

  public override fun convert(obj: Genesis.RewardWeightChangeSnapshotState):
      RewardWeightChangeSnapshotState = RewardWeightChangeSnapshotState(
  	height = obj.getHeight().asKotlinType,
  	validator = obj.getValidator(),
  	denom = obj.getDenom(),
  	snapshot = RewardWeightChangeSnapshotJvmConverter.convert(obj.getSnapshot()),
  )

  public override fun convert(obj: RewardWeightChangeSnapshotState):
      Genesis.RewardWeightChangeSnapshotState {
    val builder = Genesis.RewardWeightChangeSnapshotState.newBuilder()
    builder.setHeight(obj.height.asJavaType)
    builder.setValidator(obj.validator)
    builder.setDenom(obj.denom)
    builder.setSnapshot(RewardWeightChangeSnapshotJvmConverter.convert(obj.snapshot))
    return builder.build()
  }
}

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  	assets = obj.getAssetsList().map { AllianceAssetJvmConverter.convert(it) },
  	validatorInfos = obj.getValidatorInfosList().map { ValidatorInfoStateJvmConverter.convert(it) },
  	rewardWeightChangeSnaphots = obj.getRewardWeightChangeSnaphotsList().map {
      RewardWeightChangeSnapshotStateJvmConverter.convert(it) },
  	delegations = obj.getDelegationsList().map { DelegationJvmConverter.convert(it) },
  	redelegations = obj.getRedelegationsList().map { RedelegationStateJvmConverter.convert(it) },
  	undelegations = obj.getUndelegationsList().map { UndelegationStateJvmConverter.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    builder.addAllAssets(obj.assets.map { AllianceAssetJvmConverter.convert(it) })
    builder.addAllValidatorInfos(obj.validatorInfos.map { ValidatorInfoStateJvmConverter.convert(it)
        })
    builder.addAllRewardWeightChangeSnaphots(obj.rewardWeightChangeSnaphots.map {
        RewardWeightChangeSnapshotStateJvmConverter.convert(it) })
    builder.addAllDelegations(obj.delegations.map { DelegationJvmConverter.convert(it) })
    builder.addAllRedelegations(obj.redelegations.map { RedelegationStateJvmConverter.convert(it) })
    builder.addAllUndelegations(obj.undelegations.map { UndelegationStateJvmConverter.convert(it) })
    return builder.build()
  }
}

// Transform from cosmos/distribution/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.DecCoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object DelegatorWithdrawInfoJvmConverter :
    ProtobufTypeMapper<DelegatorWithdrawInfo, Genesis.DelegatorWithdrawInfo> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.DelegatorWithdrawInfo.getDescriptor()

  public override val parser: Parser<Genesis.DelegatorWithdrawInfo> =
      Genesis.DelegatorWithdrawInfo.parser()

  public override fun convert(obj: Genesis.DelegatorWithdrawInfo): DelegatorWithdrawInfo =
      DelegatorWithdrawInfo(
  	delegatorAddress = obj.getDelegatorAddress(),
  	withdrawAddress = obj.getWithdrawAddress(),
  )

  public override fun convert(obj: DelegatorWithdrawInfo): Genesis.DelegatorWithdrawInfo {
    val builder = Genesis.DelegatorWithdrawInfo.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setWithdrawAddress(obj.withdrawAddress)
    return builder.build()
  }
}

public object ValidatorOutstandingRewardsRecordJvmConverter :
    ProtobufTypeMapper<ValidatorOutstandingRewardsRecord, Genesis.ValidatorOutstandingRewardsRecord>
    {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.ValidatorOutstandingRewardsRecord.getDescriptor()

  public override val parser: Parser<Genesis.ValidatorOutstandingRewardsRecord> =
      Genesis.ValidatorOutstandingRewardsRecord.parser()

  public override fun convert(obj: Genesis.ValidatorOutstandingRewardsRecord):
      ValidatorOutstandingRewardsRecord = ValidatorOutstandingRewardsRecord(
  	validatorAddress = obj.getValidatorAddress(),
  	outstandingRewards = obj.getOutstandingRewardsList().map { DecCoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: ValidatorOutstandingRewardsRecord):
      Genesis.ValidatorOutstandingRewardsRecord {
    val builder = Genesis.ValidatorOutstandingRewardsRecord.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    builder.addAllOutstandingRewards(obj.outstandingRewards.map { DecCoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object ValidatorAccumulatedCommissionRecordJvmConverter :
    ProtobufTypeMapper<ValidatorAccumulatedCommissionRecord, Genesis.ValidatorAccumulatedCommissionRecord>
    {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.ValidatorAccumulatedCommissionRecord.getDescriptor()

  public override val parser: Parser<Genesis.ValidatorAccumulatedCommissionRecord> =
      Genesis.ValidatorAccumulatedCommissionRecord.parser()

  public override fun convert(obj: Genesis.ValidatorAccumulatedCommissionRecord):
      ValidatorAccumulatedCommissionRecord = ValidatorAccumulatedCommissionRecord(
  	validatorAddress = obj.getValidatorAddress(),
  	accumulated = ValidatorAccumulatedCommissionJvmConverter.convert(obj.getAccumulated()),
  )

  public override fun convert(obj: ValidatorAccumulatedCommissionRecord):
      Genesis.ValidatorAccumulatedCommissionRecord {
    val builder = Genesis.ValidatorAccumulatedCommissionRecord.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setAccumulated(ValidatorAccumulatedCommissionJvmConverter.convert(obj.accumulated))
    return builder.build()
  }
}

public object ValidatorHistoricalRewardsRecordJvmConverter :
    ProtobufTypeMapper<ValidatorHistoricalRewardsRecord, Genesis.ValidatorHistoricalRewardsRecord> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.ValidatorHistoricalRewardsRecord.getDescriptor()

  public override val parser: Parser<Genesis.ValidatorHistoricalRewardsRecord> =
      Genesis.ValidatorHistoricalRewardsRecord.parser()

  public override fun convert(obj: Genesis.ValidatorHistoricalRewardsRecord):
      ValidatorHistoricalRewardsRecord = ValidatorHistoricalRewardsRecord(
  	validatorAddress = obj.getValidatorAddress(),
  	period = obj.getPeriod().asKotlinType,
  	rewards = ValidatorHistoricalRewardsJvmConverter.convert(obj.getRewards()),
  )

  public override fun convert(obj: ValidatorHistoricalRewardsRecord):
      Genesis.ValidatorHistoricalRewardsRecord {
    val builder = Genesis.ValidatorHistoricalRewardsRecord.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setPeriod(obj.period.asJavaType)
    builder.setRewards(ValidatorHistoricalRewardsJvmConverter.convert(obj.rewards))
    return builder.build()
  }
}

public object ValidatorCurrentRewardsRecordJvmConverter :
    ProtobufTypeMapper<ValidatorCurrentRewardsRecord, Genesis.ValidatorCurrentRewardsRecord> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.ValidatorCurrentRewardsRecord.getDescriptor()

  public override val parser: Parser<Genesis.ValidatorCurrentRewardsRecord> =
      Genesis.ValidatorCurrentRewardsRecord.parser()

  public override fun convert(obj: Genesis.ValidatorCurrentRewardsRecord):
      ValidatorCurrentRewardsRecord = ValidatorCurrentRewardsRecord(
  	validatorAddress = obj.getValidatorAddress(),
  	rewards = ValidatorCurrentRewardsJvmConverter.convert(obj.getRewards()),
  )

  public override fun convert(obj: ValidatorCurrentRewardsRecord):
      Genesis.ValidatorCurrentRewardsRecord {
    val builder = Genesis.ValidatorCurrentRewardsRecord.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setRewards(ValidatorCurrentRewardsJvmConverter.convert(obj.rewards))
    return builder.build()
  }
}

public object DelegatorStartingInfoRecordJvmConverter :
    ProtobufTypeMapper<DelegatorStartingInfoRecord, Genesis.DelegatorStartingInfoRecord> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.DelegatorStartingInfoRecord.getDescriptor()

  public override val parser: Parser<Genesis.DelegatorStartingInfoRecord> =
      Genesis.DelegatorStartingInfoRecord.parser()

  public override fun convert(obj: Genesis.DelegatorStartingInfoRecord): DelegatorStartingInfoRecord
      = DelegatorStartingInfoRecord(
  	delegatorAddress = obj.getDelegatorAddress(),
  	validatorAddress = obj.getValidatorAddress(),
  	startingInfo = DelegatorStartingInfoJvmConverter.convert(obj.getStartingInfo()),
  )

  public override fun convert(obj: DelegatorStartingInfoRecord):
      Genesis.DelegatorStartingInfoRecord {
    val builder = Genesis.DelegatorStartingInfoRecord.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setStartingInfo(DelegatorStartingInfoJvmConverter.convert(obj.startingInfo))
    return builder.build()
  }
}

public object ValidatorSlashEventRecordJvmConverter :
    ProtobufTypeMapper<ValidatorSlashEventRecord, Genesis.ValidatorSlashEventRecord> {
  public override val descriptor: Descriptors.Descriptor =
      Genesis.ValidatorSlashEventRecord.getDescriptor()

  public override val parser: Parser<Genesis.ValidatorSlashEventRecord> =
      Genesis.ValidatorSlashEventRecord.parser()

  public override fun convert(obj: Genesis.ValidatorSlashEventRecord): ValidatorSlashEventRecord =
      ValidatorSlashEventRecord(
  	validatorAddress = obj.getValidatorAddress(),
  	height = obj.getHeight().asKotlinType,
  	period = obj.getPeriod().asKotlinType,
  	validatorSlashEvent = ValidatorSlashEventJvmConverter.convert(obj.getValidatorSlashEvent()),
  )

  public override fun convert(obj: ValidatorSlashEventRecord): Genesis.ValidatorSlashEventRecord {
    val builder = Genesis.ValidatorSlashEventRecord.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setHeight(obj.height.asJavaType)
    builder.setPeriod(obj.period.asJavaType)
    builder.setValidatorSlashEvent(ValidatorSlashEventJvmConverter.convert(obj.validatorSlashEvent))
    return builder.build()
  }
}

public object GenesisStateJvmConverter : ProtobufTypeMapper<GenesisState, Genesis.GenesisState> {
  public override val descriptor: Descriptors.Descriptor = Genesis.GenesisState.getDescriptor()

  public override val parser: Parser<Genesis.GenesisState> = Genesis.GenesisState.parser()

  public override fun convert(obj: Genesis.GenesisState): GenesisState = GenesisState(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  	feePool = FeePoolJvmConverter.convert(obj.getFeePool()),
  	delegatorWithdrawInfos = obj.getDelegatorWithdrawInfosList().map {
      DelegatorWithdrawInfoJvmConverter.convert(it) },
  	previousProposer = obj.getPreviousProposer(),
  	outstandingRewards = obj.getOutstandingRewardsList().map {
      ValidatorOutstandingRewardsRecordJvmConverter.convert(it) },
  	validatorAccumulatedCommissions = obj.getValidatorAccumulatedCommissionsList().map {
      ValidatorAccumulatedCommissionRecordJvmConverter.convert(it) },
  	validatorHistoricalRewards = obj.getValidatorHistoricalRewardsList().map {
      ValidatorHistoricalRewardsRecordJvmConverter.convert(it) },
  	validatorCurrentRewards = obj.getValidatorCurrentRewardsList().map {
      ValidatorCurrentRewardsRecordJvmConverter.convert(it) },
  	delegatorStartingInfos = obj.getDelegatorStartingInfosList().map {
      DelegatorStartingInfoRecordJvmConverter.convert(it) },
  	validatorSlashEvents = obj.getValidatorSlashEventsList().map {
      ValidatorSlashEventRecordJvmConverter.convert(it) },
  )

  public override fun convert(obj: GenesisState): Genesis.GenesisState {
    val builder = Genesis.GenesisState.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    builder.setFeePool(FeePoolJvmConverter.convert(obj.feePool))
    builder.addAllDelegatorWithdrawInfos(obj.delegatorWithdrawInfos.map {
        DelegatorWithdrawInfoJvmConverter.convert(it) })
    builder.setPreviousProposer(obj.previousProposer)
    builder.addAllOutstandingRewards(obj.outstandingRewards.map {
        ValidatorOutstandingRewardsRecordJvmConverter.convert(it) })
    builder.addAllValidatorAccumulatedCommissions(obj.validatorAccumulatedCommissions.map {
        ValidatorAccumulatedCommissionRecordJvmConverter.convert(it) })
    builder.addAllValidatorHistoricalRewards(obj.validatorHistoricalRewards.map {
        ValidatorHistoricalRewardsRecordJvmConverter.convert(it) })
    builder.addAllValidatorCurrentRewards(obj.validatorCurrentRewards.map {
        ValidatorCurrentRewardsRecordJvmConverter.convert(it) })
    builder.addAllDelegatorStartingInfos(obj.delegatorStartingInfos.map {
        DelegatorStartingInfoRecordJvmConverter.convert(it) })
    builder.addAllValidatorSlashEvents(obj.validatorSlashEvents.map {
        ValidatorSlashEventRecordJvmConverter.convert(it) })
    return builder.build()
  }
}

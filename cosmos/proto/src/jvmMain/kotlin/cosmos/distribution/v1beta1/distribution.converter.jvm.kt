// Transform from cosmos/distribution/v1beta1/distribution.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import cosmos.base.v1beta1.DecCoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ParamsJvmConverter : ProtobufTypeMapper<Params, Distribution.Params> {
  public override val descriptor: Descriptors.Descriptor = Distribution.Params.getDescriptor()

  public override val parser: Parser<Distribution.Params> = Distribution.Params.parser()

  public override fun convert(obj: Distribution.Params): Params = Params(
  	communityTax = obj.getCommunityTax(),
  	baseProposerReward = obj.getBaseProposerReward(),
  	bonusProposerReward = obj.getBonusProposerReward(),
  	withdrawAddrEnabled = obj.getWithdrawAddrEnabled(),
  )

  public override fun convert(obj: Params): Distribution.Params {
    val builder = Distribution.Params.newBuilder()
    builder.setCommunityTax(obj.communityTax)
    builder.setBaseProposerReward(obj.baseProposerReward)
    builder.setBonusProposerReward(obj.bonusProposerReward)
    builder.setWithdrawAddrEnabled(obj.withdrawAddrEnabled)
    return builder.build()
  }
}

public object ValidatorHistoricalRewardsJvmConverter :
    ProtobufTypeMapper<ValidatorHistoricalRewards, Distribution.ValidatorHistoricalRewards> {
  public override val descriptor: Descriptors.Descriptor =
      Distribution.ValidatorHistoricalRewards.getDescriptor()

  public override val parser: Parser<Distribution.ValidatorHistoricalRewards> =
      Distribution.ValidatorHistoricalRewards.parser()

  public override fun convert(obj: Distribution.ValidatorHistoricalRewards):
      ValidatorHistoricalRewards = ValidatorHistoricalRewards(
  	cumulativeRewardRatio = obj.getCumulativeRewardRatioList().map { DecCoinJvmConverter.convert(it)
      },
  	referenceCount = obj.getReferenceCount().asKotlinType,
  )

  public override fun convert(obj: ValidatorHistoricalRewards):
      Distribution.ValidatorHistoricalRewards {
    val builder = Distribution.ValidatorHistoricalRewards.newBuilder()
    builder.addAllCumulativeRewardRatio(obj.cumulativeRewardRatio.map {
        DecCoinJvmConverter.convert(it) })
    builder.setReferenceCount(obj.referenceCount.asJavaType)
    return builder.build()
  }
}

public object ValidatorCurrentRewardsJvmConverter :
    ProtobufTypeMapper<ValidatorCurrentRewards, Distribution.ValidatorCurrentRewards> {
  public override val descriptor: Descriptors.Descriptor =
      Distribution.ValidatorCurrentRewards.getDescriptor()

  public override val parser: Parser<Distribution.ValidatorCurrentRewards> =
      Distribution.ValidatorCurrentRewards.parser()

  public override fun convert(obj: Distribution.ValidatorCurrentRewards): ValidatorCurrentRewards =
      ValidatorCurrentRewards(
  	rewards = obj.getRewardsList().map { DecCoinJvmConverter.convert(it) },
  	period = obj.getPeriod().asKotlinType,
  )

  public override fun convert(obj: ValidatorCurrentRewards): Distribution.ValidatorCurrentRewards {
    val builder = Distribution.ValidatorCurrentRewards.newBuilder()
    builder.addAllRewards(obj.rewards.map { DecCoinJvmConverter.convert(it) })
    builder.setPeriod(obj.period.asJavaType)
    return builder.build()
  }
}

public object ValidatorAccumulatedCommissionJvmConverter :
    ProtobufTypeMapper<ValidatorAccumulatedCommission, Distribution.ValidatorAccumulatedCommission>
    {
  public override val descriptor: Descriptors.Descriptor =
      Distribution.ValidatorAccumulatedCommission.getDescriptor()

  public override val parser: Parser<Distribution.ValidatorAccumulatedCommission> =
      Distribution.ValidatorAccumulatedCommission.parser()

  public override fun convert(obj: Distribution.ValidatorAccumulatedCommission):
      ValidatorAccumulatedCommission = ValidatorAccumulatedCommission(
  	commission = obj.getCommissionList().map { DecCoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: ValidatorAccumulatedCommission):
      Distribution.ValidatorAccumulatedCommission {
    val builder = Distribution.ValidatorAccumulatedCommission.newBuilder()
    builder.addAllCommission(obj.commission.map { DecCoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object ValidatorOutstandingRewardsJvmConverter :
    ProtobufTypeMapper<ValidatorOutstandingRewards, Distribution.ValidatorOutstandingRewards> {
  public override val descriptor: Descriptors.Descriptor =
      Distribution.ValidatorOutstandingRewards.getDescriptor()

  public override val parser: Parser<Distribution.ValidatorOutstandingRewards> =
      Distribution.ValidatorOutstandingRewards.parser()

  public override fun convert(obj: Distribution.ValidatorOutstandingRewards):
      ValidatorOutstandingRewards = ValidatorOutstandingRewards(
  	rewards = obj.getRewardsList().map { DecCoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: ValidatorOutstandingRewards):
      Distribution.ValidatorOutstandingRewards {
    val builder = Distribution.ValidatorOutstandingRewards.newBuilder()
    builder.addAllRewards(obj.rewards.map { DecCoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object ValidatorSlashEventJvmConverter :
    ProtobufTypeMapper<ValidatorSlashEvent, Distribution.ValidatorSlashEvent> {
  public override val descriptor: Descriptors.Descriptor =
      Distribution.ValidatorSlashEvent.getDescriptor()

  public override val parser: Parser<Distribution.ValidatorSlashEvent> =
      Distribution.ValidatorSlashEvent.parser()

  public override fun convert(obj: Distribution.ValidatorSlashEvent): ValidatorSlashEvent =
      ValidatorSlashEvent(
  	validatorPeriod = obj.getValidatorPeriod().asKotlinType,
  	fraction = obj.getFraction(),
  )

  public override fun convert(obj: ValidatorSlashEvent): Distribution.ValidatorSlashEvent {
    val builder = Distribution.ValidatorSlashEvent.newBuilder()
    builder.setValidatorPeriod(obj.validatorPeriod.asJavaType)
    builder.setFraction(obj.fraction)
    return builder.build()
  }
}

public object ValidatorSlashEventsJvmConverter :
    ProtobufTypeMapper<ValidatorSlashEvents, Distribution.ValidatorSlashEvents> {
  public override val descriptor: Descriptors.Descriptor =
      Distribution.ValidatorSlashEvents.getDescriptor()

  public override val parser: Parser<Distribution.ValidatorSlashEvents> =
      Distribution.ValidatorSlashEvents.parser()

  public override fun convert(obj: Distribution.ValidatorSlashEvents): ValidatorSlashEvents =
      ValidatorSlashEvents(
  	validatorSlashEvents = obj.getValidatorSlashEventsList().map {
      ValidatorSlashEventJvmConverter.convert(it) },
  )

  public override fun convert(obj: ValidatorSlashEvents): Distribution.ValidatorSlashEvents {
    val builder = Distribution.ValidatorSlashEvents.newBuilder()
    builder.addAllValidatorSlashEvents(obj.validatorSlashEvents.map {
        ValidatorSlashEventJvmConverter.convert(it) })
    return builder.build()
  }
}

public object FeePoolJvmConverter : ProtobufTypeMapper<FeePool, Distribution.FeePool> {
  public override val descriptor: Descriptors.Descriptor = Distribution.FeePool.getDescriptor()

  public override val parser: Parser<Distribution.FeePool> = Distribution.FeePool.parser()

  public override fun convert(obj: Distribution.FeePool): FeePool = FeePool(
  	communityPool = obj.getCommunityPoolList().map { DecCoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: FeePool): Distribution.FeePool {
    val builder = Distribution.FeePool.newBuilder()
    builder.addAllCommunityPool(obj.communityPool.map { DecCoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object CommunityPoolSpendProposalJvmConverter :
    ProtobufTypeMapper<CommunityPoolSpendProposal, Distribution.CommunityPoolSpendProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Distribution.CommunityPoolSpendProposal.getDescriptor()

  public override val parser: Parser<Distribution.CommunityPoolSpendProposal> =
      Distribution.CommunityPoolSpendProposal.parser()

  public override fun convert(obj: Distribution.CommunityPoolSpendProposal):
      CommunityPoolSpendProposal = CommunityPoolSpendProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	recipient = obj.getRecipient(),
  	amount = obj.getAmountList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: CommunityPoolSpendProposal):
      Distribution.CommunityPoolSpendProposal {
    val builder = Distribution.CommunityPoolSpendProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setRecipient(obj.recipient)
    builder.addAllAmount(obj.amount.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object DelegatorStartingInfoJvmConverter :
    ProtobufTypeMapper<DelegatorStartingInfo, Distribution.DelegatorStartingInfo> {
  public override val descriptor: Descriptors.Descriptor =
      Distribution.DelegatorStartingInfo.getDescriptor()

  public override val parser: Parser<Distribution.DelegatorStartingInfo> =
      Distribution.DelegatorStartingInfo.parser()

  public override fun convert(obj: Distribution.DelegatorStartingInfo): DelegatorStartingInfo =
      DelegatorStartingInfo(
  	previousPeriod = obj.getPreviousPeriod().asKotlinType,
  	stake = obj.getStake(),
  	height = obj.getHeight().asKotlinType,
  )

  public override fun convert(obj: DelegatorStartingInfo): Distribution.DelegatorStartingInfo {
    val builder = Distribution.DelegatorStartingInfo.newBuilder()
    builder.setPreviousPeriod(obj.previousPeriod.asJavaType)
    builder.setStake(obj.stake)
    builder.setHeight(obj.height.asJavaType)
    return builder.build()
  }
}

public object DelegationDelegatorRewardJvmConverter :
    ProtobufTypeMapper<DelegationDelegatorReward, Distribution.DelegationDelegatorReward> {
  public override val descriptor: Descriptors.Descriptor =
      Distribution.DelegationDelegatorReward.getDescriptor()

  public override val parser: Parser<Distribution.DelegationDelegatorReward> =
      Distribution.DelegationDelegatorReward.parser()

  public override fun convert(obj: Distribution.DelegationDelegatorReward):
      DelegationDelegatorReward = DelegationDelegatorReward(
  	validatorAddress = obj.getValidatorAddress(),
  	reward = obj.getRewardList().map { DecCoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: DelegationDelegatorReward):
      Distribution.DelegationDelegatorReward {
    val builder = Distribution.DelegationDelegatorReward.newBuilder()
    builder.setValidatorAddress(obj.validatorAddress)
    builder.addAllReward(obj.reward.map { DecCoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object CommunityPoolSpendProposalWithDepositJvmConverter :
    ProtobufTypeMapper<CommunityPoolSpendProposalWithDeposit, Distribution.CommunityPoolSpendProposalWithDeposit>
    {
  public override val descriptor: Descriptors.Descriptor =
      Distribution.CommunityPoolSpendProposalWithDeposit.getDescriptor()

  public override val parser: Parser<Distribution.CommunityPoolSpendProposalWithDeposit> =
      Distribution.CommunityPoolSpendProposalWithDeposit.parser()

  public override fun convert(obj: Distribution.CommunityPoolSpendProposalWithDeposit):
      CommunityPoolSpendProposalWithDeposit = CommunityPoolSpendProposalWithDeposit(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	recipient = obj.getRecipient(),
  	amount = obj.getAmount(),
  	deposit = obj.getDeposit(),
  )

  public override fun convert(obj: CommunityPoolSpendProposalWithDeposit):
      Distribution.CommunityPoolSpendProposalWithDeposit {
    val builder = Distribution.CommunityPoolSpendProposalWithDeposit.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setRecipient(obj.recipient)
    builder.setAmount(obj.amount)
    builder.setDeposit(obj.deposit)
    return builder.build()
  }
}

// Transform from alliance/delegations.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import cosmos.base.v1beta1.DecCoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object DelegationJvmConverter : ProtobufTypeMapper<Delegation, Delegations.Delegation> {
  public override val descriptor: Descriptors.Descriptor = Delegations.Delegation.getDescriptor()

  public override val parser: Parser<Delegations.Delegation> = Delegations.Delegation.parser()

  public override fun convert(obj: Delegations.Delegation): Delegation = Delegation(
  	delegatorAddress = obj.getDelegatorAddress(),
  	validatorAddress = obj.getValidatorAddress(),
  	denom = obj.getDenom(),
  	shares = obj.getShares(),
  	rewardHistory = obj.getRewardHistoryList().map { RewardHistoryJvmConverter.convert(it) },
  	lastRewardClaimHeight = obj.getLastRewardClaimHeight().asKotlinType,
  )

  public override fun convert(obj: Delegation): Delegations.Delegation {
    val builder = Delegations.Delegation.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setDenom(obj.denom)
    builder.setShares(obj.shares)
    builder.addAllRewardHistory(obj.rewardHistory.map { RewardHistoryJvmConverter.convert(it) })
    builder.setLastRewardClaimHeight(obj.lastRewardClaimHeight.asJavaType)
    return builder.build()
  }
}

public object UndelegationJvmConverter : ProtobufTypeMapper<Undelegation, Delegations.Undelegation>
    {
  public override val descriptor: Descriptors.Descriptor = Delegations.Undelegation.getDescriptor()

  public override val parser: Parser<Delegations.Undelegation> = Delegations.Undelegation.parser()

  public override fun convert(obj: Delegations.Undelegation): Undelegation = Undelegation(
  	delegatorAddress = obj.getDelegatorAddress(),
  	validatorAddress = obj.getValidatorAddress(),
  	balance = CoinJvmConverter.convert(obj.getBalance()),
  )

  public override fun convert(obj: Undelegation): Delegations.Undelegation {
    val builder = Delegations.Undelegation.newBuilder()
    builder.setDelegatorAddress(obj.delegatorAddress)
    builder.setValidatorAddress(obj.validatorAddress)
    builder.setBalance(CoinJvmConverter.convert(obj.balance))
    return builder.build()
  }
}

public object QueuedUndelegationJvmConverter :
    ProtobufTypeMapper<QueuedUndelegation, Delegations.QueuedUndelegation> {
  public override val descriptor: Descriptors.Descriptor =
      Delegations.QueuedUndelegation.getDescriptor()

  public override val parser: Parser<Delegations.QueuedUndelegation> =
      Delegations.QueuedUndelegation.parser()

  public override fun convert(obj: Delegations.QueuedUndelegation): QueuedUndelegation =
      QueuedUndelegation(
  	entries = obj.getEntriesList().map { UndelegationJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueuedUndelegation): Delegations.QueuedUndelegation {
    val builder = Delegations.QueuedUndelegation.newBuilder()
    builder.addAllEntries(obj.entries.map { UndelegationJvmConverter.convert(it) })
    return builder.build()
  }
}

public object AllianceValidatorInfoJvmConverter :
    ProtobufTypeMapper<AllianceValidatorInfo, Delegations.AllianceValidatorInfo> {
  public override val descriptor: Descriptors.Descriptor =
      Delegations.AllianceValidatorInfo.getDescriptor()

  public override val parser: Parser<Delegations.AllianceValidatorInfo> =
      Delegations.AllianceValidatorInfo.parser()

  public override fun convert(obj: Delegations.AllianceValidatorInfo): AllianceValidatorInfo =
      AllianceValidatorInfo(
  	globalRewardHistory = obj.getGlobalRewardHistoryList().map {
      RewardHistoryJvmConverter.convert(it) },
  	totalDelegatorShares = obj.getTotalDelegatorSharesList().map { DecCoinJvmConverter.convert(it) },
  	validatorShares = obj.getValidatorSharesList().map { DecCoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: AllianceValidatorInfo): Delegations.AllianceValidatorInfo {
    val builder = Delegations.AllianceValidatorInfo.newBuilder()
    builder.addAllGlobalRewardHistory(obj.globalRewardHistory.map {
        RewardHistoryJvmConverter.convert(it) })
    builder.addAllTotalDelegatorShares(obj.totalDelegatorShares.map {
        DecCoinJvmConverter.convert(it) })
    builder.addAllValidatorShares(obj.validatorShares.map { DecCoinJvmConverter.convert(it) })
    return builder.build()
  }
}

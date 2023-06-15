// Transform from cosmos/distribution/v1beta1/distribution.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ParamsConverter : ProtobufConverter<Params>

public fun Params.toAny(): Any = Any(Params.TYPE_URL, with(ParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Params>): Params {
  if (typeUrl != Params.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorHistoricalRewardsConverter :
    ProtobufConverter<ValidatorHistoricalRewards>

public fun ValidatorHistoricalRewards.toAny(): Any = Any(ValidatorHistoricalRewards.TYPE_URL,
    with(ValidatorHistoricalRewardsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorHistoricalRewards>):
    ValidatorHistoricalRewards {
  if (typeUrl != ValidatorHistoricalRewards.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorCurrentRewardsConverter : ProtobufConverter<ValidatorCurrentRewards>

public fun ValidatorCurrentRewards.toAny(): Any = Any(ValidatorCurrentRewards.TYPE_URL,
    with(ValidatorCurrentRewardsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorCurrentRewards>):
    ValidatorCurrentRewards {
  if (typeUrl != ValidatorCurrentRewards.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorAccumulatedCommissionConverter :
    ProtobufConverter<ValidatorAccumulatedCommission>

public fun ValidatorAccumulatedCommission.toAny(): Any =
    Any(ValidatorAccumulatedCommission.TYPE_URL, with(ValidatorAccumulatedCommissionConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorAccumulatedCommission>):
    ValidatorAccumulatedCommission {
  if (typeUrl != ValidatorAccumulatedCommission.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorOutstandingRewardsConverter :
    ProtobufConverter<ValidatorOutstandingRewards>

public fun ValidatorOutstandingRewards.toAny(): Any = Any(ValidatorOutstandingRewards.TYPE_URL,
    with(ValidatorOutstandingRewardsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorOutstandingRewards>):
    ValidatorOutstandingRewards {
  if (typeUrl != ValidatorOutstandingRewards.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorSlashEventConverter : ProtobufConverter<ValidatorSlashEvent>

public fun ValidatorSlashEvent.toAny(): Any = Any(ValidatorSlashEvent.TYPE_URL,
    with(ValidatorSlashEventConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorSlashEvent>): ValidatorSlashEvent {
  if (typeUrl != ValidatorSlashEvent.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorSlashEventsConverter : ProtobufConverter<ValidatorSlashEvents>

public fun ValidatorSlashEvents.toAny(): Any = Any(ValidatorSlashEvents.TYPE_URL,
    with(ValidatorSlashEventsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorSlashEvents>): ValidatorSlashEvents {
  if (typeUrl != ValidatorSlashEvents.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FeePoolConverter : ProtobufConverter<FeePool>

public fun FeePool.toAny(): Any = Any(FeePool.TYPE_URL, with(FeePoolConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FeePool>): FeePool {
  if (typeUrl != FeePool.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CommunityPoolSpendProposalConverter :
    ProtobufConverter<CommunityPoolSpendProposal>

public fun CommunityPoolSpendProposal.toAny(): Any = Any(CommunityPoolSpendProposal.TYPE_URL,
    with(CommunityPoolSpendProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CommunityPoolSpendProposal>):
    CommunityPoolSpendProposal {
  if (typeUrl != CommunityPoolSpendProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DelegatorStartingInfoConverter : ProtobufConverter<DelegatorStartingInfo>

public fun DelegatorStartingInfo.toAny(): Any = Any(DelegatorStartingInfo.TYPE_URL,
    with(DelegatorStartingInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DelegatorStartingInfo>): DelegatorStartingInfo {
  if (typeUrl != DelegatorStartingInfo.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DelegationDelegatorRewardConverter :
    ProtobufConverter<DelegationDelegatorReward>

public fun DelegationDelegatorReward.toAny(): Any = Any(DelegationDelegatorReward.TYPE_URL,
    with(DelegationDelegatorRewardConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DelegationDelegatorReward>):
    DelegationDelegatorReward {
  if (typeUrl != DelegationDelegatorReward.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CommunityPoolSpendProposalWithDepositConverter :
    ProtobufConverter<CommunityPoolSpendProposalWithDeposit>

public fun CommunityPoolSpendProposalWithDeposit.toAny(): Any =
    Any(CommunityPoolSpendProposalWithDeposit.TYPE_URL,
    with(CommunityPoolSpendProposalWithDepositConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CommunityPoolSpendProposalWithDeposit>):
    CommunityPoolSpendProposalWithDeposit {
  if (typeUrl != CommunityPoolSpendProposalWithDeposit.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

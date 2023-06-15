// Transform from cosmos/distribution/v1beta1/distribution.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter

public actual object ValidatorHistoricalRewardsConverter :
    ProtobufConverter<ValidatorHistoricalRewards> by ValidatorHistoricalRewardsJvmConverter

public actual object ValidatorCurrentRewardsConverter : ProtobufConverter<ValidatorCurrentRewards>
    by ValidatorCurrentRewardsJvmConverter

public actual object ValidatorAccumulatedCommissionConverter :
    ProtobufConverter<ValidatorAccumulatedCommission> by ValidatorAccumulatedCommissionJvmConverter

public actual object ValidatorOutstandingRewardsConverter :
    ProtobufConverter<ValidatorOutstandingRewards> by ValidatorOutstandingRewardsJvmConverter

public actual object ValidatorSlashEventConverter : ProtobufConverter<ValidatorSlashEvent> by
    ValidatorSlashEventJvmConverter

public actual object ValidatorSlashEventsConverter : ProtobufConverter<ValidatorSlashEvents> by
    ValidatorSlashEventsJvmConverter

public actual object FeePoolConverter : ProtobufConverter<FeePool> by FeePoolJvmConverter

public actual object CommunityPoolSpendProposalConverter :
    ProtobufConverter<CommunityPoolSpendProposal> by CommunityPoolSpendProposalJvmConverter

public actual object DelegatorStartingInfoConverter : ProtobufConverter<DelegatorStartingInfo> by
    DelegatorStartingInfoJvmConverter

public actual object DelegationDelegatorRewardConverter :
    ProtobufConverter<DelegationDelegatorReward> by DelegationDelegatorRewardJvmConverter

public actual object CommunityPoolSpendProposalWithDepositConverter :
    ProtobufConverter<CommunityPoolSpendProposalWithDeposit> by
    CommunityPoolSpendProposalWithDepositJvmConverter

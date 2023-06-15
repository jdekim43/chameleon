// Transform from cosmos/distribution/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object DelegatorWithdrawInfoConverter : ProtobufConverter<DelegatorWithdrawInfo> by
    DelegatorWithdrawInfoJvmConverter

public actual object ValidatorOutstandingRewardsRecordConverter :
    ProtobufConverter<ValidatorOutstandingRewardsRecord> by
    ValidatorOutstandingRewardsRecordJvmConverter

public actual object ValidatorAccumulatedCommissionRecordConverter :
    ProtobufConverter<ValidatorAccumulatedCommissionRecord> by
    ValidatorAccumulatedCommissionRecordJvmConverter

public actual object ValidatorHistoricalRewardsRecordConverter :
    ProtobufConverter<ValidatorHistoricalRewardsRecord> by
    ValidatorHistoricalRewardsRecordJvmConverter

public actual object ValidatorCurrentRewardsRecordConverter :
    ProtobufConverter<ValidatorCurrentRewardsRecord> by ValidatorCurrentRewardsRecordJvmConverter

public actual object DelegatorStartingInfoRecordConverter :
    ProtobufConverter<DelegatorStartingInfoRecord> by DelegatorStartingInfoRecordJvmConverter

public actual object ValidatorSlashEventRecordConverter :
    ProtobufConverter<ValidatorSlashEventRecord> by ValidatorSlashEventRecordJvmConverter

public actual object GenesisStateConverter : ProtobufConverter<GenesisState> by
    GenesisStateJvmConverter

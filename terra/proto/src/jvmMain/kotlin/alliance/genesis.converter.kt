// Transform from alliance/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ValidatorInfoStateConverter : ProtobufConverter<ValidatorInfoState> by
    ValidatorInfoStateJvmConverter

public actual object RedelegationStateConverter : ProtobufConverter<RedelegationState> by
    RedelegationStateJvmConverter

public actual object UndelegationStateConverter : ProtobufConverter<UndelegationState> by
    UndelegationStateJvmConverter

public actual object RewardWeightChangeSnapshotStateConverter :
    ProtobufConverter<RewardWeightChangeSnapshotState> by
    RewardWeightChangeSnapshotStateJvmConverter

public actual object GenesisStateConverter : ProtobufConverter<GenesisState> by
    GenesisStateJvmConverter

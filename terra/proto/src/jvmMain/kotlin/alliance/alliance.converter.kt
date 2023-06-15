// Transform from alliance/alliance.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object RewardWeightRangeConverter : ProtobufConverter<RewardWeightRange> by
    RewardWeightRangeJvmConverter

public actual object AllianceAssetConverter : ProtobufConverter<AllianceAsset> by
    AllianceAssetJvmConverter

public actual object RewardWeightChangeSnapshotConverter :
    ProtobufConverter<RewardWeightChangeSnapshot> by RewardWeightChangeSnapshotJvmConverter

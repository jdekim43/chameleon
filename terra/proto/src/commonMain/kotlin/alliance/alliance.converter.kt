// Transform from alliance/alliance.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object RewardWeightRangeConverter : ProtobufConverter<RewardWeightRange>

public fun RewardWeightRange.toAny(): Any = Any(RewardWeightRange.TYPE_URL,
    with(RewardWeightRangeConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RewardWeightRange>): RewardWeightRange {
  if (typeUrl != RewardWeightRange.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AllianceAssetConverter : ProtobufConverter<AllianceAsset>

public fun AllianceAsset.toAny(): Any = Any(AllianceAsset.TYPE_URL, with(AllianceAssetConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AllianceAsset>): AllianceAsset {
  if (typeUrl != AllianceAsset.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RewardWeightChangeSnapshotConverter :
    ProtobufConverter<RewardWeightChangeSnapshot>

public fun RewardWeightChangeSnapshot.toAny(): Any = Any(RewardWeightChangeSnapshot.TYPE_URL,
    with(RewardWeightChangeSnapshotConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RewardWeightChangeSnapshot>):
    RewardWeightChangeSnapshot {
  if (typeUrl != RewardWeightChangeSnapshot.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

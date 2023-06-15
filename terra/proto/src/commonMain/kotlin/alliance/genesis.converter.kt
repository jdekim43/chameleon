// Transform from alliance/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ValidatorInfoStateConverter : ProtobufConverter<ValidatorInfoState>

public fun ValidatorInfoState.toAny(): Any = Any(ValidatorInfoState.TYPE_URL,
    with(ValidatorInfoStateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorInfoState>): ValidatorInfoState {
  if (typeUrl != ValidatorInfoState.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RedelegationStateConverter : ProtobufConverter<RedelegationState>

public fun RedelegationState.toAny(): Any = Any(RedelegationState.TYPE_URL,
    with(RedelegationStateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RedelegationState>): RedelegationState {
  if (typeUrl != RedelegationState.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object UndelegationStateConverter : ProtobufConverter<UndelegationState>

public fun UndelegationState.toAny(): Any = Any(UndelegationState.TYPE_URL,
    with(UndelegationStateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<UndelegationState>): UndelegationState {
  if (typeUrl != UndelegationState.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RewardWeightChangeSnapshotStateConverter :
    ProtobufConverter<RewardWeightChangeSnapshotState>

public fun RewardWeightChangeSnapshotState.toAny(): Any =
    Any(RewardWeightChangeSnapshotState.TYPE_URL, with(RewardWeightChangeSnapshotStateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RewardWeightChangeSnapshotState>):
    RewardWeightChangeSnapshotState {
  if (typeUrl != RewardWeightChangeSnapshotState.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GenesisStateConverter : ProtobufConverter<GenesisState>

public fun GenesisState.toAny(): Any = Any(GenesisState.TYPE_URL, with(GenesisStateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GenesisState>): GenesisState {
  if (typeUrl != GenesisState.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

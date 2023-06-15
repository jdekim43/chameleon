// Transform from cosmos/slashing/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.slashing.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object GenesisStateConverter : ProtobufConverter<GenesisState>

public fun GenesisState.toAny(): Any = Any(GenesisState.TYPE_URL, with(GenesisStateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GenesisState>): GenesisState {
  if (typeUrl != GenesisState.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SigningInfoConverter : ProtobufConverter<SigningInfo>

public fun SigningInfo.toAny(): Any = Any(SigningInfo.TYPE_URL, with(SigningInfoConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SigningInfo>): SigningInfo {
  if (typeUrl != SigningInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorMissedBlocksConverter : ProtobufConverter<ValidatorMissedBlocks>

public fun ValidatorMissedBlocks.toAny(): Any = Any(ValidatorMissedBlocks.TYPE_URL,
    with(ValidatorMissedBlocksConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorMissedBlocks>): ValidatorMissedBlocks {
  if (typeUrl != ValidatorMissedBlocks.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MissedBlockConverter : ProtobufConverter<MissedBlock>

public fun MissedBlock.toAny(): Any = Any(MissedBlock.TYPE_URL, with(MissedBlockConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MissedBlock>): MissedBlock {
  if (typeUrl != MissedBlock.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

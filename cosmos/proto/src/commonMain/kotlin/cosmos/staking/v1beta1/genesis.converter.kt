// Transform from cosmos/staking/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

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

public expect object LastValidatorPowerConverter : ProtobufConverter<LastValidatorPower>

public fun LastValidatorPower.toAny(): Any = Any(LastValidatorPower.TYPE_URL,
    with(LastValidatorPowerConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<LastValidatorPower>): LastValidatorPower {
  if (typeUrl != LastValidatorPower.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

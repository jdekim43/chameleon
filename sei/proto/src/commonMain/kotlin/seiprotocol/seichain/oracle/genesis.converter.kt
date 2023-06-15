// Transform from oracle/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.oracle

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

public expect object FeederDelegationConverter : ProtobufConverter<FeederDelegation>

public fun FeederDelegation.toAny(): Any = Any(FeederDelegation.TYPE_URL,
    with(FeederDelegationConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FeederDelegation>): FeederDelegation {
  if (typeUrl != FeederDelegation.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PenaltyCounterConverter : ProtobufConverter<PenaltyCounter>

public fun PenaltyCounter.toAny(): Any = Any(PenaltyCounter.TYPE_URL, with(PenaltyCounterConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PenaltyCounter>): PenaltyCounter {
  if (typeUrl != PenaltyCounter.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

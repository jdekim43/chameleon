// Transform from terra/oracle/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.oracle.v1beta1

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

public expect object MissCounterConverter : ProtobufConverter<MissCounter>

public fun MissCounter.toAny(): Any = Any(MissCounter.TYPE_URL, with(MissCounterConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MissCounter>): MissCounter {
  if (typeUrl != MissCounter.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TobinTaxConverter : ProtobufConverter<TobinTax>

public fun TobinTax.toAny(): Any = Any(TobinTax.TYPE_URL, with(TobinTaxConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TobinTax>): TobinTax {
  if (typeUrl != TobinTax.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

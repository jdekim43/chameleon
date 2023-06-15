// Transform from terra/treasury/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.treasury.v1beta1

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

public expect object TaxCapConverter : ProtobufConverter<TaxCap>

public fun TaxCap.toAny(): Any = Any(TaxCap.TYPE_URL, with(TaxCapConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TaxCap>): TaxCap {
  if (typeUrl != TaxCap.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EpochStateConverter : ProtobufConverter<EpochState>

public fun EpochState.toAny(): Any = Any(EpochState.TYPE_URL, with(EpochStateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EpochState>): EpochState {
  if (typeUrl != EpochState.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

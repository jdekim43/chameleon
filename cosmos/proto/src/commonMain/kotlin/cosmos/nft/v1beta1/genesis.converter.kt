// Transform from cosmos/nft/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.nft.v1beta1

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

public expect object EntryConverter : ProtobufConverter<Entry>

public fun Entry.toAny(): Any = Any(Entry.TYPE_URL, with(EntryConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Entry>): Entry {
  if (typeUrl != Entry.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

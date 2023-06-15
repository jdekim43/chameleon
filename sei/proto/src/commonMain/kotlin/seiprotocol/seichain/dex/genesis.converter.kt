// Transform from dex/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

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

public expect object ContractStateConverter : ProtobufConverter<ContractState>

public fun ContractState.toAny(): Any = Any(ContractState.TYPE_URL, with(ContractStateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ContractState>): ContractState {
  if (typeUrl != ContractState.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ContractPairPricesConverter : ProtobufConverter<ContractPairPrices>

public fun ContractPairPrices.toAny(): Any = Any(ContractPairPrices.TYPE_URL,
    with(ContractPairPricesConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ContractPairPrices>): ContractPairPrices {
  if (typeUrl != ContractPairPrices.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

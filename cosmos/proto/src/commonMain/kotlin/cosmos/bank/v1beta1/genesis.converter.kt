// Transform from cosmos/bank/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

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

public expect object BalanceConverter : ProtobufConverter<Balance>

public fun Balance.toAny(): Any = Any(Balance.TYPE_URL, with(BalanceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Balance>): Balance {
  if (typeUrl != Balance.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

// Transform from cosmwasm/wasm/v1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

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

public expect object CodeConverter : ProtobufConverter<Code>

public fun Code.toAny(): Any = Any(Code.TYPE_URL, with(CodeConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Code>): Code {
  if (typeUrl != Code.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ContractConverter : ProtobufConverter<Contract>

public fun Contract.toAny(): Any = Any(Contract.TYPE_URL, with(ContractConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Contract>): Contract {
  if (typeUrl != Contract.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SequenceConverter : ProtobufConverter<Sequence>

public fun Sequence.toAny(): Any = Any(Sequence.TYPE_URL, with(SequenceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Sequence>): Sequence {
  if (typeUrl != Sequence.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

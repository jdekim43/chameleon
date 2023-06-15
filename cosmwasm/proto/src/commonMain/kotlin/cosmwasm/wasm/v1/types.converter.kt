// Transform from cosmwasm/wasm/v1/types.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object AccessTypeParamConverter : ProtobufConverter<AccessTypeParam>

public fun AccessTypeParam.toAny(): Any = Any(AccessTypeParam.TYPE_URL,
    with(AccessTypeParamConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AccessTypeParam>): AccessTypeParam {
  if (typeUrl != AccessTypeParam.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AccessConfigConverter : ProtobufConverter<AccessConfig>

public fun AccessConfig.toAny(): Any = Any(AccessConfig.TYPE_URL, with(AccessConfigConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AccessConfig>): AccessConfig {
  if (typeUrl != AccessConfig.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ParamsConverter : ProtobufConverter<Params>

public fun Params.toAny(): Any = Any(Params.TYPE_URL, with(ParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Params>): Params {
  if (typeUrl != Params.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CodeInfoConverter : ProtobufConverter<CodeInfo>

public fun CodeInfo.toAny(): Any = Any(CodeInfo.TYPE_URL, with(CodeInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CodeInfo>): CodeInfo {
  if (typeUrl != CodeInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ContractInfoConverter : ProtobufConverter<ContractInfo>

public fun ContractInfo.toAny(): Any = Any(ContractInfo.TYPE_URL, with(ContractInfoConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ContractInfo>): ContractInfo {
  if (typeUrl != ContractInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ContractCodeHistoryEntryConverter : ProtobufConverter<ContractCodeHistoryEntry>

public fun ContractCodeHistoryEntry.toAny(): Any = Any(ContractCodeHistoryEntry.TYPE_URL,
    with(ContractCodeHistoryEntryConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ContractCodeHistoryEntry>):
    ContractCodeHistoryEntry {
  if (typeUrl != ContractCodeHistoryEntry.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AbsoluteTxPositionConverter : ProtobufConverter<AbsoluteTxPosition>

public fun AbsoluteTxPosition.toAny(): Any = Any(AbsoluteTxPosition.TYPE_URL,
    with(AbsoluteTxPositionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AbsoluteTxPosition>): AbsoluteTxPosition {
  if (typeUrl != AbsoluteTxPosition.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ModelConverter : ProtobufConverter<Model>

public fun Model.toAny(): Any = Any(Model.TYPE_URL, with(ModelConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Model>): Model {
  if (typeUrl != Model.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

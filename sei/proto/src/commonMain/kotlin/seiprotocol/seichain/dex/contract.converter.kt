// Transform from dex/contract.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ContractInfoConverter : ProtobufConverter<ContractInfo>

public fun ContractInfo.toAny(): Any = Any(ContractInfo.TYPE_URL, with(ContractInfoConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ContractInfo>): ContractInfo {
  if (typeUrl != ContractInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ContractInfoV2Converter : ProtobufConverter<ContractInfoV2>

public fun ContractInfoV2.toAny(): Any = Any(ContractInfoV2.TYPE_URL, with(ContractInfoV2Converter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ContractInfoV2>): ContractInfoV2 {
  if (typeUrl != ContractInfoV2.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ContractDependencyInfoConverter : ProtobufConverter<ContractDependencyInfo>

public fun ContractDependencyInfo.toAny(): Any = Any(ContractDependencyInfo.TYPE_URL,
    with(ContractDependencyInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ContractDependencyInfo>): ContractDependencyInfo {
  if (typeUrl != ContractDependencyInfo.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object LegacyContractInfoConverter : ProtobufConverter<LegacyContractInfo>

public fun LegacyContractInfo.toAny(): Any = Any(LegacyContractInfo.TYPE_URL,
    with(LegacyContractInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<LegacyContractInfo>): LegacyContractInfo {
  if (typeUrl != LegacyContractInfo.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

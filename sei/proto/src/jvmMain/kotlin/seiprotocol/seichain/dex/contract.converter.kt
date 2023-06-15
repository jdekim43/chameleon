// Transform from dex/contract.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ContractInfoConverter : ProtobufConverter<ContractInfo> by
    ContractInfoJvmConverter

public actual object ContractInfoV2Converter : ProtobufConverter<ContractInfoV2> by
    ContractInfoV2JvmConverter

public actual object ContractDependencyInfoConverter : ProtobufConverter<ContractDependencyInfo> by
    ContractDependencyInfoJvmConverter

public actual object LegacyContractInfoConverter : ProtobufConverter<LegacyContractInfo> by
    LegacyContractInfoJvmConverter

// Transform from cosmwasm/wasm/v1/types.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object AccessTypeParamConverter : ProtobufConverter<AccessTypeParam> by
    AccessTypeParamJvmConverter

public actual object AccessConfigConverter : ProtobufConverter<AccessConfig> by
    AccessConfigJvmConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter

public actual object CodeInfoConverter : ProtobufConverter<CodeInfo> by CodeInfoJvmConverter

public actual object ContractInfoConverter : ProtobufConverter<ContractInfo> by
    ContractInfoJvmConverter

public actual object ContractCodeHistoryEntryConverter : ProtobufConverter<ContractCodeHistoryEntry>
    by ContractCodeHistoryEntryJvmConverter

public actual object AbsoluteTxPositionConverter : ProtobufConverter<AbsoluteTxPosition> by
    AbsoluteTxPositionJvmConverter

public actual object ModelConverter : ProtobufConverter<Model> by ModelJvmConverter

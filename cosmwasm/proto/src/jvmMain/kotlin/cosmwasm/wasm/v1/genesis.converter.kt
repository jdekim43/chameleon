// Transform from cosmwasm/wasm/v1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object GenesisStateConverter : ProtobufConverter<GenesisState> by
    GenesisStateJvmConverter

public actual object CodeConverter : ProtobufConverter<Code> by CodeJvmConverter

public actual object ContractConverter : ProtobufConverter<Contract> by ContractJvmConverter

public actual object SequenceConverter : ProtobufConverter<Sequence> by SequenceJvmConverter

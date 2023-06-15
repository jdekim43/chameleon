// Transform from cosmos/autocli/v1/options.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.autocli.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ModuleOptionsConverter : ProtobufConverter<ModuleOptions> by
    ModuleOptionsJvmConverter

public actual object ServiceCommandDescriptorConverter : ProtobufConverter<ServiceCommandDescriptor>
    by ServiceCommandDescriptorJvmConverter

public actual object RpcCommandOptionsConverter : ProtobufConverter<RpcCommandOptions> by
    RpcCommandOptionsJvmConverter

public actual object FlagOptionsConverter : ProtobufConverter<FlagOptions> by
    FlagOptionsJvmConverter

public actual object PositionalArgDescriptorConverter : ProtobufConverter<PositionalArgDescriptor>
    by PositionalArgDescriptorJvmConverter

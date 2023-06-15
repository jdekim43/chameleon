// Transform from cosmos/autocli/v1/options.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.autocli.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ModuleOptionsConverter : ProtobufConverter<ModuleOptions>

public fun ModuleOptions.toAny(): Any = Any(ModuleOptions.TYPE_URL, with(ModuleOptionsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ModuleOptions>): ModuleOptions {
  if (typeUrl != ModuleOptions.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ServiceCommandDescriptorConverter : ProtobufConverter<ServiceCommandDescriptor>

public fun ServiceCommandDescriptor.toAny(): Any = Any(ServiceCommandDescriptor.TYPE_URL,
    with(ServiceCommandDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ServiceCommandDescriptor>):
    ServiceCommandDescriptor {
  if (typeUrl != ServiceCommandDescriptor.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RpcCommandOptionsConverter : ProtobufConverter<RpcCommandOptions>

public fun RpcCommandOptions.toAny(): Any = Any(RpcCommandOptions.TYPE_URL,
    with(RpcCommandOptionsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RpcCommandOptions>): RpcCommandOptions {
  if (typeUrl != RpcCommandOptions.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FlagOptionsConverter : ProtobufConverter<FlagOptions>

public fun FlagOptions.toAny(): Any = Any(FlagOptions.TYPE_URL, with(FlagOptionsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FlagOptions>): FlagOptions {
  if (typeUrl != FlagOptions.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PositionalArgDescriptorConverter : ProtobufConverter<PositionalArgDescriptor>

public fun PositionalArgDescriptor.toAny(): Any = Any(PositionalArgDescriptor.TYPE_URL,
    with(PositionalArgDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PositionalArgDescriptor>):
    PositionalArgDescriptor {
  if (typeUrl != PositionalArgDescriptor.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

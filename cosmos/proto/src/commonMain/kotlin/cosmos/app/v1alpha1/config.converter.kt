// Transform from cosmos/app/v1alpha1/config.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.app.v1alpha1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ConfigConverter : ProtobufConverter<Config>

public fun Config.toAny(): Any = Any(Config.TYPE_URL, with(ConfigConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Config>): Config {
  if (typeUrl != Config.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ModuleConfigConverter : ProtobufConverter<ModuleConfig>

public fun ModuleConfig.toAny(): Any = Any(ModuleConfig.TYPE_URL, with(ModuleConfigConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ModuleConfig>): ModuleConfig {
  if (typeUrl != ModuleConfig.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GolangBindingConverter : ProtobufConverter<GolangBinding>

public fun GolangBinding.toAny(): Any = Any(GolangBinding.TYPE_URL, with(GolangBindingConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GolangBinding>): GolangBinding {
  if (typeUrl != GolangBinding.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

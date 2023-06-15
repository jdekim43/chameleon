// Transform from cosmos/orm/module/v1alpha1/module.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.orm.module.v1alpha1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ModuleConverter : ProtobufConverter<Module>

public fun Module.toAny(): Any = Any(Module.TYPE_URL, with(ModuleConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Module>): Module {
  if (typeUrl != Module.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

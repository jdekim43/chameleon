// Transform from cosmos/orm/v1alpha1/schema.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.orm.v1alpha1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ModuleSchemaDescriptorConverter : ProtobufConverter<ModuleSchemaDescriptor> {
  public object FileEntryConverter : ProtobufConverter<ModuleSchemaDescriptor.FileEntry>
}

public fun ModuleSchemaDescriptor.toAny(): Any = Any(ModuleSchemaDescriptor.TYPE_URL,
    with(ModuleSchemaDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ModuleSchemaDescriptor>): ModuleSchemaDescriptor {
  if (typeUrl != ModuleSchemaDescriptor.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

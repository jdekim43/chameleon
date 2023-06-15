// Transform from cosmos/orm/v1alpha1/schema.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.orm.v1alpha1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ModuleSchemaDescriptorConverter : ProtobufConverter<ModuleSchemaDescriptor> by
    ModuleSchemaDescriptorJvmConverter {
  public actual object FileEntryConverter : ProtobufConverter<ModuleSchemaDescriptor.FileEntry> by
      ModuleSchemaDescriptorJvmConverter.FileEntryJvmConverter
}

// Transform from cosmos/orm/v1alpha1/schema.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.orm.v1alpha1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ModuleSchemaDescriptorJvmConverter :
    ProtobufTypeMapper<ModuleSchemaDescriptor, Schema.ModuleSchemaDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Schema.ModuleSchemaDescriptor.getDescriptor()

  public override val parser: Parser<Schema.ModuleSchemaDescriptor> =
      Schema.ModuleSchemaDescriptor.parser()

  public override fun convert(obj: Schema.ModuleSchemaDescriptor): ModuleSchemaDescriptor =
      ModuleSchemaDescriptor(
  	schemaFile = obj.getSchemaFileList().map { FileEntryJvmConverter.convert(it) },
  	prefix = obj.getPrefix().toByteArray(),
  )

  public override fun convert(obj: ModuleSchemaDescriptor): Schema.ModuleSchemaDescriptor {
    val builder = Schema.ModuleSchemaDescriptor.newBuilder()
    builder.addAllSchemaFile(obj.schemaFile.map { FileEntryJvmConverter.convert(it) })
    builder.setPrefix(ByteString.copyFrom(obj.prefix))
    return builder.build()
  }

  public object FileEntryJvmConverter :
      ProtobufTypeMapper<ModuleSchemaDescriptor.FileEntry, Schema.ModuleSchemaDescriptor.FileEntry>
      {
    public override val descriptor: Descriptors.Descriptor =
        Schema.ModuleSchemaDescriptor.FileEntry.getDescriptor()

    public override val parser: Parser<Schema.ModuleSchemaDescriptor.FileEntry> =
        Schema.ModuleSchemaDescriptor.FileEntry.parser()

    public override fun convert(obj: Schema.ModuleSchemaDescriptor.FileEntry):
        ModuleSchemaDescriptor.FileEntry = ModuleSchemaDescriptor.FileEntry(
    	id = obj.getId().asKotlinType,
    	protoFileName = obj.getProtoFileName(),
    	storageType = StorageType.forNumber(obj.getStorageType().number),
    )

    public override fun convert(obj: ModuleSchemaDescriptor.FileEntry):
        Schema.ModuleSchemaDescriptor.FileEntry {
      val builder = Schema.ModuleSchemaDescriptor.FileEntry.newBuilder()
      builder.setId(obj.id.asJavaType)
      builder.setProtoFileName(obj.protoFileName)
      builder.setStorageType(Schema.StorageType.forNumber(obj.storageType.number))
      return builder.build()
    }
  }
}

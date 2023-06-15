// Transform from cosmos/app/v1alpha1/module.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.app.v1alpha1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ModuleDescriptorConverter : ProtobufConverter<ModuleDescriptor>

public fun ModuleDescriptor.toAny(): Any = Any(ModuleDescriptor.TYPE_URL,
    with(ModuleDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ModuleDescriptor>): ModuleDescriptor {
  if (typeUrl != ModuleDescriptor.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PackageReferenceConverter : ProtobufConverter<PackageReference>

public fun PackageReference.toAny(): Any = Any(PackageReference.TYPE_URL,
    with(PackageReferenceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PackageReference>): PackageReference {
  if (typeUrl != PackageReference.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MigrateFromInfoConverter : ProtobufConverter<MigrateFromInfo>

public fun MigrateFromInfo.toAny(): Any = Any(MigrateFromInfo.TYPE_URL,
    with(MigrateFromInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MigrateFromInfo>): MigrateFromInfo {
  if (typeUrl != MigrateFromInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

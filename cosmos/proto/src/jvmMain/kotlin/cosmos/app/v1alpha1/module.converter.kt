// Transform from cosmos/app/v1alpha1/module.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.app.v1alpha1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ModuleDescriptorConverter : ProtobufConverter<ModuleDescriptor> by
    ModuleDescriptorJvmConverter

public actual object PackageReferenceConverter : ProtobufConverter<PackageReference> by
    PackageReferenceJvmConverter

public actual object MigrateFromInfoConverter : ProtobufConverter<MigrateFromInfo> by
    MigrateFromInfoJvmConverter

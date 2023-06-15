// Transform from cosmos/auth/module/v1/module.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.auth.module.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ModuleConverter : ProtobufConverter<Module> by ModuleJvmConverter

public actual object ModuleAccountPermissionConverter : ProtobufConverter<ModuleAccountPermission>
    by ModuleAccountPermissionJvmConverter

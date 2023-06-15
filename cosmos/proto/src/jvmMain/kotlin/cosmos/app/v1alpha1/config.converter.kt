// Transform from cosmos/app/v1alpha1/config.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.app.v1alpha1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ConfigConverter : ProtobufConverter<Config> by ConfigJvmConverter

public actual object ModuleConfigConverter : ProtobufConverter<ModuleConfig> by
    ModuleConfigJvmConverter

public actual object GolangBindingConverter : ProtobufConverter<GolangBinding> by
    GolangBindingJvmConverter

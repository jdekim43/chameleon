// Transform from cosmos/app/runtime/v1alpha1/module.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.app.runtime.v1alpha1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ModuleConverter : ProtobufConverter<Module> by ModuleJvmConverter

public actual object StoreKeyConfigConverter : ProtobufConverter<StoreKeyConfig> by
    StoreKeyConfigJvmConverter

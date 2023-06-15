// Transform from cosmos/crisis/module/v1/module.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crisis.module.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ModuleConverter : ProtobufConverter<Module> by ModuleJvmConverter

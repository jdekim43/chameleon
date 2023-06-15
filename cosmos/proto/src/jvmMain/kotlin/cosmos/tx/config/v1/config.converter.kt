// Transform from cosmos/tx/config/v1/config.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.tx.config.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ConfigConverter : ProtobufConverter<Config> by ConfigJvmConverter

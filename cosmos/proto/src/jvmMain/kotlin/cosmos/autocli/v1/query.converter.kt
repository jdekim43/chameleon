// Transform from cosmos/autocli/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.autocli.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object AppOptionsRequestConverter : ProtobufConverter<AppOptionsRequest> by
    AppOptionsRequestJvmConverter

public actual object AppOptionsResponseConverter : ProtobufConverter<AppOptionsResponse> by
    AppOptionsResponseJvmConverter

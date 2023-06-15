// Transform from cosmos/base/node/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.node.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ConfigRequestConverter : ProtobufConverter<ConfigRequest> by
    ConfigRequestJvmConverter

public actual object ConfigResponseConverter : ProtobufConverter<ConfigResponse> by
    ConfigResponseJvmConverter

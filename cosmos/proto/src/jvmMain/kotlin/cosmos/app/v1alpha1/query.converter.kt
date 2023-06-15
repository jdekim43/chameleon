// Transform from cosmos/app/v1alpha1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.app.v1alpha1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryConfigRequestConverter : ProtobufConverter<QueryConfigRequest> by
    QueryConfigRequestJvmConverter

public actual object QueryConfigResponseConverter : ProtobufConverter<QueryConfigResponse> by
    QueryConfigResponseJvmConverter

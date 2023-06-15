// Transform from mint/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.mint

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

public actual object QueryMinterRequestConverter : ProtobufConverter<QueryMinterRequest> by
    QueryMinterRequestJvmConverter

public actual object QueryMinterResponseConverter : ProtobufConverter<QueryMinterResponse> by
    QueryMinterResponseJvmConverter

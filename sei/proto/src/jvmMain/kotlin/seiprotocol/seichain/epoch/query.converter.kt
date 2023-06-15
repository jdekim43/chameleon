// Transform from epoch/query.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.epoch

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

public actual object QueryEpochRequestConverter : ProtobufConverter<QueryEpochRequest> by
    QueryEpochRequestJvmConverter

public actual object QueryEpochResponseConverter : ProtobufConverter<QueryEpochResponse> by
    QueryEpochResponseJvmConverter

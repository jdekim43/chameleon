// Transform from epoch/query.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.epoch

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest>

public fun QueryParamsRequest.toAny(): Any = Any(QueryParamsRequest.TYPE_URL,
    with(QueryParamsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryParamsRequest>): QueryParamsRequest {
  if (typeUrl != QueryParamsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse>

public fun QueryParamsResponse.toAny(): Any = Any(QueryParamsResponse.TYPE_URL,
    with(QueryParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryParamsResponse>): QueryParamsResponse {
  if (typeUrl != QueryParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryEpochRequestConverter : ProtobufConverter<QueryEpochRequest>

public fun QueryEpochRequest.toAny(): Any = Any(QueryEpochRequest.TYPE_URL,
    with(QueryEpochRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryEpochRequest>): QueryEpochRequest {
  if (typeUrl != QueryEpochRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryEpochResponseConverter : ProtobufConverter<QueryEpochResponse>

public fun QueryEpochResponse.toAny(): Any = Any(QueryEpochResponse.TYPE_URL,
    with(QueryEpochResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryEpochResponse>): QueryEpochResponse {
  if (typeUrl != QueryEpochResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

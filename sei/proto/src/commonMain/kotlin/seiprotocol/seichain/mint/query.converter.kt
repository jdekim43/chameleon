// Transform from mint/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.mint

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

public expect object QueryMinterRequestConverter : ProtobufConverter<QueryMinterRequest>

public fun QueryMinterRequest.toAny(): Any = Any(QueryMinterRequest.TYPE_URL,
    with(QueryMinterRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryMinterRequest>): QueryMinterRequest {
  if (typeUrl != QueryMinterRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryMinterResponseConverter : ProtobufConverter<QueryMinterResponse>

public fun QueryMinterResponse.toAny(): Any = Any(QueryMinterResponse.TYPE_URL,
    with(QueryMinterResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryMinterResponse>): QueryMinterResponse {
  if (typeUrl != QueryMinterResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

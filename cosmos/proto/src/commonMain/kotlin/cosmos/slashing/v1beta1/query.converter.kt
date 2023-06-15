// Transform from cosmos/slashing/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.slashing.v1beta1

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

public expect object QuerySigningInfoRequestConverter : ProtobufConverter<QuerySigningInfoRequest>

public fun QuerySigningInfoRequest.toAny(): Any = Any(QuerySigningInfoRequest.TYPE_URL,
    with(QuerySigningInfoRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySigningInfoRequest>):
    QuerySigningInfoRequest {
  if (typeUrl != QuerySigningInfoRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySigningInfoResponseConverter : ProtobufConverter<QuerySigningInfoResponse>

public fun QuerySigningInfoResponse.toAny(): Any = Any(QuerySigningInfoResponse.TYPE_URL,
    with(QuerySigningInfoResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySigningInfoResponse>):
    QuerySigningInfoResponse {
  if (typeUrl != QuerySigningInfoResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySigningInfosRequestConverter : ProtobufConverter<QuerySigningInfosRequest>

public fun QuerySigningInfosRequest.toAny(): Any = Any(QuerySigningInfosRequest.TYPE_URL,
    with(QuerySigningInfosRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySigningInfosRequest>):
    QuerySigningInfosRequest {
  if (typeUrl != QuerySigningInfosRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySigningInfosResponseConverter :
    ProtobufConverter<QuerySigningInfosResponse>

public fun QuerySigningInfosResponse.toAny(): Any = Any(QuerySigningInfosResponse.TYPE_URL,
    with(QuerySigningInfosResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySigningInfosResponse>):
    QuerySigningInfosResponse {
  if (typeUrl != QuerySigningInfosResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

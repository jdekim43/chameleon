// Transform from tokenfactory/query.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.tokenfactory

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

public expect object QueryDenomAuthorityMetadataRequestConverter :
    ProtobufConverter<QueryDenomAuthorityMetadataRequest>

public fun QueryDenomAuthorityMetadataRequest.toAny(): Any =
    Any(QueryDenomAuthorityMetadataRequest.TYPE_URL,
    with(QueryDenomAuthorityMetadataRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDenomAuthorityMetadataRequest>):
    QueryDenomAuthorityMetadataRequest {
  if (typeUrl != QueryDenomAuthorityMetadataRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDenomAuthorityMetadataResponseConverter :
    ProtobufConverter<QueryDenomAuthorityMetadataResponse>

public fun QueryDenomAuthorityMetadataResponse.toAny(): Any =
    Any(QueryDenomAuthorityMetadataResponse.TYPE_URL,
    with(QueryDenomAuthorityMetadataResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDenomAuthorityMetadataResponse>):
    QueryDenomAuthorityMetadataResponse {
  if (typeUrl != QueryDenomAuthorityMetadataResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDenomsFromCreatorRequestConverter :
    ProtobufConverter<QueryDenomsFromCreatorRequest>

public fun QueryDenomsFromCreatorRequest.toAny(): Any = Any(QueryDenomsFromCreatorRequest.TYPE_URL,
    with(QueryDenomsFromCreatorRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDenomsFromCreatorRequest>):
    QueryDenomsFromCreatorRequest {
  if (typeUrl != QueryDenomsFromCreatorRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDenomsFromCreatorResponseConverter :
    ProtobufConverter<QueryDenomsFromCreatorResponse>

public fun QueryDenomsFromCreatorResponse.toAny(): Any =
    Any(QueryDenomsFromCreatorResponse.TYPE_URL, with(QueryDenomsFromCreatorResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDenomsFromCreatorResponse>):
    QueryDenomsFromCreatorResponse {
  if (typeUrl != QueryDenomsFromCreatorResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

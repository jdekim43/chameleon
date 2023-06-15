// Transform from cosmos/authz/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.authz.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryGrantsRequestConverter : ProtobufConverter<QueryGrantsRequest>

public fun QueryGrantsRequest.toAny(): Any = Any(QueryGrantsRequest.TYPE_URL,
    with(QueryGrantsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGrantsRequest>): QueryGrantsRequest {
  if (typeUrl != QueryGrantsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGrantsResponseConverter : ProtobufConverter<QueryGrantsResponse>

public fun QueryGrantsResponse.toAny(): Any = Any(QueryGrantsResponse.TYPE_URL,
    with(QueryGrantsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGrantsResponse>): QueryGrantsResponse {
  if (typeUrl != QueryGrantsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGranterGrantsRequestConverter :
    ProtobufConverter<QueryGranterGrantsRequest>

public fun QueryGranterGrantsRequest.toAny(): Any = Any(QueryGranterGrantsRequest.TYPE_URL,
    with(QueryGranterGrantsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGranterGrantsRequest>):
    QueryGranterGrantsRequest {
  if (typeUrl != QueryGranterGrantsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGranterGrantsResponseConverter :
    ProtobufConverter<QueryGranterGrantsResponse>

public fun QueryGranterGrantsResponse.toAny(): Any = Any(QueryGranterGrantsResponse.TYPE_URL,
    with(QueryGranterGrantsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGranterGrantsResponse>):
    QueryGranterGrantsResponse {
  if (typeUrl != QueryGranterGrantsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGranteeGrantsRequestConverter :
    ProtobufConverter<QueryGranteeGrantsRequest>

public fun QueryGranteeGrantsRequest.toAny(): Any = Any(QueryGranteeGrantsRequest.TYPE_URL,
    with(QueryGranteeGrantsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGranteeGrantsRequest>):
    QueryGranteeGrantsRequest {
  if (typeUrl != QueryGranteeGrantsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGranteeGrantsResponseConverter :
    ProtobufConverter<QueryGranteeGrantsResponse>

public fun QueryGranteeGrantsResponse.toAny(): Any = Any(QueryGranteeGrantsResponse.TYPE_URL,
    with(QueryGranteeGrantsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGranteeGrantsResponse>):
    QueryGranteeGrantsResponse {
  if (typeUrl != QueryGranteeGrantsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

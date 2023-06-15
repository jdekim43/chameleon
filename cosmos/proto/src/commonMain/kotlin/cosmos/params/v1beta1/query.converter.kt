// Transform from cosmos/params/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.params.v1beta1

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

public expect object QuerySubspacesRequestConverter : ProtobufConverter<QuerySubspacesRequest>

public fun QuerySubspacesRequest.toAny(): Any = Any(QuerySubspacesRequest.TYPE_URL,
    with(QuerySubspacesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySubspacesRequest>): QuerySubspacesRequest {
  if (typeUrl != QuerySubspacesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySubspacesResponseConverter : ProtobufConverter<QuerySubspacesResponse>

public fun QuerySubspacesResponse.toAny(): Any = Any(QuerySubspacesResponse.TYPE_URL,
    with(QuerySubspacesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySubspacesResponse>): QuerySubspacesResponse {
  if (typeUrl != QuerySubspacesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SubspaceConverter : ProtobufConverter<Subspace>

public fun Subspace.toAny(): Any = Any(Subspace.TYPE_URL, with(SubspaceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Subspace>): Subspace {
  if (typeUrl != Subspace.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

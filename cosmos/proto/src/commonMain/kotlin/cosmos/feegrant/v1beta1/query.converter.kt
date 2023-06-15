// Transform from cosmos/feegrant/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.feegrant.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryAllowanceRequestConverter : ProtobufConverter<QueryAllowanceRequest>

public fun QueryAllowanceRequest.toAny(): Any = Any(QueryAllowanceRequest.TYPE_URL,
    with(QueryAllowanceRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllowanceRequest>): QueryAllowanceRequest {
  if (typeUrl != QueryAllowanceRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllowanceResponseConverter : ProtobufConverter<QueryAllowanceResponse>

public fun QueryAllowanceResponse.toAny(): Any = Any(QueryAllowanceResponse.TYPE_URL,
    with(QueryAllowanceResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllowanceResponse>): QueryAllowanceResponse {
  if (typeUrl != QueryAllowanceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllowancesRequestConverter : ProtobufConverter<QueryAllowancesRequest>

public fun QueryAllowancesRequest.toAny(): Any = Any(QueryAllowancesRequest.TYPE_URL,
    with(QueryAllowancesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllowancesRequest>): QueryAllowancesRequest {
  if (typeUrl != QueryAllowancesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllowancesResponseConverter : ProtobufConverter<QueryAllowancesResponse>

public fun QueryAllowancesResponse.toAny(): Any = Any(QueryAllowancesResponse.TYPE_URL,
    with(QueryAllowancesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllowancesResponse>):
    QueryAllowancesResponse {
  if (typeUrl != QueryAllowancesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllowancesByGranterRequestConverter :
    ProtobufConverter<QueryAllowancesByGranterRequest>

public fun QueryAllowancesByGranterRequest.toAny(): Any =
    Any(QueryAllowancesByGranterRequest.TYPE_URL, with(QueryAllowancesByGranterRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllowancesByGranterRequest>):
    QueryAllowancesByGranterRequest {
  if (typeUrl != QueryAllowancesByGranterRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllowancesByGranterResponseConverter :
    ProtobufConverter<QueryAllowancesByGranterResponse>

public fun QueryAllowancesByGranterResponse.toAny(): Any =
    Any(QueryAllowancesByGranterResponse.TYPE_URL, with(QueryAllowancesByGranterResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllowancesByGranterResponse>):
    QueryAllowancesByGranterResponse {
  if (typeUrl != QueryAllowancesByGranterResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

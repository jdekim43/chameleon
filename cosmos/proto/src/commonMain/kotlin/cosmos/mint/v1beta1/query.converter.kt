// Transform from cosmos/mint/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.mint.v1beta1

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

public expect object QueryInflationRequestConverter : ProtobufConverter<QueryInflationRequest>

public fun QueryInflationRequest.toAny(): Any = Any(QueryInflationRequest.TYPE_URL,
    with(QueryInflationRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryInflationRequest>): QueryInflationRequest {
  if (typeUrl != QueryInflationRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryInflationResponseConverter : ProtobufConverter<QueryInflationResponse>

public fun QueryInflationResponse.toAny(): Any = Any(QueryInflationResponse.TYPE_URL,
    with(QueryInflationResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryInflationResponse>): QueryInflationResponse {
  if (typeUrl != QueryInflationResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAnnualProvisionsRequestConverter :
    ProtobufConverter<QueryAnnualProvisionsRequest>

public fun QueryAnnualProvisionsRequest.toAny(): Any = Any(QueryAnnualProvisionsRequest.TYPE_URL,
    with(QueryAnnualProvisionsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAnnualProvisionsRequest>):
    QueryAnnualProvisionsRequest {
  if (typeUrl != QueryAnnualProvisionsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAnnualProvisionsResponseConverter :
    ProtobufConverter<QueryAnnualProvisionsResponse>

public fun QueryAnnualProvisionsResponse.toAny(): Any = Any(QueryAnnualProvisionsResponse.TYPE_URL,
    with(QueryAnnualProvisionsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAnnualProvisionsResponse>):
    QueryAnnualProvisionsResponse {
  if (typeUrl != QueryAnnualProvisionsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

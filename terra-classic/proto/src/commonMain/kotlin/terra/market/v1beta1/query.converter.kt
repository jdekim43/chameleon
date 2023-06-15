// Transform from terra/market/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.market.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QuerySwapRequestConverter : ProtobufConverter<QuerySwapRequest>

public fun QuerySwapRequest.toAny(): Any = Any(QuerySwapRequest.TYPE_URL,
    with(QuerySwapRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySwapRequest>): QuerySwapRequest {
  if (typeUrl != QuerySwapRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySwapResponseConverter : ProtobufConverter<QuerySwapResponse>

public fun QuerySwapResponse.toAny(): Any = Any(QuerySwapResponse.TYPE_URL,
    with(QuerySwapResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySwapResponse>): QuerySwapResponse {
  if (typeUrl != QuerySwapResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTerraPoolDeltaRequestConverter :
    ProtobufConverter<QueryTerraPoolDeltaRequest>

public fun QueryTerraPoolDeltaRequest.toAny(): Any = Any(QueryTerraPoolDeltaRequest.TYPE_URL,
    with(QueryTerraPoolDeltaRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTerraPoolDeltaRequest>):
    QueryTerraPoolDeltaRequest {
  if (typeUrl != QueryTerraPoolDeltaRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTerraPoolDeltaResponseConverter :
    ProtobufConverter<QueryTerraPoolDeltaResponse>

public fun QueryTerraPoolDeltaResponse.toAny(): Any = Any(QueryTerraPoolDeltaResponse.TYPE_URL,
    with(QueryTerraPoolDeltaResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTerraPoolDeltaResponse>):
    QueryTerraPoolDeltaResponse {
  if (typeUrl != QueryTerraPoolDeltaResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

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

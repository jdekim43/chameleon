// Transform from terra/treasury/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.treasury.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryTaxRateRequestConverter : ProtobufConverter<QueryTaxRateRequest>

public fun QueryTaxRateRequest.toAny(): Any = Any(QueryTaxRateRequest.TYPE_URL,
    with(QueryTaxRateRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTaxRateRequest>): QueryTaxRateRequest {
  if (typeUrl != QueryTaxRateRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTaxRateResponseConverter : ProtobufConverter<QueryTaxRateResponse>

public fun QueryTaxRateResponse.toAny(): Any = Any(QueryTaxRateResponse.TYPE_URL,
    with(QueryTaxRateResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTaxRateResponse>): QueryTaxRateResponse {
  if (typeUrl != QueryTaxRateResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTaxCapRequestConverter : ProtobufConverter<QueryTaxCapRequest>

public fun QueryTaxCapRequest.toAny(): Any = Any(QueryTaxCapRequest.TYPE_URL,
    with(QueryTaxCapRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTaxCapRequest>): QueryTaxCapRequest {
  if (typeUrl != QueryTaxCapRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTaxCapResponseConverter : ProtobufConverter<QueryTaxCapResponse>

public fun QueryTaxCapResponse.toAny(): Any = Any(QueryTaxCapResponse.TYPE_URL,
    with(QueryTaxCapResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTaxCapResponse>): QueryTaxCapResponse {
  if (typeUrl != QueryTaxCapResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTaxCapsRequestConverter : ProtobufConverter<QueryTaxCapsRequest>

public fun QueryTaxCapsRequest.toAny(): Any = Any(QueryTaxCapsRequest.TYPE_URL,
    with(QueryTaxCapsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTaxCapsRequest>): QueryTaxCapsRequest {
  if (typeUrl != QueryTaxCapsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTaxCapsResponseItemConverter : ProtobufConverter<QueryTaxCapsResponseItem>

public fun QueryTaxCapsResponseItem.toAny(): Any = Any(QueryTaxCapsResponseItem.TYPE_URL,
    with(QueryTaxCapsResponseItemConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTaxCapsResponseItem>):
    QueryTaxCapsResponseItem {
  if (typeUrl != QueryTaxCapsResponseItem.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTaxCapsResponseConverter : ProtobufConverter<QueryTaxCapsResponse>

public fun QueryTaxCapsResponse.toAny(): Any = Any(QueryTaxCapsResponse.TYPE_URL,
    with(QueryTaxCapsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTaxCapsResponse>): QueryTaxCapsResponse {
  if (typeUrl != QueryTaxCapsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryRewardWeightRequestConverter : ProtobufConverter<QueryRewardWeightRequest>

public fun QueryRewardWeightRequest.toAny(): Any = Any(QueryRewardWeightRequest.TYPE_URL,
    with(QueryRewardWeightRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryRewardWeightRequest>):
    QueryRewardWeightRequest {
  if (typeUrl != QueryRewardWeightRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryRewardWeightResponseConverter :
    ProtobufConverter<QueryRewardWeightResponse>

public fun QueryRewardWeightResponse.toAny(): Any = Any(QueryRewardWeightResponse.TYPE_URL,
    with(QueryRewardWeightResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryRewardWeightResponse>):
    QueryRewardWeightResponse {
  if (typeUrl != QueryRewardWeightResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTaxProceedsRequestConverter : ProtobufConverter<QueryTaxProceedsRequest>

public fun QueryTaxProceedsRequest.toAny(): Any = Any(QueryTaxProceedsRequest.TYPE_URL,
    with(QueryTaxProceedsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTaxProceedsRequest>):
    QueryTaxProceedsRequest {
  if (typeUrl != QueryTaxProceedsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTaxProceedsResponseConverter : ProtobufConverter<QueryTaxProceedsResponse>

public fun QueryTaxProceedsResponse.toAny(): Any = Any(QueryTaxProceedsResponse.TYPE_URL,
    with(QueryTaxProceedsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTaxProceedsResponse>):
    QueryTaxProceedsResponse {
  if (typeUrl != QueryTaxProceedsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySeigniorageProceedsRequestConverter :
    ProtobufConverter<QuerySeigniorageProceedsRequest>

public fun QuerySeigniorageProceedsRequest.toAny(): Any =
    Any(QuerySeigniorageProceedsRequest.TYPE_URL, with(QuerySeigniorageProceedsRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySeigniorageProceedsRequest>):
    QuerySeigniorageProceedsRequest {
  if (typeUrl != QuerySeigniorageProceedsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QuerySeigniorageProceedsResponseConverter :
    ProtobufConverter<QuerySeigniorageProceedsResponse>

public fun QuerySeigniorageProceedsResponse.toAny(): Any =
    Any(QuerySeigniorageProceedsResponse.TYPE_URL, with(QuerySeigniorageProceedsResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QuerySeigniorageProceedsResponse>):
    QuerySeigniorageProceedsResponse {
  if (typeUrl != QuerySeigniorageProceedsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryIndicatorsRequestConverter : ProtobufConverter<QueryIndicatorsRequest>

public fun QueryIndicatorsRequest.toAny(): Any = Any(QueryIndicatorsRequest.TYPE_URL,
    with(QueryIndicatorsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryIndicatorsRequest>): QueryIndicatorsRequest {
  if (typeUrl != QueryIndicatorsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryIndicatorsResponseConverter : ProtobufConverter<QueryIndicatorsResponse>

public fun QueryIndicatorsResponse.toAny(): Any = Any(QueryIndicatorsResponse.TYPE_URL,
    with(QueryIndicatorsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryIndicatorsResponse>):
    QueryIndicatorsResponse {
  if (typeUrl != QueryIndicatorsResponse.TYPE_URL) throw
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

public expect object QueryBurnTaxExemptionListRequestConverter :
    ProtobufConverter<QueryBurnTaxExemptionListRequest>

public fun QueryBurnTaxExemptionListRequest.toAny(): Any =
    Any(QueryBurnTaxExemptionListRequest.TYPE_URL, with(QueryBurnTaxExemptionListRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBurnTaxExemptionListRequest>):
    QueryBurnTaxExemptionListRequest {
  if (typeUrl != QueryBurnTaxExemptionListRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryBurnTaxExemptionListResponseConverter :
    ProtobufConverter<QueryBurnTaxExemptionListResponse>

public fun QueryBurnTaxExemptionListResponse.toAny(): Any =
    Any(QueryBurnTaxExemptionListResponse.TYPE_URL, with(QueryBurnTaxExemptionListResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryBurnTaxExemptionListResponse>):
    QueryBurnTaxExemptionListResponse {
  if (typeUrl != QueryBurnTaxExemptionListResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

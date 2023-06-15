// Transform from cosmos/staking/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryValidatorsRequestConverter : ProtobufConverter<QueryValidatorsRequest>

public fun QueryValidatorsRequest.toAny(): Any = Any(QueryValidatorsRequest.TYPE_URL,
    with(QueryValidatorsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValidatorsRequest>): QueryValidatorsRequest {
  if (typeUrl != QueryValidatorsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValidatorsResponseConverter : ProtobufConverter<QueryValidatorsResponse>

public fun QueryValidatorsResponse.toAny(): Any = Any(QueryValidatorsResponse.TYPE_URL,
    with(QueryValidatorsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValidatorsResponse>):
    QueryValidatorsResponse {
  if (typeUrl != QueryValidatorsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValidatorRequestConverter : ProtobufConverter<QueryValidatorRequest>

public fun QueryValidatorRequest.toAny(): Any = Any(QueryValidatorRequest.TYPE_URL,
    with(QueryValidatorRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValidatorRequest>): QueryValidatorRequest {
  if (typeUrl != QueryValidatorRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValidatorResponseConverter : ProtobufConverter<QueryValidatorResponse>

public fun QueryValidatorResponse.toAny(): Any = Any(QueryValidatorResponse.TYPE_URL,
    with(QueryValidatorResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValidatorResponse>): QueryValidatorResponse {
  if (typeUrl != QueryValidatorResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValidatorDelegationsRequestConverter :
    ProtobufConverter<QueryValidatorDelegationsRequest>

public fun QueryValidatorDelegationsRequest.toAny(): Any =
    Any(QueryValidatorDelegationsRequest.TYPE_URL, with(QueryValidatorDelegationsRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValidatorDelegationsRequest>):
    QueryValidatorDelegationsRequest {
  if (typeUrl != QueryValidatorDelegationsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValidatorDelegationsResponseConverter :
    ProtobufConverter<QueryValidatorDelegationsResponse>

public fun QueryValidatorDelegationsResponse.toAny(): Any =
    Any(QueryValidatorDelegationsResponse.TYPE_URL, with(QueryValidatorDelegationsResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValidatorDelegationsResponse>):
    QueryValidatorDelegationsResponse {
  if (typeUrl != QueryValidatorDelegationsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValidatorUnbondingDelegationsRequestConverter :
    ProtobufConverter<QueryValidatorUnbondingDelegationsRequest>

public fun QueryValidatorUnbondingDelegationsRequest.toAny(): Any =
    Any(QueryValidatorUnbondingDelegationsRequest.TYPE_URL,
    with(QueryValidatorUnbondingDelegationsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValidatorUnbondingDelegationsRequest>):
    QueryValidatorUnbondingDelegationsRequest {
  if (typeUrl != QueryValidatorUnbondingDelegationsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValidatorUnbondingDelegationsResponseConverter :
    ProtobufConverter<QueryValidatorUnbondingDelegationsResponse>

public fun QueryValidatorUnbondingDelegationsResponse.toAny(): Any =
    Any(QueryValidatorUnbondingDelegationsResponse.TYPE_URL,
    with(QueryValidatorUnbondingDelegationsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValidatorUnbondingDelegationsResponse>):
    QueryValidatorUnbondingDelegationsResponse {
  if (typeUrl != QueryValidatorUnbondingDelegationsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegationRequestConverter : ProtobufConverter<QueryDelegationRequest>

public fun QueryDelegationRequest.toAny(): Any = Any(QueryDelegationRequest.TYPE_URL,
    with(QueryDelegationRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegationRequest>): QueryDelegationRequest {
  if (typeUrl != QueryDelegationRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegationResponseConverter : ProtobufConverter<QueryDelegationResponse>

public fun QueryDelegationResponse.toAny(): Any = Any(QueryDelegationResponse.TYPE_URL,
    with(QueryDelegationResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegationResponse>):
    QueryDelegationResponse {
  if (typeUrl != QueryDelegationResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryUnbondingDelegationRequestConverter :
    ProtobufConverter<QueryUnbondingDelegationRequest>

public fun QueryUnbondingDelegationRequest.toAny(): Any =
    Any(QueryUnbondingDelegationRequest.TYPE_URL, with(QueryUnbondingDelegationRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryUnbondingDelegationRequest>):
    QueryUnbondingDelegationRequest {
  if (typeUrl != QueryUnbondingDelegationRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryUnbondingDelegationResponseConverter :
    ProtobufConverter<QueryUnbondingDelegationResponse>

public fun QueryUnbondingDelegationResponse.toAny(): Any =
    Any(QueryUnbondingDelegationResponse.TYPE_URL, with(QueryUnbondingDelegationResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryUnbondingDelegationResponse>):
    QueryUnbondingDelegationResponse {
  if (typeUrl != QueryUnbondingDelegationResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegatorDelegationsRequestConverter :
    ProtobufConverter<QueryDelegatorDelegationsRequest>

public fun QueryDelegatorDelegationsRequest.toAny(): Any =
    Any(QueryDelegatorDelegationsRequest.TYPE_URL, with(QueryDelegatorDelegationsRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegatorDelegationsRequest>):
    QueryDelegatorDelegationsRequest {
  if (typeUrl != QueryDelegatorDelegationsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegatorDelegationsResponseConverter :
    ProtobufConverter<QueryDelegatorDelegationsResponse>

public fun QueryDelegatorDelegationsResponse.toAny(): Any =
    Any(QueryDelegatorDelegationsResponse.TYPE_URL, with(QueryDelegatorDelegationsResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegatorDelegationsResponse>):
    QueryDelegatorDelegationsResponse {
  if (typeUrl != QueryDelegatorDelegationsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegatorUnbondingDelegationsRequestConverter :
    ProtobufConverter<QueryDelegatorUnbondingDelegationsRequest>

public fun QueryDelegatorUnbondingDelegationsRequest.toAny(): Any =
    Any(QueryDelegatorUnbondingDelegationsRequest.TYPE_URL,
    with(QueryDelegatorUnbondingDelegationsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegatorUnbondingDelegationsRequest>):
    QueryDelegatorUnbondingDelegationsRequest {
  if (typeUrl != QueryDelegatorUnbondingDelegationsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegatorUnbondingDelegationsResponseConverter :
    ProtobufConverter<QueryDelegatorUnbondingDelegationsResponse>

public fun QueryDelegatorUnbondingDelegationsResponse.toAny(): Any =
    Any(QueryDelegatorUnbondingDelegationsResponse.TYPE_URL,
    with(QueryDelegatorUnbondingDelegationsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegatorUnbondingDelegationsResponse>):
    QueryDelegatorUnbondingDelegationsResponse {
  if (typeUrl != QueryDelegatorUnbondingDelegationsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryRedelegationsRequestConverter :
    ProtobufConverter<QueryRedelegationsRequest>

public fun QueryRedelegationsRequest.toAny(): Any = Any(QueryRedelegationsRequest.TYPE_URL,
    with(QueryRedelegationsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryRedelegationsRequest>):
    QueryRedelegationsRequest {
  if (typeUrl != QueryRedelegationsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryRedelegationsResponseConverter :
    ProtobufConverter<QueryRedelegationsResponse>

public fun QueryRedelegationsResponse.toAny(): Any = Any(QueryRedelegationsResponse.TYPE_URL,
    with(QueryRedelegationsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryRedelegationsResponse>):
    QueryRedelegationsResponse {
  if (typeUrl != QueryRedelegationsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegatorValidatorsRequestConverter :
    ProtobufConverter<QueryDelegatorValidatorsRequest>

public fun QueryDelegatorValidatorsRequest.toAny(): Any =
    Any(QueryDelegatorValidatorsRequest.TYPE_URL, with(QueryDelegatorValidatorsRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegatorValidatorsRequest>):
    QueryDelegatorValidatorsRequest {
  if (typeUrl != QueryDelegatorValidatorsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegatorValidatorsResponseConverter :
    ProtobufConverter<QueryDelegatorValidatorsResponse>

public fun QueryDelegatorValidatorsResponse.toAny(): Any =
    Any(QueryDelegatorValidatorsResponse.TYPE_URL, with(QueryDelegatorValidatorsResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegatorValidatorsResponse>):
    QueryDelegatorValidatorsResponse {
  if (typeUrl != QueryDelegatorValidatorsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegatorValidatorRequestConverter :
    ProtobufConverter<QueryDelegatorValidatorRequest>

public fun QueryDelegatorValidatorRequest.toAny(): Any =
    Any(QueryDelegatorValidatorRequest.TYPE_URL, with(QueryDelegatorValidatorRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegatorValidatorRequest>):
    QueryDelegatorValidatorRequest {
  if (typeUrl != QueryDelegatorValidatorRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegatorValidatorResponseConverter :
    ProtobufConverter<QueryDelegatorValidatorResponse>

public fun QueryDelegatorValidatorResponse.toAny(): Any =
    Any(QueryDelegatorValidatorResponse.TYPE_URL, with(QueryDelegatorValidatorResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegatorValidatorResponse>):
    QueryDelegatorValidatorResponse {
  if (typeUrl != QueryDelegatorValidatorResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryHistoricalInfoRequestConverter :
    ProtobufConverter<QueryHistoricalInfoRequest>

public fun QueryHistoricalInfoRequest.toAny(): Any = Any(QueryHistoricalInfoRequest.TYPE_URL,
    with(QueryHistoricalInfoRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryHistoricalInfoRequest>):
    QueryHistoricalInfoRequest {
  if (typeUrl != QueryHistoricalInfoRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryHistoricalInfoResponseConverter :
    ProtobufConverter<QueryHistoricalInfoResponse>

public fun QueryHistoricalInfoResponse.toAny(): Any = Any(QueryHistoricalInfoResponse.TYPE_URL,
    with(QueryHistoricalInfoResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryHistoricalInfoResponse>):
    QueryHistoricalInfoResponse {
  if (typeUrl != QueryHistoricalInfoResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPoolRequestConverter : ProtobufConverter<QueryPoolRequest>

public fun QueryPoolRequest.toAny(): Any = Any(QueryPoolRequest.TYPE_URL,
    with(QueryPoolRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPoolRequest>): QueryPoolRequest {
  if (typeUrl != QueryPoolRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryPoolResponseConverter : ProtobufConverter<QueryPoolResponse>

public fun QueryPoolResponse.toAny(): Any = Any(QueryPoolResponse.TYPE_URL,
    with(QueryPoolResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryPoolResponse>): QueryPoolResponse {
  if (typeUrl != QueryPoolResponse.TYPE_URL) throw
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

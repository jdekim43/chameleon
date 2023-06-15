// Transform from alliance/query.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

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

public expect object QueryAlliancesRequestConverter : ProtobufConverter<QueryAlliancesRequest>

public fun QueryAlliancesRequest.toAny(): Any = Any(QueryAlliancesRequest.TYPE_URL,
    with(QueryAlliancesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAlliancesRequest>): QueryAlliancesRequest {
  if (typeUrl != QueryAlliancesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAlliancesResponseConverter : ProtobufConverter<QueryAlliancesResponse>

public fun QueryAlliancesResponse.toAny(): Any = Any(QueryAlliancesResponse.TYPE_URL,
    with(QueryAlliancesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAlliancesResponse>): QueryAlliancesResponse {
  if (typeUrl != QueryAlliancesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllianceRequestConverter : ProtobufConverter<QueryAllianceRequest>

public fun QueryAllianceRequest.toAny(): Any = Any(QueryAllianceRequest.TYPE_URL,
    with(QueryAllianceRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllianceRequest>): QueryAllianceRequest {
  if (typeUrl != QueryAllianceRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllianceResponseConverter : ProtobufConverter<QueryAllianceResponse>

public fun QueryAllianceResponse.toAny(): Any = Any(QueryAllianceResponse.TYPE_URL,
    with(QueryAllianceResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllianceResponse>): QueryAllianceResponse {
  if (typeUrl != QueryAllianceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryIBCAllianceRequestConverter : ProtobufConverter<QueryIBCAllianceRequest>

public fun QueryIBCAllianceRequest.toAny(): Any = Any(QueryIBCAllianceRequest.TYPE_URL,
    with(QueryIBCAllianceRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryIBCAllianceRequest>):
    QueryIBCAllianceRequest {
  if (typeUrl != QueryIBCAllianceRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllianceValidatorRequestConverter :
    ProtobufConverter<QueryAllianceValidatorRequest>

public fun QueryAllianceValidatorRequest.toAny(): Any = Any(QueryAllianceValidatorRequest.TYPE_URL,
    with(QueryAllianceValidatorRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllianceValidatorRequest>):
    QueryAllianceValidatorRequest {
  if (typeUrl != QueryAllianceValidatorRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllAllianceValidatorsRequestConverter :
    ProtobufConverter<QueryAllAllianceValidatorsRequest>

public fun QueryAllAllianceValidatorsRequest.toAny(): Any =
    Any(QueryAllAllianceValidatorsRequest.TYPE_URL, with(QueryAllAllianceValidatorsRequestConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllAllianceValidatorsRequest>):
    QueryAllAllianceValidatorsRequest {
  if (typeUrl != QueryAllAllianceValidatorsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllAlliancesDelegationsRequestConverter :
    ProtobufConverter<QueryAllAlliancesDelegationsRequest>

public fun QueryAllAlliancesDelegationsRequest.toAny(): Any =
    Any(QueryAllAlliancesDelegationsRequest.TYPE_URL,
    with(QueryAllAlliancesDelegationsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllAlliancesDelegationsRequest>):
    QueryAllAlliancesDelegationsRequest {
  if (typeUrl != QueryAllAlliancesDelegationsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAlliancesDelegationsRequestConverter :
    ProtobufConverter<QueryAlliancesDelegationsRequest>

public fun QueryAlliancesDelegationsRequest.toAny(): Any =
    Any(QueryAlliancesDelegationsRequest.TYPE_URL, with(QueryAlliancesDelegationsRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAlliancesDelegationsRequest>):
    QueryAlliancesDelegationsRequest {
  if (typeUrl != QueryAlliancesDelegationsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAlliancesDelegationByValidatorRequestConverter :
    ProtobufConverter<QueryAlliancesDelegationByValidatorRequest>

public fun QueryAlliancesDelegationByValidatorRequest.toAny(): Any =
    Any(QueryAlliancesDelegationByValidatorRequest.TYPE_URL,
    with(QueryAlliancesDelegationByValidatorRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAlliancesDelegationByValidatorRequest>):
    QueryAlliancesDelegationByValidatorRequest {
  if (typeUrl != QueryAlliancesDelegationByValidatorRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DelegationResponseConverter : ProtobufConverter<DelegationResponse>

public fun DelegationResponse.toAny(): Any = Any(DelegationResponse.TYPE_URL,
    with(DelegationResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DelegationResponse>): DelegationResponse {
  if (typeUrl != DelegationResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAlliancesDelegationsResponseConverter :
    ProtobufConverter<QueryAlliancesDelegationsResponse>

public fun QueryAlliancesDelegationsResponse.toAny(): Any =
    Any(QueryAlliancesDelegationsResponse.TYPE_URL, with(QueryAlliancesDelegationsResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAlliancesDelegationsResponse>):
    QueryAlliancesDelegationsResponse {
  if (typeUrl != QueryAlliancesDelegationsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllianceDelegationRequestConverter :
    ProtobufConverter<QueryAllianceDelegationRequest>

public fun QueryAllianceDelegationRequest.toAny(): Any =
    Any(QueryAllianceDelegationRequest.TYPE_URL, with(QueryAllianceDelegationRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllianceDelegationRequest>):
    QueryAllianceDelegationRequest {
  if (typeUrl != QueryAllianceDelegationRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryIBCAllianceDelegationRequestConverter :
    ProtobufConverter<QueryIBCAllianceDelegationRequest>

public fun QueryIBCAllianceDelegationRequest.toAny(): Any =
    Any(QueryIBCAllianceDelegationRequest.TYPE_URL, with(QueryIBCAllianceDelegationRequestConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryIBCAllianceDelegationRequest>):
    QueryIBCAllianceDelegationRequest {
  if (typeUrl != QueryIBCAllianceDelegationRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllianceDelegationResponseConverter :
    ProtobufConverter<QueryAllianceDelegationResponse>

public fun QueryAllianceDelegationResponse.toAny(): Any =
    Any(QueryAllianceDelegationResponse.TYPE_URL, with(QueryAllianceDelegationResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllianceDelegationResponse>):
    QueryAllianceDelegationResponse {
  if (typeUrl != QueryAllianceDelegationResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllianceDelegationRewardsRequestConverter :
    ProtobufConverter<QueryAllianceDelegationRewardsRequest>

public fun QueryAllianceDelegationRewardsRequest.toAny(): Any =
    Any(QueryAllianceDelegationRewardsRequest.TYPE_URL,
    with(QueryAllianceDelegationRewardsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllianceDelegationRewardsRequest>):
    QueryAllianceDelegationRewardsRequest {
  if (typeUrl != QueryAllianceDelegationRewardsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryIBCAllianceDelegationRewardsRequestConverter :
    ProtobufConverter<QueryIBCAllianceDelegationRewardsRequest>

public fun QueryIBCAllianceDelegationRewardsRequest.toAny(): Any =
    Any(QueryIBCAllianceDelegationRewardsRequest.TYPE_URL,
    with(QueryIBCAllianceDelegationRewardsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryIBCAllianceDelegationRewardsRequest>):
    QueryIBCAllianceDelegationRewardsRequest {
  if (typeUrl != QueryIBCAllianceDelegationRewardsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllianceDelegationRewardsResponseConverter :
    ProtobufConverter<QueryAllianceDelegationRewardsResponse>

public fun QueryAllianceDelegationRewardsResponse.toAny(): Any =
    Any(QueryAllianceDelegationRewardsResponse.TYPE_URL,
    with(QueryAllianceDelegationRewardsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllianceDelegationRewardsResponse>):
    QueryAllianceDelegationRewardsResponse {
  if (typeUrl != QueryAllianceDelegationRewardsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllianceValidatorResponseConverter :
    ProtobufConverter<QueryAllianceValidatorResponse>

public fun QueryAllianceValidatorResponse.toAny(): Any =
    Any(QueryAllianceValidatorResponse.TYPE_URL, with(QueryAllianceValidatorResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllianceValidatorResponse>):
    QueryAllianceValidatorResponse {
  if (typeUrl != QueryAllianceValidatorResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllianceValidatorsResponseConverter :
    ProtobufConverter<QueryAllianceValidatorsResponse>

public fun QueryAllianceValidatorsResponse.toAny(): Any =
    Any(QueryAllianceValidatorsResponse.TYPE_URL, with(QueryAllianceValidatorsResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllianceValidatorsResponse>):
    QueryAllianceValidatorsResponse {
  if (typeUrl != QueryAllianceValidatorsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllianceUnbondingsByDenomAndDelegatorRequestConverter :
    ProtobufConverter<QueryAllianceUnbondingsByDenomAndDelegatorRequest>

public fun QueryAllianceUnbondingsByDenomAndDelegatorRequest.toAny(): Any =
    Any(QueryAllianceUnbondingsByDenomAndDelegatorRequest.TYPE_URL,
    with(QueryAllianceUnbondingsByDenomAndDelegatorRequestConverter) { toByteArray() })

public
    fun Any.parse(converter: ProtobufConverter<QueryAllianceUnbondingsByDenomAndDelegatorRequest>):
    QueryAllianceUnbondingsByDenomAndDelegatorRequest {
  if (typeUrl != QueryAllianceUnbondingsByDenomAndDelegatorRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllianceUnbondingsByDenomAndDelegatorResponseConverter :
    ProtobufConverter<QueryAllianceUnbondingsByDenomAndDelegatorResponse>

public fun QueryAllianceUnbondingsByDenomAndDelegatorResponse.toAny(): Any =
    Any(QueryAllianceUnbondingsByDenomAndDelegatorResponse.TYPE_URL,
    with(QueryAllianceUnbondingsByDenomAndDelegatorResponseConverter) { toByteArray() })

public
    fun Any.parse(converter: ProtobufConverter<QueryAllianceUnbondingsByDenomAndDelegatorResponse>):
    QueryAllianceUnbondingsByDenomAndDelegatorResponse {
  if (typeUrl != QueryAllianceUnbondingsByDenomAndDelegatorResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllianceUnbondingsRequestConverter :
    ProtobufConverter<QueryAllianceUnbondingsRequest>

public fun QueryAllianceUnbondingsRequest.toAny(): Any =
    Any(QueryAllianceUnbondingsRequest.TYPE_URL, with(QueryAllianceUnbondingsRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllianceUnbondingsRequest>):
    QueryAllianceUnbondingsRequest {
  if (typeUrl != QueryAllianceUnbondingsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllianceUnbondingsResponseConverter :
    ProtobufConverter<QueryAllianceUnbondingsResponse>

public fun QueryAllianceUnbondingsResponse.toAny(): Any =
    Any(QueryAllianceUnbondingsResponse.TYPE_URL, with(QueryAllianceUnbondingsResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllianceUnbondingsResponse>):
    QueryAllianceUnbondingsResponse {
  if (typeUrl != QueryAllianceUnbondingsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllianceRedelegationsRequestConverter :
    ProtobufConverter<QueryAllianceRedelegationsRequest>

public fun QueryAllianceRedelegationsRequest.toAny(): Any =
    Any(QueryAllianceRedelegationsRequest.TYPE_URL, with(QueryAllianceRedelegationsRequestConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllianceRedelegationsRequest>):
    QueryAllianceRedelegationsRequest {
  if (typeUrl != QueryAllianceRedelegationsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllianceRedelegationsResponseConverter :
    ProtobufConverter<QueryAllianceRedelegationsResponse>

public fun QueryAllianceRedelegationsResponse.toAny(): Any =
    Any(QueryAllianceRedelegationsResponse.TYPE_URL,
    with(QueryAllianceRedelegationsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllianceRedelegationsResponse>):
    QueryAllianceRedelegationsResponse {
  if (typeUrl != QueryAllianceRedelegationsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

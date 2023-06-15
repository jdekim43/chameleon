// Transform from cosmos/distribution/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

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

public expect object QueryValidatorDistributionInfoRequestConverter :
    ProtobufConverter<QueryValidatorDistributionInfoRequest>

public fun QueryValidatorDistributionInfoRequest.toAny(): Any =
    Any(QueryValidatorDistributionInfoRequest.TYPE_URL,
    with(QueryValidatorDistributionInfoRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValidatorDistributionInfoRequest>):
    QueryValidatorDistributionInfoRequest {
  if (typeUrl != QueryValidatorDistributionInfoRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValidatorDistributionInfoResponseConverter :
    ProtobufConverter<QueryValidatorDistributionInfoResponse>

public fun QueryValidatorDistributionInfoResponse.toAny(): Any =
    Any(QueryValidatorDistributionInfoResponse.TYPE_URL,
    with(QueryValidatorDistributionInfoResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValidatorDistributionInfoResponse>):
    QueryValidatorDistributionInfoResponse {
  if (typeUrl != QueryValidatorDistributionInfoResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValidatorOutstandingRewardsRequestConverter :
    ProtobufConverter<QueryValidatorOutstandingRewardsRequest>

public fun QueryValidatorOutstandingRewardsRequest.toAny(): Any =
    Any(QueryValidatorOutstandingRewardsRequest.TYPE_URL,
    with(QueryValidatorOutstandingRewardsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValidatorOutstandingRewardsRequest>):
    QueryValidatorOutstandingRewardsRequest {
  if (typeUrl != QueryValidatorOutstandingRewardsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValidatorOutstandingRewardsResponseConverter :
    ProtobufConverter<QueryValidatorOutstandingRewardsResponse>

public fun QueryValidatorOutstandingRewardsResponse.toAny(): Any =
    Any(QueryValidatorOutstandingRewardsResponse.TYPE_URL,
    with(QueryValidatorOutstandingRewardsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValidatorOutstandingRewardsResponse>):
    QueryValidatorOutstandingRewardsResponse {
  if (typeUrl != QueryValidatorOutstandingRewardsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValidatorCommissionRequestConverter :
    ProtobufConverter<QueryValidatorCommissionRequest>

public fun QueryValidatorCommissionRequest.toAny(): Any =
    Any(QueryValidatorCommissionRequest.TYPE_URL, with(QueryValidatorCommissionRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValidatorCommissionRequest>):
    QueryValidatorCommissionRequest {
  if (typeUrl != QueryValidatorCommissionRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValidatorCommissionResponseConverter :
    ProtobufConverter<QueryValidatorCommissionResponse>

public fun QueryValidatorCommissionResponse.toAny(): Any =
    Any(QueryValidatorCommissionResponse.TYPE_URL, with(QueryValidatorCommissionResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValidatorCommissionResponse>):
    QueryValidatorCommissionResponse {
  if (typeUrl != QueryValidatorCommissionResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValidatorSlashesRequestConverter :
    ProtobufConverter<QueryValidatorSlashesRequest>

public fun QueryValidatorSlashesRequest.toAny(): Any = Any(QueryValidatorSlashesRequest.TYPE_URL,
    with(QueryValidatorSlashesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValidatorSlashesRequest>):
    QueryValidatorSlashesRequest {
  if (typeUrl != QueryValidatorSlashesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryValidatorSlashesResponseConverter :
    ProtobufConverter<QueryValidatorSlashesResponse>

public fun QueryValidatorSlashesResponse.toAny(): Any = Any(QueryValidatorSlashesResponse.TYPE_URL,
    with(QueryValidatorSlashesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryValidatorSlashesResponse>):
    QueryValidatorSlashesResponse {
  if (typeUrl != QueryValidatorSlashesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegationRewardsRequestConverter :
    ProtobufConverter<QueryDelegationRewardsRequest>

public fun QueryDelegationRewardsRequest.toAny(): Any = Any(QueryDelegationRewardsRequest.TYPE_URL,
    with(QueryDelegationRewardsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegationRewardsRequest>):
    QueryDelegationRewardsRequest {
  if (typeUrl != QueryDelegationRewardsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegationRewardsResponseConverter :
    ProtobufConverter<QueryDelegationRewardsResponse>

public fun QueryDelegationRewardsResponse.toAny(): Any =
    Any(QueryDelegationRewardsResponse.TYPE_URL, with(QueryDelegationRewardsResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegationRewardsResponse>):
    QueryDelegationRewardsResponse {
  if (typeUrl != QueryDelegationRewardsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegationTotalRewardsRequestConverter :
    ProtobufConverter<QueryDelegationTotalRewardsRequest>

public fun QueryDelegationTotalRewardsRequest.toAny(): Any =
    Any(QueryDelegationTotalRewardsRequest.TYPE_URL,
    with(QueryDelegationTotalRewardsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegationTotalRewardsRequest>):
    QueryDelegationTotalRewardsRequest {
  if (typeUrl != QueryDelegationTotalRewardsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegationTotalRewardsResponseConverter :
    ProtobufConverter<QueryDelegationTotalRewardsResponse>

public fun QueryDelegationTotalRewardsResponse.toAny(): Any =
    Any(QueryDelegationTotalRewardsResponse.TYPE_URL,
    with(QueryDelegationTotalRewardsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegationTotalRewardsResponse>):
    QueryDelegationTotalRewardsResponse {
  if (typeUrl != QueryDelegationTotalRewardsResponse.TYPE_URL) throw
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

public expect object QueryDelegatorWithdrawAddressRequestConverter :
    ProtobufConverter<QueryDelegatorWithdrawAddressRequest>

public fun QueryDelegatorWithdrawAddressRequest.toAny(): Any =
    Any(QueryDelegatorWithdrawAddressRequest.TYPE_URL,
    with(QueryDelegatorWithdrawAddressRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegatorWithdrawAddressRequest>):
    QueryDelegatorWithdrawAddressRequest {
  if (typeUrl != QueryDelegatorWithdrawAddressRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryDelegatorWithdrawAddressResponseConverter :
    ProtobufConverter<QueryDelegatorWithdrawAddressResponse>

public fun QueryDelegatorWithdrawAddressResponse.toAny(): Any =
    Any(QueryDelegatorWithdrawAddressResponse.TYPE_URL,
    with(QueryDelegatorWithdrawAddressResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryDelegatorWithdrawAddressResponse>):
    QueryDelegatorWithdrawAddressResponse {
  if (typeUrl != QueryDelegatorWithdrawAddressResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryCommunityPoolRequestConverter :
    ProtobufConverter<QueryCommunityPoolRequest>

public fun QueryCommunityPoolRequest.toAny(): Any = Any(QueryCommunityPoolRequest.TYPE_URL,
    with(QueryCommunityPoolRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryCommunityPoolRequest>):
    QueryCommunityPoolRequest {
  if (typeUrl != QueryCommunityPoolRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryCommunityPoolResponseConverter :
    ProtobufConverter<QueryCommunityPoolResponse>

public fun QueryCommunityPoolResponse.toAny(): Any = Any(QueryCommunityPoolResponse.TYPE_URL,
    with(QueryCommunityPoolResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryCommunityPoolResponse>):
    QueryCommunityPoolResponse {
  if (typeUrl != QueryCommunityPoolResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

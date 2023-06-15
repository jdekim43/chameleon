// Transform from cosmos/distribution/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

public actual object QueryValidatorDistributionInfoRequestConverter :
    ProtobufConverter<QueryValidatorDistributionInfoRequest> by
    QueryValidatorDistributionInfoRequestJvmConverter

public actual object QueryValidatorDistributionInfoResponseConverter :
    ProtobufConverter<QueryValidatorDistributionInfoResponse> by
    QueryValidatorDistributionInfoResponseJvmConverter

public actual object QueryValidatorOutstandingRewardsRequestConverter :
    ProtobufConverter<QueryValidatorOutstandingRewardsRequest> by
    QueryValidatorOutstandingRewardsRequestJvmConverter

public actual object QueryValidatorOutstandingRewardsResponseConverter :
    ProtobufConverter<QueryValidatorOutstandingRewardsResponse> by
    QueryValidatorOutstandingRewardsResponseJvmConverter

public actual object QueryValidatorCommissionRequestConverter :
    ProtobufConverter<QueryValidatorCommissionRequest> by
    QueryValidatorCommissionRequestJvmConverter

public actual object QueryValidatorCommissionResponseConverter :
    ProtobufConverter<QueryValidatorCommissionResponse> by
    QueryValidatorCommissionResponseJvmConverter

public actual object QueryValidatorSlashesRequestConverter :
    ProtobufConverter<QueryValidatorSlashesRequest> by QueryValidatorSlashesRequestJvmConverter

public actual object QueryValidatorSlashesResponseConverter :
    ProtobufConverter<QueryValidatorSlashesResponse> by QueryValidatorSlashesResponseJvmConverter

public actual object QueryDelegationRewardsRequestConverter :
    ProtobufConverter<QueryDelegationRewardsRequest> by QueryDelegationRewardsRequestJvmConverter

public actual object QueryDelegationRewardsResponseConverter :
    ProtobufConverter<QueryDelegationRewardsResponse> by QueryDelegationRewardsResponseJvmConverter

public actual object QueryDelegationTotalRewardsRequestConverter :
    ProtobufConverter<QueryDelegationTotalRewardsRequest> by
    QueryDelegationTotalRewardsRequestJvmConverter

public actual object QueryDelegationTotalRewardsResponseConverter :
    ProtobufConverter<QueryDelegationTotalRewardsResponse> by
    QueryDelegationTotalRewardsResponseJvmConverter

public actual object QueryDelegatorValidatorsRequestConverter :
    ProtobufConverter<QueryDelegatorValidatorsRequest> by
    QueryDelegatorValidatorsRequestJvmConverter

public actual object QueryDelegatorValidatorsResponseConverter :
    ProtobufConverter<QueryDelegatorValidatorsResponse> by
    QueryDelegatorValidatorsResponseJvmConverter

public actual object QueryDelegatorWithdrawAddressRequestConverter :
    ProtobufConverter<QueryDelegatorWithdrawAddressRequest> by
    QueryDelegatorWithdrawAddressRequestJvmConverter

public actual object QueryDelegatorWithdrawAddressResponseConverter :
    ProtobufConverter<QueryDelegatorWithdrawAddressResponse> by
    QueryDelegatorWithdrawAddressResponseJvmConverter

public actual object QueryCommunityPoolRequestConverter :
    ProtobufConverter<QueryCommunityPoolRequest> by QueryCommunityPoolRequestJvmConverter

public actual object QueryCommunityPoolResponseConverter :
    ProtobufConverter<QueryCommunityPoolResponse> by QueryCommunityPoolResponseJvmConverter

// Transform from cosmos/staking/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryValidatorsRequestConverter : ProtobufConverter<QueryValidatorsRequest> by
    QueryValidatorsRequestJvmConverter

public actual object QueryValidatorsResponseConverter : ProtobufConverter<QueryValidatorsResponse>
    by QueryValidatorsResponseJvmConverter

public actual object QueryValidatorRequestConverter : ProtobufConverter<QueryValidatorRequest> by
    QueryValidatorRequestJvmConverter

public actual object QueryValidatorResponseConverter : ProtobufConverter<QueryValidatorResponse> by
    QueryValidatorResponseJvmConverter

public actual object QueryValidatorDelegationsRequestConverter :
    ProtobufConverter<QueryValidatorDelegationsRequest> by
    QueryValidatorDelegationsRequestJvmConverter

public actual object QueryValidatorDelegationsResponseConverter :
    ProtobufConverter<QueryValidatorDelegationsResponse> by
    QueryValidatorDelegationsResponseJvmConverter

public actual object QueryValidatorUnbondingDelegationsRequestConverter :
    ProtobufConverter<QueryValidatorUnbondingDelegationsRequest> by
    QueryValidatorUnbondingDelegationsRequestJvmConverter

public actual object QueryValidatorUnbondingDelegationsResponseConverter :
    ProtobufConverter<QueryValidatorUnbondingDelegationsResponse> by
    QueryValidatorUnbondingDelegationsResponseJvmConverter

public actual object QueryDelegationRequestConverter : ProtobufConverter<QueryDelegationRequest> by
    QueryDelegationRequestJvmConverter

public actual object QueryDelegationResponseConverter : ProtobufConverter<QueryDelegationResponse>
    by QueryDelegationResponseJvmConverter

public actual object QueryUnbondingDelegationRequestConverter :
    ProtobufConverter<QueryUnbondingDelegationRequest> by
    QueryUnbondingDelegationRequestJvmConverter

public actual object QueryUnbondingDelegationResponseConverter :
    ProtobufConverter<QueryUnbondingDelegationResponse> by
    QueryUnbondingDelegationResponseJvmConverter

public actual object QueryDelegatorDelegationsRequestConverter :
    ProtobufConverter<QueryDelegatorDelegationsRequest> by
    QueryDelegatorDelegationsRequestJvmConverter

public actual object QueryDelegatorDelegationsResponseConverter :
    ProtobufConverter<QueryDelegatorDelegationsResponse> by
    QueryDelegatorDelegationsResponseJvmConverter

public actual object QueryDelegatorUnbondingDelegationsRequestConverter :
    ProtobufConverter<QueryDelegatorUnbondingDelegationsRequest> by
    QueryDelegatorUnbondingDelegationsRequestJvmConverter

public actual object QueryDelegatorUnbondingDelegationsResponseConverter :
    ProtobufConverter<QueryDelegatorUnbondingDelegationsResponse> by
    QueryDelegatorUnbondingDelegationsResponseJvmConverter

public actual object QueryRedelegationsRequestConverter :
    ProtobufConverter<QueryRedelegationsRequest> by QueryRedelegationsRequestJvmConverter

public actual object QueryRedelegationsResponseConverter :
    ProtobufConverter<QueryRedelegationsResponse> by QueryRedelegationsResponseJvmConverter

public actual object QueryDelegatorValidatorsRequestConverter :
    ProtobufConverter<QueryDelegatorValidatorsRequest> by
    QueryDelegatorValidatorsRequestJvmConverter

public actual object QueryDelegatorValidatorsResponseConverter :
    ProtobufConverter<QueryDelegatorValidatorsResponse> by
    QueryDelegatorValidatorsResponseJvmConverter

public actual object QueryDelegatorValidatorRequestConverter :
    ProtobufConverter<QueryDelegatorValidatorRequest> by QueryDelegatorValidatorRequestJvmConverter

public actual object QueryDelegatorValidatorResponseConverter :
    ProtobufConverter<QueryDelegatorValidatorResponse> by
    QueryDelegatorValidatorResponseJvmConverter

public actual object QueryHistoricalInfoRequestConverter :
    ProtobufConverter<QueryHistoricalInfoRequest> by QueryHistoricalInfoRequestJvmConverter

public actual object QueryHistoricalInfoResponseConverter :
    ProtobufConverter<QueryHistoricalInfoResponse> by QueryHistoricalInfoResponseJvmConverter

public actual object QueryPoolRequestConverter : ProtobufConverter<QueryPoolRequest> by
    QueryPoolRequestJvmConverter

public actual object QueryPoolResponseConverter : ProtobufConverter<QueryPoolResponse> by
    QueryPoolResponseJvmConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

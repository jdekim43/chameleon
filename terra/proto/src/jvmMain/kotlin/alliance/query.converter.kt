// Transform from alliance/query.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

public actual object QueryAlliancesRequestConverter : ProtobufConverter<QueryAlliancesRequest> by
    QueryAlliancesRequestJvmConverter

public actual object QueryAlliancesResponseConverter : ProtobufConverter<QueryAlliancesResponse> by
    QueryAlliancesResponseJvmConverter

public actual object QueryAllianceRequestConverter : ProtobufConverter<QueryAllianceRequest> by
    QueryAllianceRequestJvmConverter

public actual object QueryAllianceResponseConverter : ProtobufConverter<QueryAllianceResponse> by
    QueryAllianceResponseJvmConverter

public actual object QueryIBCAllianceRequestConverter : ProtobufConverter<QueryIBCAllianceRequest>
    by QueryIBCAllianceRequestJvmConverter

public actual object QueryAllianceValidatorRequestConverter :
    ProtobufConverter<QueryAllianceValidatorRequest> by QueryAllianceValidatorRequestJvmConverter

public actual object QueryAllAllianceValidatorsRequestConverter :
    ProtobufConverter<QueryAllAllianceValidatorsRequest> by
    QueryAllAllianceValidatorsRequestJvmConverter

public actual object QueryAllAlliancesDelegationsRequestConverter :
    ProtobufConverter<QueryAllAlliancesDelegationsRequest> by
    QueryAllAlliancesDelegationsRequestJvmConverter

public actual object QueryAlliancesDelegationsRequestConverter :
    ProtobufConverter<QueryAlliancesDelegationsRequest> by
    QueryAlliancesDelegationsRequestJvmConverter

public actual object QueryAlliancesDelegationByValidatorRequestConverter :
    ProtobufConverter<QueryAlliancesDelegationByValidatorRequest> by
    QueryAlliancesDelegationByValidatorRequestJvmConverter

public actual object DelegationResponseConverter : ProtobufConverter<DelegationResponse> by
    DelegationResponseJvmConverter

public actual object QueryAlliancesDelegationsResponseConverter :
    ProtobufConverter<QueryAlliancesDelegationsResponse> by
    QueryAlliancesDelegationsResponseJvmConverter

public actual object QueryAllianceDelegationRequestConverter :
    ProtobufConverter<QueryAllianceDelegationRequest> by QueryAllianceDelegationRequestJvmConverter

public actual object QueryIBCAllianceDelegationRequestConverter :
    ProtobufConverter<QueryIBCAllianceDelegationRequest> by
    QueryIBCAllianceDelegationRequestJvmConverter

public actual object QueryAllianceDelegationResponseConverter :
    ProtobufConverter<QueryAllianceDelegationResponse> by
    QueryAllianceDelegationResponseJvmConverter

public actual object QueryAllianceDelegationRewardsRequestConverter :
    ProtobufConverter<QueryAllianceDelegationRewardsRequest> by
    QueryAllianceDelegationRewardsRequestJvmConverter

public actual object QueryIBCAllianceDelegationRewardsRequestConverter :
    ProtobufConverter<QueryIBCAllianceDelegationRewardsRequest> by
    QueryIBCAllianceDelegationRewardsRequestJvmConverter

public actual object QueryAllianceDelegationRewardsResponseConverter :
    ProtobufConverter<QueryAllianceDelegationRewardsResponse> by
    QueryAllianceDelegationRewardsResponseJvmConverter

public actual object QueryAllianceValidatorResponseConverter :
    ProtobufConverter<QueryAllianceValidatorResponse> by QueryAllianceValidatorResponseJvmConverter

public actual object QueryAllianceValidatorsResponseConverter :
    ProtobufConverter<QueryAllianceValidatorsResponse> by
    QueryAllianceValidatorsResponseJvmConverter

public actual object QueryAllianceUnbondingsByDenomAndDelegatorRequestConverter :
    ProtobufConverter<QueryAllianceUnbondingsByDenomAndDelegatorRequest> by
    QueryAllianceUnbondingsByDenomAndDelegatorRequestJvmConverter

public actual object QueryAllianceUnbondingsByDenomAndDelegatorResponseConverter :
    ProtobufConverter<QueryAllianceUnbondingsByDenomAndDelegatorResponse> by
    QueryAllianceUnbondingsByDenomAndDelegatorResponseJvmConverter

public actual object QueryAllianceUnbondingsRequestConverter :
    ProtobufConverter<QueryAllianceUnbondingsRequest> by QueryAllianceUnbondingsRequestJvmConverter

public actual object QueryAllianceUnbondingsResponseConverter :
    ProtobufConverter<QueryAllianceUnbondingsResponse> by
    QueryAllianceUnbondingsResponseJvmConverter

public actual object QueryAllianceRedelegationsRequestConverter :
    ProtobufConverter<QueryAllianceRedelegationsRequest> by
    QueryAllianceRedelegationsRequestJvmConverter

public actual object QueryAllianceRedelegationsResponseConverter :
    ProtobufConverter<QueryAllianceRedelegationsResponse> by
    QueryAllianceRedelegationsResponseJvmConverter

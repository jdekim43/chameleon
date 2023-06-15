// Transform from cosmos/upgrade/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.upgrade.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryCurrentPlanRequestConverter : ProtobufConverter<QueryCurrentPlanRequest>
    by QueryCurrentPlanRequestJvmConverter

public actual object QueryCurrentPlanResponseConverter : ProtobufConverter<QueryCurrentPlanResponse>
    by QueryCurrentPlanResponseJvmConverter

public actual object QueryAppliedPlanRequestConverter : ProtobufConverter<QueryAppliedPlanRequest>
    by QueryAppliedPlanRequestJvmConverter

public actual object QueryAppliedPlanResponseConverter : ProtobufConverter<QueryAppliedPlanResponse>
    by QueryAppliedPlanResponseJvmConverter

public actual object QueryUpgradedConsensusStateRequestConverter :
    ProtobufConverter<QueryUpgradedConsensusStateRequest> by
    QueryUpgradedConsensusStateRequestJvmConverter

public actual object QueryUpgradedConsensusStateResponseConverter :
    ProtobufConverter<QueryUpgradedConsensusStateResponse> by
    QueryUpgradedConsensusStateResponseJvmConverter

public actual object QueryModuleVersionsRequestConverter :
    ProtobufConverter<QueryModuleVersionsRequest> by QueryModuleVersionsRequestJvmConverter

public actual object QueryModuleVersionsResponseConverter :
    ProtobufConverter<QueryModuleVersionsResponse> by QueryModuleVersionsResponseJvmConverter

public actual object QueryAuthorityRequestConverter : ProtobufConverter<QueryAuthorityRequest> by
    QueryAuthorityRequestJvmConverter

public actual object QueryAuthorityResponseConverter : ProtobufConverter<QueryAuthorityResponse> by
    QueryAuthorityResponseJvmConverter

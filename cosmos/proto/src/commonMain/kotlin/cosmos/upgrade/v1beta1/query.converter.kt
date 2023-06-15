// Transform from cosmos/upgrade/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.upgrade.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryCurrentPlanRequestConverter : ProtobufConverter<QueryCurrentPlanRequest>

public fun QueryCurrentPlanRequest.toAny(): Any = Any(QueryCurrentPlanRequest.TYPE_URL,
    with(QueryCurrentPlanRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryCurrentPlanRequest>):
    QueryCurrentPlanRequest {
  if (typeUrl != QueryCurrentPlanRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryCurrentPlanResponseConverter : ProtobufConverter<QueryCurrentPlanResponse>

public fun QueryCurrentPlanResponse.toAny(): Any = Any(QueryCurrentPlanResponse.TYPE_URL,
    with(QueryCurrentPlanResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryCurrentPlanResponse>):
    QueryCurrentPlanResponse {
  if (typeUrl != QueryCurrentPlanResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAppliedPlanRequestConverter : ProtobufConverter<QueryAppliedPlanRequest>

public fun QueryAppliedPlanRequest.toAny(): Any = Any(QueryAppliedPlanRequest.TYPE_URL,
    with(QueryAppliedPlanRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAppliedPlanRequest>):
    QueryAppliedPlanRequest {
  if (typeUrl != QueryAppliedPlanRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAppliedPlanResponseConverter : ProtobufConverter<QueryAppliedPlanResponse>

public fun QueryAppliedPlanResponse.toAny(): Any = Any(QueryAppliedPlanResponse.TYPE_URL,
    with(QueryAppliedPlanResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAppliedPlanResponse>):
    QueryAppliedPlanResponse {
  if (typeUrl != QueryAppliedPlanResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryUpgradedConsensusStateRequestConverter :
    ProtobufConverter<QueryUpgradedConsensusStateRequest>

public fun QueryUpgradedConsensusStateRequest.toAny(): Any =
    Any(QueryUpgradedConsensusStateRequest.TYPE_URL,
    with(QueryUpgradedConsensusStateRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryUpgradedConsensusStateRequest>):
    QueryUpgradedConsensusStateRequest {
  if (typeUrl != QueryUpgradedConsensusStateRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryUpgradedConsensusStateResponseConverter :
    ProtobufConverter<QueryUpgradedConsensusStateResponse>

public fun QueryUpgradedConsensusStateResponse.toAny(): Any =
    Any(QueryUpgradedConsensusStateResponse.TYPE_URL,
    with(QueryUpgradedConsensusStateResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryUpgradedConsensusStateResponse>):
    QueryUpgradedConsensusStateResponse {
  if (typeUrl != QueryUpgradedConsensusStateResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryModuleVersionsRequestConverter :
    ProtobufConverter<QueryModuleVersionsRequest>

public fun QueryModuleVersionsRequest.toAny(): Any = Any(QueryModuleVersionsRequest.TYPE_URL,
    with(QueryModuleVersionsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryModuleVersionsRequest>):
    QueryModuleVersionsRequest {
  if (typeUrl != QueryModuleVersionsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryModuleVersionsResponseConverter :
    ProtobufConverter<QueryModuleVersionsResponse>

public fun QueryModuleVersionsResponse.toAny(): Any = Any(QueryModuleVersionsResponse.TYPE_URL,
    with(QueryModuleVersionsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryModuleVersionsResponse>):
    QueryModuleVersionsResponse {
  if (typeUrl != QueryModuleVersionsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAuthorityRequestConverter : ProtobufConverter<QueryAuthorityRequest>

public fun QueryAuthorityRequest.toAny(): Any = Any(QueryAuthorityRequest.TYPE_URL,
    with(QueryAuthorityRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAuthorityRequest>): QueryAuthorityRequest {
  if (typeUrl != QueryAuthorityRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAuthorityResponseConverter : ProtobufConverter<QueryAuthorityResponse>

public fun QueryAuthorityResponse.toAny(): Any = Any(QueryAuthorityResponse.TYPE_URL,
    with(QueryAuthorityResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAuthorityResponse>): QueryAuthorityResponse {
  if (typeUrl != QueryAuthorityResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

// Transform from cosmos/group/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryGroupInfoRequestConverter : ProtobufConverter<QueryGroupInfoRequest>

public fun QueryGroupInfoRequest.toAny(): Any = Any(QueryGroupInfoRequest.TYPE_URL,
    with(QueryGroupInfoRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGroupInfoRequest>): QueryGroupInfoRequest {
  if (typeUrl != QueryGroupInfoRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGroupInfoResponseConverter : ProtobufConverter<QueryGroupInfoResponse>

public fun QueryGroupInfoResponse.toAny(): Any = Any(QueryGroupInfoResponse.TYPE_URL,
    with(QueryGroupInfoResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGroupInfoResponse>): QueryGroupInfoResponse {
  if (typeUrl != QueryGroupInfoResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGroupPolicyInfoRequestConverter :
    ProtobufConverter<QueryGroupPolicyInfoRequest>

public fun QueryGroupPolicyInfoRequest.toAny(): Any = Any(QueryGroupPolicyInfoRequest.TYPE_URL,
    with(QueryGroupPolicyInfoRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGroupPolicyInfoRequest>):
    QueryGroupPolicyInfoRequest {
  if (typeUrl != QueryGroupPolicyInfoRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGroupPolicyInfoResponseConverter :
    ProtobufConverter<QueryGroupPolicyInfoResponse>

public fun QueryGroupPolicyInfoResponse.toAny(): Any = Any(QueryGroupPolicyInfoResponse.TYPE_URL,
    with(QueryGroupPolicyInfoResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGroupPolicyInfoResponse>):
    QueryGroupPolicyInfoResponse {
  if (typeUrl != QueryGroupPolicyInfoResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGroupMembersRequestConverter : ProtobufConverter<QueryGroupMembersRequest>

public fun QueryGroupMembersRequest.toAny(): Any = Any(QueryGroupMembersRequest.TYPE_URL,
    with(QueryGroupMembersRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGroupMembersRequest>):
    QueryGroupMembersRequest {
  if (typeUrl != QueryGroupMembersRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGroupMembersResponseConverter :
    ProtobufConverter<QueryGroupMembersResponse>

public fun QueryGroupMembersResponse.toAny(): Any = Any(QueryGroupMembersResponse.TYPE_URL,
    with(QueryGroupMembersResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGroupMembersResponse>):
    QueryGroupMembersResponse {
  if (typeUrl != QueryGroupMembersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGroupsByAdminRequestConverter :
    ProtobufConverter<QueryGroupsByAdminRequest>

public fun QueryGroupsByAdminRequest.toAny(): Any = Any(QueryGroupsByAdminRequest.TYPE_URL,
    with(QueryGroupsByAdminRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGroupsByAdminRequest>):
    QueryGroupsByAdminRequest {
  if (typeUrl != QueryGroupsByAdminRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGroupsByAdminResponseConverter :
    ProtobufConverter<QueryGroupsByAdminResponse>

public fun QueryGroupsByAdminResponse.toAny(): Any = Any(QueryGroupsByAdminResponse.TYPE_URL,
    with(QueryGroupsByAdminResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGroupsByAdminResponse>):
    QueryGroupsByAdminResponse {
  if (typeUrl != QueryGroupsByAdminResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGroupPoliciesByGroupRequestConverter :
    ProtobufConverter<QueryGroupPoliciesByGroupRequest>

public fun QueryGroupPoliciesByGroupRequest.toAny(): Any =
    Any(QueryGroupPoliciesByGroupRequest.TYPE_URL, with(QueryGroupPoliciesByGroupRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGroupPoliciesByGroupRequest>):
    QueryGroupPoliciesByGroupRequest {
  if (typeUrl != QueryGroupPoliciesByGroupRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGroupPoliciesByGroupResponseConverter :
    ProtobufConverter<QueryGroupPoliciesByGroupResponse>

public fun QueryGroupPoliciesByGroupResponse.toAny(): Any =
    Any(QueryGroupPoliciesByGroupResponse.TYPE_URL, with(QueryGroupPoliciesByGroupResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGroupPoliciesByGroupResponse>):
    QueryGroupPoliciesByGroupResponse {
  if (typeUrl != QueryGroupPoliciesByGroupResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGroupPoliciesByAdminRequestConverter :
    ProtobufConverter<QueryGroupPoliciesByAdminRequest>

public fun QueryGroupPoliciesByAdminRequest.toAny(): Any =
    Any(QueryGroupPoliciesByAdminRequest.TYPE_URL, with(QueryGroupPoliciesByAdminRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGroupPoliciesByAdminRequest>):
    QueryGroupPoliciesByAdminRequest {
  if (typeUrl != QueryGroupPoliciesByAdminRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGroupPoliciesByAdminResponseConverter :
    ProtobufConverter<QueryGroupPoliciesByAdminResponse>

public fun QueryGroupPoliciesByAdminResponse.toAny(): Any =
    Any(QueryGroupPoliciesByAdminResponse.TYPE_URL, with(QueryGroupPoliciesByAdminResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGroupPoliciesByAdminResponse>):
    QueryGroupPoliciesByAdminResponse {
  if (typeUrl != QueryGroupPoliciesByAdminResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryProposalRequestConverter : ProtobufConverter<QueryProposalRequest>

public fun QueryProposalRequest.toAny(): Any = Any(QueryProposalRequest.TYPE_URL,
    with(QueryProposalRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryProposalRequest>): QueryProposalRequest {
  if (typeUrl != QueryProposalRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryProposalResponseConverter : ProtobufConverter<QueryProposalResponse>

public fun QueryProposalResponse.toAny(): Any = Any(QueryProposalResponse.TYPE_URL,
    with(QueryProposalResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryProposalResponse>): QueryProposalResponse {
  if (typeUrl != QueryProposalResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryProposalsByGroupPolicyRequestConverter :
    ProtobufConverter<QueryProposalsByGroupPolicyRequest>

public fun QueryProposalsByGroupPolicyRequest.toAny(): Any =
    Any(QueryProposalsByGroupPolicyRequest.TYPE_URL,
    with(QueryProposalsByGroupPolicyRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryProposalsByGroupPolicyRequest>):
    QueryProposalsByGroupPolicyRequest {
  if (typeUrl != QueryProposalsByGroupPolicyRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryProposalsByGroupPolicyResponseConverter :
    ProtobufConverter<QueryProposalsByGroupPolicyResponse>

public fun QueryProposalsByGroupPolicyResponse.toAny(): Any =
    Any(QueryProposalsByGroupPolicyResponse.TYPE_URL,
    with(QueryProposalsByGroupPolicyResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryProposalsByGroupPolicyResponse>):
    QueryProposalsByGroupPolicyResponse {
  if (typeUrl != QueryProposalsByGroupPolicyResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryVoteByProposalVoterRequestConverter :
    ProtobufConverter<QueryVoteByProposalVoterRequest>

public fun QueryVoteByProposalVoterRequest.toAny(): Any =
    Any(QueryVoteByProposalVoterRequest.TYPE_URL, with(QueryVoteByProposalVoterRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryVoteByProposalVoterRequest>):
    QueryVoteByProposalVoterRequest {
  if (typeUrl != QueryVoteByProposalVoterRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryVoteByProposalVoterResponseConverter :
    ProtobufConverter<QueryVoteByProposalVoterResponse>

public fun QueryVoteByProposalVoterResponse.toAny(): Any =
    Any(QueryVoteByProposalVoterResponse.TYPE_URL, with(QueryVoteByProposalVoterResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryVoteByProposalVoterResponse>):
    QueryVoteByProposalVoterResponse {
  if (typeUrl != QueryVoteByProposalVoterResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryVotesByProposalRequestConverter :
    ProtobufConverter<QueryVotesByProposalRequest>

public fun QueryVotesByProposalRequest.toAny(): Any = Any(QueryVotesByProposalRequest.TYPE_URL,
    with(QueryVotesByProposalRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryVotesByProposalRequest>):
    QueryVotesByProposalRequest {
  if (typeUrl != QueryVotesByProposalRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryVotesByProposalResponseConverter :
    ProtobufConverter<QueryVotesByProposalResponse>

public fun QueryVotesByProposalResponse.toAny(): Any = Any(QueryVotesByProposalResponse.TYPE_URL,
    with(QueryVotesByProposalResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryVotesByProposalResponse>):
    QueryVotesByProposalResponse {
  if (typeUrl != QueryVotesByProposalResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryVotesByVoterRequestConverter : ProtobufConverter<QueryVotesByVoterRequest>

public fun QueryVotesByVoterRequest.toAny(): Any = Any(QueryVotesByVoterRequest.TYPE_URL,
    with(QueryVotesByVoterRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryVotesByVoterRequest>):
    QueryVotesByVoterRequest {
  if (typeUrl != QueryVotesByVoterRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryVotesByVoterResponseConverter :
    ProtobufConverter<QueryVotesByVoterResponse>

public fun QueryVotesByVoterResponse.toAny(): Any = Any(QueryVotesByVoterResponse.TYPE_URL,
    with(QueryVotesByVoterResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryVotesByVoterResponse>):
    QueryVotesByVoterResponse {
  if (typeUrl != QueryVotesByVoterResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGroupsByMemberRequestConverter :
    ProtobufConverter<QueryGroupsByMemberRequest>

public fun QueryGroupsByMemberRequest.toAny(): Any = Any(QueryGroupsByMemberRequest.TYPE_URL,
    with(QueryGroupsByMemberRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGroupsByMemberRequest>):
    QueryGroupsByMemberRequest {
  if (typeUrl != QueryGroupsByMemberRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGroupsByMemberResponseConverter :
    ProtobufConverter<QueryGroupsByMemberResponse>

public fun QueryGroupsByMemberResponse.toAny(): Any = Any(QueryGroupsByMemberResponse.TYPE_URL,
    with(QueryGroupsByMemberResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGroupsByMemberResponse>):
    QueryGroupsByMemberResponse {
  if (typeUrl != QueryGroupsByMemberResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTallyResultRequestConverter : ProtobufConverter<QueryTallyResultRequest>

public fun QueryTallyResultRequest.toAny(): Any = Any(QueryTallyResultRequest.TYPE_URL,
    with(QueryTallyResultRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTallyResultRequest>):
    QueryTallyResultRequest {
  if (typeUrl != QueryTallyResultRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryTallyResultResponseConverter : ProtobufConverter<QueryTallyResultResponse>

public fun QueryTallyResultResponse.toAny(): Any = Any(QueryTallyResultResponse.TYPE_URL,
    with(QueryTallyResultResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryTallyResultResponse>):
    QueryTallyResultResponse {
  if (typeUrl != QueryTallyResultResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGroupsRequestConverter : ProtobufConverter<QueryGroupsRequest>

public fun QueryGroupsRequest.toAny(): Any = Any(QueryGroupsRequest.TYPE_URL,
    with(QueryGroupsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGroupsRequest>): QueryGroupsRequest {
  if (typeUrl != QueryGroupsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGroupsResponseConverter : ProtobufConverter<QueryGroupsResponse>

public fun QueryGroupsResponse.toAny(): Any = Any(QueryGroupsResponse.TYPE_URL,
    with(QueryGroupsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGroupsResponse>): QueryGroupsResponse {
  if (typeUrl != QueryGroupsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

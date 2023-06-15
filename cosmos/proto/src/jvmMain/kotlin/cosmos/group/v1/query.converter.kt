// Transform from cosmos/group/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryGroupInfoRequestConverter : ProtobufConverter<QueryGroupInfoRequest> by
    QueryGroupInfoRequestJvmConverter

public actual object QueryGroupInfoResponseConverter : ProtobufConverter<QueryGroupInfoResponse> by
    QueryGroupInfoResponseJvmConverter

public actual object QueryGroupPolicyInfoRequestConverter :
    ProtobufConverter<QueryGroupPolicyInfoRequest> by QueryGroupPolicyInfoRequestJvmConverter

public actual object QueryGroupPolicyInfoResponseConverter :
    ProtobufConverter<QueryGroupPolicyInfoResponse> by QueryGroupPolicyInfoResponseJvmConverter

public actual object QueryGroupMembersRequestConverter : ProtobufConverter<QueryGroupMembersRequest>
    by QueryGroupMembersRequestJvmConverter

public actual object QueryGroupMembersResponseConverter :
    ProtobufConverter<QueryGroupMembersResponse> by QueryGroupMembersResponseJvmConverter

public actual object QueryGroupsByAdminRequestConverter :
    ProtobufConverter<QueryGroupsByAdminRequest> by QueryGroupsByAdminRequestJvmConverter

public actual object QueryGroupsByAdminResponseConverter :
    ProtobufConverter<QueryGroupsByAdminResponse> by QueryGroupsByAdminResponseJvmConverter

public actual object QueryGroupPoliciesByGroupRequestConverter :
    ProtobufConverter<QueryGroupPoliciesByGroupRequest> by
    QueryGroupPoliciesByGroupRequestJvmConverter

public actual object QueryGroupPoliciesByGroupResponseConverter :
    ProtobufConverter<QueryGroupPoliciesByGroupResponse> by
    QueryGroupPoliciesByGroupResponseJvmConverter

public actual object QueryGroupPoliciesByAdminRequestConverter :
    ProtobufConverter<QueryGroupPoliciesByAdminRequest> by
    QueryGroupPoliciesByAdminRequestJvmConverter

public actual object QueryGroupPoliciesByAdminResponseConverter :
    ProtobufConverter<QueryGroupPoliciesByAdminResponse> by
    QueryGroupPoliciesByAdminResponseJvmConverter

public actual object QueryProposalRequestConverter : ProtobufConverter<QueryProposalRequest> by
    QueryProposalRequestJvmConverter

public actual object QueryProposalResponseConverter : ProtobufConverter<QueryProposalResponse> by
    QueryProposalResponseJvmConverter

public actual object QueryProposalsByGroupPolicyRequestConverter :
    ProtobufConverter<QueryProposalsByGroupPolicyRequest> by
    QueryProposalsByGroupPolicyRequestJvmConverter

public actual object QueryProposalsByGroupPolicyResponseConverter :
    ProtobufConverter<QueryProposalsByGroupPolicyResponse> by
    QueryProposalsByGroupPolicyResponseJvmConverter

public actual object QueryVoteByProposalVoterRequestConverter :
    ProtobufConverter<QueryVoteByProposalVoterRequest> by
    QueryVoteByProposalVoterRequestJvmConverter

public actual object QueryVoteByProposalVoterResponseConverter :
    ProtobufConverter<QueryVoteByProposalVoterResponse> by
    QueryVoteByProposalVoterResponseJvmConverter

public actual object QueryVotesByProposalRequestConverter :
    ProtobufConverter<QueryVotesByProposalRequest> by QueryVotesByProposalRequestJvmConverter

public actual object QueryVotesByProposalResponseConverter :
    ProtobufConverter<QueryVotesByProposalResponse> by QueryVotesByProposalResponseJvmConverter

public actual object QueryVotesByVoterRequestConverter : ProtobufConverter<QueryVotesByVoterRequest>
    by QueryVotesByVoterRequestJvmConverter

public actual object QueryVotesByVoterResponseConverter :
    ProtobufConverter<QueryVotesByVoterResponse> by QueryVotesByVoterResponseJvmConverter

public actual object QueryGroupsByMemberRequestConverter :
    ProtobufConverter<QueryGroupsByMemberRequest> by QueryGroupsByMemberRequestJvmConverter

public actual object QueryGroupsByMemberResponseConverter :
    ProtobufConverter<QueryGroupsByMemberResponse> by QueryGroupsByMemberResponseJvmConverter

public actual object QueryTallyResultRequestConverter : ProtobufConverter<QueryTallyResultRequest>
    by QueryTallyResultRequestJvmConverter

public actual object QueryTallyResultResponseConverter : ProtobufConverter<QueryTallyResultResponse>
    by QueryTallyResultResponseJvmConverter

public actual object QueryGroupsRequestConverter : ProtobufConverter<QueryGroupsRequest> by
    QueryGroupsRequestJvmConverter

public actual object QueryGroupsResponseConverter : ProtobufConverter<QueryGroupsResponse> by
    QueryGroupsResponseJvmConverter

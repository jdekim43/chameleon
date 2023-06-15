// Transform from cosmos/group/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestJvmConverter
import cosmos.base.query.v1beta1.PageResponseJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object QueryGroupInfoRequestJvmConverter :
    ProtobufTypeMapper<QueryGroupInfoRequest, QueryOuterClass.QueryGroupInfoRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGroupInfoRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGroupInfoRequest> =
      QueryOuterClass.QueryGroupInfoRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGroupInfoRequest): QueryGroupInfoRequest =
      QueryGroupInfoRequest(
  	groupId = obj.getGroupId().asKotlinType,
  )

  public override fun convert(obj: QueryGroupInfoRequest): QueryOuterClass.QueryGroupInfoRequest {
    val builder = QueryOuterClass.QueryGroupInfoRequest.newBuilder()
    builder.setGroupId(obj.groupId.asJavaType)
    return builder.build()
  }
}

public object QueryGroupInfoResponseJvmConverter :
    ProtobufTypeMapper<QueryGroupInfoResponse, QueryOuterClass.QueryGroupInfoResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGroupInfoResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGroupInfoResponse> =
      QueryOuterClass.QueryGroupInfoResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGroupInfoResponse): QueryGroupInfoResponse =
      QueryGroupInfoResponse(
  	info = GroupInfoJvmConverter.convert(obj.getInfo()),
  )

  public override fun convert(obj: QueryGroupInfoResponse): QueryOuterClass.QueryGroupInfoResponse {
    val builder = QueryOuterClass.QueryGroupInfoResponse.newBuilder()
    builder.setInfo(GroupInfoJvmConverter.convert(obj.info))
    return builder.build()
  }
}

public object QueryGroupPolicyInfoRequestJvmConverter :
    ProtobufTypeMapper<QueryGroupPolicyInfoRequest, QueryOuterClass.QueryGroupPolicyInfoRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGroupPolicyInfoRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGroupPolicyInfoRequest> =
      QueryOuterClass.QueryGroupPolicyInfoRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGroupPolicyInfoRequest):
      QueryGroupPolicyInfoRequest = QueryGroupPolicyInfoRequest(
  	address = obj.getAddress(),
  )

  public override fun convert(obj: QueryGroupPolicyInfoRequest):
      QueryOuterClass.QueryGroupPolicyInfoRequest {
    val builder = QueryOuterClass.QueryGroupPolicyInfoRequest.newBuilder()
    builder.setAddress(obj.address)
    return builder.build()
  }
}

public object QueryGroupPolicyInfoResponseJvmConverter :
    ProtobufTypeMapper<QueryGroupPolicyInfoResponse, QueryOuterClass.QueryGroupPolicyInfoResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGroupPolicyInfoResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGroupPolicyInfoResponse> =
      QueryOuterClass.QueryGroupPolicyInfoResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGroupPolicyInfoResponse):
      QueryGroupPolicyInfoResponse = QueryGroupPolicyInfoResponse(
  	info = GroupPolicyInfoJvmConverter.convert(obj.getInfo()),
  )

  public override fun convert(obj: QueryGroupPolicyInfoResponse):
      QueryOuterClass.QueryGroupPolicyInfoResponse {
    val builder = QueryOuterClass.QueryGroupPolicyInfoResponse.newBuilder()
    builder.setInfo(GroupPolicyInfoJvmConverter.convert(obj.info))
    return builder.build()
  }
}

public object QueryGroupMembersRequestJvmConverter :
    ProtobufTypeMapper<QueryGroupMembersRequest, QueryOuterClass.QueryGroupMembersRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGroupMembersRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGroupMembersRequest> =
      QueryOuterClass.QueryGroupMembersRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGroupMembersRequest):
      QueryGroupMembersRequest = QueryGroupMembersRequest(
  	groupId = obj.getGroupId().asKotlinType,
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryGroupMembersRequest):
      QueryOuterClass.QueryGroupMembersRequest {
    val builder = QueryOuterClass.QueryGroupMembersRequest.newBuilder()
    builder.setGroupId(obj.groupId.asJavaType)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGroupMembersResponseJvmConverter :
    ProtobufTypeMapper<QueryGroupMembersResponse, QueryOuterClass.QueryGroupMembersResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGroupMembersResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGroupMembersResponse> =
      QueryOuterClass.QueryGroupMembersResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGroupMembersResponse):
      QueryGroupMembersResponse = QueryGroupMembersResponse(
  	members = obj.getMembersList().map { GroupMemberJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryGroupMembersResponse):
      QueryOuterClass.QueryGroupMembersResponse {
    val builder = QueryOuterClass.QueryGroupMembersResponse.newBuilder()
    builder.addAllMembers(obj.members.map { GroupMemberJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGroupsByAdminRequestJvmConverter :
    ProtobufTypeMapper<QueryGroupsByAdminRequest, QueryOuterClass.QueryGroupsByAdminRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGroupsByAdminRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGroupsByAdminRequest> =
      QueryOuterClass.QueryGroupsByAdminRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGroupsByAdminRequest):
      QueryGroupsByAdminRequest = QueryGroupsByAdminRequest(
  	admin = obj.getAdmin(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryGroupsByAdminRequest):
      QueryOuterClass.QueryGroupsByAdminRequest {
    val builder = QueryOuterClass.QueryGroupsByAdminRequest.newBuilder()
    builder.setAdmin(obj.admin)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGroupsByAdminResponseJvmConverter :
    ProtobufTypeMapper<QueryGroupsByAdminResponse, QueryOuterClass.QueryGroupsByAdminResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGroupsByAdminResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGroupsByAdminResponse> =
      QueryOuterClass.QueryGroupsByAdminResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGroupsByAdminResponse):
      QueryGroupsByAdminResponse = QueryGroupsByAdminResponse(
  	groups = obj.getGroupsList().map { GroupInfoJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryGroupsByAdminResponse):
      QueryOuterClass.QueryGroupsByAdminResponse {
    val builder = QueryOuterClass.QueryGroupsByAdminResponse.newBuilder()
    builder.addAllGroups(obj.groups.map { GroupInfoJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGroupPoliciesByGroupRequestJvmConverter :
    ProtobufTypeMapper<QueryGroupPoliciesByGroupRequest, QueryOuterClass.QueryGroupPoliciesByGroupRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGroupPoliciesByGroupRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGroupPoliciesByGroupRequest> =
      QueryOuterClass.QueryGroupPoliciesByGroupRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGroupPoliciesByGroupRequest):
      QueryGroupPoliciesByGroupRequest = QueryGroupPoliciesByGroupRequest(
  	groupId = obj.getGroupId().asKotlinType,
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryGroupPoliciesByGroupRequest):
      QueryOuterClass.QueryGroupPoliciesByGroupRequest {
    val builder = QueryOuterClass.QueryGroupPoliciesByGroupRequest.newBuilder()
    builder.setGroupId(obj.groupId.asJavaType)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGroupPoliciesByGroupResponseJvmConverter :
    ProtobufTypeMapper<QueryGroupPoliciesByGroupResponse, QueryOuterClass.QueryGroupPoliciesByGroupResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGroupPoliciesByGroupResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGroupPoliciesByGroupResponse> =
      QueryOuterClass.QueryGroupPoliciesByGroupResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGroupPoliciesByGroupResponse):
      QueryGroupPoliciesByGroupResponse = QueryGroupPoliciesByGroupResponse(
  	groupPolicies = obj.getGroupPoliciesList().map { GroupPolicyInfoJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryGroupPoliciesByGroupResponse):
      QueryOuterClass.QueryGroupPoliciesByGroupResponse {
    val builder = QueryOuterClass.QueryGroupPoliciesByGroupResponse.newBuilder()
    builder.addAllGroupPolicies(obj.groupPolicies.map { GroupPolicyInfoJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGroupPoliciesByAdminRequestJvmConverter :
    ProtobufTypeMapper<QueryGroupPoliciesByAdminRequest, QueryOuterClass.QueryGroupPoliciesByAdminRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGroupPoliciesByAdminRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGroupPoliciesByAdminRequest> =
      QueryOuterClass.QueryGroupPoliciesByAdminRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGroupPoliciesByAdminRequest):
      QueryGroupPoliciesByAdminRequest = QueryGroupPoliciesByAdminRequest(
  	admin = obj.getAdmin(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryGroupPoliciesByAdminRequest):
      QueryOuterClass.QueryGroupPoliciesByAdminRequest {
    val builder = QueryOuterClass.QueryGroupPoliciesByAdminRequest.newBuilder()
    builder.setAdmin(obj.admin)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGroupPoliciesByAdminResponseJvmConverter :
    ProtobufTypeMapper<QueryGroupPoliciesByAdminResponse, QueryOuterClass.QueryGroupPoliciesByAdminResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGroupPoliciesByAdminResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGroupPoliciesByAdminResponse> =
      QueryOuterClass.QueryGroupPoliciesByAdminResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGroupPoliciesByAdminResponse):
      QueryGroupPoliciesByAdminResponse = QueryGroupPoliciesByAdminResponse(
  	groupPolicies = obj.getGroupPoliciesList().map { GroupPolicyInfoJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryGroupPoliciesByAdminResponse):
      QueryOuterClass.QueryGroupPoliciesByAdminResponse {
    val builder = QueryOuterClass.QueryGroupPoliciesByAdminResponse.newBuilder()
    builder.addAllGroupPolicies(obj.groupPolicies.map { GroupPolicyInfoJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryProposalRequestJvmConverter :
    ProtobufTypeMapper<QueryProposalRequest, QueryOuterClass.QueryProposalRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryProposalRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryProposalRequest> =
      QueryOuterClass.QueryProposalRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryProposalRequest): QueryProposalRequest =
      QueryProposalRequest(
  	proposalId = obj.getProposalId().asKotlinType,
  )

  public override fun convert(obj: QueryProposalRequest): QueryOuterClass.QueryProposalRequest {
    val builder = QueryOuterClass.QueryProposalRequest.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    return builder.build()
  }
}

public object QueryProposalResponseJvmConverter :
    ProtobufTypeMapper<QueryProposalResponse, QueryOuterClass.QueryProposalResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryProposalResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryProposalResponse> =
      QueryOuterClass.QueryProposalResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryProposalResponse): QueryProposalResponse =
      QueryProposalResponse(
  	proposal = ProposalJvmConverter.convert(obj.getProposal()),
  )

  public override fun convert(obj: QueryProposalResponse): QueryOuterClass.QueryProposalResponse {
    val builder = QueryOuterClass.QueryProposalResponse.newBuilder()
    builder.setProposal(ProposalJvmConverter.convert(obj.proposal))
    return builder.build()
  }
}

public object QueryProposalsByGroupPolicyRequestJvmConverter :
    ProtobufTypeMapper<QueryProposalsByGroupPolicyRequest, QueryOuterClass.QueryProposalsByGroupPolicyRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryProposalsByGroupPolicyRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryProposalsByGroupPolicyRequest> =
      QueryOuterClass.QueryProposalsByGroupPolicyRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryProposalsByGroupPolicyRequest):
      QueryProposalsByGroupPolicyRequest = QueryProposalsByGroupPolicyRequest(
  	address = obj.getAddress(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryProposalsByGroupPolicyRequest):
      QueryOuterClass.QueryProposalsByGroupPolicyRequest {
    val builder = QueryOuterClass.QueryProposalsByGroupPolicyRequest.newBuilder()
    builder.setAddress(obj.address)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryProposalsByGroupPolicyResponseJvmConverter :
    ProtobufTypeMapper<QueryProposalsByGroupPolicyResponse, QueryOuterClass.QueryProposalsByGroupPolicyResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryProposalsByGroupPolicyResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryProposalsByGroupPolicyResponse> =
      QueryOuterClass.QueryProposalsByGroupPolicyResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryProposalsByGroupPolicyResponse):
      QueryProposalsByGroupPolicyResponse = QueryProposalsByGroupPolicyResponse(
  	proposals = obj.getProposalsList().map { ProposalJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryProposalsByGroupPolicyResponse):
      QueryOuterClass.QueryProposalsByGroupPolicyResponse {
    val builder = QueryOuterClass.QueryProposalsByGroupPolicyResponse.newBuilder()
    builder.addAllProposals(obj.proposals.map { ProposalJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryVoteByProposalVoterRequestJvmConverter :
    ProtobufTypeMapper<QueryVoteByProposalVoterRequest, QueryOuterClass.QueryVoteByProposalVoterRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryVoteByProposalVoterRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryVoteByProposalVoterRequest> =
      QueryOuterClass.QueryVoteByProposalVoterRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryVoteByProposalVoterRequest):
      QueryVoteByProposalVoterRequest = QueryVoteByProposalVoterRequest(
  	proposalId = obj.getProposalId().asKotlinType,
  	voter = obj.getVoter(),
  )

  public override fun convert(obj: QueryVoteByProposalVoterRequest):
      QueryOuterClass.QueryVoteByProposalVoterRequest {
    val builder = QueryOuterClass.QueryVoteByProposalVoterRequest.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setVoter(obj.voter)
    return builder.build()
  }
}

public object QueryVoteByProposalVoterResponseJvmConverter :
    ProtobufTypeMapper<QueryVoteByProposalVoterResponse, QueryOuterClass.QueryVoteByProposalVoterResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryVoteByProposalVoterResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryVoteByProposalVoterResponse> =
      QueryOuterClass.QueryVoteByProposalVoterResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryVoteByProposalVoterResponse):
      QueryVoteByProposalVoterResponse = QueryVoteByProposalVoterResponse(
  	vote = VoteJvmConverter.convert(obj.getVote()),
  )

  public override fun convert(obj: QueryVoteByProposalVoterResponse):
      QueryOuterClass.QueryVoteByProposalVoterResponse {
    val builder = QueryOuterClass.QueryVoteByProposalVoterResponse.newBuilder()
    builder.setVote(VoteJvmConverter.convert(obj.vote))
    return builder.build()
  }
}

public object QueryVotesByProposalRequestJvmConverter :
    ProtobufTypeMapper<QueryVotesByProposalRequest, QueryOuterClass.QueryVotesByProposalRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryVotesByProposalRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryVotesByProposalRequest> =
      QueryOuterClass.QueryVotesByProposalRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryVotesByProposalRequest):
      QueryVotesByProposalRequest = QueryVotesByProposalRequest(
  	proposalId = obj.getProposalId().asKotlinType,
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryVotesByProposalRequest):
      QueryOuterClass.QueryVotesByProposalRequest {
    val builder = QueryOuterClass.QueryVotesByProposalRequest.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryVotesByProposalResponseJvmConverter :
    ProtobufTypeMapper<QueryVotesByProposalResponse, QueryOuterClass.QueryVotesByProposalResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryVotesByProposalResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryVotesByProposalResponse> =
      QueryOuterClass.QueryVotesByProposalResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryVotesByProposalResponse):
      QueryVotesByProposalResponse = QueryVotesByProposalResponse(
  	votes = obj.getVotesList().map { VoteJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryVotesByProposalResponse):
      QueryOuterClass.QueryVotesByProposalResponse {
    val builder = QueryOuterClass.QueryVotesByProposalResponse.newBuilder()
    builder.addAllVotes(obj.votes.map { VoteJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryVotesByVoterRequestJvmConverter :
    ProtobufTypeMapper<QueryVotesByVoterRequest, QueryOuterClass.QueryVotesByVoterRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryVotesByVoterRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryVotesByVoterRequest> =
      QueryOuterClass.QueryVotesByVoterRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryVotesByVoterRequest):
      QueryVotesByVoterRequest = QueryVotesByVoterRequest(
  	voter = obj.getVoter(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryVotesByVoterRequest):
      QueryOuterClass.QueryVotesByVoterRequest {
    val builder = QueryOuterClass.QueryVotesByVoterRequest.newBuilder()
    builder.setVoter(obj.voter)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryVotesByVoterResponseJvmConverter :
    ProtobufTypeMapper<QueryVotesByVoterResponse, QueryOuterClass.QueryVotesByVoterResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryVotesByVoterResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryVotesByVoterResponse> =
      QueryOuterClass.QueryVotesByVoterResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryVotesByVoterResponse):
      QueryVotesByVoterResponse = QueryVotesByVoterResponse(
  	votes = obj.getVotesList().map { VoteJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryVotesByVoterResponse):
      QueryOuterClass.QueryVotesByVoterResponse {
    val builder = QueryOuterClass.QueryVotesByVoterResponse.newBuilder()
    builder.addAllVotes(obj.votes.map { VoteJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGroupsByMemberRequestJvmConverter :
    ProtobufTypeMapper<QueryGroupsByMemberRequest, QueryOuterClass.QueryGroupsByMemberRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGroupsByMemberRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGroupsByMemberRequest> =
      QueryOuterClass.QueryGroupsByMemberRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGroupsByMemberRequest):
      QueryGroupsByMemberRequest = QueryGroupsByMemberRequest(
  	address = obj.getAddress(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryGroupsByMemberRequest):
      QueryOuterClass.QueryGroupsByMemberRequest {
    val builder = QueryOuterClass.QueryGroupsByMemberRequest.newBuilder()
    builder.setAddress(obj.address)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGroupsByMemberResponseJvmConverter :
    ProtobufTypeMapper<QueryGroupsByMemberResponse, QueryOuterClass.QueryGroupsByMemberResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGroupsByMemberResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGroupsByMemberResponse> =
      QueryOuterClass.QueryGroupsByMemberResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGroupsByMemberResponse):
      QueryGroupsByMemberResponse = QueryGroupsByMemberResponse(
  	groups = obj.getGroupsList().map { GroupInfoJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryGroupsByMemberResponse):
      QueryOuterClass.QueryGroupsByMemberResponse {
    val builder = QueryOuterClass.QueryGroupsByMemberResponse.newBuilder()
    builder.addAllGroups(obj.groups.map { GroupInfoJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryTallyResultRequestJvmConverter :
    ProtobufTypeMapper<QueryTallyResultRequest, QueryOuterClass.QueryTallyResultRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTallyResultRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTallyResultRequest> =
      QueryOuterClass.QueryTallyResultRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryTallyResultRequest): QueryTallyResultRequest
      = QueryTallyResultRequest(
  	proposalId = obj.getProposalId().asKotlinType,
  )

  public override fun convert(obj: QueryTallyResultRequest):
      QueryOuterClass.QueryTallyResultRequest {
    val builder = QueryOuterClass.QueryTallyResultRequest.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    return builder.build()
  }
}

public object QueryTallyResultResponseJvmConverter :
    ProtobufTypeMapper<QueryTallyResultResponse, QueryOuterClass.QueryTallyResultResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTallyResultResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTallyResultResponse> =
      QueryOuterClass.QueryTallyResultResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryTallyResultResponse):
      QueryTallyResultResponse = QueryTallyResultResponse(
  	tally = TallyResultJvmConverter.convert(obj.getTally()),
  )

  public override fun convert(obj: QueryTallyResultResponse):
      QueryOuterClass.QueryTallyResultResponse {
    val builder = QueryOuterClass.QueryTallyResultResponse.newBuilder()
    builder.setTally(TallyResultJvmConverter.convert(obj.tally))
    return builder.build()
  }
}

public object QueryGroupsRequestJvmConverter :
    ProtobufTypeMapper<QueryGroupsRequest, QueryOuterClass.QueryGroupsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGroupsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGroupsRequest> =
      QueryOuterClass.QueryGroupsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGroupsRequest): QueryGroupsRequest =
      QueryGroupsRequest(
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryGroupsRequest): QueryOuterClass.QueryGroupsRequest {
    val builder = QueryOuterClass.QueryGroupsRequest.newBuilder()
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGroupsResponseJvmConverter :
    ProtobufTypeMapper<QueryGroupsResponse, QueryOuterClass.QueryGroupsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGroupsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGroupsResponse> =
      QueryOuterClass.QueryGroupsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGroupsResponse): QueryGroupsResponse =
      QueryGroupsResponse(
  	groups = obj.getGroupsList().map { GroupInfoJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryGroupsResponse): QueryOuterClass.QueryGroupsResponse {
    val builder = QueryOuterClass.QueryGroupsResponse.newBuilder()
    builder.addAllGroups(obj.groups.map { GroupInfoJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

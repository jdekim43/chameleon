// Transform from cosmos/group/v1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ServerCalls
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.grpc.ClientOption

public object QueryJvm {
  private val descriptor: ServiceDescriptor = QueryGrpc.getServiceDescriptor()!!

  private val groupInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGroupInfoRequest, QueryOuterClass.QueryGroupInfoResponse>
      = QueryGrpc.getGroupInfoMethod()!!

  private val groupPolicyInfoDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGroupPolicyInfoRequest, QueryOuterClass.QueryGroupPolicyInfoResponse>
      = QueryGrpc.getGroupPolicyInfoMethod()!!

  private val groupMembersDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGroupMembersRequest, QueryOuterClass.QueryGroupMembersResponse>
      = QueryGrpc.getGroupMembersMethod()!!

  private val groupsByAdminDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGroupsByAdminRequest, QueryOuterClass.QueryGroupsByAdminResponse>
      = QueryGrpc.getGroupsByAdminMethod()!!

  private val groupPoliciesByGroupDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGroupPoliciesByGroupRequest, QueryOuterClass.QueryGroupPoliciesByGroupResponse>
      = QueryGrpc.getGroupPoliciesByGroupMethod()!!

  private val groupPoliciesByAdminDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGroupPoliciesByAdminRequest, QueryOuterClass.QueryGroupPoliciesByAdminResponse>
      = QueryGrpc.getGroupPoliciesByAdminMethod()!!

  private val proposalDescriptor:
      MethodDescriptor<QueryOuterClass.QueryProposalRequest, QueryOuterClass.QueryProposalResponse>
      = QueryGrpc.getProposalMethod()!!

  private val proposalsByGroupPolicyDescriptor:
      MethodDescriptor<QueryOuterClass.QueryProposalsByGroupPolicyRequest, QueryOuterClass.QueryProposalsByGroupPolicyResponse>
      = QueryGrpc.getProposalsByGroupPolicyMethod()!!

  private val voteByProposalVoterDescriptor:
      MethodDescriptor<QueryOuterClass.QueryVoteByProposalVoterRequest, QueryOuterClass.QueryVoteByProposalVoterResponse>
      = QueryGrpc.getVoteByProposalVoterMethod()!!

  private val votesByProposalDescriptor:
      MethodDescriptor<QueryOuterClass.QueryVotesByProposalRequest, QueryOuterClass.QueryVotesByProposalResponse>
      = QueryGrpc.getVotesByProposalMethod()!!

  private val votesByVoterDescriptor:
      MethodDescriptor<QueryOuterClass.QueryVotesByVoterRequest, QueryOuterClass.QueryVotesByVoterResponse>
      = QueryGrpc.getVotesByVoterMethod()!!

  private val groupsByMemberDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGroupsByMemberRequest, QueryOuterClass.QueryGroupsByMemberResponse>
      = QueryGrpc.getGroupsByMemberMethod()!!

  private val tallyResultDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTallyResultRequest, QueryOuterClass.QueryTallyResultResponse>
      = QueryGrpc.getTallyResultMethod()!!

  private val groupsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGroupsRequest, QueryOuterClass.QueryGroupsResponse> =
      QueryGrpc.getGroupsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun groupInfo(request: QueryGroupInfoRequest):
        QueryGroupInfoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.GroupInfo is unimplemented"))

    public open override suspend fun groupPolicyInfo(request: QueryGroupPolicyInfoRequest):
        QueryGroupPolicyInfoResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.GroupPolicyInfo is unimplemented"))

    public open override suspend fun groupMembers(request: QueryGroupMembersRequest):
        QueryGroupMembersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.GroupMembers is unimplemented"))

    public open override suspend fun groupsByAdmin(request: QueryGroupsByAdminRequest):
        QueryGroupsByAdminResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.GroupsByAdmin is unimplemented"))

    public open override suspend
        fun groupPoliciesByGroup(request: QueryGroupPoliciesByGroupRequest):
        QueryGroupPoliciesByGroupResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.GroupPoliciesByGroup is unimplemented"))

    public open override suspend
        fun groupPoliciesByAdmin(request: QueryGroupPoliciesByAdminRequest):
        QueryGroupPoliciesByAdminResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.GroupPoliciesByAdmin is unimplemented"))

    public open override suspend fun proposal(request: QueryProposalRequest): QueryProposalResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.Proposal is unimplemented"))

    public open override suspend
        fun proposalsByGroupPolicy(request: QueryProposalsByGroupPolicyRequest):
        QueryProposalsByGroupPolicyResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.ProposalsByGroupPolicy is unimplemented"))

    public open override suspend fun voteByProposalVoter(request: QueryVoteByProposalVoterRequest):
        QueryVoteByProposalVoterResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.VoteByProposalVoter is unimplemented"))

    public open override suspend fun votesByProposal(request: QueryVotesByProposalRequest):
        QueryVotesByProposalResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.VotesByProposal is unimplemented"))

    public open override suspend fun votesByVoter(request: QueryVotesByVoterRequest):
        QueryVotesByVoterResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.VotesByVoter is unimplemented"))

    public open override suspend fun groupsByMember(request: QueryGroupsByMemberRequest):
        QueryGroupsByMemberResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.GroupsByMember is unimplemented"))

    public open override suspend fun tallyResult(request: QueryTallyResultRequest):
        QueryTallyResultResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.TallyResult is unimplemented"))

    public open override suspend fun groups(request: QueryGroupsRequest): QueryGroupsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Query.Groups is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = groupInfoDescriptor,
    				implementation = {
        QueryGroupInfoResponseJvmConverter.convert(groupInfo(QueryGroupInfoRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = groupPolicyInfoDescriptor,
    				implementation = {
        QueryGroupPolicyInfoResponseJvmConverter.convert(groupPolicyInfo(QueryGroupPolicyInfoRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = groupMembersDescriptor,
    				implementation = {
        QueryGroupMembersResponseJvmConverter.convert(groupMembers(QueryGroupMembersRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = groupsByAdminDescriptor,
    				implementation = {
        QueryGroupsByAdminResponseJvmConverter.convert(groupsByAdmin(QueryGroupsByAdminRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = groupPoliciesByGroupDescriptor,
    				implementation = {
        QueryGroupPoliciesByGroupResponseJvmConverter.convert(groupPoliciesByGroup(QueryGroupPoliciesByGroupRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = groupPoliciesByAdminDescriptor,
    				implementation = {
        QueryGroupPoliciesByAdminResponseJvmConverter.convert(groupPoliciesByAdmin(QueryGroupPoliciesByAdminRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = proposalDescriptor,
    				implementation = {
        QueryProposalResponseJvmConverter.convert(proposal(QueryProposalRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = proposalsByGroupPolicyDescriptor,
    				implementation = {
        QueryProposalsByGroupPolicyResponseJvmConverter.convert(proposalsByGroupPolicy(QueryProposalsByGroupPolicyRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = voteByProposalVoterDescriptor,
    				implementation = {
        QueryVoteByProposalVoterResponseJvmConverter.convert(voteByProposalVoter(QueryVoteByProposalVoterRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = votesByProposalDescriptor,
    				implementation = {
        QueryVotesByProposalResponseJvmConverter.convert(votesByProposal(QueryVotesByProposalRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = votesByVoterDescriptor,
    				implementation = {
        QueryVotesByVoterResponseJvmConverter.convert(votesByVoter(QueryVotesByVoterRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = groupsByMemberDescriptor,
    				implementation = {
        QueryGroupsByMemberResponseJvmConverter.convert(groupsByMember(QueryGroupsByMemberRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = tallyResultDescriptor,
    				implementation = {
        QueryTallyResultResponseJvmConverter.convert(tallyResult(QueryTallyResultRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = groupsDescriptor,
    				implementation = {
        QueryGroupsResponseJvmConverter.convert(groups(QueryGroupsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<Query.Client>(channel = option.channel, callOptions =
      option.callOptions), Query.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): Query.Client =
        Query.Client(ClientOption(channel, callOptions))

    public override suspend fun groupInfo(request: QueryGroupInfoRequest): QueryGroupInfoResponse =
        groupInfo(request, Metadata())

    public suspend fun groupInfo(request: QueryGroupInfoRequest, metadata: Metadata):
        QueryGroupInfoResponse = QueryGroupInfoResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, groupInfoDescriptor,
    			QueryGroupInfoRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun groupPolicyInfo(request: QueryGroupPolicyInfoRequest):
        QueryGroupPolicyInfoResponse = groupPolicyInfo(request, Metadata())

    public suspend fun groupPolicyInfo(request: QueryGroupPolicyInfoRequest, metadata: Metadata):
        QueryGroupPolicyInfoResponse = QueryGroupPolicyInfoResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, groupPolicyInfoDescriptor,
    			QueryGroupPolicyInfoRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun groupMembers(request: QueryGroupMembersRequest):
        QueryGroupMembersResponse = groupMembers(request, Metadata())

    public suspend fun groupMembers(request: QueryGroupMembersRequest, metadata: Metadata):
        QueryGroupMembersResponse = QueryGroupMembersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, groupMembersDescriptor,
    			QueryGroupMembersRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun groupsByAdmin(request: QueryGroupsByAdminRequest):
        QueryGroupsByAdminResponse = groupsByAdmin(request, Metadata())

    public suspend fun groupsByAdmin(request: QueryGroupsByAdminRequest, metadata: Metadata):
        QueryGroupsByAdminResponse = QueryGroupsByAdminResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, groupsByAdminDescriptor,
    			QueryGroupsByAdminRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun groupPoliciesByGroup(request: QueryGroupPoliciesByGroupRequest):
        QueryGroupPoliciesByGroupResponse = groupPoliciesByGroup(request, Metadata())

    public suspend fun groupPoliciesByGroup(request: QueryGroupPoliciesByGroupRequest,
        metadata: Metadata): QueryGroupPoliciesByGroupResponse =
        QueryGroupPoliciesByGroupResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, groupPoliciesByGroupDescriptor,
    			QueryGroupPoliciesByGroupRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun groupPoliciesByAdmin(request: QueryGroupPoliciesByAdminRequest):
        QueryGroupPoliciesByAdminResponse = groupPoliciesByAdmin(request, Metadata())

    public suspend fun groupPoliciesByAdmin(request: QueryGroupPoliciesByAdminRequest,
        metadata: Metadata): QueryGroupPoliciesByAdminResponse =
        QueryGroupPoliciesByAdminResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, groupPoliciesByAdminDescriptor,
    			QueryGroupPoliciesByAdminRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun proposal(request: QueryProposalRequest): QueryProposalResponse =
        proposal(request, Metadata())

    public suspend fun proposal(request: QueryProposalRequest, metadata: Metadata):
        QueryProposalResponse = QueryProposalResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, proposalDescriptor,
    			QueryProposalRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun proposalsByGroupPolicy(request: QueryProposalsByGroupPolicyRequest):
        QueryProposalsByGroupPolicyResponse = proposalsByGroupPolicy(request, Metadata())

    public suspend fun proposalsByGroupPolicy(request: QueryProposalsByGroupPolicyRequest,
        metadata: Metadata): QueryProposalsByGroupPolicyResponse =
        QueryProposalsByGroupPolicyResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, proposalsByGroupPolicyDescriptor,
    			QueryProposalsByGroupPolicyRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun voteByProposalVoter(request: QueryVoteByProposalVoterRequest):
        QueryVoteByProposalVoterResponse = voteByProposalVoter(request, Metadata())

    public suspend fun voteByProposalVoter(request: QueryVoteByProposalVoterRequest,
        metadata: Metadata): QueryVoteByProposalVoterResponse =
        QueryVoteByProposalVoterResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, voteByProposalVoterDescriptor,
    			QueryVoteByProposalVoterRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun votesByProposal(request: QueryVotesByProposalRequest):
        QueryVotesByProposalResponse = votesByProposal(request, Metadata())

    public suspend fun votesByProposal(request: QueryVotesByProposalRequest, metadata: Metadata):
        QueryVotesByProposalResponse = QueryVotesByProposalResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, votesByProposalDescriptor,
    			QueryVotesByProposalRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun votesByVoter(request: QueryVotesByVoterRequest):
        QueryVotesByVoterResponse = votesByVoter(request, Metadata())

    public suspend fun votesByVoter(request: QueryVotesByVoterRequest, metadata: Metadata):
        QueryVotesByVoterResponse = QueryVotesByVoterResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, votesByVoterDescriptor,
    			QueryVotesByVoterRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun groupsByMember(request: QueryGroupsByMemberRequest):
        QueryGroupsByMemberResponse = groupsByMember(request, Metadata())

    public suspend fun groupsByMember(request: QueryGroupsByMemberRequest, metadata: Metadata):
        QueryGroupsByMemberResponse = QueryGroupsByMemberResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, groupsByMemberDescriptor,
    			QueryGroupsByMemberRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun tallyResult(request: QueryTallyResultRequest):
        QueryTallyResultResponse = tallyResult(request, Metadata())

    public suspend fun tallyResult(request: QueryTallyResultRequest, metadata: Metadata):
        QueryTallyResultResponse = QueryTallyResultResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, tallyResultDescriptor,
    			QueryTallyResultRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun groups(request: QueryGroupsRequest): QueryGroupsResponse =
        groups(request, Metadata())

    public suspend fun groups(request: QueryGroupsRequest, metadata: Metadata): QueryGroupsResponse
        = QueryGroupsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, groupsDescriptor,
    			QueryGroupsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}

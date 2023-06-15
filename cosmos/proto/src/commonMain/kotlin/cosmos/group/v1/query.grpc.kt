// Transform from cosmos/group/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun groupInfo(request: QueryGroupInfoRequest): QueryGroupInfoResponse

    public suspend fun groupPolicyInfo(request: QueryGroupPolicyInfoRequest):
        QueryGroupPolicyInfoResponse

    public suspend fun groupMembers(request: QueryGroupMembersRequest): QueryGroupMembersResponse

    public suspend fun groupsByAdmin(request: QueryGroupsByAdminRequest): QueryGroupsByAdminResponse

    public suspend fun groupPoliciesByGroup(request: QueryGroupPoliciesByGroupRequest):
        QueryGroupPoliciesByGroupResponse

    public suspend fun groupPoliciesByAdmin(request: QueryGroupPoliciesByAdminRequest):
        QueryGroupPoliciesByAdminResponse

    public suspend fun proposal(request: QueryProposalRequest): QueryProposalResponse

    public suspend fun proposalsByGroupPolicy(request: QueryProposalsByGroupPolicyRequest):
        QueryProposalsByGroupPolicyResponse

    public suspend fun voteByProposalVoter(request: QueryVoteByProposalVoterRequest):
        QueryVoteByProposalVoterResponse

    public suspend fun votesByProposal(request: QueryVotesByProposalRequest):
        QueryVotesByProposalResponse

    public suspend fun votesByVoter(request: QueryVotesByVoterRequest): QueryVotesByVoterResponse

    public suspend fun groupsByMember(request: QueryGroupsByMemberRequest):
        QueryGroupsByMemberResponse

    public suspend fun tallyResult(request: QueryTallyResultRequest): QueryTallyResultResponse

    public suspend fun groups(request: QueryGroupsRequest): QueryGroupsResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}

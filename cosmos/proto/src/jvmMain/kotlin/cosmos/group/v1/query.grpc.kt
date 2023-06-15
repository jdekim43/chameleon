// Transform from cosmos/group/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun groupInfo(request: QueryGroupInfoRequest): QueryGroupInfoResponse

    public actual suspend fun groupPolicyInfo(request: QueryGroupPolicyInfoRequest):
        QueryGroupPolicyInfoResponse

    public actual suspend fun groupMembers(request: QueryGroupMembersRequest):
        QueryGroupMembersResponse

    public actual suspend fun groupsByAdmin(request: QueryGroupsByAdminRequest):
        QueryGroupsByAdminResponse

    public actual suspend fun groupPoliciesByGroup(request: QueryGroupPoliciesByGroupRequest):
        QueryGroupPoliciesByGroupResponse

    public actual suspend fun groupPoliciesByAdmin(request: QueryGroupPoliciesByAdminRequest):
        QueryGroupPoliciesByAdminResponse

    public actual suspend fun proposal(request: QueryProposalRequest): QueryProposalResponse

    public actual suspend fun proposalsByGroupPolicy(request: QueryProposalsByGroupPolicyRequest):
        QueryProposalsByGroupPolicyResponse

    public actual suspend fun voteByProposalVoter(request: QueryVoteByProposalVoterRequest):
        QueryVoteByProposalVoterResponse

    public actual suspend fun votesByProposal(request: QueryVotesByProposalRequest):
        QueryVotesByProposalResponse

    public actual suspend fun votesByVoter(request: QueryVotesByVoterRequest):
        QueryVotesByVoterResponse

    public actual suspend fun groupsByMember(request: QueryGroupsByMemberRequest):
        QueryGroupsByMemberResponse

    public actual suspend fun tallyResult(request: QueryTallyResultRequest):
        QueryTallyResultResponse

    public actual suspend fun groups(request: QueryGroupsRequest): QueryGroupsResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}

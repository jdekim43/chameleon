// Transform from cosmos/group/v1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public interface Interface {
    public suspend fun createGroup(request: MsgCreateGroup): MsgCreateGroupResponse

    public suspend fun updateGroupMembers(request: MsgUpdateGroupMembers):
        MsgUpdateGroupMembersResponse

    public suspend fun updateGroupAdmin(request: MsgUpdateGroupAdmin): MsgUpdateGroupAdminResponse

    public suspend fun updateGroupMetadata(request: MsgUpdateGroupMetadata):
        MsgUpdateGroupMetadataResponse

    public suspend fun createGroupPolicy(request: MsgCreateGroupPolicy):
        MsgCreateGroupPolicyResponse

    public suspend fun createGroupWithPolicy(request: MsgCreateGroupWithPolicy):
        MsgCreateGroupWithPolicyResponse

    public suspend fun updateGroupPolicyAdmin(request: MsgUpdateGroupPolicyAdmin):
        MsgUpdateGroupPolicyAdminResponse

    public suspend fun updateGroupPolicyDecisionPolicy(request: MsgUpdateGroupPolicyDecisionPolicy):
        MsgUpdateGroupPolicyDecisionPolicyResponse

    public suspend fun updateGroupPolicyMetadata(request: MsgUpdateGroupPolicyMetadata):
        MsgUpdateGroupPolicyMetadataResponse

    public suspend fun submitProposal(request: MsgSubmitProposal): MsgSubmitProposalResponse

    public suspend fun withdrawProposal(request: MsgWithdrawProposal): MsgWithdrawProposalResponse

    public suspend fun vote(request: MsgVote): MsgVoteResponse

    public suspend fun exec(request: MsgExec): MsgExecResponse

    public suspend fun leaveGroup(request: MsgLeaveGroup): MsgLeaveGroupResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}

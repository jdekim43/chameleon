// Transform from cosmos/group/v1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.v1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Msg : GrpcService<Msg.Interface, Msg.Server, Msg.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun createGroup(request: MsgCreateGroup): MsgCreateGroupResponse

    public actual suspend fun updateGroupMembers(request: MsgUpdateGroupMembers):
        MsgUpdateGroupMembersResponse

    public actual suspend fun updateGroupAdmin(request: MsgUpdateGroupAdmin):
        MsgUpdateGroupAdminResponse

    public actual suspend fun updateGroupMetadata(request: MsgUpdateGroupMetadata):
        MsgUpdateGroupMetadataResponse

    public actual suspend fun createGroupPolicy(request: MsgCreateGroupPolicy):
        MsgCreateGroupPolicyResponse

    public actual suspend fun createGroupWithPolicy(request: MsgCreateGroupWithPolicy):
        MsgCreateGroupWithPolicyResponse

    public actual suspend fun updateGroupPolicyAdmin(request: MsgUpdateGroupPolicyAdmin):
        MsgUpdateGroupPolicyAdminResponse

    public actual suspend
        fun updateGroupPolicyDecisionPolicy(request: MsgUpdateGroupPolicyDecisionPolicy):
        MsgUpdateGroupPolicyDecisionPolicyResponse

    public actual suspend fun updateGroupPolicyMetadata(request: MsgUpdateGroupPolicyMetadata):
        MsgUpdateGroupPolicyMetadataResponse

    public actual suspend fun submitProposal(request: MsgSubmitProposal): MsgSubmitProposalResponse

    public actual suspend fun withdrawProposal(request: MsgWithdrawProposal):
        MsgWithdrawProposalResponse

    public actual suspend fun vote(request: MsgVote): MsgVoteResponse

    public actual suspend fun exec(request: MsgExec): MsgExecResponse

    public actual suspend fun leaveGroup(request: MsgLeaveGroup): MsgLeaveGroupResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : MsgJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : MsgJvm.Client(option), Interface
}

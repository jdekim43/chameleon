// Transform from cosmos/group/v1/tx.proto
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

public object MsgJvm {
  private val descriptor: ServiceDescriptor = MsgGrpc.getServiceDescriptor()!!

  private val createGroupDescriptor: MethodDescriptor<Tx.MsgCreateGroup, Tx.MsgCreateGroupResponse>
      = MsgGrpc.getCreateGroupMethod()!!

  private val updateGroupMembersDescriptor:
      MethodDescriptor<Tx.MsgUpdateGroupMembers, Tx.MsgUpdateGroupMembersResponse> =
      MsgGrpc.getUpdateGroupMembersMethod()!!

  private val updateGroupAdminDescriptor:
      MethodDescriptor<Tx.MsgUpdateGroupAdmin, Tx.MsgUpdateGroupAdminResponse> =
      MsgGrpc.getUpdateGroupAdminMethod()!!

  private val updateGroupMetadataDescriptor:
      MethodDescriptor<Tx.MsgUpdateGroupMetadata, Tx.MsgUpdateGroupMetadataResponse> =
      MsgGrpc.getUpdateGroupMetadataMethod()!!

  private val createGroupPolicyDescriptor:
      MethodDescriptor<Tx.MsgCreateGroupPolicy, Tx.MsgCreateGroupPolicyResponse> =
      MsgGrpc.getCreateGroupPolicyMethod()!!

  private val createGroupWithPolicyDescriptor:
      MethodDescriptor<Tx.MsgCreateGroupWithPolicy, Tx.MsgCreateGroupWithPolicyResponse> =
      MsgGrpc.getCreateGroupWithPolicyMethod()!!

  private val updateGroupPolicyAdminDescriptor:
      MethodDescriptor<Tx.MsgUpdateGroupPolicyAdmin, Tx.MsgUpdateGroupPolicyAdminResponse> =
      MsgGrpc.getUpdateGroupPolicyAdminMethod()!!

  private val updateGroupPolicyDecisionPolicyDescriptor:
      MethodDescriptor<Tx.MsgUpdateGroupPolicyDecisionPolicy, Tx.MsgUpdateGroupPolicyDecisionPolicyResponse>
      = MsgGrpc.getUpdateGroupPolicyDecisionPolicyMethod()!!

  private val updateGroupPolicyMetadataDescriptor:
      MethodDescriptor<Tx.MsgUpdateGroupPolicyMetadata, Tx.MsgUpdateGroupPolicyMetadataResponse> =
      MsgGrpc.getUpdateGroupPolicyMetadataMethod()!!

  private val submitProposalDescriptor:
      MethodDescriptor<Tx.MsgSubmitProposal, Tx.MsgSubmitProposalResponse> =
      MsgGrpc.getSubmitProposalMethod()!!

  private val withdrawProposalDescriptor:
      MethodDescriptor<Tx.MsgWithdrawProposal, Tx.MsgWithdrawProposalResponse> =
      MsgGrpc.getWithdrawProposalMethod()!!

  private val voteDescriptor: MethodDescriptor<Tx.MsgVote, Tx.MsgVoteResponse> =
      MsgGrpc.getVoteMethod()!!

  private val execDescriptor: MethodDescriptor<Tx.MsgExec, Tx.MsgExecResponse> =
      MsgGrpc.getExecMethod()!!

  private val leaveGroupDescriptor: MethodDescriptor<Tx.MsgLeaveGroup, Tx.MsgLeaveGroupResponse> =
      MsgGrpc.getLeaveGroupMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun createGroup(request: MsgCreateGroup): MsgCreateGroupResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.CreateGroup is unimplemented"))

    public open override suspend fun updateGroupMembers(request: MsgUpdateGroupMembers):
        MsgUpdateGroupMembersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.UpdateGroupMembers is unimplemented"))

    public open override suspend fun updateGroupAdmin(request: MsgUpdateGroupAdmin):
        MsgUpdateGroupAdminResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.UpdateGroupAdmin is unimplemented"))

    public open override suspend fun updateGroupMetadata(request: MsgUpdateGroupMetadata):
        MsgUpdateGroupMetadataResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.UpdateGroupMetadata is unimplemented"))

    public open override suspend fun createGroupPolicy(request: MsgCreateGroupPolicy):
        MsgCreateGroupPolicyResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.CreateGroupPolicy is unimplemented"))

    public open override suspend fun createGroupWithPolicy(request: MsgCreateGroupWithPolicy):
        MsgCreateGroupWithPolicyResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.CreateGroupWithPolicy is unimplemented"))

    public open override suspend fun updateGroupPolicyAdmin(request: MsgUpdateGroupPolicyAdmin):
        MsgUpdateGroupPolicyAdminResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.UpdateGroupPolicyAdmin is unimplemented"))

    public open override suspend
        fun updateGroupPolicyDecisionPolicy(request: MsgUpdateGroupPolicyDecisionPolicy):
        MsgUpdateGroupPolicyDecisionPolicyResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.UpdateGroupPolicyDecisionPolicy is unimplemented"))

    public open override suspend
        fun updateGroupPolicyMetadata(request: MsgUpdateGroupPolicyMetadata):
        MsgUpdateGroupPolicyMetadataResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.UpdateGroupPolicyMetadata is unimplemented"))

    public open override suspend fun submitProposal(request: MsgSubmitProposal):
        MsgSubmitProposalResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.SubmitProposal is unimplemented"))

    public open override suspend fun withdrawProposal(request: MsgWithdrawProposal):
        MsgWithdrawProposalResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.WithdrawProposal is unimplemented"))

    public open override suspend fun vote(request: MsgVote): MsgVoteResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.Vote is unimplemented"))

    public open override suspend fun exec(request: MsgExec): MsgExecResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.Exec is unimplemented"))

    public open override suspend fun leaveGroup(request: MsgLeaveGroup): MsgLeaveGroupResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.group.v1.Msg.LeaveGroup is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createGroupDescriptor,
    				implementation = {
        MsgCreateGroupResponseJvmConverter.convert(createGroup(MsgCreateGroupJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateGroupMembersDescriptor,
    				implementation = {
        MsgUpdateGroupMembersResponseJvmConverter.convert(updateGroupMembers(MsgUpdateGroupMembersJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateGroupAdminDescriptor,
    				implementation = {
        MsgUpdateGroupAdminResponseJvmConverter.convert(updateGroupAdmin(MsgUpdateGroupAdminJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateGroupMetadataDescriptor,
    				implementation = {
        MsgUpdateGroupMetadataResponseJvmConverter.convert(updateGroupMetadata(MsgUpdateGroupMetadataJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createGroupPolicyDescriptor,
    				implementation = {
        MsgCreateGroupPolicyResponseJvmConverter.convert(createGroupPolicy(MsgCreateGroupPolicyJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createGroupWithPolicyDescriptor,
    				implementation = {
        MsgCreateGroupWithPolicyResponseJvmConverter.convert(createGroupWithPolicy(MsgCreateGroupWithPolicyJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateGroupPolicyAdminDescriptor,
    				implementation = {
        MsgUpdateGroupPolicyAdminResponseJvmConverter.convert(updateGroupPolicyAdmin(MsgUpdateGroupPolicyAdminJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateGroupPolicyDecisionPolicyDescriptor,
    				implementation = {
        MsgUpdateGroupPolicyDecisionPolicyResponseJvmConverter.convert(updateGroupPolicyDecisionPolicy(MsgUpdateGroupPolicyDecisionPolicyJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateGroupPolicyMetadataDescriptor,
    				implementation = {
        MsgUpdateGroupPolicyMetadataResponseJvmConverter.convert(updateGroupPolicyMetadata(MsgUpdateGroupPolicyMetadataJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = submitProposalDescriptor,
    				implementation = {
        MsgSubmitProposalResponseJvmConverter.convert(submitProposal(MsgSubmitProposalJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = withdrawProposalDescriptor,
    				implementation = {
        MsgWithdrawProposalResponseJvmConverter.convert(withdrawProposal(MsgWithdrawProposalJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = voteDescriptor,
    				implementation = {
        MsgVoteResponseJvmConverter.convert(vote(MsgVoteJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = execDescriptor,
    				implementation = {
        MsgExecResponseJvmConverter.convert(exec(MsgExecJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = leaveGroupDescriptor,
    				implementation = {
        MsgLeaveGroupResponseJvmConverter.convert(leaveGroup(MsgLeaveGroupJvmConverter.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<Msg.Client>(channel = option.channel, callOptions = option.callOptions),
      Msg.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): Msg.Client =
        Msg.Client(ClientOption(channel, callOptions))

    public override suspend fun createGroup(request: MsgCreateGroup): MsgCreateGroupResponse =
        createGroup(request, Metadata())

    public suspend fun createGroup(request: MsgCreateGroup, metadata: Metadata):
        MsgCreateGroupResponse = MsgCreateGroupResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, createGroupDescriptor,
    			MsgCreateGroupJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun updateGroupMembers(request: MsgUpdateGroupMembers):
        MsgUpdateGroupMembersResponse = updateGroupMembers(request, Metadata())

    public suspend fun updateGroupMembers(request: MsgUpdateGroupMembers, metadata: Metadata):
        MsgUpdateGroupMembersResponse = MsgUpdateGroupMembersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateGroupMembersDescriptor,
    			MsgUpdateGroupMembersJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun updateGroupAdmin(request: MsgUpdateGroupAdmin):
        MsgUpdateGroupAdminResponse = updateGroupAdmin(request, Metadata())

    public suspend fun updateGroupAdmin(request: MsgUpdateGroupAdmin, metadata: Metadata):
        MsgUpdateGroupAdminResponse = MsgUpdateGroupAdminResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateGroupAdminDescriptor,
    			MsgUpdateGroupAdminJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun updateGroupMetadata(request: MsgUpdateGroupMetadata):
        MsgUpdateGroupMetadataResponse = updateGroupMetadata(request, Metadata())

    public suspend fun updateGroupMetadata(request: MsgUpdateGroupMetadata, metadata: Metadata):
        MsgUpdateGroupMetadataResponse = MsgUpdateGroupMetadataResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateGroupMetadataDescriptor,
    			MsgUpdateGroupMetadataJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun createGroupPolicy(request: MsgCreateGroupPolicy):
        MsgCreateGroupPolicyResponse = createGroupPolicy(request, Metadata())

    public suspend fun createGroupPolicy(request: MsgCreateGroupPolicy, metadata: Metadata):
        MsgCreateGroupPolicyResponse = MsgCreateGroupPolicyResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, createGroupPolicyDescriptor,
    			MsgCreateGroupPolicyJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun createGroupWithPolicy(request: MsgCreateGroupWithPolicy):
        MsgCreateGroupWithPolicyResponse = createGroupWithPolicy(request, Metadata())

    public suspend fun createGroupWithPolicy(request: MsgCreateGroupWithPolicy, metadata: Metadata):
        MsgCreateGroupWithPolicyResponse = MsgCreateGroupWithPolicyResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, createGroupWithPolicyDescriptor,
    			MsgCreateGroupWithPolicyJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun updateGroupPolicyAdmin(request: MsgUpdateGroupPolicyAdmin):
        MsgUpdateGroupPolicyAdminResponse = updateGroupPolicyAdmin(request, Metadata())

    public suspend fun updateGroupPolicyAdmin(request: MsgUpdateGroupPolicyAdmin,
        metadata: Metadata): MsgUpdateGroupPolicyAdminResponse =
        MsgUpdateGroupPolicyAdminResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateGroupPolicyAdminDescriptor,
    			MsgUpdateGroupPolicyAdminJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun updateGroupPolicyDecisionPolicy(request: MsgUpdateGroupPolicyDecisionPolicy):
        MsgUpdateGroupPolicyDecisionPolicyResponse = updateGroupPolicyDecisionPolicy(request,
        Metadata())

    public suspend fun updateGroupPolicyDecisionPolicy(request: MsgUpdateGroupPolicyDecisionPolicy,
        metadata: Metadata): MsgUpdateGroupPolicyDecisionPolicyResponse =
        MsgUpdateGroupPolicyDecisionPolicyResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateGroupPolicyDecisionPolicyDescriptor,
    			MsgUpdateGroupPolicyDecisionPolicyJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun updateGroupPolicyMetadata(request: MsgUpdateGroupPolicyMetadata):
        MsgUpdateGroupPolicyMetadataResponse = updateGroupPolicyMetadata(request, Metadata())

    public suspend fun updateGroupPolicyMetadata(request: MsgUpdateGroupPolicyMetadata,
        metadata: Metadata): MsgUpdateGroupPolicyMetadataResponse =
        MsgUpdateGroupPolicyMetadataResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateGroupPolicyMetadataDescriptor,
    			MsgUpdateGroupPolicyMetadataJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun submitProposal(request: MsgSubmitProposal):
        MsgSubmitProposalResponse = submitProposal(request, Metadata())

    public suspend fun submitProposal(request: MsgSubmitProposal, metadata: Metadata):
        MsgSubmitProposalResponse = MsgSubmitProposalResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, submitProposalDescriptor,
    			MsgSubmitProposalJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun withdrawProposal(request: MsgWithdrawProposal):
        MsgWithdrawProposalResponse = withdrawProposal(request, Metadata())

    public suspend fun withdrawProposal(request: MsgWithdrawProposal, metadata: Metadata):
        MsgWithdrawProposalResponse = MsgWithdrawProposalResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, withdrawProposalDescriptor,
    			MsgWithdrawProposalJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun vote(request: MsgVote): MsgVoteResponse = vote(request, Metadata())

    public suspend fun vote(request: MsgVote, metadata: Metadata): MsgVoteResponse =
        MsgVoteResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, voteDescriptor,
    			MsgVoteJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun exec(request: MsgExec): MsgExecResponse = exec(request, Metadata())

    public suspend fun exec(request: MsgExec, metadata: Metadata): MsgExecResponse =
        MsgExecResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, execDescriptor,
    			MsgExecJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun leaveGroup(request: MsgLeaveGroup): MsgLeaveGroupResponse =
        leaveGroup(request, Metadata())

    public suspend fun leaveGroup(request: MsgLeaveGroup, metadata: Metadata): MsgLeaveGroupResponse
        = MsgLeaveGroupResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, leaveGroupDescriptor,
    			MsgLeaveGroupJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}

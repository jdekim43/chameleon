// Transform from cosmos/gov/v1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.gov.v1

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

  private val submitProposalDescriptor:
      MethodDescriptor<Tx.MsgSubmitProposal, Tx.MsgSubmitProposalResponse> =
      MsgGrpc.getSubmitProposalMethod()!!

  private val execLegacyContentDescriptor:
      MethodDescriptor<Tx.MsgExecLegacyContent, Tx.MsgExecLegacyContentResponse> =
      MsgGrpc.getExecLegacyContentMethod()!!

  private val voteDescriptor: MethodDescriptor<Tx.MsgVote, Tx.MsgVoteResponse> =
      MsgGrpc.getVoteMethod()!!

  private val voteWeightedDescriptor:
      MethodDescriptor<Tx.MsgVoteWeighted, Tx.MsgVoteWeightedResponse> =
      MsgGrpc.getVoteWeightedMethod()!!

  private val depositDescriptor: MethodDescriptor<Tx.MsgDeposit, Tx.MsgDepositResponse> =
      MsgGrpc.getDepositMethod()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateParams, Tx.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun submitProposal(request: MsgSubmitProposal):
        MsgSubmitProposalResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Msg.SubmitProposal is unimplemented"))

    public open override suspend fun execLegacyContent(request: MsgExecLegacyContent):
        MsgExecLegacyContentResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Msg.ExecLegacyContent is unimplemented"))

    public open override suspend fun vote(request: MsgVote): MsgVoteResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Msg.Vote is unimplemented"))

    public open override suspend fun voteWeighted(request: MsgVoteWeighted): MsgVoteWeightedResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Msg.VoteWeighted is unimplemented"))

    public open override suspend fun deposit(request: MsgDeposit): MsgDepositResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Msg.Deposit is unimplemented"))

    public open override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Msg.UpdateParams is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
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
    				descriptor = execLegacyContentDescriptor,
    				implementation = {
        MsgExecLegacyContentResponseJvmConverter.convert(execLegacyContent(MsgExecLegacyContentJvmConverter.convert(it)))
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
    				descriptor = voteWeightedDescriptor,
    				implementation = {
        MsgVoteWeightedResponseJvmConverter.convert(voteWeighted(MsgVoteWeightedJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = depositDescriptor,
    				implementation = {
        MsgDepositResponseJvmConverter.convert(deposit(MsgDepositJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateParamsDescriptor,
    				implementation = {
        MsgUpdateParamsResponseJvmConverter.convert(updateParams(MsgUpdateParamsJvmConverter.convert(it)))
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

    public override suspend fun execLegacyContent(request: MsgExecLegacyContent):
        MsgExecLegacyContentResponse = execLegacyContent(request, Metadata())

    public suspend fun execLegacyContent(request: MsgExecLegacyContent, metadata: Metadata):
        MsgExecLegacyContentResponse = MsgExecLegacyContentResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, execLegacyContentDescriptor,
    			MsgExecLegacyContentJvmConverter.convert(request),
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

    public override suspend fun voteWeighted(request: MsgVoteWeighted): MsgVoteWeightedResponse =
        voteWeighted(request, Metadata())

    public suspend fun voteWeighted(request: MsgVoteWeighted, metadata: Metadata):
        MsgVoteWeightedResponse = MsgVoteWeightedResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, voteWeightedDescriptor,
    			MsgVoteWeightedJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun deposit(request: MsgDeposit): MsgDepositResponse = deposit(request,
        Metadata())

    public suspend fun deposit(request: MsgDeposit, metadata: Metadata): MsgDepositResponse =
        MsgDepositResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, depositDescriptor,
    			MsgDepositJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse =
        updateParams(request, Metadata())

    public suspend fun updateParams(request: MsgUpdateParams, metadata: Metadata):
        MsgUpdateParamsResponse = MsgUpdateParamsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateParamsDescriptor,
    			MsgUpdateParamsJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}

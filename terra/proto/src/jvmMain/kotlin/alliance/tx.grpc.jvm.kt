// Transform from alliance/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package alliance

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

  private val delegateDescriptor: MethodDescriptor<Tx.MsgDelegate, Tx.MsgDelegateResponse> =
      MsgGrpc.getDelegateMethod()!!

  private val redelegateDescriptor: MethodDescriptor<Tx.MsgRedelegate, Tx.MsgRedelegateResponse> =
      MsgGrpc.getRedelegateMethod()!!

  private val undelegateDescriptor: MethodDescriptor<Tx.MsgUndelegate, Tx.MsgUndelegateResponse> =
      MsgGrpc.getUndelegateMethod()!!

  private val claimDelegationRewardsDescriptor:
      MethodDescriptor<Tx.MsgClaimDelegationRewards, Tx.MsgClaimDelegationRewardsResponse> =
      MsgGrpc.getClaimDelegationRewardsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun `delegate`(request: MsgDelegate): MsgDelegateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Msg.Delegate is unimplemented"))

    public open override suspend fun redelegate(request: MsgRedelegate): MsgRedelegateResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Msg.Redelegate is unimplemented"))

    public open override suspend fun undelegate(request: MsgUndelegate): MsgUndelegateResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Msg.Undelegate is unimplemented"))

    public open override suspend fun claimDelegationRewards(request: MsgClaimDelegationRewards):
        MsgClaimDelegationRewardsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method alliance.Msg.ClaimDelegationRewards is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = delegateDescriptor,
    				implementation = {
        MsgDelegateResponseJvmConverter.convert(`delegate`(MsgDelegateJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = redelegateDescriptor,
    				implementation = {
        MsgRedelegateResponseJvmConverter.convert(redelegate(MsgRedelegateJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = undelegateDescriptor,
    				implementation = {
        MsgUndelegateResponseJvmConverter.convert(undelegate(MsgUndelegateJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = claimDelegationRewardsDescriptor,
    				implementation = {
        MsgClaimDelegationRewardsResponseJvmConverter.convert(claimDelegationRewards(MsgClaimDelegationRewardsJvmConverter.convert(it)))
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

    public override suspend fun `delegate`(request: MsgDelegate): MsgDelegateResponse =
        `delegate`(request, Metadata())

    public suspend fun `delegate`(request: MsgDelegate, metadata: Metadata): MsgDelegateResponse =
        MsgDelegateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, delegateDescriptor,
    			MsgDelegateJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun redelegate(request: MsgRedelegate): MsgRedelegateResponse =
        redelegate(request, Metadata())

    public suspend fun redelegate(request: MsgRedelegate, metadata: Metadata): MsgRedelegateResponse
        = MsgRedelegateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, redelegateDescriptor,
    			MsgRedelegateJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun undelegate(request: MsgUndelegate): MsgUndelegateResponse =
        undelegate(request, Metadata())

    public suspend fun undelegate(request: MsgUndelegate, metadata: Metadata): MsgUndelegateResponse
        = MsgUndelegateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, undelegateDescriptor,
    			MsgUndelegateJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun claimDelegationRewards(request: MsgClaimDelegationRewards):
        MsgClaimDelegationRewardsResponse = claimDelegationRewards(request, Metadata())

    public suspend fun claimDelegationRewards(request: MsgClaimDelegationRewards,
        metadata: Metadata): MsgClaimDelegationRewardsResponse =
        MsgClaimDelegationRewardsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, claimDelegationRewardsDescriptor,
    			MsgClaimDelegationRewardsJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}

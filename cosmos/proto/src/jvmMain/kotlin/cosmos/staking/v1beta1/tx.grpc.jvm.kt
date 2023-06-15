// Transform from cosmos/staking/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

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

  private val createValidatorDescriptor:
      MethodDescriptor<Tx.MsgCreateValidator, Tx.MsgCreateValidatorResponse> =
      MsgGrpc.getCreateValidatorMethod()!!

  private val editValidatorDescriptor:
      MethodDescriptor<Tx.MsgEditValidator, Tx.MsgEditValidatorResponse> =
      MsgGrpc.getEditValidatorMethod()!!

  private val delegateDescriptor: MethodDescriptor<Tx.MsgDelegate, Tx.MsgDelegateResponse> =
      MsgGrpc.getDelegateMethod()!!

  private val beginRedelegateDescriptor:
      MethodDescriptor<Tx.MsgBeginRedelegate, Tx.MsgBeginRedelegateResponse> =
      MsgGrpc.getBeginRedelegateMethod()!!

  private val undelegateDescriptor: MethodDescriptor<Tx.MsgUndelegate, Tx.MsgUndelegateResponse> =
      MsgGrpc.getUndelegateMethod()!!

  private val cancelUnbondingDelegationDescriptor:
      MethodDescriptor<Tx.MsgCancelUnbondingDelegation, Tx.MsgCancelUnbondingDelegationResponse> =
      MsgGrpc.getCancelUnbondingDelegationMethod()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateParams, Tx.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun createValidator(request: MsgCreateValidator):
        MsgCreateValidatorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Msg.CreateValidator is unimplemented"))

    public open override suspend fun editValidator(request: MsgEditValidator):
        MsgEditValidatorResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Msg.EditValidator is unimplemented"))

    public open override suspend fun `delegate`(request: MsgDelegate): MsgDelegateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Msg.Delegate is unimplemented"))

    public open override suspend fun beginRedelegate(request: MsgBeginRedelegate):
        MsgBeginRedelegateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Msg.BeginRedelegate is unimplemented"))

    public open override suspend fun undelegate(request: MsgUndelegate): MsgUndelegateResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Msg.Undelegate is unimplemented"))

    public open override suspend
        fun cancelUnbondingDelegation(request: MsgCancelUnbondingDelegation):
        MsgCancelUnbondingDelegationResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Msg.CancelUnbondingDelegation is unimplemented"))

    public open override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.staking.v1beta1.Msg.UpdateParams is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createValidatorDescriptor,
    				implementation = {
        MsgCreateValidatorResponseJvmConverter.convert(createValidator(MsgCreateValidatorJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = editValidatorDescriptor,
    				implementation = {
        MsgEditValidatorResponseJvmConverter.convert(editValidator(MsgEditValidatorJvmConverter.convert(it)))
        },
    			)
    		)
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
    				descriptor = beginRedelegateDescriptor,
    				implementation = {
        MsgBeginRedelegateResponseJvmConverter.convert(beginRedelegate(MsgBeginRedelegateJvmConverter.convert(it)))
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
    				descriptor = cancelUnbondingDelegationDescriptor,
    				implementation = {
        MsgCancelUnbondingDelegationResponseJvmConverter.convert(cancelUnbondingDelegation(MsgCancelUnbondingDelegationJvmConverter.convert(it)))
        },
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

    public override suspend fun createValidator(request: MsgCreateValidator):
        MsgCreateValidatorResponse = createValidator(request, Metadata())

    public suspend fun createValidator(request: MsgCreateValidator, metadata: Metadata):
        MsgCreateValidatorResponse = MsgCreateValidatorResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, createValidatorDescriptor,
    			MsgCreateValidatorJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun editValidator(request: MsgEditValidator): MsgEditValidatorResponse =
        editValidator(request, Metadata())

    public suspend fun editValidator(request: MsgEditValidator, metadata: Metadata):
        MsgEditValidatorResponse = MsgEditValidatorResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, editValidatorDescriptor,
    			MsgEditValidatorJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

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

    public override suspend fun beginRedelegate(request: MsgBeginRedelegate):
        MsgBeginRedelegateResponse = beginRedelegate(request, Metadata())

    public suspend fun beginRedelegate(request: MsgBeginRedelegate, metadata: Metadata):
        MsgBeginRedelegateResponse = MsgBeginRedelegateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, beginRedelegateDescriptor,
    			MsgBeginRedelegateJvmConverter.convert(request),
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

    public override suspend fun cancelUnbondingDelegation(request: MsgCancelUnbondingDelegation):
        MsgCancelUnbondingDelegationResponse = cancelUnbondingDelegation(request, Metadata())

    public suspend fun cancelUnbondingDelegation(request: MsgCancelUnbondingDelegation,
        metadata: Metadata): MsgCancelUnbondingDelegationResponse =
        MsgCancelUnbondingDelegationResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, cancelUnbondingDelegationDescriptor,
    			MsgCancelUnbondingDelegationJvmConverter.convert(request),
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

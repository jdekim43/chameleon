// Transform from cosmos/vesting/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.vesting.v1beta1

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

  private val createVestingAccountDescriptor:
      MethodDescriptor<Tx.MsgCreateVestingAccount, Tx.MsgCreateVestingAccountResponse> =
      MsgGrpc.getCreateVestingAccountMethod()!!

  private val createPermanentLockedAccountDescriptor:
      MethodDescriptor<Tx.MsgCreatePermanentLockedAccount, Tx.MsgCreatePermanentLockedAccountResponse>
      = MsgGrpc.getCreatePermanentLockedAccountMethod()!!

  private val createPeriodicVestingAccountDescriptor:
      MethodDescriptor<Tx.MsgCreatePeriodicVestingAccount, Tx.MsgCreatePeriodicVestingAccountResponse>
      = MsgGrpc.getCreatePeriodicVestingAccountMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun createVestingAccount(request: MsgCreateVestingAccount):
        MsgCreateVestingAccountResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.vesting.v1beta1.Msg.CreateVestingAccount is unimplemented"))

    public open override suspend
        fun createPermanentLockedAccount(request: MsgCreatePermanentLockedAccount):
        MsgCreatePermanentLockedAccountResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.vesting.v1beta1.Msg.CreatePermanentLockedAccount is unimplemented"))

    public open override suspend
        fun createPeriodicVestingAccount(request: MsgCreatePeriodicVestingAccount):
        MsgCreatePeriodicVestingAccountResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.vesting.v1beta1.Msg.CreatePeriodicVestingAccount is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createVestingAccountDescriptor,
    				implementation = {
        MsgCreateVestingAccountResponseJvmConverter.convert(createVestingAccount(MsgCreateVestingAccountJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createPermanentLockedAccountDescriptor,
    				implementation = {
        MsgCreatePermanentLockedAccountResponseJvmConverter.convert(createPermanentLockedAccount(MsgCreatePermanentLockedAccountJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = createPeriodicVestingAccountDescriptor,
    				implementation = {
        MsgCreatePeriodicVestingAccountResponseJvmConverter.convert(createPeriodicVestingAccount(MsgCreatePeriodicVestingAccountJvmConverter.convert(it)))
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

    public override suspend fun createVestingAccount(request: MsgCreateVestingAccount):
        MsgCreateVestingAccountResponse = createVestingAccount(request, Metadata())

    public suspend fun createVestingAccount(request: MsgCreateVestingAccount, metadata: Metadata):
        MsgCreateVestingAccountResponse = MsgCreateVestingAccountResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, createVestingAccountDescriptor,
    			MsgCreateVestingAccountJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun createPermanentLockedAccount(request: MsgCreatePermanentLockedAccount):
        MsgCreatePermanentLockedAccountResponse = createPermanentLockedAccount(request, Metadata())

    public suspend fun createPermanentLockedAccount(request: MsgCreatePermanentLockedAccount,
        metadata: Metadata): MsgCreatePermanentLockedAccountResponse =
        MsgCreatePermanentLockedAccountResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, createPermanentLockedAccountDescriptor,
    			MsgCreatePermanentLockedAccountJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun createPeriodicVestingAccount(request: MsgCreatePeriodicVestingAccount):
        MsgCreatePeriodicVestingAccountResponse = createPeriodicVestingAccount(request, Metadata())

    public suspend fun createPeriodicVestingAccount(request: MsgCreatePeriodicVestingAccount,
        metadata: Metadata): MsgCreatePeriodicVestingAccountResponse =
        MsgCreatePeriodicVestingAccountResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, createPeriodicVestingAccountDescriptor,
    			MsgCreatePeriodicVestingAccountJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}

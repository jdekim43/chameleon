// Transform from cosmos/upgrade/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.upgrade.v1beta1

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

  private val softwareUpgradeDescriptor:
      MethodDescriptor<Tx.MsgSoftwareUpgrade, Tx.MsgSoftwareUpgradeResponse> =
      MsgGrpc.getSoftwareUpgradeMethod()!!

  private val cancelUpgradeDescriptor:
      MethodDescriptor<Tx.MsgCancelUpgrade, Tx.MsgCancelUpgradeResponse> =
      MsgGrpc.getCancelUpgradeMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun softwareUpgrade(request: MsgSoftwareUpgrade):
        MsgSoftwareUpgradeResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.upgrade.v1beta1.Msg.SoftwareUpgrade is unimplemented"))

    public open override suspend fun cancelUpgrade(request: MsgCancelUpgrade):
        MsgCancelUpgradeResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.upgrade.v1beta1.Msg.CancelUpgrade is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = softwareUpgradeDescriptor,
    				implementation = {
        MsgSoftwareUpgradeResponseJvmConverter.convert(softwareUpgrade(MsgSoftwareUpgradeJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = cancelUpgradeDescriptor,
    				implementation = {
        MsgCancelUpgradeResponseJvmConverter.convert(cancelUpgrade(MsgCancelUpgradeJvmConverter.convert(it)))
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

    public override suspend fun softwareUpgrade(request: MsgSoftwareUpgrade):
        MsgSoftwareUpgradeResponse = softwareUpgrade(request, Metadata())

    public suspend fun softwareUpgrade(request: MsgSoftwareUpgrade, metadata: Metadata):
        MsgSoftwareUpgradeResponse = MsgSoftwareUpgradeResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, softwareUpgradeDescriptor,
    			MsgSoftwareUpgradeJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun cancelUpgrade(request: MsgCancelUpgrade): MsgCancelUpgradeResponse =
        cancelUpgrade(request, Metadata())

    public suspend fun cancelUpgrade(request: MsgCancelUpgrade, metadata: Metadata):
        MsgCancelUpgradeResponse = MsgCancelUpgradeResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, cancelUpgradeDescriptor,
    			MsgCancelUpgradeJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}

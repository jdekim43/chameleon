// Transform from cosmos/evidence/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.evidence.v1beta1

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

  private val submitEvidenceDescriptor:
      MethodDescriptor<Tx.MsgSubmitEvidence, Tx.MsgSubmitEvidenceResponse> =
      MsgGrpc.getSubmitEvidenceMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun submitEvidence(request: MsgSubmitEvidence):
        MsgSubmitEvidenceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.evidence.v1beta1.Msg.SubmitEvidence is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = submitEvidenceDescriptor,
    				implementation = {
        MsgSubmitEvidenceResponseJvmConverter.convert(submitEvidence(MsgSubmitEvidenceJvmConverter.convert(it)))
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

    public override suspend fun submitEvidence(request: MsgSubmitEvidence):
        MsgSubmitEvidenceResponse = submitEvidence(request, Metadata())

    public suspend fun submitEvidence(request: MsgSubmitEvidence, metadata: Metadata):
        MsgSubmitEvidenceResponse = MsgSubmitEvidenceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, submitEvidenceDescriptor,
    			MsgSubmitEvidenceJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}

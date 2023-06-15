// Transform from cosmos/evidence/v1beta1/query.proto
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

public object QueryJvm {
  private val descriptor: ServiceDescriptor = QueryGrpc.getServiceDescriptor()!!

  private val evidenceDescriptor:
      MethodDescriptor<QueryOuterClass.QueryEvidenceRequest, QueryOuterClass.QueryEvidenceResponse>
      = QueryGrpc.getEvidenceMethod()!!

  private val allEvidenceDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllEvidenceRequest, QueryOuterClass.QueryAllEvidenceResponse>
      = QueryGrpc.getAllEvidenceMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun evidence(request: QueryEvidenceRequest): QueryEvidenceResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.evidence.v1beta1.Query.Evidence is unimplemented"))

    public open override suspend fun allEvidence(request: QueryAllEvidenceRequest):
        QueryAllEvidenceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.evidence.v1beta1.Query.AllEvidence is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = evidenceDescriptor,
    				implementation = {
        QueryEvidenceResponseJvmConverter.convert(evidence(QueryEvidenceRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allEvidenceDescriptor,
    				implementation = {
        QueryAllEvidenceResponseJvmConverter.convert(allEvidence(QueryAllEvidenceRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<Query.Client>(channel = option.channel, callOptions =
      option.callOptions), Query.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): Query.Client =
        Query.Client(ClientOption(channel, callOptions))

    public override suspend fun evidence(request: QueryEvidenceRequest): QueryEvidenceResponse =
        evidence(request, Metadata())

    public suspend fun evidence(request: QueryEvidenceRequest, metadata: Metadata):
        QueryEvidenceResponse = QueryEvidenceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, evidenceDescriptor,
    			QueryEvidenceRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun allEvidence(request: QueryAllEvidenceRequest):
        QueryAllEvidenceResponse = allEvidence(request, Metadata())

    public suspend fun allEvidence(request: QueryAllEvidenceRequest, metadata: Metadata):
        QueryAllEvidenceResponse = QueryAllEvidenceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, allEvidenceDescriptor,
    			QueryAllEvidenceRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}

// Transform from cosmos/mint/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.mint.v1beta1

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

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  private val inflationDescriptor:
      MethodDescriptor<QueryOuterClass.QueryInflationRequest, QueryOuterClass.QueryInflationResponse>
      = QueryGrpc.getInflationMethod()!!

  private val annualProvisionsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAnnualProvisionsRequest, QueryOuterClass.QueryAnnualProvisionsResponse>
      = QueryGrpc.getAnnualProvisionsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.mint.v1beta1.Query.Params is unimplemented"))

    public open override suspend fun inflation(request: QueryInflationRequest):
        QueryInflationResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.mint.v1beta1.Query.Inflation is unimplemented"))

    public open override suspend fun annualProvisions(request: QueryAnnualProvisionsRequest):
        QueryAnnualProvisionsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.mint.v1beta1.Query.AnnualProvisions is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = paramsDescriptor,
    				implementation = {
        QueryParamsResponseJvmConverter.convert(params(QueryParamsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = inflationDescriptor,
    				implementation = {
        QueryInflationResponseJvmConverter.convert(inflation(QueryInflationRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = annualProvisionsDescriptor,
    				implementation = {
        QueryAnnualProvisionsResponseJvmConverter.convert(annualProvisions(QueryAnnualProvisionsRequestJvmConverter.convert(it)))
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

    public override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        params(request, Metadata())

    public suspend fun params(request: QueryParamsRequest, metadata: Metadata): QueryParamsResponse
        = QueryParamsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, paramsDescriptor,
    			QueryParamsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun inflation(request: QueryInflationRequest): QueryInflationResponse =
        inflation(request, Metadata())

    public suspend fun inflation(request: QueryInflationRequest, metadata: Metadata):
        QueryInflationResponse = QueryInflationResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, inflationDescriptor,
    			QueryInflationRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun annualProvisions(request: QueryAnnualProvisionsRequest):
        QueryAnnualProvisionsResponse = annualProvisions(request, Metadata())

    public suspend fun annualProvisions(request: QueryAnnualProvisionsRequest, metadata: Metadata):
        QueryAnnualProvisionsResponse = QueryAnnualProvisionsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, annualProvisionsDescriptor,
    			QueryAnnualProvisionsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}

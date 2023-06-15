// Transform from cosmos/feegrant/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.feegrant.v1beta1

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

  private val allowanceDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllowanceRequest, QueryOuterClass.QueryAllowanceResponse>
      = QueryGrpc.getAllowanceMethod()!!

  private val allowancesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllowancesRequest, QueryOuterClass.QueryAllowancesResponse>
      = QueryGrpc.getAllowancesMethod()!!

  private val allowancesByGranterDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllowancesByGranterRequest, QueryOuterClass.QueryAllowancesByGranterResponse>
      = QueryGrpc.getAllowancesByGranterMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun allowance(request: QueryAllowanceRequest):
        QueryAllowanceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.feegrant.v1beta1.Query.Allowance is unimplemented"))

    public open override suspend fun allowances(request: QueryAllowancesRequest):
        QueryAllowancesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.feegrant.v1beta1.Query.Allowances is unimplemented"))

    public open override suspend fun allowancesByGranter(request: QueryAllowancesByGranterRequest):
        QueryAllowancesByGranterResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.feegrant.v1beta1.Query.AllowancesByGranter is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allowanceDescriptor,
    				implementation = {
        QueryAllowanceResponseJvmConverter.convert(allowance(QueryAllowanceRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allowancesDescriptor,
    				implementation = {
        QueryAllowancesResponseJvmConverter.convert(allowances(QueryAllowancesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = allowancesByGranterDescriptor,
    				implementation = {
        QueryAllowancesByGranterResponseJvmConverter.convert(allowancesByGranter(QueryAllowancesByGranterRequestJvmConverter.convert(it)))
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

    public override suspend fun allowance(request: QueryAllowanceRequest): QueryAllowanceResponse =
        allowance(request, Metadata())

    public suspend fun allowance(request: QueryAllowanceRequest, metadata: Metadata):
        QueryAllowanceResponse = QueryAllowanceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, allowanceDescriptor,
    			QueryAllowanceRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun allowances(request: QueryAllowancesRequest): QueryAllowancesResponse
        = allowances(request, Metadata())

    public suspend fun allowances(request: QueryAllowancesRequest, metadata: Metadata):
        QueryAllowancesResponse = QueryAllowancesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, allowancesDescriptor,
    			QueryAllowancesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun allowancesByGranter(request: QueryAllowancesByGranterRequest):
        QueryAllowancesByGranterResponse = allowancesByGranter(request, Metadata())

    public suspend fun allowancesByGranter(request: QueryAllowancesByGranterRequest,
        metadata: Metadata): QueryAllowancesByGranterResponse =
        QueryAllowancesByGranterResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, allowancesByGranterDescriptor,
    			QueryAllowancesByGranterRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}

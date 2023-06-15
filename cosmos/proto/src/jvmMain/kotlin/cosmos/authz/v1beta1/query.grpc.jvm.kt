// Transform from cosmos/authz/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.authz.v1beta1

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

  private val grantsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGrantsRequest, QueryOuterClass.QueryGrantsResponse> =
      QueryGrpc.getGrantsMethod()!!

  private val granterGrantsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGranterGrantsRequest, QueryOuterClass.QueryGranterGrantsResponse>
      = QueryGrpc.getGranterGrantsMethod()!!

  private val granteeGrantsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGranteeGrantsRequest, QueryOuterClass.QueryGranteeGrantsResponse>
      = QueryGrpc.getGranteeGrantsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun grants(request: QueryGrantsRequest): QueryGrantsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.authz.v1beta1.Query.Grants is unimplemented"))

    public open override suspend fun granterGrants(request: QueryGranterGrantsRequest):
        QueryGranterGrantsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.authz.v1beta1.Query.GranterGrants is unimplemented"))

    public open override suspend fun granteeGrants(request: QueryGranteeGrantsRequest):
        QueryGranteeGrantsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.authz.v1beta1.Query.GranteeGrants is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = grantsDescriptor,
    				implementation = {
        QueryGrantsResponseJvmConverter.convert(grants(QueryGrantsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = granterGrantsDescriptor,
    				implementation = {
        QueryGranterGrantsResponseJvmConverter.convert(granterGrants(QueryGranterGrantsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = granteeGrantsDescriptor,
    				implementation = {
        QueryGranteeGrantsResponseJvmConverter.convert(granteeGrants(QueryGranteeGrantsRequestJvmConverter.convert(it)))
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

    public override suspend fun grants(request: QueryGrantsRequest): QueryGrantsResponse =
        grants(request, Metadata())

    public suspend fun grants(request: QueryGrantsRequest, metadata: Metadata): QueryGrantsResponse
        = QueryGrantsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, grantsDescriptor,
    			QueryGrantsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun granterGrants(request: QueryGranterGrantsRequest):
        QueryGranterGrantsResponse = granterGrants(request, Metadata())

    public suspend fun granterGrants(request: QueryGranterGrantsRequest, metadata: Metadata):
        QueryGranterGrantsResponse = QueryGranterGrantsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, granterGrantsDescriptor,
    			QueryGranterGrantsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun granteeGrants(request: QueryGranteeGrantsRequest):
        QueryGranteeGrantsResponse = granteeGrants(request, Metadata())

    public suspend fun granteeGrants(request: QueryGranteeGrantsRequest, metadata: Metadata):
        QueryGranteeGrantsResponse = QueryGranteeGrantsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, granteeGrantsDescriptor,
    			QueryGranteeGrantsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}

// Transform from cosmos/nft/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.nft.v1beta1

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

  private val balanceDescriptor:
      MethodDescriptor<QueryOuterClass.QueryBalanceRequest, QueryOuterClass.QueryBalanceResponse> =
      QueryGrpc.getBalanceMethod()!!

  private val ownerDescriptor:
      MethodDescriptor<QueryOuterClass.QueryOwnerRequest, QueryOuterClass.QueryOwnerResponse> =
      QueryGrpc.getOwnerMethod()!!

  private val supplyDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySupplyRequest, QueryOuterClass.QuerySupplyResponse> =
      QueryGrpc.getSupplyMethod()!!

  private val nFTsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryNFTsRequest, QueryOuterClass.QueryNFTsResponse> =
      QueryGrpc.getNFTsMethod()!!

  private val nFTDescriptor:
      MethodDescriptor<QueryOuterClass.QueryNFTRequest, QueryOuterClass.QueryNFTResponse> =
      QueryGrpc.getNFTMethod()!!

  private val classDescriptor:
      MethodDescriptor<QueryOuterClass.QueryClassRequest, QueryOuterClass.QueryClassResponse> =
      QueryGrpc.getClassMethod()!!

  private val classesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryClassesRequest, QueryOuterClass.QueryClassesResponse> =
      QueryGrpc.getClassesMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun balance(request: QueryBalanceRequest): QueryBalanceResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.nft.v1beta1.Query.Balance is unimplemented"))

    public open override suspend fun owner(request: QueryOwnerRequest): QueryOwnerResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.nft.v1beta1.Query.Owner is unimplemented"))

    public open override suspend fun supply(request: QuerySupplyRequest): QuerySupplyResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.nft.v1beta1.Query.Supply is unimplemented"))

    public open override suspend fun nFTs(request: QueryNFTsRequest): QueryNFTsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.nft.v1beta1.Query.NFTs is unimplemented"))

    public open override suspend fun nFT(request: QueryNFTRequest): QueryNFTResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.nft.v1beta1.Query.NFT is unimplemented"))

    public open override suspend fun `class`(request: QueryClassRequest): QueryClassResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.nft.v1beta1.Query.Class is unimplemented"))

    public open override suspend fun classes(request: QueryClassesRequest): QueryClassesResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.nft.v1beta1.Query.Classes is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = balanceDescriptor,
    				implementation = {
        QueryBalanceResponseJvmConverter.convert(balance(QueryBalanceRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = ownerDescriptor,
    				implementation = {
        QueryOwnerResponseJvmConverter.convert(owner(QueryOwnerRequestJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = supplyDescriptor,
    				implementation = {
        QuerySupplyResponseJvmConverter.convert(supply(QuerySupplyRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = nFTsDescriptor,
    				implementation = {
        QueryNFTsResponseJvmConverter.convert(nFTs(QueryNFTsRequestJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = nFTDescriptor,
    				implementation = {
        QueryNFTResponseJvmConverter.convert(nFT(QueryNFTRequestJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = classDescriptor,
    				implementation = {
        QueryClassResponseJvmConverter.convert(`class`(QueryClassRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = classesDescriptor,
    				implementation = {
        QueryClassesResponseJvmConverter.convert(classes(QueryClassesRequestJvmConverter.convert(it)))
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

    public override suspend fun balance(request: QueryBalanceRequest): QueryBalanceResponse =
        balance(request, Metadata())

    public suspend fun balance(request: QueryBalanceRequest, metadata: Metadata):
        QueryBalanceResponse = QueryBalanceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, balanceDescriptor,
    			QueryBalanceRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun owner(request: QueryOwnerRequest): QueryOwnerResponse =
        owner(request, Metadata())

    public suspend fun owner(request: QueryOwnerRequest, metadata: Metadata): QueryOwnerResponse =
        QueryOwnerResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, ownerDescriptor,
    			QueryOwnerRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun supply(request: QuerySupplyRequest): QuerySupplyResponse =
        supply(request, Metadata())

    public suspend fun supply(request: QuerySupplyRequest, metadata: Metadata): QuerySupplyResponse
        = QuerySupplyResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, supplyDescriptor,
    			QuerySupplyRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun nFTs(request: QueryNFTsRequest): QueryNFTsResponse = nFTs(request,
        Metadata())

    public suspend fun nFTs(request: QueryNFTsRequest, metadata: Metadata): QueryNFTsResponse =
        QueryNFTsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, nFTsDescriptor,
    			QueryNFTsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun nFT(request: QueryNFTRequest): QueryNFTResponse = nFT(request,
        Metadata())

    public suspend fun nFT(request: QueryNFTRequest, metadata: Metadata): QueryNFTResponse =
        QueryNFTResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, nFTDescriptor,
    			QueryNFTRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun `class`(request: QueryClassRequest): QueryClassResponse =
        `class`(request, Metadata())

    public suspend fun `class`(request: QueryClassRequest, metadata: Metadata): QueryClassResponse =
        QueryClassResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, classDescriptor,
    			QueryClassRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun classes(request: QueryClassesRequest): QueryClassesResponse =
        classes(request, Metadata())

    public suspend fun classes(request: QueryClassesRequest, metadata: Metadata):
        QueryClassesResponse = QueryClassesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, classesDescriptor,
    			QueryClassesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}

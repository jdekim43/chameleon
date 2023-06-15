// Transform from cosmos/bank/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

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

  private val allBalancesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllBalancesRequest, QueryOuterClass.QueryAllBalancesResponse>
      = QueryGrpc.getAllBalancesMethod()!!

  private val spendableBalancesDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySpendableBalancesRequest, QueryOuterClass.QuerySpendableBalancesResponse>
      = QueryGrpc.getSpendableBalancesMethod()!!

  private val spendableBalanceByDenomDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySpendableBalanceByDenomRequest, QueryOuterClass.QuerySpendableBalanceByDenomResponse>
      = QueryGrpc.getSpendableBalanceByDenomMethod()!!

  private val totalSupplyDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTotalSupplyRequest, QueryOuterClass.QueryTotalSupplyResponse>
      = QueryGrpc.getTotalSupplyMethod()!!

  private val supplyOfDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySupplyOfRequest, QueryOuterClass.QuerySupplyOfResponse>
      = QueryGrpc.getSupplyOfMethod()!!

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  private val denomMetadataDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDenomMetadataRequest, QueryOuterClass.QueryDenomMetadataResponse>
      = QueryGrpc.getDenomMetadataMethod()!!

  private val denomsMetadataDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDenomsMetadataRequest, QueryOuterClass.QueryDenomsMetadataResponse>
      = QueryGrpc.getDenomsMetadataMethod()!!

  private val denomOwnersDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDenomOwnersRequest, QueryOuterClass.QueryDenomOwnersResponse>
      = QueryGrpc.getDenomOwnersMethod()!!

  private val sendEnabledDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySendEnabledRequest, QueryOuterClass.QuerySendEnabledResponse>
      = QueryGrpc.getSendEnabledMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun balance(request: QueryBalanceRequest): QueryBalanceResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.Balance is unimplemented"))

    public open override suspend fun allBalances(request: QueryAllBalancesRequest):
        QueryAllBalancesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.AllBalances is unimplemented"))

    public open override suspend fun spendableBalances(request: QuerySpendableBalancesRequest):
        QuerySpendableBalancesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.SpendableBalances is unimplemented"))

    public open override suspend
        fun spendableBalanceByDenom(request: QuerySpendableBalanceByDenomRequest):
        QuerySpendableBalanceByDenomResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.SpendableBalanceByDenom is unimplemented"))

    public open override suspend fun totalSupply(request: QueryTotalSupplyRequest):
        QueryTotalSupplyResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.TotalSupply is unimplemented"))

    public open override suspend fun supplyOf(request: QuerySupplyOfRequest): QuerySupplyOfResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.SupplyOf is unimplemented"))

    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.Params is unimplemented"))

    public open override suspend fun denomMetadata(request: QueryDenomMetadataRequest):
        QueryDenomMetadataResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.DenomMetadata is unimplemented"))

    public open override suspend fun denomsMetadata(request: QueryDenomsMetadataRequest):
        QueryDenomsMetadataResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.DenomsMetadata is unimplemented"))

    public open override suspend fun denomOwners(request: QueryDenomOwnersRequest):
        QueryDenomOwnersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.DenomOwners is unimplemented"))

    public open override suspend fun sendEnabled(request: QuerySendEnabledRequest):
        QuerySendEnabledResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.bank.v1beta1.Query.SendEnabled is unimplemented"))

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
    				descriptor = allBalancesDescriptor,
    				implementation = {
        QueryAllBalancesResponseJvmConverter.convert(allBalances(QueryAllBalancesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = spendableBalancesDescriptor,
    				implementation = {
        QuerySpendableBalancesResponseJvmConverter.convert(spendableBalances(QuerySpendableBalancesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = spendableBalanceByDenomDescriptor,
    				implementation = {
        QuerySpendableBalanceByDenomResponseJvmConverter.convert(spendableBalanceByDenom(QuerySpendableBalanceByDenomRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = totalSupplyDescriptor,
    				implementation = {
        QueryTotalSupplyResponseJvmConverter.convert(totalSupply(QueryTotalSupplyRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = supplyOfDescriptor,
    				implementation = {
        QuerySupplyOfResponseJvmConverter.convert(supplyOf(QuerySupplyOfRequestJvmConverter.convert(it)))
        },
    			)
    		)
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
    				descriptor = denomMetadataDescriptor,
    				implementation = {
        QueryDenomMetadataResponseJvmConverter.convert(denomMetadata(QueryDenomMetadataRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = denomsMetadataDescriptor,
    				implementation = {
        QueryDenomsMetadataResponseJvmConverter.convert(denomsMetadata(QueryDenomsMetadataRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = denomOwnersDescriptor,
    				implementation = {
        QueryDenomOwnersResponseJvmConverter.convert(denomOwners(QueryDenomOwnersRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = sendEnabledDescriptor,
    				implementation = {
        QuerySendEnabledResponseJvmConverter.convert(sendEnabled(QuerySendEnabledRequestJvmConverter.convert(it)))
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

    public override suspend fun allBalances(request: QueryAllBalancesRequest):
        QueryAllBalancesResponse = allBalances(request, Metadata())

    public suspend fun allBalances(request: QueryAllBalancesRequest, metadata: Metadata):
        QueryAllBalancesResponse = QueryAllBalancesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, allBalancesDescriptor,
    			QueryAllBalancesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun spendableBalances(request: QuerySpendableBalancesRequest):
        QuerySpendableBalancesResponse = spendableBalances(request, Metadata())

    public suspend fun spendableBalances(request: QuerySpendableBalancesRequest,
        metadata: Metadata): QuerySpendableBalancesResponse =
        QuerySpendableBalancesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, spendableBalancesDescriptor,
    			QuerySpendableBalancesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun spendableBalanceByDenom(request: QuerySpendableBalanceByDenomRequest):
        QuerySpendableBalanceByDenomResponse = spendableBalanceByDenom(request, Metadata())

    public suspend fun spendableBalanceByDenom(request: QuerySpendableBalanceByDenomRequest,
        metadata: Metadata): QuerySpendableBalanceByDenomResponse =
        QuerySpendableBalanceByDenomResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, spendableBalanceByDenomDescriptor,
    			QuerySpendableBalanceByDenomRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun totalSupply(request: QueryTotalSupplyRequest):
        QueryTotalSupplyResponse = totalSupply(request, Metadata())

    public suspend fun totalSupply(request: QueryTotalSupplyRequest, metadata: Metadata):
        QueryTotalSupplyResponse = QueryTotalSupplyResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, totalSupplyDescriptor,
    			QueryTotalSupplyRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun supplyOf(request: QuerySupplyOfRequest): QuerySupplyOfResponse =
        supplyOf(request, Metadata())

    public suspend fun supplyOf(request: QuerySupplyOfRequest, metadata: Metadata):
        QuerySupplyOfResponse = QuerySupplyOfResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, supplyOfDescriptor,
    			QuerySupplyOfRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

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

    public override suspend fun denomMetadata(request: QueryDenomMetadataRequest):
        QueryDenomMetadataResponse = denomMetadata(request, Metadata())

    public suspend fun denomMetadata(request: QueryDenomMetadataRequest, metadata: Metadata):
        QueryDenomMetadataResponse = QueryDenomMetadataResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, denomMetadataDescriptor,
    			QueryDenomMetadataRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun denomsMetadata(request: QueryDenomsMetadataRequest):
        QueryDenomsMetadataResponse = denomsMetadata(request, Metadata())

    public suspend fun denomsMetadata(request: QueryDenomsMetadataRequest, metadata: Metadata):
        QueryDenomsMetadataResponse = QueryDenomsMetadataResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, denomsMetadataDescriptor,
    			QueryDenomsMetadataRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun denomOwners(request: QueryDenomOwnersRequest):
        QueryDenomOwnersResponse = denomOwners(request, Metadata())

    public suspend fun denomOwners(request: QueryDenomOwnersRequest, metadata: Metadata):
        QueryDenomOwnersResponse = QueryDenomOwnersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, denomOwnersDescriptor,
    			QueryDenomOwnersRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun sendEnabled(request: QuerySendEnabledRequest):
        QuerySendEnabledResponse = sendEnabled(request, Metadata())

    public suspend fun sendEnabled(request: QuerySendEnabledRequest, metadata: Metadata):
        QuerySendEnabledResponse = QuerySendEnabledResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, sendEnabledDescriptor,
    			QuerySendEnabledRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}

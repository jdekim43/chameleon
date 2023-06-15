// Transform from oracle/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.oracle

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

  private val exchangeRateDescriptor:
      MethodDescriptor<QueryOuterClass.QueryExchangeRateRequest, QueryOuterClass.QueryExchangeRateResponse>
      = QueryGrpc.getExchangeRateMethod()!!

  private val exchangeRatesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryExchangeRatesRequest, QueryOuterClass.QueryExchangeRatesResponse>
      = QueryGrpc.getExchangeRatesMethod()!!

  private val activesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryActivesRequest, QueryOuterClass.QueryActivesResponse> =
      QueryGrpc.getActivesMethod()!!

  private val voteTargetsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryVoteTargetsRequest, QueryOuterClass.QueryVoteTargetsResponse>
      = QueryGrpc.getVoteTargetsMethod()!!

  private val priceSnapshotHistoryDescriptor:
      MethodDescriptor<QueryOuterClass.QueryPriceSnapshotHistoryRequest, QueryOuterClass.QueryPriceSnapshotHistoryResponse>
      = QueryGrpc.getPriceSnapshotHistoryMethod()!!

  private val twapsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTwapsRequest, QueryOuterClass.QueryTwapsResponse> =
      QueryGrpc.getTwapsMethod()!!

  private val feederDelegationDescriptor:
      MethodDescriptor<QueryOuterClass.QueryFeederDelegationRequest, QueryOuterClass.QueryFeederDelegationResponse>
      = QueryGrpc.getFeederDelegationMethod()!!

  private val votePenaltyCounterDescriptor:
      MethodDescriptor<QueryOuterClass.QueryVotePenaltyCounterRequest, QueryOuterClass.QueryVotePenaltyCounterResponse>
      = QueryGrpc.getVotePenaltyCounterMethod()!!

  private val slashWindowDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySlashWindowRequest, QueryOuterClass.QuerySlashWindowResponse>
      = QueryGrpc.getSlashWindowMethod()!!

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun exchangeRate(request: QueryExchangeRateRequest):
        QueryExchangeRateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.oracle.Query.ExchangeRate is unimplemented"))

    public open override suspend fun exchangeRates(request: QueryExchangeRatesRequest):
        QueryExchangeRatesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.oracle.Query.ExchangeRates is unimplemented"))

    public open override suspend fun actives(request: QueryActivesRequest): QueryActivesResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.oracle.Query.Actives is unimplemented"))

    public open override suspend fun voteTargets(request: QueryVoteTargetsRequest):
        QueryVoteTargetsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.oracle.Query.VoteTargets is unimplemented"))

    public open override suspend
        fun priceSnapshotHistory(request: QueryPriceSnapshotHistoryRequest):
        QueryPriceSnapshotHistoryResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.oracle.Query.PriceSnapshotHistory is unimplemented"))

    public open override suspend fun twaps(request: QueryTwapsRequest): QueryTwapsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.oracle.Query.Twaps is unimplemented"))

    public open override suspend fun feederDelegation(request: QueryFeederDelegationRequest):
        QueryFeederDelegationResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.oracle.Query.FeederDelegation is unimplemented"))

    public open override suspend fun votePenaltyCounter(request: QueryVotePenaltyCounterRequest):
        QueryVotePenaltyCounterResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.oracle.Query.VotePenaltyCounter is unimplemented"))

    public open override suspend fun slashWindow(request: QuerySlashWindowRequest):
        QuerySlashWindowResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.oracle.Query.SlashWindow is unimplemented"))

    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.oracle.Query.Params is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = exchangeRateDescriptor,
    				implementation = {
        QueryExchangeRateResponseJvmConverter.convert(exchangeRate(QueryExchangeRateRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = exchangeRatesDescriptor,
    				implementation = {
        QueryExchangeRatesResponseJvmConverter.convert(exchangeRates(QueryExchangeRatesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = activesDescriptor,
    				implementation = {
        QueryActivesResponseJvmConverter.convert(actives(QueryActivesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = voteTargetsDescriptor,
    				implementation = {
        QueryVoteTargetsResponseJvmConverter.convert(voteTargets(QueryVoteTargetsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = priceSnapshotHistoryDescriptor,
    				implementation = {
        QueryPriceSnapshotHistoryResponseJvmConverter.convert(priceSnapshotHistory(QueryPriceSnapshotHistoryRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = twapsDescriptor,
    				implementation = {
        QueryTwapsResponseJvmConverter.convert(twaps(QueryTwapsRequestJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = feederDelegationDescriptor,
    				implementation = {
        QueryFeederDelegationResponseJvmConverter.convert(feederDelegation(QueryFeederDelegationRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = votePenaltyCounterDescriptor,
    				implementation = {
        QueryVotePenaltyCounterResponseJvmConverter.convert(votePenaltyCounter(QueryVotePenaltyCounterRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = slashWindowDescriptor,
    				implementation = {
        QuerySlashWindowResponseJvmConverter.convert(slashWindow(QuerySlashWindowRequestJvmConverter.convert(it)))
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
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<Query.Client>(channel = option.channel, callOptions =
      option.callOptions), Query.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): Query.Client =
        Query.Client(ClientOption(channel, callOptions))

    public override suspend fun exchangeRate(request: QueryExchangeRateRequest):
        QueryExchangeRateResponse = exchangeRate(request, Metadata())

    public suspend fun exchangeRate(request: QueryExchangeRateRequest, metadata: Metadata):
        QueryExchangeRateResponse = QueryExchangeRateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, exchangeRateDescriptor,
    			QueryExchangeRateRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun exchangeRates(request: QueryExchangeRatesRequest):
        QueryExchangeRatesResponse = exchangeRates(request, Metadata())

    public suspend fun exchangeRates(request: QueryExchangeRatesRequest, metadata: Metadata):
        QueryExchangeRatesResponse = QueryExchangeRatesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, exchangeRatesDescriptor,
    			QueryExchangeRatesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun actives(request: QueryActivesRequest): QueryActivesResponse =
        actives(request, Metadata())

    public suspend fun actives(request: QueryActivesRequest, metadata: Metadata):
        QueryActivesResponse = QueryActivesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, activesDescriptor,
    			QueryActivesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun voteTargets(request: QueryVoteTargetsRequest):
        QueryVoteTargetsResponse = voteTargets(request, Metadata())

    public suspend fun voteTargets(request: QueryVoteTargetsRequest, metadata: Metadata):
        QueryVoteTargetsResponse = QueryVoteTargetsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, voteTargetsDescriptor,
    			QueryVoteTargetsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun priceSnapshotHistory(request: QueryPriceSnapshotHistoryRequest):
        QueryPriceSnapshotHistoryResponse = priceSnapshotHistory(request, Metadata())

    public suspend fun priceSnapshotHistory(request: QueryPriceSnapshotHistoryRequest,
        metadata: Metadata): QueryPriceSnapshotHistoryResponse =
        QueryPriceSnapshotHistoryResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, priceSnapshotHistoryDescriptor,
    			QueryPriceSnapshotHistoryRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun twaps(request: QueryTwapsRequest): QueryTwapsResponse =
        twaps(request, Metadata())

    public suspend fun twaps(request: QueryTwapsRequest, metadata: Metadata): QueryTwapsResponse =
        QueryTwapsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, twapsDescriptor,
    			QueryTwapsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun feederDelegation(request: QueryFeederDelegationRequest):
        QueryFeederDelegationResponse = feederDelegation(request, Metadata())

    public suspend fun feederDelegation(request: QueryFeederDelegationRequest, metadata: Metadata):
        QueryFeederDelegationResponse = QueryFeederDelegationResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, feederDelegationDescriptor,
    			QueryFeederDelegationRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun votePenaltyCounter(request: QueryVotePenaltyCounterRequest):
        QueryVotePenaltyCounterResponse = votePenaltyCounter(request, Metadata())

    public suspend fun votePenaltyCounter(request: QueryVotePenaltyCounterRequest,
        metadata: Metadata): QueryVotePenaltyCounterResponse =
        QueryVotePenaltyCounterResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, votePenaltyCounterDescriptor,
    			QueryVotePenaltyCounterRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun slashWindow(request: QuerySlashWindowRequest):
        QuerySlashWindowResponse = slashWindow(request, Metadata())

    public suspend fun slashWindow(request: QuerySlashWindowRequest, metadata: Metadata):
        QuerySlashWindowResponse = QuerySlashWindowResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, slashWindowDescriptor,
    			QuerySlashWindowRequestJvmConverter.convert(request),
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
  }
}

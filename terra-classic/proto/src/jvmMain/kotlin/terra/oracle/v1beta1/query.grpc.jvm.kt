// Transform from terra/oracle/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package terra.oracle.v1beta1

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

  private val tobinTaxDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTobinTaxRequest, QueryOuterClass.QueryTobinTaxResponse>
      = QueryGrpc.getTobinTaxMethod()!!

  private val tobinTaxesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTobinTaxesRequest, QueryOuterClass.QueryTobinTaxesResponse>
      = QueryGrpc.getTobinTaxesMethod()!!

  private val activesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryActivesRequest, QueryOuterClass.QueryActivesResponse> =
      QueryGrpc.getActivesMethod()!!

  private val voteTargetsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryVoteTargetsRequest, QueryOuterClass.QueryVoteTargetsResponse>
      = QueryGrpc.getVoteTargetsMethod()!!

  private val feederDelegationDescriptor:
      MethodDescriptor<QueryOuterClass.QueryFeederDelegationRequest, QueryOuterClass.QueryFeederDelegationResponse>
      = QueryGrpc.getFeederDelegationMethod()!!

  private val missCounterDescriptor:
      MethodDescriptor<QueryOuterClass.QueryMissCounterRequest, QueryOuterClass.QueryMissCounterResponse>
      = QueryGrpc.getMissCounterMethod()!!

  private val aggregatePrevoteDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAggregatePrevoteRequest, QueryOuterClass.QueryAggregatePrevoteResponse>
      = QueryGrpc.getAggregatePrevoteMethod()!!

  private val aggregatePrevotesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAggregatePrevotesRequest, QueryOuterClass.QueryAggregatePrevotesResponse>
      = QueryGrpc.getAggregatePrevotesMethod()!!

  private val aggregateVoteDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAggregateVoteRequest, QueryOuterClass.QueryAggregateVoteResponse>
      = QueryGrpc.getAggregateVoteMethod()!!

  private val aggregateVotesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAggregateVotesRequest, QueryOuterClass.QueryAggregateVotesResponse>
      = QueryGrpc.getAggregateVotesMethod()!!

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun exchangeRate(request: QueryExchangeRateRequest):
        QueryExchangeRateResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.oracle.v1beta1.Query.ExchangeRate is unimplemented"))

    public open override suspend fun exchangeRates(request: QueryExchangeRatesRequest):
        QueryExchangeRatesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.oracle.v1beta1.Query.ExchangeRates is unimplemented"))

    public open override suspend fun tobinTax(request: QueryTobinTaxRequest): QueryTobinTaxResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.oracle.v1beta1.Query.TobinTax is unimplemented"))

    public open override suspend fun tobinTaxes(request: QueryTobinTaxesRequest):
        QueryTobinTaxesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.oracle.v1beta1.Query.TobinTaxes is unimplemented"))

    public open override suspend fun actives(request: QueryActivesRequest): QueryActivesResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.oracle.v1beta1.Query.Actives is unimplemented"))

    public open override suspend fun voteTargets(request: QueryVoteTargetsRequest):
        QueryVoteTargetsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.oracle.v1beta1.Query.VoteTargets is unimplemented"))

    public open override suspend fun feederDelegation(request: QueryFeederDelegationRequest):
        QueryFeederDelegationResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.oracle.v1beta1.Query.FeederDelegation is unimplemented"))

    public open override suspend fun missCounter(request: QueryMissCounterRequest):
        QueryMissCounterResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.oracle.v1beta1.Query.MissCounter is unimplemented"))

    public open override suspend fun aggregatePrevote(request: QueryAggregatePrevoteRequest):
        QueryAggregatePrevoteResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.oracle.v1beta1.Query.AggregatePrevote is unimplemented"))

    public open override suspend fun aggregatePrevotes(request: QueryAggregatePrevotesRequest):
        QueryAggregatePrevotesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.oracle.v1beta1.Query.AggregatePrevotes is unimplemented"))

    public open override suspend fun aggregateVote(request: QueryAggregateVoteRequest):
        QueryAggregateVoteResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.oracle.v1beta1.Query.AggregateVote is unimplemented"))

    public open override suspend fun aggregateVotes(request: QueryAggregateVotesRequest):
        QueryAggregateVotesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.oracle.v1beta1.Query.AggregateVotes is unimplemented"))

    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.oracle.v1beta1.Query.Params is unimplemented"))

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
    				descriptor = tobinTaxDescriptor,
    				implementation = {
        QueryTobinTaxResponseJvmConverter.convert(tobinTax(QueryTobinTaxRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = tobinTaxesDescriptor,
    				implementation = {
        QueryTobinTaxesResponseJvmConverter.convert(tobinTaxes(QueryTobinTaxesRequestJvmConverter.convert(it)))
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
    				descriptor = feederDelegationDescriptor,
    				implementation = {
        QueryFeederDelegationResponseJvmConverter.convert(feederDelegation(QueryFeederDelegationRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = missCounterDescriptor,
    				implementation = {
        QueryMissCounterResponseJvmConverter.convert(missCounter(QueryMissCounterRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = aggregatePrevoteDescriptor,
    				implementation = {
        QueryAggregatePrevoteResponseJvmConverter.convert(aggregatePrevote(QueryAggregatePrevoteRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = aggregatePrevotesDescriptor,
    				implementation = {
        QueryAggregatePrevotesResponseJvmConverter.convert(aggregatePrevotes(QueryAggregatePrevotesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = aggregateVoteDescriptor,
    				implementation = {
        QueryAggregateVoteResponseJvmConverter.convert(aggregateVote(QueryAggregateVoteRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = aggregateVotesDescriptor,
    				implementation = {
        QueryAggregateVotesResponseJvmConverter.convert(aggregateVotes(QueryAggregateVotesRequestJvmConverter.convert(it)))
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

    public override suspend fun tobinTax(request: QueryTobinTaxRequest): QueryTobinTaxResponse =
        tobinTax(request, Metadata())

    public suspend fun tobinTax(request: QueryTobinTaxRequest, metadata: Metadata):
        QueryTobinTaxResponse = QueryTobinTaxResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, tobinTaxDescriptor,
    			QueryTobinTaxRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun tobinTaxes(request: QueryTobinTaxesRequest): QueryTobinTaxesResponse
        = tobinTaxes(request, Metadata())

    public suspend fun tobinTaxes(request: QueryTobinTaxesRequest, metadata: Metadata):
        QueryTobinTaxesResponse = QueryTobinTaxesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, tobinTaxesDescriptor,
    			QueryTobinTaxesRequestJvmConverter.convert(request),
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

    public override suspend fun missCounter(request: QueryMissCounterRequest):
        QueryMissCounterResponse = missCounter(request, Metadata())

    public suspend fun missCounter(request: QueryMissCounterRequest, metadata: Metadata):
        QueryMissCounterResponse = QueryMissCounterResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, missCounterDescriptor,
    			QueryMissCounterRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun aggregatePrevote(request: QueryAggregatePrevoteRequest):
        QueryAggregatePrevoteResponse = aggregatePrevote(request, Metadata())

    public suspend fun aggregatePrevote(request: QueryAggregatePrevoteRequest, metadata: Metadata):
        QueryAggregatePrevoteResponse = QueryAggregatePrevoteResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, aggregatePrevoteDescriptor,
    			QueryAggregatePrevoteRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun aggregatePrevotes(request: QueryAggregatePrevotesRequest):
        QueryAggregatePrevotesResponse = aggregatePrevotes(request, Metadata())

    public suspend fun aggregatePrevotes(request: QueryAggregatePrevotesRequest,
        metadata: Metadata): QueryAggregatePrevotesResponse =
        QueryAggregatePrevotesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, aggregatePrevotesDescriptor,
    			QueryAggregatePrevotesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun aggregateVote(request: QueryAggregateVoteRequest):
        QueryAggregateVoteResponse = aggregateVote(request, Metadata())

    public suspend fun aggregateVote(request: QueryAggregateVoteRequest, metadata: Metadata):
        QueryAggregateVoteResponse = QueryAggregateVoteResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, aggregateVoteDescriptor,
    			QueryAggregateVoteRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun aggregateVotes(request: QueryAggregateVotesRequest):
        QueryAggregateVotesResponse = aggregateVotes(request, Metadata())

    public suspend fun aggregateVotes(request: QueryAggregateVotesRequest, metadata: Metadata):
        QueryAggregateVotesResponse = QueryAggregateVotesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, aggregateVotesDescriptor,
    			QueryAggregateVotesRequestJvmConverter.convert(request),
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

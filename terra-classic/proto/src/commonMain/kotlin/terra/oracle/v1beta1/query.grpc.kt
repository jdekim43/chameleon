// Transform from terra/oracle/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.oracle.v1beta1

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun exchangeRate(request: QueryExchangeRateRequest): QueryExchangeRateResponse

    public suspend fun exchangeRates(request: QueryExchangeRatesRequest): QueryExchangeRatesResponse

    public suspend fun tobinTax(request: QueryTobinTaxRequest): QueryTobinTaxResponse

    public suspend fun tobinTaxes(request: QueryTobinTaxesRequest): QueryTobinTaxesResponse

    public suspend fun actives(request: QueryActivesRequest): QueryActivesResponse

    public suspend fun voteTargets(request: QueryVoteTargetsRequest): QueryVoteTargetsResponse

    public suspend fun feederDelegation(request: QueryFeederDelegationRequest):
        QueryFeederDelegationResponse

    public suspend fun missCounter(request: QueryMissCounterRequest): QueryMissCounterResponse

    public suspend fun aggregatePrevote(request: QueryAggregatePrevoteRequest):
        QueryAggregatePrevoteResponse

    public suspend fun aggregatePrevotes(request: QueryAggregatePrevotesRequest):
        QueryAggregatePrevotesResponse

    public suspend fun aggregateVote(request: QueryAggregateVoteRequest): QueryAggregateVoteResponse

    public suspend fun aggregateVotes(request: QueryAggregateVotesRequest):
        QueryAggregateVotesResponse

    public suspend fun params(request: QueryParamsRequest): QueryParamsResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}

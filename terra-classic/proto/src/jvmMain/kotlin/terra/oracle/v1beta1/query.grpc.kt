// Transform from terra/oracle/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.oracle.v1beta1

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun exchangeRate(request: QueryExchangeRateRequest):
        QueryExchangeRateResponse

    public actual suspend fun exchangeRates(request: QueryExchangeRatesRequest):
        QueryExchangeRatesResponse

    public actual suspend fun tobinTax(request: QueryTobinTaxRequest): QueryTobinTaxResponse

    public actual suspend fun tobinTaxes(request: QueryTobinTaxesRequest): QueryTobinTaxesResponse

    public actual suspend fun actives(request: QueryActivesRequest): QueryActivesResponse

    public actual suspend fun voteTargets(request: QueryVoteTargetsRequest):
        QueryVoteTargetsResponse

    public actual suspend fun feederDelegation(request: QueryFeederDelegationRequest):
        QueryFeederDelegationResponse

    public actual suspend fun missCounter(request: QueryMissCounterRequest):
        QueryMissCounterResponse

    public actual suspend fun aggregatePrevote(request: QueryAggregatePrevoteRequest):
        QueryAggregatePrevoteResponse

    public actual suspend fun aggregatePrevotes(request: QueryAggregatePrevotesRequest):
        QueryAggregatePrevotesResponse

    public actual suspend fun aggregateVote(request: QueryAggregateVoteRequest):
        QueryAggregateVoteResponse

    public actual suspend fun aggregateVotes(request: QueryAggregateVotesRequest):
        QueryAggregateVotesResponse

    public actual suspend fun params(request: QueryParamsRequest): QueryParamsResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}

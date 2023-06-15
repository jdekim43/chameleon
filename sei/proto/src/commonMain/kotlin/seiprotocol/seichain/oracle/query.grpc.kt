// Transform from oracle/query.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.oracle

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun exchangeRate(request: QueryExchangeRateRequest): QueryExchangeRateResponse

    public suspend fun exchangeRates(request: QueryExchangeRatesRequest): QueryExchangeRatesResponse

    public suspend fun actives(request: QueryActivesRequest): QueryActivesResponse

    public suspend fun voteTargets(request: QueryVoteTargetsRequest): QueryVoteTargetsResponse

    public suspend fun priceSnapshotHistory(request: QueryPriceSnapshotHistoryRequest):
        QueryPriceSnapshotHistoryResponse

    public suspend fun twaps(request: QueryTwapsRequest): QueryTwapsResponse

    public suspend fun feederDelegation(request: QueryFeederDelegationRequest):
        QueryFeederDelegationResponse

    public suspend fun votePenaltyCounter(request: QueryVotePenaltyCounterRequest):
        QueryVotePenaltyCounterResponse

    public suspend fun slashWindow(request: QuerySlashWindowRequest): QuerySlashWindowResponse

    public suspend fun params(request: QueryParamsRequest): QueryParamsResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}

// Transform from oracle/query.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.oracle

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

    public actual suspend fun actives(request: QueryActivesRequest): QueryActivesResponse

    public actual suspend fun voteTargets(request: QueryVoteTargetsRequest):
        QueryVoteTargetsResponse

    public actual suspend fun priceSnapshotHistory(request: QueryPriceSnapshotHistoryRequest):
        QueryPriceSnapshotHistoryResponse

    public actual suspend fun twaps(request: QueryTwapsRequest): QueryTwapsResponse

    public actual suspend fun feederDelegation(request: QueryFeederDelegationRequest):
        QueryFeederDelegationResponse

    public actual suspend fun votePenaltyCounter(request: QueryVotePenaltyCounterRequest):
        QueryVotePenaltyCounterResponse

    public actual suspend fun slashWindow(request: QuerySlashWindowRequest):
        QuerySlashWindowResponse

    public actual suspend fun params(request: QueryParamsRequest): QueryParamsResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}

// Transform from dex/query.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public expect object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public interface Interface {
    public suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public suspend fun longBook(request: QueryGetLongBookRequest): QueryGetLongBookResponse

    public suspend fun longBookAll(request: QueryAllLongBookRequest): QueryAllLongBookResponse

    public suspend fun shortBook(request: QueryGetShortBookRequest): QueryGetShortBookResponse

    public suspend fun shortBookAll(request: QueryAllShortBookRequest): QueryAllShortBookResponse

    public suspend fun getPrice(request: QueryGetPriceRequest): QueryGetPriceResponse

    public suspend fun getLatestPrice(request: QueryGetLatestPriceRequest):
        QueryGetLatestPriceResponse

    public suspend fun getPrices(request: QueryGetPricesRequest): QueryGetPricesResponse

    public suspend fun getTwaps(request: QueryGetTwapsRequest): QueryGetTwapsResponse

    public suspend fun assetMetadata(request: QueryAssetMetadataRequest): QueryAssetMetadataResponse

    public suspend fun assetList(request: QueryAssetListRequest): QueryAssetListResponse

    public suspend fun getRegisteredPairs(request: QueryRegisteredPairsRequest):
        QueryRegisteredPairsResponse

    public suspend fun getRegisteredContract(request: QueryRegisteredContractRequest):
        QueryRegisteredContractResponse

    public suspend fun getOrders(request: QueryGetOrdersRequest): QueryGetOrdersResponse

    public suspend fun getOrder(request: QueryGetOrderByIDRequest): QueryGetOrderByIDResponse

    public suspend fun getHistoricalPrices(request: QueryGetHistoricalPricesRequest):
        QueryGetHistoricalPricesResponse

    public suspend fun getMarketSummary(request: QueryGetMarketSummaryRequest):
        QueryGetMarketSummaryResponse

    public suspend fun getOrderSimulation(request: QueryOrderSimulationRequest):
        QueryOrderSimulationResponse

    public suspend fun getMatchResult(request: QueryGetMatchResultRequest):
        QueryGetMatchResultResponse

    public suspend fun getOrderCount(request: QueryGetOrderCountRequest): QueryGetOrderCountResponse
  }

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : Interface

  public open class Client(
    option: ClientOption,
  ) : Interface
}

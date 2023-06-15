// Transform from dex/query.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kotlin.coroutines.CoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService

public actual object Query : GrpcService<Query.Interface, Query.Server, Query.Client> {
  public override fun createClient(option: ClientOption): Client = Client(option)

  public actual interface Interface {
    public actual suspend fun params(request: QueryParamsRequest): QueryParamsResponse

    public actual suspend fun longBook(request: QueryGetLongBookRequest): QueryGetLongBookResponse

    public actual suspend fun longBookAll(request: QueryAllLongBookRequest):
        QueryAllLongBookResponse

    public actual suspend fun shortBook(request: QueryGetShortBookRequest):
        QueryGetShortBookResponse

    public actual suspend fun shortBookAll(request: QueryAllShortBookRequest):
        QueryAllShortBookResponse

    public actual suspend fun getPrice(request: QueryGetPriceRequest): QueryGetPriceResponse

    public actual suspend fun getLatestPrice(request: QueryGetLatestPriceRequest):
        QueryGetLatestPriceResponse

    public actual suspend fun getPrices(request: QueryGetPricesRequest): QueryGetPricesResponse

    public actual suspend fun getTwaps(request: QueryGetTwapsRequest): QueryGetTwapsResponse

    public actual suspend fun assetMetadata(request: QueryAssetMetadataRequest):
        QueryAssetMetadataResponse

    public actual suspend fun assetList(request: QueryAssetListRequest): QueryAssetListResponse

    public actual suspend fun getRegisteredPairs(request: QueryRegisteredPairsRequest):
        QueryRegisteredPairsResponse

    public actual suspend fun getRegisteredContract(request: QueryRegisteredContractRequest):
        QueryRegisteredContractResponse

    public actual suspend fun getOrders(request: QueryGetOrdersRequest): QueryGetOrdersResponse

    public actual suspend fun getOrder(request: QueryGetOrderByIDRequest): QueryGetOrderByIDResponse

    public actual suspend fun getHistoricalPrices(request: QueryGetHistoricalPricesRequest):
        QueryGetHistoricalPricesResponse

    public actual suspend fun getMarketSummary(request: QueryGetMarketSummaryRequest):
        QueryGetMarketSummaryResponse

    public actual suspend fun getOrderSimulation(request: QueryOrderSimulationRequest):
        QueryOrderSimulationResponse

    public actual suspend fun getMatchResult(request: QueryGetMatchResultRequest):
        QueryGetMatchResultResponse

    public actual suspend fun getOrderCount(request: QueryGetOrderCountRequest):
        QueryGetOrderCountResponse
  }

  public actual abstract class Server actual constructor(
    coroutineContext: CoroutineContext,
  ) : QueryJvm.Server(coroutineContext), Interface

  public actual open class Client actual constructor(
    option: ClientOption,
  ) : QueryJvm.Client(option), Interface
}

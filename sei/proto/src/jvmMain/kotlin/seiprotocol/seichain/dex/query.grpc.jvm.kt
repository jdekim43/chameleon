// Transform from dex/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

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

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  private val longBookDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGetLongBookRequest, QueryOuterClass.QueryGetLongBookResponse>
      = QueryGrpc.getLongBookMethod()!!

  private val longBookAllDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllLongBookRequest, QueryOuterClass.QueryAllLongBookResponse>
      = QueryGrpc.getLongBookAllMethod()!!

  private val shortBookDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGetShortBookRequest, QueryOuterClass.QueryGetShortBookResponse>
      = QueryGrpc.getShortBookMethod()!!

  private val shortBookAllDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAllShortBookRequest, QueryOuterClass.QueryAllShortBookResponse>
      = QueryGrpc.getShortBookAllMethod()!!

  private val getPriceDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGetPriceRequest, QueryOuterClass.QueryGetPriceResponse>
      = QueryGrpc.getGetPriceMethod()!!

  private val getLatestPriceDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGetLatestPriceRequest, QueryOuterClass.QueryGetLatestPriceResponse>
      = QueryGrpc.getGetLatestPriceMethod()!!

  private val getPricesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGetPricesRequest, QueryOuterClass.QueryGetPricesResponse>
      = QueryGrpc.getGetPricesMethod()!!

  private val getTwapsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGetTwapsRequest, QueryOuterClass.QueryGetTwapsResponse>
      = QueryGrpc.getGetTwapsMethod()!!

  private val assetMetadataDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAssetMetadataRequest, QueryOuterClass.QueryAssetMetadataResponse>
      = QueryGrpc.getAssetMetadataMethod()!!

  private val assetListDescriptor:
      MethodDescriptor<QueryOuterClass.QueryAssetListRequest, QueryOuterClass.QueryAssetListResponse>
      = QueryGrpc.getAssetListMethod()!!

  private val getRegisteredPairsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryRegisteredPairsRequest, QueryOuterClass.QueryRegisteredPairsResponse>
      = QueryGrpc.getGetRegisteredPairsMethod()!!

  private val getRegisteredContractDescriptor:
      MethodDescriptor<QueryOuterClass.QueryRegisteredContractRequest, QueryOuterClass.QueryRegisteredContractResponse>
      = QueryGrpc.getGetRegisteredContractMethod()!!

  private val getOrdersDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGetOrdersRequest, QueryOuterClass.QueryGetOrdersResponse>
      = QueryGrpc.getGetOrdersMethod()!!

  private val getOrderDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGetOrderByIDRequest, QueryOuterClass.QueryGetOrderByIDResponse>
      = QueryGrpc.getGetOrderMethod()!!

  private val getHistoricalPricesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGetHistoricalPricesRequest, QueryOuterClass.QueryGetHistoricalPricesResponse>
      = QueryGrpc.getGetHistoricalPricesMethod()!!

  private val getMarketSummaryDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGetMarketSummaryRequest, QueryOuterClass.QueryGetMarketSummaryResponse>
      = QueryGrpc.getGetMarketSummaryMethod()!!

  private val getOrderSimulationDescriptor:
      MethodDescriptor<QueryOuterClass.QueryOrderSimulationRequest, QueryOuterClass.QueryOrderSimulationResponse>
      = QueryGrpc.getGetOrderSimulationMethod()!!

  private val getMatchResultDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGetMatchResultRequest, QueryOuterClass.QueryGetMatchResultResponse>
      = QueryGrpc.getGetMatchResultMethod()!!

  private val getOrderCountDescriptor:
      MethodDescriptor<QueryOuterClass.QueryGetOrderCountRequest, QueryOuterClass.QueryGetOrderCountResponse>
      = QueryGrpc.getGetOrderCountMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.Params is unimplemented"))

    public open override suspend fun longBook(request: QueryGetLongBookRequest):
        QueryGetLongBookResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.LongBook is unimplemented"))

    public open override suspend fun longBookAll(request: QueryAllLongBookRequest):
        QueryAllLongBookResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.LongBookAll is unimplemented"))

    public open override suspend fun shortBook(request: QueryGetShortBookRequest):
        QueryGetShortBookResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.ShortBook is unimplemented"))

    public open override suspend fun shortBookAll(request: QueryAllShortBookRequest):
        QueryAllShortBookResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.ShortBookAll is unimplemented"))

    public open override suspend fun getPrice(request: QueryGetPriceRequest): QueryGetPriceResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.GetPrice is unimplemented"))

    public open override suspend fun getLatestPrice(request: QueryGetLatestPriceRequest):
        QueryGetLatestPriceResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.GetLatestPrice is unimplemented"))

    public open override suspend fun getPrices(request: QueryGetPricesRequest):
        QueryGetPricesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.GetPrices is unimplemented"))

    public open override suspend fun getTwaps(request: QueryGetTwapsRequest): QueryGetTwapsResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.GetTwaps is unimplemented"))

    public open override suspend fun assetMetadata(request: QueryAssetMetadataRequest):
        QueryAssetMetadataResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.AssetMetadata is unimplemented"))

    public open override suspend fun assetList(request: QueryAssetListRequest):
        QueryAssetListResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.AssetList is unimplemented"))

    public open override suspend fun getRegisteredPairs(request: QueryRegisteredPairsRequest):
        QueryRegisteredPairsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.GetRegisteredPairs is unimplemented"))

    public open override suspend fun getRegisteredContract(request: QueryRegisteredContractRequest):
        QueryRegisteredContractResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.GetRegisteredContract is unimplemented"))

    public open override suspend fun getOrders(request: QueryGetOrdersRequest):
        QueryGetOrdersResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.GetOrders is unimplemented"))

    public open override suspend fun getOrder(request: QueryGetOrderByIDRequest):
        QueryGetOrderByIDResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.GetOrder is unimplemented"))

    public open override suspend fun getHistoricalPrices(request: QueryGetHistoricalPricesRequest):
        QueryGetHistoricalPricesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.GetHistoricalPrices is unimplemented"))

    public open override suspend fun getMarketSummary(request: QueryGetMarketSummaryRequest):
        QueryGetMarketSummaryResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.GetMarketSummary is unimplemented"))

    public open override suspend fun getOrderSimulation(request: QueryOrderSimulationRequest):
        QueryOrderSimulationResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.GetOrderSimulation is unimplemented"))

    public open override suspend fun getMatchResult(request: QueryGetMatchResultRequest):
        QueryGetMatchResultResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.GetMatchResult is unimplemented"))

    public open override suspend fun getOrderCount(request: QueryGetOrderCountRequest):
        QueryGetOrderCountResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.dex.Query.GetOrderCount is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
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
    				descriptor = longBookDescriptor,
    				implementation = {
        QueryGetLongBookResponseJvmConverter.convert(longBook(QueryGetLongBookRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = longBookAllDescriptor,
    				implementation = {
        QueryAllLongBookResponseJvmConverter.convert(longBookAll(QueryAllLongBookRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = shortBookDescriptor,
    				implementation = {
        QueryGetShortBookResponseJvmConverter.convert(shortBook(QueryGetShortBookRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = shortBookAllDescriptor,
    				implementation = {
        QueryAllShortBookResponseJvmConverter.convert(shortBookAll(QueryAllShortBookRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getPriceDescriptor,
    				implementation = {
        QueryGetPriceResponseJvmConverter.convert(getPrice(QueryGetPriceRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getLatestPriceDescriptor,
    				implementation = {
        QueryGetLatestPriceResponseJvmConverter.convert(getLatestPrice(QueryGetLatestPriceRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getPricesDescriptor,
    				implementation = {
        QueryGetPricesResponseJvmConverter.convert(getPrices(QueryGetPricesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getTwapsDescriptor,
    				implementation = {
        QueryGetTwapsResponseJvmConverter.convert(getTwaps(QueryGetTwapsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = assetMetadataDescriptor,
    				implementation = {
        QueryAssetMetadataResponseJvmConverter.convert(assetMetadata(QueryAssetMetadataRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = assetListDescriptor,
    				implementation = {
        QueryAssetListResponseJvmConverter.convert(assetList(QueryAssetListRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getRegisteredPairsDescriptor,
    				implementation = {
        QueryRegisteredPairsResponseJvmConverter.convert(getRegisteredPairs(QueryRegisteredPairsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getRegisteredContractDescriptor,
    				implementation = {
        QueryRegisteredContractResponseJvmConverter.convert(getRegisteredContract(QueryRegisteredContractRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getOrdersDescriptor,
    				implementation = {
        QueryGetOrdersResponseJvmConverter.convert(getOrders(QueryGetOrdersRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getOrderDescriptor,
    				implementation = {
        QueryGetOrderByIDResponseJvmConverter.convert(getOrder(QueryGetOrderByIDRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getHistoricalPricesDescriptor,
    				implementation = {
        QueryGetHistoricalPricesResponseJvmConverter.convert(getHistoricalPrices(QueryGetHistoricalPricesRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getMarketSummaryDescriptor,
    				implementation = {
        QueryGetMarketSummaryResponseJvmConverter.convert(getMarketSummary(QueryGetMarketSummaryRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getOrderSimulationDescriptor,
    				implementation = {
        QueryOrderSimulationResponseJvmConverter.convert(getOrderSimulation(QueryOrderSimulationRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getMatchResultDescriptor,
    				implementation = {
        QueryGetMatchResultResponseJvmConverter.convert(getMatchResult(QueryGetMatchResultRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = getOrderCountDescriptor,
    				implementation = {
        QueryGetOrderCountResponseJvmConverter.convert(getOrderCount(QueryGetOrderCountRequestJvmConverter.convert(it)))
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

    public override suspend fun longBook(request: QueryGetLongBookRequest): QueryGetLongBookResponse
        = longBook(request, Metadata())

    public suspend fun longBook(request: QueryGetLongBookRequest, metadata: Metadata):
        QueryGetLongBookResponse = QueryGetLongBookResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, longBookDescriptor,
    			QueryGetLongBookRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun longBookAll(request: QueryAllLongBookRequest):
        QueryAllLongBookResponse = longBookAll(request, Metadata())

    public suspend fun longBookAll(request: QueryAllLongBookRequest, metadata: Metadata):
        QueryAllLongBookResponse = QueryAllLongBookResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, longBookAllDescriptor,
    			QueryAllLongBookRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun shortBook(request: QueryGetShortBookRequest):
        QueryGetShortBookResponse = shortBook(request, Metadata())

    public suspend fun shortBook(request: QueryGetShortBookRequest, metadata: Metadata):
        QueryGetShortBookResponse = QueryGetShortBookResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, shortBookDescriptor,
    			QueryGetShortBookRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun shortBookAll(request: QueryAllShortBookRequest):
        QueryAllShortBookResponse = shortBookAll(request, Metadata())

    public suspend fun shortBookAll(request: QueryAllShortBookRequest, metadata: Metadata):
        QueryAllShortBookResponse = QueryAllShortBookResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, shortBookAllDescriptor,
    			QueryAllShortBookRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getPrice(request: QueryGetPriceRequest): QueryGetPriceResponse =
        getPrice(request, Metadata())

    public suspend fun getPrice(request: QueryGetPriceRequest, metadata: Metadata):
        QueryGetPriceResponse = QueryGetPriceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getPriceDescriptor,
    			QueryGetPriceRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getLatestPrice(request: QueryGetLatestPriceRequest):
        QueryGetLatestPriceResponse = getLatestPrice(request, Metadata())

    public suspend fun getLatestPrice(request: QueryGetLatestPriceRequest, metadata: Metadata):
        QueryGetLatestPriceResponse = QueryGetLatestPriceResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getLatestPriceDescriptor,
    			QueryGetLatestPriceRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getPrices(request: QueryGetPricesRequest): QueryGetPricesResponse =
        getPrices(request, Metadata())

    public suspend fun getPrices(request: QueryGetPricesRequest, metadata: Metadata):
        QueryGetPricesResponse = QueryGetPricesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getPricesDescriptor,
    			QueryGetPricesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getTwaps(request: QueryGetTwapsRequest): QueryGetTwapsResponse =
        getTwaps(request, Metadata())

    public suspend fun getTwaps(request: QueryGetTwapsRequest, metadata: Metadata):
        QueryGetTwapsResponse = QueryGetTwapsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getTwapsDescriptor,
    			QueryGetTwapsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun assetMetadata(request: QueryAssetMetadataRequest):
        QueryAssetMetadataResponse = assetMetadata(request, Metadata())

    public suspend fun assetMetadata(request: QueryAssetMetadataRequest, metadata: Metadata):
        QueryAssetMetadataResponse = QueryAssetMetadataResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, assetMetadataDescriptor,
    			QueryAssetMetadataRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun assetList(request: QueryAssetListRequest): QueryAssetListResponse =
        assetList(request, Metadata())

    public suspend fun assetList(request: QueryAssetListRequest, metadata: Metadata):
        QueryAssetListResponse = QueryAssetListResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, assetListDescriptor,
    			QueryAssetListRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getRegisteredPairs(request: QueryRegisteredPairsRequest):
        QueryRegisteredPairsResponse = getRegisteredPairs(request, Metadata())

    public suspend fun getRegisteredPairs(request: QueryRegisteredPairsRequest, metadata: Metadata):
        QueryRegisteredPairsResponse = QueryRegisteredPairsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getRegisteredPairsDescriptor,
    			QueryRegisteredPairsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getRegisteredContract(request: QueryRegisteredContractRequest):
        QueryRegisteredContractResponse = getRegisteredContract(request, Metadata())

    public suspend fun getRegisteredContract(request: QueryRegisteredContractRequest,
        metadata: Metadata): QueryRegisteredContractResponse =
        QueryRegisteredContractResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getRegisteredContractDescriptor,
    			QueryRegisteredContractRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getOrders(request: QueryGetOrdersRequest): QueryGetOrdersResponse =
        getOrders(request, Metadata())

    public suspend fun getOrders(request: QueryGetOrdersRequest, metadata: Metadata):
        QueryGetOrdersResponse = QueryGetOrdersResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getOrdersDescriptor,
    			QueryGetOrdersRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getOrder(request: QueryGetOrderByIDRequest):
        QueryGetOrderByIDResponse = getOrder(request, Metadata())

    public suspend fun getOrder(request: QueryGetOrderByIDRequest, metadata: Metadata):
        QueryGetOrderByIDResponse = QueryGetOrderByIDResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getOrderDescriptor,
    			QueryGetOrderByIDRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getHistoricalPrices(request: QueryGetHistoricalPricesRequest):
        QueryGetHistoricalPricesResponse = getHistoricalPrices(request, Metadata())

    public suspend fun getHistoricalPrices(request: QueryGetHistoricalPricesRequest,
        metadata: Metadata): QueryGetHistoricalPricesResponse =
        QueryGetHistoricalPricesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getHistoricalPricesDescriptor,
    			QueryGetHistoricalPricesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getMarketSummary(request: QueryGetMarketSummaryRequest):
        QueryGetMarketSummaryResponse = getMarketSummary(request, Metadata())

    public suspend fun getMarketSummary(request: QueryGetMarketSummaryRequest, metadata: Metadata):
        QueryGetMarketSummaryResponse = QueryGetMarketSummaryResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getMarketSummaryDescriptor,
    			QueryGetMarketSummaryRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getOrderSimulation(request: QueryOrderSimulationRequest):
        QueryOrderSimulationResponse = getOrderSimulation(request, Metadata())

    public suspend fun getOrderSimulation(request: QueryOrderSimulationRequest, metadata: Metadata):
        QueryOrderSimulationResponse = QueryOrderSimulationResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getOrderSimulationDescriptor,
    			QueryOrderSimulationRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getMatchResult(request: QueryGetMatchResultRequest):
        QueryGetMatchResultResponse = getMatchResult(request, Metadata())

    public suspend fun getMatchResult(request: QueryGetMatchResultRequest, metadata: Metadata):
        QueryGetMatchResultResponse = QueryGetMatchResultResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getMatchResultDescriptor,
    			QueryGetMatchResultRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun getOrderCount(request: QueryGetOrderCountRequest):
        QueryGetOrderCountResponse = getOrderCount(request, Metadata())

    public suspend fun getOrderCount(request: QueryGetOrderCountRequest, metadata: Metadata):
        QueryGetOrderCountResponse = QueryGetOrderCountResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, getOrderCountDescriptor,
    			QueryGetOrderCountRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}

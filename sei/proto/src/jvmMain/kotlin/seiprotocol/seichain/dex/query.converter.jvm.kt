// Transform from dex/query.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestJvmConverter
import cosmos.base.query.v1beta1.PageResponseJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object QueryParamsRequestJvmConverter :
    ProtobufTypeMapper<QueryParamsRequest, QueryOuterClass.QueryParamsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsRequest> =
      QueryOuterClass.QueryParamsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsRequest): QueryParamsRequest =
      QueryParamsRequest(
  )

  public override fun convert(obj: QueryParamsRequest): QueryOuterClass.QueryParamsRequest {
    val builder = QueryOuterClass.QueryParamsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryParamsResponseJvmConverter :
    ProtobufTypeMapper<QueryParamsResponse, QueryOuterClass.QueryParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsResponse> =
      QueryOuterClass.QueryParamsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsResponse): QueryParamsResponse =
      QueryParamsResponse(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: QueryParamsResponse): QueryOuterClass.QueryParamsResponse {
    val builder = QueryOuterClass.QueryParamsResponse.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object QueryGetLongBookRequestJvmConverter :
    ProtobufTypeMapper<QueryGetLongBookRequest, QueryOuterClass.QueryGetLongBookRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetLongBookRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetLongBookRequest> =
      QueryOuterClass.QueryGetLongBookRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetLongBookRequest): QueryGetLongBookRequest
      = QueryGetLongBookRequest(
  	price = obj.getPrice(),
  	contractAddr = obj.getContractAddr(),
  	priceDenom = obj.getPriceDenom(),
  	assetDenom = obj.getAssetDenom(),
  )

  public override fun convert(obj: QueryGetLongBookRequest):
      QueryOuterClass.QueryGetLongBookRequest {
    val builder = QueryOuterClass.QueryGetLongBookRequest.newBuilder()
    builder.setPrice(obj.price)
    builder.setContractAddr(obj.contractAddr)
    builder.setPriceDenom(obj.priceDenom)
    builder.setAssetDenom(obj.assetDenom)
    return builder.build()
  }
}

public object QueryGetLongBookResponseJvmConverter :
    ProtobufTypeMapper<QueryGetLongBookResponse, QueryOuterClass.QueryGetLongBookResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetLongBookResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetLongBookResponse> =
      QueryOuterClass.QueryGetLongBookResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetLongBookResponse):
      QueryGetLongBookResponse = QueryGetLongBookResponse(
  	longBook = LongBookJvmConverter.convert(obj.getLongBook()),
  )

  public override fun convert(obj: QueryGetLongBookResponse):
      QueryOuterClass.QueryGetLongBookResponse {
    val builder = QueryOuterClass.QueryGetLongBookResponse.newBuilder()
    builder.setLongBook(LongBookJvmConverter.convert(obj.longBook))
    return builder.build()
  }
}

public object QueryAllLongBookRequestJvmConverter :
    ProtobufTypeMapper<QueryAllLongBookRequest, QueryOuterClass.QueryAllLongBookRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllLongBookRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllLongBookRequest> =
      QueryOuterClass.QueryAllLongBookRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllLongBookRequest): QueryAllLongBookRequest
      = QueryAllLongBookRequest(
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  	contractAddr = obj.getContractAddr(),
  	priceDenom = obj.getPriceDenom(),
  	assetDenom = obj.getAssetDenom(),
  )

  public override fun convert(obj: QueryAllLongBookRequest):
      QueryOuterClass.QueryAllLongBookRequest {
    val builder = QueryOuterClass.QueryAllLongBookRequest.newBuilder()
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    builder.setContractAddr(obj.contractAddr)
    builder.setPriceDenom(obj.priceDenom)
    builder.setAssetDenom(obj.assetDenom)
    return builder.build()
  }
}

public object QueryAllLongBookResponseJvmConverter :
    ProtobufTypeMapper<QueryAllLongBookResponse, QueryOuterClass.QueryAllLongBookResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllLongBookResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllLongBookResponse> =
      QueryOuterClass.QueryAllLongBookResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllLongBookResponse):
      QueryAllLongBookResponse = QueryAllLongBookResponse(
  	longBook = obj.getLongBookList().map { LongBookJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllLongBookResponse):
      QueryOuterClass.QueryAllLongBookResponse {
    val builder = QueryOuterClass.QueryAllLongBookResponse.newBuilder()
    builder.addAllLongBook(obj.longBook.map { LongBookJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGetShortBookRequestJvmConverter :
    ProtobufTypeMapper<QueryGetShortBookRequest, QueryOuterClass.QueryGetShortBookRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetShortBookRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetShortBookRequest> =
      QueryOuterClass.QueryGetShortBookRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetShortBookRequest):
      QueryGetShortBookRequest = QueryGetShortBookRequest(
  	price = obj.getPrice(),
  	contractAddr = obj.getContractAddr(),
  	priceDenom = obj.getPriceDenom(),
  	assetDenom = obj.getAssetDenom(),
  )

  public override fun convert(obj: QueryGetShortBookRequest):
      QueryOuterClass.QueryGetShortBookRequest {
    val builder = QueryOuterClass.QueryGetShortBookRequest.newBuilder()
    builder.setPrice(obj.price)
    builder.setContractAddr(obj.contractAddr)
    builder.setPriceDenom(obj.priceDenom)
    builder.setAssetDenom(obj.assetDenom)
    return builder.build()
  }
}

public object QueryGetShortBookResponseJvmConverter :
    ProtobufTypeMapper<QueryGetShortBookResponse, QueryOuterClass.QueryGetShortBookResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetShortBookResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetShortBookResponse> =
      QueryOuterClass.QueryGetShortBookResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetShortBookResponse):
      QueryGetShortBookResponse = QueryGetShortBookResponse(
  	shortBook = ShortBookJvmConverter.convert(obj.getShortBook()),
  )

  public override fun convert(obj: QueryGetShortBookResponse):
      QueryOuterClass.QueryGetShortBookResponse {
    val builder = QueryOuterClass.QueryGetShortBookResponse.newBuilder()
    builder.setShortBook(ShortBookJvmConverter.convert(obj.shortBook))
    return builder.build()
  }
}

public object QueryAllShortBookRequestJvmConverter :
    ProtobufTypeMapper<QueryAllShortBookRequest, QueryOuterClass.QueryAllShortBookRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllShortBookRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllShortBookRequest> =
      QueryOuterClass.QueryAllShortBookRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllShortBookRequest):
      QueryAllShortBookRequest = QueryAllShortBookRequest(
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  	contractAddr = obj.getContractAddr(),
  	priceDenom = obj.getPriceDenom(),
  	assetDenom = obj.getAssetDenom(),
  )

  public override fun convert(obj: QueryAllShortBookRequest):
      QueryOuterClass.QueryAllShortBookRequest {
    val builder = QueryOuterClass.QueryAllShortBookRequest.newBuilder()
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    builder.setContractAddr(obj.contractAddr)
    builder.setPriceDenom(obj.priceDenom)
    builder.setAssetDenom(obj.assetDenom)
    return builder.build()
  }
}

public object QueryAllShortBookResponseJvmConverter :
    ProtobufTypeMapper<QueryAllShortBookResponse, QueryOuterClass.QueryAllShortBookResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllShortBookResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllShortBookResponse> =
      QueryOuterClass.QueryAllShortBookResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllShortBookResponse):
      QueryAllShortBookResponse = QueryAllShortBookResponse(
  	shortBook = obj.getShortBookList().map { ShortBookJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllShortBookResponse):
      QueryOuterClass.QueryAllShortBookResponse {
    val builder = QueryOuterClass.QueryAllShortBookResponse.newBuilder()
    builder.addAllShortBook(obj.shortBook.map { ShortBookJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGetPricesRequestJvmConverter :
    ProtobufTypeMapper<QueryGetPricesRequest, QueryOuterClass.QueryGetPricesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetPricesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetPricesRequest> =
      QueryOuterClass.QueryGetPricesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetPricesRequest): QueryGetPricesRequest =
      QueryGetPricesRequest(
  	priceDenom = obj.getPriceDenom(),
  	assetDenom = obj.getAssetDenom(),
  	contractAddr = obj.getContractAddr(),
  )

  public override fun convert(obj: QueryGetPricesRequest): QueryOuterClass.QueryGetPricesRequest {
    val builder = QueryOuterClass.QueryGetPricesRequest.newBuilder()
    builder.setPriceDenom(obj.priceDenom)
    builder.setAssetDenom(obj.assetDenom)
    builder.setContractAddr(obj.contractAddr)
    return builder.build()
  }
}

public object QueryGetPricesResponseJvmConverter :
    ProtobufTypeMapper<QueryGetPricesResponse, QueryOuterClass.QueryGetPricesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetPricesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetPricesResponse> =
      QueryOuterClass.QueryGetPricesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetPricesResponse): QueryGetPricesResponse =
      QueryGetPricesResponse(
  	prices = obj.getPricesList().map { PriceJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryGetPricesResponse): QueryOuterClass.QueryGetPricesResponse {
    val builder = QueryOuterClass.QueryGetPricesResponse.newBuilder()
    builder.addAllPrices(obj.prices.map { PriceJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryGetPriceRequestJvmConverter :
    ProtobufTypeMapper<QueryGetPriceRequest, QueryOuterClass.QueryGetPriceRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetPriceRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetPriceRequest> =
      QueryOuterClass.QueryGetPriceRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetPriceRequest): QueryGetPriceRequest =
      QueryGetPriceRequest(
  	priceDenom = obj.getPriceDenom(),
  	assetDenom = obj.getAssetDenom(),
  	contractAddr = obj.getContractAddr(),
  	timestamp = obj.getTimestamp().asKotlinType,
  )

  public override fun convert(obj: QueryGetPriceRequest): QueryOuterClass.QueryGetPriceRequest {
    val builder = QueryOuterClass.QueryGetPriceRequest.newBuilder()
    builder.setPriceDenom(obj.priceDenom)
    builder.setAssetDenom(obj.assetDenom)
    builder.setContractAddr(obj.contractAddr)
    builder.setTimestamp(obj.timestamp.asJavaType)
    return builder.build()
  }
}

public object QueryGetPriceResponseJvmConverter :
    ProtobufTypeMapper<QueryGetPriceResponse, QueryOuterClass.QueryGetPriceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetPriceResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetPriceResponse> =
      QueryOuterClass.QueryGetPriceResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetPriceResponse): QueryGetPriceResponse =
      QueryGetPriceResponse(
  	price = PriceJvmConverter.convert(obj.getPrice()),
  	found = obj.getFound(),
  )

  public override fun convert(obj: QueryGetPriceResponse): QueryOuterClass.QueryGetPriceResponse {
    val builder = QueryOuterClass.QueryGetPriceResponse.newBuilder()
    builder.setPrice(PriceJvmConverter.convert(obj.price))
    builder.setFound(obj.found)
    return builder.build()
  }
}

public object QueryGetLatestPriceRequestJvmConverter :
    ProtobufTypeMapper<QueryGetLatestPriceRequest, QueryOuterClass.QueryGetLatestPriceRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetLatestPriceRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetLatestPriceRequest> =
      QueryOuterClass.QueryGetLatestPriceRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetLatestPriceRequest):
      QueryGetLatestPriceRequest = QueryGetLatestPriceRequest(
  	priceDenom = obj.getPriceDenom(),
  	assetDenom = obj.getAssetDenom(),
  	contractAddr = obj.getContractAddr(),
  )

  public override fun convert(obj: QueryGetLatestPriceRequest):
      QueryOuterClass.QueryGetLatestPriceRequest {
    val builder = QueryOuterClass.QueryGetLatestPriceRequest.newBuilder()
    builder.setPriceDenom(obj.priceDenom)
    builder.setAssetDenom(obj.assetDenom)
    builder.setContractAddr(obj.contractAddr)
    return builder.build()
  }
}

public object QueryGetLatestPriceResponseJvmConverter :
    ProtobufTypeMapper<QueryGetLatestPriceResponse, QueryOuterClass.QueryGetLatestPriceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetLatestPriceResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetLatestPriceResponse> =
      QueryOuterClass.QueryGetLatestPriceResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetLatestPriceResponse):
      QueryGetLatestPriceResponse = QueryGetLatestPriceResponse(
  	price = PriceJvmConverter.convert(obj.getPrice()),
  )

  public override fun convert(obj: QueryGetLatestPriceResponse):
      QueryOuterClass.QueryGetLatestPriceResponse {
    val builder = QueryOuterClass.QueryGetLatestPriceResponse.newBuilder()
    builder.setPrice(PriceJvmConverter.convert(obj.price))
    return builder.build()
  }
}

public object QueryGetTwapsRequestJvmConverter :
    ProtobufTypeMapper<QueryGetTwapsRequest, QueryOuterClass.QueryGetTwapsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetTwapsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetTwapsRequest> =
      QueryOuterClass.QueryGetTwapsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetTwapsRequest): QueryGetTwapsRequest =
      QueryGetTwapsRequest(
  	contractAddr = obj.getContractAddr(),
  	lookbackSeconds = obj.getLookbackSeconds().asKotlinType,
  )

  public override fun convert(obj: QueryGetTwapsRequest): QueryOuterClass.QueryGetTwapsRequest {
    val builder = QueryOuterClass.QueryGetTwapsRequest.newBuilder()
    builder.setContractAddr(obj.contractAddr)
    builder.setLookbackSeconds(obj.lookbackSeconds.asJavaType)
    return builder.build()
  }
}

public object QueryGetTwapsResponseJvmConverter :
    ProtobufTypeMapper<QueryGetTwapsResponse, QueryOuterClass.QueryGetTwapsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetTwapsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetTwapsResponse> =
      QueryOuterClass.QueryGetTwapsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetTwapsResponse): QueryGetTwapsResponse =
      QueryGetTwapsResponse(
  	twaps = obj.getTwapsList().map { TwapJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryGetTwapsResponse): QueryOuterClass.QueryGetTwapsResponse {
    val builder = QueryOuterClass.QueryGetTwapsResponse.newBuilder()
    builder.addAllTwaps(obj.twaps.map { TwapJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryAssetListRequestJvmConverter :
    ProtobufTypeMapper<QueryAssetListRequest, QueryOuterClass.QueryAssetListRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAssetListRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAssetListRequest> =
      QueryOuterClass.QueryAssetListRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAssetListRequest): QueryAssetListRequest =
      QueryAssetListRequest(
  )

  public override fun convert(obj: QueryAssetListRequest): QueryOuterClass.QueryAssetListRequest {
    val builder = QueryOuterClass.QueryAssetListRequest.newBuilder()
    return builder.build()
  }
}

public object QueryAssetListResponseJvmConverter :
    ProtobufTypeMapper<QueryAssetListResponse, QueryOuterClass.QueryAssetListResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAssetListResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAssetListResponse> =
      QueryOuterClass.QueryAssetListResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAssetListResponse): QueryAssetListResponse =
      QueryAssetListResponse(
  	assetList = obj.getAssetListList().map { AssetMetadataJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryAssetListResponse): QueryOuterClass.QueryAssetListResponse {
    val builder = QueryOuterClass.QueryAssetListResponse.newBuilder()
    builder.addAllAssetList(obj.assetList.map { AssetMetadataJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryAssetMetadataRequestJvmConverter :
    ProtobufTypeMapper<QueryAssetMetadataRequest, QueryOuterClass.QueryAssetMetadataRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAssetMetadataRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAssetMetadataRequest> =
      QueryOuterClass.QueryAssetMetadataRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAssetMetadataRequest):
      QueryAssetMetadataRequest = QueryAssetMetadataRequest(
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: QueryAssetMetadataRequest):
      QueryOuterClass.QueryAssetMetadataRequest {
    val builder = QueryOuterClass.QueryAssetMetadataRequest.newBuilder()
    builder.setDenom(obj.denom)
    return builder.build()
  }
}

public object QueryAssetMetadataResponseJvmConverter :
    ProtobufTypeMapper<QueryAssetMetadataResponse, QueryOuterClass.QueryAssetMetadataResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAssetMetadataResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAssetMetadataResponse> =
      QueryOuterClass.QueryAssetMetadataResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAssetMetadataResponse):
      QueryAssetMetadataResponse = QueryAssetMetadataResponse(
  	metadata = AssetMetadataJvmConverter.convert(obj.getMetadata()),
  )

  public override fun convert(obj: QueryAssetMetadataResponse):
      QueryOuterClass.QueryAssetMetadataResponse {
    val builder = QueryOuterClass.QueryAssetMetadataResponse.newBuilder()
    builder.setMetadata(AssetMetadataJvmConverter.convert(obj.metadata))
    return builder.build()
  }
}

public object QueryRegisteredPairsRequestJvmConverter :
    ProtobufTypeMapper<QueryRegisteredPairsRequest, QueryOuterClass.QueryRegisteredPairsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryRegisteredPairsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryRegisteredPairsRequest> =
      QueryOuterClass.QueryRegisteredPairsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryRegisteredPairsRequest):
      QueryRegisteredPairsRequest = QueryRegisteredPairsRequest(
  	contractAddr = obj.getContractAddr(),
  )

  public override fun convert(obj: QueryRegisteredPairsRequest):
      QueryOuterClass.QueryRegisteredPairsRequest {
    val builder = QueryOuterClass.QueryRegisteredPairsRequest.newBuilder()
    builder.setContractAddr(obj.contractAddr)
    return builder.build()
  }
}

public object QueryRegisteredPairsResponseJvmConverter :
    ProtobufTypeMapper<QueryRegisteredPairsResponse, QueryOuterClass.QueryRegisteredPairsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryRegisteredPairsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryRegisteredPairsResponse> =
      QueryOuterClass.QueryRegisteredPairsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryRegisteredPairsResponse):
      QueryRegisteredPairsResponse = QueryRegisteredPairsResponse(
  	pairs = obj.getPairsList().map { PairJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryRegisteredPairsResponse):
      QueryOuterClass.QueryRegisteredPairsResponse {
    val builder = QueryOuterClass.QueryRegisteredPairsResponse.newBuilder()
    builder.addAllPairs(obj.pairs.map { PairJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryRegisteredContractRequestJvmConverter :
    ProtobufTypeMapper<QueryRegisteredContractRequest, QueryOuterClass.QueryRegisteredContractRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryRegisteredContractRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryRegisteredContractRequest> =
      QueryOuterClass.QueryRegisteredContractRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryRegisteredContractRequest):
      QueryRegisteredContractRequest = QueryRegisteredContractRequest(
  	contractAddr = obj.getContractAddr(),
  )

  public override fun convert(obj: QueryRegisteredContractRequest):
      QueryOuterClass.QueryRegisteredContractRequest {
    val builder = QueryOuterClass.QueryRegisteredContractRequest.newBuilder()
    builder.setContractAddr(obj.contractAddr)
    return builder.build()
  }
}

public object QueryRegisteredContractResponseJvmConverter :
    ProtobufTypeMapper<QueryRegisteredContractResponse, QueryOuterClass.QueryRegisteredContractResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryRegisteredContractResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryRegisteredContractResponse> =
      QueryOuterClass.QueryRegisteredContractResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryRegisteredContractResponse):
      QueryRegisteredContractResponse = QueryRegisteredContractResponse(
  	contractInfo = ContractInfoV2JvmConverter.convert(obj.getContractInfo()),
  )

  public override fun convert(obj: QueryRegisteredContractResponse):
      QueryOuterClass.QueryRegisteredContractResponse {
    val builder = QueryOuterClass.QueryRegisteredContractResponse.newBuilder()
    builder.setContractInfo(ContractInfoV2JvmConverter.convert(obj.contractInfo))
    return builder.build()
  }
}

public object QueryGetOrdersRequestJvmConverter :
    ProtobufTypeMapper<QueryGetOrdersRequest, QueryOuterClass.QueryGetOrdersRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetOrdersRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetOrdersRequest> =
      QueryOuterClass.QueryGetOrdersRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetOrdersRequest): QueryGetOrdersRequest =
      QueryGetOrdersRequest(
  	contractAddr = obj.getContractAddr(),
  	account = obj.getAccount(),
  )

  public override fun convert(obj: QueryGetOrdersRequest): QueryOuterClass.QueryGetOrdersRequest {
    val builder = QueryOuterClass.QueryGetOrdersRequest.newBuilder()
    builder.setContractAddr(obj.contractAddr)
    builder.setAccount(obj.account)
    return builder.build()
  }
}

public object QueryGetOrdersResponseJvmConverter :
    ProtobufTypeMapper<QueryGetOrdersResponse, QueryOuterClass.QueryGetOrdersResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetOrdersResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetOrdersResponse> =
      QueryOuterClass.QueryGetOrdersResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetOrdersResponse): QueryGetOrdersResponse =
      QueryGetOrdersResponse(
  	orders = obj.getOrdersList().map { OrderJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryGetOrdersResponse): QueryOuterClass.QueryGetOrdersResponse {
    val builder = QueryOuterClass.QueryGetOrdersResponse.newBuilder()
    builder.addAllOrders(obj.orders.map { OrderJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryGetOrderByIDRequestJvmConverter :
    ProtobufTypeMapper<QueryGetOrderByIDRequest, QueryOuterClass.QueryGetOrderByIDRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetOrderByIDRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetOrderByIDRequest> =
      QueryOuterClass.QueryGetOrderByIDRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetOrderByIDRequest):
      QueryGetOrderByIDRequest = QueryGetOrderByIDRequest(
  	contractAddr = obj.getContractAddr(),
  	priceDenom = obj.getPriceDenom(),
  	assetDenom = obj.getAssetDenom(),
  	id = obj.getId().asKotlinType,
  )

  public override fun convert(obj: QueryGetOrderByIDRequest):
      QueryOuterClass.QueryGetOrderByIDRequest {
    val builder = QueryOuterClass.QueryGetOrderByIDRequest.newBuilder()
    builder.setContractAddr(obj.contractAddr)
    builder.setPriceDenom(obj.priceDenom)
    builder.setAssetDenom(obj.assetDenom)
    builder.setId(obj.id.asJavaType)
    return builder.build()
  }
}

public object QueryGetOrderByIDResponseJvmConverter :
    ProtobufTypeMapper<QueryGetOrderByIDResponse, QueryOuterClass.QueryGetOrderByIDResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetOrderByIDResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetOrderByIDResponse> =
      QueryOuterClass.QueryGetOrderByIDResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetOrderByIDResponse):
      QueryGetOrderByIDResponse = QueryGetOrderByIDResponse(
  	order = OrderJvmConverter.convert(obj.getOrder()),
  )

  public override fun convert(obj: QueryGetOrderByIDResponse):
      QueryOuterClass.QueryGetOrderByIDResponse {
    val builder = QueryOuterClass.QueryGetOrderByIDResponse.newBuilder()
    builder.setOrder(OrderJvmConverter.convert(obj.order))
    return builder.build()
  }
}

public object QueryGetHistoricalPricesRequestJvmConverter :
    ProtobufTypeMapper<QueryGetHistoricalPricesRequest, QueryOuterClass.QueryGetHistoricalPricesRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetHistoricalPricesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetHistoricalPricesRequest> =
      QueryOuterClass.QueryGetHistoricalPricesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetHistoricalPricesRequest):
      QueryGetHistoricalPricesRequest = QueryGetHistoricalPricesRequest(
  	contractAddr = obj.getContractAddr(),
  	priceDenom = obj.getPriceDenom(),
  	assetDenom = obj.getAssetDenom(),
  	periodLengthInSeconds = obj.getPeriodLengthInSeconds().asKotlinType,
  	numOfPeriods = obj.getNumOfPeriods().asKotlinType,
  )

  public override fun convert(obj: QueryGetHistoricalPricesRequest):
      QueryOuterClass.QueryGetHistoricalPricesRequest {
    val builder = QueryOuterClass.QueryGetHistoricalPricesRequest.newBuilder()
    builder.setContractAddr(obj.contractAddr)
    builder.setPriceDenom(obj.priceDenom)
    builder.setAssetDenom(obj.assetDenom)
    builder.setPeriodLengthInSeconds(obj.periodLengthInSeconds.asJavaType)
    builder.setNumOfPeriods(obj.numOfPeriods.asJavaType)
    return builder.build()
  }
}

public object QueryGetHistoricalPricesResponseJvmConverter :
    ProtobufTypeMapper<QueryGetHistoricalPricesResponse, QueryOuterClass.QueryGetHistoricalPricesResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetHistoricalPricesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetHistoricalPricesResponse> =
      QueryOuterClass.QueryGetHistoricalPricesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetHistoricalPricesResponse):
      QueryGetHistoricalPricesResponse = QueryGetHistoricalPricesResponse(
  	prices = obj.getPricesList().map { PriceCandlestickJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryGetHistoricalPricesResponse):
      QueryOuterClass.QueryGetHistoricalPricesResponse {
    val builder = QueryOuterClass.QueryGetHistoricalPricesResponse.newBuilder()
    builder.addAllPrices(obj.prices.map { PriceCandlestickJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryGetMarketSummaryRequestJvmConverter :
    ProtobufTypeMapper<QueryGetMarketSummaryRequest, QueryOuterClass.QueryGetMarketSummaryRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetMarketSummaryRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetMarketSummaryRequest> =
      QueryOuterClass.QueryGetMarketSummaryRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetMarketSummaryRequest):
      QueryGetMarketSummaryRequest = QueryGetMarketSummaryRequest(
  	contractAddr = obj.getContractAddr(),
  	priceDenom = obj.getPriceDenom(),
  	assetDenom = obj.getAssetDenom(),
  	lookbackInSeconds = obj.getLookbackInSeconds().asKotlinType,
  )

  public override fun convert(obj: QueryGetMarketSummaryRequest):
      QueryOuterClass.QueryGetMarketSummaryRequest {
    val builder = QueryOuterClass.QueryGetMarketSummaryRequest.newBuilder()
    builder.setContractAddr(obj.contractAddr)
    builder.setPriceDenom(obj.priceDenom)
    builder.setAssetDenom(obj.assetDenom)
    builder.setLookbackInSeconds(obj.lookbackInSeconds.asJavaType)
    return builder.build()
  }
}

public object QueryGetMarketSummaryResponseJvmConverter :
    ProtobufTypeMapper<QueryGetMarketSummaryResponse, QueryOuterClass.QueryGetMarketSummaryResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetMarketSummaryResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetMarketSummaryResponse> =
      QueryOuterClass.QueryGetMarketSummaryResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetMarketSummaryResponse):
      QueryGetMarketSummaryResponse = QueryGetMarketSummaryResponse(
  	totalVolume = obj.getTotalVolume(),
  	totalVolumeNotional = obj.getTotalVolumeNotional(),
  	highPrice = obj.getHighPrice(),
  	lowPrice = obj.getLowPrice(),
  	lastPrice = obj.getLastPrice(),
  )

  public override fun convert(obj: QueryGetMarketSummaryResponse):
      QueryOuterClass.QueryGetMarketSummaryResponse {
    val builder = QueryOuterClass.QueryGetMarketSummaryResponse.newBuilder()
    builder.setTotalVolume(obj.totalVolume)
    builder.setTotalVolumeNotional(obj.totalVolumeNotional)
    builder.setHighPrice(obj.highPrice)
    builder.setLowPrice(obj.lowPrice)
    builder.setLastPrice(obj.lastPrice)
    return builder.build()
  }
}

public object QueryOrderSimulationRequestJvmConverter :
    ProtobufTypeMapper<QueryOrderSimulationRequest, QueryOuterClass.QueryOrderSimulationRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOrderSimulationRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOrderSimulationRequest> =
      QueryOuterClass.QueryOrderSimulationRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryOrderSimulationRequest):
      QueryOrderSimulationRequest = QueryOrderSimulationRequest(
  	order = OrderJvmConverter.convert(obj.getOrder()),
  	contractAddr = obj.getContractAddr(),
  )

  public override fun convert(obj: QueryOrderSimulationRequest):
      QueryOuterClass.QueryOrderSimulationRequest {
    val builder = QueryOuterClass.QueryOrderSimulationRequest.newBuilder()
    builder.setOrder(OrderJvmConverter.convert(obj.order))
    builder.setContractAddr(obj.contractAddr)
    return builder.build()
  }
}

public object QueryOrderSimulationResponseJvmConverter :
    ProtobufTypeMapper<QueryOrderSimulationResponse, QueryOuterClass.QueryOrderSimulationResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOrderSimulationResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOrderSimulationResponse> =
      QueryOuterClass.QueryOrderSimulationResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryOrderSimulationResponse):
      QueryOrderSimulationResponse = QueryOrderSimulationResponse(
  	executedQuantity = obj.getExecutedQuantity(),
  )

  public override fun convert(obj: QueryOrderSimulationResponse):
      QueryOuterClass.QueryOrderSimulationResponse {
    val builder = QueryOuterClass.QueryOrderSimulationResponse.newBuilder()
    builder.setExecutedQuantity(obj.executedQuantity)
    return builder.build()
  }
}

public object QueryGetMatchResultRequestJvmConverter :
    ProtobufTypeMapper<QueryGetMatchResultRequest, QueryOuterClass.QueryGetMatchResultRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetMatchResultRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetMatchResultRequest> =
      QueryOuterClass.QueryGetMatchResultRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetMatchResultRequest):
      QueryGetMatchResultRequest = QueryGetMatchResultRequest(
  	contractAddr = obj.getContractAddr(),
  )

  public override fun convert(obj: QueryGetMatchResultRequest):
      QueryOuterClass.QueryGetMatchResultRequest {
    val builder = QueryOuterClass.QueryGetMatchResultRequest.newBuilder()
    builder.setContractAddr(obj.contractAddr)
    return builder.build()
  }
}

public object QueryGetMatchResultResponseJvmConverter :
    ProtobufTypeMapper<QueryGetMatchResultResponse, QueryOuterClass.QueryGetMatchResultResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetMatchResultResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetMatchResultResponse> =
      QueryOuterClass.QueryGetMatchResultResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetMatchResultResponse):
      QueryGetMatchResultResponse = QueryGetMatchResultResponse(
  	result = MatchResultJvmConverter.convert(obj.getResult()),
  )

  public override fun convert(obj: QueryGetMatchResultResponse):
      QueryOuterClass.QueryGetMatchResultResponse {
    val builder = QueryOuterClass.QueryGetMatchResultResponse.newBuilder()
    builder.setResult(MatchResultJvmConverter.convert(obj.result))
    return builder.build()
  }
}

public object QueryGetOrderCountRequestJvmConverter :
    ProtobufTypeMapper<QueryGetOrderCountRequest, QueryOuterClass.QueryGetOrderCountRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetOrderCountRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetOrderCountRequest> =
      QueryOuterClass.QueryGetOrderCountRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetOrderCountRequest):
      QueryGetOrderCountRequest = QueryGetOrderCountRequest(
  	contractAddr = obj.getContractAddr(),
  	priceDenom = obj.getPriceDenom(),
  	assetDenom = obj.getAssetDenom(),
  	price = obj.getPrice(),
  	positionDirection = PositionDirection.forNumber(obj.getPositionDirection().number),
  )

  public override fun convert(obj: QueryGetOrderCountRequest):
      QueryOuterClass.QueryGetOrderCountRequest {
    val builder = QueryOuterClass.QueryGetOrderCountRequest.newBuilder()
    builder.setContractAddr(obj.contractAddr)
    builder.setPriceDenom(obj.priceDenom)
    builder.setAssetDenom(obj.assetDenom)
    builder.setPrice(obj.price)
    builder.setPositionDirection(Enums.PositionDirection.forNumber(obj.positionDirection.number))
    return builder.build()
  }
}

public object QueryGetOrderCountResponseJvmConverter :
    ProtobufTypeMapper<QueryGetOrderCountResponse, QueryOuterClass.QueryGetOrderCountResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGetOrderCountResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGetOrderCountResponse> =
      QueryOuterClass.QueryGetOrderCountResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGetOrderCountResponse):
      QueryGetOrderCountResponse = QueryGetOrderCountResponse(
  	count = obj.getCount().asKotlinType,
  )

  public override fun convert(obj: QueryGetOrderCountResponse):
      QueryOuterClass.QueryGetOrderCountResponse {
    val builder = QueryOuterClass.QueryGetOrderCountResponse.newBuilder()
    builder.setCount(obj.count.asJavaType)
    return builder.build()
  }
}

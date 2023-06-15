// Transform from dex/query.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest>

public fun QueryParamsRequest.toAny(): Any = Any(QueryParamsRequest.TYPE_URL,
    with(QueryParamsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryParamsRequest>): QueryParamsRequest {
  if (typeUrl != QueryParamsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse>

public fun QueryParamsResponse.toAny(): Any = Any(QueryParamsResponse.TYPE_URL,
    with(QueryParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryParamsResponse>): QueryParamsResponse {
  if (typeUrl != QueryParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetLongBookRequestConverter : ProtobufConverter<QueryGetLongBookRequest>

public fun QueryGetLongBookRequest.toAny(): Any = Any(QueryGetLongBookRequest.TYPE_URL,
    with(QueryGetLongBookRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetLongBookRequest>):
    QueryGetLongBookRequest {
  if (typeUrl != QueryGetLongBookRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetLongBookResponseConverter : ProtobufConverter<QueryGetLongBookResponse>

public fun QueryGetLongBookResponse.toAny(): Any = Any(QueryGetLongBookResponse.TYPE_URL,
    with(QueryGetLongBookResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetLongBookResponse>):
    QueryGetLongBookResponse {
  if (typeUrl != QueryGetLongBookResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllLongBookRequestConverter : ProtobufConverter<QueryAllLongBookRequest>

public fun QueryAllLongBookRequest.toAny(): Any = Any(QueryAllLongBookRequest.TYPE_URL,
    with(QueryAllLongBookRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllLongBookRequest>):
    QueryAllLongBookRequest {
  if (typeUrl != QueryAllLongBookRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllLongBookResponseConverter : ProtobufConverter<QueryAllLongBookResponse>

public fun QueryAllLongBookResponse.toAny(): Any = Any(QueryAllLongBookResponse.TYPE_URL,
    with(QueryAllLongBookResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllLongBookResponse>):
    QueryAllLongBookResponse {
  if (typeUrl != QueryAllLongBookResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetShortBookRequestConverter : ProtobufConverter<QueryGetShortBookRequest>

public fun QueryGetShortBookRequest.toAny(): Any = Any(QueryGetShortBookRequest.TYPE_URL,
    with(QueryGetShortBookRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetShortBookRequest>):
    QueryGetShortBookRequest {
  if (typeUrl != QueryGetShortBookRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetShortBookResponseConverter :
    ProtobufConverter<QueryGetShortBookResponse>

public fun QueryGetShortBookResponse.toAny(): Any = Any(QueryGetShortBookResponse.TYPE_URL,
    with(QueryGetShortBookResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetShortBookResponse>):
    QueryGetShortBookResponse {
  if (typeUrl != QueryGetShortBookResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllShortBookRequestConverter : ProtobufConverter<QueryAllShortBookRequest>

public fun QueryAllShortBookRequest.toAny(): Any = Any(QueryAllShortBookRequest.TYPE_URL,
    with(QueryAllShortBookRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllShortBookRequest>):
    QueryAllShortBookRequest {
  if (typeUrl != QueryAllShortBookRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllShortBookResponseConverter :
    ProtobufConverter<QueryAllShortBookResponse>

public fun QueryAllShortBookResponse.toAny(): Any = Any(QueryAllShortBookResponse.TYPE_URL,
    with(QueryAllShortBookResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllShortBookResponse>):
    QueryAllShortBookResponse {
  if (typeUrl != QueryAllShortBookResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetPricesRequestConverter : ProtobufConverter<QueryGetPricesRequest>

public fun QueryGetPricesRequest.toAny(): Any = Any(QueryGetPricesRequest.TYPE_URL,
    with(QueryGetPricesRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetPricesRequest>): QueryGetPricesRequest {
  if (typeUrl != QueryGetPricesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetPricesResponseConverter : ProtobufConverter<QueryGetPricesResponse>

public fun QueryGetPricesResponse.toAny(): Any = Any(QueryGetPricesResponse.TYPE_URL,
    with(QueryGetPricesResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetPricesResponse>): QueryGetPricesResponse {
  if (typeUrl != QueryGetPricesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetPriceRequestConverter : ProtobufConverter<QueryGetPriceRequest>

public fun QueryGetPriceRequest.toAny(): Any = Any(QueryGetPriceRequest.TYPE_URL,
    with(QueryGetPriceRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetPriceRequest>): QueryGetPriceRequest {
  if (typeUrl != QueryGetPriceRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetPriceResponseConverter : ProtobufConverter<QueryGetPriceResponse>

public fun QueryGetPriceResponse.toAny(): Any = Any(QueryGetPriceResponse.TYPE_URL,
    with(QueryGetPriceResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetPriceResponse>): QueryGetPriceResponse {
  if (typeUrl != QueryGetPriceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetLatestPriceRequestConverter :
    ProtobufConverter<QueryGetLatestPriceRequest>

public fun QueryGetLatestPriceRequest.toAny(): Any = Any(QueryGetLatestPriceRequest.TYPE_URL,
    with(QueryGetLatestPriceRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetLatestPriceRequest>):
    QueryGetLatestPriceRequest {
  if (typeUrl != QueryGetLatestPriceRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetLatestPriceResponseConverter :
    ProtobufConverter<QueryGetLatestPriceResponse>

public fun QueryGetLatestPriceResponse.toAny(): Any = Any(QueryGetLatestPriceResponse.TYPE_URL,
    with(QueryGetLatestPriceResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetLatestPriceResponse>):
    QueryGetLatestPriceResponse {
  if (typeUrl != QueryGetLatestPriceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetTwapsRequestConverter : ProtobufConverter<QueryGetTwapsRequest>

public fun QueryGetTwapsRequest.toAny(): Any = Any(QueryGetTwapsRequest.TYPE_URL,
    with(QueryGetTwapsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetTwapsRequest>): QueryGetTwapsRequest {
  if (typeUrl != QueryGetTwapsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetTwapsResponseConverter : ProtobufConverter<QueryGetTwapsResponse>

public fun QueryGetTwapsResponse.toAny(): Any = Any(QueryGetTwapsResponse.TYPE_URL,
    with(QueryGetTwapsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetTwapsResponse>): QueryGetTwapsResponse {
  if (typeUrl != QueryGetTwapsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAssetListRequestConverter : ProtobufConverter<QueryAssetListRequest>

public fun QueryAssetListRequest.toAny(): Any = Any(QueryAssetListRequest.TYPE_URL,
    with(QueryAssetListRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAssetListRequest>): QueryAssetListRequest {
  if (typeUrl != QueryAssetListRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAssetListResponseConverter : ProtobufConverter<QueryAssetListResponse>

public fun QueryAssetListResponse.toAny(): Any = Any(QueryAssetListResponse.TYPE_URL,
    with(QueryAssetListResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAssetListResponse>): QueryAssetListResponse {
  if (typeUrl != QueryAssetListResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAssetMetadataRequestConverter :
    ProtobufConverter<QueryAssetMetadataRequest>

public fun QueryAssetMetadataRequest.toAny(): Any = Any(QueryAssetMetadataRequest.TYPE_URL,
    with(QueryAssetMetadataRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAssetMetadataRequest>):
    QueryAssetMetadataRequest {
  if (typeUrl != QueryAssetMetadataRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAssetMetadataResponseConverter :
    ProtobufConverter<QueryAssetMetadataResponse>

public fun QueryAssetMetadataResponse.toAny(): Any = Any(QueryAssetMetadataResponse.TYPE_URL,
    with(QueryAssetMetadataResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAssetMetadataResponse>):
    QueryAssetMetadataResponse {
  if (typeUrl != QueryAssetMetadataResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryRegisteredPairsRequestConverter :
    ProtobufConverter<QueryRegisteredPairsRequest>

public fun QueryRegisteredPairsRequest.toAny(): Any = Any(QueryRegisteredPairsRequest.TYPE_URL,
    with(QueryRegisteredPairsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryRegisteredPairsRequest>):
    QueryRegisteredPairsRequest {
  if (typeUrl != QueryRegisteredPairsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryRegisteredPairsResponseConverter :
    ProtobufConverter<QueryRegisteredPairsResponse>

public fun QueryRegisteredPairsResponse.toAny(): Any = Any(QueryRegisteredPairsResponse.TYPE_URL,
    with(QueryRegisteredPairsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryRegisteredPairsResponse>):
    QueryRegisteredPairsResponse {
  if (typeUrl != QueryRegisteredPairsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryRegisteredContractRequestConverter :
    ProtobufConverter<QueryRegisteredContractRequest>

public fun QueryRegisteredContractRequest.toAny(): Any =
    Any(QueryRegisteredContractRequest.TYPE_URL, with(QueryRegisteredContractRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryRegisteredContractRequest>):
    QueryRegisteredContractRequest {
  if (typeUrl != QueryRegisteredContractRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryRegisteredContractResponseConverter :
    ProtobufConverter<QueryRegisteredContractResponse>

public fun QueryRegisteredContractResponse.toAny(): Any =
    Any(QueryRegisteredContractResponse.TYPE_URL, with(QueryRegisteredContractResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryRegisteredContractResponse>):
    QueryRegisteredContractResponse {
  if (typeUrl != QueryRegisteredContractResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetOrdersRequestConverter : ProtobufConverter<QueryGetOrdersRequest>

public fun QueryGetOrdersRequest.toAny(): Any = Any(QueryGetOrdersRequest.TYPE_URL,
    with(QueryGetOrdersRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetOrdersRequest>): QueryGetOrdersRequest {
  if (typeUrl != QueryGetOrdersRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetOrdersResponseConverter : ProtobufConverter<QueryGetOrdersResponse>

public fun QueryGetOrdersResponse.toAny(): Any = Any(QueryGetOrdersResponse.TYPE_URL,
    with(QueryGetOrdersResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetOrdersResponse>): QueryGetOrdersResponse {
  if (typeUrl != QueryGetOrdersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetOrderByIDRequestConverter : ProtobufConverter<QueryGetOrderByIDRequest>

public fun QueryGetOrderByIDRequest.toAny(): Any = Any(QueryGetOrderByIDRequest.TYPE_URL,
    with(QueryGetOrderByIDRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetOrderByIDRequest>):
    QueryGetOrderByIDRequest {
  if (typeUrl != QueryGetOrderByIDRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetOrderByIDResponseConverter :
    ProtobufConverter<QueryGetOrderByIDResponse>

public fun QueryGetOrderByIDResponse.toAny(): Any = Any(QueryGetOrderByIDResponse.TYPE_URL,
    with(QueryGetOrderByIDResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetOrderByIDResponse>):
    QueryGetOrderByIDResponse {
  if (typeUrl != QueryGetOrderByIDResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetHistoricalPricesRequestConverter :
    ProtobufConverter<QueryGetHistoricalPricesRequest>

public fun QueryGetHistoricalPricesRequest.toAny(): Any =
    Any(QueryGetHistoricalPricesRequest.TYPE_URL, with(QueryGetHistoricalPricesRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetHistoricalPricesRequest>):
    QueryGetHistoricalPricesRequest {
  if (typeUrl != QueryGetHistoricalPricesRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetHistoricalPricesResponseConverter :
    ProtobufConverter<QueryGetHistoricalPricesResponse>

public fun QueryGetHistoricalPricesResponse.toAny(): Any =
    Any(QueryGetHistoricalPricesResponse.TYPE_URL, with(QueryGetHistoricalPricesResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetHistoricalPricesResponse>):
    QueryGetHistoricalPricesResponse {
  if (typeUrl != QueryGetHistoricalPricesResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetMarketSummaryRequestConverter :
    ProtobufConverter<QueryGetMarketSummaryRequest>

public fun QueryGetMarketSummaryRequest.toAny(): Any = Any(QueryGetMarketSummaryRequest.TYPE_URL,
    with(QueryGetMarketSummaryRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetMarketSummaryRequest>):
    QueryGetMarketSummaryRequest {
  if (typeUrl != QueryGetMarketSummaryRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetMarketSummaryResponseConverter :
    ProtobufConverter<QueryGetMarketSummaryResponse>

public fun QueryGetMarketSummaryResponse.toAny(): Any = Any(QueryGetMarketSummaryResponse.TYPE_URL,
    with(QueryGetMarketSummaryResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetMarketSummaryResponse>):
    QueryGetMarketSummaryResponse {
  if (typeUrl != QueryGetMarketSummaryResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryOrderSimulationRequestConverter :
    ProtobufConverter<QueryOrderSimulationRequest>

public fun QueryOrderSimulationRequest.toAny(): Any = Any(QueryOrderSimulationRequest.TYPE_URL,
    with(QueryOrderSimulationRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryOrderSimulationRequest>):
    QueryOrderSimulationRequest {
  if (typeUrl != QueryOrderSimulationRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryOrderSimulationResponseConverter :
    ProtobufConverter<QueryOrderSimulationResponse>

public fun QueryOrderSimulationResponse.toAny(): Any = Any(QueryOrderSimulationResponse.TYPE_URL,
    with(QueryOrderSimulationResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryOrderSimulationResponse>):
    QueryOrderSimulationResponse {
  if (typeUrl != QueryOrderSimulationResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetMatchResultRequestConverter :
    ProtobufConverter<QueryGetMatchResultRequest>

public fun QueryGetMatchResultRequest.toAny(): Any = Any(QueryGetMatchResultRequest.TYPE_URL,
    with(QueryGetMatchResultRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetMatchResultRequest>):
    QueryGetMatchResultRequest {
  if (typeUrl != QueryGetMatchResultRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetMatchResultResponseConverter :
    ProtobufConverter<QueryGetMatchResultResponse>

public fun QueryGetMatchResultResponse.toAny(): Any = Any(QueryGetMatchResultResponse.TYPE_URL,
    with(QueryGetMatchResultResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetMatchResultResponse>):
    QueryGetMatchResultResponse {
  if (typeUrl != QueryGetMatchResultResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetOrderCountRequestConverter :
    ProtobufConverter<QueryGetOrderCountRequest>

public fun QueryGetOrderCountRequest.toAny(): Any = Any(QueryGetOrderCountRequest.TYPE_URL,
    with(QueryGetOrderCountRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetOrderCountRequest>):
    QueryGetOrderCountRequest {
  if (typeUrl != QueryGetOrderCountRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryGetOrderCountResponseConverter :
    ProtobufConverter<QueryGetOrderCountResponse>

public fun QueryGetOrderCountResponse.toAny(): Any = Any(QueryGetOrderCountResponse.TYPE_URL,
    with(QueryGetOrderCountResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryGetOrderCountResponse>):
    QueryGetOrderCountResponse {
  if (typeUrl != QueryGetOrderCountResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

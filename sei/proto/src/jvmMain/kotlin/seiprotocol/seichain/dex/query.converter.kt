// Transform from dex/query.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

public actual object QueryGetLongBookRequestConverter : ProtobufConverter<QueryGetLongBookRequest>
    by QueryGetLongBookRequestJvmConverter

public actual object QueryGetLongBookResponseConverter : ProtobufConverter<QueryGetLongBookResponse>
    by QueryGetLongBookResponseJvmConverter

public actual object QueryAllLongBookRequestConverter : ProtobufConverter<QueryAllLongBookRequest>
    by QueryAllLongBookRequestJvmConverter

public actual object QueryAllLongBookResponseConverter : ProtobufConverter<QueryAllLongBookResponse>
    by QueryAllLongBookResponseJvmConverter

public actual object QueryGetShortBookRequestConverter : ProtobufConverter<QueryGetShortBookRequest>
    by QueryGetShortBookRequestJvmConverter

public actual object QueryGetShortBookResponseConverter :
    ProtobufConverter<QueryGetShortBookResponse> by QueryGetShortBookResponseJvmConverter

public actual object QueryAllShortBookRequestConverter : ProtobufConverter<QueryAllShortBookRequest>
    by QueryAllShortBookRequestJvmConverter

public actual object QueryAllShortBookResponseConverter :
    ProtobufConverter<QueryAllShortBookResponse> by QueryAllShortBookResponseJvmConverter

public actual object QueryGetPricesRequestConverter : ProtobufConverter<QueryGetPricesRequest> by
    QueryGetPricesRequestJvmConverter

public actual object QueryGetPricesResponseConverter : ProtobufConverter<QueryGetPricesResponse> by
    QueryGetPricesResponseJvmConverter

public actual object QueryGetPriceRequestConverter : ProtobufConverter<QueryGetPriceRequest> by
    QueryGetPriceRequestJvmConverter

public actual object QueryGetPriceResponseConverter : ProtobufConverter<QueryGetPriceResponse> by
    QueryGetPriceResponseJvmConverter

public actual object QueryGetLatestPriceRequestConverter :
    ProtobufConverter<QueryGetLatestPriceRequest> by QueryGetLatestPriceRequestJvmConverter

public actual object QueryGetLatestPriceResponseConverter :
    ProtobufConverter<QueryGetLatestPriceResponse> by QueryGetLatestPriceResponseJvmConverter

public actual object QueryGetTwapsRequestConverter : ProtobufConverter<QueryGetTwapsRequest> by
    QueryGetTwapsRequestJvmConverter

public actual object QueryGetTwapsResponseConverter : ProtobufConverter<QueryGetTwapsResponse> by
    QueryGetTwapsResponseJvmConverter

public actual object QueryAssetListRequestConverter : ProtobufConverter<QueryAssetListRequest> by
    QueryAssetListRequestJvmConverter

public actual object QueryAssetListResponseConverter : ProtobufConverter<QueryAssetListResponse> by
    QueryAssetListResponseJvmConverter

public actual object QueryAssetMetadataRequestConverter :
    ProtobufConverter<QueryAssetMetadataRequest> by QueryAssetMetadataRequestJvmConverter

public actual object QueryAssetMetadataResponseConverter :
    ProtobufConverter<QueryAssetMetadataResponse> by QueryAssetMetadataResponseJvmConverter

public actual object QueryRegisteredPairsRequestConverter :
    ProtobufConverter<QueryRegisteredPairsRequest> by QueryRegisteredPairsRequestJvmConverter

public actual object QueryRegisteredPairsResponseConverter :
    ProtobufConverter<QueryRegisteredPairsResponse> by QueryRegisteredPairsResponseJvmConverter

public actual object QueryRegisteredContractRequestConverter :
    ProtobufConverter<QueryRegisteredContractRequest> by QueryRegisteredContractRequestJvmConverter

public actual object QueryRegisteredContractResponseConverter :
    ProtobufConverter<QueryRegisteredContractResponse> by
    QueryRegisteredContractResponseJvmConverter

public actual object QueryGetOrdersRequestConverter : ProtobufConverter<QueryGetOrdersRequest> by
    QueryGetOrdersRequestJvmConverter

public actual object QueryGetOrdersResponseConverter : ProtobufConverter<QueryGetOrdersResponse> by
    QueryGetOrdersResponseJvmConverter

public actual object QueryGetOrderByIDRequestConverter : ProtobufConverter<QueryGetOrderByIDRequest>
    by QueryGetOrderByIDRequestJvmConverter

public actual object QueryGetOrderByIDResponseConverter :
    ProtobufConverter<QueryGetOrderByIDResponse> by QueryGetOrderByIDResponseJvmConverter

public actual object QueryGetHistoricalPricesRequestConverter :
    ProtobufConverter<QueryGetHistoricalPricesRequest> by
    QueryGetHistoricalPricesRequestJvmConverter

public actual object QueryGetHistoricalPricesResponseConverter :
    ProtobufConverter<QueryGetHistoricalPricesResponse> by
    QueryGetHistoricalPricesResponseJvmConverter

public actual object QueryGetMarketSummaryRequestConverter :
    ProtobufConverter<QueryGetMarketSummaryRequest> by QueryGetMarketSummaryRequestJvmConverter

public actual object QueryGetMarketSummaryResponseConverter :
    ProtobufConverter<QueryGetMarketSummaryResponse> by QueryGetMarketSummaryResponseJvmConverter

public actual object QueryOrderSimulationRequestConverter :
    ProtobufConverter<QueryOrderSimulationRequest> by QueryOrderSimulationRequestJvmConverter

public actual object QueryOrderSimulationResponseConverter :
    ProtobufConverter<QueryOrderSimulationResponse> by QueryOrderSimulationResponseJvmConverter

public actual object QueryGetMatchResultRequestConverter :
    ProtobufConverter<QueryGetMatchResultRequest> by QueryGetMatchResultRequestJvmConverter

public actual object QueryGetMatchResultResponseConverter :
    ProtobufConverter<QueryGetMatchResultResponse> by QueryGetMatchResultResponseJvmConverter

public actual object QueryGetOrderCountRequestConverter :
    ProtobufConverter<QueryGetOrderCountRequest> by QueryGetOrderCountRequestJvmConverter

public actual object QueryGetOrderCountResponseConverter :
    ProtobufConverter<QueryGetOrderCountResponse> by QueryGetOrderCountResponseJvmConverter

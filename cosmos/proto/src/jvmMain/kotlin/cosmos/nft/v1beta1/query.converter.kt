// Transform from cosmos/nft/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.nft.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryBalanceRequestConverter : ProtobufConverter<QueryBalanceRequest> by
    QueryBalanceRequestJvmConverter

public actual object QueryBalanceResponseConverter : ProtobufConverter<QueryBalanceResponse> by
    QueryBalanceResponseJvmConverter

public actual object QueryOwnerRequestConverter : ProtobufConverter<QueryOwnerRequest> by
    QueryOwnerRequestJvmConverter

public actual object QueryOwnerResponseConverter : ProtobufConverter<QueryOwnerResponse> by
    QueryOwnerResponseJvmConverter

public actual object QuerySupplyRequestConverter : ProtobufConverter<QuerySupplyRequest> by
    QuerySupplyRequestJvmConverter

public actual object QuerySupplyResponseConverter : ProtobufConverter<QuerySupplyResponse> by
    QuerySupplyResponseJvmConverter

public actual object QueryNFTsRequestConverter : ProtobufConverter<QueryNFTsRequest> by
    QueryNFTsRequestJvmConverter

public actual object QueryNFTsResponseConverter : ProtobufConverter<QueryNFTsResponse> by
    QueryNFTsResponseJvmConverter

public actual object QueryNFTRequestConverter : ProtobufConverter<QueryNFTRequest> by
    QueryNFTRequestJvmConverter

public actual object QueryNFTResponseConverter : ProtobufConverter<QueryNFTResponse> by
    QueryNFTResponseJvmConverter

public actual object QueryClassRequestConverter : ProtobufConverter<QueryClassRequest> by
    QueryClassRequestJvmConverter

public actual object QueryClassResponseConverter : ProtobufConverter<QueryClassResponse> by
    QueryClassResponseJvmConverter

public actual object QueryClassesRequestConverter : ProtobufConverter<QueryClassesRequest> by
    QueryClassesRequestJvmConverter

public actual object QueryClassesResponseConverter : ProtobufConverter<QueryClassesResponse> by
    QueryClassesResponseJvmConverter

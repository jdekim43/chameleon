// Transform from cosmos/slashing/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.slashing.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

public actual object QuerySigningInfoRequestConverter : ProtobufConverter<QuerySigningInfoRequest>
    by QuerySigningInfoRequestJvmConverter

public actual object QuerySigningInfoResponseConverter : ProtobufConverter<QuerySigningInfoResponse>
    by QuerySigningInfoResponseJvmConverter

public actual object QuerySigningInfosRequestConverter : ProtobufConverter<QuerySigningInfosRequest>
    by QuerySigningInfosRequestJvmConverter

public actual object QuerySigningInfosResponseConverter :
    ProtobufConverter<QuerySigningInfosResponse> by QuerySigningInfosResponseJvmConverter

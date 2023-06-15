// Transform from terra/market/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.market.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QuerySwapRequestConverter : ProtobufConverter<QuerySwapRequest> by
    QuerySwapRequestJvmConverter

public actual object QuerySwapResponseConverter : ProtobufConverter<QuerySwapResponse> by
    QuerySwapResponseJvmConverter

public actual object QueryTerraPoolDeltaRequestConverter :
    ProtobufConverter<QueryTerraPoolDeltaRequest> by QueryTerraPoolDeltaRequestJvmConverter

public actual object QueryTerraPoolDeltaResponseConverter :
    ProtobufConverter<QueryTerraPoolDeltaResponse> by QueryTerraPoolDeltaResponseJvmConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

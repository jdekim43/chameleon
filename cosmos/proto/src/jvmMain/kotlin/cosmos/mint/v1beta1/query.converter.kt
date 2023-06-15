// Transform from cosmos/mint/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.mint.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

public actual object QueryInflationRequestConverter : ProtobufConverter<QueryInflationRequest> by
    QueryInflationRequestJvmConverter

public actual object QueryInflationResponseConverter : ProtobufConverter<QueryInflationResponse> by
    QueryInflationResponseJvmConverter

public actual object QueryAnnualProvisionsRequestConverter :
    ProtobufConverter<QueryAnnualProvisionsRequest> by QueryAnnualProvisionsRequestJvmConverter

public actual object QueryAnnualProvisionsResponseConverter :
    ProtobufConverter<QueryAnnualProvisionsResponse> by QueryAnnualProvisionsResponseJvmConverter

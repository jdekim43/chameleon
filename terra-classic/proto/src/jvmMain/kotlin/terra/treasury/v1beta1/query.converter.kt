// Transform from terra/treasury/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.treasury.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryTaxRateRequestConverter : ProtobufConverter<QueryTaxRateRequest> by
    QueryTaxRateRequestJvmConverter

public actual object QueryTaxRateResponseConverter : ProtobufConverter<QueryTaxRateResponse> by
    QueryTaxRateResponseJvmConverter

public actual object QueryTaxCapRequestConverter : ProtobufConverter<QueryTaxCapRequest> by
    QueryTaxCapRequestJvmConverter

public actual object QueryTaxCapResponseConverter : ProtobufConverter<QueryTaxCapResponse> by
    QueryTaxCapResponseJvmConverter

public actual object QueryTaxCapsRequestConverter : ProtobufConverter<QueryTaxCapsRequest> by
    QueryTaxCapsRequestJvmConverter

public actual object QueryTaxCapsResponseItemConverter : ProtobufConverter<QueryTaxCapsResponseItem>
    by QueryTaxCapsResponseItemJvmConverter

public actual object QueryTaxCapsResponseConverter : ProtobufConverter<QueryTaxCapsResponse> by
    QueryTaxCapsResponseJvmConverter

public actual object QueryRewardWeightRequestConverter : ProtobufConverter<QueryRewardWeightRequest>
    by QueryRewardWeightRequestJvmConverter

public actual object QueryRewardWeightResponseConverter :
    ProtobufConverter<QueryRewardWeightResponse> by QueryRewardWeightResponseJvmConverter

public actual object QueryTaxProceedsRequestConverter : ProtobufConverter<QueryTaxProceedsRequest>
    by QueryTaxProceedsRequestJvmConverter

public actual object QueryTaxProceedsResponseConverter : ProtobufConverter<QueryTaxProceedsResponse>
    by QueryTaxProceedsResponseJvmConverter

public actual object QuerySeigniorageProceedsRequestConverter :
    ProtobufConverter<QuerySeigniorageProceedsRequest> by
    QuerySeigniorageProceedsRequestJvmConverter

public actual object QuerySeigniorageProceedsResponseConverter :
    ProtobufConverter<QuerySeigniorageProceedsResponse> by
    QuerySeigniorageProceedsResponseJvmConverter

public actual object QueryIndicatorsRequestConverter : ProtobufConverter<QueryIndicatorsRequest> by
    QueryIndicatorsRequestJvmConverter

public actual object QueryIndicatorsResponseConverter : ProtobufConverter<QueryIndicatorsResponse>
    by QueryIndicatorsResponseJvmConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

public actual object QueryBurnTaxExemptionListRequestConverter :
    ProtobufConverter<QueryBurnTaxExemptionListRequest> by
    QueryBurnTaxExemptionListRequestJvmConverter

public actual object QueryBurnTaxExemptionListResponseConverter :
    ProtobufConverter<QueryBurnTaxExemptionListResponse> by
    QueryBurnTaxExemptionListResponseJvmConverter

// Transform from cosmos/feegrant/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.feegrant.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryAllowanceRequestConverter : ProtobufConverter<QueryAllowanceRequest> by
    QueryAllowanceRequestJvmConverter

public actual object QueryAllowanceResponseConverter : ProtobufConverter<QueryAllowanceResponse> by
    QueryAllowanceResponseJvmConverter

public actual object QueryAllowancesRequestConverter : ProtobufConverter<QueryAllowancesRequest> by
    QueryAllowancesRequestJvmConverter

public actual object QueryAllowancesResponseConverter : ProtobufConverter<QueryAllowancesResponse>
    by QueryAllowancesResponseJvmConverter

public actual object QueryAllowancesByGranterRequestConverter :
    ProtobufConverter<QueryAllowancesByGranterRequest> by
    QueryAllowancesByGranterRequestJvmConverter

public actual object QueryAllowancesByGranterResponseConverter :
    ProtobufConverter<QueryAllowancesByGranterResponse> by
    QueryAllowancesByGranterResponseJvmConverter

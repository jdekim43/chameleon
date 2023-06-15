// Transform from cosmos/authz/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.authz.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryGrantsRequestConverter : ProtobufConverter<QueryGrantsRequest> by
    QueryGrantsRequestJvmConverter

public actual object QueryGrantsResponseConverter : ProtobufConverter<QueryGrantsResponse> by
    QueryGrantsResponseJvmConverter

public actual object QueryGranterGrantsRequestConverter :
    ProtobufConverter<QueryGranterGrantsRequest> by QueryGranterGrantsRequestJvmConverter

public actual object QueryGranterGrantsResponseConverter :
    ProtobufConverter<QueryGranterGrantsResponse> by QueryGranterGrantsResponseJvmConverter

public actual object QueryGranteeGrantsRequestConverter :
    ProtobufConverter<QueryGranteeGrantsRequest> by QueryGranteeGrantsRequestJvmConverter

public actual object QueryGranteeGrantsResponseConverter :
    ProtobufConverter<QueryGranteeGrantsResponse> by QueryGranteeGrantsResponseJvmConverter

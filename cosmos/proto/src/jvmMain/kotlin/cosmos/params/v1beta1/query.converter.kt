// Transform from cosmos/params/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.params.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryParamsRequestConverter : ProtobufConverter<QueryParamsRequest> by
    QueryParamsRequestJvmConverter

public actual object QueryParamsResponseConverter : ProtobufConverter<QueryParamsResponse> by
    QueryParamsResponseJvmConverter

public actual object QuerySubspacesRequestConverter : ProtobufConverter<QuerySubspacesRequest> by
    QuerySubspacesRequestJvmConverter

public actual object QuerySubspacesResponseConverter : ProtobufConverter<QuerySubspacesResponse> by
    QuerySubspacesResponseJvmConverter

public actual object SubspaceConverter : ProtobufConverter<Subspace> by SubspaceJvmConverter

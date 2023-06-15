// Transform from cosmos/base/query/v1beta1/pagination.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.query.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object PageRequestConverter : ProtobufConverter<PageRequest> by
    PageRequestJvmConverter

public actual object PageResponseConverter : ProtobufConverter<PageResponse> by
    PageResponseJvmConverter

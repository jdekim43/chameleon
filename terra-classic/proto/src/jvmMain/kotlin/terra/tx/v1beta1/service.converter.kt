// Transform from terra/tx/v1beta1/service.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.tx.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ComputeTaxRequestConverter : ProtobufConverter<ComputeTaxRequest> by
    ComputeTaxRequestJvmConverter

public actual object ComputeTaxResponseConverter : ProtobufConverter<ComputeTaxResponse> by
    ComputeTaxResponseJvmConverter

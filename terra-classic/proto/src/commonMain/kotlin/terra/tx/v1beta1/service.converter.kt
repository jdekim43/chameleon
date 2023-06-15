// Transform from terra/tx/v1beta1/service.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.tx.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ComputeTaxRequestConverter : ProtobufConverter<ComputeTaxRequest>

public fun ComputeTaxRequest.toAny(): Any = Any(ComputeTaxRequest.TYPE_URL,
    with(ComputeTaxRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ComputeTaxRequest>): ComputeTaxRequest {
  if (typeUrl != ComputeTaxRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ComputeTaxResponseConverter : ProtobufConverter<ComputeTaxResponse>

public fun ComputeTaxResponse.toAny(): Any = Any(ComputeTaxResponse.TYPE_URL,
    with(ComputeTaxResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ComputeTaxResponse>): ComputeTaxResponse {
  if (typeUrl != ComputeTaxResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

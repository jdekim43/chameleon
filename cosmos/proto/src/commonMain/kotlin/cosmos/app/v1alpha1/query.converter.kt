// Transform from cosmos/app/v1alpha1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.app.v1alpha1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryConfigRequestConverter : ProtobufConverter<QueryConfigRequest>

public fun QueryConfigRequest.toAny(): Any = Any(QueryConfigRequest.TYPE_URL,
    with(QueryConfigRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryConfigRequest>): QueryConfigRequest {
  if (typeUrl != QueryConfigRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryConfigResponseConverter : ProtobufConverter<QueryConfigResponse>

public fun QueryConfigResponse.toAny(): Any = Any(QueryConfigResponse.TYPE_URL,
    with(QueryConfigResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryConfigResponse>): QueryConfigResponse {
  if (typeUrl != QueryConfigResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

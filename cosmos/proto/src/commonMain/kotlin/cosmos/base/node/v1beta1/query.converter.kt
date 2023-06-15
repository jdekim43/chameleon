// Transform from cosmos/base/node/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.node.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ConfigRequestConverter : ProtobufConverter<ConfigRequest>

public fun ConfigRequest.toAny(): Any = Any(ConfigRequest.TYPE_URL, with(ConfigRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ConfigRequest>): ConfigRequest {
  if (typeUrl != ConfigRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ConfigResponseConverter : ProtobufConverter<ConfigResponse>

public fun ConfigResponse.toAny(): Any = Any(ConfigResponse.TYPE_URL, with(ConfigResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ConfigResponse>): ConfigResponse {
  if (typeUrl != ConfigResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

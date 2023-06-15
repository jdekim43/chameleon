// Transform from cosmos/autocli/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.autocli.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object AppOptionsRequestConverter : ProtobufConverter<AppOptionsRequest>

public fun AppOptionsRequest.toAny(): Any = Any(AppOptionsRequest.TYPE_URL,
    with(AppOptionsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AppOptionsRequest>): AppOptionsRequest {
  if (typeUrl != AppOptionsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AppOptionsResponseConverter : ProtobufConverter<AppOptionsResponse>

public fun AppOptionsResponse.toAny(): Any = Any(AppOptionsResponse.TYPE_URL,
    with(AppOptionsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AppOptionsResponse>): AppOptionsResponse {
  if (typeUrl != AppOptionsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

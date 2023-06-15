// Transform from cosmos/base/query/v1beta1/pagination.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.query.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object PageRequestConverter : ProtobufConverter<PageRequest>

public fun PageRequest.toAny(): Any = Any(PageRequest.TYPE_URL, with(PageRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PageRequest>): PageRequest {
  if (typeUrl != PageRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PageResponseConverter : ProtobufConverter<PageResponse>

public fun PageResponse.toAny(): Any = Any(PageResponse.TYPE_URL, with(PageResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PageResponse>): PageResponse {
  if (typeUrl != PageResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

// Transform from dex/tick_size.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object TickSizeConverter : ProtobufConverter<TickSize>

public fun TickSize.toAny(): Any = Any(TickSize.TYPE_URL, with(TickSizeConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TickSize>): TickSize {
  if (typeUrl != TickSize.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

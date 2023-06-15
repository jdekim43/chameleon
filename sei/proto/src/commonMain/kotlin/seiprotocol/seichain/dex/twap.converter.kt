// Transform from dex/twap.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object TwapConverter : ProtobufConverter<Twap>

public fun Twap.toAny(): Any = Any(Twap.TYPE_URL, with(TwapConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Twap>): Twap {
  if (typeUrl != Twap.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

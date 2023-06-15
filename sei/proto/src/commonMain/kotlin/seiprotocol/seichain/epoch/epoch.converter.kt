// Transform from epoch/epoch.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.epoch

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object EpochConverter : ProtobufConverter<Epoch>

public fun Epoch.toAny(): Any = Any(Epoch.TYPE_URL, with(EpochConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Epoch>): Epoch {
  if (typeUrl != Epoch.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

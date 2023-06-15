// Transform from dex/match_result.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MatchResultConverter : ProtobufConverter<MatchResult>

public fun MatchResult.toAny(): Any = Any(MatchResult.TYPE_URL, with(MatchResultConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MatchResult>): MatchResult {
  if (typeUrl != MatchResult.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

// Transform from alliance/params.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ParamsConverter : ProtobufConverter<Params>

public fun Params.toAny(): Any = Any(Params.TYPE_URL, with(ParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Params>): Params {
  if (typeUrl != Params.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RewardHistoryConverter : ProtobufConverter<RewardHistory>

public fun RewardHistory.toAny(): Any = Any(RewardHistory.TYPE_URL, with(RewardHistoryConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RewardHistory>): RewardHistory {
  if (typeUrl != RewardHistory.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

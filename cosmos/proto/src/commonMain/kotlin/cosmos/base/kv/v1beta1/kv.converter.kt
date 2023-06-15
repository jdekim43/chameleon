// Transform from cosmos/base/kv/v1beta1/kv.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.kv.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object PairsConverter : ProtobufConverter<Pairs>

public fun Pairs.toAny(): Any = Any(Pairs.TYPE_URL, with(PairsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Pairs>): Pairs {
  if (typeUrl != Pairs.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PairConverter : ProtobufConverter<Pair>

public fun Pair.toAny(): Any = Any(Pair.TYPE_URL, with(PairConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Pair>): Pair {
  if (typeUrl != Pair.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

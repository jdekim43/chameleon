// Transform from tendermint/libs/bits/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.libs.bits

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object BitArrayConverter : ProtobufConverter<BitArray>

public fun BitArray.toAny(): Any = Any(BitArray.TYPE_URL, with(BitArrayConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BitArray>): BitArray {
  if (typeUrl != BitArray.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

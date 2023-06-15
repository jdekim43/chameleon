// Transform from tendermint/types/block.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object BlockConverter : ProtobufConverter<Block>

public fun Block.toAny(): Any = Any(Block.TYPE_URL, with(BlockConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Block>): Block {
  if (typeUrl != Block.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

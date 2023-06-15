// Transform from cosmos/base/tendermint/v1beta1/types.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.tendermint.v1beta1

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

public expect object HeaderConverter : ProtobufConverter<Header>

public fun Header.toAny(): Any = Any(Header.TYPE_URL, with(HeaderConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Header>): Header {
  if (typeUrl != Header.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

// Transform from cosmos/nft/v1beta1/nft.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.nft.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ClassConverter : ProtobufConverter<Class>

public fun Class.toAny(): Any = Any(Class.TYPE_URL, with(ClassConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Class>): Class {
  if (typeUrl != Class.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object NFTConverter : ProtobufConverter<NFT>

public fun NFT.toAny(): Any = Any(NFT.TYPE_URL, with(NFTConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<NFT>): NFT {
  if (typeUrl != NFT.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

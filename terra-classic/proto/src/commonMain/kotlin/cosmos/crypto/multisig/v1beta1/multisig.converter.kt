// Transform from cosmos/crypto/multisig/v1beta1/multisig.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crypto.multisig.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MultiSignatureConverter : ProtobufConverter<MultiSignature>

public fun MultiSignature.toAny(): Any = Any(MultiSignature.TYPE_URL, with(MultiSignatureConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MultiSignature>): MultiSignature {
  if (typeUrl != MultiSignature.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CompactBitArrayConverter : ProtobufConverter<CompactBitArray>

public fun CompactBitArray.toAny(): Any = Any(CompactBitArray.TYPE_URL,
    with(CompactBitArrayConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CompactBitArray>): CompactBitArray {
  if (typeUrl != CompactBitArray.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

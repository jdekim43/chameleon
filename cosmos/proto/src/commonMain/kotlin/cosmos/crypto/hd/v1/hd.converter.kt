// Transform from cosmos/crypto/hd/v1/hd.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crypto.hd.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object BIP44ParamsConverter : ProtobufConverter<BIP44Params>

public fun BIP44Params.toAny(): Any = Any(BIP44Params.TYPE_URL, with(BIP44ParamsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BIP44Params>): BIP44Params {
  if (typeUrl != BIP44Params.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

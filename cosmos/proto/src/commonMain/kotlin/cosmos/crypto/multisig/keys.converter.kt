// Transform from cosmos/crypto/multisig/keys.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crypto.multisig

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object LegacyAminoPubKeyConverter : ProtobufConverter<LegacyAminoPubKey>

public fun LegacyAminoPubKey.toAny(): Any = Any(LegacyAminoPubKey.TYPE_URL,
    with(LegacyAminoPubKeyConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<LegacyAminoPubKey>): LegacyAminoPubKey {
  if (typeUrl != LegacyAminoPubKey.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

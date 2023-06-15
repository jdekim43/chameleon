// Transform from tendermint/crypto/keys.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.crypto

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object PublicKeyConverter : ProtobufConverter<PublicKey>

public fun PublicKey.toAny(): Any = Any(PublicKey.TYPE_URL, with(PublicKeyConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<PublicKey>): PublicKey {
  if (typeUrl != PublicKey.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

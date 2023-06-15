// Transform from cosmos/crypto/secp256r1/keys.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crypto.secp256r1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object PubKeyConverter : ProtobufConverter<PubKey>

public fun PubKey.toAny(): Any = Any(PubKey.TYPE_URL, with(PubKeyConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PubKey>): PubKey {
  if (typeUrl != PubKey.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PrivKeyConverter : ProtobufConverter<PrivKey>

public fun PrivKey.toAny(): Any = Any(PrivKey.TYPE_URL, with(PrivKeyConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PrivKey>): PrivKey {
  if (typeUrl != PrivKey.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

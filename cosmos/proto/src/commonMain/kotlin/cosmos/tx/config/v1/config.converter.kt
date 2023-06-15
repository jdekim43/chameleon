// Transform from cosmos/tx/config/v1/config.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.tx.config.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ConfigConverter : ProtobufConverter<Config>

public fun Config.toAny(): Any = Any(Config.TYPE_URL, with(ConfigConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Config>): Config {
  if (typeUrl != Config.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

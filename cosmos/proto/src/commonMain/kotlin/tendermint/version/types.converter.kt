// Transform from tendermint/version/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.version

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object AppConverter : ProtobufConverter<App>

public fun App.toAny(): Any = Any(App.TYPE_URL, with(AppConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<App>): App {
  if (typeUrl != App.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ConsensusConverter : ProtobufConverter<Consensus>

public fun Consensus.toAny(): Any = Any(Consensus.TYPE_URL, with(ConsensusConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<Consensus>): Consensus {
  if (typeUrl != Consensus.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

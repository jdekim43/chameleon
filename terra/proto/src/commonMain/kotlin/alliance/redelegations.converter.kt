// Transform from alliance/redelegations.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueuedRedelegationConverter : ProtobufConverter<QueuedRedelegation>

public fun QueuedRedelegation.toAny(): Any = Any(QueuedRedelegation.TYPE_URL,
    with(QueuedRedelegationConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueuedRedelegation>): QueuedRedelegation {
  if (typeUrl != QueuedRedelegation.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RedelegationConverter : ProtobufConverter<Redelegation>

public fun Redelegation.toAny(): Any = Any(Redelegation.TYPE_URL, with(RedelegationConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Redelegation>): Redelegation {
  if (typeUrl != Redelegation.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RedelegationEntryConverter : ProtobufConverter<RedelegationEntry>

public fun RedelegationEntry.toAny(): Any = Any(RedelegationEntry.TYPE_URL,
    with(RedelegationEntryConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RedelegationEntry>): RedelegationEntry {
  if (typeUrl != RedelegationEntry.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

// Transform from alliance/delegations.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object DelegationConverter : ProtobufConverter<Delegation>

public fun Delegation.toAny(): Any = Any(Delegation.TYPE_URL, with(DelegationConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Delegation>): Delegation {
  if (typeUrl != Delegation.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object UndelegationConverter : ProtobufConverter<Undelegation>

public fun Undelegation.toAny(): Any = Any(Undelegation.TYPE_URL, with(UndelegationConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Undelegation>): Undelegation {
  if (typeUrl != Undelegation.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueuedUndelegationConverter : ProtobufConverter<QueuedUndelegation>

public fun QueuedUndelegation.toAny(): Any = Any(QueuedUndelegation.TYPE_URL,
    with(QueuedUndelegationConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueuedUndelegation>): QueuedUndelegation {
  if (typeUrl != QueuedUndelegation.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AllianceValidatorInfoConverter : ProtobufConverter<AllianceValidatorInfo>

public fun AllianceValidatorInfo.toAny(): Any = Any(AllianceValidatorInfo.TYPE_URL,
    with(AllianceValidatorInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AllianceValidatorInfo>): AllianceValidatorInfo {
  if (typeUrl != AllianceValidatorInfo.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

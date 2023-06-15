// Transform from cosmos/capability/v1beta1/capability.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.capability.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object CapabilityConverter : ProtobufConverter<Capability>

public fun Capability.toAny(): Any = Any(Capability.TYPE_URL, with(CapabilityConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Capability>): Capability {
  if (typeUrl != Capability.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OwnerConverter : ProtobufConverter<Owner>

public fun Owner.toAny(): Any = Any(Owner.TYPE_URL, with(OwnerConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Owner>): Owner {
  if (typeUrl != Owner.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CapabilityOwnersConverter : ProtobufConverter<CapabilityOwners>

public fun CapabilityOwners.toAny(): Any = Any(CapabilityOwners.TYPE_URL,
    with(CapabilityOwnersConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CapabilityOwners>): CapabilityOwners {
  if (typeUrl != CapabilityOwners.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

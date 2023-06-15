// Transform from cosmos_proto/cosmos.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos_proto

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object InterfaceDescriptorConverter : ProtobufConverter<InterfaceDescriptor>

public fun InterfaceDescriptor.toAny(): Any = Any(InterfaceDescriptor.TYPE_URL,
    with(InterfaceDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<InterfaceDescriptor>): InterfaceDescriptor {
  if (typeUrl != InterfaceDescriptor.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ScalarDescriptorConverter : ProtobufConverter<ScalarDescriptor>

public fun ScalarDescriptor.toAny(): Any = Any(ScalarDescriptor.TYPE_URL,
    with(ScalarDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ScalarDescriptor>): ScalarDescriptor {
  if (typeUrl != ScalarDescriptor.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

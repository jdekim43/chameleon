// Transform from cosmos/orm/v1/orm.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.orm.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object TableDescriptorConverter : ProtobufConverter<TableDescriptor>

public fun TableDescriptor.toAny(): Any = Any(TableDescriptor.TYPE_URL,
    with(TableDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TableDescriptor>): TableDescriptor {
  if (typeUrl != TableDescriptor.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PrimaryKeyDescriptorConverter : ProtobufConverter<PrimaryKeyDescriptor>

public fun PrimaryKeyDescriptor.toAny(): Any = Any(PrimaryKeyDescriptor.TYPE_URL,
    with(PrimaryKeyDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PrimaryKeyDescriptor>): PrimaryKeyDescriptor {
  if (typeUrl != PrimaryKeyDescriptor.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SecondaryIndexDescriptorConverter : ProtobufConverter<SecondaryIndexDescriptor>

public fun SecondaryIndexDescriptor.toAny(): Any = Any(SecondaryIndexDescriptor.TYPE_URL,
    with(SecondaryIndexDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SecondaryIndexDescriptor>):
    SecondaryIndexDescriptor {
  if (typeUrl != SecondaryIndexDescriptor.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SingletonDescriptorConverter : ProtobufConverter<SingletonDescriptor>

public fun SingletonDescriptor.toAny(): Any = Any(SingletonDescriptor.TYPE_URL,
    with(SingletonDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SingletonDescriptor>): SingletonDescriptor {
  if (typeUrl != SingletonDescriptor.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

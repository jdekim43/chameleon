// Transform from cosmos_proto/cosmos.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos_proto

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object InterfaceDescriptorJvmConverter :
    ProtobufTypeMapper<InterfaceDescriptor, Cosmos.InterfaceDescriptor> {
  public override val descriptor: Descriptors.Descriptor =
      Cosmos.InterfaceDescriptor.getDescriptor()

  public override val parser: Parser<Cosmos.InterfaceDescriptor> =
      Cosmos.InterfaceDescriptor.parser()

  public override fun convert(obj: Cosmos.InterfaceDescriptor): InterfaceDescriptor =
      InterfaceDescriptor(
  	name = obj.getName(),
  	description = obj.getDescription(),
  )

  public override fun convert(obj: InterfaceDescriptor): Cosmos.InterfaceDescriptor {
    val builder = Cosmos.InterfaceDescriptor.newBuilder()
    builder.setName(obj.name)
    builder.setDescription(obj.description)
    return builder.build()
  }
}

public object ScalarDescriptorJvmConverter :
    ProtobufTypeMapper<ScalarDescriptor, Cosmos.ScalarDescriptor> {
  public override val descriptor: Descriptors.Descriptor = Cosmos.ScalarDescriptor.getDescriptor()

  public override val parser: Parser<Cosmos.ScalarDescriptor> = Cosmos.ScalarDescriptor.parser()

  public override fun convert(obj: Cosmos.ScalarDescriptor): ScalarDescriptor = ScalarDescriptor(
  	name = obj.getName(),
  	description = obj.getDescription(),
  	fieldType = obj.getFieldTypeList().map { ScalarType.forNumber(it.number) },
  )

  public override fun convert(obj: ScalarDescriptor): Cosmos.ScalarDescriptor {
    val builder = Cosmos.ScalarDescriptor.newBuilder()
    builder.setName(obj.name)
    builder.setDescription(obj.description)
    builder.addAllFieldType(obj.fieldType.map { Cosmos.ScalarType.forNumber(it.number) })
    return builder.build()
  }
}

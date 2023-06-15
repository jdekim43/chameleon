// Transform from cosmos/capability/v1beta1/capability.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.capability.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object CapabilityJvmConverter :
    ProtobufTypeMapper<Capability, CapabilityOuterClass.Capability> {
  public override val descriptor: Descriptors.Descriptor =
      CapabilityOuterClass.Capability.getDescriptor()

  public override val parser: Parser<CapabilityOuterClass.Capability> =
      CapabilityOuterClass.Capability.parser()

  public override fun convert(obj: CapabilityOuterClass.Capability): Capability = Capability(
  	index = obj.getIndex().asKotlinType,
  )

  public override fun convert(obj: Capability): CapabilityOuterClass.Capability {
    val builder = CapabilityOuterClass.Capability.newBuilder()
    builder.setIndex(obj.index.asJavaType)
    return builder.build()
  }
}

public object OwnerJvmConverter : ProtobufTypeMapper<Owner, CapabilityOuterClass.Owner> {
  public override val descriptor: Descriptors.Descriptor =
      CapabilityOuterClass.Owner.getDescriptor()

  public override val parser: Parser<CapabilityOuterClass.Owner> =
      CapabilityOuterClass.Owner.parser()

  public override fun convert(obj: CapabilityOuterClass.Owner): Owner = Owner(
  	module = obj.getModule(),
  	name = obj.getName(),
  )

  public override fun convert(obj: Owner): CapabilityOuterClass.Owner {
    val builder = CapabilityOuterClass.Owner.newBuilder()
    builder.setModule(obj.module)
    builder.setName(obj.name)
    return builder.build()
  }
}

public object CapabilityOwnersJvmConverter :
    ProtobufTypeMapper<CapabilityOwners, CapabilityOuterClass.CapabilityOwners> {
  public override val descriptor: Descriptors.Descriptor =
      CapabilityOuterClass.CapabilityOwners.getDescriptor()

  public override val parser: Parser<CapabilityOuterClass.CapabilityOwners> =
      CapabilityOuterClass.CapabilityOwners.parser()

  public override fun convert(obj: CapabilityOuterClass.CapabilityOwners): CapabilityOwners =
      CapabilityOwners(
  	owners = obj.getOwnersList().map { OwnerJvmConverter.convert(it) },
  )

  public override fun convert(obj: CapabilityOwners): CapabilityOuterClass.CapabilityOwners {
    val builder = CapabilityOuterClass.CapabilityOwners.newBuilder()
    builder.addAllOwners(obj.owners.map { OwnerJvmConverter.convert(it) })
    return builder.build()
  }
}

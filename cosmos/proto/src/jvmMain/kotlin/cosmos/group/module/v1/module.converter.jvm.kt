// Transform from cosmos/group/module/v1/module.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.group.module.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.DurationJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ModuleJvmConverter : ProtobufTypeMapper<Module, ModuleOuterClass.Module> {
  public override val descriptor: Descriptors.Descriptor = ModuleOuterClass.Module.getDescriptor()

  public override val parser: Parser<ModuleOuterClass.Module> = ModuleOuterClass.Module.parser()

  public override fun convert(obj: ModuleOuterClass.Module): Module = Module(
  	maxExecutionPeriod = DurationJvmConverter.convert(obj.getMaxExecutionPeriod()),
  	maxMetadataLen = obj.getMaxMetadataLen().asKotlinType,
  )

  public override fun convert(obj: Module): ModuleOuterClass.Module {
    val builder = ModuleOuterClass.Module.newBuilder()
    builder.setMaxExecutionPeriod(DurationJvmConverter.convert(obj.maxExecutionPeriod))
    builder.setMaxMetadataLen(obj.maxMetadataLen.asJavaType)
    return builder.build()
  }
}

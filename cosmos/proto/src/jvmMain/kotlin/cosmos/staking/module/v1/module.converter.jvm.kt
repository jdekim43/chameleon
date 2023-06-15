// Transform from cosmos/staking/module/v1/module.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.module.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ModuleJvmConverter : ProtobufTypeMapper<Module, ModuleOuterClass.Module> {
  public override val descriptor: Descriptors.Descriptor = ModuleOuterClass.Module.getDescriptor()

  public override val parser: Parser<ModuleOuterClass.Module> = ModuleOuterClass.Module.parser()

  public override fun convert(obj: ModuleOuterClass.Module): Module = Module(
  	hooksOrder = obj.getHooksOrderList().map { it },
  	authority = obj.getAuthority(),
  )

  public override fun convert(obj: Module): ModuleOuterClass.Module {
    val builder = ModuleOuterClass.Module.newBuilder()
    builder.addAllHooksOrder(obj.hooksOrder.map { it })
    builder.setAuthority(obj.authority)
    return builder.build()
  }
}

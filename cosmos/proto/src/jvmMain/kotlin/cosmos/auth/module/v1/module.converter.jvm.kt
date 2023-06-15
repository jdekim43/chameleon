// Transform from cosmos/auth/module/v1/module.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.auth.module.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ModuleJvmConverter : ProtobufTypeMapper<Module, ModuleOuterClass.Module> {
  public override val descriptor: Descriptors.Descriptor = ModuleOuterClass.Module.getDescriptor()

  public override val parser: Parser<ModuleOuterClass.Module> = ModuleOuterClass.Module.parser()

  public override fun convert(obj: ModuleOuterClass.Module): Module = Module(
  	bech32Prefix = obj.getBech32Prefix(),
  	moduleAccountPermissions = obj.getModuleAccountPermissionsList().map {
      ModuleAccountPermissionJvmConverter.convert(it) },
  	authority = obj.getAuthority(),
  )

  public override fun convert(obj: Module): ModuleOuterClass.Module {
    val builder = ModuleOuterClass.Module.newBuilder()
    builder.setBech32Prefix(obj.bech32Prefix)
    builder.addAllModuleAccountPermissions(obj.moduleAccountPermissions.map {
        ModuleAccountPermissionJvmConverter.convert(it) })
    builder.setAuthority(obj.authority)
    return builder.build()
  }
}

public object ModuleAccountPermissionJvmConverter :
    ProtobufTypeMapper<ModuleAccountPermission, ModuleOuterClass.ModuleAccountPermission> {
  public override val descriptor: Descriptors.Descriptor =
      ModuleOuterClass.ModuleAccountPermission.getDescriptor()

  public override val parser: Parser<ModuleOuterClass.ModuleAccountPermission> =
      ModuleOuterClass.ModuleAccountPermission.parser()

  public override fun convert(obj: ModuleOuterClass.ModuleAccountPermission):
      ModuleAccountPermission = ModuleAccountPermission(
  	account = obj.getAccount(),
  	permissions = obj.getPermissionsList().map { it },
  )

  public override fun convert(obj: ModuleAccountPermission):
      ModuleOuterClass.ModuleAccountPermission {
    val builder = ModuleOuterClass.ModuleAccountPermission.newBuilder()
    builder.setAccount(obj.account)
    builder.addAllPermissions(obj.permissions.map { it })
    return builder.build()
  }
}

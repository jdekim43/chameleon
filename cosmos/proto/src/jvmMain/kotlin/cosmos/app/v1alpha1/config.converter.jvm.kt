// Transform from cosmos/app/v1alpha1/config.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.app.v1alpha1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ConfigJvmConverter : ProtobufTypeMapper<Config, ConfigOuterClass.Config> {
  public override val descriptor: Descriptors.Descriptor = ConfigOuterClass.Config.getDescriptor()

  public override val parser: Parser<ConfigOuterClass.Config> = ConfigOuterClass.Config.parser()

  public override fun convert(obj: ConfigOuterClass.Config): Config = Config(
  	modules = obj.getModulesList().map { ModuleConfigJvmConverter.convert(it) },
  	golangBindings = obj.getGolangBindingsList().map { GolangBindingJvmConverter.convert(it) },
  )

  public override fun convert(obj: Config): ConfigOuterClass.Config {
    val builder = ConfigOuterClass.Config.newBuilder()
    builder.addAllModules(obj.modules.map { ModuleConfigJvmConverter.convert(it) })
    builder.addAllGolangBindings(obj.golangBindings.map { GolangBindingJvmConverter.convert(it) })
    return builder.build()
  }
}

public object ModuleConfigJvmConverter :
    ProtobufTypeMapper<ModuleConfig, ConfigOuterClass.ModuleConfig> {
  public override val descriptor: Descriptors.Descriptor =
      ConfigOuterClass.ModuleConfig.getDescriptor()

  public override val parser: Parser<ConfigOuterClass.ModuleConfig> =
      ConfigOuterClass.ModuleConfig.parser()

  public override fun convert(obj: ConfigOuterClass.ModuleConfig): ModuleConfig = ModuleConfig(
  	name = obj.getName(),
  	config = AnyJvmConverter.convert(obj.getConfig()),
  	golangBindings = obj.getGolangBindingsList().map { GolangBindingJvmConverter.convert(it) },
  )

  public override fun convert(obj: ModuleConfig): ConfigOuterClass.ModuleConfig {
    val builder = ConfigOuterClass.ModuleConfig.newBuilder()
    builder.setName(obj.name)
    builder.setConfig(AnyJvmConverter.convert(obj.config))
    builder.addAllGolangBindings(obj.golangBindings.map { GolangBindingJvmConverter.convert(it) })
    return builder.build()
  }
}

public object GolangBindingJvmConverter :
    ProtobufTypeMapper<GolangBinding, ConfigOuterClass.GolangBinding> {
  public override val descriptor: Descriptors.Descriptor =
      ConfigOuterClass.GolangBinding.getDescriptor()

  public override val parser: Parser<ConfigOuterClass.GolangBinding> =
      ConfigOuterClass.GolangBinding.parser()

  public override fun convert(obj: ConfigOuterClass.GolangBinding): GolangBinding = GolangBinding(
  	interfaceType = obj.getInterfaceType(),
  	implementation = obj.getImplementation(),
  )

  public override fun convert(obj: GolangBinding): ConfigOuterClass.GolangBinding {
    val builder = ConfigOuterClass.GolangBinding.newBuilder()
    builder.setInterfaceType(obj.interfaceType)
    builder.setImplementation(obj.implementation)
    return builder.build()
  }
}

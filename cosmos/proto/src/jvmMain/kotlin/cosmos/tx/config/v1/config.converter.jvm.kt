// Transform from cosmos/tx/config/v1/config.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.tx.config.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ConfigJvmConverter : ProtobufTypeMapper<Config, ConfigOuterClass.Config> {
  public override val descriptor: Descriptors.Descriptor = ConfigOuterClass.Config.getDescriptor()

  public override val parser: Parser<ConfigOuterClass.Config> = ConfigOuterClass.Config.parser()

  public override fun convert(obj: ConfigOuterClass.Config): Config = Config(
  	skipAnteHandler = obj.getSkipAnteHandler(),
  	skipPostHandler = obj.getSkipPostHandler(),
  )

  public override fun convert(obj: Config): ConfigOuterClass.Config {
    val builder = ConfigOuterClass.Config.newBuilder()
    builder.setSkipAnteHandler(obj.skipAnteHandler)
    builder.setSkipPostHandler(obj.skipPostHandler)
    return builder.build()
  }
}

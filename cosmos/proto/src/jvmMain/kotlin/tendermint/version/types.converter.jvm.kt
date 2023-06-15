// Transform from tendermint/version/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.version

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object AppJvmConverter : ProtobufTypeMapper<App, Types.App> {
  public override val descriptor: Descriptors.Descriptor = Types.App.getDescriptor()

  public override val parser: Parser<Types.App> = Types.App.parser()

  public override fun convert(obj: Types.App): App = App(
  	protocol = obj.getProtocol().asKotlinType,
  	software = obj.getSoftware(),
  )

  public override fun convert(obj: App): Types.App {
    val builder = Types.App.newBuilder()
    builder.setProtocol(obj.protocol.asJavaType)
    builder.setSoftware(obj.software)
    return builder.build()
  }
}

public object ConsensusJvmConverter : ProtobufTypeMapper<Consensus, Types.Consensus> {
  public override val descriptor: Descriptors.Descriptor = Types.Consensus.getDescriptor()

  public override val parser: Parser<Types.Consensus> = Types.Consensus.parser()

  public override fun convert(obj: Types.Consensus): Consensus = Consensus(
  	block = obj.getBlock().asKotlinType,
  	app = obj.getApp().asKotlinType,
  )

  public override fun convert(obj: Consensus): Types.Consensus {
    val builder = Types.Consensus.newBuilder()
    builder.setBlock(obj.block.asJavaType)
    builder.setApp(obj.app.asJavaType)
    return builder.build()
  }
}

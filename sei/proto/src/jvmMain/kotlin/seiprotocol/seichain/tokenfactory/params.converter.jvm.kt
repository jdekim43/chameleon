// Transform from tokenfactory/params.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.tokenfactory

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ParamsJvmConverter : ProtobufTypeMapper<Params, ParamsOuterClass.Params> {
  public override val descriptor: Descriptors.Descriptor = ParamsOuterClass.Params.getDescriptor()

  public override val parser: Parser<ParamsOuterClass.Params> = ParamsOuterClass.Params.parser()

  public override fun convert(obj: ParamsOuterClass.Params): Params = Params(
  )

  public override fun convert(obj: Params): ParamsOuterClass.Params {
    val builder = ParamsOuterClass.Params.newBuilder()
    return builder.build()
  }
}

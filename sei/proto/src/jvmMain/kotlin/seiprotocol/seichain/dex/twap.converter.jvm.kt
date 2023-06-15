// Transform from dex/twap.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object TwapJvmConverter : ProtobufTypeMapper<Twap, TwapOuterClass.Twap> {
  public override val descriptor: Descriptors.Descriptor = TwapOuterClass.Twap.getDescriptor()

  public override val parser: Parser<TwapOuterClass.Twap> = TwapOuterClass.Twap.parser()

  public override fun convert(obj: TwapOuterClass.Twap): Twap = Twap(
  	pair = PairJvmConverter.convert(obj.getPair()),
  	twap = obj.getTwap(),
  	lookbackSeconds = obj.getLookbackSeconds().asKotlinType,
  )

  public override fun convert(obj: Twap): TwapOuterClass.Twap {
    val builder = TwapOuterClass.Twap.newBuilder()
    builder.setPair(PairJvmConverter.convert(obj.pair))
    builder.setTwap(obj.twap)
    builder.setLookbackSeconds(obj.lookbackSeconds.asJavaType)
    return builder.build()
  }
}

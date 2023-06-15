// Transform from dex/tick_size.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object TickSizeJvmConverter : ProtobufTypeMapper<TickSize, TickSizeOuterClass.TickSize> {
  public override val descriptor: Descriptors.Descriptor =
      TickSizeOuterClass.TickSize.getDescriptor()

  public override val parser: Parser<TickSizeOuterClass.TickSize> =
      TickSizeOuterClass.TickSize.parser()

  public override fun convert(obj: TickSizeOuterClass.TickSize): TickSize = TickSize(
  	pair = PairJvmConverter.convert(obj.getPair()),
  	ticksize = obj.getTicksize(),
  	contractAddr = obj.getContractAddr(),
  )

  public override fun convert(obj: TickSize): TickSizeOuterClass.TickSize {
    val builder = TickSizeOuterClass.TickSize.newBuilder()
    builder.setPair(PairJvmConverter.convert(obj.pair))
    builder.setTicksize(obj.ticksize)
    builder.setContractAddr(obj.contractAddr)
    return builder.build()
  }
}

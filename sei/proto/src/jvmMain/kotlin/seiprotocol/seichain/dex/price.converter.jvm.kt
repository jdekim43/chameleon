// Transform from dex/price.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object PriceJvmConverter : ProtobufTypeMapper<Price, PriceOuterClass.Price> {
  public override val descriptor: Descriptors.Descriptor = PriceOuterClass.Price.getDescriptor()

  public override val parser: Parser<PriceOuterClass.Price> = PriceOuterClass.Price.parser()

  public override fun convert(obj: PriceOuterClass.Price): Price = Price(
  	snapshotTimestampInSeconds = obj.getSnapshotTimestampInSeconds().asKotlinType,
  	price = obj.getPrice(),
  	pair = PairJvmConverter.convert(obj.getPair()),
  )

  public override fun convert(obj: Price): PriceOuterClass.Price {
    val builder = PriceOuterClass.Price.newBuilder()
    builder.setSnapshotTimestampInSeconds(obj.snapshotTimestampInSeconds.asJavaType)
    builder.setPrice(obj.price)
    builder.setPair(PairJvmConverter.convert(obj.pair))
    return builder.build()
  }
}

public object PriceCandlestickJvmConverter :
    ProtobufTypeMapper<PriceCandlestick, PriceOuterClass.PriceCandlestick> {
  public override val descriptor: Descriptors.Descriptor =
      PriceOuterClass.PriceCandlestick.getDescriptor()

  public override val parser: Parser<PriceOuterClass.PriceCandlestick> =
      PriceOuterClass.PriceCandlestick.parser()

  public override fun convert(obj: PriceOuterClass.PriceCandlestick): PriceCandlestick =
      PriceCandlestick(
  	beginTimestamp = obj.getBeginTimestamp().asKotlinType,
  	endTimestamp = obj.getEndTimestamp().asKotlinType,
  	`open` = obj.getOpen(),
  	high = obj.getHigh(),
  	low = obj.getLow(),
  	close = obj.getClose(),
  	volume = obj.getVolume(),
  )

  public override fun convert(obj: PriceCandlestick): PriceOuterClass.PriceCandlestick {
    val builder = PriceOuterClass.PriceCandlestick.newBuilder()
    builder.setBeginTimestamp(obj.beginTimestamp.asJavaType)
    builder.setEndTimestamp(obj.endTimestamp.asJavaType)
    builder.setOpen(obj.`open`)
    builder.setHigh(obj.high)
    builder.setLow(obj.low)
    builder.setClose(obj.close)
    builder.setVolume(obj.volume)
    return builder.build()
  }
}

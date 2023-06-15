// Transform from dex/price.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object PriceConverter : ProtobufConverter<Price>

public fun Price.toAny(): Any = Any(Price.TYPE_URL, with(PriceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Price>): Price {
  if (typeUrl != Price.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PriceCandlestickConverter : ProtobufConverter<PriceCandlestick>

public fun PriceCandlestick.toAny(): Any = Any(PriceCandlestick.TYPE_URL,
    with(PriceCandlestickConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<PriceCandlestick>): PriceCandlestick {
  if (typeUrl != PriceCandlestick.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

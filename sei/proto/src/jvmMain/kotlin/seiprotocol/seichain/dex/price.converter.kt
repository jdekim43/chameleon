// Transform from dex/price.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object PriceConverter : ProtobufConverter<Price> by PriceJvmConverter

public actual object PriceCandlestickConverter : ProtobufConverter<PriceCandlestick> by
    PriceCandlestickJvmConverter

// Transform from cosmos/base/v1beta1/coin.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object CoinConverter : ProtobufConverter<Coin>

public fun Coin.toAny(): Any = Any(Coin.TYPE_URL, with(CoinConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Coin>): Coin {
  if (typeUrl != Coin.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DecCoinConverter : ProtobufConverter<DecCoin>

public fun DecCoin.toAny(): Any = Any(DecCoin.TYPE_URL, with(DecCoinConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DecCoin>): DecCoin {
  if (typeUrl != DecCoin.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object IntProtoConverter : ProtobufConverter<IntProto>

public fun IntProto.toAny(): Any = Any(IntProto.TYPE_URL, with(IntProtoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<IntProto>): IntProto {
  if (typeUrl != IntProto.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DecProtoConverter : ProtobufConverter<DecProto>

public fun DecProto.toAny(): Any = Any(DecProto.TYPE_URL, with(DecProtoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DecProto>): DecProto {
  if (typeUrl != DecProto.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

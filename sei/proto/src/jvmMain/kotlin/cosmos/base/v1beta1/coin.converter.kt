// Transform from cosmos/base/v1beta1/coin.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object CoinConverter : ProtobufConverter<Coin> by CoinJvmConverter

public actual object DecCoinConverter : ProtobufConverter<DecCoin> by DecCoinJvmConverter

public actual object IntProtoConverter : ProtobufConverter<IntProto> by IntProtoJvmConverter

public actual object DecProtoConverter : ProtobufConverter<DecProto> by DecProtoJvmConverter

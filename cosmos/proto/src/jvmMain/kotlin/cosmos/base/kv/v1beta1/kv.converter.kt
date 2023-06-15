// Transform from cosmos/base/kv/v1beta1/kv.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.kv.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object PairsConverter : ProtobufConverter<Pairs> by PairsJvmConverter

public actual object PairConverter : ProtobufConverter<Pair> by PairJvmConverter

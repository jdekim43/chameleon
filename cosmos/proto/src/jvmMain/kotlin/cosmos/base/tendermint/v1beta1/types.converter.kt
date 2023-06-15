// Transform from cosmos/base/tendermint/v1beta1/types.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.tendermint.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object BlockConverter : ProtobufConverter<Block> by BlockJvmConverter

public actual object HeaderConverter : ProtobufConverter<Header> by HeaderJvmConverter

// Transform from cosmos/mint/v1beta1/mint.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.mint.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MinterConverter : ProtobufConverter<Minter> by MinterJvmConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter

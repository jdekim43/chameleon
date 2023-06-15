// Transform from cosmos/slashing/v1beta1/slashing.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.slashing.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ValidatorSigningInfoConverter : ProtobufConverter<ValidatorSigningInfo> by
    ValidatorSigningInfoJvmConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter

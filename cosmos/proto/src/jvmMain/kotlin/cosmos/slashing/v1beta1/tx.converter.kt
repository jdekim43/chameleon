// Transform from cosmos/slashing/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.slashing.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgUnjailConverter : ProtobufConverter<MsgUnjail> by MsgUnjailJvmConverter

public actual object MsgUnjailResponseConverter : ProtobufConverter<MsgUnjailResponse> by
    MsgUnjailResponseJvmConverter

public actual object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams> by
    MsgUpdateParamsJvmConverter

public actual object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
    by MsgUpdateParamsResponseJvmConverter

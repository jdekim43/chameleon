// Transform from cosmos/consensus/v1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.consensus.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams> by
    MsgUpdateParamsJvmConverter

public actual object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
    by MsgUpdateParamsResponseJvmConverter

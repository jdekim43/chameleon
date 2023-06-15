// Transform from cosmos/crisis/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crisis.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgVerifyInvariantConverter : ProtobufConverter<MsgVerifyInvariant> by
    MsgVerifyInvariantJvmConverter

public actual object MsgVerifyInvariantResponseConverter :
    ProtobufConverter<MsgVerifyInvariantResponse> by MsgVerifyInvariantResponseJvmConverter

public actual object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams> by
    MsgUpdateParamsJvmConverter

public actual object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
    by MsgUpdateParamsResponseJvmConverter

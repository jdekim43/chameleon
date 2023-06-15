// Transform from cosmos/bank/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgSendConverter : ProtobufConverter<MsgSend> by MsgSendJvmConverter

public actual object MsgSendResponseConverter : ProtobufConverter<MsgSendResponse> by
    MsgSendResponseJvmConverter

public actual object MsgMultiSendConverter : ProtobufConverter<MsgMultiSend> by
    MsgMultiSendJvmConverter

public actual object MsgMultiSendResponseConverter : ProtobufConverter<MsgMultiSendResponse> by
    MsgMultiSendResponseJvmConverter

public actual object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams> by
    MsgUpdateParamsJvmConverter

public actual object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>
    by MsgUpdateParamsResponseJvmConverter

public actual object MsgSetSendEnabledConverter : ProtobufConverter<MsgSetSendEnabled> by
    MsgSetSendEnabledJvmConverter

public actual object MsgSetSendEnabledResponseConverter :
    ProtobufConverter<MsgSetSendEnabledResponse> by MsgSetSendEnabledResponseJvmConverter

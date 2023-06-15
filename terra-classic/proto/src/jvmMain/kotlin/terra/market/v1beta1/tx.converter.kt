// Transform from terra/market/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.market.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgSwapConverter : ProtobufConverter<MsgSwap> by MsgSwapJvmConverter

public actual object MsgSwapResponseConverter : ProtobufConverter<MsgSwapResponse> by
    MsgSwapResponseJvmConverter

public actual object MsgSwapSendConverter : ProtobufConverter<MsgSwapSend> by
    MsgSwapSendJvmConverter

public actual object MsgSwapSendResponseConverter : ProtobufConverter<MsgSwapSendResponse> by
    MsgSwapSendResponseJvmConverter

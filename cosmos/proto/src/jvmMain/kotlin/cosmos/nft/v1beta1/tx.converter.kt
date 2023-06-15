// Transform from cosmos/nft/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.nft.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgSendConverter : ProtobufConverter<MsgSend> by MsgSendJvmConverter

public actual object MsgSendResponseConverter : ProtobufConverter<MsgSendResponse> by
    MsgSendResponseJvmConverter

// Transform from cosmwasm/wasm/v1/ibc.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgIBCSendConverter : ProtobufConverter<MsgIBCSend> by MsgIBCSendJvmConverter

public actual object MsgIBCSendResponseConverter : ProtobufConverter<MsgIBCSendResponse> by
    MsgIBCSendResponseJvmConverter

public actual object MsgIBCCloseChannelConverter : ProtobufConverter<MsgIBCCloseChannel> by
    MsgIBCCloseChannelJvmConverter

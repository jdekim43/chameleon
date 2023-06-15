// Transform from cosmwasm/wasm/v1/ibc.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgIBCSendConverter : ProtobufConverter<MsgIBCSend>

public fun MsgIBCSend.toAny(): Any = Any(MsgIBCSend.TYPE_URL, with(MsgIBCSendConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgIBCSend>): MsgIBCSend {
  if (typeUrl != MsgIBCSend.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgIBCSendResponseConverter : ProtobufConverter<MsgIBCSendResponse>

public fun MsgIBCSendResponse.toAny(): Any = Any(MsgIBCSendResponse.TYPE_URL,
    with(MsgIBCSendResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgIBCSendResponse>): MsgIBCSendResponse {
  if (typeUrl != MsgIBCSendResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgIBCCloseChannelConverter : ProtobufConverter<MsgIBCCloseChannel>

public fun MsgIBCCloseChannel.toAny(): Any = Any(MsgIBCCloseChannel.TYPE_URL,
    with(MsgIBCCloseChannelConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgIBCCloseChannel>): MsgIBCCloseChannel {
  if (typeUrl != MsgIBCCloseChannel.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

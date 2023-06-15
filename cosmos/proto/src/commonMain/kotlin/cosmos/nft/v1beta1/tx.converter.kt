// Transform from cosmos/nft/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.nft.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgSendConverter : ProtobufConverter<MsgSend>

public fun MsgSend.toAny(): Any = Any(MsgSend.TYPE_URL, with(MsgSendConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSend>): MsgSend {
  if (typeUrl != MsgSend.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSendResponseConverter : ProtobufConverter<MsgSendResponse>

public fun MsgSendResponse.toAny(): Any = Any(MsgSendResponse.TYPE_URL,
    with(MsgSendResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSendResponse>): MsgSendResponse {
  if (typeUrl != MsgSendResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

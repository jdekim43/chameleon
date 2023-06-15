// Transform from terra/market/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.market.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgSwapConverter : ProtobufConverter<MsgSwap>

public fun MsgSwap.toAny(): Any = Any(MsgSwap.TYPE_URL, with(MsgSwapConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSwap>): MsgSwap {
  if (typeUrl != MsgSwap.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSwapResponseConverter : ProtobufConverter<MsgSwapResponse>

public fun MsgSwapResponse.toAny(): Any = Any(MsgSwapResponse.TYPE_URL,
    with(MsgSwapResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSwapResponse>): MsgSwapResponse {
  if (typeUrl != MsgSwapResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSwapSendConverter : ProtobufConverter<MsgSwapSend>

public fun MsgSwapSend.toAny(): Any = Any(MsgSwapSend.TYPE_URL, with(MsgSwapSendConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSwapSend>): MsgSwapSend {
  if (typeUrl != MsgSwapSend.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSwapSendResponseConverter : ProtobufConverter<MsgSwapSendResponse>

public fun MsgSwapSendResponse.toAny(): Any = Any(MsgSwapSendResponse.TYPE_URL,
    with(MsgSwapSendResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSwapSendResponse>): MsgSwapSendResponse {
  if (typeUrl != MsgSwapSendResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

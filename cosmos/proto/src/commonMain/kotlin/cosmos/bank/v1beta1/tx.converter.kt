// Transform from cosmos/bank/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

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

public expect object MsgMultiSendConverter : ProtobufConverter<MsgMultiSend>

public fun MsgMultiSend.toAny(): Any = Any(MsgMultiSend.TYPE_URL, with(MsgMultiSendConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgMultiSend>): MsgMultiSend {
  if (typeUrl != MsgMultiSend.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgMultiSendResponseConverter : ProtobufConverter<MsgMultiSendResponse>

public fun MsgMultiSendResponse.toAny(): Any = Any(MsgMultiSendResponse.TYPE_URL,
    with(MsgMultiSendResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgMultiSendResponse>): MsgMultiSendResponse {
  if (typeUrl != MsgMultiSendResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams>

public fun MsgUpdateParams.toAny(): Any = Any(MsgUpdateParams.TYPE_URL,
    with(MsgUpdateParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateParams>): MsgUpdateParams {
  if (typeUrl != MsgUpdateParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>

public fun MsgUpdateParamsResponse.toAny(): Any = Any(MsgUpdateParamsResponse.TYPE_URL,
    with(MsgUpdateParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateParamsResponse>):
    MsgUpdateParamsResponse {
  if (typeUrl != MsgUpdateParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSetSendEnabledConverter : ProtobufConverter<MsgSetSendEnabled>

public fun MsgSetSendEnabled.toAny(): Any = Any(MsgSetSendEnabled.TYPE_URL,
    with(MsgSetSendEnabledConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSetSendEnabled>): MsgSetSendEnabled {
  if (typeUrl != MsgSetSendEnabled.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSetSendEnabledResponseConverter :
    ProtobufConverter<MsgSetSendEnabledResponse>

public fun MsgSetSendEnabledResponse.toAny(): Any = Any(MsgSetSendEnabledResponse.TYPE_URL,
    with(MsgSetSendEnabledResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSetSendEnabledResponse>):
    MsgSetSendEnabledResponse {
  if (typeUrl != MsgSetSendEnabledResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

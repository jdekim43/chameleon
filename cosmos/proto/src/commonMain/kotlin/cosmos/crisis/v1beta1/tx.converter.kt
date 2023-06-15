// Transform from cosmos/crisis/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crisis.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgVerifyInvariantConverter : ProtobufConverter<MsgVerifyInvariant>

public fun MsgVerifyInvariant.toAny(): Any = Any(MsgVerifyInvariant.TYPE_URL,
    with(MsgVerifyInvariantConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgVerifyInvariant>): MsgVerifyInvariant {
  if (typeUrl != MsgVerifyInvariant.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgVerifyInvariantResponseConverter :
    ProtobufConverter<MsgVerifyInvariantResponse>

public fun MsgVerifyInvariantResponse.toAny(): Any = Any(MsgVerifyInvariantResponse.TYPE_URL,
    with(MsgVerifyInvariantResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgVerifyInvariantResponse>):
    MsgVerifyInvariantResponse {
  if (typeUrl != MsgVerifyInvariantResponse.TYPE_URL) throw
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

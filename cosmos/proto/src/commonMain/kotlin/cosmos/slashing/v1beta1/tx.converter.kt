// Transform from cosmos/slashing/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.slashing.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgUnjailConverter : ProtobufConverter<MsgUnjail>

public fun MsgUnjail.toAny(): Any = Any(MsgUnjail.TYPE_URL, with(MsgUnjailConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<MsgUnjail>): MsgUnjail {
  if (typeUrl != MsgUnjail.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUnjailResponseConverter : ProtobufConverter<MsgUnjailResponse>

public fun MsgUnjailResponse.toAny(): Any = Any(MsgUnjailResponse.TYPE_URL,
    with(MsgUnjailResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUnjailResponse>): MsgUnjailResponse {
  if (typeUrl != MsgUnjailResponse.TYPE_URL) throw
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

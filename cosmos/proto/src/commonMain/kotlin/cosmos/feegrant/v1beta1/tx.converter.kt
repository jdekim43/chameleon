// Transform from cosmos/feegrant/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.feegrant.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgGrantAllowanceConverter : ProtobufConverter<MsgGrantAllowance>

public fun MsgGrantAllowance.toAny(): Any = Any(MsgGrantAllowance.TYPE_URL,
    with(MsgGrantAllowanceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgGrantAllowance>): MsgGrantAllowance {
  if (typeUrl != MsgGrantAllowance.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgGrantAllowanceResponseConverter :
    ProtobufConverter<MsgGrantAllowanceResponse>

public fun MsgGrantAllowanceResponse.toAny(): Any = Any(MsgGrantAllowanceResponse.TYPE_URL,
    with(MsgGrantAllowanceResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgGrantAllowanceResponse>):
    MsgGrantAllowanceResponse {
  if (typeUrl != MsgGrantAllowanceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRevokeAllowanceConverter : ProtobufConverter<MsgRevokeAllowance>

public fun MsgRevokeAllowance.toAny(): Any = Any(MsgRevokeAllowance.TYPE_URL,
    with(MsgRevokeAllowanceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRevokeAllowance>): MsgRevokeAllowance {
  if (typeUrl != MsgRevokeAllowance.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRevokeAllowanceResponseConverter :
    ProtobufConverter<MsgRevokeAllowanceResponse>

public fun MsgRevokeAllowanceResponse.toAny(): Any = Any(MsgRevokeAllowanceResponse.TYPE_URL,
    with(MsgRevokeAllowanceResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRevokeAllowanceResponse>):
    MsgRevokeAllowanceResponse {
  if (typeUrl != MsgRevokeAllowanceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

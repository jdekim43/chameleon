// Transform from cosmos/authz/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.authz.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgGrantConverter : ProtobufConverter<MsgGrant>

public fun MsgGrant.toAny(): Any = Any(MsgGrant.TYPE_URL, with(MsgGrantConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgGrant>): MsgGrant {
  if (typeUrl != MsgGrant.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgExecResponseConverter : ProtobufConverter<MsgExecResponse>

public fun MsgExecResponse.toAny(): Any = Any(MsgExecResponse.TYPE_URL,
    with(MsgExecResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgExecResponse>): MsgExecResponse {
  if (typeUrl != MsgExecResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgExecConverter : ProtobufConverter<MsgExec>

public fun MsgExec.toAny(): Any = Any(MsgExec.TYPE_URL, with(MsgExecConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgExec>): MsgExec {
  if (typeUrl != MsgExec.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgGrantResponseConverter : ProtobufConverter<MsgGrantResponse>

public fun MsgGrantResponse.toAny(): Any = Any(MsgGrantResponse.TYPE_URL,
    with(MsgGrantResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgGrantResponse>): MsgGrantResponse {
  if (typeUrl != MsgGrantResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRevokeConverter : ProtobufConverter<MsgRevoke>

public fun MsgRevoke.toAny(): Any = Any(MsgRevoke.TYPE_URL, with(MsgRevokeConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<MsgRevoke>): MsgRevoke {
  if (typeUrl != MsgRevoke.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRevokeResponseConverter : ProtobufConverter<MsgRevokeResponse>

public fun MsgRevokeResponse.toAny(): Any = Any(MsgRevokeResponse.TYPE_URL,
    with(MsgRevokeResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRevokeResponse>): MsgRevokeResponse {
  if (typeUrl != MsgRevokeResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

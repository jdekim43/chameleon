// Transform from cosmos/authz/v1beta1/event.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.authz.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object EventGrantConverter : ProtobufConverter<EventGrant>

public fun EventGrant.toAny(): Any = Any(EventGrant.TYPE_URL, with(EventGrantConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventGrant>): EventGrant {
  if (typeUrl != EventGrant.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventRevokeConverter : ProtobufConverter<EventRevoke>

public fun EventRevoke.toAny(): Any = Any(EventRevoke.TYPE_URL, with(EventRevokeConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EventRevoke>): EventRevoke {
  if (typeUrl != EventRevoke.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

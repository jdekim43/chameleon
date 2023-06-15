// Transform from cosmos/authz/v1beta1/authz.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.authz.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object GenericAuthorizationConverter : ProtobufConverter<GenericAuthorization>

public fun GenericAuthorization.toAny(): Any = Any(GenericAuthorization.TYPE_URL,
    with(GenericAuthorizationConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GenericAuthorization>): GenericAuthorization {
  if (typeUrl != GenericAuthorization.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GrantConverter : ProtobufConverter<Grant>

public fun Grant.toAny(): Any = Any(Grant.TYPE_URL, with(GrantConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Grant>): Grant {
  if (typeUrl != Grant.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GrantAuthorizationConverter : ProtobufConverter<GrantAuthorization>

public fun GrantAuthorization.toAny(): Any = Any(GrantAuthorization.TYPE_URL,
    with(GrantAuthorizationConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GrantAuthorization>): GrantAuthorization {
  if (typeUrl != GrantAuthorization.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GrantQueueItemConverter : ProtobufConverter<GrantQueueItem>

public fun GrantQueueItem.toAny(): Any = Any(GrantQueueItem.TYPE_URL, with(GrantQueueItemConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GrantQueueItem>): GrantQueueItem {
  if (typeUrl != GrantQueueItem.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

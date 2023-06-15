// Transform from cosmos/bank/v1beta1/authz.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object SendAuthorizationConverter : ProtobufConverter<SendAuthorization>

public fun SendAuthorization.toAny(): Any = Any(SendAuthorization.TYPE_URL,
    with(SendAuthorizationConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SendAuthorization>): SendAuthorization {
  if (typeUrl != SendAuthorization.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

// Transform from cosmos/staking/v1beta1/authz.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object StakeAuthorizationConverter : ProtobufConverter<StakeAuthorization> {
  public object ValidatorsConverter : ProtobufConverter<StakeAuthorization.Validators>
}

public fun StakeAuthorization.toAny(): Any = Any(StakeAuthorization.TYPE_URL,
    with(StakeAuthorizationConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<StakeAuthorization>): StakeAuthorization {
  if (typeUrl != StakeAuthorization.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

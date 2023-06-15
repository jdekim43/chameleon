// Transform from alliance/unbonding.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object UnbondingDelegationConverter : ProtobufConverter<UnbondingDelegation>

public fun UnbondingDelegation.toAny(): Any = Any(UnbondingDelegation.TYPE_URL,
    with(UnbondingDelegationConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<UnbondingDelegation>): UnbondingDelegation {
  if (typeUrl != UnbondingDelegation.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

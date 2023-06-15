// Transform from cosmos/evidence/v1beta1/evidence.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.evidence.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object EquivocationConverter : ProtobufConverter<Equivocation>

public fun Equivocation.toAny(): Any = Any(Equivocation.TYPE_URL, with(EquivocationConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Equivocation>): Equivocation {
  if (typeUrl != Equivocation.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

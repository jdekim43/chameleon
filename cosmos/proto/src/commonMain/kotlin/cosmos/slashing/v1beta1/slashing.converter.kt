// Transform from cosmos/slashing/v1beta1/slashing.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.slashing.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ValidatorSigningInfoConverter : ProtobufConverter<ValidatorSigningInfo>

public fun ValidatorSigningInfo.toAny(): Any = Any(ValidatorSigningInfo.TYPE_URL,
    with(ValidatorSigningInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorSigningInfo>): ValidatorSigningInfo {
  if (typeUrl != ValidatorSigningInfo.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ParamsConverter : ProtobufConverter<Params>

public fun Params.toAny(): Any = Any(Params.TYPE_URL, with(ParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Params>): Params {
  if (typeUrl != Params.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

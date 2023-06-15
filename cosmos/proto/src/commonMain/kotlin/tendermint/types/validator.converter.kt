// Transform from tendermint/types/validator.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ValidatorSetConverter : ProtobufConverter<ValidatorSet>

public fun ValidatorSet.toAny(): Any = Any(ValidatorSet.TYPE_URL, with(ValidatorSetConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorSet>): ValidatorSet {
  if (typeUrl != ValidatorSet.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorConverter : ProtobufConverter<Validator>

public fun Validator.toAny(): Any = Any(Validator.TYPE_URL, with(ValidatorConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<Validator>): Validator {
  if (typeUrl != Validator.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SimpleValidatorConverter : ProtobufConverter<SimpleValidator>

public fun SimpleValidator.toAny(): Any = Any(SimpleValidator.TYPE_URL,
    with(SimpleValidatorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SimpleValidator>): SimpleValidator {
  if (typeUrl != SimpleValidator.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

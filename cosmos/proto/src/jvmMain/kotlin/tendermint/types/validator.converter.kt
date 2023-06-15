// Transform from tendermint/types/validator.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ValidatorSetConverter : ProtobufConverter<ValidatorSet> by
    ValidatorSetJvmConverter

public actual object ValidatorConverter : ProtobufConverter<Validator> by ValidatorJvmConverter

public actual object SimpleValidatorConverter : ProtobufConverter<SimpleValidator> by
    SimpleValidatorJvmConverter

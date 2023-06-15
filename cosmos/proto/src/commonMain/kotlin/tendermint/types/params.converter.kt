// Transform from tendermint/types/params.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ConsensusParamsConverter : ProtobufConverter<ConsensusParams>

public fun ConsensusParams.toAny(): Any = Any(ConsensusParams.TYPE_URL,
    with(ConsensusParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ConsensusParams>): ConsensusParams {
  if (typeUrl != ConsensusParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BlockParamsConverter : ProtobufConverter<BlockParams>

public fun BlockParams.toAny(): Any = Any(BlockParams.TYPE_URL, with(BlockParamsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BlockParams>): BlockParams {
  if (typeUrl != BlockParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EvidenceParamsConverter : ProtobufConverter<EvidenceParams>

public fun EvidenceParams.toAny(): Any = Any(EvidenceParams.TYPE_URL, with(EvidenceParamsConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EvidenceParams>): EvidenceParams {
  if (typeUrl != EvidenceParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorParamsConverter : ProtobufConverter<ValidatorParams>

public fun ValidatorParams.toAny(): Any = Any(ValidatorParams.TYPE_URL,
    with(ValidatorParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorParams>): ValidatorParams {
  if (typeUrl != ValidatorParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object VersionParamsConverter : ProtobufConverter<VersionParams>

public fun VersionParams.toAny(): Any = Any(VersionParams.TYPE_URL, with(VersionParamsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<VersionParams>): VersionParams {
  if (typeUrl != VersionParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object HashedParamsConverter : ProtobufConverter<HashedParams>

public fun HashedParams.toAny(): Any = Any(HashedParams.TYPE_URL, with(HashedParamsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<HashedParams>): HashedParams {
  if (typeUrl != HashedParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

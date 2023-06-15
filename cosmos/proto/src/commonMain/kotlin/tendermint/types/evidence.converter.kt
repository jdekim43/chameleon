// Transform from tendermint/types/evidence.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object EvidenceConverter : ProtobufConverter<Evidence>

public fun Evidence.toAny(): Any = Any(Evidence.TYPE_URL, with(EvidenceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Evidence>): Evidence {
  if (typeUrl != Evidence.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DuplicateVoteEvidenceConverter : ProtobufConverter<DuplicateVoteEvidence>

public fun DuplicateVoteEvidence.toAny(): Any = Any(DuplicateVoteEvidence.TYPE_URL,
    with(DuplicateVoteEvidenceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DuplicateVoteEvidence>): DuplicateVoteEvidence {
  if (typeUrl != DuplicateVoteEvidence.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object LightClientAttackEvidenceConverter :
    ProtobufConverter<LightClientAttackEvidence>

public fun LightClientAttackEvidence.toAny(): Any = Any(LightClientAttackEvidence.TYPE_URL,
    with(LightClientAttackEvidenceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<LightClientAttackEvidence>):
    LightClientAttackEvidence {
  if (typeUrl != LightClientAttackEvidence.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EvidenceListConverter : ProtobufConverter<EvidenceList>

public fun EvidenceList.toAny(): Any = Any(EvidenceList.TYPE_URL, with(EvidenceListConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EvidenceList>): EvidenceList {
  if (typeUrl != EvidenceList.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

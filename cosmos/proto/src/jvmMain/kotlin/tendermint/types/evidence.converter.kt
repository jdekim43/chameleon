// Transform from tendermint/types/evidence.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.types

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object EvidenceConverter : ProtobufConverter<Evidence> by EvidenceJvmConverter

public actual object DuplicateVoteEvidenceConverter : ProtobufConverter<DuplicateVoteEvidence> by
    DuplicateVoteEvidenceJvmConverter

public actual object LightClientAttackEvidenceConverter :
    ProtobufConverter<LightClientAttackEvidence> by LightClientAttackEvidenceJvmConverter

public actual object EvidenceListConverter : ProtobufConverter<EvidenceList> by
    EvidenceListJvmConverter

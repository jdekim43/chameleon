// Transform from cosmos/evidence/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.evidence.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object QueryEvidenceRequestConverter : ProtobufConverter<QueryEvidenceRequest> by
    QueryEvidenceRequestJvmConverter

public actual object QueryEvidenceResponseConverter : ProtobufConverter<QueryEvidenceResponse> by
    QueryEvidenceResponseJvmConverter

public actual object QueryAllEvidenceRequestConverter : ProtobufConverter<QueryAllEvidenceRequest>
    by QueryAllEvidenceRequestJvmConverter

public actual object QueryAllEvidenceResponseConverter : ProtobufConverter<QueryAllEvidenceResponse>
    by QueryAllEvidenceResponseJvmConverter

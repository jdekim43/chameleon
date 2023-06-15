// Transform from cosmos/evidence/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.evidence.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object QueryEvidenceRequestConverter : ProtobufConverter<QueryEvidenceRequest>

public fun QueryEvidenceRequest.toAny(): Any = Any(QueryEvidenceRequest.TYPE_URL,
    with(QueryEvidenceRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryEvidenceRequest>): QueryEvidenceRequest {
  if (typeUrl != QueryEvidenceRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryEvidenceResponseConverter : ProtobufConverter<QueryEvidenceResponse>

public fun QueryEvidenceResponse.toAny(): Any = Any(QueryEvidenceResponse.TYPE_URL,
    with(QueryEvidenceResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryEvidenceResponse>): QueryEvidenceResponse {
  if (typeUrl != QueryEvidenceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllEvidenceRequestConverter : ProtobufConverter<QueryAllEvidenceRequest>

public fun QueryAllEvidenceRequest.toAny(): Any = Any(QueryAllEvidenceRequest.TYPE_URL,
    with(QueryAllEvidenceRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllEvidenceRequest>):
    QueryAllEvidenceRequest {
  if (typeUrl != QueryAllEvidenceRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object QueryAllEvidenceResponseConverter : ProtobufConverter<QueryAllEvidenceResponse>

public fun QueryAllEvidenceResponse.toAny(): Any = Any(QueryAllEvidenceResponse.TYPE_URL,
    with(QueryAllEvidenceResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<QueryAllEvidenceResponse>):
    QueryAllEvidenceResponse {
  if (typeUrl != QueryAllEvidenceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

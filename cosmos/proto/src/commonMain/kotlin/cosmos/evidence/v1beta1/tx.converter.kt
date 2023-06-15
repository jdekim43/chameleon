// Transform from cosmos/evidence/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.evidence.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgSubmitEvidenceConverter : ProtobufConverter<MsgSubmitEvidence>

public fun MsgSubmitEvidence.toAny(): Any = Any(MsgSubmitEvidence.TYPE_URL,
    with(MsgSubmitEvidenceConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSubmitEvidence>): MsgSubmitEvidence {
  if (typeUrl != MsgSubmitEvidence.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSubmitEvidenceResponseConverter :
    ProtobufConverter<MsgSubmitEvidenceResponse>

public fun MsgSubmitEvidenceResponse.toAny(): Any = Any(MsgSubmitEvidenceResponse.TYPE_URL,
    with(MsgSubmitEvidenceResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSubmitEvidenceResponse>):
    MsgSubmitEvidenceResponse {
  if (typeUrl != MsgSubmitEvidenceResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

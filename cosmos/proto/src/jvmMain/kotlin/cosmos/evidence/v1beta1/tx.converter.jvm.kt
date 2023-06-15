// Transform from cosmos/evidence/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.evidence.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgSubmitEvidenceJvmConverter :
    ProtobufTypeMapper<MsgSubmitEvidence, Tx.MsgSubmitEvidence> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSubmitEvidence.getDescriptor()

  public override val parser: Parser<Tx.MsgSubmitEvidence> = Tx.MsgSubmitEvidence.parser()

  public override fun convert(obj: Tx.MsgSubmitEvidence): MsgSubmitEvidence = MsgSubmitEvidence(
  	submitter = obj.getSubmitter(),
  	evidence = AnyJvmConverter.convert(obj.getEvidence()),
  )

  public override fun convert(obj: MsgSubmitEvidence): Tx.MsgSubmitEvidence {
    val builder = Tx.MsgSubmitEvidence.newBuilder()
    builder.setSubmitter(obj.submitter)
    builder.setEvidence(AnyJvmConverter.convert(obj.evidence))
    return builder.build()
  }
}

public object MsgSubmitEvidenceResponseJvmConverter :
    ProtobufTypeMapper<MsgSubmitEvidenceResponse, Tx.MsgSubmitEvidenceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgSubmitEvidenceResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgSubmitEvidenceResponse> =
      Tx.MsgSubmitEvidenceResponse.parser()

  public override fun convert(obj: Tx.MsgSubmitEvidenceResponse): MsgSubmitEvidenceResponse =
      MsgSubmitEvidenceResponse(
  	hash = obj.getHash().toByteArray(),
  )

  public override fun convert(obj: MsgSubmitEvidenceResponse): Tx.MsgSubmitEvidenceResponse {
    val builder = Tx.MsgSubmitEvidenceResponse.newBuilder()
    builder.setHash(ByteString.copyFrom(obj.hash))
    return builder.build()
  }
}

// Transform from cosmos/evidence/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.evidence.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestJvmConverter
import cosmos.base.query.v1beta1.PageResponseJvmConverter
import google.protobuf.AnyJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueryEvidenceRequestJvmConverter :
    ProtobufTypeMapper<QueryEvidenceRequest, QueryOuterClass.QueryEvidenceRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryEvidenceRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryEvidenceRequest> =
      QueryOuterClass.QueryEvidenceRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryEvidenceRequest): QueryEvidenceRequest =
      QueryEvidenceRequest(
  	evidenceHash = obj.getEvidenceHash().toByteArray(),
  	hash = obj.getHash(),
  )

  public override fun convert(obj: QueryEvidenceRequest): QueryOuterClass.QueryEvidenceRequest {
    val builder = QueryOuterClass.QueryEvidenceRequest.newBuilder()
    builder.setEvidenceHash(ByteString.copyFrom(obj.evidenceHash))
    builder.setHash(obj.hash)
    return builder.build()
  }
}

public object QueryEvidenceResponseJvmConverter :
    ProtobufTypeMapper<QueryEvidenceResponse, QueryOuterClass.QueryEvidenceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryEvidenceResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryEvidenceResponse> =
      QueryOuterClass.QueryEvidenceResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryEvidenceResponse): QueryEvidenceResponse =
      QueryEvidenceResponse(
  	evidence = AnyJvmConverter.convert(obj.getEvidence()),
  )

  public override fun convert(obj: QueryEvidenceResponse): QueryOuterClass.QueryEvidenceResponse {
    val builder = QueryOuterClass.QueryEvidenceResponse.newBuilder()
    builder.setEvidence(AnyJvmConverter.convert(obj.evidence))
    return builder.build()
  }
}

public object QueryAllEvidenceRequestJvmConverter :
    ProtobufTypeMapper<QueryAllEvidenceRequest, QueryOuterClass.QueryAllEvidenceRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllEvidenceRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllEvidenceRequest> =
      QueryOuterClass.QueryAllEvidenceRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllEvidenceRequest): QueryAllEvidenceRequest
      = QueryAllEvidenceRequest(
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllEvidenceRequest):
      QueryOuterClass.QueryAllEvidenceRequest {
    val builder = QueryOuterClass.QueryAllEvidenceRequest.newBuilder()
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllEvidenceResponseJvmConverter :
    ProtobufTypeMapper<QueryAllEvidenceResponse, QueryOuterClass.QueryAllEvidenceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllEvidenceResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllEvidenceResponse> =
      QueryOuterClass.QueryAllEvidenceResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllEvidenceResponse):
      QueryAllEvidenceResponse = QueryAllEvidenceResponse(
  	evidence = obj.getEvidenceList().map { AnyJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllEvidenceResponse):
      QueryOuterClass.QueryAllEvidenceResponse {
    val builder = QueryOuterClass.QueryAllEvidenceResponse.newBuilder()
    builder.addAllEvidence(obj.evidence.map { AnyJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

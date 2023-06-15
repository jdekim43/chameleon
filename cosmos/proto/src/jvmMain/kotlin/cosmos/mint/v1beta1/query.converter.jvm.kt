// Transform from cosmos/mint/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.mint.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueryParamsRequestJvmConverter :
    ProtobufTypeMapper<QueryParamsRequest, QueryOuterClass.QueryParamsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsRequest> =
      QueryOuterClass.QueryParamsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsRequest): QueryParamsRequest =
      QueryParamsRequest(
  )

  public override fun convert(obj: QueryParamsRequest): QueryOuterClass.QueryParamsRequest {
    val builder = QueryOuterClass.QueryParamsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryParamsResponseJvmConverter :
    ProtobufTypeMapper<QueryParamsResponse, QueryOuterClass.QueryParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryParamsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryParamsResponse> =
      QueryOuterClass.QueryParamsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryParamsResponse): QueryParamsResponse =
      QueryParamsResponse(
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: QueryParamsResponse): QueryOuterClass.QueryParamsResponse {
    val builder = QueryOuterClass.QueryParamsResponse.newBuilder()
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object QueryInflationRequestJvmConverter :
    ProtobufTypeMapper<QueryInflationRequest, QueryOuterClass.QueryInflationRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryInflationRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryInflationRequest> =
      QueryOuterClass.QueryInflationRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryInflationRequest): QueryInflationRequest =
      QueryInflationRequest(
  )

  public override fun convert(obj: QueryInflationRequest): QueryOuterClass.QueryInflationRequest {
    val builder = QueryOuterClass.QueryInflationRequest.newBuilder()
    return builder.build()
  }
}

public object QueryInflationResponseJvmConverter :
    ProtobufTypeMapper<QueryInflationResponse, QueryOuterClass.QueryInflationResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryInflationResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryInflationResponse> =
      QueryOuterClass.QueryInflationResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryInflationResponse): QueryInflationResponse =
      QueryInflationResponse(
  	inflation = obj.getInflation().toByteArray(),
  )

  public override fun convert(obj: QueryInflationResponse): QueryOuterClass.QueryInflationResponse {
    val builder = QueryOuterClass.QueryInflationResponse.newBuilder()
    builder.setInflation(ByteString.copyFrom(obj.inflation))
    return builder.build()
  }
}

public object QueryAnnualProvisionsRequestJvmConverter :
    ProtobufTypeMapper<QueryAnnualProvisionsRequest, QueryOuterClass.QueryAnnualProvisionsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAnnualProvisionsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAnnualProvisionsRequest> =
      QueryOuterClass.QueryAnnualProvisionsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAnnualProvisionsRequest):
      QueryAnnualProvisionsRequest = QueryAnnualProvisionsRequest(
  )

  public override fun convert(obj: QueryAnnualProvisionsRequest):
      QueryOuterClass.QueryAnnualProvisionsRequest {
    val builder = QueryOuterClass.QueryAnnualProvisionsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryAnnualProvisionsResponseJvmConverter :
    ProtobufTypeMapper<QueryAnnualProvisionsResponse, QueryOuterClass.QueryAnnualProvisionsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAnnualProvisionsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAnnualProvisionsResponse> =
      QueryOuterClass.QueryAnnualProvisionsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAnnualProvisionsResponse):
      QueryAnnualProvisionsResponse = QueryAnnualProvisionsResponse(
  	annualProvisions = obj.getAnnualProvisions().toByteArray(),
  )

  public override fun convert(obj: QueryAnnualProvisionsResponse):
      QueryOuterClass.QueryAnnualProvisionsResponse {
    val builder = QueryOuterClass.QueryAnnualProvisionsResponse.newBuilder()
    builder.setAnnualProvisions(ByteString.copyFrom(obj.annualProvisions))
    return builder.build()
  }
}

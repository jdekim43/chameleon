// Transform from tokenfactory/query.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.tokenfactory

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

public object QueryDenomAuthorityMetadataRequestJvmConverter :
    ProtobufTypeMapper<QueryDenomAuthorityMetadataRequest, QueryOuterClass.QueryDenomAuthorityMetadataRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomAuthorityMetadataRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomAuthorityMetadataRequest> =
      QueryOuterClass.QueryDenomAuthorityMetadataRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomAuthorityMetadataRequest):
      QueryDenomAuthorityMetadataRequest = QueryDenomAuthorityMetadataRequest(
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: QueryDenomAuthorityMetadataRequest):
      QueryOuterClass.QueryDenomAuthorityMetadataRequest {
    val builder = QueryOuterClass.QueryDenomAuthorityMetadataRequest.newBuilder()
    builder.setDenom(obj.denom)
    return builder.build()
  }
}

public object QueryDenomAuthorityMetadataResponseJvmConverter :
    ProtobufTypeMapper<QueryDenomAuthorityMetadataResponse, QueryOuterClass.QueryDenomAuthorityMetadataResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomAuthorityMetadataResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomAuthorityMetadataResponse> =
      QueryOuterClass.QueryDenomAuthorityMetadataResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomAuthorityMetadataResponse):
      QueryDenomAuthorityMetadataResponse = QueryDenomAuthorityMetadataResponse(
  	authorityMetadata = DenomAuthorityMetadataJvmConverter.convert(obj.getAuthorityMetadata()),
  )

  public override fun convert(obj: QueryDenomAuthorityMetadataResponse):
      QueryOuterClass.QueryDenomAuthorityMetadataResponse {
    val builder = QueryOuterClass.QueryDenomAuthorityMetadataResponse.newBuilder()
    builder.setAuthorityMetadata(DenomAuthorityMetadataJvmConverter.convert(obj.authorityMetadata))
    return builder.build()
  }
}

public object QueryDenomsFromCreatorRequestJvmConverter :
    ProtobufTypeMapper<QueryDenomsFromCreatorRequest, QueryOuterClass.QueryDenomsFromCreatorRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomsFromCreatorRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomsFromCreatorRequest> =
      QueryOuterClass.QueryDenomsFromCreatorRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomsFromCreatorRequest):
      QueryDenomsFromCreatorRequest = QueryDenomsFromCreatorRequest(
  	creator = obj.getCreator(),
  )

  public override fun convert(obj: QueryDenomsFromCreatorRequest):
      QueryOuterClass.QueryDenomsFromCreatorRequest {
    val builder = QueryOuterClass.QueryDenomsFromCreatorRequest.newBuilder()
    builder.setCreator(obj.creator)
    return builder.build()
  }
}

public object QueryDenomsFromCreatorResponseJvmConverter :
    ProtobufTypeMapper<QueryDenomsFromCreatorResponse, QueryOuterClass.QueryDenomsFromCreatorResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomsFromCreatorResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomsFromCreatorResponse> =
      QueryOuterClass.QueryDenomsFromCreatorResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomsFromCreatorResponse):
      QueryDenomsFromCreatorResponse = QueryDenomsFromCreatorResponse(
  	denoms = obj.getDenomsList().map { it },
  )

  public override fun convert(obj: QueryDenomsFromCreatorResponse):
      QueryOuterClass.QueryDenomsFromCreatorResponse {
    val builder = QueryOuterClass.QueryDenomsFromCreatorResponse.newBuilder()
    builder.addAllDenoms(obj.denoms.map { it })
    return builder.build()
  }
}

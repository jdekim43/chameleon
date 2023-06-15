// Transform from mint/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.mint

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

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

public object QueryMinterRequestJvmConverter :
    ProtobufTypeMapper<QueryMinterRequest, QueryOuterClass.QueryMinterRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryMinterRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryMinterRequest> =
      QueryOuterClass.QueryMinterRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryMinterRequest): QueryMinterRequest =
      QueryMinterRequest(
  )

  public override fun convert(obj: QueryMinterRequest): QueryOuterClass.QueryMinterRequest {
    val builder = QueryOuterClass.QueryMinterRequest.newBuilder()
    return builder.build()
  }
}

public object QueryMinterResponseJvmConverter :
    ProtobufTypeMapper<QueryMinterResponse, QueryOuterClass.QueryMinterResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryMinterResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryMinterResponse> =
      QueryOuterClass.QueryMinterResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryMinterResponse): QueryMinterResponse =
      QueryMinterResponse(
  	startDate = obj.getStartDate(),
  	endDate = obj.getEndDate(),
  	denom = obj.getDenom(),
  	totalMintAmount = obj.getTotalMintAmount().asKotlinType,
  	remainingMintAmount = obj.getRemainingMintAmount().asKotlinType,
  	lastMintAmount = obj.getLastMintAmount().asKotlinType,
  	lastMintDate = obj.getLastMintDate(),
  	lastMintHeight = obj.getLastMintHeight().asKotlinType,
  )

  public override fun convert(obj: QueryMinterResponse): QueryOuterClass.QueryMinterResponse {
    val builder = QueryOuterClass.QueryMinterResponse.newBuilder()
    builder.setStartDate(obj.startDate)
    builder.setEndDate(obj.endDate)
    builder.setDenom(obj.denom)
    builder.setTotalMintAmount(obj.totalMintAmount.asJavaType)
    builder.setRemainingMintAmount(obj.remainingMintAmount.asJavaType)
    builder.setLastMintAmount(obj.lastMintAmount.asJavaType)
    builder.setLastMintDate(obj.lastMintDate)
    builder.setLastMintHeight(obj.lastMintHeight.asJavaType)
    return builder.build()
  }
}

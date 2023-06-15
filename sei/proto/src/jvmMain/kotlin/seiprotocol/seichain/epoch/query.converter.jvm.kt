// Transform from epoch/query.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.epoch

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

public object QueryEpochRequestJvmConverter :
    ProtobufTypeMapper<QueryEpochRequest, QueryOuterClass.QueryEpochRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryEpochRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryEpochRequest> =
      QueryOuterClass.QueryEpochRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryEpochRequest): QueryEpochRequest =
      QueryEpochRequest(
  )

  public override fun convert(obj: QueryEpochRequest): QueryOuterClass.QueryEpochRequest {
    val builder = QueryOuterClass.QueryEpochRequest.newBuilder()
    return builder.build()
  }
}

public object QueryEpochResponseJvmConverter :
    ProtobufTypeMapper<QueryEpochResponse, QueryOuterClass.QueryEpochResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryEpochResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryEpochResponse> =
      QueryOuterClass.QueryEpochResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryEpochResponse): QueryEpochResponse =
      QueryEpochResponse(
  	epoch = EpochJvmConverter.convert(obj.getEpoch()),
  )

  public override fun convert(obj: QueryEpochResponse): QueryOuterClass.QueryEpochResponse {
    val builder = QueryOuterClass.QueryEpochResponse.newBuilder()
    builder.setEpoch(EpochJvmConverter.convert(obj.epoch))
    return builder.build()
  }
}

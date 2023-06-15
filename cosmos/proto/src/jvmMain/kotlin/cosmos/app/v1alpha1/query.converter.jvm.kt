// Transform from cosmos/app/v1alpha1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.app.v1alpha1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueryConfigRequestJvmConverter :
    ProtobufTypeMapper<QueryConfigRequest, QueryOuterClass.QueryConfigRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryConfigRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryConfigRequest> =
      QueryOuterClass.QueryConfigRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryConfigRequest): QueryConfigRequest =
      QueryConfigRequest(
  )

  public override fun convert(obj: QueryConfigRequest): QueryOuterClass.QueryConfigRequest {
    val builder = QueryOuterClass.QueryConfigRequest.newBuilder()
    return builder.build()
  }
}

public object QueryConfigResponseJvmConverter :
    ProtobufTypeMapper<QueryConfigResponse, QueryOuterClass.QueryConfigResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryConfigResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryConfigResponse> =
      QueryOuterClass.QueryConfigResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryConfigResponse): QueryConfigResponse =
      QueryConfigResponse(
  	config = ConfigJvmConverter.convert(obj.getConfig()),
  )

  public override fun convert(obj: QueryConfigResponse): QueryOuterClass.QueryConfigResponse {
    val builder = QueryOuterClass.QueryConfigResponse.newBuilder()
    builder.setConfig(ConfigJvmConverter.convert(obj.config))
    return builder.build()
  }
}

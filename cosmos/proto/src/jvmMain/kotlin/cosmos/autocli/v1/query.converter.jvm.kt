// Transform from cosmos/autocli/v1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.autocli.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object AppOptionsRequestJvmConverter :
    ProtobufTypeMapper<AppOptionsRequest, QueryOuterClass.AppOptionsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.AppOptionsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.AppOptionsRequest> =
      QueryOuterClass.AppOptionsRequest.parser()

  public override fun convert(obj: QueryOuterClass.AppOptionsRequest): AppOptionsRequest =
      AppOptionsRequest(
  )

  public override fun convert(obj: AppOptionsRequest): QueryOuterClass.AppOptionsRequest {
    val builder = QueryOuterClass.AppOptionsRequest.newBuilder()
    return builder.build()
  }
}

public object AppOptionsResponseJvmConverter :
    ProtobufTypeMapper<AppOptionsResponse, QueryOuterClass.AppOptionsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.AppOptionsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.AppOptionsResponse> =
      QueryOuterClass.AppOptionsResponse.parser()

  public override fun convert(obj: QueryOuterClass.AppOptionsResponse): AppOptionsResponse =
      AppOptionsResponse(
  	moduleOptions = obj.getModuleOptionsMap().map { it.key to
      ModuleOptionsJvmConverter.convert(it.value) }.toMap(),
  )

  public override fun convert(obj: AppOptionsResponse): QueryOuterClass.AppOptionsResponse {
    val builder = QueryOuterClass.AppOptionsResponse.newBuilder()
    builder.putAllModuleOptions(obj.moduleOptions.map { it.key to
        ModuleOptionsJvmConverter.convert(it.value) }.toMap())
    return builder.build()
  }
}

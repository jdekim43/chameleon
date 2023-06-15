// Transform from cosmos/base/node/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.node.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ConfigRequestJvmConverter : ProtobufTypeMapper<ConfigRequest, Query.ConfigRequest> {
  public override val descriptor: Descriptors.Descriptor = Query.ConfigRequest.getDescriptor()

  public override val parser: Parser<Query.ConfigRequest> = Query.ConfigRequest.parser()

  public override fun convert(obj: Query.ConfigRequest): ConfigRequest = ConfigRequest(
  )

  public override fun convert(obj: ConfigRequest): Query.ConfigRequest {
    val builder = Query.ConfigRequest.newBuilder()
    return builder.build()
  }
}

public object ConfigResponseJvmConverter : ProtobufTypeMapper<ConfigResponse, Query.ConfigResponse>
    {
  public override val descriptor: Descriptors.Descriptor = Query.ConfigResponse.getDescriptor()

  public override val parser: Parser<Query.ConfigResponse> = Query.ConfigResponse.parser()

  public override fun convert(obj: Query.ConfigResponse): ConfigResponse = ConfigResponse(
  	minimumGasPrice = obj.getMinimumGasPrice(),
  )

  public override fun convert(obj: ConfigResponse): Query.ConfigResponse {
    val builder = Query.ConfigResponse.newBuilder()
    builder.setMinimumGasPrice(obj.minimumGasPrice)
    return builder.build()
  }
}

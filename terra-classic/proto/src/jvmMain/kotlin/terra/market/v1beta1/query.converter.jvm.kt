// Transform from terra/market/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.market.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QuerySwapRequestJvmConverter :
    ProtobufTypeMapper<QuerySwapRequest, QueryOuterClass.QuerySwapRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySwapRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySwapRequest> =
      QueryOuterClass.QuerySwapRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySwapRequest): QuerySwapRequest =
      QuerySwapRequest(
  	offerCoin = obj.getOfferCoin(),
  	askDenom = obj.getAskDenom(),
  )

  public override fun convert(obj: QuerySwapRequest): QueryOuterClass.QuerySwapRequest {
    val builder = QueryOuterClass.QuerySwapRequest.newBuilder()
    builder.setOfferCoin(obj.offerCoin)
    builder.setAskDenom(obj.askDenom)
    return builder.build()
  }
}

public object QuerySwapResponseJvmConverter :
    ProtobufTypeMapper<QuerySwapResponse, QueryOuterClass.QuerySwapResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySwapResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySwapResponse> =
      QueryOuterClass.QuerySwapResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySwapResponse): QuerySwapResponse =
      QuerySwapResponse(
  	returnCoin = CoinJvmConverter.convert(obj.getReturnCoin()),
  )

  public override fun convert(obj: QuerySwapResponse): QueryOuterClass.QuerySwapResponse {
    val builder = QueryOuterClass.QuerySwapResponse.newBuilder()
    builder.setReturnCoin(CoinJvmConverter.convert(obj.returnCoin))
    return builder.build()
  }
}

public object QueryTerraPoolDeltaRequestJvmConverter :
    ProtobufTypeMapper<QueryTerraPoolDeltaRequest, QueryOuterClass.QueryTerraPoolDeltaRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTerraPoolDeltaRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTerraPoolDeltaRequest> =
      QueryOuterClass.QueryTerraPoolDeltaRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryTerraPoolDeltaRequest):
      QueryTerraPoolDeltaRequest = QueryTerraPoolDeltaRequest(
  )

  public override fun convert(obj: QueryTerraPoolDeltaRequest):
      QueryOuterClass.QueryTerraPoolDeltaRequest {
    val builder = QueryOuterClass.QueryTerraPoolDeltaRequest.newBuilder()
    return builder.build()
  }
}

public object QueryTerraPoolDeltaResponseJvmConverter :
    ProtobufTypeMapper<QueryTerraPoolDeltaResponse, QueryOuterClass.QueryTerraPoolDeltaResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTerraPoolDeltaResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTerraPoolDeltaResponse> =
      QueryOuterClass.QueryTerraPoolDeltaResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryTerraPoolDeltaResponse):
      QueryTerraPoolDeltaResponse = QueryTerraPoolDeltaResponse(
  	terraPoolDelta = obj.getTerraPoolDelta().toByteArray(),
  )

  public override fun convert(obj: QueryTerraPoolDeltaResponse):
      QueryOuterClass.QueryTerraPoolDeltaResponse {
    val builder = QueryOuterClass.QueryTerraPoolDeltaResponse.newBuilder()
    builder.setTerraPoolDelta(ByteString.copyFrom(obj.terraPoolDelta))
    return builder.build()
  }
}

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

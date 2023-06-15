// Transform from terra/treasury/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.treasury.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestJvmConverter
import cosmos.base.query.v1beta1.PageResponseJvmConverter
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueryTaxRateRequestJvmConverter :
    ProtobufTypeMapper<QueryTaxRateRequest, QueryOuterClass.QueryTaxRateRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTaxRateRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTaxRateRequest> =
      QueryOuterClass.QueryTaxRateRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryTaxRateRequest): QueryTaxRateRequest =
      QueryTaxRateRequest(
  )

  public override fun convert(obj: QueryTaxRateRequest): QueryOuterClass.QueryTaxRateRequest {
    val builder = QueryOuterClass.QueryTaxRateRequest.newBuilder()
    return builder.build()
  }
}

public object QueryTaxRateResponseJvmConverter :
    ProtobufTypeMapper<QueryTaxRateResponse, QueryOuterClass.QueryTaxRateResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTaxRateResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTaxRateResponse> =
      QueryOuterClass.QueryTaxRateResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryTaxRateResponse): QueryTaxRateResponse =
      QueryTaxRateResponse(
  	taxRate = obj.getTaxRate(),
  )

  public override fun convert(obj: QueryTaxRateResponse): QueryOuterClass.QueryTaxRateResponse {
    val builder = QueryOuterClass.QueryTaxRateResponse.newBuilder()
    builder.setTaxRate(obj.taxRate)
    return builder.build()
  }
}

public object QueryTaxCapRequestJvmConverter :
    ProtobufTypeMapper<QueryTaxCapRequest, QueryOuterClass.QueryTaxCapRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTaxCapRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTaxCapRequest> =
      QueryOuterClass.QueryTaxCapRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryTaxCapRequest): QueryTaxCapRequest =
      QueryTaxCapRequest(
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: QueryTaxCapRequest): QueryOuterClass.QueryTaxCapRequest {
    val builder = QueryOuterClass.QueryTaxCapRequest.newBuilder()
    builder.setDenom(obj.denom)
    return builder.build()
  }
}

public object QueryTaxCapResponseJvmConverter :
    ProtobufTypeMapper<QueryTaxCapResponse, QueryOuterClass.QueryTaxCapResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTaxCapResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTaxCapResponse> =
      QueryOuterClass.QueryTaxCapResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryTaxCapResponse): QueryTaxCapResponse =
      QueryTaxCapResponse(
  	taxCap = obj.getTaxCap(),
  )

  public override fun convert(obj: QueryTaxCapResponse): QueryOuterClass.QueryTaxCapResponse {
    val builder = QueryOuterClass.QueryTaxCapResponse.newBuilder()
    builder.setTaxCap(obj.taxCap)
    return builder.build()
  }
}

public object QueryTaxCapsRequestJvmConverter :
    ProtobufTypeMapper<QueryTaxCapsRequest, QueryOuterClass.QueryTaxCapsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTaxCapsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTaxCapsRequest> =
      QueryOuterClass.QueryTaxCapsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryTaxCapsRequest): QueryTaxCapsRequest =
      QueryTaxCapsRequest(
  )

  public override fun convert(obj: QueryTaxCapsRequest): QueryOuterClass.QueryTaxCapsRequest {
    val builder = QueryOuterClass.QueryTaxCapsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryTaxCapsResponseItemJvmConverter :
    ProtobufTypeMapper<QueryTaxCapsResponseItem, QueryOuterClass.QueryTaxCapsResponseItem> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTaxCapsResponseItem.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTaxCapsResponseItem> =
      QueryOuterClass.QueryTaxCapsResponseItem.parser()

  public override fun convert(obj: QueryOuterClass.QueryTaxCapsResponseItem):
      QueryTaxCapsResponseItem = QueryTaxCapsResponseItem(
  	denom = obj.getDenom(),
  	taxCap = obj.getTaxCap(),
  )

  public override fun convert(obj: QueryTaxCapsResponseItem):
      QueryOuterClass.QueryTaxCapsResponseItem {
    val builder = QueryOuterClass.QueryTaxCapsResponseItem.newBuilder()
    builder.setDenom(obj.denom)
    builder.setTaxCap(obj.taxCap)
    return builder.build()
  }
}

public object QueryTaxCapsResponseJvmConverter :
    ProtobufTypeMapper<QueryTaxCapsResponse, QueryOuterClass.QueryTaxCapsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTaxCapsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTaxCapsResponse> =
      QueryOuterClass.QueryTaxCapsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryTaxCapsResponse): QueryTaxCapsResponse =
      QueryTaxCapsResponse(
  	taxCaps = obj.getTaxCapsList().map { QueryTaxCapsResponseItemJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryTaxCapsResponse): QueryOuterClass.QueryTaxCapsResponse {
    val builder = QueryOuterClass.QueryTaxCapsResponse.newBuilder()
    builder.addAllTaxCaps(obj.taxCaps.map { QueryTaxCapsResponseItemJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QueryRewardWeightRequestJvmConverter :
    ProtobufTypeMapper<QueryRewardWeightRequest, QueryOuterClass.QueryRewardWeightRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryRewardWeightRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryRewardWeightRequest> =
      QueryOuterClass.QueryRewardWeightRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryRewardWeightRequest):
      QueryRewardWeightRequest = QueryRewardWeightRequest(
  )

  public override fun convert(obj: QueryRewardWeightRequest):
      QueryOuterClass.QueryRewardWeightRequest {
    val builder = QueryOuterClass.QueryRewardWeightRequest.newBuilder()
    return builder.build()
  }
}

public object QueryRewardWeightResponseJvmConverter :
    ProtobufTypeMapper<QueryRewardWeightResponse, QueryOuterClass.QueryRewardWeightResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryRewardWeightResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryRewardWeightResponse> =
      QueryOuterClass.QueryRewardWeightResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryRewardWeightResponse):
      QueryRewardWeightResponse = QueryRewardWeightResponse(
  	rewardWeight = obj.getRewardWeight(),
  )

  public override fun convert(obj: QueryRewardWeightResponse):
      QueryOuterClass.QueryRewardWeightResponse {
    val builder = QueryOuterClass.QueryRewardWeightResponse.newBuilder()
    builder.setRewardWeight(obj.rewardWeight)
    return builder.build()
  }
}

public object QueryTaxProceedsRequestJvmConverter :
    ProtobufTypeMapper<QueryTaxProceedsRequest, QueryOuterClass.QueryTaxProceedsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTaxProceedsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTaxProceedsRequest> =
      QueryOuterClass.QueryTaxProceedsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryTaxProceedsRequest): QueryTaxProceedsRequest
      = QueryTaxProceedsRequest(
  )

  public override fun convert(obj: QueryTaxProceedsRequest):
      QueryOuterClass.QueryTaxProceedsRequest {
    val builder = QueryOuterClass.QueryTaxProceedsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryTaxProceedsResponseJvmConverter :
    ProtobufTypeMapper<QueryTaxProceedsResponse, QueryOuterClass.QueryTaxProceedsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTaxProceedsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTaxProceedsResponse> =
      QueryOuterClass.QueryTaxProceedsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryTaxProceedsResponse):
      QueryTaxProceedsResponse = QueryTaxProceedsResponse(
  	taxProceeds = obj.getTaxProceedsList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: QueryTaxProceedsResponse):
      QueryOuterClass.QueryTaxProceedsResponse {
    val builder = QueryOuterClass.QueryTaxProceedsResponse.newBuilder()
    builder.addAllTaxProceeds(obj.taxProceeds.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object QuerySeigniorageProceedsRequestJvmConverter :
    ProtobufTypeMapper<QuerySeigniorageProceedsRequest, QueryOuterClass.QuerySeigniorageProceedsRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySeigniorageProceedsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySeigniorageProceedsRequest> =
      QueryOuterClass.QuerySeigniorageProceedsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySeigniorageProceedsRequest):
      QuerySeigniorageProceedsRequest = QuerySeigniorageProceedsRequest(
  )

  public override fun convert(obj: QuerySeigniorageProceedsRequest):
      QueryOuterClass.QuerySeigniorageProceedsRequest {
    val builder = QueryOuterClass.QuerySeigniorageProceedsRequest.newBuilder()
    return builder.build()
  }
}

public object QuerySeigniorageProceedsResponseJvmConverter :
    ProtobufTypeMapper<QuerySeigniorageProceedsResponse, QueryOuterClass.QuerySeigniorageProceedsResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySeigniorageProceedsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySeigniorageProceedsResponse> =
      QueryOuterClass.QuerySeigniorageProceedsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySeigniorageProceedsResponse):
      QuerySeigniorageProceedsResponse = QuerySeigniorageProceedsResponse(
  	seigniorageProceeds = obj.getSeigniorageProceeds(),
  )

  public override fun convert(obj: QuerySeigniorageProceedsResponse):
      QueryOuterClass.QuerySeigniorageProceedsResponse {
    val builder = QueryOuterClass.QuerySeigniorageProceedsResponse.newBuilder()
    builder.setSeigniorageProceeds(obj.seigniorageProceeds)
    return builder.build()
  }
}

public object QueryIndicatorsRequestJvmConverter :
    ProtobufTypeMapper<QueryIndicatorsRequest, QueryOuterClass.QueryIndicatorsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryIndicatorsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryIndicatorsRequest> =
      QueryOuterClass.QueryIndicatorsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryIndicatorsRequest): QueryIndicatorsRequest =
      QueryIndicatorsRequest(
  )

  public override fun convert(obj: QueryIndicatorsRequest): QueryOuterClass.QueryIndicatorsRequest {
    val builder = QueryOuterClass.QueryIndicatorsRequest.newBuilder()
    return builder.build()
  }
}

public object QueryIndicatorsResponseJvmConverter :
    ProtobufTypeMapper<QueryIndicatorsResponse, QueryOuterClass.QueryIndicatorsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryIndicatorsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryIndicatorsResponse> =
      QueryOuterClass.QueryIndicatorsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryIndicatorsResponse): QueryIndicatorsResponse
      = QueryIndicatorsResponse(
  	trlYear = obj.getTrlYear(),
  	trlMonth = obj.getTrlMonth(),
  )

  public override fun convert(obj: QueryIndicatorsResponse):
      QueryOuterClass.QueryIndicatorsResponse {
    val builder = QueryOuterClass.QueryIndicatorsResponse.newBuilder()
    builder.setTrlYear(obj.trlYear)
    builder.setTrlMonth(obj.trlMonth)
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

public object QueryBurnTaxExemptionListRequestJvmConverter :
    ProtobufTypeMapper<QueryBurnTaxExemptionListRequest, QueryOuterClass.QueryBurnTaxExemptionListRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBurnTaxExemptionListRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBurnTaxExemptionListRequest> =
      QueryOuterClass.QueryBurnTaxExemptionListRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryBurnTaxExemptionListRequest):
      QueryBurnTaxExemptionListRequest = QueryBurnTaxExemptionListRequest(
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryBurnTaxExemptionListRequest):
      QueryOuterClass.QueryBurnTaxExemptionListRequest {
    val builder = QueryOuterClass.QueryBurnTaxExemptionListRequest.newBuilder()
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryBurnTaxExemptionListResponseJvmConverter :
    ProtobufTypeMapper<QueryBurnTaxExemptionListResponse, QueryOuterClass.QueryBurnTaxExemptionListResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBurnTaxExemptionListResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBurnTaxExemptionListResponse> =
      QueryOuterClass.QueryBurnTaxExemptionListResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryBurnTaxExemptionListResponse):
      QueryBurnTaxExemptionListResponse = QueryBurnTaxExemptionListResponse(
  	addresses = obj.getAddressesList().map { it },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryBurnTaxExemptionListResponse):
      QueryOuterClass.QueryBurnTaxExemptionListResponse {
    val builder = QueryOuterClass.QueryBurnTaxExemptionListResponse.newBuilder()
    builder.addAllAddresses(obj.addresses.map { it })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

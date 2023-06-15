// Transform from cosmos/feegrant/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.feegrant.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestJvmConverter
import cosmos.base.query.v1beta1.PageResponseJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueryAllowanceRequestJvmConverter :
    ProtobufTypeMapper<QueryAllowanceRequest, QueryOuterClass.QueryAllowanceRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllowanceRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllowanceRequest> =
      QueryOuterClass.QueryAllowanceRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllowanceRequest): QueryAllowanceRequest =
      QueryAllowanceRequest(
  	granter = obj.getGranter(),
  	grantee = obj.getGrantee(),
  )

  public override fun convert(obj: QueryAllowanceRequest): QueryOuterClass.QueryAllowanceRequest {
    val builder = QueryOuterClass.QueryAllowanceRequest.newBuilder()
    builder.setGranter(obj.granter)
    builder.setGrantee(obj.grantee)
    return builder.build()
  }
}

public object QueryAllowanceResponseJvmConverter :
    ProtobufTypeMapper<QueryAllowanceResponse, QueryOuterClass.QueryAllowanceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllowanceResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllowanceResponse> =
      QueryOuterClass.QueryAllowanceResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllowanceResponse): QueryAllowanceResponse =
      QueryAllowanceResponse(
  	allowance = GrantJvmConverter.convert(obj.getAllowance()),
  )

  public override fun convert(obj: QueryAllowanceResponse): QueryOuterClass.QueryAllowanceResponse {
    val builder = QueryOuterClass.QueryAllowanceResponse.newBuilder()
    builder.setAllowance(GrantJvmConverter.convert(obj.allowance))
    return builder.build()
  }
}

public object QueryAllowancesRequestJvmConverter :
    ProtobufTypeMapper<QueryAllowancesRequest, QueryOuterClass.QueryAllowancesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllowancesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllowancesRequest> =
      QueryOuterClass.QueryAllowancesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllowancesRequest): QueryAllowancesRequest =
      QueryAllowancesRequest(
  	grantee = obj.getGrantee(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllowancesRequest): QueryOuterClass.QueryAllowancesRequest {
    val builder = QueryOuterClass.QueryAllowancesRequest.newBuilder()
    builder.setGrantee(obj.grantee)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllowancesResponseJvmConverter :
    ProtobufTypeMapper<QueryAllowancesResponse, QueryOuterClass.QueryAllowancesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllowancesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllowancesResponse> =
      QueryOuterClass.QueryAllowancesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllowancesResponse): QueryAllowancesResponse
      = QueryAllowancesResponse(
  	allowances = obj.getAllowancesList().map { GrantJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllowancesResponse):
      QueryOuterClass.QueryAllowancesResponse {
    val builder = QueryOuterClass.QueryAllowancesResponse.newBuilder()
    builder.addAllAllowances(obj.allowances.map { GrantJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllowancesByGranterRequestJvmConverter :
    ProtobufTypeMapper<QueryAllowancesByGranterRequest, QueryOuterClass.QueryAllowancesByGranterRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllowancesByGranterRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllowancesByGranterRequest> =
      QueryOuterClass.QueryAllowancesByGranterRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllowancesByGranterRequest):
      QueryAllowancesByGranterRequest = QueryAllowancesByGranterRequest(
  	granter = obj.getGranter(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllowancesByGranterRequest):
      QueryOuterClass.QueryAllowancesByGranterRequest {
    val builder = QueryOuterClass.QueryAllowancesByGranterRequest.newBuilder()
    builder.setGranter(obj.granter)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllowancesByGranterResponseJvmConverter :
    ProtobufTypeMapper<QueryAllowancesByGranterResponse, QueryOuterClass.QueryAllowancesByGranterResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllowancesByGranterResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllowancesByGranterResponse> =
      QueryOuterClass.QueryAllowancesByGranterResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllowancesByGranterResponse):
      QueryAllowancesByGranterResponse = QueryAllowancesByGranterResponse(
  	allowances = obj.getAllowancesList().map { GrantJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllowancesByGranterResponse):
      QueryOuterClass.QueryAllowancesByGranterResponse {
    val builder = QueryOuterClass.QueryAllowancesByGranterResponse.newBuilder()
    builder.addAllAllowances(obj.allowances.map { GrantJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

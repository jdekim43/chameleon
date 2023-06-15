// Transform from cosmos/authz/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.authz.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestJvmConverter
import cosmos.base.query.v1beta1.PageResponseJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueryGrantsRequestJvmConverter :
    ProtobufTypeMapper<QueryGrantsRequest, QueryOuterClass.QueryGrantsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGrantsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGrantsRequest> =
      QueryOuterClass.QueryGrantsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGrantsRequest): QueryGrantsRequest =
      QueryGrantsRequest(
  	granter = obj.getGranter(),
  	grantee = obj.getGrantee(),
  	msgTypeUrl = obj.getMsgTypeUrl(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryGrantsRequest): QueryOuterClass.QueryGrantsRequest {
    val builder = QueryOuterClass.QueryGrantsRequest.newBuilder()
    builder.setGranter(obj.granter)
    builder.setGrantee(obj.grantee)
    builder.setMsgTypeUrl(obj.msgTypeUrl)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGrantsResponseJvmConverter :
    ProtobufTypeMapper<QueryGrantsResponse, QueryOuterClass.QueryGrantsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGrantsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGrantsResponse> =
      QueryOuterClass.QueryGrantsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGrantsResponse): QueryGrantsResponse =
      QueryGrantsResponse(
  	grants = obj.getGrantsList().map { GrantJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryGrantsResponse): QueryOuterClass.QueryGrantsResponse {
    val builder = QueryOuterClass.QueryGrantsResponse.newBuilder()
    builder.addAllGrants(obj.grants.map { GrantJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGranterGrantsRequestJvmConverter :
    ProtobufTypeMapper<QueryGranterGrantsRequest, QueryOuterClass.QueryGranterGrantsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGranterGrantsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGranterGrantsRequest> =
      QueryOuterClass.QueryGranterGrantsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGranterGrantsRequest):
      QueryGranterGrantsRequest = QueryGranterGrantsRequest(
  	granter = obj.getGranter(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryGranterGrantsRequest):
      QueryOuterClass.QueryGranterGrantsRequest {
    val builder = QueryOuterClass.QueryGranterGrantsRequest.newBuilder()
    builder.setGranter(obj.granter)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGranterGrantsResponseJvmConverter :
    ProtobufTypeMapper<QueryGranterGrantsResponse, QueryOuterClass.QueryGranterGrantsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGranterGrantsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGranterGrantsResponse> =
      QueryOuterClass.QueryGranterGrantsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGranterGrantsResponse):
      QueryGranterGrantsResponse = QueryGranterGrantsResponse(
  	grants = obj.getGrantsList().map { GrantAuthorizationJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryGranterGrantsResponse):
      QueryOuterClass.QueryGranterGrantsResponse {
    val builder = QueryOuterClass.QueryGranterGrantsResponse.newBuilder()
    builder.addAllGrants(obj.grants.map { GrantAuthorizationJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGranteeGrantsRequestJvmConverter :
    ProtobufTypeMapper<QueryGranteeGrantsRequest, QueryOuterClass.QueryGranteeGrantsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGranteeGrantsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGranteeGrantsRequest> =
      QueryOuterClass.QueryGranteeGrantsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryGranteeGrantsRequest):
      QueryGranteeGrantsRequest = QueryGranteeGrantsRequest(
  	grantee = obj.getGrantee(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryGranteeGrantsRequest):
      QueryOuterClass.QueryGranteeGrantsRequest {
    val builder = QueryOuterClass.QueryGranteeGrantsRequest.newBuilder()
    builder.setGrantee(obj.grantee)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryGranteeGrantsResponseJvmConverter :
    ProtobufTypeMapper<QueryGranteeGrantsResponse, QueryOuterClass.QueryGranteeGrantsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryGranteeGrantsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryGranteeGrantsResponse> =
      QueryOuterClass.QueryGranteeGrantsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryGranteeGrantsResponse):
      QueryGranteeGrantsResponse = QueryGranteeGrantsResponse(
  	grants = obj.getGrantsList().map { GrantAuthorizationJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryGranteeGrantsResponse):
      QueryOuterClass.QueryGranteeGrantsResponse {
    val builder = QueryOuterClass.QueryGranteeGrantsResponse.newBuilder()
    builder.addAllGrants(obj.grants.map { GrantAuthorizationJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

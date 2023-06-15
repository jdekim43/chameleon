// Transform from cosmos/params/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.params.v1beta1

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
  	subspace = obj.getSubspace(),
  	key = obj.getKey(),
  )

  public override fun convert(obj: QueryParamsRequest): QueryOuterClass.QueryParamsRequest {
    val builder = QueryOuterClass.QueryParamsRequest.newBuilder()
    builder.setSubspace(obj.subspace)
    builder.setKey(obj.key)
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
  	`param` = ParamChangeJvmConverter.convert(obj.getParam()),
  )

  public override fun convert(obj: QueryParamsResponse): QueryOuterClass.QueryParamsResponse {
    val builder = QueryOuterClass.QueryParamsResponse.newBuilder()
    builder.setParam(ParamChangeJvmConverter.convert(obj.`param`))
    return builder.build()
  }
}

public object QuerySubspacesRequestJvmConverter :
    ProtobufTypeMapper<QuerySubspacesRequest, QueryOuterClass.QuerySubspacesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubspacesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySubspacesRequest> =
      QueryOuterClass.QuerySubspacesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubspacesRequest): QuerySubspacesRequest =
      QuerySubspacesRequest(
  )

  public override fun convert(obj: QuerySubspacesRequest): QueryOuterClass.QuerySubspacesRequest {
    val builder = QueryOuterClass.QuerySubspacesRequest.newBuilder()
    return builder.build()
  }
}

public object QuerySubspacesResponseJvmConverter :
    ProtobufTypeMapper<QuerySubspacesResponse, QueryOuterClass.QuerySubspacesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySubspacesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySubspacesResponse> =
      QueryOuterClass.QuerySubspacesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySubspacesResponse): QuerySubspacesResponse =
      QuerySubspacesResponse(
  	subspaces = obj.getSubspacesList().map { SubspaceJvmConverter.convert(it) },
  )

  public override fun convert(obj: QuerySubspacesResponse): QueryOuterClass.QuerySubspacesResponse {
    val builder = QueryOuterClass.QuerySubspacesResponse.newBuilder()
    builder.addAllSubspaces(obj.subspaces.map { SubspaceJvmConverter.convert(it) })
    return builder.build()
  }
}

public object SubspaceJvmConverter : ProtobufTypeMapper<Subspace, QueryOuterClass.Subspace> {
  public override val descriptor: Descriptors.Descriptor = QueryOuterClass.Subspace.getDescriptor()

  public override val parser: Parser<QueryOuterClass.Subspace> = QueryOuterClass.Subspace.parser()

  public override fun convert(obj: QueryOuterClass.Subspace): Subspace = Subspace(
  	subspace = obj.getSubspace(),
  	keys = obj.getKeysList().map { it },
  )

  public override fun convert(obj: Subspace): QueryOuterClass.Subspace {
    val builder = QueryOuterClass.Subspace.newBuilder()
    builder.setSubspace(obj.subspace)
    builder.addAllKeys(obj.keys.map { it })
    return builder.build()
  }
}

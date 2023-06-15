// Transform from cosmos/base/query/v1beta1/pagination.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.query.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object PageRequestJvmConverter : ProtobufTypeMapper<PageRequest, Pagination.PageRequest> {
  public override val descriptor: Descriptors.Descriptor = Pagination.PageRequest.getDescriptor()

  public override val parser: Parser<Pagination.PageRequest> = Pagination.PageRequest.parser()

  public override fun convert(obj: Pagination.PageRequest): PageRequest = PageRequest(
  	key = obj.getKey().toByteArray(),
  	offset = obj.getOffset().asKotlinType,
  	limit = obj.getLimit().asKotlinType,
  	countTotal = obj.getCountTotal(),
  	reverse = obj.getReverse(),
  )

  public override fun convert(obj: PageRequest): Pagination.PageRequest {
    val builder = Pagination.PageRequest.newBuilder()
    builder.setKey(ByteString.copyFrom(obj.key))
    builder.setOffset(obj.offset.asJavaType)
    builder.setLimit(obj.limit.asJavaType)
    builder.setCountTotal(obj.countTotal)
    builder.setReverse(obj.reverse)
    return builder.build()
  }
}

public object PageResponseJvmConverter : ProtobufTypeMapper<PageResponse, Pagination.PageResponse> {
  public override val descriptor: Descriptors.Descriptor = Pagination.PageResponse.getDescriptor()

  public override val parser: Parser<Pagination.PageResponse> = Pagination.PageResponse.parser()

  public override fun convert(obj: Pagination.PageResponse): PageResponse = PageResponse(
  	nextKey = obj.getNextKey().toByteArray(),
  	total = obj.getTotal().asKotlinType,
  )

  public override fun convert(obj: PageResponse): Pagination.PageResponse {
    val builder = Pagination.PageResponse.newBuilder()
    builder.setNextKey(ByteString.copyFrom(obj.nextKey))
    builder.setTotal(obj.total.asJavaType)
    return builder.build()
  }
}

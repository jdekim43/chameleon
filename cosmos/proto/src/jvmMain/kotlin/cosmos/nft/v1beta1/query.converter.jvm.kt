// Transform from cosmos/nft/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.nft.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestJvmConverter
import cosmos.base.query.v1beta1.PageResponseJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object QueryBalanceRequestJvmConverter :
    ProtobufTypeMapper<QueryBalanceRequest, QueryOuterClass.QueryBalanceRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBalanceRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBalanceRequest> =
      QueryOuterClass.QueryBalanceRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryBalanceRequest): QueryBalanceRequest =
      QueryBalanceRequest(
  	classId = obj.getClassId(),
  	owner = obj.getOwner(),
  )

  public override fun convert(obj: QueryBalanceRequest): QueryOuterClass.QueryBalanceRequest {
    val builder = QueryOuterClass.QueryBalanceRequest.newBuilder()
    builder.setClassId(obj.classId)
    builder.setOwner(obj.owner)
    return builder.build()
  }
}

public object QueryBalanceResponseJvmConverter :
    ProtobufTypeMapper<QueryBalanceResponse, QueryOuterClass.QueryBalanceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBalanceResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBalanceResponse> =
      QueryOuterClass.QueryBalanceResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryBalanceResponse): QueryBalanceResponse =
      QueryBalanceResponse(
  	amount = obj.getAmount().asKotlinType,
  )

  public override fun convert(obj: QueryBalanceResponse): QueryOuterClass.QueryBalanceResponse {
    val builder = QueryOuterClass.QueryBalanceResponse.newBuilder()
    builder.setAmount(obj.amount.asJavaType)
    return builder.build()
  }
}

public object QueryOwnerRequestJvmConverter :
    ProtobufTypeMapper<QueryOwnerRequest, QueryOuterClass.QueryOwnerRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOwnerRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOwnerRequest> =
      QueryOuterClass.QueryOwnerRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryOwnerRequest): QueryOwnerRequest =
      QueryOwnerRequest(
  	classId = obj.getClassId(),
  	id = obj.getId(),
  )

  public override fun convert(obj: QueryOwnerRequest): QueryOuterClass.QueryOwnerRequest {
    val builder = QueryOuterClass.QueryOwnerRequest.newBuilder()
    builder.setClassId(obj.classId)
    builder.setId(obj.id)
    return builder.build()
  }
}

public object QueryOwnerResponseJvmConverter :
    ProtobufTypeMapper<QueryOwnerResponse, QueryOuterClass.QueryOwnerResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryOwnerResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryOwnerResponse> =
      QueryOuterClass.QueryOwnerResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryOwnerResponse): QueryOwnerResponse =
      QueryOwnerResponse(
  	owner = obj.getOwner(),
  )

  public override fun convert(obj: QueryOwnerResponse): QueryOuterClass.QueryOwnerResponse {
    val builder = QueryOuterClass.QueryOwnerResponse.newBuilder()
    builder.setOwner(obj.owner)
    return builder.build()
  }
}

public object QuerySupplyRequestJvmConverter :
    ProtobufTypeMapper<QuerySupplyRequest, QueryOuterClass.QuerySupplyRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySupplyRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySupplyRequest> =
      QueryOuterClass.QuerySupplyRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySupplyRequest): QuerySupplyRequest =
      QuerySupplyRequest(
  	classId = obj.getClassId(),
  )

  public override fun convert(obj: QuerySupplyRequest): QueryOuterClass.QuerySupplyRequest {
    val builder = QueryOuterClass.QuerySupplyRequest.newBuilder()
    builder.setClassId(obj.classId)
    return builder.build()
  }
}

public object QuerySupplyResponseJvmConverter :
    ProtobufTypeMapper<QuerySupplyResponse, QueryOuterClass.QuerySupplyResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySupplyResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySupplyResponse> =
      QueryOuterClass.QuerySupplyResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySupplyResponse): QuerySupplyResponse =
      QuerySupplyResponse(
  	amount = obj.getAmount().asKotlinType,
  )

  public override fun convert(obj: QuerySupplyResponse): QueryOuterClass.QuerySupplyResponse {
    val builder = QueryOuterClass.QuerySupplyResponse.newBuilder()
    builder.setAmount(obj.amount.asJavaType)
    return builder.build()
  }
}

public object QueryNFTsRequestJvmConverter :
    ProtobufTypeMapper<QueryNFTsRequest, QueryOuterClass.QueryNFTsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryNFTsRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryNFTsRequest> =
      QueryOuterClass.QueryNFTsRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryNFTsRequest): QueryNFTsRequest =
      QueryNFTsRequest(
  	classId = obj.getClassId(),
  	owner = obj.getOwner(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryNFTsRequest): QueryOuterClass.QueryNFTsRequest {
    val builder = QueryOuterClass.QueryNFTsRequest.newBuilder()
    builder.setClassId(obj.classId)
    builder.setOwner(obj.owner)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryNFTsResponseJvmConverter :
    ProtobufTypeMapper<QueryNFTsResponse, QueryOuterClass.QueryNFTsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryNFTsResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryNFTsResponse> =
      QueryOuterClass.QueryNFTsResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryNFTsResponse): QueryNFTsResponse =
      QueryNFTsResponse(
  	nfts = obj.getNftsList().map { NFTJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryNFTsResponse): QueryOuterClass.QueryNFTsResponse {
    val builder = QueryOuterClass.QueryNFTsResponse.newBuilder()
    builder.addAllNfts(obj.nfts.map { NFTJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryNFTRequestJvmConverter :
    ProtobufTypeMapper<QueryNFTRequest, QueryOuterClass.QueryNFTRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryNFTRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryNFTRequest> =
      QueryOuterClass.QueryNFTRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryNFTRequest): QueryNFTRequest =
      QueryNFTRequest(
  	classId = obj.getClassId(),
  	id = obj.getId(),
  )

  public override fun convert(obj: QueryNFTRequest): QueryOuterClass.QueryNFTRequest {
    val builder = QueryOuterClass.QueryNFTRequest.newBuilder()
    builder.setClassId(obj.classId)
    builder.setId(obj.id)
    return builder.build()
  }
}

public object QueryNFTResponseJvmConverter :
    ProtobufTypeMapper<QueryNFTResponse, QueryOuterClass.QueryNFTResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryNFTResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryNFTResponse> =
      QueryOuterClass.QueryNFTResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryNFTResponse): QueryNFTResponse =
      QueryNFTResponse(
  	nft = NFTJvmConverter.convert(obj.getNft()),
  )

  public override fun convert(obj: QueryNFTResponse): QueryOuterClass.QueryNFTResponse {
    val builder = QueryOuterClass.QueryNFTResponse.newBuilder()
    builder.setNft(NFTJvmConverter.convert(obj.nft))
    return builder.build()
  }
}

public object QueryClassRequestJvmConverter :
    ProtobufTypeMapper<QueryClassRequest, QueryOuterClass.QueryClassRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryClassRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryClassRequest> =
      QueryOuterClass.QueryClassRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryClassRequest): QueryClassRequest =
      QueryClassRequest(
  	classId = obj.getClassId(),
  )

  public override fun convert(obj: QueryClassRequest): QueryOuterClass.QueryClassRequest {
    val builder = QueryOuterClass.QueryClassRequest.newBuilder()
    builder.setClassId(obj.classId)
    return builder.build()
  }
}

public object QueryClassResponseJvmConverter :
    ProtobufTypeMapper<QueryClassResponse, QueryOuterClass.QueryClassResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryClassResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryClassResponse> =
      QueryOuterClass.QueryClassResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryClassResponse): QueryClassResponse =
      QueryClassResponse(
  	`class` = ClassJvmConverter.convert(obj.getClass_()),
  )

  public override fun convert(obj: QueryClassResponse): QueryOuterClass.QueryClassResponse {
    val builder = QueryOuterClass.QueryClassResponse.newBuilder()
    builder.setClass_(ClassJvmConverter.convert(obj.`class`))
    return builder.build()
  }
}

public object QueryClassesRequestJvmConverter :
    ProtobufTypeMapper<QueryClassesRequest, QueryOuterClass.QueryClassesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryClassesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryClassesRequest> =
      QueryOuterClass.QueryClassesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryClassesRequest): QueryClassesRequest =
      QueryClassesRequest(
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryClassesRequest): QueryOuterClass.QueryClassesRequest {
    val builder = QueryOuterClass.QueryClassesRequest.newBuilder()
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryClassesResponseJvmConverter :
    ProtobufTypeMapper<QueryClassesResponse, QueryOuterClass.QueryClassesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryClassesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryClassesResponse> =
      QueryOuterClass.QueryClassesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryClassesResponse): QueryClassesResponse =
      QueryClassesResponse(
  	classes = obj.getClassesList().map { ClassJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryClassesResponse): QueryOuterClass.QueryClassesResponse {
    val builder = QueryOuterClass.QueryClassesResponse.newBuilder()
    builder.addAllClasses(obj.classes.map { ClassJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

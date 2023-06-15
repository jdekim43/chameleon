// Transform from cosmos/bank/v1beta1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.query.v1beta1.PageRequestJvmConverter
import cosmos.base.query.v1beta1.PageResponseJvmConverter
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object QueryBalanceRequestJvmConverter :
    ProtobufTypeMapper<QueryBalanceRequest, QueryOuterClass.QueryBalanceRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryBalanceRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryBalanceRequest> =
      QueryOuterClass.QueryBalanceRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryBalanceRequest): QueryBalanceRequest =
      QueryBalanceRequest(
  	address = obj.getAddress(),
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: QueryBalanceRequest): QueryOuterClass.QueryBalanceRequest {
    val builder = QueryOuterClass.QueryBalanceRequest.newBuilder()
    builder.setAddress(obj.address)
    builder.setDenom(obj.denom)
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
  	balance = CoinJvmConverter.convert(obj.getBalance()),
  )

  public override fun convert(obj: QueryBalanceResponse): QueryOuterClass.QueryBalanceResponse {
    val builder = QueryOuterClass.QueryBalanceResponse.newBuilder()
    builder.setBalance(CoinJvmConverter.convert(obj.balance))
    return builder.build()
  }
}

public object QueryAllBalancesRequestJvmConverter :
    ProtobufTypeMapper<QueryAllBalancesRequest, QueryOuterClass.QueryAllBalancesRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllBalancesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllBalancesRequest> =
      QueryOuterClass.QueryAllBalancesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllBalancesRequest): QueryAllBalancesRequest
      = QueryAllBalancesRequest(
  	address = obj.getAddress(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllBalancesRequest):
      QueryOuterClass.QueryAllBalancesRequest {
    val builder = QueryOuterClass.QueryAllBalancesRequest.newBuilder()
    builder.setAddress(obj.address)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryAllBalancesResponseJvmConverter :
    ProtobufTypeMapper<QueryAllBalancesResponse, QueryOuterClass.QueryAllBalancesResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryAllBalancesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryAllBalancesResponse> =
      QueryOuterClass.QueryAllBalancesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryAllBalancesResponse):
      QueryAllBalancesResponse = QueryAllBalancesResponse(
  	balances = obj.getBalancesList().map { CoinJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryAllBalancesResponse):
      QueryOuterClass.QueryAllBalancesResponse {
    val builder = QueryOuterClass.QueryAllBalancesResponse.newBuilder()
    builder.addAllBalances(obj.balances.map { CoinJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QuerySpendableBalancesRequestJvmConverter :
    ProtobufTypeMapper<QuerySpendableBalancesRequest, QueryOuterClass.QuerySpendableBalancesRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySpendableBalancesRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySpendableBalancesRequest> =
      QueryOuterClass.QuerySpendableBalancesRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySpendableBalancesRequest):
      QuerySpendableBalancesRequest = QuerySpendableBalancesRequest(
  	address = obj.getAddress(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QuerySpendableBalancesRequest):
      QueryOuterClass.QuerySpendableBalancesRequest {
    val builder = QueryOuterClass.QuerySpendableBalancesRequest.newBuilder()
    builder.setAddress(obj.address)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QuerySpendableBalancesResponseJvmConverter :
    ProtobufTypeMapper<QuerySpendableBalancesResponse, QueryOuterClass.QuerySpendableBalancesResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySpendableBalancesResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySpendableBalancesResponse> =
      QueryOuterClass.QuerySpendableBalancesResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySpendableBalancesResponse):
      QuerySpendableBalancesResponse = QuerySpendableBalancesResponse(
  	balances = obj.getBalancesList().map { CoinJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QuerySpendableBalancesResponse):
      QueryOuterClass.QuerySpendableBalancesResponse {
    val builder = QueryOuterClass.QuerySpendableBalancesResponse.newBuilder()
    builder.addAllBalances(obj.balances.map { CoinJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QuerySpendableBalanceByDenomRequestJvmConverter :
    ProtobufTypeMapper<QuerySpendableBalanceByDenomRequest, QueryOuterClass.QuerySpendableBalanceByDenomRequest>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySpendableBalanceByDenomRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySpendableBalanceByDenomRequest> =
      QueryOuterClass.QuerySpendableBalanceByDenomRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySpendableBalanceByDenomRequest):
      QuerySpendableBalanceByDenomRequest = QuerySpendableBalanceByDenomRequest(
  	address = obj.getAddress(),
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: QuerySpendableBalanceByDenomRequest):
      QueryOuterClass.QuerySpendableBalanceByDenomRequest {
    val builder = QueryOuterClass.QuerySpendableBalanceByDenomRequest.newBuilder()
    builder.setAddress(obj.address)
    builder.setDenom(obj.denom)
    return builder.build()
  }
}

public object QuerySpendableBalanceByDenomResponseJvmConverter :
    ProtobufTypeMapper<QuerySpendableBalanceByDenomResponse, QueryOuterClass.QuerySpendableBalanceByDenomResponse>
    {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySpendableBalanceByDenomResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySpendableBalanceByDenomResponse> =
      QueryOuterClass.QuerySpendableBalanceByDenomResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySpendableBalanceByDenomResponse):
      QuerySpendableBalanceByDenomResponse = QuerySpendableBalanceByDenomResponse(
  	balance = CoinJvmConverter.convert(obj.getBalance()),
  )

  public override fun convert(obj: QuerySpendableBalanceByDenomResponse):
      QueryOuterClass.QuerySpendableBalanceByDenomResponse {
    val builder = QueryOuterClass.QuerySpendableBalanceByDenomResponse.newBuilder()
    builder.setBalance(CoinJvmConverter.convert(obj.balance))
    return builder.build()
  }
}

public object QueryTotalSupplyRequestJvmConverter :
    ProtobufTypeMapper<QueryTotalSupplyRequest, QueryOuterClass.QueryTotalSupplyRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTotalSupplyRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTotalSupplyRequest> =
      QueryOuterClass.QueryTotalSupplyRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryTotalSupplyRequest): QueryTotalSupplyRequest
      = QueryTotalSupplyRequest(
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryTotalSupplyRequest):
      QueryOuterClass.QueryTotalSupplyRequest {
    val builder = QueryOuterClass.QueryTotalSupplyRequest.newBuilder()
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryTotalSupplyResponseJvmConverter :
    ProtobufTypeMapper<QueryTotalSupplyResponse, QueryOuterClass.QueryTotalSupplyResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryTotalSupplyResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryTotalSupplyResponse> =
      QueryOuterClass.QueryTotalSupplyResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryTotalSupplyResponse):
      QueryTotalSupplyResponse = QueryTotalSupplyResponse(
  	supply = obj.getSupplyList().map { CoinJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryTotalSupplyResponse):
      QueryOuterClass.QueryTotalSupplyResponse {
    val builder = QueryOuterClass.QueryTotalSupplyResponse.newBuilder()
    builder.addAllSupply(obj.supply.map { CoinJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QuerySupplyOfRequestJvmConverter :
    ProtobufTypeMapper<QuerySupplyOfRequest, QueryOuterClass.QuerySupplyOfRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySupplyOfRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySupplyOfRequest> =
      QueryOuterClass.QuerySupplyOfRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySupplyOfRequest): QuerySupplyOfRequest =
      QuerySupplyOfRequest(
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: QuerySupplyOfRequest): QueryOuterClass.QuerySupplyOfRequest {
    val builder = QueryOuterClass.QuerySupplyOfRequest.newBuilder()
    builder.setDenom(obj.denom)
    return builder.build()
  }
}

public object QuerySupplyOfResponseJvmConverter :
    ProtobufTypeMapper<QuerySupplyOfResponse, QueryOuterClass.QuerySupplyOfResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySupplyOfResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySupplyOfResponse> =
      QueryOuterClass.QuerySupplyOfResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySupplyOfResponse): QuerySupplyOfResponse =
      QuerySupplyOfResponse(
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: QuerySupplyOfResponse): QueryOuterClass.QuerySupplyOfResponse {
    val builder = QueryOuterClass.QuerySupplyOfResponse.newBuilder()
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
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

public object QueryDenomsMetadataRequestJvmConverter :
    ProtobufTypeMapper<QueryDenomsMetadataRequest, QueryOuterClass.QueryDenomsMetadataRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomsMetadataRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomsMetadataRequest> =
      QueryOuterClass.QueryDenomsMetadataRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomsMetadataRequest):
      QueryDenomsMetadataRequest = QueryDenomsMetadataRequest(
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryDenomsMetadataRequest):
      QueryOuterClass.QueryDenomsMetadataRequest {
    val builder = QueryOuterClass.QueryDenomsMetadataRequest.newBuilder()
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryDenomsMetadataResponseJvmConverter :
    ProtobufTypeMapper<QueryDenomsMetadataResponse, QueryOuterClass.QueryDenomsMetadataResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomsMetadataResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomsMetadataResponse> =
      QueryOuterClass.QueryDenomsMetadataResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomsMetadataResponse):
      QueryDenomsMetadataResponse = QueryDenomsMetadataResponse(
  	metadatas = obj.getMetadatasList().map { MetadataJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryDenomsMetadataResponse):
      QueryOuterClass.QueryDenomsMetadataResponse {
    val builder = QueryOuterClass.QueryDenomsMetadataResponse.newBuilder()
    builder.addAllMetadatas(obj.metadatas.map { MetadataJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QueryDenomMetadataRequestJvmConverter :
    ProtobufTypeMapper<QueryDenomMetadataRequest, QueryOuterClass.QueryDenomMetadataRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomMetadataRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomMetadataRequest> =
      QueryOuterClass.QueryDenomMetadataRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomMetadataRequest):
      QueryDenomMetadataRequest = QueryDenomMetadataRequest(
  	denom = obj.getDenom(),
  )

  public override fun convert(obj: QueryDenomMetadataRequest):
      QueryOuterClass.QueryDenomMetadataRequest {
    val builder = QueryOuterClass.QueryDenomMetadataRequest.newBuilder()
    builder.setDenom(obj.denom)
    return builder.build()
  }
}

public object QueryDenomMetadataResponseJvmConverter :
    ProtobufTypeMapper<QueryDenomMetadataResponse, QueryOuterClass.QueryDenomMetadataResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomMetadataResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomMetadataResponse> =
      QueryOuterClass.QueryDenomMetadataResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomMetadataResponse):
      QueryDenomMetadataResponse = QueryDenomMetadataResponse(
  	metadata = MetadataJvmConverter.convert(obj.getMetadata()),
  )

  public override fun convert(obj: QueryDenomMetadataResponse):
      QueryOuterClass.QueryDenomMetadataResponse {
    val builder = QueryOuterClass.QueryDenomMetadataResponse.newBuilder()
    builder.setMetadata(MetadataJvmConverter.convert(obj.metadata))
    return builder.build()
  }
}

public object QueryDenomOwnersRequestJvmConverter :
    ProtobufTypeMapper<QueryDenomOwnersRequest, QueryOuterClass.QueryDenomOwnersRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomOwnersRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomOwnersRequest> =
      QueryOuterClass.QueryDenomOwnersRequest.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomOwnersRequest): QueryDenomOwnersRequest
      = QueryDenomOwnersRequest(
  	denom = obj.getDenom(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryDenomOwnersRequest):
      QueryOuterClass.QueryDenomOwnersRequest {
    val builder = QueryOuterClass.QueryDenomOwnersRequest.newBuilder()
    builder.setDenom(obj.denom)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object DenomOwnerJvmConverter : ProtobufTypeMapper<DenomOwner, QueryOuterClass.DenomOwner> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.DenomOwner.getDescriptor()

  public override val parser: Parser<QueryOuterClass.DenomOwner> =
      QueryOuterClass.DenomOwner.parser()

  public override fun convert(obj: QueryOuterClass.DenomOwner): DenomOwner = DenomOwner(
  	address = obj.getAddress(),
  	balance = CoinJvmConverter.convert(obj.getBalance()),
  )

  public override fun convert(obj: DenomOwner): QueryOuterClass.DenomOwner {
    val builder = QueryOuterClass.DenomOwner.newBuilder()
    builder.setAddress(obj.address)
    builder.setBalance(CoinJvmConverter.convert(obj.balance))
    return builder.build()
  }
}

public object QueryDenomOwnersResponseJvmConverter :
    ProtobufTypeMapper<QueryDenomOwnersResponse, QueryOuterClass.QueryDenomOwnersResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QueryDenomOwnersResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QueryDenomOwnersResponse> =
      QueryOuterClass.QueryDenomOwnersResponse.parser()

  public override fun convert(obj: QueryOuterClass.QueryDenomOwnersResponse):
      QueryDenomOwnersResponse = QueryDenomOwnersResponse(
  	denomOwners = obj.getDenomOwnersList().map { DenomOwnerJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QueryDenomOwnersResponse):
      QueryOuterClass.QueryDenomOwnersResponse {
    val builder = QueryOuterClass.QueryDenomOwnersResponse.newBuilder()
    builder.addAllDenomOwners(obj.denomOwners.map { DenomOwnerJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QuerySendEnabledRequestJvmConverter :
    ProtobufTypeMapper<QuerySendEnabledRequest, QueryOuterClass.QuerySendEnabledRequest> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySendEnabledRequest.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySendEnabledRequest> =
      QueryOuterClass.QuerySendEnabledRequest.parser()

  public override fun convert(obj: QueryOuterClass.QuerySendEnabledRequest): QuerySendEnabledRequest
      = QuerySendEnabledRequest(
  	denoms = obj.getDenomsList().map { it },
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QuerySendEnabledRequest):
      QueryOuterClass.QuerySendEnabledRequest {
    val builder = QueryOuterClass.QuerySendEnabledRequest.newBuilder()
    builder.addAllDenoms(obj.denoms.map { it })
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object QuerySendEnabledResponseJvmConverter :
    ProtobufTypeMapper<QuerySendEnabledResponse, QueryOuterClass.QuerySendEnabledResponse> {
  public override val descriptor: Descriptors.Descriptor =
      QueryOuterClass.QuerySendEnabledResponse.getDescriptor()

  public override val parser: Parser<QueryOuterClass.QuerySendEnabledResponse> =
      QueryOuterClass.QuerySendEnabledResponse.parser()

  public override fun convert(obj: QueryOuterClass.QuerySendEnabledResponse):
      QuerySendEnabledResponse = QuerySendEnabledResponse(
  	sendEnabled = obj.getSendEnabledList().map { SendEnabledJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: QuerySendEnabledResponse):
      QueryOuterClass.QuerySendEnabledResponse {
    val builder = QueryOuterClass.QuerySendEnabledResponse.newBuilder()
    builder.addAllSendEnabled(obj.sendEnabled.map { SendEnabledJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

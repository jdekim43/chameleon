// Transform from cosmos/tx/v1beta1/service.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.tx.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.abci.v1beta1.GasInfoJvmConverter
import cosmos.base.abci.v1beta1.ResultJvmConverter
import cosmos.base.abci.v1beta1.TxResponseJvmConverter
import cosmos.base.query.v1beta1.PageRequestJvmConverter
import cosmos.base.query.v1beta1.PageResponseJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType
import tendermint.types.BlockIDJvmConverter
import tendermint.types.BlockJvmConverter

public object GetTxsEventRequestJvmConverter :
    ProtobufTypeMapper<GetTxsEventRequest, ServiceOuterClass.GetTxsEventRequest> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.GetTxsEventRequest.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.GetTxsEventRequest> =
      ServiceOuterClass.GetTxsEventRequest.parser()

  public override fun convert(obj: ServiceOuterClass.GetTxsEventRequest): GetTxsEventRequest =
      GetTxsEventRequest(
  	events = obj.getEventsList().map { it },
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  	orderBy = OrderBy.forNumber(obj.getOrderBy().number),
  	page = obj.getPage().asKotlinType,
  	limit = obj.getLimit().asKotlinType,
  )

  public override fun convert(obj: GetTxsEventRequest): ServiceOuterClass.GetTxsEventRequest {
    val builder = ServiceOuterClass.GetTxsEventRequest.newBuilder()
    builder.addAllEvents(obj.events.map { it })
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    builder.setOrderBy(ServiceOuterClass.OrderBy.forNumber(obj.orderBy.number))
    builder.setPage(obj.page.asJavaType)
    builder.setLimit(obj.limit.asJavaType)
    return builder.build()
  }
}

public object GetTxsEventResponseJvmConverter :
    ProtobufTypeMapper<GetTxsEventResponse, ServiceOuterClass.GetTxsEventResponse> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.GetTxsEventResponse.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.GetTxsEventResponse> =
      ServiceOuterClass.GetTxsEventResponse.parser()

  public override fun convert(obj: ServiceOuterClass.GetTxsEventResponse): GetTxsEventResponse =
      GetTxsEventResponse(
  	txs = obj.getTxsList().map { TxJvmConverter.convert(it) },
  	txResponses = obj.getTxResponsesList().map { TxResponseJvmConverter.convert(it) },
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  	total = obj.getTotal().asKotlinType,
  )

  public override fun convert(obj: GetTxsEventResponse): ServiceOuterClass.GetTxsEventResponse {
    val builder = ServiceOuterClass.GetTxsEventResponse.newBuilder()
    builder.addAllTxs(obj.txs.map { TxJvmConverter.convert(it) })
    builder.addAllTxResponses(obj.txResponses.map { TxResponseJvmConverter.convert(it) })
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    builder.setTotal(obj.total.asJavaType)
    return builder.build()
  }
}

public object BroadcastTxRequestJvmConverter :
    ProtobufTypeMapper<BroadcastTxRequest, ServiceOuterClass.BroadcastTxRequest> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.BroadcastTxRequest.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.BroadcastTxRequest> =
      ServiceOuterClass.BroadcastTxRequest.parser()

  public override fun convert(obj: ServiceOuterClass.BroadcastTxRequest): BroadcastTxRequest =
      BroadcastTxRequest(
  	txBytes = obj.getTxBytes().toByteArray(),
  	mode = BroadcastMode.forNumber(obj.getMode().number),
  )

  public override fun convert(obj: BroadcastTxRequest): ServiceOuterClass.BroadcastTxRequest {
    val builder = ServiceOuterClass.BroadcastTxRequest.newBuilder()
    builder.setTxBytes(ByteString.copyFrom(obj.txBytes))
    builder.setMode(ServiceOuterClass.BroadcastMode.forNumber(obj.mode.number))
    return builder.build()
  }
}

public object BroadcastTxResponseJvmConverter :
    ProtobufTypeMapper<BroadcastTxResponse, ServiceOuterClass.BroadcastTxResponse> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.BroadcastTxResponse.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.BroadcastTxResponse> =
      ServiceOuterClass.BroadcastTxResponse.parser()

  public override fun convert(obj: ServiceOuterClass.BroadcastTxResponse): BroadcastTxResponse =
      BroadcastTxResponse(
  	txResponse = TxResponseJvmConverter.convert(obj.getTxResponse()),
  )

  public override fun convert(obj: BroadcastTxResponse): ServiceOuterClass.BroadcastTxResponse {
    val builder = ServiceOuterClass.BroadcastTxResponse.newBuilder()
    builder.setTxResponse(TxResponseJvmConverter.convert(obj.txResponse))
    return builder.build()
  }
}

public object SimulateRequestJvmConverter :
    ProtobufTypeMapper<SimulateRequest, ServiceOuterClass.SimulateRequest> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.SimulateRequest.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.SimulateRequest> =
      ServiceOuterClass.SimulateRequest.parser()

  public override fun convert(obj: ServiceOuterClass.SimulateRequest): SimulateRequest =
      SimulateRequest(
  	tx = TxJvmConverter.convert(obj.getTx()),
  	txBytes = obj.getTxBytes().toByteArray(),
  )

  public override fun convert(obj: SimulateRequest): ServiceOuterClass.SimulateRequest {
    val builder = ServiceOuterClass.SimulateRequest.newBuilder()
    builder.setTx(TxJvmConverter.convert(obj.tx))
    builder.setTxBytes(ByteString.copyFrom(obj.txBytes))
    return builder.build()
  }
}

public object SimulateResponseJvmConverter :
    ProtobufTypeMapper<SimulateResponse, ServiceOuterClass.SimulateResponse> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.SimulateResponse.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.SimulateResponse> =
      ServiceOuterClass.SimulateResponse.parser()

  public override fun convert(obj: ServiceOuterClass.SimulateResponse): SimulateResponse =
      SimulateResponse(
  	gasInfo = GasInfoJvmConverter.convert(obj.getGasInfo()),
  	result = ResultJvmConverter.convert(obj.getResult()),
  )

  public override fun convert(obj: SimulateResponse): ServiceOuterClass.SimulateResponse {
    val builder = ServiceOuterClass.SimulateResponse.newBuilder()
    builder.setGasInfo(GasInfoJvmConverter.convert(obj.gasInfo))
    builder.setResult(ResultJvmConverter.convert(obj.result))
    return builder.build()
  }
}

public object GetTxRequestJvmConverter :
    ProtobufTypeMapper<GetTxRequest, ServiceOuterClass.GetTxRequest> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.GetTxRequest.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.GetTxRequest> =
      ServiceOuterClass.GetTxRequest.parser()

  public override fun convert(obj: ServiceOuterClass.GetTxRequest): GetTxRequest = GetTxRequest(
  	hash = obj.getHash(),
  )

  public override fun convert(obj: GetTxRequest): ServiceOuterClass.GetTxRequest {
    val builder = ServiceOuterClass.GetTxRequest.newBuilder()
    builder.setHash(obj.hash)
    return builder.build()
  }
}

public object GetTxResponseJvmConverter :
    ProtobufTypeMapper<GetTxResponse, ServiceOuterClass.GetTxResponse> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.GetTxResponse.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.GetTxResponse> =
      ServiceOuterClass.GetTxResponse.parser()

  public override fun convert(obj: ServiceOuterClass.GetTxResponse): GetTxResponse = GetTxResponse(
  	tx = TxJvmConverter.convert(obj.getTx()),
  	txResponse = TxResponseJvmConverter.convert(obj.getTxResponse()),
  )

  public override fun convert(obj: GetTxResponse): ServiceOuterClass.GetTxResponse {
    val builder = ServiceOuterClass.GetTxResponse.newBuilder()
    builder.setTx(TxJvmConverter.convert(obj.tx))
    builder.setTxResponse(TxResponseJvmConverter.convert(obj.txResponse))
    return builder.build()
  }
}

public object GetBlockWithTxsRequestJvmConverter :
    ProtobufTypeMapper<GetBlockWithTxsRequest, ServiceOuterClass.GetBlockWithTxsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.GetBlockWithTxsRequest.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.GetBlockWithTxsRequest> =
      ServiceOuterClass.GetBlockWithTxsRequest.parser()

  public override fun convert(obj: ServiceOuterClass.GetBlockWithTxsRequest): GetBlockWithTxsRequest
      = GetBlockWithTxsRequest(
  	height = obj.getHeight(),
  	pagination = PageRequestJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: GetBlockWithTxsRequest):
      ServiceOuterClass.GetBlockWithTxsRequest {
    val builder = ServiceOuterClass.GetBlockWithTxsRequest.newBuilder()
    builder.setHeight(obj.height)
    builder.setPagination(PageRequestJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object GetBlockWithTxsResponseJvmConverter :
    ProtobufTypeMapper<GetBlockWithTxsResponse, ServiceOuterClass.GetBlockWithTxsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.GetBlockWithTxsResponse.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.GetBlockWithTxsResponse> =
      ServiceOuterClass.GetBlockWithTxsResponse.parser()

  public override fun convert(obj: ServiceOuterClass.GetBlockWithTxsResponse):
      GetBlockWithTxsResponse = GetBlockWithTxsResponse(
  	txs = obj.getTxsList().map { TxJvmConverter.convert(it) },
  	blockId = BlockIDJvmConverter.convert(obj.getBlockId()),
  	block = BlockJvmConverter.convert(obj.getBlock()),
  	pagination = PageResponseJvmConverter.convert(obj.getPagination()),
  )

  public override fun convert(obj: GetBlockWithTxsResponse):
      ServiceOuterClass.GetBlockWithTxsResponse {
    val builder = ServiceOuterClass.GetBlockWithTxsResponse.newBuilder()
    builder.addAllTxs(obj.txs.map { TxJvmConverter.convert(it) })
    builder.setBlockId(BlockIDJvmConverter.convert(obj.blockId))
    builder.setBlock(BlockJvmConverter.convert(obj.block))
    builder.setPagination(PageResponseJvmConverter.convert(obj.pagination))
    return builder.build()
  }
}

public object TxDecodeRequestJvmConverter :
    ProtobufTypeMapper<TxDecodeRequest, ServiceOuterClass.TxDecodeRequest> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.TxDecodeRequest.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.TxDecodeRequest> =
      ServiceOuterClass.TxDecodeRequest.parser()

  public override fun convert(obj: ServiceOuterClass.TxDecodeRequest): TxDecodeRequest =
      TxDecodeRequest(
  	txBytes = obj.getTxBytes().toByteArray(),
  )

  public override fun convert(obj: TxDecodeRequest): ServiceOuterClass.TxDecodeRequest {
    val builder = ServiceOuterClass.TxDecodeRequest.newBuilder()
    builder.setTxBytes(ByteString.copyFrom(obj.txBytes))
    return builder.build()
  }
}

public object TxDecodeResponseJvmConverter :
    ProtobufTypeMapper<TxDecodeResponse, ServiceOuterClass.TxDecodeResponse> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.TxDecodeResponse.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.TxDecodeResponse> =
      ServiceOuterClass.TxDecodeResponse.parser()

  public override fun convert(obj: ServiceOuterClass.TxDecodeResponse): TxDecodeResponse =
      TxDecodeResponse(
  	tx = TxJvmConverter.convert(obj.getTx()),
  )

  public override fun convert(obj: TxDecodeResponse): ServiceOuterClass.TxDecodeResponse {
    val builder = ServiceOuterClass.TxDecodeResponse.newBuilder()
    builder.setTx(TxJvmConverter.convert(obj.tx))
    return builder.build()
  }
}

public object TxEncodeRequestJvmConverter :
    ProtobufTypeMapper<TxEncodeRequest, ServiceOuterClass.TxEncodeRequest> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.TxEncodeRequest.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.TxEncodeRequest> =
      ServiceOuterClass.TxEncodeRequest.parser()

  public override fun convert(obj: ServiceOuterClass.TxEncodeRequest): TxEncodeRequest =
      TxEncodeRequest(
  	tx = TxJvmConverter.convert(obj.getTx()),
  )

  public override fun convert(obj: TxEncodeRequest): ServiceOuterClass.TxEncodeRequest {
    val builder = ServiceOuterClass.TxEncodeRequest.newBuilder()
    builder.setTx(TxJvmConverter.convert(obj.tx))
    return builder.build()
  }
}

public object TxEncodeResponseJvmConverter :
    ProtobufTypeMapper<TxEncodeResponse, ServiceOuterClass.TxEncodeResponse> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.TxEncodeResponse.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.TxEncodeResponse> =
      ServiceOuterClass.TxEncodeResponse.parser()

  public override fun convert(obj: ServiceOuterClass.TxEncodeResponse): TxEncodeResponse =
      TxEncodeResponse(
  	txBytes = obj.getTxBytes().toByteArray(),
  )

  public override fun convert(obj: TxEncodeResponse): ServiceOuterClass.TxEncodeResponse {
    val builder = ServiceOuterClass.TxEncodeResponse.newBuilder()
    builder.setTxBytes(ByteString.copyFrom(obj.txBytes))
    return builder.build()
  }
}

public object TxEncodeAminoRequestJvmConverter :
    ProtobufTypeMapper<TxEncodeAminoRequest, ServiceOuterClass.TxEncodeAminoRequest> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.TxEncodeAminoRequest.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.TxEncodeAminoRequest> =
      ServiceOuterClass.TxEncodeAminoRequest.parser()

  public override fun convert(obj: ServiceOuterClass.TxEncodeAminoRequest): TxEncodeAminoRequest =
      TxEncodeAminoRequest(
  	aminoJson = obj.getAminoJson(),
  )

  public override fun convert(obj: TxEncodeAminoRequest): ServiceOuterClass.TxEncodeAminoRequest {
    val builder = ServiceOuterClass.TxEncodeAminoRequest.newBuilder()
    builder.setAminoJson(obj.aminoJson)
    return builder.build()
  }
}

public object TxEncodeAminoResponseJvmConverter :
    ProtobufTypeMapper<TxEncodeAminoResponse, ServiceOuterClass.TxEncodeAminoResponse> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.TxEncodeAminoResponse.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.TxEncodeAminoResponse> =
      ServiceOuterClass.TxEncodeAminoResponse.parser()

  public override fun convert(obj: ServiceOuterClass.TxEncodeAminoResponse): TxEncodeAminoResponse =
      TxEncodeAminoResponse(
  	aminoBinary = obj.getAminoBinary().toByteArray(),
  )

  public override fun convert(obj: TxEncodeAminoResponse): ServiceOuterClass.TxEncodeAminoResponse {
    val builder = ServiceOuterClass.TxEncodeAminoResponse.newBuilder()
    builder.setAminoBinary(ByteString.copyFrom(obj.aminoBinary))
    return builder.build()
  }
}

public object TxDecodeAminoRequestJvmConverter :
    ProtobufTypeMapper<TxDecodeAminoRequest, ServiceOuterClass.TxDecodeAminoRequest> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.TxDecodeAminoRequest.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.TxDecodeAminoRequest> =
      ServiceOuterClass.TxDecodeAminoRequest.parser()

  public override fun convert(obj: ServiceOuterClass.TxDecodeAminoRequest): TxDecodeAminoRequest =
      TxDecodeAminoRequest(
  	aminoBinary = obj.getAminoBinary().toByteArray(),
  )

  public override fun convert(obj: TxDecodeAminoRequest): ServiceOuterClass.TxDecodeAminoRequest {
    val builder = ServiceOuterClass.TxDecodeAminoRequest.newBuilder()
    builder.setAminoBinary(ByteString.copyFrom(obj.aminoBinary))
    return builder.build()
  }
}

public object TxDecodeAminoResponseJvmConverter :
    ProtobufTypeMapper<TxDecodeAminoResponse, ServiceOuterClass.TxDecodeAminoResponse> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.TxDecodeAminoResponse.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.TxDecodeAminoResponse> =
      ServiceOuterClass.TxDecodeAminoResponse.parser()

  public override fun convert(obj: ServiceOuterClass.TxDecodeAminoResponse): TxDecodeAminoResponse =
      TxDecodeAminoResponse(
  	aminoJson = obj.getAminoJson(),
  )

  public override fun convert(obj: TxDecodeAminoResponse): ServiceOuterClass.TxDecodeAminoResponse {
    val builder = ServiceOuterClass.TxDecodeAminoResponse.newBuilder()
    builder.setAminoJson(obj.aminoJson)
    return builder.build()
  }
}

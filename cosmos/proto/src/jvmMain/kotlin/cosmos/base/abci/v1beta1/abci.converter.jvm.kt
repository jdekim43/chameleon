// Transform from cosmos/base/abci/v1beta1/abci.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.abci.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType
import tendermint.abci.EventJvmConverter

public object TxResponseJvmConverter : ProtobufTypeMapper<TxResponse, Abci.TxResponse> {
  public override val descriptor: Descriptors.Descriptor = Abci.TxResponse.getDescriptor()

  public override val parser: Parser<Abci.TxResponse> = Abci.TxResponse.parser()

  public override fun convert(obj: Abci.TxResponse): TxResponse = TxResponse(
  	height = obj.getHeight(),
  	txhash = obj.getTxhash(),
  	codespace = obj.getCodespace(),
  	code = obj.getCode().asKotlinType,
  	`data` = obj.getData(),
  	rawLog = obj.getRawLog(),
  	logs = obj.getLogsList().map { ABCIMessageLogJvmConverter.convert(it) },
  	info = obj.getInfo(),
  	gasWanted = obj.getGasWanted(),
  	gasUsed = obj.getGasUsed(),
  	tx = AnyJvmConverter.convert(obj.getTx()),
  	timestamp = obj.getTimestamp(),
  	events = obj.getEventsList().map { EventJvmConverter.convert(it) },
  )

  public override fun convert(obj: TxResponse): Abci.TxResponse {
    val builder = Abci.TxResponse.newBuilder()
    builder.setHeight(obj.height)
    builder.setTxhash(obj.txhash)
    builder.setCodespace(obj.codespace)
    builder.setCode(obj.code.asJavaType)
    builder.setData(obj.`data`)
    builder.setRawLog(obj.rawLog)
    builder.addAllLogs(obj.logs.map { ABCIMessageLogJvmConverter.convert(it) })
    builder.setInfo(obj.info)
    builder.setGasWanted(obj.gasWanted)
    builder.setGasUsed(obj.gasUsed)
    builder.setTx(AnyJvmConverter.convert(obj.tx))
    builder.setTimestamp(obj.timestamp)
    builder.addAllEvents(obj.events.map { EventJvmConverter.convert(it) })
    return builder.build()
  }
}

public object ABCIMessageLogJvmConverter : ProtobufTypeMapper<ABCIMessageLog, Abci.ABCIMessageLog> {
  public override val descriptor: Descriptors.Descriptor = Abci.ABCIMessageLog.getDescriptor()

  public override val parser: Parser<Abci.ABCIMessageLog> = Abci.ABCIMessageLog.parser()

  public override fun convert(obj: Abci.ABCIMessageLog): ABCIMessageLog = ABCIMessageLog(
  	msgIndex = obj.getMsgIndex().asKotlinType,
  	log = obj.getLog(),
  	events = obj.getEventsList().map { StringEventJvmConverter.convert(it) },
  )

  public override fun convert(obj: ABCIMessageLog): Abci.ABCIMessageLog {
    val builder = Abci.ABCIMessageLog.newBuilder()
    builder.setMsgIndex(obj.msgIndex.asJavaType)
    builder.setLog(obj.log)
    builder.addAllEvents(obj.events.map { StringEventJvmConverter.convert(it) })
    return builder.build()
  }
}

public object StringEventJvmConverter : ProtobufTypeMapper<StringEvent, Abci.StringEvent> {
  public override val descriptor: Descriptors.Descriptor = Abci.StringEvent.getDescriptor()

  public override val parser: Parser<Abci.StringEvent> = Abci.StringEvent.parser()

  public override fun convert(obj: Abci.StringEvent): StringEvent = StringEvent(
  	type = obj.getType(),
  	attributes = obj.getAttributesList().map { AttributeJvmConverter.convert(it) },
  )

  public override fun convert(obj: StringEvent): Abci.StringEvent {
    val builder = Abci.StringEvent.newBuilder()
    builder.setType(obj.type)
    builder.addAllAttributes(obj.attributes.map { AttributeJvmConverter.convert(it) })
    return builder.build()
  }
}

public object AttributeJvmConverter : ProtobufTypeMapper<Attribute, Abci.Attribute> {
  public override val descriptor: Descriptors.Descriptor = Abci.Attribute.getDescriptor()

  public override val parser: Parser<Abci.Attribute> = Abci.Attribute.parser()

  public override fun convert(obj: Abci.Attribute): Attribute = Attribute(
  	key = obj.getKey(),
  	`value` = obj.getValue(),
  )

  public override fun convert(obj: Attribute): Abci.Attribute {
    val builder = Abci.Attribute.newBuilder()
    builder.setKey(obj.key)
    builder.setValue(obj.`value`)
    return builder.build()
  }
}

public object GasInfoJvmConverter : ProtobufTypeMapper<GasInfo, Abci.GasInfo> {
  public override val descriptor: Descriptors.Descriptor = Abci.GasInfo.getDescriptor()

  public override val parser: Parser<Abci.GasInfo> = Abci.GasInfo.parser()

  public override fun convert(obj: Abci.GasInfo): GasInfo = GasInfo(
  	gasWanted = obj.getGasWanted().asKotlinType,
  	gasUsed = obj.getGasUsed().asKotlinType,
  )

  public override fun convert(obj: GasInfo): Abci.GasInfo {
    val builder = Abci.GasInfo.newBuilder()
    builder.setGasWanted(obj.gasWanted.asJavaType)
    builder.setGasUsed(obj.gasUsed.asJavaType)
    return builder.build()
  }
}

public object ResultJvmConverter : ProtobufTypeMapper<Result, Abci.Result> {
  public override val descriptor: Descriptors.Descriptor = Abci.Result.getDescriptor()

  public override val parser: Parser<Abci.Result> = Abci.Result.parser()

  public override fun convert(obj: Abci.Result): Result = Result(
  	`data` = obj.getData().toByteArray(),
  	log = obj.getLog(),
  	events = obj.getEventsList().map { EventJvmConverter.convert(it) },
  	msgResponses = obj.getMsgResponsesList().map { AnyJvmConverter.convert(it) },
  )

  public override fun convert(obj: Result): Abci.Result {
    val builder = Abci.Result.newBuilder()
    builder.setData(ByteString.copyFrom(obj.`data`))
    builder.setLog(obj.log)
    builder.addAllEvents(obj.events.map { EventJvmConverter.convert(it) })
    builder.addAllMsgResponses(obj.msgResponses.map { AnyJvmConverter.convert(it) })
    return builder.build()
  }
}

public object SimulationResponseJvmConverter :
    ProtobufTypeMapper<SimulationResponse, Abci.SimulationResponse> {
  public override val descriptor: Descriptors.Descriptor = Abci.SimulationResponse.getDescriptor()

  public override val parser: Parser<Abci.SimulationResponse> = Abci.SimulationResponse.parser()

  public override fun convert(obj: Abci.SimulationResponse): SimulationResponse =
      SimulationResponse(
  	gasInfo = GasInfoJvmConverter.convert(obj.getGasInfo()),
  	result = ResultJvmConverter.convert(obj.getResult()),
  )

  public override fun convert(obj: SimulationResponse): Abci.SimulationResponse {
    val builder = Abci.SimulationResponse.newBuilder()
    builder.setGasInfo(GasInfoJvmConverter.convert(obj.gasInfo))
    builder.setResult(ResultJvmConverter.convert(obj.result))
    return builder.build()
  }
}

public object MsgDataJvmConverter : ProtobufTypeMapper<MsgData, Abci.MsgData> {
  public override val descriptor: Descriptors.Descriptor = Abci.MsgData.getDescriptor()

  public override val parser: Parser<Abci.MsgData> = Abci.MsgData.parser()

  public override fun convert(obj: Abci.MsgData): MsgData = MsgData(
  	msgType = obj.getMsgType(),
  	`data` = obj.getData().toByteArray(),
  )

  public override fun convert(obj: MsgData): Abci.MsgData {
    val builder = Abci.MsgData.newBuilder()
    builder.setMsgType(obj.msgType)
    builder.setData(ByteString.copyFrom(obj.`data`))
    return builder.build()
  }
}

public object TxMsgDataJvmConverter : ProtobufTypeMapper<TxMsgData, Abci.TxMsgData> {
  public override val descriptor: Descriptors.Descriptor = Abci.TxMsgData.getDescriptor()

  public override val parser: Parser<Abci.TxMsgData> = Abci.TxMsgData.parser()

  public override fun convert(obj: Abci.TxMsgData): TxMsgData = TxMsgData(
  	`data` = obj.getDataList().map { MsgDataJvmConverter.convert(it) },
  	msgResponses = obj.getMsgResponsesList().map { AnyJvmConverter.convert(it) },
  )

  public override fun convert(obj: TxMsgData): Abci.TxMsgData {
    val builder = Abci.TxMsgData.newBuilder()
    builder.addAllData(obj.`data`.map { MsgDataJvmConverter.convert(it) })
    builder.addAllMsgResponses(obj.msgResponses.map { AnyJvmConverter.convert(it) })
    return builder.build()
  }
}

public object SearchTxsResultJvmConverter :
    ProtobufTypeMapper<SearchTxsResult, Abci.SearchTxsResult> {
  public override val descriptor: Descriptors.Descriptor = Abci.SearchTxsResult.getDescriptor()

  public override val parser: Parser<Abci.SearchTxsResult> = Abci.SearchTxsResult.parser()

  public override fun convert(obj: Abci.SearchTxsResult): SearchTxsResult = SearchTxsResult(
  	totalCount = obj.getTotalCount().asKotlinType,
  	count = obj.getCount().asKotlinType,
  	pageNumber = obj.getPageNumber().asKotlinType,
  	pageTotal = obj.getPageTotal().asKotlinType,
  	limit = obj.getLimit().asKotlinType,
  	txs = obj.getTxsList().map { TxResponseJvmConverter.convert(it) },
  )

  public override fun convert(obj: SearchTxsResult): Abci.SearchTxsResult {
    val builder = Abci.SearchTxsResult.newBuilder()
    builder.setTotalCount(obj.totalCount.asJavaType)
    builder.setCount(obj.count.asJavaType)
    builder.setPageNumber(obj.pageNumber.asJavaType)
    builder.setPageTotal(obj.pageTotal.asJavaType)
    builder.setLimit(obj.limit.asJavaType)
    builder.addAllTxs(obj.txs.map { TxResponseJvmConverter.convert(it) })
    return builder.build()
  }
}

// Transform from cosmos/base/abci/v1beta1/abci.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.abci.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object TxResponseConverter : ProtobufConverter<TxResponse>

public fun TxResponse.toAny(): Any = Any(TxResponse.TYPE_URL, with(TxResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TxResponse>): TxResponse {
  if (typeUrl != TxResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ABCIMessageLogConverter : ProtobufConverter<ABCIMessageLog>

public fun ABCIMessageLog.toAny(): Any = Any(ABCIMessageLog.TYPE_URL, with(ABCIMessageLogConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ABCIMessageLog>): ABCIMessageLog {
  if (typeUrl != ABCIMessageLog.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object StringEventConverter : ProtobufConverter<StringEvent>

public fun StringEvent.toAny(): Any = Any(StringEvent.TYPE_URL, with(StringEventConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<StringEvent>): StringEvent {
  if (typeUrl != StringEvent.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AttributeConverter : ProtobufConverter<Attribute>

public fun Attribute.toAny(): Any = Any(Attribute.TYPE_URL, with(AttributeConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<Attribute>): Attribute {
  if (typeUrl != Attribute.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GasInfoConverter : ProtobufConverter<GasInfo>

public fun GasInfo.toAny(): Any = Any(GasInfo.TYPE_URL, with(GasInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GasInfo>): GasInfo {
  if (typeUrl != GasInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ResultConverter : ProtobufConverter<Result>

public fun Result.toAny(): Any = Any(Result.TYPE_URL, with(ResultConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Result>): Result {
  if (typeUrl != Result.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SimulationResponseConverter : ProtobufConverter<SimulationResponse>

public fun SimulationResponse.toAny(): Any = Any(SimulationResponse.TYPE_URL,
    with(SimulationResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SimulationResponse>): SimulationResponse {
  if (typeUrl != SimulationResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgDataConverter : ProtobufConverter<MsgData>

public fun MsgData.toAny(): Any = Any(MsgData.TYPE_URL, with(MsgDataConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgData>): MsgData {
  if (typeUrl != MsgData.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TxMsgDataConverter : ProtobufConverter<TxMsgData>

public fun TxMsgData.toAny(): Any = Any(TxMsgData.TYPE_URL, with(TxMsgDataConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<TxMsgData>): TxMsgData {
  if (typeUrl != TxMsgData.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SearchTxsResultConverter : ProtobufConverter<SearchTxsResult>

public fun SearchTxsResult.toAny(): Any = Any(SearchTxsResult.TYPE_URL,
    with(SearchTxsResultConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SearchTxsResult>): SearchTxsResult {
  if (typeUrl != SearchTxsResult.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

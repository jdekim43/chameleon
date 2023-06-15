// Transform from cosmos/tx/v1beta1/service.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.tx.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object GetTxsEventRequestConverter : ProtobufConverter<GetTxsEventRequest>

public fun GetTxsEventRequest.toAny(): Any = Any(GetTxsEventRequest.TYPE_URL,
    with(GetTxsEventRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetTxsEventRequest>): GetTxsEventRequest {
  if (typeUrl != GetTxsEventRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetTxsEventResponseConverter : ProtobufConverter<GetTxsEventResponse>

public fun GetTxsEventResponse.toAny(): Any = Any(GetTxsEventResponse.TYPE_URL,
    with(GetTxsEventResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetTxsEventResponse>): GetTxsEventResponse {
  if (typeUrl != GetTxsEventResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BroadcastTxRequestConverter : ProtobufConverter<BroadcastTxRequest>

public fun BroadcastTxRequest.toAny(): Any = Any(BroadcastTxRequest.TYPE_URL,
    with(BroadcastTxRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BroadcastTxRequest>): BroadcastTxRequest {
  if (typeUrl != BroadcastTxRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BroadcastTxResponseConverter : ProtobufConverter<BroadcastTxResponse>

public fun BroadcastTxResponse.toAny(): Any = Any(BroadcastTxResponse.TYPE_URL,
    with(BroadcastTxResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BroadcastTxResponse>): BroadcastTxResponse {
  if (typeUrl != BroadcastTxResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SimulateRequestConverter : ProtobufConverter<SimulateRequest>

public fun SimulateRequest.toAny(): Any = Any(SimulateRequest.TYPE_URL,
    with(SimulateRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SimulateRequest>): SimulateRequest {
  if (typeUrl != SimulateRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SimulateResponseConverter : ProtobufConverter<SimulateResponse>

public fun SimulateResponse.toAny(): Any = Any(SimulateResponse.TYPE_URL,
    with(SimulateResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SimulateResponse>): SimulateResponse {
  if (typeUrl != SimulateResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetTxRequestConverter : ProtobufConverter<GetTxRequest>

public fun GetTxRequest.toAny(): Any = Any(GetTxRequest.TYPE_URL, with(GetTxRequestConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetTxRequest>): GetTxRequest {
  if (typeUrl != GetTxRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetTxResponseConverter : ProtobufConverter<GetTxResponse>

public fun GetTxResponse.toAny(): Any = Any(GetTxResponse.TYPE_URL, with(GetTxResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetTxResponse>): GetTxResponse {
  if (typeUrl != GetTxResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetBlockWithTxsRequestConverter : ProtobufConverter<GetBlockWithTxsRequest>

public fun GetBlockWithTxsRequest.toAny(): Any = Any(GetBlockWithTxsRequest.TYPE_URL,
    with(GetBlockWithTxsRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetBlockWithTxsRequest>): GetBlockWithTxsRequest {
  if (typeUrl != GetBlockWithTxsRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GetBlockWithTxsResponseConverter : ProtobufConverter<GetBlockWithTxsResponse>

public fun GetBlockWithTxsResponse.toAny(): Any = Any(GetBlockWithTxsResponse.TYPE_URL,
    with(GetBlockWithTxsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GetBlockWithTxsResponse>):
    GetBlockWithTxsResponse {
  if (typeUrl != GetBlockWithTxsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TxDecodeRequestConverter : ProtobufConverter<TxDecodeRequest>

public fun TxDecodeRequest.toAny(): Any = Any(TxDecodeRequest.TYPE_URL,
    with(TxDecodeRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TxDecodeRequest>): TxDecodeRequest {
  if (typeUrl != TxDecodeRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TxDecodeResponseConverter : ProtobufConverter<TxDecodeResponse>

public fun TxDecodeResponse.toAny(): Any = Any(TxDecodeResponse.TYPE_URL,
    with(TxDecodeResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TxDecodeResponse>): TxDecodeResponse {
  if (typeUrl != TxDecodeResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TxEncodeRequestConverter : ProtobufConverter<TxEncodeRequest>

public fun TxEncodeRequest.toAny(): Any = Any(TxEncodeRequest.TYPE_URL,
    with(TxEncodeRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TxEncodeRequest>): TxEncodeRequest {
  if (typeUrl != TxEncodeRequest.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TxEncodeResponseConverter : ProtobufConverter<TxEncodeResponse>

public fun TxEncodeResponse.toAny(): Any = Any(TxEncodeResponse.TYPE_URL,
    with(TxEncodeResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TxEncodeResponse>): TxEncodeResponse {
  if (typeUrl != TxEncodeResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TxEncodeAminoRequestConverter : ProtobufConverter<TxEncodeAminoRequest>

public fun TxEncodeAminoRequest.toAny(): Any = Any(TxEncodeAminoRequest.TYPE_URL,
    with(TxEncodeAminoRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TxEncodeAminoRequest>): TxEncodeAminoRequest {
  if (typeUrl != TxEncodeAminoRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TxEncodeAminoResponseConverter : ProtobufConverter<TxEncodeAminoResponse>

public fun TxEncodeAminoResponse.toAny(): Any = Any(TxEncodeAminoResponse.TYPE_URL,
    with(TxEncodeAminoResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TxEncodeAminoResponse>): TxEncodeAminoResponse {
  if (typeUrl != TxEncodeAminoResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TxDecodeAminoRequestConverter : ProtobufConverter<TxDecodeAminoRequest>

public fun TxDecodeAminoRequest.toAny(): Any = Any(TxDecodeAminoRequest.TYPE_URL,
    with(TxDecodeAminoRequestConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TxDecodeAminoRequest>): TxDecodeAminoRequest {
  if (typeUrl != TxDecodeAminoRequest.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TxDecodeAminoResponseConverter : ProtobufConverter<TxDecodeAminoResponse>

public fun TxDecodeAminoResponse.toAny(): Any = Any(TxDecodeAminoResponse.TYPE_URL,
    with(TxDecodeAminoResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TxDecodeAminoResponse>): TxDecodeAminoResponse {
  if (typeUrl != TxDecodeAminoResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

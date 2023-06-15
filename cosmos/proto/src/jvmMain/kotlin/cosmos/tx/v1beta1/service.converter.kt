// Transform from cosmos/tx/v1beta1/service.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.tx.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object GetTxsEventRequestConverter : ProtobufConverter<GetTxsEventRequest> by
    GetTxsEventRequestJvmConverter

public actual object GetTxsEventResponseConverter : ProtobufConverter<GetTxsEventResponse> by
    GetTxsEventResponseJvmConverter

public actual object BroadcastTxRequestConverter : ProtobufConverter<BroadcastTxRequest> by
    BroadcastTxRequestJvmConverter

public actual object BroadcastTxResponseConverter : ProtobufConverter<BroadcastTxResponse> by
    BroadcastTxResponseJvmConverter

public actual object SimulateRequestConverter : ProtobufConverter<SimulateRequest> by
    SimulateRequestJvmConverter

public actual object SimulateResponseConverter : ProtobufConverter<SimulateResponse> by
    SimulateResponseJvmConverter

public actual object GetTxRequestConverter : ProtobufConverter<GetTxRequest> by
    GetTxRequestJvmConverter

public actual object GetTxResponseConverter : ProtobufConverter<GetTxResponse> by
    GetTxResponseJvmConverter

public actual object GetBlockWithTxsRequestConverter : ProtobufConverter<GetBlockWithTxsRequest> by
    GetBlockWithTxsRequestJvmConverter

public actual object GetBlockWithTxsResponseConverter : ProtobufConverter<GetBlockWithTxsResponse>
    by GetBlockWithTxsResponseJvmConverter

public actual object TxDecodeRequestConverter : ProtobufConverter<TxDecodeRequest> by
    TxDecodeRequestJvmConverter

public actual object TxDecodeResponseConverter : ProtobufConverter<TxDecodeResponse> by
    TxDecodeResponseJvmConverter

public actual object TxEncodeRequestConverter : ProtobufConverter<TxEncodeRequest> by
    TxEncodeRequestJvmConverter

public actual object TxEncodeResponseConverter : ProtobufConverter<TxEncodeResponse> by
    TxEncodeResponseJvmConverter

public actual object TxEncodeAminoRequestConverter : ProtobufConverter<TxEncodeAminoRequest> by
    TxEncodeAminoRequestJvmConverter

public actual object TxEncodeAminoResponseConverter : ProtobufConverter<TxEncodeAminoResponse> by
    TxEncodeAminoResponseJvmConverter

public actual object TxDecodeAminoRequestConverter : ProtobufConverter<TxDecodeAminoRequest> by
    TxDecodeAminoRequestJvmConverter

public actual object TxDecodeAminoResponseConverter : ProtobufConverter<TxDecodeAminoResponse> by
    TxDecodeAminoResponseJvmConverter

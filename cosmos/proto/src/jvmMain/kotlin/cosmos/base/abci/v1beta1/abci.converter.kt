// Transform from cosmos/base/abci/v1beta1/abci.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.abci.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object TxResponseConverter : ProtobufConverter<TxResponse> by TxResponseJvmConverter

public actual object ABCIMessageLogConverter : ProtobufConverter<ABCIMessageLog> by
    ABCIMessageLogJvmConverter

public actual object StringEventConverter : ProtobufConverter<StringEvent> by
    StringEventJvmConverter

public actual object AttributeConverter : ProtobufConverter<Attribute> by AttributeJvmConverter

public actual object GasInfoConverter : ProtobufConverter<GasInfo> by GasInfoJvmConverter

public actual object ResultConverter : ProtobufConverter<Result> by ResultJvmConverter

public actual object SimulationResponseConverter : ProtobufConverter<SimulationResponse> by
    SimulationResponseJvmConverter

public actual object MsgDataConverter : ProtobufConverter<MsgData> by MsgDataJvmConverter

public actual object TxMsgDataConverter : ProtobufConverter<TxMsgData> by TxMsgDataJvmConverter

public actual object SearchTxsResultConverter : ProtobufConverter<SearchTxsResult> by
    SearchTxsResultJvmConverter

// Transform from dex/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgPlaceOrdersConverter : ProtobufConverter<MsgPlaceOrders> by
    MsgPlaceOrdersJvmConverter

public actual object MsgPlaceOrdersResponseConverter : ProtobufConverter<MsgPlaceOrdersResponse> by
    MsgPlaceOrdersResponseJvmConverter

public actual object MsgCancelOrdersConverter : ProtobufConverter<MsgCancelOrders> by
    MsgCancelOrdersJvmConverter

public actual object MsgCancelOrdersResponseConverter : ProtobufConverter<MsgCancelOrdersResponse>
    by MsgCancelOrdersResponseJvmConverter

public actual object MsgRegisterContractConverter : ProtobufConverter<MsgRegisterContract> by
    MsgRegisterContractJvmConverter

public actual object MsgRegisterContractResponseConverter :
    ProtobufConverter<MsgRegisterContractResponse> by MsgRegisterContractResponseJvmConverter

public actual object MsgContractDepositRentConverter : ProtobufConverter<MsgContractDepositRent> by
    MsgContractDepositRentJvmConverter

public actual object MsgContractDepositRentResponseConverter :
    ProtobufConverter<MsgContractDepositRentResponse> by MsgContractDepositRentResponseJvmConverter

public actual object MsgUnregisterContractConverter : ProtobufConverter<MsgUnregisterContract> by
    MsgUnregisterContractJvmConverter

public actual object MsgUnregisterContractResponseConverter :
    ProtobufConverter<MsgUnregisterContractResponse> by MsgUnregisterContractResponseJvmConverter

public actual object MsgRegisterPairsConverter : ProtobufConverter<MsgRegisterPairs> by
    MsgRegisterPairsJvmConverter

public actual object MsgRegisterPairsResponseConverter : ProtobufConverter<MsgRegisterPairsResponse>
    by MsgRegisterPairsResponseJvmConverter

public actual object MsgUpdatePriceTickSizeConverter : ProtobufConverter<MsgUpdatePriceTickSize> by
    MsgUpdatePriceTickSizeJvmConverter

public actual object MsgUpdateQuantityTickSizeConverter :
    ProtobufConverter<MsgUpdateQuantityTickSize> by MsgUpdateQuantityTickSizeJvmConverter

public actual object MsgUpdateTickSizeResponseConverter :
    ProtobufConverter<MsgUpdateTickSizeResponse> by MsgUpdateTickSizeResponseJvmConverter

public actual object MsgUnsuspendContractConverter : ProtobufConverter<MsgUnsuspendContract> by
    MsgUnsuspendContractJvmConverter

public actual object MsgUnsuspendContractResponseConverter :
    ProtobufConverter<MsgUnsuspendContractResponse> by MsgUnsuspendContractResponseJvmConverter

// Transform from dex/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgPlaceOrdersConverter : ProtobufConverter<MsgPlaceOrders>

public fun MsgPlaceOrders.toAny(): Any = Any(MsgPlaceOrders.TYPE_URL, with(MsgPlaceOrdersConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgPlaceOrders>): MsgPlaceOrders {
  if (typeUrl != MsgPlaceOrders.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgPlaceOrdersResponseConverter : ProtobufConverter<MsgPlaceOrdersResponse>

public fun MsgPlaceOrdersResponse.toAny(): Any = Any(MsgPlaceOrdersResponse.TYPE_URL,
    with(MsgPlaceOrdersResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgPlaceOrdersResponse>): MsgPlaceOrdersResponse {
  if (typeUrl != MsgPlaceOrdersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCancelOrdersConverter : ProtobufConverter<MsgCancelOrders>

public fun MsgCancelOrders.toAny(): Any = Any(MsgCancelOrders.TYPE_URL,
    with(MsgCancelOrdersConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCancelOrders>): MsgCancelOrders {
  if (typeUrl != MsgCancelOrders.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCancelOrdersResponseConverter : ProtobufConverter<MsgCancelOrdersResponse>

public fun MsgCancelOrdersResponse.toAny(): Any = Any(MsgCancelOrdersResponse.TYPE_URL,
    with(MsgCancelOrdersResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCancelOrdersResponse>):
    MsgCancelOrdersResponse {
  if (typeUrl != MsgCancelOrdersResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRegisterContractConverter : ProtobufConverter<MsgRegisterContract>

public fun MsgRegisterContract.toAny(): Any = Any(MsgRegisterContract.TYPE_URL,
    with(MsgRegisterContractConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRegisterContract>): MsgRegisterContract {
  if (typeUrl != MsgRegisterContract.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRegisterContractResponseConverter :
    ProtobufConverter<MsgRegisterContractResponse>

public fun MsgRegisterContractResponse.toAny(): Any = Any(MsgRegisterContractResponse.TYPE_URL,
    with(MsgRegisterContractResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRegisterContractResponse>):
    MsgRegisterContractResponse {
  if (typeUrl != MsgRegisterContractResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgContractDepositRentConverter : ProtobufConverter<MsgContractDepositRent>

public fun MsgContractDepositRent.toAny(): Any = Any(MsgContractDepositRent.TYPE_URL,
    with(MsgContractDepositRentConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgContractDepositRent>): MsgContractDepositRent {
  if (typeUrl != MsgContractDepositRent.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgContractDepositRentResponseConverter :
    ProtobufConverter<MsgContractDepositRentResponse>

public fun MsgContractDepositRentResponse.toAny(): Any =
    Any(MsgContractDepositRentResponse.TYPE_URL, with(MsgContractDepositRentResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgContractDepositRentResponse>):
    MsgContractDepositRentResponse {
  if (typeUrl != MsgContractDepositRentResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUnregisterContractConverter : ProtobufConverter<MsgUnregisterContract>

public fun MsgUnregisterContract.toAny(): Any = Any(MsgUnregisterContract.TYPE_URL,
    with(MsgUnregisterContractConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUnregisterContract>): MsgUnregisterContract {
  if (typeUrl != MsgUnregisterContract.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUnregisterContractResponseConverter :
    ProtobufConverter<MsgUnregisterContractResponse>

public fun MsgUnregisterContractResponse.toAny(): Any = Any(MsgUnregisterContractResponse.TYPE_URL,
    with(MsgUnregisterContractResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUnregisterContractResponse>):
    MsgUnregisterContractResponse {
  if (typeUrl != MsgUnregisterContractResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRegisterPairsConverter : ProtobufConverter<MsgRegisterPairs>

public fun MsgRegisterPairs.toAny(): Any = Any(MsgRegisterPairs.TYPE_URL,
    with(MsgRegisterPairsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRegisterPairs>): MsgRegisterPairs {
  if (typeUrl != MsgRegisterPairs.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRegisterPairsResponseConverter : ProtobufConverter<MsgRegisterPairsResponse>

public fun MsgRegisterPairsResponse.toAny(): Any = Any(MsgRegisterPairsResponse.TYPE_URL,
    with(MsgRegisterPairsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRegisterPairsResponse>):
    MsgRegisterPairsResponse {
  if (typeUrl != MsgRegisterPairsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdatePriceTickSizeConverter : ProtobufConverter<MsgUpdatePriceTickSize>

public fun MsgUpdatePriceTickSize.toAny(): Any = Any(MsgUpdatePriceTickSize.TYPE_URL,
    with(MsgUpdatePriceTickSizeConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdatePriceTickSize>): MsgUpdatePriceTickSize {
  if (typeUrl != MsgUpdatePriceTickSize.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateQuantityTickSizeConverter :
    ProtobufConverter<MsgUpdateQuantityTickSize>

public fun MsgUpdateQuantityTickSize.toAny(): Any = Any(MsgUpdateQuantityTickSize.TYPE_URL,
    with(MsgUpdateQuantityTickSizeConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateQuantityTickSize>):
    MsgUpdateQuantityTickSize {
  if (typeUrl != MsgUpdateQuantityTickSize.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateTickSizeResponseConverter :
    ProtobufConverter<MsgUpdateTickSizeResponse>

public fun MsgUpdateTickSizeResponse.toAny(): Any = Any(MsgUpdateTickSizeResponse.TYPE_URL,
    with(MsgUpdateTickSizeResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateTickSizeResponse>):
    MsgUpdateTickSizeResponse {
  if (typeUrl != MsgUpdateTickSizeResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUnsuspendContractConverter : ProtobufConverter<MsgUnsuspendContract>

public fun MsgUnsuspendContract.toAny(): Any = Any(MsgUnsuspendContract.TYPE_URL,
    with(MsgUnsuspendContractConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUnsuspendContract>): MsgUnsuspendContract {
  if (typeUrl != MsgUnsuspendContract.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUnsuspendContractResponseConverter :
    ProtobufConverter<MsgUnsuspendContractResponse>

public fun MsgUnsuspendContractResponse.toAny(): Any = Any(MsgUnsuspendContractResponse.TYPE_URL,
    with(MsgUnsuspendContractResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUnsuspendContractResponse>):
    MsgUnsuspendContractResponse {
  if (typeUrl != MsgUnsuspendContractResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

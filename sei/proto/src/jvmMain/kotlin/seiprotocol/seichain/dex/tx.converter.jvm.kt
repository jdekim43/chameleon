// Transform from dex/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object MsgPlaceOrdersJvmConverter : ProtobufTypeMapper<MsgPlaceOrders, Tx.MsgPlaceOrders> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgPlaceOrders.getDescriptor()

  public override val parser: Parser<Tx.MsgPlaceOrders> = Tx.MsgPlaceOrders.parser()

  public override fun convert(obj: Tx.MsgPlaceOrders): MsgPlaceOrders = MsgPlaceOrders(
  	creator = obj.getCreator(),
  	orders = obj.getOrdersList().map { OrderJvmConverter.convert(it) },
  	contractAddr = obj.getContractAddr(),
  	funds = obj.getFundsList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgPlaceOrders): Tx.MsgPlaceOrders {
    val builder = Tx.MsgPlaceOrders.newBuilder()
    builder.setCreator(obj.creator)
    builder.addAllOrders(obj.orders.map { OrderJvmConverter.convert(it) })
    builder.setContractAddr(obj.contractAddr)
    builder.addAllFunds(obj.funds.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgPlaceOrdersResponseJvmConverter :
    ProtobufTypeMapper<MsgPlaceOrdersResponse, Tx.MsgPlaceOrdersResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgPlaceOrdersResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgPlaceOrdersResponse> = Tx.MsgPlaceOrdersResponse.parser()

  public override fun convert(obj: Tx.MsgPlaceOrdersResponse): MsgPlaceOrdersResponse =
      MsgPlaceOrdersResponse(
  	orderIds = obj.getOrderIdsList().map { it.asKotlinType },
  )

  public override fun convert(obj: MsgPlaceOrdersResponse): Tx.MsgPlaceOrdersResponse {
    val builder = Tx.MsgPlaceOrdersResponse.newBuilder()
    builder.addAllOrderIds(obj.orderIds.map { it.asJavaType })
    return builder.build()
  }
}

public object MsgCancelOrdersJvmConverter : ProtobufTypeMapper<MsgCancelOrders, Tx.MsgCancelOrders>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgCancelOrders.getDescriptor()

  public override val parser: Parser<Tx.MsgCancelOrders> = Tx.MsgCancelOrders.parser()

  public override fun convert(obj: Tx.MsgCancelOrders): MsgCancelOrders = MsgCancelOrders(
  	creator = obj.getCreator(),
  	cancellations = obj.getCancellationsList().map { CancellationJvmConverter.convert(it) },
  	contractAddr = obj.getContractAddr(),
  )

  public override fun convert(obj: MsgCancelOrders): Tx.MsgCancelOrders {
    val builder = Tx.MsgCancelOrders.newBuilder()
    builder.setCreator(obj.creator)
    builder.addAllCancellations(obj.cancellations.map { CancellationJvmConverter.convert(it) })
    builder.setContractAddr(obj.contractAddr)
    return builder.build()
  }
}

public object MsgCancelOrdersResponseJvmConverter :
    ProtobufTypeMapper<MsgCancelOrdersResponse, Tx.MsgCancelOrdersResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCancelOrdersResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCancelOrdersResponse> =
      Tx.MsgCancelOrdersResponse.parser()

  public override fun convert(obj: Tx.MsgCancelOrdersResponse): MsgCancelOrdersResponse =
      MsgCancelOrdersResponse(
  )

  public override fun convert(obj: MsgCancelOrdersResponse): Tx.MsgCancelOrdersResponse {
    val builder = Tx.MsgCancelOrdersResponse.newBuilder()
    return builder.build()
  }
}

public object MsgRegisterContractJvmConverter :
    ProtobufTypeMapper<MsgRegisterContract, Tx.MsgRegisterContract> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgRegisterContract.getDescriptor()

  public override val parser: Parser<Tx.MsgRegisterContract> = Tx.MsgRegisterContract.parser()

  public override fun convert(obj: Tx.MsgRegisterContract): MsgRegisterContract =
      MsgRegisterContract(
  	creator = obj.getCreator(),
  	contract = ContractInfoV2JvmConverter.convert(obj.getContract()),
  )

  public override fun convert(obj: MsgRegisterContract): Tx.MsgRegisterContract {
    val builder = Tx.MsgRegisterContract.newBuilder()
    builder.setCreator(obj.creator)
    builder.setContract(ContractInfoV2JvmConverter.convert(obj.contract))
    return builder.build()
  }
}

public object MsgRegisterContractResponseJvmConverter :
    ProtobufTypeMapper<MsgRegisterContractResponse, Tx.MsgRegisterContractResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgRegisterContractResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgRegisterContractResponse> =
      Tx.MsgRegisterContractResponse.parser()

  public override fun convert(obj: Tx.MsgRegisterContractResponse): MsgRegisterContractResponse =
      MsgRegisterContractResponse(
  )

  public override fun convert(obj: MsgRegisterContractResponse): Tx.MsgRegisterContractResponse {
    val builder = Tx.MsgRegisterContractResponse.newBuilder()
    return builder.build()
  }
}

public object MsgContractDepositRentJvmConverter :
    ProtobufTypeMapper<MsgContractDepositRent, Tx.MsgContractDepositRent> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgContractDepositRent.getDescriptor()

  public override val parser: Parser<Tx.MsgContractDepositRent> = Tx.MsgContractDepositRent.parser()

  public override fun convert(obj: Tx.MsgContractDepositRent): MsgContractDepositRent =
      MsgContractDepositRent(
  	contractAddr = obj.getContractAddr(),
  	amount = obj.getAmount().asKotlinType,
  	sender = obj.getSender(),
  )

  public override fun convert(obj: MsgContractDepositRent): Tx.MsgContractDepositRent {
    val builder = Tx.MsgContractDepositRent.newBuilder()
    builder.setContractAddr(obj.contractAddr)
    builder.setAmount(obj.amount.asJavaType)
    builder.setSender(obj.sender)
    return builder.build()
  }
}

public object MsgContractDepositRentResponseJvmConverter :
    ProtobufTypeMapper<MsgContractDepositRentResponse, Tx.MsgContractDepositRentResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgContractDepositRentResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgContractDepositRentResponse> =
      Tx.MsgContractDepositRentResponse.parser()

  public override fun convert(obj: Tx.MsgContractDepositRentResponse):
      MsgContractDepositRentResponse = MsgContractDepositRentResponse(
  )

  public override fun convert(obj: MsgContractDepositRentResponse):
      Tx.MsgContractDepositRentResponse {
    val builder = Tx.MsgContractDepositRentResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUnregisterContractJvmConverter :
    ProtobufTypeMapper<MsgUnregisterContract, Tx.MsgUnregisterContract> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUnregisterContract.getDescriptor()

  public override val parser: Parser<Tx.MsgUnregisterContract> = Tx.MsgUnregisterContract.parser()

  public override fun convert(obj: Tx.MsgUnregisterContract): MsgUnregisterContract =
      MsgUnregisterContract(
  	creator = obj.getCreator(),
  	contractAddr = obj.getContractAddr(),
  )

  public override fun convert(obj: MsgUnregisterContract): Tx.MsgUnregisterContract {
    val builder = Tx.MsgUnregisterContract.newBuilder()
    builder.setCreator(obj.creator)
    builder.setContractAddr(obj.contractAddr)
    return builder.build()
  }
}

public object MsgUnregisterContractResponseJvmConverter :
    ProtobufTypeMapper<MsgUnregisterContractResponse, Tx.MsgUnregisterContractResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUnregisterContractResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUnregisterContractResponse> =
      Tx.MsgUnregisterContractResponse.parser()

  public override fun convert(obj: Tx.MsgUnregisterContractResponse): MsgUnregisterContractResponse
      = MsgUnregisterContractResponse(
  )

  public override fun convert(obj: MsgUnregisterContractResponse):
      Tx.MsgUnregisterContractResponse {
    val builder = Tx.MsgUnregisterContractResponse.newBuilder()
    return builder.build()
  }
}

public object MsgRegisterPairsJvmConverter :
    ProtobufTypeMapper<MsgRegisterPairs, Tx.MsgRegisterPairs> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgRegisterPairs.getDescriptor()

  public override val parser: Parser<Tx.MsgRegisterPairs> = Tx.MsgRegisterPairs.parser()

  public override fun convert(obj: Tx.MsgRegisterPairs): MsgRegisterPairs = MsgRegisterPairs(
  	creator = obj.getCreator(),
  	batchcontractpair = obj.getBatchcontractpairList().map {
      BatchContractPairJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgRegisterPairs): Tx.MsgRegisterPairs {
    val builder = Tx.MsgRegisterPairs.newBuilder()
    builder.setCreator(obj.creator)
    builder.addAllBatchcontractpair(obj.batchcontractpair.map {
        BatchContractPairJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgRegisterPairsResponseJvmConverter :
    ProtobufTypeMapper<MsgRegisterPairsResponse, Tx.MsgRegisterPairsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgRegisterPairsResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgRegisterPairsResponse> =
      Tx.MsgRegisterPairsResponse.parser()

  public override fun convert(obj: Tx.MsgRegisterPairsResponse): MsgRegisterPairsResponse =
      MsgRegisterPairsResponse(
  )

  public override fun convert(obj: MsgRegisterPairsResponse): Tx.MsgRegisterPairsResponse {
    val builder = Tx.MsgRegisterPairsResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUpdatePriceTickSizeJvmConverter :
    ProtobufTypeMapper<MsgUpdatePriceTickSize, Tx.MsgUpdatePriceTickSize> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdatePriceTickSize.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdatePriceTickSize> = Tx.MsgUpdatePriceTickSize.parser()

  public override fun convert(obj: Tx.MsgUpdatePriceTickSize): MsgUpdatePriceTickSize =
      MsgUpdatePriceTickSize(
  	creator = obj.getCreator(),
  	tickSizeList = obj.getTickSizeListList().map { TickSizeJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgUpdatePriceTickSize): Tx.MsgUpdatePriceTickSize {
    val builder = Tx.MsgUpdatePriceTickSize.newBuilder()
    builder.setCreator(obj.creator)
    builder.addAllTickSizeList(obj.tickSizeList.map { TickSizeJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgUpdateQuantityTickSizeJvmConverter :
    ProtobufTypeMapper<MsgUpdateQuantityTickSize, Tx.MsgUpdateQuantityTickSize> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateQuantityTickSize.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateQuantityTickSize> =
      Tx.MsgUpdateQuantityTickSize.parser()

  public override fun convert(obj: Tx.MsgUpdateQuantityTickSize): MsgUpdateQuantityTickSize =
      MsgUpdateQuantityTickSize(
  	creator = obj.getCreator(),
  	tickSizeList = obj.getTickSizeListList().map { TickSizeJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgUpdateQuantityTickSize): Tx.MsgUpdateQuantityTickSize {
    val builder = Tx.MsgUpdateQuantityTickSize.newBuilder()
    builder.setCreator(obj.creator)
    builder.addAllTickSizeList(obj.tickSizeList.map { TickSizeJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgUpdateTickSizeResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateTickSizeResponse, Tx.MsgUpdateTickSizeResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateTickSizeResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateTickSizeResponse> =
      Tx.MsgUpdateTickSizeResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateTickSizeResponse): MsgUpdateTickSizeResponse =
      MsgUpdateTickSizeResponse(
  )

  public override fun convert(obj: MsgUpdateTickSizeResponse): Tx.MsgUpdateTickSizeResponse {
    val builder = Tx.MsgUpdateTickSizeResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUnsuspendContractJvmConverter :
    ProtobufTypeMapper<MsgUnsuspendContract, Tx.MsgUnsuspendContract> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUnsuspendContract.getDescriptor()

  public override val parser: Parser<Tx.MsgUnsuspendContract> = Tx.MsgUnsuspendContract.parser()

  public override fun convert(obj: Tx.MsgUnsuspendContract): MsgUnsuspendContract =
      MsgUnsuspendContract(
  	creator = obj.getCreator(),
  	contractAddr = obj.getContractAddr(),
  )

  public override fun convert(obj: MsgUnsuspendContract): Tx.MsgUnsuspendContract {
    val builder = Tx.MsgUnsuspendContract.newBuilder()
    builder.setCreator(obj.creator)
    builder.setContractAddr(obj.contractAddr)
    return builder.build()
  }
}

public object MsgUnsuspendContractResponseJvmConverter :
    ProtobufTypeMapper<MsgUnsuspendContractResponse, Tx.MsgUnsuspendContractResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUnsuspendContractResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUnsuspendContractResponse> =
      Tx.MsgUnsuspendContractResponse.parser()

  public override fun convert(obj: Tx.MsgUnsuspendContractResponse): MsgUnsuspendContractResponse =
      MsgUnsuspendContractResponse(
  )

  public override fun convert(obj: MsgUnsuspendContractResponse): Tx.MsgUnsuspendContractResponse {
    val builder = Tx.MsgUnsuspendContractResponse.newBuilder()
    return builder.build()
  }
}

// Transform from terra/market/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.market.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgSwapJvmConverter : ProtobufTypeMapper<MsgSwap, Tx.MsgSwap> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSwap.getDescriptor()

  public override val parser: Parser<Tx.MsgSwap> = Tx.MsgSwap.parser()

  public override fun convert(obj: Tx.MsgSwap): MsgSwap = MsgSwap(
  	trader = obj.getTrader(),
  	offerCoin = CoinJvmConverter.convert(obj.getOfferCoin()),
  	askDenom = obj.getAskDenom(),
  )

  public override fun convert(obj: MsgSwap): Tx.MsgSwap {
    val builder = Tx.MsgSwap.newBuilder()
    builder.setTrader(obj.trader)
    builder.setOfferCoin(CoinJvmConverter.convert(obj.offerCoin))
    builder.setAskDenom(obj.askDenom)
    return builder.build()
  }
}

public object MsgSwapResponseJvmConverter : ProtobufTypeMapper<MsgSwapResponse, Tx.MsgSwapResponse>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSwapResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgSwapResponse> = Tx.MsgSwapResponse.parser()

  public override fun convert(obj: Tx.MsgSwapResponse): MsgSwapResponse = MsgSwapResponse(
  	swapCoin = CoinJvmConverter.convert(obj.getSwapCoin()),
  	swapFee = CoinJvmConverter.convert(obj.getSwapFee()),
  )

  public override fun convert(obj: MsgSwapResponse): Tx.MsgSwapResponse {
    val builder = Tx.MsgSwapResponse.newBuilder()
    builder.setSwapCoin(CoinJvmConverter.convert(obj.swapCoin))
    builder.setSwapFee(CoinJvmConverter.convert(obj.swapFee))
    return builder.build()
  }
}

public object MsgSwapSendJvmConverter : ProtobufTypeMapper<MsgSwapSend, Tx.MsgSwapSend> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSwapSend.getDescriptor()

  public override val parser: Parser<Tx.MsgSwapSend> = Tx.MsgSwapSend.parser()

  public override fun convert(obj: Tx.MsgSwapSend): MsgSwapSend = MsgSwapSend(
  	fromAddress = obj.getFromAddress(),
  	toAddress = obj.getToAddress(),
  	offerCoin = CoinJvmConverter.convert(obj.getOfferCoin()),
  	askDenom = obj.getAskDenom(),
  )

  public override fun convert(obj: MsgSwapSend): Tx.MsgSwapSend {
    val builder = Tx.MsgSwapSend.newBuilder()
    builder.setFromAddress(obj.fromAddress)
    builder.setToAddress(obj.toAddress)
    builder.setOfferCoin(CoinJvmConverter.convert(obj.offerCoin))
    builder.setAskDenom(obj.askDenom)
    return builder.build()
  }
}

public object MsgSwapSendResponseJvmConverter :
    ProtobufTypeMapper<MsgSwapSendResponse, Tx.MsgSwapSendResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSwapSendResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgSwapSendResponse> = Tx.MsgSwapSendResponse.parser()

  public override fun convert(obj: Tx.MsgSwapSendResponse): MsgSwapSendResponse =
      MsgSwapSendResponse(
  	swapCoin = CoinJvmConverter.convert(obj.getSwapCoin()),
  	swapFee = CoinJvmConverter.convert(obj.getSwapFee()),
  )

  public override fun convert(obj: MsgSwapSendResponse): Tx.MsgSwapSendResponse {
    val builder = Tx.MsgSwapSendResponse.newBuilder()
    builder.setSwapCoin(CoinJvmConverter.convert(obj.swapCoin))
    builder.setSwapFee(CoinJvmConverter.convert(obj.swapFee))
    return builder.build()
  }
}

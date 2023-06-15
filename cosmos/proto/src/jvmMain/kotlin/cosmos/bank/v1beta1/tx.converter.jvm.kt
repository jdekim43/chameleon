// Transform from cosmos/bank/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgSendJvmConverter : ProtobufTypeMapper<MsgSend, Tx.MsgSend> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSend.getDescriptor()

  public override val parser: Parser<Tx.MsgSend> = Tx.MsgSend.parser()

  public override fun convert(obj: Tx.MsgSend): MsgSend = MsgSend(
  	fromAddress = obj.getFromAddress(),
  	toAddress = obj.getToAddress(),
  	amount = obj.getAmountList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgSend): Tx.MsgSend {
    val builder = Tx.MsgSend.newBuilder()
    builder.setFromAddress(obj.fromAddress)
    builder.setToAddress(obj.toAddress)
    builder.addAllAmount(obj.amount.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgSendResponseJvmConverter : ProtobufTypeMapper<MsgSendResponse, Tx.MsgSendResponse>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSendResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgSendResponse> = Tx.MsgSendResponse.parser()

  public override fun convert(obj: Tx.MsgSendResponse): MsgSendResponse = MsgSendResponse(
  )

  public override fun convert(obj: MsgSendResponse): Tx.MsgSendResponse {
    val builder = Tx.MsgSendResponse.newBuilder()
    return builder.build()
  }
}

public object MsgMultiSendJvmConverter : ProtobufTypeMapper<MsgMultiSend, Tx.MsgMultiSend> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgMultiSend.getDescriptor()

  public override val parser: Parser<Tx.MsgMultiSend> = Tx.MsgMultiSend.parser()

  public override fun convert(obj: Tx.MsgMultiSend): MsgMultiSend = MsgMultiSend(
  	inputs = obj.getInputsList().map { InputJvmConverter.convert(it) },
  	outputs = obj.getOutputsList().map { OutputJvmConverter.convert(it) },
  )

  public override fun convert(obj: MsgMultiSend): Tx.MsgMultiSend {
    val builder = Tx.MsgMultiSend.newBuilder()
    builder.addAllInputs(obj.inputs.map { InputJvmConverter.convert(it) })
    builder.addAllOutputs(obj.outputs.map { OutputJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MsgMultiSendResponseJvmConverter :
    ProtobufTypeMapper<MsgMultiSendResponse, Tx.MsgMultiSendResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgMultiSendResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgMultiSendResponse> = Tx.MsgMultiSendResponse.parser()

  public override fun convert(obj: Tx.MsgMultiSendResponse): MsgMultiSendResponse =
      MsgMultiSendResponse(
  )

  public override fun convert(obj: MsgMultiSendResponse): Tx.MsgMultiSendResponse {
    val builder = Tx.MsgMultiSendResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUpdateParamsJvmConverter : ProtobufTypeMapper<MsgUpdateParams, Tx.MsgUpdateParams>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateParams.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParams> = Tx.MsgUpdateParams.parser()

  public override fun convert(obj: Tx.MsgUpdateParams): MsgUpdateParams = MsgUpdateParams(
  	authority = obj.getAuthority(),
  	params = ParamsJvmConverter.convert(obj.getParams()),
  )

  public override fun convert(obj: MsgUpdateParams): Tx.MsgUpdateParams {
    val builder = Tx.MsgUpdateParams.newBuilder()
    builder.setAuthority(obj.authority)
    builder.setParams(ParamsJvmConverter.convert(obj.params))
    return builder.build()
  }
}

public object MsgUpdateParamsResponseJvmConverter :
    ProtobufTypeMapper<MsgUpdateParamsResponse, Tx.MsgUpdateParamsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgUpdateParamsResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParamsResponse> =
      Tx.MsgUpdateParamsResponse.parser()

  public override fun convert(obj: Tx.MsgUpdateParamsResponse): MsgUpdateParamsResponse =
      MsgUpdateParamsResponse(
  )

  public override fun convert(obj: MsgUpdateParamsResponse): Tx.MsgUpdateParamsResponse {
    val builder = Tx.MsgUpdateParamsResponse.newBuilder()
    return builder.build()
  }
}

public object MsgSetSendEnabledJvmConverter :
    ProtobufTypeMapper<MsgSetSendEnabled, Tx.MsgSetSendEnabled> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSetSendEnabled.getDescriptor()

  public override val parser: Parser<Tx.MsgSetSendEnabled> = Tx.MsgSetSendEnabled.parser()

  public override fun convert(obj: Tx.MsgSetSendEnabled): MsgSetSendEnabled = MsgSetSendEnabled(
  	authority = obj.getAuthority(),
  	sendEnabled = obj.getSendEnabledList().map { SendEnabledJvmConverter.convert(it) },
  	useDefaultFor = obj.getUseDefaultForList().map { it },
  )

  public override fun convert(obj: MsgSetSendEnabled): Tx.MsgSetSendEnabled {
    val builder = Tx.MsgSetSendEnabled.newBuilder()
    builder.setAuthority(obj.authority)
    builder.addAllSendEnabled(obj.sendEnabled.map { SendEnabledJvmConverter.convert(it) })
    builder.addAllUseDefaultFor(obj.useDefaultFor.map { it })
    return builder.build()
  }
}

public object MsgSetSendEnabledResponseJvmConverter :
    ProtobufTypeMapper<MsgSetSendEnabledResponse, Tx.MsgSetSendEnabledResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgSetSendEnabledResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgSetSendEnabledResponse> =
      Tx.MsgSetSendEnabledResponse.parser()

  public override fun convert(obj: Tx.MsgSetSendEnabledResponse): MsgSetSendEnabledResponse =
      MsgSetSendEnabledResponse(
  )

  public override fun convert(obj: MsgSetSendEnabledResponse): Tx.MsgSetSendEnabledResponse {
    val builder = Tx.MsgSetSendEnabledResponse.newBuilder()
    return builder.build()
  }
}

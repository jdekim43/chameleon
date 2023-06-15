// Transform from cosmos/crisis/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crisis.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgVerifyInvariantJvmConverter :
    ProtobufTypeMapper<MsgVerifyInvariant, Tx.MsgVerifyInvariant> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgVerifyInvariant.getDescriptor()

  public override val parser: Parser<Tx.MsgVerifyInvariant> = Tx.MsgVerifyInvariant.parser()

  public override fun convert(obj: Tx.MsgVerifyInvariant): MsgVerifyInvariant = MsgVerifyInvariant(
  	sender = obj.getSender(),
  	invariantModuleName = obj.getInvariantModuleName(),
  	invariantRoute = obj.getInvariantRoute(),
  )

  public override fun convert(obj: MsgVerifyInvariant): Tx.MsgVerifyInvariant {
    val builder = Tx.MsgVerifyInvariant.newBuilder()
    builder.setSender(obj.sender)
    builder.setInvariantModuleName(obj.invariantModuleName)
    builder.setInvariantRoute(obj.invariantRoute)
    return builder.build()
  }
}

public object MsgVerifyInvariantResponseJvmConverter :
    ProtobufTypeMapper<MsgVerifyInvariantResponse, Tx.MsgVerifyInvariantResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgVerifyInvariantResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgVerifyInvariantResponse> =
      Tx.MsgVerifyInvariantResponse.parser()

  public override fun convert(obj: Tx.MsgVerifyInvariantResponse): MsgVerifyInvariantResponse =
      MsgVerifyInvariantResponse(
  )

  public override fun convert(obj: MsgVerifyInvariantResponse): Tx.MsgVerifyInvariantResponse {
    val builder = Tx.MsgVerifyInvariantResponse.newBuilder()
    return builder.build()
  }
}

public object MsgUpdateParamsJvmConverter : ProtobufTypeMapper<MsgUpdateParams, Tx.MsgUpdateParams>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUpdateParams.getDescriptor()

  public override val parser: Parser<Tx.MsgUpdateParams> = Tx.MsgUpdateParams.parser()

  public override fun convert(obj: Tx.MsgUpdateParams): MsgUpdateParams = MsgUpdateParams(
  	authority = obj.getAuthority(),
  	constantFee = CoinJvmConverter.convert(obj.getConstantFee()),
  )

  public override fun convert(obj: MsgUpdateParams): Tx.MsgUpdateParams {
    val builder = Tx.MsgUpdateParams.newBuilder()
    builder.setAuthority(obj.authority)
    builder.setConstantFee(CoinJvmConverter.convert(obj.constantFee))
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

// Transform from cosmos/slashing/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.slashing.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgUnjailJvmConverter : ProtobufTypeMapper<MsgUnjail, Tx.MsgUnjail> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUnjail.getDescriptor()

  public override val parser: Parser<Tx.MsgUnjail> = Tx.MsgUnjail.parser()

  public override fun convert(obj: Tx.MsgUnjail): MsgUnjail = MsgUnjail(
  	validatorAddr = obj.getValidatorAddr(),
  )

  public override fun convert(obj: MsgUnjail): Tx.MsgUnjail {
    val builder = Tx.MsgUnjail.newBuilder()
    builder.setValidatorAddr(obj.validatorAddr)
    return builder.build()
  }
}

public object MsgUnjailResponseJvmConverter :
    ProtobufTypeMapper<MsgUnjailResponse, Tx.MsgUnjailResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgUnjailResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgUnjailResponse> = Tx.MsgUnjailResponse.parser()

  public override fun convert(obj: Tx.MsgUnjailResponse): MsgUnjailResponse = MsgUnjailResponse(
  )

  public override fun convert(obj: MsgUnjailResponse): Tx.MsgUnjailResponse {
    val builder = Tx.MsgUnjailResponse.newBuilder()
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

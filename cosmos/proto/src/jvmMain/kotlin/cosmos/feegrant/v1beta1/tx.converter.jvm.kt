// Transform from cosmos/feegrant/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.feegrant.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgGrantAllowanceJvmConverter :
    ProtobufTypeMapper<MsgGrantAllowance, Tx.MsgGrantAllowance> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgGrantAllowance.getDescriptor()

  public override val parser: Parser<Tx.MsgGrantAllowance> = Tx.MsgGrantAllowance.parser()

  public override fun convert(obj: Tx.MsgGrantAllowance): MsgGrantAllowance = MsgGrantAllowance(
  	granter = obj.getGranter(),
  	grantee = obj.getGrantee(),
  	allowance = AnyJvmConverter.convert(obj.getAllowance()),
  )

  public override fun convert(obj: MsgGrantAllowance): Tx.MsgGrantAllowance {
    val builder = Tx.MsgGrantAllowance.newBuilder()
    builder.setGranter(obj.granter)
    builder.setGrantee(obj.grantee)
    builder.setAllowance(AnyJvmConverter.convert(obj.allowance))
    return builder.build()
  }
}

public object MsgGrantAllowanceResponseJvmConverter :
    ProtobufTypeMapper<MsgGrantAllowanceResponse, Tx.MsgGrantAllowanceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgGrantAllowanceResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgGrantAllowanceResponse> =
      Tx.MsgGrantAllowanceResponse.parser()

  public override fun convert(obj: Tx.MsgGrantAllowanceResponse): MsgGrantAllowanceResponse =
      MsgGrantAllowanceResponse(
  )

  public override fun convert(obj: MsgGrantAllowanceResponse): Tx.MsgGrantAllowanceResponse {
    val builder = Tx.MsgGrantAllowanceResponse.newBuilder()
    return builder.build()
  }
}

public object MsgRevokeAllowanceJvmConverter :
    ProtobufTypeMapper<MsgRevokeAllowance, Tx.MsgRevokeAllowance> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgRevokeAllowance.getDescriptor()

  public override val parser: Parser<Tx.MsgRevokeAllowance> = Tx.MsgRevokeAllowance.parser()

  public override fun convert(obj: Tx.MsgRevokeAllowance): MsgRevokeAllowance = MsgRevokeAllowance(
  	granter = obj.getGranter(),
  	grantee = obj.getGrantee(),
  )

  public override fun convert(obj: MsgRevokeAllowance): Tx.MsgRevokeAllowance {
    val builder = Tx.MsgRevokeAllowance.newBuilder()
    builder.setGranter(obj.granter)
    builder.setGrantee(obj.grantee)
    return builder.build()
  }
}

public object MsgRevokeAllowanceResponseJvmConverter :
    ProtobufTypeMapper<MsgRevokeAllowanceResponse, Tx.MsgRevokeAllowanceResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgRevokeAllowanceResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgRevokeAllowanceResponse> =
      Tx.MsgRevokeAllowanceResponse.parser()

  public override fun convert(obj: Tx.MsgRevokeAllowanceResponse): MsgRevokeAllowanceResponse =
      MsgRevokeAllowanceResponse(
  )

  public override fun convert(obj: MsgRevokeAllowanceResponse): Tx.MsgRevokeAllowanceResponse {
    val builder = Tx.MsgRevokeAllowanceResponse.newBuilder()
    return builder.build()
  }
}

// Transform from tokenfactory/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.tokenfactory

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgCreateDenomJvmConverter : ProtobufTypeMapper<MsgCreateDenom, Tx.MsgCreateDenom> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgCreateDenom.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateDenom> = Tx.MsgCreateDenom.parser()

  public override fun convert(obj: Tx.MsgCreateDenom): MsgCreateDenom = MsgCreateDenom(
  	sender = obj.getSender(),
  	subdenom = obj.getSubdenom(),
  )

  public override fun convert(obj: MsgCreateDenom): Tx.MsgCreateDenom {
    val builder = Tx.MsgCreateDenom.newBuilder()
    builder.setSender(obj.sender)
    builder.setSubdenom(obj.subdenom)
    return builder.build()
  }
}

public object MsgCreateDenomResponseJvmConverter :
    ProtobufTypeMapper<MsgCreateDenomResponse, Tx.MsgCreateDenomResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgCreateDenomResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCreateDenomResponse> = Tx.MsgCreateDenomResponse.parser()

  public override fun convert(obj: Tx.MsgCreateDenomResponse): MsgCreateDenomResponse =
      MsgCreateDenomResponse(
  	newTokenDenom = obj.getNewTokenDenom(),
  )

  public override fun convert(obj: MsgCreateDenomResponse): Tx.MsgCreateDenomResponse {
    val builder = Tx.MsgCreateDenomResponse.newBuilder()
    builder.setNewTokenDenom(obj.newTokenDenom)
    return builder.build()
  }
}

public object MsgMintJvmConverter : ProtobufTypeMapper<MsgMint, Tx.MsgMint> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgMint.getDescriptor()

  public override val parser: Parser<Tx.MsgMint> = Tx.MsgMint.parser()

  public override fun convert(obj: Tx.MsgMint): MsgMint = MsgMint(
  	sender = obj.getSender(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: MsgMint): Tx.MsgMint {
    val builder = Tx.MsgMint.newBuilder()
    builder.setSender(obj.sender)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object MsgMintResponseJvmConverter : ProtobufTypeMapper<MsgMintResponse, Tx.MsgMintResponse>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgMintResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgMintResponse> = Tx.MsgMintResponse.parser()

  public override fun convert(obj: Tx.MsgMintResponse): MsgMintResponse = MsgMintResponse(
  )

  public override fun convert(obj: MsgMintResponse): Tx.MsgMintResponse {
    val builder = Tx.MsgMintResponse.newBuilder()
    return builder.build()
  }
}

public object MsgBurnJvmConverter : ProtobufTypeMapper<MsgBurn, Tx.MsgBurn> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgBurn.getDescriptor()

  public override val parser: Parser<Tx.MsgBurn> = Tx.MsgBurn.parser()

  public override fun convert(obj: Tx.MsgBurn): MsgBurn = MsgBurn(
  	sender = obj.getSender(),
  	amount = CoinJvmConverter.convert(obj.getAmount()),
  )

  public override fun convert(obj: MsgBurn): Tx.MsgBurn {
    val builder = Tx.MsgBurn.newBuilder()
    builder.setSender(obj.sender)
    builder.setAmount(CoinJvmConverter.convert(obj.amount))
    return builder.build()
  }
}

public object MsgBurnResponseJvmConverter : ProtobufTypeMapper<MsgBurnResponse, Tx.MsgBurnResponse>
    {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgBurnResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgBurnResponse> = Tx.MsgBurnResponse.parser()

  public override fun convert(obj: Tx.MsgBurnResponse): MsgBurnResponse = MsgBurnResponse(
  )

  public override fun convert(obj: MsgBurnResponse): Tx.MsgBurnResponse {
    val builder = Tx.MsgBurnResponse.newBuilder()
    return builder.build()
  }
}

public object MsgChangeAdminJvmConverter : ProtobufTypeMapper<MsgChangeAdmin, Tx.MsgChangeAdmin> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgChangeAdmin.getDescriptor()

  public override val parser: Parser<Tx.MsgChangeAdmin> = Tx.MsgChangeAdmin.parser()

  public override fun convert(obj: Tx.MsgChangeAdmin): MsgChangeAdmin = MsgChangeAdmin(
  	sender = obj.getSender(),
  	denom = obj.getDenom(),
  	newAdmin = obj.getNewAdmin(),
  )

  public override fun convert(obj: MsgChangeAdmin): Tx.MsgChangeAdmin {
    val builder = Tx.MsgChangeAdmin.newBuilder()
    builder.setSender(obj.sender)
    builder.setDenom(obj.denom)
    builder.setNewAdmin(obj.newAdmin)
    return builder.build()
  }
}

public object MsgChangeAdminResponseJvmConverter :
    ProtobufTypeMapper<MsgChangeAdminResponse, Tx.MsgChangeAdminResponse> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgChangeAdminResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgChangeAdminResponse> = Tx.MsgChangeAdminResponse.parser()

  public override fun convert(obj: Tx.MsgChangeAdminResponse): MsgChangeAdminResponse =
      MsgChangeAdminResponse(
  )

  public override fun convert(obj: MsgChangeAdminResponse): Tx.MsgChangeAdminResponse {
    val builder = Tx.MsgChangeAdminResponse.newBuilder()
    return builder.build()
  }
}

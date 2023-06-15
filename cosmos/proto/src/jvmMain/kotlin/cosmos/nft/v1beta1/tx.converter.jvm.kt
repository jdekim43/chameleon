// Transform from cosmos/nft/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.nft.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgSendJvmConverter : ProtobufTypeMapper<MsgSend, Tx.MsgSend> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSend.getDescriptor()

  public override val parser: Parser<Tx.MsgSend> = Tx.MsgSend.parser()

  public override fun convert(obj: Tx.MsgSend): MsgSend = MsgSend(
  	classId = obj.getClassId(),
  	id = obj.getId(),
  	sender = obj.getSender(),
  	`receiver` = obj.getReceiver(),
  )

  public override fun convert(obj: MsgSend): Tx.MsgSend {
    val builder = Tx.MsgSend.newBuilder()
    builder.setClassId(obj.classId)
    builder.setId(obj.id)
    builder.setSender(obj.sender)
    builder.setReceiver(obj.`receiver`)
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

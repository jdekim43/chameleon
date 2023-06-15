// Transform from cosmwasm/wasm/v1/ibc.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object MsgIBCSendJvmConverter : ProtobufTypeMapper<MsgIBCSend, Ibc.MsgIBCSend> {
  public override val descriptor: Descriptors.Descriptor = Ibc.MsgIBCSend.getDescriptor()

  public override val parser: Parser<Ibc.MsgIBCSend> = Ibc.MsgIBCSend.parser()

  public override fun convert(obj: Ibc.MsgIBCSend): MsgIBCSend = MsgIBCSend(
  	channel = obj.getChannel(),
  	timeoutHeight = obj.getTimeoutHeight().asKotlinType,
  	timeoutTimestamp = obj.getTimeoutTimestamp().asKotlinType,
  	`data` = obj.getData().toByteArray(),
  )

  public override fun convert(obj: MsgIBCSend): Ibc.MsgIBCSend {
    val builder = Ibc.MsgIBCSend.newBuilder()
    builder.setChannel(obj.channel)
    builder.setTimeoutHeight(obj.timeoutHeight.asJavaType)
    builder.setTimeoutTimestamp(obj.timeoutTimestamp.asJavaType)
    builder.setData(ByteString.copyFrom(obj.`data`))
    return builder.build()
  }
}

public object MsgIBCSendResponseJvmConverter :
    ProtobufTypeMapper<MsgIBCSendResponse, Ibc.MsgIBCSendResponse> {
  public override val descriptor: Descriptors.Descriptor = Ibc.MsgIBCSendResponse.getDescriptor()

  public override val parser: Parser<Ibc.MsgIBCSendResponse> = Ibc.MsgIBCSendResponse.parser()

  public override fun convert(obj: Ibc.MsgIBCSendResponse): MsgIBCSendResponse = MsgIBCSendResponse(
  	sequence = obj.getSequence().asKotlinType,
  )

  public override fun convert(obj: MsgIBCSendResponse): Ibc.MsgIBCSendResponse {
    val builder = Ibc.MsgIBCSendResponse.newBuilder()
    builder.setSequence(obj.sequence.asJavaType)
    return builder.build()
  }
}

public object MsgIBCCloseChannelJvmConverter :
    ProtobufTypeMapper<MsgIBCCloseChannel, Ibc.MsgIBCCloseChannel> {
  public override val descriptor: Descriptors.Descriptor = Ibc.MsgIBCCloseChannel.getDescriptor()

  public override val parser: Parser<Ibc.MsgIBCCloseChannel> = Ibc.MsgIBCCloseChannel.parser()

  public override fun convert(obj: Ibc.MsgIBCCloseChannel): MsgIBCCloseChannel = MsgIBCCloseChannel(
  	channel = obj.getChannel(),
  )

  public override fun convert(obj: MsgIBCCloseChannel): Ibc.MsgIBCCloseChannel {
    val builder = Ibc.MsgIBCCloseChannel.newBuilder()
    builder.setChannel(obj.channel)
    return builder.build()
  }
}

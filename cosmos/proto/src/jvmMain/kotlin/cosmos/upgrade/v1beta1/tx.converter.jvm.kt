// Transform from cosmos/upgrade/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.upgrade.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object MsgSoftwareUpgradeJvmConverter :
    ProtobufTypeMapper<MsgSoftwareUpgrade, Tx.MsgSoftwareUpgrade> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgSoftwareUpgrade.getDescriptor()

  public override val parser: Parser<Tx.MsgSoftwareUpgrade> = Tx.MsgSoftwareUpgrade.parser()

  public override fun convert(obj: Tx.MsgSoftwareUpgrade): MsgSoftwareUpgrade = MsgSoftwareUpgrade(
  	authority = obj.getAuthority(),
  	plan = PlanJvmConverter.convert(obj.getPlan()),
  )

  public override fun convert(obj: MsgSoftwareUpgrade): Tx.MsgSoftwareUpgrade {
    val builder = Tx.MsgSoftwareUpgrade.newBuilder()
    builder.setAuthority(obj.authority)
    builder.setPlan(PlanJvmConverter.convert(obj.plan))
    return builder.build()
  }
}

public object MsgSoftwareUpgradeResponseJvmConverter :
    ProtobufTypeMapper<MsgSoftwareUpgradeResponse, Tx.MsgSoftwareUpgradeResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgSoftwareUpgradeResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgSoftwareUpgradeResponse> =
      Tx.MsgSoftwareUpgradeResponse.parser()

  public override fun convert(obj: Tx.MsgSoftwareUpgradeResponse): MsgSoftwareUpgradeResponse =
      MsgSoftwareUpgradeResponse(
  )

  public override fun convert(obj: MsgSoftwareUpgradeResponse): Tx.MsgSoftwareUpgradeResponse {
    val builder = Tx.MsgSoftwareUpgradeResponse.newBuilder()
    return builder.build()
  }
}

public object MsgCancelUpgradeJvmConverter :
    ProtobufTypeMapper<MsgCancelUpgrade, Tx.MsgCancelUpgrade> {
  public override val descriptor: Descriptors.Descriptor = Tx.MsgCancelUpgrade.getDescriptor()

  public override val parser: Parser<Tx.MsgCancelUpgrade> = Tx.MsgCancelUpgrade.parser()

  public override fun convert(obj: Tx.MsgCancelUpgrade): MsgCancelUpgrade = MsgCancelUpgrade(
  	authority = obj.getAuthority(),
  )

  public override fun convert(obj: MsgCancelUpgrade): Tx.MsgCancelUpgrade {
    val builder = Tx.MsgCancelUpgrade.newBuilder()
    builder.setAuthority(obj.authority)
    return builder.build()
  }
}

public object MsgCancelUpgradeResponseJvmConverter :
    ProtobufTypeMapper<MsgCancelUpgradeResponse, Tx.MsgCancelUpgradeResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Tx.MsgCancelUpgradeResponse.getDescriptor()

  public override val parser: Parser<Tx.MsgCancelUpgradeResponse> =
      Tx.MsgCancelUpgradeResponse.parser()

  public override fun convert(obj: Tx.MsgCancelUpgradeResponse): MsgCancelUpgradeResponse =
      MsgCancelUpgradeResponse(
  )

  public override fun convert(obj: MsgCancelUpgradeResponse): Tx.MsgCancelUpgradeResponse {
    val builder = Tx.MsgCancelUpgradeResponse.newBuilder()
    return builder.build()
  }
}

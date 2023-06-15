// Transform from cosmos/upgrade/v1beta1/upgrade.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.upgrade.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyJvmConverter
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object PlanJvmConverter : ProtobufTypeMapper<Plan, Upgrade.Plan> {
  public override val descriptor: Descriptors.Descriptor = Upgrade.Plan.getDescriptor()

  public override val parser: Parser<Upgrade.Plan> = Upgrade.Plan.parser()

  public override fun convert(obj: Upgrade.Plan): Plan = Plan(
  	name = obj.getName(),
  	time = TimestampJvmConverter.convert(obj.getTime()),
  	height = obj.getHeight(),
  	info = obj.getInfo(),
  	upgradedClientState = AnyJvmConverter.convert(obj.getUpgradedClientState()),
  )

  public override fun convert(obj: Plan): Upgrade.Plan {
    val builder = Upgrade.Plan.newBuilder()
    builder.setName(obj.name)
    builder.setTime(TimestampJvmConverter.convert(obj.time))
    builder.setHeight(obj.height)
    builder.setInfo(obj.info)
    builder.setUpgradedClientState(AnyJvmConverter.convert(obj.upgradedClientState))
    return builder.build()
  }
}

public object SoftwareUpgradeProposalJvmConverter :
    ProtobufTypeMapper<SoftwareUpgradeProposal, Upgrade.SoftwareUpgradeProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Upgrade.SoftwareUpgradeProposal.getDescriptor()

  public override val parser: Parser<Upgrade.SoftwareUpgradeProposal> =
      Upgrade.SoftwareUpgradeProposal.parser()

  public override fun convert(obj: Upgrade.SoftwareUpgradeProposal): SoftwareUpgradeProposal =
      SoftwareUpgradeProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	plan = PlanJvmConverter.convert(obj.getPlan()),
  )

  public override fun convert(obj: SoftwareUpgradeProposal): Upgrade.SoftwareUpgradeProposal {
    val builder = Upgrade.SoftwareUpgradeProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.setPlan(PlanJvmConverter.convert(obj.plan))
    return builder.build()
  }
}

public object CancelSoftwareUpgradeProposalJvmConverter :
    ProtobufTypeMapper<CancelSoftwareUpgradeProposal, Upgrade.CancelSoftwareUpgradeProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Upgrade.CancelSoftwareUpgradeProposal.getDescriptor()

  public override val parser: Parser<Upgrade.CancelSoftwareUpgradeProposal> =
      Upgrade.CancelSoftwareUpgradeProposal.parser()

  public override fun convert(obj: Upgrade.CancelSoftwareUpgradeProposal):
      CancelSoftwareUpgradeProposal = CancelSoftwareUpgradeProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  )

  public override fun convert(obj: CancelSoftwareUpgradeProposal):
      Upgrade.CancelSoftwareUpgradeProposal {
    val builder = Upgrade.CancelSoftwareUpgradeProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    return builder.build()
  }
}

public object ModuleVersionJvmConverter : ProtobufTypeMapper<ModuleVersion, Upgrade.ModuleVersion> {
  public override val descriptor: Descriptors.Descriptor = Upgrade.ModuleVersion.getDescriptor()

  public override val parser: Parser<Upgrade.ModuleVersion> = Upgrade.ModuleVersion.parser()

  public override fun convert(obj: Upgrade.ModuleVersion): ModuleVersion = ModuleVersion(
  	name = obj.getName(),
  	version = obj.getVersion().asKotlinType,
  )

  public override fun convert(obj: ModuleVersion): Upgrade.ModuleVersion {
    val builder = Upgrade.ModuleVersion.newBuilder()
    builder.setName(obj.name)
    builder.setVersion(obj.version.asJavaType)
    return builder.build()
  }
}

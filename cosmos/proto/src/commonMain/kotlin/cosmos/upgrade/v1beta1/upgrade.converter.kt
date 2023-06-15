// Transform from cosmos/upgrade/v1beta1/upgrade.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.upgrade.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object PlanConverter : ProtobufConverter<Plan>

public fun Plan.toAny(): Any = Any(Plan.TYPE_URL, with(PlanConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Plan>): Plan {
  if (typeUrl != Plan.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SoftwareUpgradeProposalConverter : ProtobufConverter<SoftwareUpgradeProposal>

public fun SoftwareUpgradeProposal.toAny(): Any = Any(SoftwareUpgradeProposal.TYPE_URL,
    with(SoftwareUpgradeProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SoftwareUpgradeProposal>):
    SoftwareUpgradeProposal {
  if (typeUrl != SoftwareUpgradeProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CancelSoftwareUpgradeProposalConverter :
    ProtobufConverter<CancelSoftwareUpgradeProposal>

public fun CancelSoftwareUpgradeProposal.toAny(): Any = Any(CancelSoftwareUpgradeProposal.TYPE_URL,
    with(CancelSoftwareUpgradeProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CancelSoftwareUpgradeProposal>):
    CancelSoftwareUpgradeProposal {
  if (typeUrl != CancelSoftwareUpgradeProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ModuleVersionConverter : ProtobufConverter<ModuleVersion>

public fun ModuleVersion.toAny(): Any = Any(ModuleVersion.TYPE_URL, with(ModuleVersionConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ModuleVersion>): ModuleVersion {
  if (typeUrl != ModuleVersion.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

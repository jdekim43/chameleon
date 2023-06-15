// Transform from cosmos/upgrade/v1beta1/upgrade.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.upgrade.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object PlanConverter : ProtobufConverter<Plan> by PlanJvmConverter

public actual object SoftwareUpgradeProposalConverter : ProtobufConverter<SoftwareUpgradeProposal>
    by SoftwareUpgradeProposalJvmConverter

public actual object CancelSoftwareUpgradeProposalConverter :
    ProtobufConverter<CancelSoftwareUpgradeProposal> by CancelSoftwareUpgradeProposalJvmConverter

public actual object ModuleVersionConverter : ProtobufConverter<ModuleVersion> by
    ModuleVersionJvmConverter

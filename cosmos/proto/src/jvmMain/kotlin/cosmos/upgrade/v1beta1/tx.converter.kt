// Transform from cosmos/upgrade/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.upgrade.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MsgSoftwareUpgradeConverter : ProtobufConverter<MsgSoftwareUpgrade> by
    MsgSoftwareUpgradeJvmConverter

public actual object MsgSoftwareUpgradeResponseConverter :
    ProtobufConverter<MsgSoftwareUpgradeResponse> by MsgSoftwareUpgradeResponseJvmConverter

public actual object MsgCancelUpgradeConverter : ProtobufConverter<MsgCancelUpgrade> by
    MsgCancelUpgradeJvmConverter

public actual object MsgCancelUpgradeResponseConverter : ProtobufConverter<MsgCancelUpgradeResponse>
    by MsgCancelUpgradeResponseJvmConverter

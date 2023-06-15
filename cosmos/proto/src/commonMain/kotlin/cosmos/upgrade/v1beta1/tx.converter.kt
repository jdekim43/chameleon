// Transform from cosmos/upgrade/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.upgrade.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgSoftwareUpgradeConverter : ProtobufConverter<MsgSoftwareUpgrade>

public fun MsgSoftwareUpgrade.toAny(): Any = Any(MsgSoftwareUpgrade.TYPE_URL,
    with(MsgSoftwareUpgradeConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSoftwareUpgrade>): MsgSoftwareUpgrade {
  if (typeUrl != MsgSoftwareUpgrade.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSoftwareUpgradeResponseConverter :
    ProtobufConverter<MsgSoftwareUpgradeResponse>

public fun MsgSoftwareUpgradeResponse.toAny(): Any = Any(MsgSoftwareUpgradeResponse.TYPE_URL,
    with(MsgSoftwareUpgradeResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSoftwareUpgradeResponse>):
    MsgSoftwareUpgradeResponse {
  if (typeUrl != MsgSoftwareUpgradeResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCancelUpgradeConverter : ProtobufConverter<MsgCancelUpgrade>

public fun MsgCancelUpgrade.toAny(): Any = Any(MsgCancelUpgrade.TYPE_URL,
    with(MsgCancelUpgradeConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCancelUpgrade>): MsgCancelUpgrade {
  if (typeUrl != MsgCancelUpgrade.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCancelUpgradeResponseConverter : ProtobufConverter<MsgCancelUpgradeResponse>

public fun MsgCancelUpgradeResponse.toAny(): Any = Any(MsgCancelUpgradeResponse.TYPE_URL,
    with(MsgCancelUpgradeResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCancelUpgradeResponse>):
    MsgCancelUpgradeResponse {
  if (typeUrl != MsgCancelUpgradeResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

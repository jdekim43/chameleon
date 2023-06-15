// Transform from alliance/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package alliance

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgDelegateConverter : ProtobufConverter<MsgDelegate>

public fun MsgDelegate.toAny(): Any = Any(MsgDelegate.TYPE_URL, with(MsgDelegateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgDelegate>): MsgDelegate {
  if (typeUrl != MsgDelegate.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgDelegateResponseConverter : ProtobufConverter<MsgDelegateResponse>

public fun MsgDelegateResponse.toAny(): Any = Any(MsgDelegateResponse.TYPE_URL,
    with(MsgDelegateResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgDelegateResponse>): MsgDelegateResponse {
  if (typeUrl != MsgDelegateResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUndelegateConverter : ProtobufConverter<MsgUndelegate>

public fun MsgUndelegate.toAny(): Any = Any(MsgUndelegate.TYPE_URL, with(MsgUndelegateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUndelegate>): MsgUndelegate {
  if (typeUrl != MsgUndelegate.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUndelegateResponseConverter : ProtobufConverter<MsgUndelegateResponse>

public fun MsgUndelegateResponse.toAny(): Any = Any(MsgUndelegateResponse.TYPE_URL,
    with(MsgUndelegateResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUndelegateResponse>): MsgUndelegateResponse {
  if (typeUrl != MsgUndelegateResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRedelegateConverter : ProtobufConverter<MsgRedelegate>

public fun MsgRedelegate.toAny(): Any = Any(MsgRedelegate.TYPE_URL, with(MsgRedelegateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRedelegate>): MsgRedelegate {
  if (typeUrl != MsgRedelegate.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgRedelegateResponseConverter : ProtobufConverter<MsgRedelegateResponse>

public fun MsgRedelegateResponse.toAny(): Any = Any(MsgRedelegateResponse.TYPE_URL,
    with(MsgRedelegateResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgRedelegateResponse>): MsgRedelegateResponse {
  if (typeUrl != MsgRedelegateResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgClaimDelegationRewardsConverter :
    ProtobufConverter<MsgClaimDelegationRewards>

public fun MsgClaimDelegationRewards.toAny(): Any = Any(MsgClaimDelegationRewards.TYPE_URL,
    with(MsgClaimDelegationRewardsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgClaimDelegationRewards>):
    MsgClaimDelegationRewards {
  if (typeUrl != MsgClaimDelegationRewards.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgClaimDelegationRewardsResponseConverter :
    ProtobufConverter<MsgClaimDelegationRewardsResponse>

public fun MsgClaimDelegationRewardsResponse.toAny(): Any =
    Any(MsgClaimDelegationRewardsResponse.TYPE_URL, with(MsgClaimDelegationRewardsResponseConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgClaimDelegationRewardsResponse>):
    MsgClaimDelegationRewardsResponse {
  if (typeUrl != MsgClaimDelegationRewardsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

// Transform from cosmos/staking/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgCreateValidatorConverter : ProtobufConverter<MsgCreateValidator>

public fun MsgCreateValidator.toAny(): Any = Any(MsgCreateValidator.TYPE_URL,
    with(MsgCreateValidatorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateValidator>): MsgCreateValidator {
  if (typeUrl != MsgCreateValidator.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateValidatorResponseConverter :
    ProtobufConverter<MsgCreateValidatorResponse>

public fun MsgCreateValidatorResponse.toAny(): Any = Any(MsgCreateValidatorResponse.TYPE_URL,
    with(MsgCreateValidatorResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateValidatorResponse>):
    MsgCreateValidatorResponse {
  if (typeUrl != MsgCreateValidatorResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgEditValidatorConverter : ProtobufConverter<MsgEditValidator>

public fun MsgEditValidator.toAny(): Any = Any(MsgEditValidator.TYPE_URL,
    with(MsgEditValidatorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgEditValidator>): MsgEditValidator {
  if (typeUrl != MsgEditValidator.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgEditValidatorResponseConverter : ProtobufConverter<MsgEditValidatorResponse>

public fun MsgEditValidatorResponse.toAny(): Any = Any(MsgEditValidatorResponse.TYPE_URL,
    with(MsgEditValidatorResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgEditValidatorResponse>):
    MsgEditValidatorResponse {
  if (typeUrl != MsgEditValidatorResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

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

public expect object MsgBeginRedelegateConverter : ProtobufConverter<MsgBeginRedelegate>

public fun MsgBeginRedelegate.toAny(): Any = Any(MsgBeginRedelegate.TYPE_URL,
    with(MsgBeginRedelegateConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgBeginRedelegate>): MsgBeginRedelegate {
  if (typeUrl != MsgBeginRedelegate.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgBeginRedelegateResponseConverter :
    ProtobufConverter<MsgBeginRedelegateResponse>

public fun MsgBeginRedelegateResponse.toAny(): Any = Any(MsgBeginRedelegateResponse.TYPE_URL,
    with(MsgBeginRedelegateResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgBeginRedelegateResponse>):
    MsgBeginRedelegateResponse {
  if (typeUrl != MsgBeginRedelegateResponse.TYPE_URL) throw
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

public expect object MsgCancelUnbondingDelegationConverter :
    ProtobufConverter<MsgCancelUnbondingDelegation>

public fun MsgCancelUnbondingDelegation.toAny(): Any = Any(MsgCancelUnbondingDelegation.TYPE_URL,
    with(MsgCancelUnbondingDelegationConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCancelUnbondingDelegation>):
    MsgCancelUnbondingDelegation {
  if (typeUrl != MsgCancelUnbondingDelegation.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCancelUnbondingDelegationResponseConverter :
    ProtobufConverter<MsgCancelUnbondingDelegationResponse>

public fun MsgCancelUnbondingDelegationResponse.toAny(): Any =
    Any(MsgCancelUnbondingDelegationResponse.TYPE_URL,
    with(MsgCancelUnbondingDelegationResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCancelUnbondingDelegationResponse>):
    MsgCancelUnbondingDelegationResponse {
  if (typeUrl != MsgCancelUnbondingDelegationResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateParamsConverter : ProtobufConverter<MsgUpdateParams>

public fun MsgUpdateParams.toAny(): Any = Any(MsgUpdateParams.TYPE_URL,
    with(MsgUpdateParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateParams>): MsgUpdateParams {
  if (typeUrl != MsgUpdateParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgUpdateParamsResponseConverter : ProtobufConverter<MsgUpdateParamsResponse>

public fun MsgUpdateParamsResponse.toAny(): Any = Any(MsgUpdateParamsResponse.TYPE_URL,
    with(MsgUpdateParamsResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgUpdateParamsResponse>):
    MsgUpdateParamsResponse {
  if (typeUrl != MsgUpdateParamsResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

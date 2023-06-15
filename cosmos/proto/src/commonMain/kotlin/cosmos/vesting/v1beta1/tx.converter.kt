// Transform from cosmos/vesting/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.vesting.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgCreateVestingAccountConverter : ProtobufConverter<MsgCreateVestingAccount>

public fun MsgCreateVestingAccount.toAny(): Any = Any(MsgCreateVestingAccount.TYPE_URL,
    with(MsgCreateVestingAccountConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateVestingAccount>):
    MsgCreateVestingAccount {
  if (typeUrl != MsgCreateVestingAccount.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreateVestingAccountResponseConverter :
    ProtobufConverter<MsgCreateVestingAccountResponse>

public fun MsgCreateVestingAccountResponse.toAny(): Any =
    Any(MsgCreateVestingAccountResponse.TYPE_URL, with(MsgCreateVestingAccountResponseConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreateVestingAccountResponse>):
    MsgCreateVestingAccountResponse {
  if (typeUrl != MsgCreateVestingAccountResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreatePermanentLockedAccountConverter :
    ProtobufConverter<MsgCreatePermanentLockedAccount>

public fun MsgCreatePermanentLockedAccount.toAny(): Any =
    Any(MsgCreatePermanentLockedAccount.TYPE_URL, with(MsgCreatePermanentLockedAccountConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreatePermanentLockedAccount>):
    MsgCreatePermanentLockedAccount {
  if (typeUrl != MsgCreatePermanentLockedAccount.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreatePermanentLockedAccountResponseConverter :
    ProtobufConverter<MsgCreatePermanentLockedAccountResponse>

public fun MsgCreatePermanentLockedAccountResponse.toAny(): Any =
    Any(MsgCreatePermanentLockedAccountResponse.TYPE_URL,
    with(MsgCreatePermanentLockedAccountResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreatePermanentLockedAccountResponse>):
    MsgCreatePermanentLockedAccountResponse {
  if (typeUrl != MsgCreatePermanentLockedAccountResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreatePeriodicVestingAccountConverter :
    ProtobufConverter<MsgCreatePeriodicVestingAccount>

public fun MsgCreatePeriodicVestingAccount.toAny(): Any =
    Any(MsgCreatePeriodicVestingAccount.TYPE_URL, with(MsgCreatePeriodicVestingAccountConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreatePeriodicVestingAccount>):
    MsgCreatePeriodicVestingAccount {
  if (typeUrl != MsgCreatePeriodicVestingAccount.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgCreatePeriodicVestingAccountResponseConverter :
    ProtobufConverter<MsgCreatePeriodicVestingAccountResponse>

public fun MsgCreatePeriodicVestingAccountResponse.toAny(): Any =
    Any(MsgCreatePeriodicVestingAccountResponse.TYPE_URL,
    with(MsgCreatePeriodicVestingAccountResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgCreatePeriodicVestingAccountResponse>):
    MsgCreatePeriodicVestingAccountResponse {
  if (typeUrl != MsgCreatePeriodicVestingAccountResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

// Transform from cosmwasm/wasm/v1/authz.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ContractExecutionAuthorizationConverter :
    ProtobufConverter<ContractExecutionAuthorization>

public fun ContractExecutionAuthorization.toAny(): Any =
    Any(ContractExecutionAuthorization.TYPE_URL, with(ContractExecutionAuthorizationConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ContractExecutionAuthorization>):
    ContractExecutionAuthorization {
  if (typeUrl != ContractExecutionAuthorization.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ContractMigrationAuthorizationConverter :
    ProtobufConverter<ContractMigrationAuthorization>

public fun ContractMigrationAuthorization.toAny(): Any =
    Any(ContractMigrationAuthorization.TYPE_URL, with(ContractMigrationAuthorizationConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ContractMigrationAuthorization>):
    ContractMigrationAuthorization {
  if (typeUrl != ContractMigrationAuthorization.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ContractGrantConverter : ProtobufConverter<ContractGrant>

public fun ContractGrant.toAny(): Any = Any(ContractGrant.TYPE_URL, with(ContractGrantConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ContractGrant>): ContractGrant {
  if (typeUrl != ContractGrant.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MaxCallsLimitConverter : ProtobufConverter<MaxCallsLimit>

public fun MaxCallsLimit.toAny(): Any = Any(MaxCallsLimit.TYPE_URL, with(MaxCallsLimitConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MaxCallsLimit>): MaxCallsLimit {
  if (typeUrl != MaxCallsLimit.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MaxFundsLimitConverter : ProtobufConverter<MaxFundsLimit>

public fun MaxFundsLimit.toAny(): Any = Any(MaxFundsLimit.TYPE_URL, with(MaxFundsLimitConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MaxFundsLimit>): MaxFundsLimit {
  if (typeUrl != MaxFundsLimit.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CombinedLimitConverter : ProtobufConverter<CombinedLimit>

public fun CombinedLimit.toAny(): Any = Any(CombinedLimit.TYPE_URL, with(CombinedLimitConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CombinedLimit>): CombinedLimit {
  if (typeUrl != CombinedLimit.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AllowAllMessagesFilterConverter : ProtobufConverter<AllowAllMessagesFilter>

public fun AllowAllMessagesFilter.toAny(): Any = Any(AllowAllMessagesFilter.TYPE_URL,
    with(AllowAllMessagesFilterConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AllowAllMessagesFilter>): AllowAllMessagesFilter {
  if (typeUrl != AllowAllMessagesFilter.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AcceptedMessageKeysFilterConverter :
    ProtobufConverter<AcceptedMessageKeysFilter>

public fun AcceptedMessageKeysFilter.toAny(): Any = Any(AcceptedMessageKeysFilter.TYPE_URL,
    with(AcceptedMessageKeysFilterConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AcceptedMessageKeysFilter>):
    AcceptedMessageKeysFilter {
  if (typeUrl != AcceptedMessageKeysFilter.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AcceptedMessagesFilterConverter : ProtobufConverter<AcceptedMessagesFilter>

public fun AcceptedMessagesFilter.toAny(): Any = Any(AcceptedMessagesFilter.TYPE_URL,
    with(AcceptedMessagesFilterConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AcceptedMessagesFilter>): AcceptedMessagesFilter {
  if (typeUrl != AcceptedMessagesFilter.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

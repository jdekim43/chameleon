// Transform from cosmwasm/wasm/v1/authz.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ContractExecutionAuthorizationConverter :
    ProtobufConverter<ContractExecutionAuthorization> by ContractExecutionAuthorizationJvmConverter

public actual object ContractMigrationAuthorizationConverter :
    ProtobufConverter<ContractMigrationAuthorization> by ContractMigrationAuthorizationJvmConverter

public actual object ContractGrantConverter : ProtobufConverter<ContractGrant> by
    ContractGrantJvmConverter

public actual object MaxCallsLimitConverter : ProtobufConverter<MaxCallsLimit> by
    MaxCallsLimitJvmConverter

public actual object MaxFundsLimitConverter : ProtobufConverter<MaxFundsLimit> by
    MaxFundsLimitJvmConverter

public actual object CombinedLimitConverter : ProtobufConverter<CombinedLimit> by
    CombinedLimitJvmConverter

public actual object AllowAllMessagesFilterConverter : ProtobufConverter<AllowAllMessagesFilter> by
    AllowAllMessagesFilterJvmConverter

public actual object AcceptedMessageKeysFilterConverter :
    ProtobufConverter<AcceptedMessageKeysFilter> by AcceptedMessageKeysFilterJvmConverter

public actual object AcceptedMessagesFilterConverter : ProtobufConverter<AcceptedMessagesFilter> by
    AcceptedMessagesFilterJvmConverter

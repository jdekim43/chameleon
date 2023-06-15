// Transform from cosmwasm/wasm/v1/authz.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import google.protobuf.AnyJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object ContractExecutionAuthorizationJvmConverter :
    ProtobufTypeMapper<ContractExecutionAuthorization, Authz.ContractExecutionAuthorization> {
  public override val descriptor: Descriptors.Descriptor =
      Authz.ContractExecutionAuthorization.getDescriptor()

  public override val parser: Parser<Authz.ContractExecutionAuthorization> =
      Authz.ContractExecutionAuthorization.parser()

  public override fun convert(obj: Authz.ContractExecutionAuthorization):
      ContractExecutionAuthorization = ContractExecutionAuthorization(
  	grants = obj.getGrantsList().map { ContractGrantJvmConverter.convert(it) },
  )

  public override fun convert(obj: ContractExecutionAuthorization):
      Authz.ContractExecutionAuthorization {
    val builder = Authz.ContractExecutionAuthorization.newBuilder()
    builder.addAllGrants(obj.grants.map { ContractGrantJvmConverter.convert(it) })
    return builder.build()
  }
}

public object ContractMigrationAuthorizationJvmConverter :
    ProtobufTypeMapper<ContractMigrationAuthorization, Authz.ContractMigrationAuthorization> {
  public override val descriptor: Descriptors.Descriptor =
      Authz.ContractMigrationAuthorization.getDescriptor()

  public override val parser: Parser<Authz.ContractMigrationAuthorization> =
      Authz.ContractMigrationAuthorization.parser()

  public override fun convert(obj: Authz.ContractMigrationAuthorization):
      ContractMigrationAuthorization = ContractMigrationAuthorization(
  	grants = obj.getGrantsList().map { ContractGrantJvmConverter.convert(it) },
  )

  public override fun convert(obj: ContractMigrationAuthorization):
      Authz.ContractMigrationAuthorization {
    val builder = Authz.ContractMigrationAuthorization.newBuilder()
    builder.addAllGrants(obj.grants.map { ContractGrantJvmConverter.convert(it) })
    return builder.build()
  }
}

public object ContractGrantJvmConverter : ProtobufTypeMapper<ContractGrant, Authz.ContractGrant> {
  public override val descriptor: Descriptors.Descriptor = Authz.ContractGrant.getDescriptor()

  public override val parser: Parser<Authz.ContractGrant> = Authz.ContractGrant.parser()

  public override fun convert(obj: Authz.ContractGrant): ContractGrant = ContractGrant(
  	contract = obj.getContract(),
  	limit = AnyJvmConverter.convert(obj.getLimit()),
  	filter = AnyJvmConverter.convert(obj.getFilter()),
  )

  public override fun convert(obj: ContractGrant): Authz.ContractGrant {
    val builder = Authz.ContractGrant.newBuilder()
    builder.setContract(obj.contract)
    builder.setLimit(AnyJvmConverter.convert(obj.limit))
    builder.setFilter(AnyJvmConverter.convert(obj.filter))
    return builder.build()
  }
}

public object MaxCallsLimitJvmConverter : ProtobufTypeMapper<MaxCallsLimit, Authz.MaxCallsLimit> {
  public override val descriptor: Descriptors.Descriptor = Authz.MaxCallsLimit.getDescriptor()

  public override val parser: Parser<Authz.MaxCallsLimit> = Authz.MaxCallsLimit.parser()

  public override fun convert(obj: Authz.MaxCallsLimit): MaxCallsLimit = MaxCallsLimit(
  	remaining = obj.getRemaining().asKotlinType,
  )

  public override fun convert(obj: MaxCallsLimit): Authz.MaxCallsLimit {
    val builder = Authz.MaxCallsLimit.newBuilder()
    builder.setRemaining(obj.remaining.asJavaType)
    return builder.build()
  }
}

public object MaxFundsLimitJvmConverter : ProtobufTypeMapper<MaxFundsLimit, Authz.MaxFundsLimit> {
  public override val descriptor: Descriptors.Descriptor = Authz.MaxFundsLimit.getDescriptor()

  public override val parser: Parser<Authz.MaxFundsLimit> = Authz.MaxFundsLimit.parser()

  public override fun convert(obj: Authz.MaxFundsLimit): MaxFundsLimit = MaxFundsLimit(
  	amounts = obj.getAmountsList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: MaxFundsLimit): Authz.MaxFundsLimit {
    val builder = Authz.MaxFundsLimit.newBuilder()
    builder.addAllAmounts(obj.amounts.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object CombinedLimitJvmConverter : ProtobufTypeMapper<CombinedLimit, Authz.CombinedLimit> {
  public override val descriptor: Descriptors.Descriptor = Authz.CombinedLimit.getDescriptor()

  public override val parser: Parser<Authz.CombinedLimit> = Authz.CombinedLimit.parser()

  public override fun convert(obj: Authz.CombinedLimit): CombinedLimit = CombinedLimit(
  	callsRemaining = obj.getCallsRemaining().asKotlinType,
  	amounts = obj.getAmountsList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: CombinedLimit): Authz.CombinedLimit {
    val builder = Authz.CombinedLimit.newBuilder()
    builder.setCallsRemaining(obj.callsRemaining.asJavaType)
    builder.addAllAmounts(obj.amounts.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object AllowAllMessagesFilterJvmConverter :
    ProtobufTypeMapper<AllowAllMessagesFilter, Authz.AllowAllMessagesFilter> {
  public override val descriptor: Descriptors.Descriptor =
      Authz.AllowAllMessagesFilter.getDescriptor()

  public override val parser: Parser<Authz.AllowAllMessagesFilter> =
      Authz.AllowAllMessagesFilter.parser()

  public override fun convert(obj: Authz.AllowAllMessagesFilter): AllowAllMessagesFilter =
      AllowAllMessagesFilter(
  )

  public override fun convert(obj: AllowAllMessagesFilter): Authz.AllowAllMessagesFilter {
    val builder = Authz.AllowAllMessagesFilter.newBuilder()
    return builder.build()
  }
}

public object AcceptedMessageKeysFilterJvmConverter :
    ProtobufTypeMapper<AcceptedMessageKeysFilter, Authz.AcceptedMessageKeysFilter> {
  public override val descriptor: Descriptors.Descriptor =
      Authz.AcceptedMessageKeysFilter.getDescriptor()

  public override val parser: Parser<Authz.AcceptedMessageKeysFilter> =
      Authz.AcceptedMessageKeysFilter.parser()

  public override fun convert(obj: Authz.AcceptedMessageKeysFilter): AcceptedMessageKeysFilter =
      AcceptedMessageKeysFilter(
  	keys = obj.getKeysList().map { it },
  )

  public override fun convert(obj: AcceptedMessageKeysFilter): Authz.AcceptedMessageKeysFilter {
    val builder = Authz.AcceptedMessageKeysFilter.newBuilder()
    builder.addAllKeys(obj.keys.map { it })
    return builder.build()
  }
}

public object AcceptedMessagesFilterJvmConverter :
    ProtobufTypeMapper<AcceptedMessagesFilter, Authz.AcceptedMessagesFilter> {
  public override val descriptor: Descriptors.Descriptor =
      Authz.AcceptedMessagesFilter.getDescriptor()

  public override val parser: Parser<Authz.AcceptedMessagesFilter> =
      Authz.AcceptedMessagesFilter.parser()

  public override fun convert(obj: Authz.AcceptedMessagesFilter): AcceptedMessagesFilter =
      AcceptedMessagesFilter(
  	messages = obj.getMessagesList().map { it.toByteArray() },
  )

  public override fun convert(obj: AcceptedMessagesFilter): Authz.AcceptedMessagesFilter {
    val builder = Authz.AcceptedMessagesFilter.newBuilder()
    builder.addAllMessages(obj.messages.map { ByteString.copyFrom(it) })
    return builder.build()
  }
}

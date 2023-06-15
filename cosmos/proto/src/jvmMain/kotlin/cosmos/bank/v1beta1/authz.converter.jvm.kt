// Transform from cosmos/bank/v1beta1/authz.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object SendAuthorizationJvmConverter :
    ProtobufTypeMapper<SendAuthorization, Authz.SendAuthorization> {
  public override val descriptor: Descriptors.Descriptor = Authz.SendAuthorization.getDescriptor()

  public override val parser: Parser<Authz.SendAuthorization> = Authz.SendAuthorization.parser()

  public override fun convert(obj: Authz.SendAuthorization): SendAuthorization = SendAuthorization(
  	spendLimit = obj.getSpendLimitList().map { CoinJvmConverter.convert(it) },
  	allowList = obj.getAllowListList().map { it },
  )

  public override fun convert(obj: SendAuthorization): Authz.SendAuthorization {
    val builder = Authz.SendAuthorization.newBuilder()
    builder.addAllSpendLimit(obj.spendLimit.map { CoinJvmConverter.convert(it) })
    builder.addAllAllowList(obj.allowList.map { it })
    return builder.build()
  }
}

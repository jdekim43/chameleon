// Transform from cosmos/authz/v1beta1/authz.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.authz.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyJvmConverter
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object GenericAuthorizationJvmConverter :
    ProtobufTypeMapper<GenericAuthorization, Authz.GenericAuthorization> {
  public override val descriptor: Descriptors.Descriptor =
      Authz.GenericAuthorization.getDescriptor()

  public override val parser: Parser<Authz.GenericAuthorization> =
      Authz.GenericAuthorization.parser()

  public override fun convert(obj: Authz.GenericAuthorization): GenericAuthorization =
      GenericAuthorization(
  	msg = obj.getMsg(),
  )

  public override fun convert(obj: GenericAuthorization): Authz.GenericAuthorization {
    val builder = Authz.GenericAuthorization.newBuilder()
    builder.setMsg(obj.msg)
    return builder.build()
  }
}

public object GrantJvmConverter : ProtobufTypeMapper<Grant, Authz.Grant> {
  public override val descriptor: Descriptors.Descriptor = Authz.Grant.getDescriptor()

  public override val parser: Parser<Authz.Grant> = Authz.Grant.parser()

  public override fun convert(obj: Authz.Grant): Grant = Grant(
  	authorization = AnyJvmConverter.convert(obj.getAuthorization()),
  	expiration = TimestampJvmConverter.convert(obj.getExpiration()),
  )

  public override fun convert(obj: Grant): Authz.Grant {
    val builder = Authz.Grant.newBuilder()
    builder.setAuthorization(AnyJvmConverter.convert(obj.authorization))
    builder.setExpiration(TimestampJvmConverter.convert(obj.expiration))
    return builder.build()
  }
}

public object GrantAuthorizationJvmConverter :
    ProtobufTypeMapper<GrantAuthorization, Authz.GrantAuthorization> {
  public override val descriptor: Descriptors.Descriptor = Authz.GrantAuthorization.getDescriptor()

  public override val parser: Parser<Authz.GrantAuthorization> = Authz.GrantAuthorization.parser()

  public override fun convert(obj: Authz.GrantAuthorization): GrantAuthorization =
      GrantAuthorization(
  	granter = obj.getGranter(),
  	grantee = obj.getGrantee(),
  	authorization = AnyJvmConverter.convert(obj.getAuthorization()),
  	expiration = TimestampJvmConverter.convert(obj.getExpiration()),
  )

  public override fun convert(obj: GrantAuthorization): Authz.GrantAuthorization {
    val builder = Authz.GrantAuthorization.newBuilder()
    builder.setGranter(obj.granter)
    builder.setGrantee(obj.grantee)
    builder.setAuthorization(AnyJvmConverter.convert(obj.authorization))
    builder.setExpiration(TimestampJvmConverter.convert(obj.expiration))
    return builder.build()
  }
}

public object GrantQueueItemJvmConverter : ProtobufTypeMapper<GrantQueueItem, Authz.GrantQueueItem>
    {
  public override val descriptor: Descriptors.Descriptor = Authz.GrantQueueItem.getDescriptor()

  public override val parser: Parser<Authz.GrantQueueItem> = Authz.GrantQueueItem.parser()

  public override fun convert(obj: Authz.GrantQueueItem): GrantQueueItem = GrantQueueItem(
  	msgTypeUrls = obj.getMsgTypeUrlsList().map { it },
  )

  public override fun convert(obj: GrantQueueItem): Authz.GrantQueueItem {
    val builder = Authz.GrantQueueItem.newBuilder()
    builder.addAllMsgTypeUrls(obj.msgTypeUrls.map { it })
    return builder.build()
  }
}

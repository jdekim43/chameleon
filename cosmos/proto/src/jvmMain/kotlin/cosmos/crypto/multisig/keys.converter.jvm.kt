// Transform from cosmos/crypto/multisig/keys.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crypto.multisig

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.AnyJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object LegacyAminoPubKeyJvmConverter :
    ProtobufTypeMapper<LegacyAminoPubKey, Keys.LegacyAminoPubKey> {
  public override val descriptor: Descriptors.Descriptor = Keys.LegacyAminoPubKey.getDescriptor()

  public override val parser: Parser<Keys.LegacyAminoPubKey> = Keys.LegacyAminoPubKey.parser()

  public override fun convert(obj: Keys.LegacyAminoPubKey): LegacyAminoPubKey = LegacyAminoPubKey(
  	threshold = obj.getThreshold().asKotlinType,
  	publicKeys = obj.getPublicKeysList().map { AnyJvmConverter.convert(it) },
  )

  public override fun convert(obj: LegacyAminoPubKey): Keys.LegacyAminoPubKey {
    val builder = Keys.LegacyAminoPubKey.newBuilder()
    builder.setThreshold(obj.threshold.asJavaType)
    builder.addAllPublicKeys(obj.publicKeys.map { AnyJvmConverter.convert(it) })
    return builder.build()
  }
}

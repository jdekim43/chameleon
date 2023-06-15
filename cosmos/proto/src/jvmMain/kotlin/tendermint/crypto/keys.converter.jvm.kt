// Transform from tendermint/crypto/keys.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.crypto

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object PublicKeyJvmConverter : ProtobufTypeMapper<PublicKey, Keys.PublicKey> {
  public override val descriptor: Descriptors.Descriptor = Keys.PublicKey.getDescriptor()

  public override val parser: Parser<Keys.PublicKey> = Keys.PublicKey.parser()

  public override fun convert(obj: Keys.PublicKey): PublicKey = PublicKey(
  	sum = mapOf(
  1 to { PublicKey.SumOneOf.Ed25519(obj.getEd25519().toByteArray()) },
  2 to { PublicKey.SumOneOf.Secp256K1(obj.getSecp256K1().toByteArray()) },
  ).getValue(obj.sumCase.number)(),
  )

  public override fun convert(obj: PublicKey): Keys.PublicKey {
    val builder = Keys.PublicKey.newBuilder()
    when (obj.sum) {
      is PublicKey.SumOneOf.Ed25519 -> builder.setEd25519(ByteString.copyFrom(obj.sum.value))
      is PublicKey.SumOneOf.Secp256K1 -> builder.setSecp256K1(ByteString.copyFrom(obj.sum.value))
    }
    return builder.build()
  }
}

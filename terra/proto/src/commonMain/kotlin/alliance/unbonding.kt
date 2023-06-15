// Transform from alliance/unbonding.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package alliance

import google.protobuf.Timestamp
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufIndex
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.kotlinx.ProtobufConverterEncoder
import kr.jadekim.protobuf.kotlinx.ProtobufMapperDecoder
import kr.jadekim.protobuf.type.ProtobufMessage

@Serializable(with = UnbondingDelegation.KotlinxSerializer::class)
@SerialName(value = UnbondingDelegation.TYPE_URL)
public data class UnbondingDelegation(
  @ProtobufIndex(index = 1)
  public val completionTime: Timestamp,
  @ProtobufIndex(index = 2)
  public val validatorAddress: String,
  @ProtobufIndex(index = 3)
  public val amount: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/alliance.UnbondingDelegation"
  }

  public object KotlinxSerializer : KSerializer<UnbondingDelegation> {
    private val delegator: KSerializer<UnbondingDelegation> = UnbondingDelegation.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: UnbondingDelegation): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(UnbondingDelegationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): UnbondingDelegation {
      if (decoder is ProtobufMapperDecoder) {
        return UnbondingDelegationConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

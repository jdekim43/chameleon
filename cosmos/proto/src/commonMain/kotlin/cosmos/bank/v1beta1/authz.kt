// Transform from cosmos/bank/v1beta1/authz.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

import cosmos.base.v1beta1.Coin
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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

@Serializable(with = SendAuthorization.KotlinxSerializer::class)
@SerialName(value = SendAuthorization.TYPE_URL)
public data class SendAuthorization(
  @ProtobufIndex(index = 1)
  public val spendLimit: List<Coin>,
  @ProtobufIndex(index = 2)
  public val allowList: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.bank.v1beta1.SendAuthorization"
  }

  public object KotlinxSerializer : KSerializer<SendAuthorization> {
    private val delegator: KSerializer<SendAuthorization> = SendAuthorization.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SendAuthorization): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SendAuthorizationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SendAuthorization {
      if (decoder is ProtobufMapperDecoder) {
        return SendAuthorizationConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

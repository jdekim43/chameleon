// Transform from terra/tx/v1beta1/service.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package terra.tx.v1beta1

import cosmos.base.v1beta1.Coin
import cosmos.tx.v1beta1.Tx
import kotlin.ByteArray
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.ReplaceWith
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

@Serializable(with = ComputeTaxRequest.KotlinxSerializer::class)
@SerialName(value = ComputeTaxRequest.TYPE_URL)
public data class ComputeTaxRequest(
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 1)
  public val tx: Tx,
  @ProtobufIndex(index = 2)
  public val txBytes: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.tx.v1beta1.ComputeTaxRequest"
  }

  public object KotlinxSerializer : KSerializer<ComputeTaxRequest> {
    private val delegator: KSerializer<ComputeTaxRequest> = ComputeTaxRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ComputeTaxRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ComputeTaxRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ComputeTaxRequest {
      if (decoder is ProtobufMapperDecoder) {
        return ComputeTaxRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ComputeTaxResponse.KotlinxSerializer::class)
@SerialName(value = ComputeTaxResponse.TYPE_URL)
public data class ComputeTaxResponse(
  @ProtobufIndex(index = 1)
  public val taxAmount: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.tx.v1beta1.ComputeTaxResponse"
  }

  public object KotlinxSerializer : KSerializer<ComputeTaxResponse> {
    private val delegator: KSerializer<ComputeTaxResponse> = ComputeTaxResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ComputeTaxResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ComputeTaxResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ComputeTaxResponse {
      if (decoder is ProtobufMapperDecoder) {
        return ComputeTaxResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

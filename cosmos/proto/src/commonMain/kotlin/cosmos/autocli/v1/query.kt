// Transform from cosmos/autocli/v1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.autocli.v1

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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

@Serializable(with = AppOptionsRequest.KotlinxSerializer::class)
@SerialName(value = AppOptionsRequest.TYPE_URL)
public class AppOptionsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.autocli.v1.AppOptionsRequest"
  }

  public object KotlinxSerializer : KSerializer<AppOptionsRequest> {
    private val delegator: KSerializer<AppOptionsRequest> = AppOptionsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AppOptionsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AppOptionsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AppOptionsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return AppOptionsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AppOptionsResponse.KotlinxSerializer::class)
@SerialName(value = AppOptionsResponse.TYPE_URL)
public data class AppOptionsResponse(
  @ProtobufIndex(index = 1)
  public val moduleOptions: Map<String, ModuleOptions>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.autocli.v1.AppOptionsResponse"
  }

  public object KotlinxSerializer : KSerializer<AppOptionsResponse> {
    private val delegator: KSerializer<AppOptionsResponse> = AppOptionsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AppOptionsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AppOptionsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AppOptionsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return AppOptionsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

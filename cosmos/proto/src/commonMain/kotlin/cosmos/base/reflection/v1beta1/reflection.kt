// Transform from cosmos/base/reflection/v1beta1/reflection.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.reflection.v1beta1

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

@Serializable(with = ListAllInterfacesRequest.KotlinxSerializer::class)
@SerialName(value = ListAllInterfacesRequest.TYPE_URL)
public class ListAllInterfacesRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v1beta1.ListAllInterfacesRequest"
  }

  public object KotlinxSerializer : KSerializer<ListAllInterfacesRequest> {
    private val delegator: KSerializer<ListAllInterfacesRequest> =
        ListAllInterfacesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ListAllInterfacesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ListAllInterfacesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ListAllInterfacesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return ListAllInterfacesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ListAllInterfacesResponse.KotlinxSerializer::class)
@SerialName(value = ListAllInterfacesResponse.TYPE_URL)
public data class ListAllInterfacesResponse(
  @ProtobufIndex(index = 1)
  public val interfaceNames: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v1beta1.ListAllInterfacesResponse"
  }

  public object KotlinxSerializer : KSerializer<ListAllInterfacesResponse> {
    private val delegator: KSerializer<ListAllInterfacesResponse> =
        ListAllInterfacesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ListAllInterfacesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ListAllInterfacesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ListAllInterfacesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return ListAllInterfacesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ListImplementationsRequest.KotlinxSerializer::class)
@SerialName(value = ListImplementationsRequest.TYPE_URL)
public data class ListImplementationsRequest(
  @ProtobufIndex(index = 1)
  public val interfaceName: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.reflection.v1beta1.ListImplementationsRequest"
  }

  public object KotlinxSerializer : KSerializer<ListImplementationsRequest> {
    private val delegator: KSerializer<ListImplementationsRequest> =
        ListImplementationsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ListImplementationsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ListImplementationsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ListImplementationsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return ListImplementationsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ListImplementationsResponse.KotlinxSerializer::class)
@SerialName(value = ListImplementationsResponse.TYPE_URL)
public data class ListImplementationsResponse(
  @ProtobufIndex(index = 1)
  public val implementationMessageNames: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.base.reflection.v1beta1.ListImplementationsResponse"
  }

  public object KotlinxSerializer : KSerializer<ListImplementationsResponse> {
    private val delegator: KSerializer<ListImplementationsResponse> =
        ListImplementationsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ListImplementationsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ListImplementationsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ListImplementationsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return ListImplementationsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

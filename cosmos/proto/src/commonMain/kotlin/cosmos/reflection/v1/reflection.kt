// Transform from cosmos/reflection/v1/reflection.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.reflection.v1

import google.protobuf.FileDescriptorProto
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

@Serializable(with = FileDescriptorsRequest.KotlinxSerializer::class)
@SerialName(value = FileDescriptorsRequest.TYPE_URL)
public class FileDescriptorsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.reflection.v1.FileDescriptorsRequest"
  }

  public object KotlinxSerializer : KSerializer<FileDescriptorsRequest> {
    private val delegator: KSerializer<FileDescriptorsRequest> = FileDescriptorsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FileDescriptorsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FileDescriptorsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FileDescriptorsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return FileDescriptorsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FileDescriptorsResponse.KotlinxSerializer::class)
@SerialName(value = FileDescriptorsResponse.TYPE_URL)
public data class FileDescriptorsResponse(
  @ProtobufIndex(index = 1)
  public val files: List<FileDescriptorProto>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.reflection.v1.FileDescriptorsResponse"
  }

  public object KotlinxSerializer : KSerializer<FileDescriptorsResponse> {
    private val delegator: KSerializer<FileDescriptorsResponse> =
        FileDescriptorsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FileDescriptorsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FileDescriptorsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FileDescriptorsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return FileDescriptorsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

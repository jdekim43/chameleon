// Transform from google/api/http.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package google.api

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmInline
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

@Serializable(with = Http.KotlinxSerializer::class)
@SerialName(value = Http.TYPE_URL)
public data class Http(
  @ProtobufIndex(index = 1)
  public val rules: List<HttpRule>,
  @ProtobufIndex(index = 2)
  public val fullyDecodeReservedExpansion: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.api.Http"
  }

  public object KotlinxSerializer : KSerializer<Http> {
    private val delegator: KSerializer<Http> = Http.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Http): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(HttpConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Http {
      if (decoder is ProtobufMapperDecoder) {
        return HttpConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = HttpRule.KotlinxSerializer::class)
@SerialName(value = HttpRule.TYPE_URL)
public data class HttpRule(
  @ProtobufIndex(index = 1)
  public val selector: String,
  @ProtobufIndex(index = 7)
  public val body: String,
  @ProtobufIndex(index = 12)
  public val responseBody: String,
  @ProtobufIndex(index = 11)
  public val additionalBindings: List<HttpRule>,
  public val pattern: PatternOneOf,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.api.HttpRule"
  }

  @Serializable
  public sealed interface PatternOneOf {
    @JvmInline
    public value class Get(
      @ProtobufIndex(index = 2)
      public val `value`: String,
    ) : PatternOneOf

    @JvmInline
    public value class Put(
      @ProtobufIndex(index = 3)
      public val `value`: String,
    ) : PatternOneOf

    @JvmInline
    public value class Post(
      @ProtobufIndex(index = 4)
      public val `value`: String,
    ) : PatternOneOf

    @JvmInline
    public value class Delete(
      @ProtobufIndex(index = 5)
      public val `value`: String,
    ) : PatternOneOf

    @JvmInline
    public value class Patch(
      @ProtobufIndex(index = 6)
      public val `value`: String,
    ) : PatternOneOf

    @JvmInline
    public value class Custom(
      @ProtobufIndex(index = 8)
      public val `value`: CustomHttpPattern,
    ) : PatternOneOf
  }

  public object KotlinxSerializer : KSerializer<HttpRule> {
    private val delegator: KSerializer<HttpRule> = HttpRule.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: HttpRule): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(HttpRuleConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): HttpRule {
      if (decoder is ProtobufMapperDecoder) {
        return HttpRuleConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CustomHttpPattern.KotlinxSerializer::class)
@SerialName(value = CustomHttpPattern.TYPE_URL)
public data class CustomHttpPattern(
  @ProtobufIndex(index = 1)
  public val kind: String,
  @ProtobufIndex(index = 2)
  public val path: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.api.CustomHttpPattern"
  }

  public object KotlinxSerializer : KSerializer<CustomHttpPattern> {
    private val delegator: KSerializer<CustomHttpPattern> = CustomHttpPattern.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CustomHttpPattern): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CustomHttpPatternConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CustomHttpPattern {
      if (decoder is ProtobufMapperDecoder) {
        return CustomHttpPatternConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

// Transform from google/protobuf/descriptor.proto
@file:ProtobufSyntax(syntax = "PROTO2")
@file:GeneratorVersion(version = "0.3.1")

package google.protobuf

import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.ReplaceWith
import kotlin.String
import kotlin.ULong
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

@Serializable(with = FileDescriptorSet.KotlinxSerializer::class)
@SerialName(value = FileDescriptorSet.TYPE_URL)
public data class FileDescriptorSet(
  @ProtobufIndex(index = 1)
  public val `file`: List<FileDescriptorProto>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.FileDescriptorSet"
  }

  public object KotlinxSerializer : KSerializer<FileDescriptorSet> {
    private val delegator: KSerializer<FileDescriptorSet> = FileDescriptorSet.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FileDescriptorSet): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FileDescriptorSetConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FileDescriptorSet {
      if (decoder is ProtobufMapperDecoder) {
        return FileDescriptorSetConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FileDescriptorProto.KotlinxSerializer::class)
@SerialName(value = FileDescriptorProto.TYPE_URL)
public data class FileDescriptorProto(
  @ProtobufIndex(index = 1)
  public val name: String? = null,
  @ProtobufIndex(index = 2)
  public val `package`: String? = null,
  @ProtobufIndex(index = 3)
  public val dependency: List<String>,
  @ProtobufIndex(index = 10)
  public val publicDependency: List<Int>,
  @ProtobufIndex(index = 11)
  public val weakDependency: List<Int>,
  @ProtobufIndex(index = 4)
  public val messageType: List<DescriptorProto>,
  @ProtobufIndex(index = 5)
  public val enumType: List<EnumDescriptorProto>,
  @ProtobufIndex(index = 6)
  public val service: List<ServiceDescriptorProto>,
  @ProtobufIndex(index = 7)
  public val extension: List<FieldDescriptorProto>,
  @ProtobufIndex(index = 8)
  public val options: FileOptions? = null,
  @ProtobufIndex(index = 9)
  public val sourceCodeInfo: SourceCodeInfo? = null,
  @ProtobufIndex(index = 12)
  public val syntax: String? = null,
  @ProtobufIndex(index = 13)
  public val edition: String? = null,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.FileDescriptorProto"
  }

  public object KotlinxSerializer : KSerializer<FileDescriptorProto> {
    private val delegator: KSerializer<FileDescriptorProto> = FileDescriptorProto.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FileDescriptorProto): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FileDescriptorProtoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FileDescriptorProto {
      if (decoder is ProtobufMapperDecoder) {
        return FileDescriptorProtoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = DescriptorProto.KotlinxSerializer::class)
@SerialName(value = DescriptorProto.TYPE_URL)
public data class DescriptorProto(
  @ProtobufIndex(index = 1)
  public val name: String? = null,
  @ProtobufIndex(index = 2)
  public val `field`: List<FieldDescriptorProto>,
  @ProtobufIndex(index = 6)
  public val extension: List<FieldDescriptorProto>,
  @ProtobufIndex(index = 3)
  public val nestedType: List<DescriptorProto>,
  @ProtobufIndex(index = 4)
  public val enumType: List<EnumDescriptorProto>,
  @ProtobufIndex(index = 5)
  public val extensionRange: List<ExtensionRange>,
  @ProtobufIndex(index = 8)
  public val oneofDecl: List<OneofDescriptorProto>,
  @ProtobufIndex(index = 7)
  public val options: MessageOptions? = null,
  @ProtobufIndex(index = 9)
  public val reservedRange: List<ReservedRange>,
  @ProtobufIndex(index = 10)
  public val reservedName: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.DescriptorProto"
  }

  @Serializable(with = ExtensionRange.KotlinxSerializer::class)
  @SerialName(value = ExtensionRange.TYPE_URL)
  public data class ExtensionRange(
    @ProtobufIndex(index = 1)
    public val start: Int? = null,
    @ProtobufIndex(index = 2)
    public val end: Int? = null,
    @ProtobufIndex(index = 3)
    public val options: ExtensionRangeOptions? = null,
  ) : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String = "/google.protobuf.DescriptorProto.ExtensionRange"
    }

    public object KotlinxSerializer : KSerializer<ExtensionRange> {
      private val delegator: KSerializer<ExtensionRange> = ExtensionRange.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: ExtensionRange): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(DescriptorProtoConverter.ExtensionRangeConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): ExtensionRange {
        if (decoder is ProtobufMapperDecoder) {
          return DescriptorProtoConverter.ExtensionRangeConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  @Serializable(with = ReservedRange.KotlinxSerializer::class)
  @SerialName(value = ReservedRange.TYPE_URL)
  public data class ReservedRange(
    @ProtobufIndex(index = 1)
    public val start: Int? = null,
    @ProtobufIndex(index = 2)
    public val end: Int? = null,
  ) : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String = "/google.protobuf.DescriptorProto.ReservedRange"
    }

    public object KotlinxSerializer : KSerializer<ReservedRange> {
      private val delegator: KSerializer<ReservedRange> = ReservedRange.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: ReservedRange): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(DescriptorProtoConverter.ReservedRangeConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): ReservedRange {
        if (decoder is ProtobufMapperDecoder) {
          return DescriptorProtoConverter.ReservedRangeConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  public object KotlinxSerializer : KSerializer<DescriptorProto> {
    private val delegator: KSerializer<DescriptorProto> = DescriptorProto.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: DescriptorProto): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(DescriptorProtoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): DescriptorProto {
      if (decoder is ProtobufMapperDecoder) {
        return DescriptorProtoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ExtensionRangeOptions.KotlinxSerializer::class)
@SerialName(value = ExtensionRangeOptions.TYPE_URL)
public data class ExtensionRangeOptions(
  @ProtobufIndex(index = 999)
  public val uninterpretedOption: List<UninterpretedOption>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.ExtensionRangeOptions"
  }

  public object KotlinxSerializer : KSerializer<ExtensionRangeOptions> {
    private val delegator: KSerializer<ExtensionRangeOptions> = ExtensionRangeOptions.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ExtensionRangeOptions): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ExtensionRangeOptionsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ExtensionRangeOptions {
      if (decoder is ProtobufMapperDecoder) {
        return ExtensionRangeOptionsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FieldDescriptorProto.KotlinxSerializer::class)
@SerialName(value = FieldDescriptorProto.TYPE_URL)
public data class FieldDescriptorProto(
  @ProtobufIndex(index = 1)
  public val name: String? = null,
  @ProtobufIndex(index = 3)
  public val number: Int? = null,
  @ProtobufIndex(index = 4)
  public val label: Label? = null,
  @ProtobufIndex(index = 5)
  public val type: Type? = null,
  @ProtobufIndex(index = 6)
  public val typeName: String? = null,
  @ProtobufIndex(index = 2)
  public val extendee: String? = null,
  @ProtobufIndex(index = 7)
  public val defaultValue: String? = null,
  @ProtobufIndex(index = 9)
  public val oneofIndex: Int? = null,
  @ProtobufIndex(index = 10)
  public val jsonName: String? = null,
  @ProtobufIndex(index = 8)
  public val options: FieldOptions? = null,
  @ProtobufIndex(index = 17)
  public val proto3Optional: Boolean? = null,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.FieldDescriptorProto"
  }

  @Serializable
  @SerialName(value = "/google.protobuf.FieldDescriptorProto.Type")
  public enum class Type(
    public val number: Int,
  ) {
    @ProtobufIndex(index = 1)
    TYPE_DOUBLE(1),
    @ProtobufIndex(index = 2)
    TYPE_FLOAT(2),
    @ProtobufIndex(index = 3)
    TYPE_INT64(3),
    @ProtobufIndex(index = 4)
    TYPE_UINT64(4),
    @ProtobufIndex(index = 5)
    TYPE_INT32(5),
    @ProtobufIndex(index = 6)
    TYPE_FIXED64(6),
    @ProtobufIndex(index = 7)
    TYPE_FIXED32(7),
    @ProtobufIndex(index = 8)
    TYPE_BOOL(8),
    @ProtobufIndex(index = 9)
    TYPE_STRING(9),
    @ProtobufIndex(index = 10)
    TYPE_GROUP(10),
    @ProtobufIndex(index = 11)
    TYPE_MESSAGE(11),
    @ProtobufIndex(index = 12)
    TYPE_BYTES(12),
    @ProtobufIndex(index = 13)
    TYPE_UINT32(13),
    @ProtobufIndex(index = 14)
    TYPE_ENUM(14),
    @ProtobufIndex(index = 15)
    TYPE_SFIXED32(15),
    @ProtobufIndex(index = 16)
    TYPE_SFIXED64(16),
    @ProtobufIndex(index = 17)
    TYPE_SINT32(17),
    @ProtobufIndex(index = 18)
    TYPE_SINT64(18),
    ;

    public companion object {
      public fun forNumber(number: Int): Type = Type.values()
      	.first { it.number == number }
    }
  }

  @Serializable
  @SerialName(value = "/google.protobuf.FieldDescriptorProto.Label")
  public enum class Label(
    public val number: Int,
  ) {
    @ProtobufIndex(index = 1)
    LABEL_OPTIONAL(1),
    @ProtobufIndex(index = 2)
    LABEL_REQUIRED(2),
    @ProtobufIndex(index = 3)
    LABEL_REPEATED(3),
    ;

    public companion object {
      public fun forNumber(number: Int): Label = Label.values()
      	.first { it.number == number }
    }
  }

  public object KotlinxSerializer : KSerializer<FieldDescriptorProto> {
    private val delegator: KSerializer<FieldDescriptorProto> = FieldDescriptorProto.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FieldDescriptorProto): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FieldDescriptorProtoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FieldDescriptorProto {
      if (decoder is ProtobufMapperDecoder) {
        return FieldDescriptorProtoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = OneofDescriptorProto.KotlinxSerializer::class)
@SerialName(value = OneofDescriptorProto.TYPE_URL)
public data class OneofDescriptorProto(
  @ProtobufIndex(index = 1)
  public val name: String? = null,
  @ProtobufIndex(index = 2)
  public val options: OneofOptions? = null,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.OneofDescriptorProto"
  }

  public object KotlinxSerializer : KSerializer<OneofDescriptorProto> {
    private val delegator: KSerializer<OneofDescriptorProto> = OneofDescriptorProto.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OneofDescriptorProto): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OneofDescriptorProtoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OneofDescriptorProto {
      if (decoder is ProtobufMapperDecoder) {
        return OneofDescriptorProtoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EnumDescriptorProto.KotlinxSerializer::class)
@SerialName(value = EnumDescriptorProto.TYPE_URL)
public data class EnumDescriptorProto(
  @ProtobufIndex(index = 1)
  public val name: String? = null,
  @ProtobufIndex(index = 2)
  public val `value`: List<EnumValueDescriptorProto>,
  @ProtobufIndex(index = 3)
  public val options: EnumOptions? = null,
  @ProtobufIndex(index = 4)
  public val reservedRange: List<EnumReservedRange>,
  @ProtobufIndex(index = 5)
  public val reservedName: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.EnumDescriptorProto"
  }

  @Serializable(with = EnumReservedRange.KotlinxSerializer::class)
  @SerialName(value = EnumReservedRange.TYPE_URL)
  public data class EnumReservedRange(
    @ProtobufIndex(index = 1)
    public val start: Int? = null,
    @ProtobufIndex(index = 2)
    public val end: Int? = null,
  ) : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String = "/google.protobuf.EnumDescriptorProto.EnumReservedRange"
    }

    public object KotlinxSerializer : KSerializer<EnumReservedRange> {
      private val delegator: KSerializer<EnumReservedRange> = EnumReservedRange.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: EnumReservedRange): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(EnumDescriptorProtoConverter.EnumReservedRangeConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): EnumReservedRange {
        if (decoder is ProtobufMapperDecoder) {
          return EnumDescriptorProtoConverter.EnumReservedRangeConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  public object KotlinxSerializer : KSerializer<EnumDescriptorProto> {
    private val delegator: KSerializer<EnumDescriptorProto> = EnumDescriptorProto.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EnumDescriptorProto): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EnumDescriptorProtoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EnumDescriptorProto {
      if (decoder is ProtobufMapperDecoder) {
        return EnumDescriptorProtoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EnumValueDescriptorProto.KotlinxSerializer::class)
@SerialName(value = EnumValueDescriptorProto.TYPE_URL)
public data class EnumValueDescriptorProto(
  @ProtobufIndex(index = 1)
  public val name: String? = null,
  @ProtobufIndex(index = 2)
  public val number: Int? = null,
  @ProtobufIndex(index = 3)
  public val options: EnumValueOptions? = null,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.EnumValueDescriptorProto"
  }

  public object KotlinxSerializer : KSerializer<EnumValueDescriptorProto> {
    private val delegator: KSerializer<EnumValueDescriptorProto> =
        EnumValueDescriptorProto.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EnumValueDescriptorProto): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EnumValueDescriptorProtoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EnumValueDescriptorProto {
      if (decoder is ProtobufMapperDecoder) {
        return EnumValueDescriptorProtoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ServiceDescriptorProto.KotlinxSerializer::class)
@SerialName(value = ServiceDescriptorProto.TYPE_URL)
public data class ServiceDescriptorProto(
  @ProtobufIndex(index = 1)
  public val name: String? = null,
  @ProtobufIndex(index = 2)
  public val method: List<MethodDescriptorProto>,
  @ProtobufIndex(index = 3)
  public val options: ServiceOptions? = null,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.ServiceDescriptorProto"
  }

  public object KotlinxSerializer : KSerializer<ServiceDescriptorProto> {
    private val delegator: KSerializer<ServiceDescriptorProto> = ServiceDescriptorProto.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ServiceDescriptorProto): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ServiceDescriptorProtoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ServiceDescriptorProto {
      if (decoder is ProtobufMapperDecoder) {
        return ServiceDescriptorProtoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MethodDescriptorProto.KotlinxSerializer::class)
@SerialName(value = MethodDescriptorProto.TYPE_URL)
public data class MethodDescriptorProto(
  @ProtobufIndex(index = 1)
  public val name: String? = null,
  @ProtobufIndex(index = 2)
  public val inputType: String? = null,
  @ProtobufIndex(index = 3)
  public val outputType: String? = null,
  @ProtobufIndex(index = 4)
  public val options: MethodOptions? = null,
  @ProtobufIndex(index = 5)
  public val clientStreaming: Boolean? = null,
  @ProtobufIndex(index = 6)
  public val serverStreaming: Boolean? = null,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.MethodDescriptorProto"
  }

  public object KotlinxSerializer : KSerializer<MethodDescriptorProto> {
    private val delegator: KSerializer<MethodDescriptorProto> = MethodDescriptorProto.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MethodDescriptorProto): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MethodDescriptorProtoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MethodDescriptorProto {
      if (decoder is ProtobufMapperDecoder) {
        return MethodDescriptorProtoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FileOptions.KotlinxSerializer::class)
@SerialName(value = FileOptions.TYPE_URL)
public data class FileOptions(
  @ProtobufIndex(index = 1)
  public val javaPackage: String? = null,
  @ProtobufIndex(index = 8)
  public val javaOuterClassname: String? = null,
  @ProtobufIndex(index = 10)
  public val javaMultipleFiles: Boolean? = null,
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 20)
  public val javaGenerateEqualsAndHash: Boolean? = null,
  @ProtobufIndex(index = 27)
  public val javaStringCheckUtf8: Boolean? = null,
  @ProtobufIndex(index = 9)
  public val optimizeFor: OptimizeMode? = null,
  @ProtobufIndex(index = 11)
  public val goPackage: String? = null,
  @ProtobufIndex(index = 16)
  public val ccGenericServices: Boolean? = null,
  @ProtobufIndex(index = 17)
  public val javaGenericServices: Boolean? = null,
  @ProtobufIndex(index = 18)
  public val pyGenericServices: Boolean? = null,
  @ProtobufIndex(index = 42)
  public val phpGenericServices: Boolean? = null,
  @ProtobufIndex(index = 23)
  public val deprecated: Boolean? = null,
  @ProtobufIndex(index = 31)
  public val ccEnableArenas: Boolean? = null,
  @ProtobufIndex(index = 36)
  public val objcClassPrefix: String? = null,
  @ProtobufIndex(index = 37)
  public val csharpNamespace: String? = null,
  @ProtobufIndex(index = 39)
  public val swiftPrefix: String? = null,
  @ProtobufIndex(index = 40)
  public val phpClassPrefix: String? = null,
  @ProtobufIndex(index = 41)
  public val phpNamespace: String? = null,
  @ProtobufIndex(index = 44)
  public val phpMetadataNamespace: String? = null,
  @ProtobufIndex(index = 45)
  public val rubyPackage: String? = null,
  @ProtobufIndex(index = 999)
  public val uninterpretedOption: List<UninterpretedOption>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.FileOptions"
  }

  @Serializable
  @SerialName(value = "/google.protobuf.FileOptions.OptimizeMode")
  public enum class OptimizeMode(
    public val number: Int,
  ) {
    @ProtobufIndex(index = 1)
    SPEED(1),
    @ProtobufIndex(index = 2)
    CODE_SIZE(2),
    @ProtobufIndex(index = 3)
    LITE_RUNTIME(3),
    ;

    public companion object {
      public fun forNumber(number: Int): OptimizeMode = OptimizeMode.values()
      	.first { it.number == number }
    }
  }

  public object KotlinxSerializer : KSerializer<FileOptions> {
    private val delegator: KSerializer<FileOptions> = FileOptions.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FileOptions): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FileOptionsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FileOptions {
      if (decoder is ProtobufMapperDecoder) {
        return FileOptionsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MessageOptions.KotlinxSerializer::class)
@SerialName(value = MessageOptions.TYPE_URL)
public data class MessageOptions(
  @ProtobufIndex(index = 1)
  public val messageSetWireFormat: Boolean? = null,
  @ProtobufIndex(index = 2)
  public val noStandardDescriptorAccessor: Boolean? = null,
  @ProtobufIndex(index = 3)
  public val deprecated: Boolean? = null,
  @ProtobufIndex(index = 7)
  public val mapEntry: Boolean? = null,
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 11)
  public val deprecatedLegacyJsonFieldConflicts: Boolean? = null,
  @ProtobufIndex(index = 999)
  public val uninterpretedOption: List<UninterpretedOption>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.MessageOptions"
  }

  public object KotlinxSerializer : KSerializer<MessageOptions> {
    private val delegator: KSerializer<MessageOptions> = MessageOptions.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MessageOptions): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MessageOptionsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MessageOptions {
      if (decoder is ProtobufMapperDecoder) {
        return MessageOptionsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = FieldOptions.KotlinxSerializer::class)
@SerialName(value = FieldOptions.TYPE_URL)
public data class FieldOptions(
  @ProtobufIndex(index = 1)
  public val ctype: CType? = null,
  @ProtobufIndex(index = 2)
  public val packed: Boolean? = null,
  @ProtobufIndex(index = 6)
  public val jstype: JSType? = null,
  @ProtobufIndex(index = 5)
  public val lazy: Boolean? = null,
  @ProtobufIndex(index = 15)
  public val unverifiedLazy: Boolean? = null,
  @ProtobufIndex(index = 3)
  public val deprecated: Boolean? = null,
  @ProtobufIndex(index = 10)
  public val weak: Boolean? = null,
  @ProtobufIndex(index = 16)
  public val debugRedact: Boolean? = null,
  @ProtobufIndex(index = 17)
  public val retention: OptionRetention? = null,
  @ProtobufIndex(index = 18)
  public val target: OptionTargetType? = null,
  @ProtobufIndex(index = 999)
  public val uninterpretedOption: List<UninterpretedOption>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.FieldOptions"
  }

  @Serializable
  @SerialName(value = "/google.protobuf.FieldOptions.CType")
  public enum class CType(
    public val number: Int,
  ) {
    @ProtobufIndex(index = 0)
    STRING(0),
    @ProtobufIndex(index = 1)
    CORD(1),
    @ProtobufIndex(index = 2)
    STRING_PIECE(2),
    ;

    public companion object {
      public fun forNumber(number: Int): CType = CType.values()
      	.first { it.number == number }
    }
  }

  @Serializable
  @SerialName(value = "/google.protobuf.FieldOptions.JSType")
  public enum class JSType(
    public val number: Int,
  ) {
    @ProtobufIndex(index = 0)
    JS_NORMAL(0),
    @ProtobufIndex(index = 1)
    JS_STRING(1),
    @ProtobufIndex(index = 2)
    JS_NUMBER(2),
    ;

    public companion object {
      public fun forNumber(number: Int): JSType = JSType.values()
      	.first { it.number == number }
    }
  }

  @Serializable
  @SerialName(value = "/google.protobuf.FieldOptions.OptionRetention")
  public enum class OptionRetention(
    public val number: Int,
  ) {
    @ProtobufIndex(index = 0)
    RETENTION_UNKNOWN(0),
    @ProtobufIndex(index = 1)
    RETENTION_RUNTIME(1),
    @ProtobufIndex(index = 2)
    RETENTION_SOURCE(2),
    ;

    public companion object {
      public fun forNumber(number: Int): OptionRetention = OptionRetention.values()
      	.first { it.number == number }
    }
  }

  @Serializable
  @SerialName(value = "/google.protobuf.FieldOptions.OptionTargetType")
  public enum class OptionTargetType(
    public val number: Int,
  ) {
    @ProtobufIndex(index = 0)
    TARGET_TYPE_UNKNOWN(0),
    @ProtobufIndex(index = 1)
    TARGET_TYPE_FILE(1),
    @ProtobufIndex(index = 2)
    TARGET_TYPE_EXTENSION_RANGE(2),
    @ProtobufIndex(index = 3)
    TARGET_TYPE_MESSAGE(3),
    @ProtobufIndex(index = 4)
    TARGET_TYPE_FIELD(4),
    @ProtobufIndex(index = 5)
    TARGET_TYPE_ONEOF(5),
    @ProtobufIndex(index = 6)
    TARGET_TYPE_ENUM(6),
    @ProtobufIndex(index = 7)
    TARGET_TYPE_ENUM_ENTRY(7),
    @ProtobufIndex(index = 8)
    TARGET_TYPE_SERVICE(8),
    @ProtobufIndex(index = 9)
    TARGET_TYPE_METHOD(9),
    ;

    public companion object {
      public fun forNumber(number: Int): OptionTargetType = OptionTargetType.values()
      	.first { it.number == number }
    }
  }

  public object KotlinxSerializer : KSerializer<FieldOptions> {
    private val delegator: KSerializer<FieldOptions> = FieldOptions.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: FieldOptions): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FieldOptionsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): FieldOptions {
      if (decoder is ProtobufMapperDecoder) {
        return FieldOptionsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = OneofOptions.KotlinxSerializer::class)
@SerialName(value = OneofOptions.TYPE_URL)
public data class OneofOptions(
  @ProtobufIndex(index = 999)
  public val uninterpretedOption: List<UninterpretedOption>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.OneofOptions"
  }

  public object KotlinxSerializer : KSerializer<OneofOptions> {
    private val delegator: KSerializer<OneofOptions> = OneofOptions.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: OneofOptions): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(OneofOptionsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): OneofOptions {
      if (decoder is ProtobufMapperDecoder) {
        return OneofOptionsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EnumOptions.KotlinxSerializer::class)
@SerialName(value = EnumOptions.TYPE_URL)
public data class EnumOptions(
  @ProtobufIndex(index = 2)
  public val allowAlias: Boolean? = null,
  @ProtobufIndex(index = 3)
  public val deprecated: Boolean? = null,
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 6)
  public val deprecatedLegacyJsonFieldConflicts: Boolean? = null,
  @ProtobufIndex(index = 999)
  public val uninterpretedOption: List<UninterpretedOption>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.EnumOptions"
  }

  public object KotlinxSerializer : KSerializer<EnumOptions> {
    private val delegator: KSerializer<EnumOptions> = EnumOptions.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EnumOptions): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EnumOptionsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EnumOptions {
      if (decoder is ProtobufMapperDecoder) {
        return EnumOptionsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = EnumValueOptions.KotlinxSerializer::class)
@SerialName(value = EnumValueOptions.TYPE_URL)
public data class EnumValueOptions(
  @ProtobufIndex(index = 1)
  public val deprecated: Boolean? = null,
  @ProtobufIndex(index = 999)
  public val uninterpretedOption: List<UninterpretedOption>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.EnumValueOptions"
  }

  public object KotlinxSerializer : KSerializer<EnumValueOptions> {
    private val delegator: KSerializer<EnumValueOptions> = EnumValueOptions.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: EnumValueOptions): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(EnumValueOptionsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): EnumValueOptions {
      if (decoder is ProtobufMapperDecoder) {
        return EnumValueOptionsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ServiceOptions.KotlinxSerializer::class)
@SerialName(value = ServiceOptions.TYPE_URL)
public data class ServiceOptions(
  @ProtobufIndex(index = 33)
  public val deprecated: Boolean? = null,
  @ProtobufIndex(index = 999)
  public val uninterpretedOption: List<UninterpretedOption>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.ServiceOptions"
  }

  public object KotlinxSerializer : KSerializer<ServiceOptions> {
    private val delegator: KSerializer<ServiceOptions> = ServiceOptions.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ServiceOptions): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ServiceOptionsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ServiceOptions {
      if (decoder is ProtobufMapperDecoder) {
        return ServiceOptionsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MethodOptions.KotlinxSerializer::class)
@SerialName(value = MethodOptions.TYPE_URL)
public data class MethodOptions(
  @ProtobufIndex(index = 33)
  public val deprecated: Boolean? = null,
  @ProtobufIndex(index = 34)
  public val idempotencyLevel: IdempotencyLevel? = null,
  @ProtobufIndex(index = 999)
  public val uninterpretedOption: List<UninterpretedOption>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.MethodOptions"
  }

  @Serializable
  @SerialName(value = "/google.protobuf.MethodOptions.IdempotencyLevel")
  public enum class IdempotencyLevel(
    public val number: Int,
  ) {
    @ProtobufIndex(index = 0)
    IDEMPOTENCY_UNKNOWN(0),
    @ProtobufIndex(index = 1)
    NO_SIDE_EFFECTS(1),
    @ProtobufIndex(index = 2)
    IDEMPOTENT(2),
    ;

    public companion object {
      public fun forNumber(number: Int): IdempotencyLevel = IdempotencyLevel.values()
      	.first { it.number == number }
    }
  }

  public object KotlinxSerializer : KSerializer<MethodOptions> {
    private val delegator: KSerializer<MethodOptions> = MethodOptions.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MethodOptions): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MethodOptionsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MethodOptions {
      if (decoder is ProtobufMapperDecoder) {
        return MethodOptionsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = UninterpretedOption.KotlinxSerializer::class)
@SerialName(value = UninterpretedOption.TYPE_URL)
public data class UninterpretedOption(
  @ProtobufIndex(index = 2)
  public val name: List<NamePart>,
  @ProtobufIndex(index = 3)
  public val identifierValue: String? = null,
  @ProtobufIndex(index = 4)
  public val positiveIntValue: ULong? = null,
  @ProtobufIndex(index = 5)
  public val negativeIntValue: Long? = null,
  @ProtobufIndex(index = 6)
  public val doubleValue: Double? = null,
  @ProtobufIndex(index = 7)
  public val stringValue: ByteArray? = null,
  @ProtobufIndex(index = 8)
  public val aggregateValue: String? = null,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.UninterpretedOption"
  }

  @Serializable(with = NamePart.KotlinxSerializer::class)
  @SerialName(value = NamePart.TYPE_URL)
  public data class NamePart(
    @ProtobufIndex(index = 1)
    public val namePart: String,
    @ProtobufIndex(index = 2)
    public val isExtension: Boolean,
  ) : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String = "/google.protobuf.UninterpretedOption.NamePart"
    }

    public object KotlinxSerializer : KSerializer<NamePart> {
      private val delegator: KSerializer<NamePart> = NamePart.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: NamePart): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(UninterpretedOptionConverter.NamePartConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): NamePart {
        if (decoder is ProtobufMapperDecoder) {
          return UninterpretedOptionConverter.NamePartConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  public object KotlinxSerializer : KSerializer<UninterpretedOption> {
    private val delegator: KSerializer<UninterpretedOption> = UninterpretedOption.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: UninterpretedOption): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(UninterpretedOptionConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): UninterpretedOption {
      if (decoder is ProtobufMapperDecoder) {
        return UninterpretedOptionConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SourceCodeInfo.KotlinxSerializer::class)
@SerialName(value = SourceCodeInfo.TYPE_URL)
public data class SourceCodeInfo(
  @ProtobufIndex(index = 1)
  public val location: List<Location>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.SourceCodeInfo"
  }

  @Serializable(with = Location.KotlinxSerializer::class)
  @SerialName(value = Location.TYPE_URL)
  public data class Location(
    @ProtobufIndex(index = 1)
    public val path: List<Int>,
    @ProtobufIndex(index = 2)
    public val span: List<Int>,
    @ProtobufIndex(index = 3)
    public val leadingComments: String? = null,
    @ProtobufIndex(index = 4)
    public val trailingComments: String? = null,
    @ProtobufIndex(index = 6)
    public val leadingDetachedComments: List<String>,
  ) : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String = "/google.protobuf.SourceCodeInfo.Location"
    }

    public object KotlinxSerializer : KSerializer<Location> {
      private val delegator: KSerializer<Location> = Location.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: Location): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(SourceCodeInfoConverter.LocationConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): Location {
        if (decoder is ProtobufMapperDecoder) {
          return SourceCodeInfoConverter.LocationConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  public object KotlinxSerializer : KSerializer<SourceCodeInfo> {
    private val delegator: KSerializer<SourceCodeInfo> = SourceCodeInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SourceCodeInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SourceCodeInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SourceCodeInfo {
      if (decoder is ProtobufMapperDecoder) {
        return SourceCodeInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GeneratedCodeInfo.KotlinxSerializer::class)
@SerialName(value = GeneratedCodeInfo.TYPE_URL)
public data class GeneratedCodeInfo(
  @ProtobufIndex(index = 1)
  public val `annotation`: List<Annotation>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/google.protobuf.GeneratedCodeInfo"
  }

  @Serializable(with = Annotation.KotlinxSerializer::class)
  @SerialName(value = Annotation.TYPE_URL)
  public data class Annotation(
    @ProtobufIndex(index = 1)
    public val path: List<Int>,
    @ProtobufIndex(index = 2)
    public val sourceFile: String? = null,
    @ProtobufIndex(index = 3)
    public val begin: Int? = null,
    @ProtobufIndex(index = 4)
    public val end: Int? = null,
    @ProtobufIndex(index = 5)
    public val semantic: Semantic? = null,
  ) : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String = "/google.protobuf.GeneratedCodeInfo.Annotation"
    }

    @Serializable
    @SerialName(value = "/google.protobuf.GeneratedCodeInfo.Annotation.Semantic")
    public enum class Semantic(
      public val number: Int,
    ) {
      @ProtobufIndex(index = 0)
      NONE(0),
      @ProtobufIndex(index = 1)
      SET(1),
      @ProtobufIndex(index = 2)
      ALIAS(2),
      ;

      public companion object {
        public fun forNumber(number: Int): Semantic = Semantic.values()
        	.first { it.number == number }
      }
    }

    public object KotlinxSerializer : KSerializer<Annotation> {
      private val delegator: KSerializer<Annotation> = Annotation.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: Annotation): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(GeneratedCodeInfoConverter.AnnotationConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): Annotation {
        if (decoder is ProtobufMapperDecoder) {
          return GeneratedCodeInfoConverter.AnnotationConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  public object KotlinxSerializer : KSerializer<GeneratedCodeInfo> {
    private val delegator: KSerializer<GeneratedCodeInfo> = GeneratedCodeInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GeneratedCodeInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GeneratedCodeInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GeneratedCodeInfo {
      if (decoder is ProtobufMapperDecoder) {
        return GeneratedCodeInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

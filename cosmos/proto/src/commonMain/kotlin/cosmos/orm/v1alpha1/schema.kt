// Transform from cosmos/orm/v1alpha1/schema.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.orm.v1alpha1

import kotlin.ByteArray
import kotlin.Int
import kotlin.String
import kotlin.UInt
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

@Serializable
@SerialName(value = "/cosmos.orm.v1alpha1.StorageType")
public enum class StorageType(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  STORAGE_TYPE_DEFAULT_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  STORAGE_TYPE_MEMORY(1),
  @ProtobufIndex(index = 2)
  STORAGE_TYPE_TRANSIENT(2),
  @ProtobufIndex(index = 3)
  STORAGE_TYPE_INDEX(3),
  @ProtobufIndex(index = 4)
  STORAGE_TYPE_COMMITMENT(4),
  ;

  public companion object {
    public fun forNumber(number: Int): StorageType = StorageType.values()
    	.first { it.number == number }
  }
}

@Serializable(with = ModuleSchemaDescriptor.KotlinxSerializer::class)
@SerialName(value = ModuleSchemaDescriptor.TYPE_URL)
public data class ModuleSchemaDescriptor(
  @ProtobufIndex(index = 1)
  public val schemaFile: List<FileEntry>,
  @ProtobufIndex(index = 2)
  public val prefix: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.orm.v1alpha1.ModuleSchemaDescriptor"
  }

  @Serializable(with = FileEntry.KotlinxSerializer::class)
  @SerialName(value = FileEntry.TYPE_URL)
  public data class FileEntry(
    @ProtobufIndex(index = 1)
    public val id: UInt,
    @ProtobufIndex(index = 2)
    public val protoFileName: String,
    @ProtobufIndex(index = 3)
    public val storageType: StorageType,
  ) : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String = "/cosmos.orm.v1alpha1.ModuleSchemaDescriptor.FileEntry"
    }

    public object KotlinxSerializer : KSerializer<FileEntry> {
      private val delegator: KSerializer<FileEntry> = FileEntry.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: FileEntry): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(ModuleSchemaDescriptorConverter.FileEntryConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): FileEntry {
        if (decoder is ProtobufMapperDecoder) {
          return ModuleSchemaDescriptorConverter.FileEntryConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  public object KotlinxSerializer : KSerializer<ModuleSchemaDescriptor> {
    private val delegator: KSerializer<ModuleSchemaDescriptor> = ModuleSchemaDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ModuleSchemaDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ModuleSchemaDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ModuleSchemaDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return ModuleSchemaDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

// Transform from cosmos/base/snapshots/v1beta1/snapshot.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.snapshots.v1beta1

import kotlin.ByteArray
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.ReplaceWith
import kotlin.String
import kotlin.UInt
import kotlin.ULong
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

@Serializable(with = Snapshot.KotlinxSerializer::class)
@SerialName(value = Snapshot.TYPE_URL)
public data class Snapshot(
  @ProtobufIndex(index = 1)
  public val height: ULong,
  @ProtobufIndex(index = 2)
  public val format: UInt,
  @ProtobufIndex(index = 3)
  public val chunks: UInt,
  @ProtobufIndex(index = 4)
  public val hash: ByteArray,
  @ProtobufIndex(index = 5)
  public val metadata: Metadata,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.snapshots.v1beta1.Snapshot"
  }

  public object KotlinxSerializer : KSerializer<Snapshot> {
    private val delegator: KSerializer<Snapshot> = Snapshot.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Snapshot): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SnapshotConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Snapshot {
      if (decoder is ProtobufMapperDecoder) {
        return SnapshotConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Metadata.KotlinxSerializer::class)
@SerialName(value = Metadata.TYPE_URL)
public data class Metadata(
  @ProtobufIndex(index = 1)
  public val chunkHashes: List<ByteArray>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.snapshots.v1beta1.Metadata"
  }

  public object KotlinxSerializer : KSerializer<Metadata> {
    private val delegator: KSerializer<Metadata> = Metadata.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Metadata): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MetadataConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Metadata {
      if (decoder is ProtobufMapperDecoder) {
        return MetadataConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SnapshotItem.KotlinxSerializer::class)
@SerialName(value = SnapshotItem.TYPE_URL)
public data class SnapshotItem(
  public val item: ItemOneOf,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.snapshots.v1beta1.SnapshotItem"
  }

  @Serializable
  public sealed interface ItemOneOf {
    @JvmInline
    public value class Store(
      @ProtobufIndex(index = 1)
      public val `value`: SnapshotStoreItem,
    ) : ItemOneOf

    @JvmInline
    public value class Iavl(
      @ProtobufIndex(index = 2)
      public val `value`: SnapshotIAVLItem,
    ) : ItemOneOf

    @JvmInline
    public value class Extension(
      @ProtobufIndex(index = 3)
      public val `value`: SnapshotExtensionMeta,
    ) : ItemOneOf

    @JvmInline
    public value class ExtensionPayload(
      @ProtobufIndex(index = 4)
      public val `value`: SnapshotExtensionPayload,
    ) : ItemOneOf

    @JvmInline
    public value class Kv(
      @Deprecated(
        message = "",
        replaceWith = ReplaceWith(""),
        level = DeprecationLevel.WARNING,
      )
      @ProtobufIndex(index = 5)
      public val `value`: SnapshotKVItem,
    ) : ItemOneOf

    @JvmInline
    public value class Schema(
      @Deprecated(
        message = "",
        replaceWith = ReplaceWith(""),
        level = DeprecationLevel.WARNING,
      )
      @ProtobufIndex(index = 6)
      public val `value`: SnapshotSchema,
    ) : ItemOneOf
  }

  public object KotlinxSerializer : KSerializer<SnapshotItem> {
    private val delegator: KSerializer<SnapshotItem> = SnapshotItem.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SnapshotItem): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SnapshotItemConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SnapshotItem {
      if (decoder is ProtobufMapperDecoder) {
        return SnapshotItemConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SnapshotStoreItem.KotlinxSerializer::class)
@SerialName(value = SnapshotStoreItem.TYPE_URL)
public data class SnapshotStoreItem(
  @ProtobufIndex(index = 1)
  public val name: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.snapshots.v1beta1.SnapshotStoreItem"
  }

  public object KotlinxSerializer : KSerializer<SnapshotStoreItem> {
    private val delegator: KSerializer<SnapshotStoreItem> = SnapshotStoreItem.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SnapshotStoreItem): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SnapshotStoreItemConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SnapshotStoreItem {
      if (decoder is ProtobufMapperDecoder) {
        return SnapshotStoreItemConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SnapshotIAVLItem.KotlinxSerializer::class)
@SerialName(value = SnapshotIAVLItem.TYPE_URL)
public data class SnapshotIAVLItem(
  @ProtobufIndex(index = 1)
  public val key: ByteArray,
  @ProtobufIndex(index = 2)
  public val `value`: ByteArray,
  @ProtobufIndex(index = 3)
  public val version: Long,
  @ProtobufIndex(index = 4)
  public val height: Int,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.snapshots.v1beta1.SnapshotIAVLItem"
  }

  public object KotlinxSerializer : KSerializer<SnapshotIAVLItem> {
    private val delegator: KSerializer<SnapshotIAVLItem> = SnapshotIAVLItem.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SnapshotIAVLItem): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SnapshotIAVLItemConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SnapshotIAVLItem {
      if (decoder is ProtobufMapperDecoder) {
        return SnapshotIAVLItemConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SnapshotExtensionMeta.KotlinxSerializer::class)
@SerialName(value = SnapshotExtensionMeta.TYPE_URL)
public data class SnapshotExtensionMeta(
  @ProtobufIndex(index = 1)
  public val name: String,
  @ProtobufIndex(index = 2)
  public val format: UInt,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.snapshots.v1beta1.SnapshotExtensionMeta"
  }

  public object KotlinxSerializer : KSerializer<SnapshotExtensionMeta> {
    private val delegator: KSerializer<SnapshotExtensionMeta> = SnapshotExtensionMeta.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SnapshotExtensionMeta): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SnapshotExtensionMetaConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SnapshotExtensionMeta {
      if (decoder is ProtobufMapperDecoder) {
        return SnapshotExtensionMetaConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SnapshotExtensionPayload.KotlinxSerializer::class)
@SerialName(value = SnapshotExtensionPayload.TYPE_URL)
public data class SnapshotExtensionPayload(
  @ProtobufIndex(index = 1)
  public val payload: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.snapshots.v1beta1.SnapshotExtensionPayload"
  }

  public object KotlinxSerializer : KSerializer<SnapshotExtensionPayload> {
    private val delegator: KSerializer<SnapshotExtensionPayload> =
        SnapshotExtensionPayload.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SnapshotExtensionPayload): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SnapshotExtensionPayloadConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SnapshotExtensionPayload {
      if (decoder is ProtobufMapperDecoder) {
        return SnapshotExtensionPayloadConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SnapshotKVItem.KotlinxSerializer::class)
@SerialName(value = SnapshotKVItem.TYPE_URL)
public data class SnapshotKVItem(
  @ProtobufIndex(index = 1)
  public val key: ByteArray,
  @ProtobufIndex(index = 2)
  public val `value`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.snapshots.v1beta1.SnapshotKVItem"
  }

  public object KotlinxSerializer : KSerializer<SnapshotKVItem> {
    private val delegator: KSerializer<SnapshotKVItem> = SnapshotKVItem.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SnapshotKVItem): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SnapshotKVItemConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SnapshotKVItem {
      if (decoder is ProtobufMapperDecoder) {
        return SnapshotKVItemConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SnapshotSchema.KotlinxSerializer::class)
@SerialName(value = SnapshotSchema.TYPE_URL)
public data class SnapshotSchema(
  @ProtobufIndex(index = 1)
  public val keys: List<ByteArray>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.snapshots.v1beta1.SnapshotSchema"
  }

  public object KotlinxSerializer : KSerializer<SnapshotSchema> {
    private val delegator: KSerializer<SnapshotSchema> = SnapshotSchema.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SnapshotSchema): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SnapshotSchemaConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SnapshotSchema {
      if (decoder is ProtobufMapperDecoder) {
        return SnapshotSchemaConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

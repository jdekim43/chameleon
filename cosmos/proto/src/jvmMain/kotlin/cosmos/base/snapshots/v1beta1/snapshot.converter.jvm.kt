// Transform from cosmos/base/snapshots/v1beta1/snapshot.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.snapshots.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object SnapshotJvmConverter : ProtobufTypeMapper<Snapshot, SnapshotOuterClass.Snapshot> {
  public override val descriptor: Descriptors.Descriptor =
      SnapshotOuterClass.Snapshot.getDescriptor()

  public override val parser: Parser<SnapshotOuterClass.Snapshot> =
      SnapshotOuterClass.Snapshot.parser()

  public override fun convert(obj: SnapshotOuterClass.Snapshot): Snapshot = Snapshot(
  	height = obj.getHeight().asKotlinType,
  	format = obj.getFormat().asKotlinType,
  	chunks = obj.getChunks().asKotlinType,
  	hash = obj.getHash().toByteArray(),
  	metadata = MetadataJvmConverter.convert(obj.getMetadata()),
  )

  public override fun convert(obj: Snapshot): SnapshotOuterClass.Snapshot {
    val builder = SnapshotOuterClass.Snapshot.newBuilder()
    builder.setHeight(obj.height.asJavaType)
    builder.setFormat(obj.format.asJavaType)
    builder.setChunks(obj.chunks.asJavaType)
    builder.setHash(ByteString.copyFrom(obj.hash))
    builder.setMetadata(MetadataJvmConverter.convert(obj.metadata))
    return builder.build()
  }
}

public object MetadataJvmConverter : ProtobufTypeMapper<Metadata, SnapshotOuterClass.Metadata> {
  public override val descriptor: Descriptors.Descriptor =
      SnapshotOuterClass.Metadata.getDescriptor()

  public override val parser: Parser<SnapshotOuterClass.Metadata> =
      SnapshotOuterClass.Metadata.parser()

  public override fun convert(obj: SnapshotOuterClass.Metadata): Metadata = Metadata(
  	chunkHashes = obj.getChunkHashesList().map { it.toByteArray() },
  )

  public override fun convert(obj: Metadata): SnapshotOuterClass.Metadata {
    val builder = SnapshotOuterClass.Metadata.newBuilder()
    builder.addAllChunkHashes(obj.chunkHashes.map { ByteString.copyFrom(it) })
    return builder.build()
  }
}

public object SnapshotItemJvmConverter :
    ProtobufTypeMapper<SnapshotItem, SnapshotOuterClass.SnapshotItem> {
  public override val descriptor: Descriptors.Descriptor =
      SnapshotOuterClass.SnapshotItem.getDescriptor()

  public override val parser: Parser<SnapshotOuterClass.SnapshotItem> =
      SnapshotOuterClass.SnapshotItem.parser()

  public override fun convert(obj: SnapshotOuterClass.SnapshotItem): SnapshotItem = SnapshotItem(
  	item = mapOf(
  1 to { SnapshotItem.ItemOneOf.Store(SnapshotStoreItemJvmConverter.convert(obj.getStore())) },
  2 to { SnapshotItem.ItemOneOf.Iavl(SnapshotIAVLItemJvmConverter.convert(obj.getIavl())) },
  3 to {
      SnapshotItem.ItemOneOf.Extension(SnapshotExtensionMetaJvmConverter.convert(obj.getExtension()))
      },
  4 to {
      SnapshotItem.ItemOneOf.ExtensionPayload(SnapshotExtensionPayloadJvmConverter.convert(obj.getExtensionPayload()))
      },
  5 to { SnapshotItem.ItemOneOf.Kv(SnapshotKVItemJvmConverter.convert(obj.getKv())) },
  6 to { SnapshotItem.ItemOneOf.Schema(SnapshotSchemaJvmConverter.convert(obj.getSchema())) },
  ).getValue(obj.itemCase.number)(),
  )

  public override fun convert(obj: SnapshotItem): SnapshotOuterClass.SnapshotItem {
    val builder = SnapshotOuterClass.SnapshotItem.newBuilder()
    when (obj.item) {
      is SnapshotItem.ItemOneOf.Store ->
          builder.setStore(SnapshotStoreItemJvmConverter.convert(obj.item.value))
      is SnapshotItem.ItemOneOf.Iavl ->
          builder.setIavl(SnapshotIAVLItemJvmConverter.convert(obj.item.value))
      is SnapshotItem.ItemOneOf.Extension ->
          builder.setExtension(SnapshotExtensionMetaJvmConverter.convert(obj.item.value))
      is SnapshotItem.ItemOneOf.ExtensionPayload ->
          builder.setExtensionPayload(SnapshotExtensionPayloadJvmConverter.convert(obj.item.value))
      is SnapshotItem.ItemOneOf.Kv ->
          builder.setKv(SnapshotKVItemJvmConverter.convert(obj.item.value))
      is SnapshotItem.ItemOneOf.Schema ->
          builder.setSchema(SnapshotSchemaJvmConverter.convert(obj.item.value))
    }
    return builder.build()
  }
}

public object SnapshotStoreItemJvmConverter :
    ProtobufTypeMapper<SnapshotStoreItem, SnapshotOuterClass.SnapshotStoreItem> {
  public override val descriptor: Descriptors.Descriptor =
      SnapshotOuterClass.SnapshotStoreItem.getDescriptor()

  public override val parser: Parser<SnapshotOuterClass.SnapshotStoreItem> =
      SnapshotOuterClass.SnapshotStoreItem.parser()

  public override fun convert(obj: SnapshotOuterClass.SnapshotStoreItem): SnapshotStoreItem =
      SnapshotStoreItem(
  	name = obj.getName(),
  )

  public override fun convert(obj: SnapshotStoreItem): SnapshotOuterClass.SnapshotStoreItem {
    val builder = SnapshotOuterClass.SnapshotStoreItem.newBuilder()
    builder.setName(obj.name)
    return builder.build()
  }
}

public object SnapshotIAVLItemJvmConverter :
    ProtobufTypeMapper<SnapshotIAVLItem, SnapshotOuterClass.SnapshotIAVLItem> {
  public override val descriptor: Descriptors.Descriptor =
      SnapshotOuterClass.SnapshotIAVLItem.getDescriptor()

  public override val parser: Parser<SnapshotOuterClass.SnapshotIAVLItem> =
      SnapshotOuterClass.SnapshotIAVLItem.parser()

  public override fun convert(obj: SnapshotOuterClass.SnapshotIAVLItem): SnapshotIAVLItem =
      SnapshotIAVLItem(
  	key = obj.getKey().toByteArray(),
  	`value` = obj.getValue().toByteArray(),
  	version = obj.getVersion(),
  	height = obj.getHeight(),
  )

  public override fun convert(obj: SnapshotIAVLItem): SnapshotOuterClass.SnapshotIAVLItem {
    val builder = SnapshotOuterClass.SnapshotIAVLItem.newBuilder()
    builder.setKey(ByteString.copyFrom(obj.key))
    builder.setValue(ByteString.copyFrom(obj.`value`))
    builder.setVersion(obj.version)
    builder.setHeight(obj.height)
    return builder.build()
  }
}

public object SnapshotExtensionMetaJvmConverter :
    ProtobufTypeMapper<SnapshotExtensionMeta, SnapshotOuterClass.SnapshotExtensionMeta> {
  public override val descriptor: Descriptors.Descriptor =
      SnapshotOuterClass.SnapshotExtensionMeta.getDescriptor()

  public override val parser: Parser<SnapshotOuterClass.SnapshotExtensionMeta> =
      SnapshotOuterClass.SnapshotExtensionMeta.parser()

  public override fun convert(obj: SnapshotOuterClass.SnapshotExtensionMeta): SnapshotExtensionMeta
      = SnapshotExtensionMeta(
  	name = obj.getName(),
  	format = obj.getFormat().asKotlinType,
  )

  public override fun convert(obj: SnapshotExtensionMeta):
      SnapshotOuterClass.SnapshotExtensionMeta {
    val builder = SnapshotOuterClass.SnapshotExtensionMeta.newBuilder()
    builder.setName(obj.name)
    builder.setFormat(obj.format.asJavaType)
    return builder.build()
  }
}

public object SnapshotExtensionPayloadJvmConverter :
    ProtobufTypeMapper<SnapshotExtensionPayload, SnapshotOuterClass.SnapshotExtensionPayload> {
  public override val descriptor: Descriptors.Descriptor =
      SnapshotOuterClass.SnapshotExtensionPayload.getDescriptor()

  public override val parser: Parser<SnapshotOuterClass.SnapshotExtensionPayload> =
      SnapshotOuterClass.SnapshotExtensionPayload.parser()

  public override fun convert(obj: SnapshotOuterClass.SnapshotExtensionPayload):
      SnapshotExtensionPayload = SnapshotExtensionPayload(
  	payload = obj.getPayload().toByteArray(),
  )

  public override fun convert(obj: SnapshotExtensionPayload):
      SnapshotOuterClass.SnapshotExtensionPayload {
    val builder = SnapshotOuterClass.SnapshotExtensionPayload.newBuilder()
    builder.setPayload(ByteString.copyFrom(obj.payload))
    return builder.build()
  }
}

public object SnapshotKVItemJvmConverter :
    ProtobufTypeMapper<SnapshotKVItem, SnapshotOuterClass.SnapshotKVItem> {
  public override val descriptor: Descriptors.Descriptor =
      SnapshotOuterClass.SnapshotKVItem.getDescriptor()

  public override val parser: Parser<SnapshotOuterClass.SnapshotKVItem> =
      SnapshotOuterClass.SnapshotKVItem.parser()

  public override fun convert(obj: SnapshotOuterClass.SnapshotKVItem): SnapshotKVItem =
      SnapshotKVItem(
  	key = obj.getKey().toByteArray(),
  	`value` = obj.getValue().toByteArray(),
  )

  public override fun convert(obj: SnapshotKVItem): SnapshotOuterClass.SnapshotKVItem {
    val builder = SnapshotOuterClass.SnapshotKVItem.newBuilder()
    builder.setKey(ByteString.copyFrom(obj.key))
    builder.setValue(ByteString.copyFrom(obj.`value`))
    return builder.build()
  }
}

public object SnapshotSchemaJvmConverter :
    ProtobufTypeMapper<SnapshotSchema, SnapshotOuterClass.SnapshotSchema> {
  public override val descriptor: Descriptors.Descriptor =
      SnapshotOuterClass.SnapshotSchema.getDescriptor()

  public override val parser: Parser<SnapshotOuterClass.SnapshotSchema> =
      SnapshotOuterClass.SnapshotSchema.parser()

  public override fun convert(obj: SnapshotOuterClass.SnapshotSchema): SnapshotSchema =
      SnapshotSchema(
  	keys = obj.getKeysList().map { it.toByteArray() },
  )

  public override fun convert(obj: SnapshotSchema): SnapshotOuterClass.SnapshotSchema {
    val builder = SnapshotOuterClass.SnapshotSchema.newBuilder()
    builder.addAllKeys(obj.keys.map { ByteString.copyFrom(it) })
    return builder.build()
  }
}

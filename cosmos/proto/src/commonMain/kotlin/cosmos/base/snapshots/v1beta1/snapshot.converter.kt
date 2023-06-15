// Transform from cosmos/base/snapshots/v1beta1/snapshot.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.snapshots.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object SnapshotConverter : ProtobufConverter<Snapshot>

public fun Snapshot.toAny(): Any = Any(Snapshot.TYPE_URL, with(SnapshotConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Snapshot>): Snapshot {
  if (typeUrl != Snapshot.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MetadataConverter : ProtobufConverter<Metadata>

public fun Metadata.toAny(): Any = Any(Metadata.TYPE_URL, with(MetadataConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Metadata>): Metadata {
  if (typeUrl != Metadata.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SnapshotItemConverter : ProtobufConverter<SnapshotItem>

public fun SnapshotItem.toAny(): Any = Any(SnapshotItem.TYPE_URL, with(SnapshotItemConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SnapshotItem>): SnapshotItem {
  if (typeUrl != SnapshotItem.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SnapshotStoreItemConverter : ProtobufConverter<SnapshotStoreItem>

public fun SnapshotStoreItem.toAny(): Any = Any(SnapshotStoreItem.TYPE_URL,
    with(SnapshotStoreItemConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SnapshotStoreItem>): SnapshotStoreItem {
  if (typeUrl != SnapshotStoreItem.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SnapshotIAVLItemConverter : ProtobufConverter<SnapshotIAVLItem>

public fun SnapshotIAVLItem.toAny(): Any = Any(SnapshotIAVLItem.TYPE_URL,
    with(SnapshotIAVLItemConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SnapshotIAVLItem>): SnapshotIAVLItem {
  if (typeUrl != SnapshotIAVLItem.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SnapshotExtensionMetaConverter : ProtobufConverter<SnapshotExtensionMeta>

public fun SnapshotExtensionMeta.toAny(): Any = Any(SnapshotExtensionMeta.TYPE_URL,
    with(SnapshotExtensionMetaConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SnapshotExtensionMeta>): SnapshotExtensionMeta {
  if (typeUrl != SnapshotExtensionMeta.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SnapshotExtensionPayloadConverter : ProtobufConverter<SnapshotExtensionPayload>

public fun SnapshotExtensionPayload.toAny(): Any = Any(SnapshotExtensionPayload.TYPE_URL,
    with(SnapshotExtensionPayloadConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SnapshotExtensionPayload>):
    SnapshotExtensionPayload {
  if (typeUrl != SnapshotExtensionPayload.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SnapshotKVItemConverter : ProtobufConverter<SnapshotKVItem>

public fun SnapshotKVItem.toAny(): Any = Any(SnapshotKVItem.TYPE_URL, with(SnapshotKVItemConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SnapshotKVItem>): SnapshotKVItem {
  if (typeUrl != SnapshotKVItem.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SnapshotSchemaConverter : ProtobufConverter<SnapshotSchema>

public fun SnapshotSchema.toAny(): Any = Any(SnapshotSchema.TYPE_URL, with(SnapshotSchemaConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SnapshotSchema>): SnapshotSchema {
  if (typeUrl != SnapshotSchema.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

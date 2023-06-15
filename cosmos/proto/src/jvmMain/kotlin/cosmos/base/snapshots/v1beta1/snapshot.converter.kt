// Transform from cosmos/base/snapshots/v1beta1/snapshot.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.snapshots.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object SnapshotConverter : ProtobufConverter<Snapshot> by SnapshotJvmConverter

public actual object MetadataConverter : ProtobufConverter<Metadata> by MetadataJvmConverter

public actual object SnapshotItemConverter : ProtobufConverter<SnapshotItem> by
    SnapshotItemJvmConverter

public actual object SnapshotStoreItemConverter : ProtobufConverter<SnapshotStoreItem> by
    SnapshotStoreItemJvmConverter

public actual object SnapshotIAVLItemConverter : ProtobufConverter<SnapshotIAVLItem> by
    SnapshotIAVLItemJvmConverter

public actual object SnapshotExtensionMetaConverter : ProtobufConverter<SnapshotExtensionMeta> by
    SnapshotExtensionMetaJvmConverter

public actual object SnapshotExtensionPayloadConverter : ProtobufConverter<SnapshotExtensionPayload>
    by SnapshotExtensionPayloadJvmConverter

public actual object SnapshotKVItemConverter : ProtobufConverter<SnapshotKVItem> by
    SnapshotKVItemJvmConverter

public actual object SnapshotSchemaConverter : ProtobufConverter<SnapshotSchema> by
    SnapshotSchemaJvmConverter

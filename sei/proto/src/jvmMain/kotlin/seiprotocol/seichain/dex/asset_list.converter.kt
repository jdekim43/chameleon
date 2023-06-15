// Transform from dex/asset_list.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object AssetIBCInfoConverter : ProtobufConverter<AssetIBCInfo> by
    AssetIBCInfoJvmConverter

public actual object AssetMetadataConverter : ProtobufConverter<AssetMetadata> by
    AssetMetadataJvmConverter

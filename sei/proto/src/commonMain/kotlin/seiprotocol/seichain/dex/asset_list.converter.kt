// Transform from dex/asset_list.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object AssetIBCInfoConverter : ProtobufConverter<AssetIBCInfo>

public fun AssetIBCInfo.toAny(): Any = Any(AssetIBCInfo.TYPE_URL, with(AssetIBCInfoConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AssetIBCInfo>): AssetIBCInfo {
  if (typeUrl != AssetIBCInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object AssetMetadataConverter : ProtobufConverter<AssetMetadata>

public fun AssetMetadata.toAny(): Any = Any(AssetMetadata.TYPE_URL, with(AssetMetadataConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AssetMetadata>): AssetMetadata {
  if (typeUrl != AssetMetadata.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

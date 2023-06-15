// Transform from cosmos/base/store/v1beta1/listening.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.store.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object StoreKVPairConverter : ProtobufConverter<StoreKVPair>

public fun StoreKVPair.toAny(): Any = Any(StoreKVPair.TYPE_URL, with(StoreKVPairConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<StoreKVPair>): StoreKVPair {
  if (typeUrl != StoreKVPair.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BlockMetadataConverter : ProtobufConverter<BlockMetadata> {
  public object DeliverTxConverter : ProtobufConverter<BlockMetadata.DeliverTx>
}

public fun BlockMetadata.toAny(): Any = Any(BlockMetadata.TYPE_URL, with(BlockMetadataConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BlockMetadata>): BlockMetadata {
  if (typeUrl != BlockMetadata.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

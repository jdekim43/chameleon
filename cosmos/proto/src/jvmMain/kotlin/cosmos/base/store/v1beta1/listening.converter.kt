// Transform from cosmos/base/store/v1beta1/listening.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.store.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object StoreKVPairConverter : ProtobufConverter<StoreKVPair> by
    StoreKVPairJvmConverter

public actual object BlockMetadataConverter : ProtobufConverter<BlockMetadata> by
    BlockMetadataJvmConverter {
  public actual object DeliverTxConverter : ProtobufConverter<BlockMetadata.DeliverTx> by
      BlockMetadataJvmConverter.DeliverTxJvmConverter
}

// Transform from cosmos/nft/v1beta1/nft.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.nft.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ClassConverter : ProtobufConverter<Class> by ClassJvmConverter

public actual object NFTConverter : ProtobufConverter<NFT> by NFTJvmConverter

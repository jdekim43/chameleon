// Transform from cosmos/nft/v1beta1/event.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.nft.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object EventSendConverter : ProtobufConverter<EventSend> by EventSendJvmConverter

public actual object EventMintConverter : ProtobufConverter<EventMint> by EventMintJvmConverter

public actual object EventBurnConverter : ProtobufConverter<EventBurn> by EventBurnJvmConverter

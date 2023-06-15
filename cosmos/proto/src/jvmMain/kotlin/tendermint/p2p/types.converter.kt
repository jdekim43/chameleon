// Transform from tendermint/p2p/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.p2p

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object NetAddressConverter : ProtobufConverter<NetAddress> by NetAddressJvmConverter

public actual object ProtocolVersionConverter : ProtobufConverter<ProtocolVersion> by
    ProtocolVersionJvmConverter

public actual object DefaultNodeInfoConverter : ProtobufConverter<DefaultNodeInfo> by
    DefaultNodeInfoJvmConverter

public actual object DefaultNodeInfoOtherConverter : ProtobufConverter<DefaultNodeInfoOther> by
    DefaultNodeInfoOtherJvmConverter

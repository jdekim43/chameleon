// Transform from tendermint/p2p/types.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.p2p

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object NetAddressConverter : ProtobufConverter<NetAddress>

public fun NetAddress.toAny(): Any = Any(NetAddress.TYPE_URL, with(NetAddressConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<NetAddress>): NetAddress {
  if (typeUrl != NetAddress.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ProtocolVersionConverter : ProtobufConverter<ProtocolVersion>

public fun ProtocolVersion.toAny(): Any = Any(ProtocolVersion.TYPE_URL,
    with(ProtocolVersionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ProtocolVersion>): ProtocolVersion {
  if (typeUrl != ProtocolVersion.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DefaultNodeInfoConverter : ProtobufConverter<DefaultNodeInfo>

public fun DefaultNodeInfo.toAny(): Any = Any(DefaultNodeInfo.TYPE_URL,
    with(DefaultNodeInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DefaultNodeInfo>): DefaultNodeInfo {
  if (typeUrl != DefaultNodeInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DefaultNodeInfoOtherConverter : ProtobufConverter<DefaultNodeInfoOther>

public fun DefaultNodeInfoOther.toAny(): Any = Any(DefaultNodeInfoOther.TYPE_URL,
    with(DefaultNodeInfoOtherConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DefaultNodeInfoOther>): DefaultNodeInfoOther {
  if (typeUrl != DefaultNodeInfoOther.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

// Transform from cosmos/nft/v1beta1/event.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.nft.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object EventSendConverter : ProtobufConverter<EventSend>

public fun EventSend.toAny(): Any = Any(EventSend.TYPE_URL, with(EventSendConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<EventSend>): EventSend {
  if (typeUrl != EventSend.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventMintConverter : ProtobufConverter<EventMint>

public fun EventMint.toAny(): Any = Any(EventMint.TYPE_URL, with(EventMintConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<EventMint>): EventMint {
  if (typeUrl != EventMint.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EventBurnConverter : ProtobufConverter<EventBurn>

public fun EventBurn.toAny(): Any = Any(EventBurn.TYPE_URL, with(EventBurnConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<EventBurn>): EventBurn {
  if (typeUrl != EventBurn.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

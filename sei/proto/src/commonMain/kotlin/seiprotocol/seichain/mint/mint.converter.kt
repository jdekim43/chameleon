// Transform from mint/v1beta1/mint.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.mint

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MinterConverter : ProtobufConverter<Minter>

public fun Minter.toAny(): Any = Any(Minter.TYPE_URL, with(MinterConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Minter>): Minter {
  if (typeUrl != Minter.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ScheduledTokenReleaseConverter : ProtobufConverter<ScheduledTokenRelease>

public fun ScheduledTokenRelease.toAny(): Any = Any(ScheduledTokenRelease.TYPE_URL,
    with(ScheduledTokenReleaseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ScheduledTokenRelease>): ScheduledTokenRelease {
  if (typeUrl != ScheduledTokenRelease.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ParamsConverter : ProtobufConverter<Params>

public fun Params.toAny(): Any = Any(Params.TYPE_URL, with(ParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Params>): Params {
  if (typeUrl != Params.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object Version2MinterConverter : ProtobufConverter<Version2Minter>

public fun Version2Minter.toAny(): Any = Any(Version2Minter.TYPE_URL, with(Version2MinterConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Version2Minter>): Version2Minter {
  if (typeUrl != Version2Minter.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object Version2ScheduledTokenReleaseConverter :
    ProtobufConverter<Version2ScheduledTokenRelease>

public fun Version2ScheduledTokenRelease.toAny(): Any = Any(Version2ScheduledTokenRelease.TYPE_URL,
    with(Version2ScheduledTokenReleaseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Version2ScheduledTokenRelease>):
    Version2ScheduledTokenRelease {
  if (typeUrl != Version2ScheduledTokenRelease.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object Version2ParamsConverter : ProtobufConverter<Version2Params>

public fun Version2Params.toAny(): Any = Any(Version2Params.TYPE_URL, with(Version2ParamsConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Version2Params>): Version2Params {
  if (typeUrl != Version2Params.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

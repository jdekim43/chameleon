// Transform from dex/deposit.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object DepositInfoEntryConverter : ProtobufConverter<DepositInfoEntry>

public fun DepositInfoEntry.toAny(): Any = Any(DepositInfoEntry.TYPE_URL,
    with(DepositInfoEntryConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DepositInfoEntry>): DepositInfoEntry {
  if (typeUrl != DepositInfoEntry.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

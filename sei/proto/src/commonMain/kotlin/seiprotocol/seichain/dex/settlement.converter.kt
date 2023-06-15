// Transform from dex/settlement.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object SettlementEntryConverter : ProtobufConverter<SettlementEntry>

public fun SettlementEntry.toAny(): Any = Any(SettlementEntry.TYPE_URL,
    with(SettlementEntryConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SettlementEntry>): SettlementEntry {
  if (typeUrl != SettlementEntry.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SettlementsConverter : ProtobufConverter<Settlements>

public fun Settlements.toAny(): Any = Any(Settlements.TYPE_URL, with(SettlementsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Settlements>): Settlements {
  if (typeUrl != Settlements.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

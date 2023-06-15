// Transform from dex/settlement.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object SettlementEntryConverter : ProtobufConverter<SettlementEntry> by
    SettlementEntryJvmConverter

public actual object SettlementsConverter : ProtobufConverter<Settlements> by
    SettlementsJvmConverter

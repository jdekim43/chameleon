// Transform from dex/pair.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object PairConverter : ProtobufConverter<Pair> by PairJvmConverter

public actual object BatchContractPairConverter : ProtobufConverter<BatchContractPair> by
    BatchContractPairJvmConverter

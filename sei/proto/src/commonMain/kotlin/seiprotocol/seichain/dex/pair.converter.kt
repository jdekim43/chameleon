// Transform from dex/pair.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object PairConverter : ProtobufConverter<Pair>

public fun Pair.toAny(): Any = Any(Pair.TYPE_URL, with(PairConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Pair>): Pair {
  if (typeUrl != Pair.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object BatchContractPairConverter : ProtobufConverter<BatchContractPair>

public fun BatchContractPair.toAny(): Any = Any(BatchContractPair.TYPE_URL,
    with(BatchContractPairConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<BatchContractPair>): BatchContractPair {
  if (typeUrl != BatchContractPair.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

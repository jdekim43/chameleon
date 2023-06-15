// Transform from dex/pair.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object PairJvmConverter : ProtobufTypeMapper<Pair, PairOuterClass.Pair> {
  public override val descriptor: Descriptors.Descriptor = PairOuterClass.Pair.getDescriptor()

  public override val parser: Parser<PairOuterClass.Pair> = PairOuterClass.Pair.parser()

  public override fun convert(obj: PairOuterClass.Pair): Pair = Pair(
  	priceDenom = obj.getPriceDenom(),
  	assetDenom = obj.getAssetDenom(),
  	priceTicksize = obj.getPriceTicksize(),
  	quantityTicksize = obj.getQuantityTicksize(),
  )

  public override fun convert(obj: Pair): PairOuterClass.Pair {
    val builder = PairOuterClass.Pair.newBuilder()
    builder.setPriceDenom(obj.priceDenom)
    builder.setAssetDenom(obj.assetDenom)
    builder.setPriceTicksize(obj.priceTicksize)
    builder.setQuantityTicksize(obj.quantityTicksize)
    return builder.build()
  }
}

public object BatchContractPairJvmConverter :
    ProtobufTypeMapper<BatchContractPair, PairOuterClass.BatchContractPair> {
  public override val descriptor: Descriptors.Descriptor =
      PairOuterClass.BatchContractPair.getDescriptor()

  public override val parser: Parser<PairOuterClass.BatchContractPair> =
      PairOuterClass.BatchContractPair.parser()

  public override fun convert(obj: PairOuterClass.BatchContractPair): BatchContractPair =
      BatchContractPair(
  	contractAddr = obj.getContractAddr(),
  	pairs = obj.getPairsList().map { PairJvmConverter.convert(it) },
  )

  public override fun convert(obj: BatchContractPair): PairOuterClass.BatchContractPair {
    val builder = PairOuterClass.BatchContractPair.newBuilder()
    builder.setContractAddr(obj.contractAddr)
    builder.addAllPairs(obj.pairs.map { PairJvmConverter.convert(it) })
    return builder.build()
  }
}

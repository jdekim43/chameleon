// Transform from cosmos/base/kv/v1beta1/kv.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.kv.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object PairsJvmConverter : ProtobufTypeMapper<Pairs, Kv.Pairs> {
  public override val descriptor: Descriptors.Descriptor = Kv.Pairs.getDescriptor()

  public override val parser: Parser<Kv.Pairs> = Kv.Pairs.parser()

  public override fun convert(obj: Kv.Pairs): Pairs = Pairs(
  	pairs = obj.getPairsList().map { PairJvmConverter.convert(it) },
  )

  public override fun convert(obj: Pairs): Kv.Pairs {
    val builder = Kv.Pairs.newBuilder()
    builder.addAllPairs(obj.pairs.map { PairJvmConverter.convert(it) })
    return builder.build()
  }
}

public object PairJvmConverter : ProtobufTypeMapper<Pair, Kv.Pair> {
  public override val descriptor: Descriptors.Descriptor = Kv.Pair.getDescriptor()

  public override val parser: Parser<Kv.Pair> = Kv.Pair.parser()

  public override fun convert(obj: Kv.Pair): Pair = Pair(
  	key = obj.getKey().toByteArray(),
  	`value` = obj.getValue().toByteArray(),
  )

  public override fun convert(obj: Pair): Kv.Pair {
    val builder = Kv.Pair.newBuilder()
    builder.setKey(ByteString.copyFrom(obj.key))
    builder.setValue(ByteString.copyFrom(obj.`value`))
    return builder.build()
  }
}

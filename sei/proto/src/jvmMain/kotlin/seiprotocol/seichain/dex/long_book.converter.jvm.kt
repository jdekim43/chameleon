// Transform from dex/long_book.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object LongBookJvmConverter : ProtobufTypeMapper<LongBook, LongBookOuterClass.LongBook> {
  public override val descriptor: Descriptors.Descriptor =
      LongBookOuterClass.LongBook.getDescriptor()

  public override val parser: Parser<LongBookOuterClass.LongBook> =
      LongBookOuterClass.LongBook.parser()

  public override fun convert(obj: LongBookOuterClass.LongBook): LongBook = LongBook(
  	price = obj.getPrice(),
  	entry = OrderEntryJvmConverter.convert(obj.getEntry()),
  )

  public override fun convert(obj: LongBook): LongBookOuterClass.LongBook {
    val builder = LongBookOuterClass.LongBook.newBuilder()
    builder.setPrice(obj.price)
    builder.setEntry(OrderEntryJvmConverter.convert(obj.entry))
    return builder.build()
  }
}

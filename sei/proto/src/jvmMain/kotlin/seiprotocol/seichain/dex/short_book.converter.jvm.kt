// Transform from dex/short_book.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ShortBookJvmConverter : ProtobufTypeMapper<ShortBook, ShortBookOuterClass.ShortBook> {
  public override val descriptor: Descriptors.Descriptor =
      ShortBookOuterClass.ShortBook.getDescriptor()

  public override val parser: Parser<ShortBookOuterClass.ShortBook> =
      ShortBookOuterClass.ShortBook.parser()

  public override fun convert(obj: ShortBookOuterClass.ShortBook): ShortBook = ShortBook(
  	price = obj.getPrice(),
  	entry = OrderEntryJvmConverter.convert(obj.getEntry()),
  )

  public override fun convert(obj: ShortBook): ShortBookOuterClass.ShortBook {
    val builder = ShortBookOuterClass.ShortBook.newBuilder()
    builder.setPrice(obj.price)
    builder.setEntry(OrderEntryJvmConverter.convert(obj.entry))
    return builder.build()
  }
}

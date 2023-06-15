// Transform from dex/short_book.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object ShortBookConverter : ProtobufConverter<ShortBook>

public fun ShortBook.toAny(): Any = Any(ShortBook.TYPE_URL, with(ShortBookConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<ShortBook>): ShortBook {
  if (typeUrl != ShortBook.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

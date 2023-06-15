// Transform from google/api/http.proto
@file:GeneratorVersion(version = "0.3.1")

package google.api

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object HttpConverter : ProtobufConverter<Http>

public fun Http.toAny(): Any = Any(Http.TYPE_URL, with(HttpConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Http>): Http {
  if (typeUrl != Http.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object HttpRuleConverter : ProtobufConverter<HttpRule>

public fun HttpRule.toAny(): Any = Any(HttpRule.TYPE_URL, with(HttpRuleConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<HttpRule>): HttpRule {
  if (typeUrl != HttpRule.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CustomHttpPatternConverter : ProtobufConverter<CustomHttpPattern>

public fun CustomHttpPattern.toAny(): Any = Any(CustomHttpPattern.TYPE_URL,
    with(CustomHttpPatternConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CustomHttpPattern>): CustomHttpPattern {
  if (typeUrl != CustomHttpPattern.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

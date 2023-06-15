// Transform from google/api/http.proto
@file:GeneratorVersion(version = "0.3.1")

package google.api

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object HttpConverter : ProtobufConverter<Http> by HttpJvmConverter

public actual object HttpRuleConverter : ProtobufConverter<HttpRule> by HttpRuleJvmConverter

public actual object CustomHttpPatternConverter : ProtobufConverter<CustomHttpPattern> by
    CustomHttpPatternJvmConverter

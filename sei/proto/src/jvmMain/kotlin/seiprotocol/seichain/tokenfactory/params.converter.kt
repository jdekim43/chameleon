// Transform from tokenfactory/params.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.tokenfactory

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter

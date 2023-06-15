// Transform from cosmos/crypto/hd/v1/hd.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crypto.hd.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object BIP44ParamsConverter : ProtobufConverter<BIP44Params> by
    BIP44ParamsJvmConverter

// Transform from tendermint/crypto/keys.proto
@file:GeneratorVersion(version = "0.3.1")

package tendermint.crypto

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object PublicKeyConverter : ProtobufConverter<PublicKey> by PublicKeyJvmConverter

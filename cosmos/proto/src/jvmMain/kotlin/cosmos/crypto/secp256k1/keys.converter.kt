// Transform from cosmos/crypto/secp256k1/keys.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crypto.secp256k1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object PubKeyConverter : ProtobufConverter<PubKey> by PubKeyJvmConverter

public actual object PrivKeyConverter : ProtobufConverter<PrivKey> by PrivKeyJvmConverter

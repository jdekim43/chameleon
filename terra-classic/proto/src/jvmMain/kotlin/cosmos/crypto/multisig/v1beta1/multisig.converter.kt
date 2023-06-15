// Transform from cosmos/crypto/multisig/v1beta1/multisig.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crypto.multisig.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object MultiSignatureConverter : ProtobufConverter<MultiSignature> by
    MultiSignatureJvmConverter

public actual object CompactBitArrayConverter : ProtobufConverter<CompactBitArray> by
    CompactBitArrayJvmConverter

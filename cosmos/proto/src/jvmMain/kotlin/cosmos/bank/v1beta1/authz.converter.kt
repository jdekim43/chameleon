// Transform from cosmos/bank/v1beta1/authz.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object SendAuthorizationConverter : ProtobufConverter<SendAuthorization> by
    SendAuthorizationJvmConverter

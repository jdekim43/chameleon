// Transform from cosmos/feegrant/v1beta1/feegrant.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.feegrant.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object BasicAllowanceConverter : ProtobufConverter<BasicAllowance> by
    BasicAllowanceJvmConverter

public actual object PeriodicAllowanceConverter : ProtobufConverter<PeriodicAllowance> by
    PeriodicAllowanceJvmConverter

public actual object AllowedMsgAllowanceConverter : ProtobufConverter<AllowedMsgAllowance> by
    AllowedMsgAllowanceJvmConverter

public actual object GrantConverter : ProtobufConverter<Grant> by GrantJvmConverter

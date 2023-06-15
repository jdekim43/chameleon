// Transform from cosmos/staking/v1beta1/authz.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object StakeAuthorizationConverter : ProtobufConverter<StakeAuthorization> by
    StakeAuthorizationJvmConverter {
  public actual object ValidatorsConverter : ProtobufConverter<StakeAuthorization.Validators> by
      StakeAuthorizationJvmConverter.ValidatorsJvmConverter
}

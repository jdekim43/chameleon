// Transform from cosmos/staking/v1beta1/staking.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object HistoricalInfoConverter : ProtobufConverter<HistoricalInfo> by
    HistoricalInfoJvmConverter

public actual object CommissionRatesConverter : ProtobufConverter<CommissionRates> by
    CommissionRatesJvmConverter

public actual object CommissionConverter : ProtobufConverter<Commission> by CommissionJvmConverter

public actual object DescriptionConverter : ProtobufConverter<Description> by
    DescriptionJvmConverter

public actual object ValidatorConverter : ProtobufConverter<Validator> by ValidatorJvmConverter

public actual object ValAddressesConverter : ProtobufConverter<ValAddresses> by
    ValAddressesJvmConverter

public actual object DVPairConverter : ProtobufConverter<DVPair> by DVPairJvmConverter

public actual object DVPairsConverter : ProtobufConverter<DVPairs> by DVPairsJvmConverter

public actual object DVVTripletConverter : ProtobufConverter<DVVTriplet> by DVVTripletJvmConverter

public actual object DVVTripletsConverter : ProtobufConverter<DVVTriplets> by
    DVVTripletsJvmConverter

public actual object DelegationConverter : ProtobufConverter<Delegation> by DelegationJvmConverter

public actual object UnbondingDelegationConverter : ProtobufConverter<UnbondingDelegation> by
    UnbondingDelegationJvmConverter

public actual object UnbondingDelegationEntryConverter : ProtobufConverter<UnbondingDelegationEntry>
    by UnbondingDelegationEntryJvmConverter

public actual object RedelegationEntryConverter : ProtobufConverter<RedelegationEntry> by
    RedelegationEntryJvmConverter

public actual object RedelegationConverter : ProtobufConverter<Redelegation> by
    RedelegationJvmConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter

public actual object DelegationResponseConverter : ProtobufConverter<DelegationResponse> by
    DelegationResponseJvmConverter

public actual object RedelegationEntryResponseConverter :
    ProtobufConverter<RedelegationEntryResponse> by RedelegationEntryResponseJvmConverter

public actual object RedelegationResponseConverter : ProtobufConverter<RedelegationResponse> by
    RedelegationResponseJvmConverter

public actual object PoolConverter : ProtobufConverter<Pool> by PoolJvmConverter

public actual object ValidatorUpdatesConverter : ProtobufConverter<ValidatorUpdates> by
    ValidatorUpdatesJvmConverter

// Transform from cosmos/staking/v1beta1/staking.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object HistoricalInfoConverter : ProtobufConverter<HistoricalInfo>

public fun HistoricalInfo.toAny(): Any = Any(HistoricalInfo.TYPE_URL, with(HistoricalInfoConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<HistoricalInfo>): HistoricalInfo {
  if (typeUrl != HistoricalInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CommissionRatesConverter : ProtobufConverter<CommissionRates>

public fun CommissionRates.toAny(): Any = Any(CommissionRates.TYPE_URL,
    with(CommissionRatesConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<CommissionRates>): CommissionRates {
  if (typeUrl != CommissionRates.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object CommissionConverter : ProtobufConverter<Commission>

public fun Commission.toAny(): Any = Any(Commission.TYPE_URL, with(CommissionConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Commission>): Commission {
  if (typeUrl != Commission.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DescriptionConverter : ProtobufConverter<Description>

public fun Description.toAny(): Any = Any(Description.TYPE_URL, with(DescriptionConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Description>): Description {
  if (typeUrl != Description.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorConverter : ProtobufConverter<Validator>

public fun Validator.toAny(): Any = Any(Validator.TYPE_URL, with(ValidatorConverter) { toByteArray()
    })

public fun Any.parse(converter: ProtobufConverter<Validator>): Validator {
  if (typeUrl != Validator.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValAddressesConverter : ProtobufConverter<ValAddresses>

public fun ValAddresses.toAny(): Any = Any(ValAddresses.TYPE_URL, with(ValAddressesConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValAddresses>): ValAddresses {
  if (typeUrl != ValAddresses.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DVPairConverter : ProtobufConverter<DVPair>

public fun DVPair.toAny(): Any = Any(DVPair.TYPE_URL, with(DVPairConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DVPair>): DVPair {
  if (typeUrl != DVPair.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DVPairsConverter : ProtobufConverter<DVPairs>

public fun DVPairs.toAny(): Any = Any(DVPairs.TYPE_URL, with(DVPairsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DVPairs>): DVPairs {
  if (typeUrl != DVPairs.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DVVTripletConverter : ProtobufConverter<DVVTriplet>

public fun DVVTriplet.toAny(): Any = Any(DVVTriplet.TYPE_URL, with(DVVTripletConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DVVTriplet>): DVVTriplet {
  if (typeUrl != DVVTriplet.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DVVTripletsConverter : ProtobufConverter<DVVTriplets>

public fun DVVTriplets.toAny(): Any = Any(DVVTriplets.TYPE_URL, with(DVVTripletsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DVVTriplets>): DVVTriplets {
  if (typeUrl != DVVTriplets.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DelegationConverter : ProtobufConverter<Delegation>

public fun Delegation.toAny(): Any = Any(Delegation.TYPE_URL, with(DelegationConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Delegation>): Delegation {
  if (typeUrl != Delegation.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object UnbondingDelegationConverter : ProtobufConverter<UnbondingDelegation>

public fun UnbondingDelegation.toAny(): Any = Any(UnbondingDelegation.TYPE_URL,
    with(UnbondingDelegationConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<UnbondingDelegation>): UnbondingDelegation {
  if (typeUrl != UnbondingDelegation.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object UnbondingDelegationEntryConverter : ProtobufConverter<UnbondingDelegationEntry>

public fun UnbondingDelegationEntry.toAny(): Any = Any(UnbondingDelegationEntry.TYPE_URL,
    with(UnbondingDelegationEntryConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<UnbondingDelegationEntry>):
    UnbondingDelegationEntry {
  if (typeUrl != UnbondingDelegationEntry.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RedelegationEntryConverter : ProtobufConverter<RedelegationEntry>

public fun RedelegationEntry.toAny(): Any = Any(RedelegationEntry.TYPE_URL,
    with(RedelegationEntryConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RedelegationEntry>): RedelegationEntry {
  if (typeUrl != RedelegationEntry.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RedelegationConverter : ProtobufConverter<Redelegation>

public fun Redelegation.toAny(): Any = Any(Redelegation.TYPE_URL, with(RedelegationConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Redelegation>): Redelegation {
  if (typeUrl != Redelegation.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ParamsConverter : ProtobufConverter<Params>

public fun Params.toAny(): Any = Any(Params.TYPE_URL, with(ParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Params>): Params {
  if (typeUrl != Params.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DelegationResponseConverter : ProtobufConverter<DelegationResponse>

public fun DelegationResponse.toAny(): Any = Any(DelegationResponse.TYPE_URL,
    with(DelegationResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DelegationResponse>): DelegationResponse {
  if (typeUrl != DelegationResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RedelegationEntryResponseConverter :
    ProtobufConverter<RedelegationEntryResponse>

public fun RedelegationEntryResponse.toAny(): Any = Any(RedelegationEntryResponse.TYPE_URL,
    with(RedelegationEntryResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RedelegationEntryResponse>):
    RedelegationEntryResponse {
  if (typeUrl != RedelegationEntryResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RedelegationResponseConverter : ProtobufConverter<RedelegationResponse>

public fun RedelegationResponse.toAny(): Any = Any(RedelegationResponse.TYPE_URL,
    with(RedelegationResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RedelegationResponse>): RedelegationResponse {
  if (typeUrl != RedelegationResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object PoolConverter : ProtobufConverter<Pool>

public fun Pool.toAny(): Any = Any(Pool.TYPE_URL, with(PoolConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Pool>): Pool {
  if (typeUrl != Pool.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorUpdatesConverter : ProtobufConverter<ValidatorUpdates>

public fun ValidatorUpdates.toAny(): Any = Any(ValidatorUpdates.TYPE_URL,
    with(ValidatorUpdatesConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorUpdates>): ValidatorUpdates {
  if (typeUrl != ValidatorUpdates.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

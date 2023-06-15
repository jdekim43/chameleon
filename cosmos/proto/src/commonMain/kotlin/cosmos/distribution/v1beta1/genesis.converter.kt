// Transform from cosmos/distribution/v1beta1/genesis.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object DelegatorWithdrawInfoConverter : ProtobufConverter<DelegatorWithdrawInfo>

public fun DelegatorWithdrawInfo.toAny(): Any = Any(DelegatorWithdrawInfo.TYPE_URL,
    with(DelegatorWithdrawInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DelegatorWithdrawInfo>): DelegatorWithdrawInfo {
  if (typeUrl != DelegatorWithdrawInfo.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorOutstandingRewardsRecordConverter :
    ProtobufConverter<ValidatorOutstandingRewardsRecord>

public fun ValidatorOutstandingRewardsRecord.toAny(): Any =
    Any(ValidatorOutstandingRewardsRecord.TYPE_URL, with(ValidatorOutstandingRewardsRecordConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorOutstandingRewardsRecord>):
    ValidatorOutstandingRewardsRecord {
  if (typeUrl != ValidatorOutstandingRewardsRecord.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorAccumulatedCommissionRecordConverter :
    ProtobufConverter<ValidatorAccumulatedCommissionRecord>

public fun ValidatorAccumulatedCommissionRecord.toAny(): Any =
    Any(ValidatorAccumulatedCommissionRecord.TYPE_URL,
    with(ValidatorAccumulatedCommissionRecordConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorAccumulatedCommissionRecord>):
    ValidatorAccumulatedCommissionRecord {
  if (typeUrl != ValidatorAccumulatedCommissionRecord.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorHistoricalRewardsRecordConverter :
    ProtobufConverter<ValidatorHistoricalRewardsRecord>

public fun ValidatorHistoricalRewardsRecord.toAny(): Any =
    Any(ValidatorHistoricalRewardsRecord.TYPE_URL, with(ValidatorHistoricalRewardsRecordConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorHistoricalRewardsRecord>):
    ValidatorHistoricalRewardsRecord {
  if (typeUrl != ValidatorHistoricalRewardsRecord.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorCurrentRewardsRecordConverter :
    ProtobufConverter<ValidatorCurrentRewardsRecord>

public fun ValidatorCurrentRewardsRecord.toAny(): Any = Any(ValidatorCurrentRewardsRecord.TYPE_URL,
    with(ValidatorCurrentRewardsRecordConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorCurrentRewardsRecord>):
    ValidatorCurrentRewardsRecord {
  if (typeUrl != ValidatorCurrentRewardsRecord.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DelegatorStartingInfoRecordConverter :
    ProtobufConverter<DelegatorStartingInfoRecord>

public fun DelegatorStartingInfoRecord.toAny(): Any = Any(DelegatorStartingInfoRecord.TYPE_URL,
    with(DelegatorStartingInfoRecordConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DelegatorStartingInfoRecord>):
    DelegatorStartingInfoRecord {
  if (typeUrl != DelegatorStartingInfoRecord.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ValidatorSlashEventRecordConverter :
    ProtobufConverter<ValidatorSlashEventRecord>

public fun ValidatorSlashEventRecord.toAny(): Any = Any(ValidatorSlashEventRecord.TYPE_URL,
    with(ValidatorSlashEventRecordConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ValidatorSlashEventRecord>):
    ValidatorSlashEventRecord {
  if (typeUrl != ValidatorSlashEventRecord.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GenesisStateConverter : ProtobufConverter<GenesisState>

public fun GenesisState.toAny(): Any = Any(GenesisState.TYPE_URL, with(GenesisStateConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GenesisState>): GenesisState {
  if (typeUrl != GenesisState.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

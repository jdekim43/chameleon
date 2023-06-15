// Transform from oracle/oracle.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.oracle

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter

public actual object DenomConverter : ProtobufConverter<Denom> by DenomJvmConverter

public actual object AggregateExchangeRateVoteConverter :
    ProtobufConverter<AggregateExchangeRateVote> by AggregateExchangeRateVoteJvmConverter

public actual object ExchangeRateTupleConverter : ProtobufConverter<ExchangeRateTuple> by
    ExchangeRateTupleJvmConverter

public actual object OracleExchangeRateConverter : ProtobufConverter<OracleExchangeRate> by
    OracleExchangeRateJvmConverter

public actual object PriceSnapshotItemConverter : ProtobufConverter<PriceSnapshotItem> by
    PriceSnapshotItemJvmConverter

public actual object PriceSnapshotConverter : ProtobufConverter<PriceSnapshot> by
    PriceSnapshotJvmConverter

public actual object OracleTwapConverter : ProtobufConverter<OracleTwap> by OracleTwapJvmConverter

public actual object VotePenaltyCounterConverter : ProtobufConverter<VotePenaltyCounter> by
    VotePenaltyCounterJvmConverter

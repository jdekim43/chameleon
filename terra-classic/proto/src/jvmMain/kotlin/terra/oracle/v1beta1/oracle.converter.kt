// Transform from terra/oracle/v1beta1/oracle.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.oracle.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter

public actual object DenomConverter : ProtobufConverter<Denom> by DenomJvmConverter

public actual object AggregateExchangeRatePrevoteConverter :
    ProtobufConverter<AggregateExchangeRatePrevote> by AggregateExchangeRatePrevoteJvmConverter

public actual object AggregateExchangeRateVoteConverter :
    ProtobufConverter<AggregateExchangeRateVote> by AggregateExchangeRateVoteJvmConverter

public actual object ExchangeRateTupleConverter : ProtobufConverter<ExchangeRateTuple> by
    ExchangeRateTupleJvmConverter

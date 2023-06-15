// Transform from cosmos/gov/v1/gov.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.gov.v1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object WeightedVoteOptionConverter : ProtobufConverter<WeightedVoteOption> by
    WeightedVoteOptionJvmConverter

public actual object DepositConverter : ProtobufConverter<Deposit> by DepositJvmConverter

public actual object ProposalConverter : ProtobufConverter<Proposal> by ProposalJvmConverter

public actual object TallyResultConverter : ProtobufConverter<TallyResult> by
    TallyResultJvmConverter

public actual object VoteConverter : ProtobufConverter<Vote> by VoteJvmConverter

public actual object DepositParamsConverter : ProtobufConverter<DepositParams> by
    DepositParamsJvmConverter

public actual object VotingParamsConverter : ProtobufConverter<VotingParams> by
    VotingParamsJvmConverter

public actual object TallyParamsConverter : ProtobufConverter<TallyParams> by
    TallyParamsJvmConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter

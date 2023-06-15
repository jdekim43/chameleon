// Transform from cosmos/gov/v1/gov.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.gov.v1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object WeightedVoteOptionConverter : ProtobufConverter<WeightedVoteOption>

public fun WeightedVoteOption.toAny(): Any = Any(WeightedVoteOption.TYPE_URL,
    with(WeightedVoteOptionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<WeightedVoteOption>): WeightedVoteOption {
  if (typeUrl != WeightedVoteOption.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DepositConverter : ProtobufConverter<Deposit>

public fun Deposit.toAny(): Any = Any(Deposit.TYPE_URL, with(DepositConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Deposit>): Deposit {
  if (typeUrl != Deposit.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ProposalConverter : ProtobufConverter<Proposal>

public fun Proposal.toAny(): Any = Any(Proposal.TYPE_URL, with(ProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Proposal>): Proposal {
  if (typeUrl != Proposal.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TallyResultConverter : ProtobufConverter<TallyResult>

public fun TallyResult.toAny(): Any = Any(TallyResult.TYPE_URL, with(TallyResultConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TallyResult>): TallyResult {
  if (typeUrl != TallyResult.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object VoteConverter : ProtobufConverter<Vote>

public fun Vote.toAny(): Any = Any(Vote.TYPE_URL, with(VoteConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Vote>): Vote {
  if (typeUrl != Vote.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DepositParamsConverter : ProtobufConverter<DepositParams>

public fun DepositParams.toAny(): Any = Any(DepositParams.TYPE_URL, with(DepositParamsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DepositParams>): DepositParams {
  if (typeUrl != DepositParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object VotingParamsConverter : ProtobufConverter<VotingParams>

public fun VotingParams.toAny(): Any = Any(VotingParams.TYPE_URL, with(VotingParamsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<VotingParams>): VotingParams {
  if (typeUrl != VotingParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object TallyParamsConverter : ProtobufConverter<TallyParams>

public fun TallyParams.toAny(): Any = Any(TallyParams.TYPE_URL, with(TallyParamsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<TallyParams>): TallyParams {
  if (typeUrl != TallyParams.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ParamsConverter : ProtobufConverter<Params>

public fun Params.toAny(): Any = Any(Params.TYPE_URL, with(ParamsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<Params>): Params {
  if (typeUrl != Params.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

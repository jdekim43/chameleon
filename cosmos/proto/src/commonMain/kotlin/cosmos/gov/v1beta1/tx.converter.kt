// Transform from cosmos/gov/v1beta1/tx.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.gov.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object MsgSubmitProposalConverter : ProtobufConverter<MsgSubmitProposal>

public fun MsgSubmitProposal.toAny(): Any = Any(MsgSubmitProposal.TYPE_URL,
    with(MsgSubmitProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSubmitProposal>): MsgSubmitProposal {
  if (typeUrl != MsgSubmitProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgSubmitProposalResponseConverter :
    ProtobufConverter<MsgSubmitProposalResponse>

public fun MsgSubmitProposalResponse.toAny(): Any = Any(MsgSubmitProposalResponse.TYPE_URL,
    with(MsgSubmitProposalResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgSubmitProposalResponse>):
    MsgSubmitProposalResponse {
  if (typeUrl != MsgSubmitProposalResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgVoteConverter : ProtobufConverter<MsgVote>

public fun MsgVote.toAny(): Any = Any(MsgVote.TYPE_URL, with(MsgVoteConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgVote>): MsgVote {
  if (typeUrl != MsgVote.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgVoteResponseConverter : ProtobufConverter<MsgVoteResponse>

public fun MsgVoteResponse.toAny(): Any = Any(MsgVoteResponse.TYPE_URL,
    with(MsgVoteResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgVoteResponse>): MsgVoteResponse {
  if (typeUrl != MsgVoteResponse.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgVoteWeightedConverter : ProtobufConverter<MsgVoteWeighted>

public fun MsgVoteWeighted.toAny(): Any = Any(MsgVoteWeighted.TYPE_URL,
    with(MsgVoteWeightedConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgVoteWeighted>): MsgVoteWeighted {
  if (typeUrl != MsgVoteWeighted.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgVoteWeightedResponseConverter : ProtobufConverter<MsgVoteWeightedResponse>

public fun MsgVoteWeightedResponse.toAny(): Any = Any(MsgVoteWeightedResponse.TYPE_URL,
    with(MsgVoteWeightedResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgVoteWeightedResponse>):
    MsgVoteWeightedResponse {
  if (typeUrl != MsgVoteWeightedResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgDepositConverter : ProtobufConverter<MsgDeposit>

public fun MsgDeposit.toAny(): Any = Any(MsgDeposit.TYPE_URL, with(MsgDepositConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgDeposit>): MsgDeposit {
  if (typeUrl != MsgDeposit.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MsgDepositResponseConverter : ProtobufConverter<MsgDepositResponse>

public fun MsgDepositResponse.toAny(): Any = Any(MsgDepositResponse.TYPE_URL,
    with(MsgDepositResponseConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MsgDepositResponse>): MsgDepositResponse {
  if (typeUrl != MsgDepositResponse.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

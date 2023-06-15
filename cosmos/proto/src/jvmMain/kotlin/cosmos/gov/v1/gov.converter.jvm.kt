// Transform from cosmos/gov/v1/gov.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.gov.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import google.protobuf.AnyJvmConverter
import google.protobuf.DurationJvmConverter
import google.protobuf.TimestampJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object WeightedVoteOptionJvmConverter :
    ProtobufTypeMapper<WeightedVoteOption, Gov.WeightedVoteOption> {
  public override val descriptor: Descriptors.Descriptor = Gov.WeightedVoteOption.getDescriptor()

  public override val parser: Parser<Gov.WeightedVoteOption> = Gov.WeightedVoteOption.parser()

  public override fun convert(obj: Gov.WeightedVoteOption): WeightedVoteOption = WeightedVoteOption(
  	option = VoteOption.forNumber(obj.getOption().number),
  	weight = obj.getWeight(),
  )

  public override fun convert(obj: WeightedVoteOption): Gov.WeightedVoteOption {
    val builder = Gov.WeightedVoteOption.newBuilder()
    builder.setOption(Gov.VoteOption.forNumber(obj.option.number))
    builder.setWeight(obj.weight)
    return builder.build()
  }
}

public object DepositJvmConverter : ProtobufTypeMapper<Deposit, Gov.Deposit> {
  public override val descriptor: Descriptors.Descriptor = Gov.Deposit.getDescriptor()

  public override val parser: Parser<Gov.Deposit> = Gov.Deposit.parser()

  public override fun convert(obj: Gov.Deposit): Deposit = Deposit(
  	proposalId = obj.getProposalId().asKotlinType,
  	depositor = obj.getDepositor(),
  	amount = obj.getAmountList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: Deposit): Gov.Deposit {
    val builder = Gov.Deposit.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setDepositor(obj.depositor)
    builder.addAllAmount(obj.amount.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

public object ProposalJvmConverter : ProtobufTypeMapper<Proposal, Gov.Proposal> {
  public override val descriptor: Descriptors.Descriptor = Gov.Proposal.getDescriptor()

  public override val parser: Parser<Gov.Proposal> = Gov.Proposal.parser()

  public override fun convert(obj: Gov.Proposal): Proposal = Proposal(
  	id = obj.getId().asKotlinType,
  	messages = obj.getMessagesList().map { AnyJvmConverter.convert(it) },
  	status = ProposalStatus.forNumber(obj.getStatus().number),
  	finalTallyResult = TallyResultJvmConverter.convert(obj.getFinalTallyResult()),
  	submitTime = TimestampJvmConverter.convert(obj.getSubmitTime()),
  	depositEndTime = TimestampJvmConverter.convert(obj.getDepositEndTime()),
  	totalDeposit = obj.getTotalDepositList().map { CoinJvmConverter.convert(it) },
  	votingStartTime = TimestampJvmConverter.convert(obj.getVotingStartTime()),
  	votingEndTime = TimestampJvmConverter.convert(obj.getVotingEndTime()),
  	metadata = obj.getMetadata(),
  	title = obj.getTitle(),
  	summary = obj.getSummary(),
  	proposer = obj.getProposer(),
  )

  public override fun convert(obj: Proposal): Gov.Proposal {
    val builder = Gov.Proposal.newBuilder()
    builder.setId(obj.id.asJavaType)
    builder.addAllMessages(obj.messages.map { AnyJvmConverter.convert(it) })
    builder.setStatus(Gov.ProposalStatus.forNumber(obj.status.number))
    builder.setFinalTallyResult(TallyResultJvmConverter.convert(obj.finalTallyResult))
    builder.setSubmitTime(TimestampJvmConverter.convert(obj.submitTime))
    builder.setDepositEndTime(TimestampJvmConverter.convert(obj.depositEndTime))
    builder.addAllTotalDeposit(obj.totalDeposit.map { CoinJvmConverter.convert(it) })
    builder.setVotingStartTime(TimestampJvmConverter.convert(obj.votingStartTime))
    builder.setVotingEndTime(TimestampJvmConverter.convert(obj.votingEndTime))
    builder.setMetadata(obj.metadata)
    builder.setTitle(obj.title)
    builder.setSummary(obj.summary)
    builder.setProposer(obj.proposer)
    return builder.build()
  }
}

public object TallyResultJvmConverter : ProtobufTypeMapper<TallyResult, Gov.TallyResult> {
  public override val descriptor: Descriptors.Descriptor = Gov.TallyResult.getDescriptor()

  public override val parser: Parser<Gov.TallyResult> = Gov.TallyResult.parser()

  public override fun convert(obj: Gov.TallyResult): TallyResult = TallyResult(
  	yesCount = obj.getYesCount(),
  	abstainCount = obj.getAbstainCount(),
  	noCount = obj.getNoCount(),
  	noWithVetoCount = obj.getNoWithVetoCount(),
  )

  public override fun convert(obj: TallyResult): Gov.TallyResult {
    val builder = Gov.TallyResult.newBuilder()
    builder.setYesCount(obj.yesCount)
    builder.setAbstainCount(obj.abstainCount)
    builder.setNoCount(obj.noCount)
    builder.setNoWithVetoCount(obj.noWithVetoCount)
    return builder.build()
  }
}

public object VoteJvmConverter : ProtobufTypeMapper<Vote, Gov.Vote> {
  public override val descriptor: Descriptors.Descriptor = Gov.Vote.getDescriptor()

  public override val parser: Parser<Gov.Vote> = Gov.Vote.parser()

  public override fun convert(obj: Gov.Vote): Vote = Vote(
  	proposalId = obj.getProposalId().asKotlinType,
  	voter = obj.getVoter(),
  	options = obj.getOptionsList().map { WeightedVoteOptionJvmConverter.convert(it) },
  	metadata = obj.getMetadata(),
  )

  public override fun convert(obj: Vote): Gov.Vote {
    val builder = Gov.Vote.newBuilder()
    builder.setProposalId(obj.proposalId.asJavaType)
    builder.setVoter(obj.voter)
    builder.addAllOptions(obj.options.map { WeightedVoteOptionJvmConverter.convert(it) })
    builder.setMetadata(obj.metadata)
    return builder.build()
  }
}

public object DepositParamsJvmConverter : ProtobufTypeMapper<DepositParams, Gov.DepositParams> {
  public override val descriptor: Descriptors.Descriptor = Gov.DepositParams.getDescriptor()

  public override val parser: Parser<Gov.DepositParams> = Gov.DepositParams.parser()

  public override fun convert(obj: Gov.DepositParams): DepositParams = DepositParams(
  	minDeposit = obj.getMinDepositList().map { CoinJvmConverter.convert(it) },
  	maxDepositPeriod = DurationJvmConverter.convert(obj.getMaxDepositPeriod()),
  )

  public override fun convert(obj: DepositParams): Gov.DepositParams {
    val builder = Gov.DepositParams.newBuilder()
    builder.addAllMinDeposit(obj.minDeposit.map { CoinJvmConverter.convert(it) })
    builder.setMaxDepositPeriod(DurationJvmConverter.convert(obj.maxDepositPeriod))
    return builder.build()
  }
}

public object VotingParamsJvmConverter : ProtobufTypeMapper<VotingParams, Gov.VotingParams> {
  public override val descriptor: Descriptors.Descriptor = Gov.VotingParams.getDescriptor()

  public override val parser: Parser<Gov.VotingParams> = Gov.VotingParams.parser()

  public override fun convert(obj: Gov.VotingParams): VotingParams = VotingParams(
  	votingPeriod = DurationJvmConverter.convert(obj.getVotingPeriod()),
  )

  public override fun convert(obj: VotingParams): Gov.VotingParams {
    val builder = Gov.VotingParams.newBuilder()
    builder.setVotingPeriod(DurationJvmConverter.convert(obj.votingPeriod))
    return builder.build()
  }
}

public object TallyParamsJvmConverter : ProtobufTypeMapper<TallyParams, Gov.TallyParams> {
  public override val descriptor: Descriptors.Descriptor = Gov.TallyParams.getDescriptor()

  public override val parser: Parser<Gov.TallyParams> = Gov.TallyParams.parser()

  public override fun convert(obj: Gov.TallyParams): TallyParams = TallyParams(
  	quorum = obj.getQuorum(),
  	threshold = obj.getThreshold(),
  	vetoThreshold = obj.getVetoThreshold(),
  )

  public override fun convert(obj: TallyParams): Gov.TallyParams {
    val builder = Gov.TallyParams.newBuilder()
    builder.setQuorum(obj.quorum)
    builder.setThreshold(obj.threshold)
    builder.setVetoThreshold(obj.vetoThreshold)
    return builder.build()
  }
}

public object ParamsJvmConverter : ProtobufTypeMapper<Params, Gov.Params> {
  public override val descriptor: Descriptors.Descriptor = Gov.Params.getDescriptor()

  public override val parser: Parser<Gov.Params> = Gov.Params.parser()

  public override fun convert(obj: Gov.Params): Params = Params(
  	minDeposit = obj.getMinDepositList().map { CoinJvmConverter.convert(it) },
  	maxDepositPeriod = DurationJvmConverter.convert(obj.getMaxDepositPeriod()),
  	votingPeriod = DurationJvmConverter.convert(obj.getVotingPeriod()),
  	quorum = obj.getQuorum(),
  	threshold = obj.getThreshold(),
  	vetoThreshold = obj.getVetoThreshold(),
  	minInitialDepositRatio = obj.getMinInitialDepositRatio(),
  	burnVoteQuorum = obj.getBurnVoteQuorum(),
  	burnProposalDepositPrevote = obj.getBurnProposalDepositPrevote(),
  	burnVoteVeto = obj.getBurnVoteVeto(),
  )

  public override fun convert(obj: Params): Gov.Params {
    val builder = Gov.Params.newBuilder()
    builder.addAllMinDeposit(obj.minDeposit.map { CoinJvmConverter.convert(it) })
    builder.setMaxDepositPeriod(DurationJvmConverter.convert(obj.maxDepositPeriod))
    builder.setVotingPeriod(DurationJvmConverter.convert(obj.votingPeriod))
    builder.setQuorum(obj.quorum)
    builder.setThreshold(obj.threshold)
    builder.setVetoThreshold(obj.vetoThreshold)
    builder.setMinInitialDepositRatio(obj.minInitialDepositRatio)
    builder.setBurnVoteQuorum(obj.burnVoteQuorum)
    builder.setBurnProposalDepositPrevote(obj.burnProposalDepositPrevote)
    builder.setBurnVoteVeto(obj.burnVoteVeto)
    return builder.build()
  }
}

// Transform from cosmos/gov/v1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.gov.v1

import io.grpc.CallOptions
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ServerCalls
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.grpc.ClientOption

public object QueryJvm {
  private val descriptor: ServiceDescriptor = QueryGrpc.getServiceDescriptor()!!

  private val proposalDescriptor:
      MethodDescriptor<QueryOuterClass.QueryProposalRequest, QueryOuterClass.QueryProposalResponse>
      = QueryGrpc.getProposalMethod()!!

  private val proposalsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryProposalsRequest, QueryOuterClass.QueryProposalsResponse>
      = QueryGrpc.getProposalsMethod()!!

  private val voteDescriptor:
      MethodDescriptor<QueryOuterClass.QueryVoteRequest, QueryOuterClass.QueryVoteResponse> =
      QueryGrpc.getVoteMethod()!!

  private val votesDescriptor:
      MethodDescriptor<QueryOuterClass.QueryVotesRequest, QueryOuterClass.QueryVotesResponse> =
      QueryGrpc.getVotesMethod()!!

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  private val depositDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDepositRequest, QueryOuterClass.QueryDepositResponse> =
      QueryGrpc.getDepositMethod()!!

  private val depositsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryDepositsRequest, QueryOuterClass.QueryDepositsResponse>
      = QueryGrpc.getDepositsMethod()!!

  private val tallyResultDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTallyResultRequest, QueryOuterClass.QueryTallyResultResponse>
      = QueryGrpc.getTallyResultMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun proposal(request: QueryProposalRequest): QueryProposalResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Query.Proposal is unimplemented"))

    public open override suspend fun proposals(request: QueryProposalsRequest):
        QueryProposalsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Query.Proposals is unimplemented"))

    public open override suspend fun vote(request: QueryVoteRequest): QueryVoteResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Query.Vote is unimplemented"))

    public open override suspend fun votes(request: QueryVotesRequest): QueryVotesResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Query.Votes is unimplemented"))

    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Query.Params is unimplemented"))

    public open override suspend fun deposit(request: QueryDepositRequest): QueryDepositResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Query.Deposit is unimplemented"))

    public open override suspend fun deposits(request: QueryDepositsRequest): QueryDepositsResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Query.Deposits is unimplemented"))

    public open override suspend fun tallyResult(request: QueryTallyResultRequest):
        QueryTallyResultResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.gov.v1.Query.TallyResult is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = proposalDescriptor,
    				implementation = {
        QueryProposalResponseJvmConverter.convert(proposal(QueryProposalRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = proposalsDescriptor,
    				implementation = {
        QueryProposalsResponseJvmConverter.convert(proposals(QueryProposalsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = voteDescriptor,
    				implementation = {
        QueryVoteResponseJvmConverter.convert(vote(QueryVoteRequestJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = votesDescriptor,
    				implementation = {
        QueryVotesResponseJvmConverter.convert(votes(QueryVotesRequestJvmConverter.convert(it))) },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = paramsDescriptor,
    				implementation = {
        QueryParamsResponseJvmConverter.convert(params(QueryParamsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = depositDescriptor,
    				implementation = {
        QueryDepositResponseJvmConverter.convert(deposit(QueryDepositRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = depositsDescriptor,
    				implementation = {
        QueryDepositsResponseJvmConverter.convert(deposits(QueryDepositsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = tallyResultDescriptor,
    				implementation = {
        QueryTallyResultResponseJvmConverter.convert(tallyResult(QueryTallyResultRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<Query.Client>(channel = option.channel, callOptions =
      option.callOptions), Query.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): Query.Client =
        Query.Client(ClientOption(channel, callOptions))

    public override suspend fun proposal(request: QueryProposalRequest): QueryProposalResponse =
        proposal(request, Metadata())

    public suspend fun proposal(request: QueryProposalRequest, metadata: Metadata):
        QueryProposalResponse = QueryProposalResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, proposalDescriptor,
    			QueryProposalRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun proposals(request: QueryProposalsRequest): QueryProposalsResponse =
        proposals(request, Metadata())

    public suspend fun proposals(request: QueryProposalsRequest, metadata: Metadata):
        QueryProposalsResponse = QueryProposalsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, proposalsDescriptor,
    			QueryProposalsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun vote(request: QueryVoteRequest): QueryVoteResponse = vote(request,
        Metadata())

    public suspend fun vote(request: QueryVoteRequest, metadata: Metadata): QueryVoteResponse =
        QueryVoteResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, voteDescriptor,
    			QueryVoteRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun votes(request: QueryVotesRequest): QueryVotesResponse =
        votes(request, Metadata())

    public suspend fun votes(request: QueryVotesRequest, metadata: Metadata): QueryVotesResponse =
        QueryVotesResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, votesDescriptor,
    			QueryVotesRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        params(request, Metadata())

    public suspend fun params(request: QueryParamsRequest, metadata: Metadata): QueryParamsResponse
        = QueryParamsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, paramsDescriptor,
    			QueryParamsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun deposit(request: QueryDepositRequest): QueryDepositResponse =
        deposit(request, Metadata())

    public suspend fun deposit(request: QueryDepositRequest, metadata: Metadata):
        QueryDepositResponse = QueryDepositResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, depositDescriptor,
    			QueryDepositRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun deposits(request: QueryDepositsRequest): QueryDepositsResponse =
        deposits(request, Metadata())

    public suspend fun deposits(request: QueryDepositsRequest, metadata: Metadata):
        QueryDepositsResponse = QueryDepositsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, depositsDescriptor,
    			QueryDepositsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun tallyResult(request: QueryTallyResultRequest):
        QueryTallyResultResponse = tallyResult(request, Metadata())

    public suspend fun tallyResult(request: QueryTallyResultRequest, metadata: Metadata):
        QueryTallyResultResponse = QueryTallyResultResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, tallyResultDescriptor,
    			QueryTallyResultRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}

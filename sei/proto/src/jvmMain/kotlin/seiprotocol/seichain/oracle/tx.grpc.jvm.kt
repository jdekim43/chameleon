// Transform from oracle/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.oracle

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

public object MsgJvm {
  private val descriptor: ServiceDescriptor = MsgGrpc.getServiceDescriptor()!!

  private val aggregateExchangeRateVoteDescriptor:
      MethodDescriptor<Tx.MsgAggregateExchangeRateVote, Tx.MsgAggregateExchangeRateVoteResponse> =
      MsgGrpc.getAggregateExchangeRateVoteMethod()!!

  private val delegateFeedConsentDescriptor:
      MethodDescriptor<Tx.MsgDelegateFeedConsent, Tx.MsgDelegateFeedConsentResponse> =
      MsgGrpc.getDelegateFeedConsentMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend
        fun aggregateExchangeRateVote(request: MsgAggregateExchangeRateVote):
        MsgAggregateExchangeRateVoteResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.oracle.Msg.AggregateExchangeRateVote is unimplemented"))

    public open override suspend fun delegateFeedConsent(request: MsgDelegateFeedConsent):
        MsgDelegateFeedConsentResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method seiprotocol.seichain.oracle.Msg.DelegateFeedConsent is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = aggregateExchangeRateVoteDescriptor,
    				implementation = {
        MsgAggregateExchangeRateVoteResponseJvmConverter.convert(aggregateExchangeRateVote(MsgAggregateExchangeRateVoteJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = delegateFeedConsentDescriptor,
    				implementation = {
        MsgDelegateFeedConsentResponseJvmConverter.convert(delegateFeedConsent(MsgDelegateFeedConsentJvmConverter.convert(it)))
        },
    			)
    		)
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<Msg.Client>(channel = option.channel, callOptions = option.callOptions),
      Msg.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): Msg.Client =
        Msg.Client(ClientOption(channel, callOptions))

    public override suspend fun aggregateExchangeRateVote(request: MsgAggregateExchangeRateVote):
        MsgAggregateExchangeRateVoteResponse = aggregateExchangeRateVote(request, Metadata())

    public suspend fun aggregateExchangeRateVote(request: MsgAggregateExchangeRateVote,
        metadata: Metadata): MsgAggregateExchangeRateVoteResponse =
        MsgAggregateExchangeRateVoteResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, aggregateExchangeRateVoteDescriptor,
    			MsgAggregateExchangeRateVoteJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun delegateFeedConsent(request: MsgDelegateFeedConsent):
        MsgDelegateFeedConsentResponse = delegateFeedConsent(request, Metadata())

    public suspend fun delegateFeedConsent(request: MsgDelegateFeedConsent, metadata: Metadata):
        MsgDelegateFeedConsentResponse = MsgDelegateFeedConsentResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, delegateFeedConsentDescriptor,
    			MsgDelegateFeedConsentJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}

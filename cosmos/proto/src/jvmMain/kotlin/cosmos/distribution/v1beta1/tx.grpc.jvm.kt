// Transform from cosmos/distribution/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.distribution.v1beta1

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

  private val setWithdrawAddressDescriptor:
      MethodDescriptor<Tx.MsgSetWithdrawAddress, Tx.MsgSetWithdrawAddressResponse> =
      MsgGrpc.getSetWithdrawAddressMethod()!!

  private val withdrawDelegatorRewardDescriptor:
      MethodDescriptor<Tx.MsgWithdrawDelegatorReward, Tx.MsgWithdrawDelegatorRewardResponse> =
      MsgGrpc.getWithdrawDelegatorRewardMethod()!!

  private val withdrawValidatorCommissionDescriptor:
      MethodDescriptor<Tx.MsgWithdrawValidatorCommission, Tx.MsgWithdrawValidatorCommissionResponse>
      = MsgGrpc.getWithdrawValidatorCommissionMethod()!!

  private val fundCommunityPoolDescriptor:
      MethodDescriptor<Tx.MsgFundCommunityPool, Tx.MsgFundCommunityPoolResponse> =
      MsgGrpc.getFundCommunityPoolMethod()!!

  private val updateParamsDescriptor:
      MethodDescriptor<Tx.MsgUpdateParams, Tx.MsgUpdateParamsResponse> =
      MsgGrpc.getUpdateParamsMethod()!!

  private val communityPoolSpendDescriptor:
      MethodDescriptor<Tx.MsgCommunityPoolSpend, Tx.MsgCommunityPoolSpendResponse> =
      MsgGrpc.getCommunityPoolSpendMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Msg.Interface {
    public open override suspend fun setWithdrawAddress(request: MsgSetWithdrawAddress):
        MsgSetWithdrawAddressResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Msg.SetWithdrawAddress is unimplemented"))

    public open override suspend fun withdrawDelegatorReward(request: MsgWithdrawDelegatorReward):
        MsgWithdrawDelegatorRewardResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Msg.WithdrawDelegatorReward is unimplemented"))

    public open override suspend
        fun withdrawValidatorCommission(request: MsgWithdrawValidatorCommission):
        MsgWithdrawValidatorCommissionResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Msg.WithdrawValidatorCommission is unimplemented"))

    public open override suspend fun fundCommunityPool(request: MsgFundCommunityPool):
        MsgFundCommunityPoolResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Msg.FundCommunityPool is unimplemented"))

    public open override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse
        = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Msg.UpdateParams is unimplemented"))

    public open override suspend fun communityPoolSpend(request: MsgCommunityPoolSpend):
        MsgCommunityPoolSpendResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method cosmos.distribution.v1beta1.Msg.CommunityPoolSpend is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = setWithdrawAddressDescriptor,
    				implementation = {
        MsgSetWithdrawAddressResponseJvmConverter.convert(setWithdrawAddress(MsgSetWithdrawAddressJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = withdrawDelegatorRewardDescriptor,
    				implementation = {
        MsgWithdrawDelegatorRewardResponseJvmConverter.convert(withdrawDelegatorReward(MsgWithdrawDelegatorRewardJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = withdrawValidatorCommissionDescriptor,
    				implementation = {
        MsgWithdrawValidatorCommissionResponseJvmConverter.convert(withdrawValidatorCommission(MsgWithdrawValidatorCommissionJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = fundCommunityPoolDescriptor,
    				implementation = {
        MsgFundCommunityPoolResponseJvmConverter.convert(fundCommunityPool(MsgFundCommunityPoolJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = updateParamsDescriptor,
    				implementation = {
        MsgUpdateParamsResponseJvmConverter.convert(updateParams(MsgUpdateParamsJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = communityPoolSpendDescriptor,
    				implementation = {
        MsgCommunityPoolSpendResponseJvmConverter.convert(communityPoolSpend(MsgCommunityPoolSpendJvmConverter.convert(it)))
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

    public override suspend fun setWithdrawAddress(request: MsgSetWithdrawAddress):
        MsgSetWithdrawAddressResponse = setWithdrawAddress(request, Metadata())

    public suspend fun setWithdrawAddress(request: MsgSetWithdrawAddress, metadata: Metadata):
        MsgSetWithdrawAddressResponse = MsgSetWithdrawAddressResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, setWithdrawAddressDescriptor,
    			MsgSetWithdrawAddressJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun withdrawDelegatorReward(request: MsgWithdrawDelegatorReward):
        MsgWithdrawDelegatorRewardResponse = withdrawDelegatorReward(request, Metadata())

    public suspend fun withdrawDelegatorReward(request: MsgWithdrawDelegatorReward,
        metadata: Metadata): MsgWithdrawDelegatorRewardResponse =
        MsgWithdrawDelegatorRewardResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, withdrawDelegatorRewardDescriptor,
    			MsgWithdrawDelegatorRewardJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend
        fun withdrawValidatorCommission(request: MsgWithdrawValidatorCommission):
        MsgWithdrawValidatorCommissionResponse = withdrawValidatorCommission(request, Metadata())

    public suspend fun withdrawValidatorCommission(request: MsgWithdrawValidatorCommission,
        metadata: Metadata): MsgWithdrawValidatorCommissionResponse =
        MsgWithdrawValidatorCommissionResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, withdrawValidatorCommissionDescriptor,
    			MsgWithdrawValidatorCommissionJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun fundCommunityPool(request: MsgFundCommunityPool):
        MsgFundCommunityPoolResponse = fundCommunityPool(request, Metadata())

    public suspend fun fundCommunityPool(request: MsgFundCommunityPool, metadata: Metadata):
        MsgFundCommunityPoolResponse = MsgFundCommunityPoolResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, fundCommunityPoolDescriptor,
    			MsgFundCommunityPoolJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun updateParams(request: MsgUpdateParams): MsgUpdateParamsResponse =
        updateParams(request, Metadata())

    public suspend fun updateParams(request: MsgUpdateParams, metadata: Metadata):
        MsgUpdateParamsResponse = MsgUpdateParamsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, updateParamsDescriptor,
    			MsgUpdateParamsJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun communityPoolSpend(request: MsgCommunityPoolSpend):
        MsgCommunityPoolSpendResponse = communityPoolSpend(request, Metadata())

    public suspend fun communityPoolSpend(request: MsgCommunityPoolSpend, metadata: Metadata):
        MsgCommunityPoolSpendResponse = MsgCommunityPoolSpendResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, communityPoolSpendDescriptor,
    			MsgCommunityPoolSpendJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)
  }
}

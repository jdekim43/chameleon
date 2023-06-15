// Transform from terra/treasury/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package terra.treasury.v1beta1

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

  private val taxRateDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTaxRateRequest, QueryOuterClass.QueryTaxRateResponse> =
      QueryGrpc.getTaxRateMethod()!!

  private val taxCapDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTaxCapRequest, QueryOuterClass.QueryTaxCapResponse> =
      QueryGrpc.getTaxCapMethod()!!

  private val taxCapsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTaxCapsRequest, QueryOuterClass.QueryTaxCapsResponse> =
      QueryGrpc.getTaxCapsMethod()!!

  private val rewardWeightDescriptor:
      MethodDescriptor<QueryOuterClass.QueryRewardWeightRequest, QueryOuterClass.QueryRewardWeightResponse>
      = QueryGrpc.getRewardWeightMethod()!!

  private val seigniorageProceedsDescriptor:
      MethodDescriptor<QueryOuterClass.QuerySeigniorageProceedsRequest, QueryOuterClass.QuerySeigniorageProceedsResponse>
      = QueryGrpc.getSeigniorageProceedsMethod()!!

  private val taxProceedsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryTaxProceedsRequest, QueryOuterClass.QueryTaxProceedsResponse>
      = QueryGrpc.getTaxProceedsMethod()!!

  private val indicatorsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryIndicatorsRequest, QueryOuterClass.QueryIndicatorsResponse>
      = QueryGrpc.getIndicatorsMethod()!!

  private val burnTaxExemptionListDescriptor:
      MethodDescriptor<QueryOuterClass.QueryBurnTaxExemptionListRequest, QueryOuterClass.QueryBurnTaxExemptionListResponse>
      = QueryGrpc.getBurnTaxExemptionListMethod()!!

  private val paramsDescriptor:
      MethodDescriptor<QueryOuterClass.QueryParamsRequest, QueryOuterClass.QueryParamsResponse> =
      QueryGrpc.getParamsMethod()!!

  public abstract class Server(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(context = coroutineContext), Query.Interface {
    public open override suspend fun taxRate(request: QueryTaxRateRequest): QueryTaxRateResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.treasury.v1beta1.Query.TaxRate is unimplemented"))

    public open override suspend fun taxCap(request: QueryTaxCapRequest): QueryTaxCapResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.treasury.v1beta1.Query.TaxCap is unimplemented"))

    public open override suspend fun taxCaps(request: QueryTaxCapsRequest): QueryTaxCapsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.treasury.v1beta1.Query.TaxCaps is unimplemented"))

    public open override suspend fun rewardWeight(request: QueryRewardWeightRequest):
        QueryRewardWeightResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.treasury.v1beta1.Query.RewardWeight is unimplemented"))

    public open override suspend fun seigniorageProceeds(request: QuerySeigniorageProceedsRequest):
        QuerySeigniorageProceedsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.treasury.v1beta1.Query.SeigniorageProceeds is unimplemented"))

    public open override suspend fun taxProceeds(request: QueryTaxProceedsRequest):
        QueryTaxProceedsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.treasury.v1beta1.Query.TaxProceeds is unimplemented"))

    public open override suspend fun indicators(request: QueryIndicatorsRequest):
        QueryIndicatorsResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.treasury.v1beta1.Query.Indicators is unimplemented"))

    public open override suspend
        fun burnTaxExemptionList(request: QueryBurnTaxExemptionListRequest):
        QueryBurnTaxExemptionListResponse = throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.treasury.v1beta1.Query.BurnTaxExemptionList is unimplemented"))

    public open override suspend fun params(request: QueryParamsRequest): QueryParamsResponse =
        throw
        StatusException(Status.UNIMPLEMENTED.withDescription("Method terra.treasury.v1beta1.Query.Params is unimplemented"))

    public override fun bindService(): ServerServiceDefinition =
        ServerServiceDefinition.builder(descriptor)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = taxRateDescriptor,
    				implementation = {
        QueryTaxRateResponseJvmConverter.convert(taxRate(QueryTaxRateRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = taxCapDescriptor,
    				implementation = {
        QueryTaxCapResponseJvmConverter.convert(taxCap(QueryTaxCapRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = taxCapsDescriptor,
    				implementation = {
        QueryTaxCapsResponseJvmConverter.convert(taxCaps(QueryTaxCapsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = rewardWeightDescriptor,
    				implementation = {
        QueryRewardWeightResponseJvmConverter.convert(rewardWeight(QueryRewardWeightRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = seigniorageProceedsDescriptor,
    				implementation = {
        QuerySeigniorageProceedsResponseJvmConverter.convert(seigniorageProceeds(QuerySeigniorageProceedsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = taxProceedsDescriptor,
    				implementation = {
        QueryTaxProceedsResponseJvmConverter.convert(taxProceeds(QueryTaxProceedsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = indicatorsDescriptor,
    				implementation = {
        QueryIndicatorsResponseJvmConverter.convert(indicators(QueryIndicatorsRequestJvmConverter.convert(it)))
        },
    			)
    		)
    		.addMethod(
    			ServerCalls.unaryServerMethodDefinition(
    				context = this.context,
    				descriptor = burnTaxExemptionListDescriptor,
    				implementation = {
        QueryBurnTaxExemptionListResponseJvmConverter.convert(burnTaxExemptionList(QueryBurnTaxExemptionListRequestJvmConverter.convert(it)))
        },
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
    		.build()
  }

  public open class Client(
    private val option: ClientOption,
  ) : AbstractCoroutineStub<Query.Client>(channel = option.channel, callOptions =
      option.callOptions), Query.Interface {
    public override fun build(channel: Channel, callOptions: CallOptions): Query.Client =
        Query.Client(ClientOption(channel, callOptions))

    public override suspend fun taxRate(request: QueryTaxRateRequest): QueryTaxRateResponse =
        taxRate(request, Metadata())

    public suspend fun taxRate(request: QueryTaxRateRequest, metadata: Metadata):
        QueryTaxRateResponse = QueryTaxRateResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, taxRateDescriptor,
    			QueryTaxRateRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun taxCap(request: QueryTaxCapRequest): QueryTaxCapResponse =
        taxCap(request, Metadata())

    public suspend fun taxCap(request: QueryTaxCapRequest, metadata: Metadata): QueryTaxCapResponse
        = QueryTaxCapResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, taxCapDescriptor,
    			QueryTaxCapRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun taxCaps(request: QueryTaxCapsRequest): QueryTaxCapsResponse =
        taxCaps(request, Metadata())

    public suspend fun taxCaps(request: QueryTaxCapsRequest, metadata: Metadata):
        QueryTaxCapsResponse = QueryTaxCapsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, taxCapsDescriptor,
    			QueryTaxCapsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun rewardWeight(request: QueryRewardWeightRequest):
        QueryRewardWeightResponse = rewardWeight(request, Metadata())

    public suspend fun rewardWeight(request: QueryRewardWeightRequest, metadata: Metadata):
        QueryRewardWeightResponse = QueryRewardWeightResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, rewardWeightDescriptor,
    			QueryRewardWeightRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun seigniorageProceeds(request: QuerySeigniorageProceedsRequest):
        QuerySeigniorageProceedsResponse = seigniorageProceeds(request, Metadata())

    public suspend fun seigniorageProceeds(request: QuerySeigniorageProceedsRequest,
        metadata: Metadata): QuerySeigniorageProceedsResponse =
        QuerySeigniorageProceedsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, seigniorageProceedsDescriptor,
    			QuerySeigniorageProceedsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun taxProceeds(request: QueryTaxProceedsRequest):
        QueryTaxProceedsResponse = taxProceeds(request, Metadata())

    public suspend fun taxProceeds(request: QueryTaxProceedsRequest, metadata: Metadata):
        QueryTaxProceedsResponse = QueryTaxProceedsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, taxProceedsDescriptor,
    			QueryTaxProceedsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun indicators(request: QueryIndicatorsRequest): QueryIndicatorsResponse
        = indicators(request, Metadata())

    public suspend fun indicators(request: QueryIndicatorsRequest, metadata: Metadata):
        QueryIndicatorsResponse = QueryIndicatorsResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, indicatorsDescriptor,
    			QueryIndicatorsRequestJvmConverter.convert(request),
    			option.callOptions, metadata,
    		),
    	)

    public override suspend fun burnTaxExemptionList(request: QueryBurnTaxExemptionListRequest):
        QueryBurnTaxExemptionListResponse = burnTaxExemptionList(request, Metadata())

    public suspend fun burnTaxExemptionList(request: QueryBurnTaxExemptionListRequest,
        metadata: Metadata): QueryBurnTaxExemptionListResponse =
        QueryBurnTaxExemptionListResponseJvmConverter.convert(
    		ClientCalls.unaryRpc(
    			option.channel, burnTaxExemptionListDescriptor,
    			QueryBurnTaxExemptionListRequestJvmConverter.convert(request),
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
  }
}

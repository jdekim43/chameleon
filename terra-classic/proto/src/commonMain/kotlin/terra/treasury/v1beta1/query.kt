// Transform from terra/treasury/v1beta1/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package terra.treasury.v1beta1

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
import cosmos.base.v1beta1.Coin
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.`annotation`.ProtobufIndex
import kr.jadekim.protobuf.`annotation`.ProtobufSyntax
import kr.jadekim.protobuf.kotlinx.ProtobufConverterEncoder
import kr.jadekim.protobuf.kotlinx.ProtobufMapperDecoder
import kr.jadekim.protobuf.type.ProtobufMessage

@Serializable(with = QueryTaxRateRequest.KotlinxSerializer::class)
@SerialName(value = QueryTaxRateRequest.TYPE_URL)
public class QueryTaxRateRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QueryTaxRateRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryTaxRateRequest> {
    private val delegator: KSerializer<QueryTaxRateRequest> = QueryTaxRateRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTaxRateRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTaxRateRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTaxRateRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTaxRateRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTaxRateResponse.KotlinxSerializer::class)
@SerialName(value = QueryTaxRateResponse.TYPE_URL)
public data class QueryTaxRateResponse(
  @ProtobufIndex(index = 1)
  public val taxRate: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QueryTaxRateResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryTaxRateResponse> {
    private val delegator: KSerializer<QueryTaxRateResponse> = QueryTaxRateResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTaxRateResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTaxRateResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTaxRateResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTaxRateResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTaxCapRequest.KotlinxSerializer::class)
@SerialName(value = QueryTaxCapRequest.TYPE_URL)
public data class QueryTaxCapRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QueryTaxCapRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryTaxCapRequest> {
    private val delegator: KSerializer<QueryTaxCapRequest> = QueryTaxCapRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTaxCapRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTaxCapRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTaxCapRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTaxCapRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTaxCapResponse.KotlinxSerializer::class)
@SerialName(value = QueryTaxCapResponse.TYPE_URL)
public data class QueryTaxCapResponse(
  @ProtobufIndex(index = 1)
  public val taxCap: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QueryTaxCapResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryTaxCapResponse> {
    private val delegator: KSerializer<QueryTaxCapResponse> = QueryTaxCapResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTaxCapResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTaxCapResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTaxCapResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTaxCapResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTaxCapsRequest.KotlinxSerializer::class)
@SerialName(value = QueryTaxCapsRequest.TYPE_URL)
public class QueryTaxCapsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QueryTaxCapsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryTaxCapsRequest> {
    private val delegator: KSerializer<QueryTaxCapsRequest> = QueryTaxCapsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTaxCapsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTaxCapsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTaxCapsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTaxCapsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTaxCapsResponseItem.KotlinxSerializer::class)
@SerialName(value = QueryTaxCapsResponseItem.TYPE_URL)
public data class QueryTaxCapsResponseItem(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val taxCap: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QueryTaxCapsResponseItem"
  }

  public object KotlinxSerializer : KSerializer<QueryTaxCapsResponseItem> {
    private val delegator: KSerializer<QueryTaxCapsResponseItem> =
        QueryTaxCapsResponseItem.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTaxCapsResponseItem): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTaxCapsResponseItemConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTaxCapsResponseItem {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTaxCapsResponseItemConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTaxCapsResponse.KotlinxSerializer::class)
@SerialName(value = QueryTaxCapsResponse.TYPE_URL)
public data class QueryTaxCapsResponse(
  @ProtobufIndex(index = 1)
  public val taxCaps: List<QueryTaxCapsResponseItem>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QueryTaxCapsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryTaxCapsResponse> {
    private val delegator: KSerializer<QueryTaxCapsResponse> = QueryTaxCapsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTaxCapsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTaxCapsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTaxCapsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTaxCapsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryRewardWeightRequest.KotlinxSerializer::class)
@SerialName(value = QueryRewardWeightRequest.TYPE_URL)
public class QueryRewardWeightRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QueryRewardWeightRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryRewardWeightRequest> {
    private val delegator: KSerializer<QueryRewardWeightRequest> =
        QueryRewardWeightRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryRewardWeightRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryRewardWeightRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryRewardWeightRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryRewardWeightRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryRewardWeightResponse.KotlinxSerializer::class)
@SerialName(value = QueryRewardWeightResponse.TYPE_URL)
public data class QueryRewardWeightResponse(
  @ProtobufIndex(index = 1)
  public val rewardWeight: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QueryRewardWeightResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryRewardWeightResponse> {
    private val delegator: KSerializer<QueryRewardWeightResponse> =
        QueryRewardWeightResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryRewardWeightResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryRewardWeightResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryRewardWeightResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryRewardWeightResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTaxProceedsRequest.KotlinxSerializer::class)
@SerialName(value = QueryTaxProceedsRequest.TYPE_URL)
public class QueryTaxProceedsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QueryTaxProceedsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryTaxProceedsRequest> {
    private val delegator: KSerializer<QueryTaxProceedsRequest> =
        QueryTaxProceedsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTaxProceedsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTaxProceedsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTaxProceedsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTaxProceedsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryTaxProceedsResponse.KotlinxSerializer::class)
@SerialName(value = QueryTaxProceedsResponse.TYPE_URL)
public data class QueryTaxProceedsResponse(
  @ProtobufIndex(index = 1)
  public val taxProceeds: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QueryTaxProceedsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryTaxProceedsResponse> {
    private val delegator: KSerializer<QueryTaxProceedsResponse> =
        QueryTaxProceedsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryTaxProceedsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryTaxProceedsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryTaxProceedsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryTaxProceedsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySeigniorageProceedsRequest.KotlinxSerializer::class)
@SerialName(value = QuerySeigniorageProceedsRequest.TYPE_URL)
public class QuerySeigniorageProceedsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QuerySeigniorageProceedsRequest"
  }

  public object KotlinxSerializer : KSerializer<QuerySeigniorageProceedsRequest> {
    private val delegator: KSerializer<QuerySeigniorageProceedsRequest> =
        QuerySeigniorageProceedsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySeigniorageProceedsRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySeigniorageProceedsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySeigniorageProceedsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySeigniorageProceedsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QuerySeigniorageProceedsResponse.KotlinxSerializer::class)
@SerialName(value = QuerySeigniorageProceedsResponse.TYPE_URL)
public data class QuerySeigniorageProceedsResponse(
  @ProtobufIndex(index = 1)
  public val seigniorageProceeds: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QuerySeigniorageProceedsResponse"
  }

  public object KotlinxSerializer : KSerializer<QuerySeigniorageProceedsResponse> {
    private val delegator: KSerializer<QuerySeigniorageProceedsResponse> =
        QuerySeigniorageProceedsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QuerySeigniorageProceedsResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QuerySeigniorageProceedsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QuerySeigniorageProceedsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QuerySeigniorageProceedsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryIndicatorsRequest.KotlinxSerializer::class)
@SerialName(value = QueryIndicatorsRequest.TYPE_URL)
public class QueryIndicatorsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QueryIndicatorsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryIndicatorsRequest> {
    private val delegator: KSerializer<QueryIndicatorsRequest> = QueryIndicatorsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryIndicatorsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryIndicatorsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryIndicatorsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryIndicatorsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryIndicatorsResponse.KotlinxSerializer::class)
@SerialName(value = QueryIndicatorsResponse.TYPE_URL)
public data class QueryIndicatorsResponse(
  @ProtobufIndex(index = 1)
  public val trlYear: String,
  @ProtobufIndex(index = 2)
  public val trlMonth: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QueryIndicatorsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryIndicatorsResponse> {
    private val delegator: KSerializer<QueryIndicatorsResponse> =
        QueryIndicatorsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryIndicatorsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryIndicatorsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryIndicatorsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryIndicatorsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryParamsRequest.TYPE_URL)
public class QueryParamsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QueryParamsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryParamsRequest> {
    private val delegator: KSerializer<QueryParamsRequest> = QueryParamsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryParamsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryParamsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryParamsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryParamsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryParamsResponse.KotlinxSerializer::class)
@SerialName(value = QueryParamsResponse.TYPE_URL)
public data class QueryParamsResponse(
  @ProtobufIndex(index = 1)
  public val params: Params,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QueryParamsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryParamsResponse> {
    private val delegator: KSerializer<QueryParamsResponse> = QueryParamsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryParamsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryParamsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryParamsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryParamsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBurnTaxExemptionListRequest.KotlinxSerializer::class)
@SerialName(value = QueryBurnTaxExemptionListRequest.TYPE_URL)
public data class QueryBurnTaxExemptionListRequest(
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QueryBurnTaxExemptionListRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryBurnTaxExemptionListRequest> {
    private val delegator: KSerializer<QueryBurnTaxExemptionListRequest> =
        QueryBurnTaxExemptionListRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBurnTaxExemptionListRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBurnTaxExemptionListRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBurnTaxExemptionListRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBurnTaxExemptionListRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryBurnTaxExemptionListResponse.KotlinxSerializer::class)
@SerialName(value = QueryBurnTaxExemptionListResponse.TYPE_URL)
public data class QueryBurnTaxExemptionListResponse(
  @ProtobufIndex(index = 1)
  public val addresses: List<String>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.QueryBurnTaxExemptionListResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryBurnTaxExemptionListResponse> {
    private val delegator: KSerializer<QueryBurnTaxExemptionListResponse> =
        QueryBurnTaxExemptionListResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryBurnTaxExemptionListResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryBurnTaxExemptionListResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryBurnTaxExemptionListResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryBurnTaxExemptionListResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

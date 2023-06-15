// Transform from dex/query.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
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

@Serializable(with = QueryParamsRequest.KotlinxSerializer::class)
@SerialName(value = QueryParamsRequest.TYPE_URL)
public class QueryParamsRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryParamsRequest"
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
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryParamsResponse"
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

@Serializable(with = QueryGetLongBookRequest.KotlinxSerializer::class)
@SerialName(value = QueryGetLongBookRequest.TYPE_URL)
public data class QueryGetLongBookRequest(
  @ProtobufIndex(index = 1)
  public val price: String,
  @ProtobufIndex(index = 2)
  public val contractAddr: String,
  @ProtobufIndex(index = 3)
  public val priceDenom: String,
  @ProtobufIndex(index = 4)
  public val assetDenom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetLongBookRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGetLongBookRequest> {
    private val delegator: KSerializer<QueryGetLongBookRequest> =
        QueryGetLongBookRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetLongBookRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetLongBookRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetLongBookRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetLongBookRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetLongBookResponse.KotlinxSerializer::class)
@SerialName(value = QueryGetLongBookResponse.TYPE_URL)
public data class QueryGetLongBookResponse(
  @ProtobufIndex(index = 1)
  public val longBook: LongBook,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetLongBookResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGetLongBookResponse> {
    private val delegator: KSerializer<QueryGetLongBookResponse> =
        QueryGetLongBookResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetLongBookResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetLongBookResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetLongBookResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetLongBookResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllLongBookRequest.KotlinxSerializer::class)
@SerialName(value = QueryAllLongBookRequest.TYPE_URL)
public data class QueryAllLongBookRequest(
  @ProtobufIndex(index = 1)
  public val pagination: PageRequest,
  @ProtobufIndex(index = 2)
  public val contractAddr: String,
  @ProtobufIndex(index = 3)
  public val priceDenom: String,
  @ProtobufIndex(index = 4)
  public val assetDenom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryAllLongBookRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAllLongBookRequest> {
    private val delegator: KSerializer<QueryAllLongBookRequest> =
        QueryAllLongBookRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllLongBookRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllLongBookRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllLongBookRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllLongBookRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllLongBookResponse.KotlinxSerializer::class)
@SerialName(value = QueryAllLongBookResponse.TYPE_URL)
public data class QueryAllLongBookResponse(
  @ProtobufIndex(index = 1)
  public val longBook: List<LongBook>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryAllLongBookResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAllLongBookResponse> {
    private val delegator: KSerializer<QueryAllLongBookResponse> =
        QueryAllLongBookResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllLongBookResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllLongBookResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllLongBookResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllLongBookResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetShortBookRequest.KotlinxSerializer::class)
@SerialName(value = QueryGetShortBookRequest.TYPE_URL)
public data class QueryGetShortBookRequest(
  @ProtobufIndex(index = 1)
  public val price: String,
  @ProtobufIndex(index = 2)
  public val contractAddr: String,
  @ProtobufIndex(index = 3)
  public val priceDenom: String,
  @ProtobufIndex(index = 4)
  public val assetDenom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetShortBookRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGetShortBookRequest> {
    private val delegator: KSerializer<QueryGetShortBookRequest> =
        QueryGetShortBookRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetShortBookRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetShortBookRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetShortBookRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetShortBookRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetShortBookResponse.KotlinxSerializer::class)
@SerialName(value = QueryGetShortBookResponse.TYPE_URL)
public data class QueryGetShortBookResponse(
  @ProtobufIndex(index = 1)
  public val shortBook: ShortBook,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetShortBookResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGetShortBookResponse> {
    private val delegator: KSerializer<QueryGetShortBookResponse> =
        QueryGetShortBookResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetShortBookResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetShortBookResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetShortBookResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetShortBookResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllShortBookRequest.KotlinxSerializer::class)
@SerialName(value = QueryAllShortBookRequest.TYPE_URL)
public data class QueryAllShortBookRequest(
  @ProtobufIndex(index = 1)
  public val pagination: PageRequest,
  @ProtobufIndex(index = 2)
  public val contractAddr: String,
  @ProtobufIndex(index = 3)
  public val priceDenom: String,
  @ProtobufIndex(index = 4)
  public val assetDenom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryAllShortBookRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAllShortBookRequest> {
    private val delegator: KSerializer<QueryAllShortBookRequest> =
        QueryAllShortBookRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllShortBookRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllShortBookRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllShortBookRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllShortBookRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAllShortBookResponse.KotlinxSerializer::class)
@SerialName(value = QueryAllShortBookResponse.TYPE_URL)
public data class QueryAllShortBookResponse(
  @ProtobufIndex(index = 1)
  public val shortBook: List<ShortBook>,
  @ProtobufIndex(index = 2)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryAllShortBookResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAllShortBookResponse> {
    private val delegator: KSerializer<QueryAllShortBookResponse> =
        QueryAllShortBookResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAllShortBookResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAllShortBookResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAllShortBookResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAllShortBookResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetPricesRequest.KotlinxSerializer::class)
@SerialName(value = QueryGetPricesRequest.TYPE_URL)
public data class QueryGetPricesRequest(
  @ProtobufIndex(index = 1)
  public val priceDenom: String,
  @ProtobufIndex(index = 2)
  public val assetDenom: String,
  @ProtobufIndex(index = 3)
  public val contractAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetPricesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGetPricesRequest> {
    private val delegator: KSerializer<QueryGetPricesRequest> = QueryGetPricesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetPricesRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetPricesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetPricesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetPricesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetPricesResponse.KotlinxSerializer::class)
@SerialName(value = QueryGetPricesResponse.TYPE_URL)
public data class QueryGetPricesResponse(
  @ProtobufIndex(index = 1)
  public val prices: List<Price>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetPricesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGetPricesResponse> {
    private val delegator: KSerializer<QueryGetPricesResponse> = QueryGetPricesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetPricesResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetPricesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetPricesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetPricesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetPriceRequest.KotlinxSerializer::class)
@SerialName(value = QueryGetPriceRequest.TYPE_URL)
public data class QueryGetPriceRequest(
  @ProtobufIndex(index = 1)
  public val priceDenom: String,
  @ProtobufIndex(index = 2)
  public val assetDenom: String,
  @ProtobufIndex(index = 3)
  public val contractAddr: String,
  @ProtobufIndex(index = 4)
  public val timestamp: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetPriceRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGetPriceRequest> {
    private val delegator: KSerializer<QueryGetPriceRequest> = QueryGetPriceRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetPriceRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetPriceRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetPriceRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetPriceRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetPriceResponse.KotlinxSerializer::class)
@SerialName(value = QueryGetPriceResponse.TYPE_URL)
public data class QueryGetPriceResponse(
  @ProtobufIndex(index = 1)
  public val price: Price,
  @ProtobufIndex(index = 2)
  public val found: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetPriceResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGetPriceResponse> {
    private val delegator: KSerializer<QueryGetPriceResponse> = QueryGetPriceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetPriceResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetPriceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetPriceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetPriceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetLatestPriceRequest.KotlinxSerializer::class)
@SerialName(value = QueryGetLatestPriceRequest.TYPE_URL)
public data class QueryGetLatestPriceRequest(
  @ProtobufIndex(index = 1)
  public val priceDenom: String,
  @ProtobufIndex(index = 2)
  public val assetDenom: String,
  @ProtobufIndex(index = 3)
  public val contractAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetLatestPriceRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGetLatestPriceRequest> {
    private val delegator: KSerializer<QueryGetLatestPriceRequest> =
        QueryGetLatestPriceRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetLatestPriceRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetLatestPriceRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetLatestPriceRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetLatestPriceRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetLatestPriceResponse.KotlinxSerializer::class)
@SerialName(value = QueryGetLatestPriceResponse.TYPE_URL)
public data class QueryGetLatestPriceResponse(
  @ProtobufIndex(index = 1)
  public val price: Price,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetLatestPriceResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGetLatestPriceResponse> {
    private val delegator: KSerializer<QueryGetLatestPriceResponse> =
        QueryGetLatestPriceResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetLatestPriceResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetLatestPriceResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetLatestPriceResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetLatestPriceResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetTwapsRequest.KotlinxSerializer::class)
@SerialName(value = QueryGetTwapsRequest.TYPE_URL)
public data class QueryGetTwapsRequest(
  @ProtobufIndex(index = 1)
  public val contractAddr: String,
  @ProtobufIndex(index = 2)
  public val lookbackSeconds: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetTwapsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGetTwapsRequest> {
    private val delegator: KSerializer<QueryGetTwapsRequest> = QueryGetTwapsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetTwapsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetTwapsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetTwapsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetTwapsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetTwapsResponse.KotlinxSerializer::class)
@SerialName(value = QueryGetTwapsResponse.TYPE_URL)
public data class QueryGetTwapsResponse(
  @ProtobufIndex(index = 1)
  public val twaps: List<Twap>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetTwapsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGetTwapsResponse> {
    private val delegator: KSerializer<QueryGetTwapsResponse> = QueryGetTwapsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetTwapsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetTwapsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetTwapsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetTwapsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAssetListRequest.KotlinxSerializer::class)
@SerialName(value = QueryAssetListRequest.TYPE_URL)
public class QueryAssetListRequest() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryAssetListRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAssetListRequest> {
    private val delegator: KSerializer<QueryAssetListRequest> = QueryAssetListRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAssetListRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAssetListRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAssetListRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAssetListRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAssetListResponse.KotlinxSerializer::class)
@SerialName(value = QueryAssetListResponse.TYPE_URL)
public data class QueryAssetListResponse(
  @ProtobufIndex(index = 1)
  public val assetList: List<AssetMetadata>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryAssetListResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAssetListResponse> {
    private val delegator: KSerializer<QueryAssetListResponse> = QueryAssetListResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAssetListResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAssetListResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAssetListResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAssetListResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAssetMetadataRequest.KotlinxSerializer::class)
@SerialName(value = QueryAssetMetadataRequest.TYPE_URL)
public data class QueryAssetMetadataRequest(
  @ProtobufIndex(index = 1)
  public val denom: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryAssetMetadataRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryAssetMetadataRequest> {
    private val delegator: KSerializer<QueryAssetMetadataRequest> =
        QueryAssetMetadataRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAssetMetadataRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAssetMetadataRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAssetMetadataRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAssetMetadataRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryAssetMetadataResponse.KotlinxSerializer::class)
@SerialName(value = QueryAssetMetadataResponse.TYPE_URL)
public data class QueryAssetMetadataResponse(
  @ProtobufIndex(index = 1)
  public val metadata: AssetMetadata,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryAssetMetadataResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryAssetMetadataResponse> {
    private val delegator: KSerializer<QueryAssetMetadataResponse> =
        QueryAssetMetadataResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryAssetMetadataResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryAssetMetadataResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryAssetMetadataResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryAssetMetadataResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryRegisteredPairsRequest.KotlinxSerializer::class)
@SerialName(value = QueryRegisteredPairsRequest.TYPE_URL)
public data class QueryRegisteredPairsRequest(
  @ProtobufIndex(index = 1)
  public val contractAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryRegisteredPairsRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryRegisteredPairsRequest> {
    private val delegator: KSerializer<QueryRegisteredPairsRequest> =
        QueryRegisteredPairsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryRegisteredPairsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryRegisteredPairsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryRegisteredPairsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryRegisteredPairsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryRegisteredPairsResponse.KotlinxSerializer::class)
@SerialName(value = QueryRegisteredPairsResponse.TYPE_URL)
public data class QueryRegisteredPairsResponse(
  @ProtobufIndex(index = 1)
  public val pairs: List<Pair>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryRegisteredPairsResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryRegisteredPairsResponse> {
    private val delegator: KSerializer<QueryRegisteredPairsResponse> =
        QueryRegisteredPairsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryRegisteredPairsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryRegisteredPairsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryRegisteredPairsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryRegisteredPairsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryRegisteredContractRequest.KotlinxSerializer::class)
@SerialName(value = QueryRegisteredContractRequest.TYPE_URL)
public data class QueryRegisteredContractRequest(
  @ProtobufIndex(index = 1)
  public val contractAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryRegisteredContractRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryRegisteredContractRequest> {
    private val delegator: KSerializer<QueryRegisteredContractRequest> =
        QueryRegisteredContractRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryRegisteredContractRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryRegisteredContractRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryRegisteredContractRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryRegisteredContractRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryRegisteredContractResponse.KotlinxSerializer::class)
@SerialName(value = QueryRegisteredContractResponse.TYPE_URL)
public data class QueryRegisteredContractResponse(
  @ProtobufIndex(index = 1)
  public val contractInfo: ContractInfoV2,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryRegisteredContractResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryRegisteredContractResponse> {
    private val delegator: KSerializer<QueryRegisteredContractResponse> =
        QueryRegisteredContractResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryRegisteredContractResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryRegisteredContractResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryRegisteredContractResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryRegisteredContractResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetOrdersRequest.KotlinxSerializer::class)
@SerialName(value = QueryGetOrdersRequest.TYPE_URL)
public data class QueryGetOrdersRequest(
  @ProtobufIndex(index = 1)
  public val contractAddr: String,
  @ProtobufIndex(index = 2)
  public val account: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetOrdersRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGetOrdersRequest> {
    private val delegator: KSerializer<QueryGetOrdersRequest> = QueryGetOrdersRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetOrdersRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetOrdersRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetOrdersRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetOrdersRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetOrdersResponse.KotlinxSerializer::class)
@SerialName(value = QueryGetOrdersResponse.TYPE_URL)
public data class QueryGetOrdersResponse(
  @ProtobufIndex(index = 1)
  public val orders: List<Order>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetOrdersResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGetOrdersResponse> {
    private val delegator: KSerializer<QueryGetOrdersResponse> = QueryGetOrdersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetOrdersResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetOrdersResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetOrdersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetOrdersResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetOrderByIDRequest.KotlinxSerializer::class)
@SerialName(value = QueryGetOrderByIDRequest.TYPE_URL)
public data class QueryGetOrderByIDRequest(
  @ProtobufIndex(index = 1)
  public val contractAddr: String,
  @ProtobufIndex(index = 2)
  public val priceDenom: String,
  @ProtobufIndex(index = 3)
  public val assetDenom: String,
  @ProtobufIndex(index = 4)
  public val id: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetOrderByIDRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGetOrderByIDRequest> {
    private val delegator: KSerializer<QueryGetOrderByIDRequest> =
        QueryGetOrderByIDRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetOrderByIDRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetOrderByIDRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetOrderByIDRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetOrderByIDRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetOrderByIDResponse.KotlinxSerializer::class)
@SerialName(value = QueryGetOrderByIDResponse.TYPE_URL)
public data class QueryGetOrderByIDResponse(
  @ProtobufIndex(index = 1)
  public val order: Order,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetOrderByIDResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGetOrderByIDResponse> {
    private val delegator: KSerializer<QueryGetOrderByIDResponse> =
        QueryGetOrderByIDResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetOrderByIDResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetOrderByIDResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetOrderByIDResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetOrderByIDResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetHistoricalPricesRequest.KotlinxSerializer::class)
@SerialName(value = QueryGetHistoricalPricesRequest.TYPE_URL)
public data class QueryGetHistoricalPricesRequest(
  @ProtobufIndex(index = 1)
  public val contractAddr: String,
  @ProtobufIndex(index = 2)
  public val priceDenom: String,
  @ProtobufIndex(index = 3)
  public val assetDenom: String,
  @ProtobufIndex(index = 4)
  public val periodLengthInSeconds: ULong,
  @ProtobufIndex(index = 5)
  public val numOfPeriods: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetHistoricalPricesRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGetHistoricalPricesRequest> {
    private val delegator: KSerializer<QueryGetHistoricalPricesRequest> =
        QueryGetHistoricalPricesRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetHistoricalPricesRequest):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetHistoricalPricesRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetHistoricalPricesRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetHistoricalPricesRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetHistoricalPricesResponse.KotlinxSerializer::class)
@SerialName(value = QueryGetHistoricalPricesResponse.TYPE_URL)
public data class QueryGetHistoricalPricesResponse(
  @ProtobufIndex(index = 1)
  public val prices: List<PriceCandlestick>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetHistoricalPricesResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGetHistoricalPricesResponse> {
    private val delegator: KSerializer<QueryGetHistoricalPricesResponse> =
        QueryGetHistoricalPricesResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetHistoricalPricesResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetHistoricalPricesResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetHistoricalPricesResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetHistoricalPricesResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetMarketSummaryRequest.KotlinxSerializer::class)
@SerialName(value = QueryGetMarketSummaryRequest.TYPE_URL)
public data class QueryGetMarketSummaryRequest(
  @ProtobufIndex(index = 1)
  public val contractAddr: String,
  @ProtobufIndex(index = 2)
  public val priceDenom: String,
  @ProtobufIndex(index = 3)
  public val assetDenom: String,
  @ProtobufIndex(index = 4)
  public val lookbackInSeconds: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetMarketSummaryRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGetMarketSummaryRequest> {
    private val delegator: KSerializer<QueryGetMarketSummaryRequest> =
        QueryGetMarketSummaryRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetMarketSummaryRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetMarketSummaryRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetMarketSummaryRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetMarketSummaryRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetMarketSummaryResponse.KotlinxSerializer::class)
@SerialName(value = QueryGetMarketSummaryResponse.TYPE_URL)
public data class QueryGetMarketSummaryResponse(
  @ProtobufIndex(index = 1)
  public val totalVolume: String,
  @ProtobufIndex(index = 2)
  public val totalVolumeNotional: String,
  @ProtobufIndex(index = 3)
  public val highPrice: String,
  @ProtobufIndex(index = 4)
  public val lowPrice: String,
  @ProtobufIndex(index = 5)
  public val lastPrice: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetMarketSummaryResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGetMarketSummaryResponse> {
    private val delegator: KSerializer<QueryGetMarketSummaryResponse> =
        QueryGetMarketSummaryResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetMarketSummaryResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetMarketSummaryResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetMarketSummaryResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetMarketSummaryResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryOrderSimulationRequest.KotlinxSerializer::class)
@SerialName(value = QueryOrderSimulationRequest.TYPE_URL)
public data class QueryOrderSimulationRequest(
  @ProtobufIndex(index = 1)
  public val order: Order,
  @ProtobufIndex(index = 2)
  public val contractAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryOrderSimulationRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryOrderSimulationRequest> {
    private val delegator: KSerializer<QueryOrderSimulationRequest> =
        QueryOrderSimulationRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryOrderSimulationRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryOrderSimulationRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryOrderSimulationRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryOrderSimulationRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryOrderSimulationResponse.KotlinxSerializer::class)
@SerialName(value = QueryOrderSimulationResponse.TYPE_URL)
public data class QueryOrderSimulationResponse(
  @ProtobufIndex(index = 1)
  public val executedQuantity: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryOrderSimulationResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryOrderSimulationResponse> {
    private val delegator: KSerializer<QueryOrderSimulationResponse> =
        QueryOrderSimulationResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryOrderSimulationResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryOrderSimulationResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryOrderSimulationResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryOrderSimulationResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetMatchResultRequest.KotlinxSerializer::class)
@SerialName(value = QueryGetMatchResultRequest.TYPE_URL)
public data class QueryGetMatchResultRequest(
  @ProtobufIndex(index = 1)
  public val contractAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetMatchResultRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGetMatchResultRequest> {
    private val delegator: KSerializer<QueryGetMatchResultRequest> =
        QueryGetMatchResultRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetMatchResultRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetMatchResultRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetMatchResultRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetMatchResultRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetMatchResultResponse.KotlinxSerializer::class)
@SerialName(value = QueryGetMatchResultResponse.TYPE_URL)
public data class QueryGetMatchResultResponse(
  @ProtobufIndex(index = 1)
  public val result: MatchResult,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetMatchResultResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGetMatchResultResponse> {
    private val delegator: KSerializer<QueryGetMatchResultResponse> =
        QueryGetMatchResultResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetMatchResultResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetMatchResultResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetMatchResultResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetMatchResultResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetOrderCountRequest.KotlinxSerializer::class)
@SerialName(value = QueryGetOrderCountRequest.TYPE_URL)
public data class QueryGetOrderCountRequest(
  @ProtobufIndex(index = 1)
  public val contractAddr: String,
  @ProtobufIndex(index = 2)
  public val priceDenom: String,
  @ProtobufIndex(index = 3)
  public val assetDenom: String,
  @ProtobufIndex(index = 4)
  public val price: String,
  @ProtobufIndex(index = 5)
  public val positionDirection: PositionDirection,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetOrderCountRequest"
  }

  public object KotlinxSerializer : KSerializer<QueryGetOrderCountRequest> {
    private val delegator: KSerializer<QueryGetOrderCountRequest> =
        QueryGetOrderCountRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetOrderCountRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetOrderCountRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetOrderCountRequest {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetOrderCountRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = QueryGetOrderCountResponse.KotlinxSerializer::class)
@SerialName(value = QueryGetOrderCountResponse.TYPE_URL)
public data class QueryGetOrderCountResponse(
  @ProtobufIndex(index = 1)
  public val count: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.QueryGetOrderCountResponse"
  }

  public object KotlinxSerializer : KSerializer<QueryGetOrderCountResponse> {
    private val delegator: KSerializer<QueryGetOrderCountResponse> =
        QueryGetOrderCountResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: QueryGetOrderCountResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(QueryGetOrderCountResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): QueryGetOrderCountResponse {
      if (decoder is ProtobufMapperDecoder) {
        return QueryGetOrderCountResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

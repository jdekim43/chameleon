// Transform from cosmos/tx/v1beta1/service.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.tx.v1beta1

import cosmos.base.abci.v1beta1.GasInfo
import cosmos.base.abci.v1beta1.Result
import cosmos.base.abci.v1beta1.TxResponse
import cosmos.base.query.v1beta1.PageRequest
import cosmos.base.query.v1beta1.PageResponse
import kotlin.ByteArray
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.ReplaceWith
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
import tendermint.types.Block
import tendermint.types.BlockID

@Serializable
@SerialName(value = "/cosmos.tx.v1beta1.OrderBy")
public enum class OrderBy(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  ORDER_BY_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  ORDER_BY_ASC(1),
  @ProtobufIndex(index = 2)
  ORDER_BY_DESC(2),
  ;

  public companion object {
    public fun forNumber(number: Int): OrderBy = OrderBy.values()
    	.first { it.number == number }
  }
}

@Serializable
@SerialName(value = "/cosmos.tx.v1beta1.BroadcastMode")
public enum class BroadcastMode(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  BROADCAST_MODE_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  BROADCAST_MODE_BLOCK(1),
  @ProtobufIndex(index = 2)
  BROADCAST_MODE_SYNC(2),
  @ProtobufIndex(index = 3)
  BROADCAST_MODE_ASYNC(3),
  ;

  public companion object {
    public fun forNumber(number: Int): BroadcastMode = BroadcastMode.values()
    	.first { it.number == number }
  }
}

@Serializable(with = GetTxsEventRequest.KotlinxSerializer::class)
@SerialName(value = GetTxsEventRequest.TYPE_URL)
public data class GetTxsEventRequest(
  @ProtobufIndex(index = 1)
  public val events: List<String>,
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
  @ProtobufIndex(index = 3)
  public val orderBy: OrderBy,
  @ProtobufIndex(index = 4)
  public val page: ULong,
  @ProtobufIndex(index = 5)
  public val limit: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.GetTxsEventRequest"
  }

  public object KotlinxSerializer : KSerializer<GetTxsEventRequest> {
    private val delegator: KSerializer<GetTxsEventRequest> = GetTxsEventRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetTxsEventRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetTxsEventRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetTxsEventRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetTxsEventRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetTxsEventResponse.KotlinxSerializer::class)
@SerialName(value = GetTxsEventResponse.TYPE_URL)
public data class GetTxsEventResponse(
  @ProtobufIndex(index = 1)
  public val txs: List<Tx>,
  @ProtobufIndex(index = 2)
  public val txResponses: List<TxResponse>,
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 3)
  public val pagination: PageResponse,
  @ProtobufIndex(index = 4)
  public val total: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.GetTxsEventResponse"
  }

  public object KotlinxSerializer : KSerializer<GetTxsEventResponse> {
    private val delegator: KSerializer<GetTxsEventResponse> = GetTxsEventResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetTxsEventResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetTxsEventResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetTxsEventResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetTxsEventResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BroadcastTxRequest.KotlinxSerializer::class)
@SerialName(value = BroadcastTxRequest.TYPE_URL)
public data class BroadcastTxRequest(
  @ProtobufIndex(index = 1)
  public val txBytes: ByteArray,
  @ProtobufIndex(index = 2)
  public val mode: BroadcastMode,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.BroadcastTxRequest"
  }

  public object KotlinxSerializer : KSerializer<BroadcastTxRequest> {
    private val delegator: KSerializer<BroadcastTxRequest> = BroadcastTxRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BroadcastTxRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BroadcastTxRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BroadcastTxRequest {
      if (decoder is ProtobufMapperDecoder) {
        return BroadcastTxRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = BroadcastTxResponse.KotlinxSerializer::class)
@SerialName(value = BroadcastTxResponse.TYPE_URL)
public data class BroadcastTxResponse(
  @ProtobufIndex(index = 1)
  public val txResponse: TxResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.BroadcastTxResponse"
  }

  public object KotlinxSerializer : KSerializer<BroadcastTxResponse> {
    private val delegator: KSerializer<BroadcastTxResponse> = BroadcastTxResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: BroadcastTxResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(BroadcastTxResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): BroadcastTxResponse {
      if (decoder is ProtobufMapperDecoder) {
        return BroadcastTxResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SimulateRequest.KotlinxSerializer::class)
@SerialName(value = SimulateRequest.TYPE_URL)
public data class SimulateRequest(
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 1)
  public val tx: Tx,
  @ProtobufIndex(index = 2)
  public val txBytes: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.SimulateRequest"
  }

  public object KotlinxSerializer : KSerializer<SimulateRequest> {
    private val delegator: KSerializer<SimulateRequest> = SimulateRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SimulateRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SimulateRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SimulateRequest {
      if (decoder is ProtobufMapperDecoder) {
        return SimulateRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SimulateResponse.KotlinxSerializer::class)
@SerialName(value = SimulateResponse.TYPE_URL)
public data class SimulateResponse(
  @ProtobufIndex(index = 1)
  public val gasInfo: GasInfo,
  @ProtobufIndex(index = 2)
  public val result: Result,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.SimulateResponse"
  }

  public object KotlinxSerializer : KSerializer<SimulateResponse> {
    private val delegator: KSerializer<SimulateResponse> = SimulateResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SimulateResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SimulateResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SimulateResponse {
      if (decoder is ProtobufMapperDecoder) {
        return SimulateResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetTxRequest.KotlinxSerializer::class)
@SerialName(value = GetTxRequest.TYPE_URL)
public data class GetTxRequest(
  @ProtobufIndex(index = 1)
  public val hash: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.GetTxRequest"
  }

  public object KotlinxSerializer : KSerializer<GetTxRequest> {
    private val delegator: KSerializer<GetTxRequest> = GetTxRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetTxRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetTxRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetTxRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetTxRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetTxResponse.KotlinxSerializer::class)
@SerialName(value = GetTxResponse.TYPE_URL)
public data class GetTxResponse(
  @ProtobufIndex(index = 1)
  public val tx: Tx,
  @ProtobufIndex(index = 2)
  public val txResponse: TxResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.GetTxResponse"
  }

  public object KotlinxSerializer : KSerializer<GetTxResponse> {
    private val delegator: KSerializer<GetTxResponse> = GetTxResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetTxResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetTxResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetTxResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetTxResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetBlockWithTxsRequest.KotlinxSerializer::class)
@SerialName(value = GetBlockWithTxsRequest.TYPE_URL)
public data class GetBlockWithTxsRequest(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val pagination: PageRequest,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.GetBlockWithTxsRequest"
  }

  public object KotlinxSerializer : KSerializer<GetBlockWithTxsRequest> {
    private val delegator: KSerializer<GetBlockWithTxsRequest> = GetBlockWithTxsRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetBlockWithTxsRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetBlockWithTxsRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetBlockWithTxsRequest {
      if (decoder is ProtobufMapperDecoder) {
        return GetBlockWithTxsRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GetBlockWithTxsResponse.KotlinxSerializer::class)
@SerialName(value = GetBlockWithTxsResponse.TYPE_URL)
public data class GetBlockWithTxsResponse(
  @ProtobufIndex(index = 1)
  public val txs: List<Tx>,
  @ProtobufIndex(index = 2)
  public val blockId: BlockID,
  @ProtobufIndex(index = 3)
  public val block: Block,
  @ProtobufIndex(index = 4)
  public val pagination: PageResponse,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.GetBlockWithTxsResponse"
  }

  public object KotlinxSerializer : KSerializer<GetBlockWithTxsResponse> {
    private val delegator: KSerializer<GetBlockWithTxsResponse> =
        GetBlockWithTxsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GetBlockWithTxsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GetBlockWithTxsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GetBlockWithTxsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return GetBlockWithTxsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxDecodeRequest.KotlinxSerializer::class)
@SerialName(value = TxDecodeRequest.TYPE_URL)
public data class TxDecodeRequest(
  @ProtobufIndex(index = 1)
  public val txBytes: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.TxDecodeRequest"
  }

  public object KotlinxSerializer : KSerializer<TxDecodeRequest> {
    private val delegator: KSerializer<TxDecodeRequest> = TxDecodeRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxDecodeRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxDecodeRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxDecodeRequest {
      if (decoder is ProtobufMapperDecoder) {
        return TxDecodeRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxDecodeResponse.KotlinxSerializer::class)
@SerialName(value = TxDecodeResponse.TYPE_URL)
public data class TxDecodeResponse(
  @ProtobufIndex(index = 1)
  public val tx: Tx,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.TxDecodeResponse"
  }

  public object KotlinxSerializer : KSerializer<TxDecodeResponse> {
    private val delegator: KSerializer<TxDecodeResponse> = TxDecodeResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxDecodeResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxDecodeResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxDecodeResponse {
      if (decoder is ProtobufMapperDecoder) {
        return TxDecodeResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxEncodeRequest.KotlinxSerializer::class)
@SerialName(value = TxEncodeRequest.TYPE_URL)
public data class TxEncodeRequest(
  @ProtobufIndex(index = 1)
  public val tx: Tx,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.TxEncodeRequest"
  }

  public object KotlinxSerializer : KSerializer<TxEncodeRequest> {
    private val delegator: KSerializer<TxEncodeRequest> = TxEncodeRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxEncodeRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxEncodeRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxEncodeRequest {
      if (decoder is ProtobufMapperDecoder) {
        return TxEncodeRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxEncodeResponse.KotlinxSerializer::class)
@SerialName(value = TxEncodeResponse.TYPE_URL)
public data class TxEncodeResponse(
  @ProtobufIndex(index = 1)
  public val txBytes: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.TxEncodeResponse"
  }

  public object KotlinxSerializer : KSerializer<TxEncodeResponse> {
    private val delegator: KSerializer<TxEncodeResponse> = TxEncodeResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxEncodeResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxEncodeResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxEncodeResponse {
      if (decoder is ProtobufMapperDecoder) {
        return TxEncodeResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxEncodeAminoRequest.KotlinxSerializer::class)
@SerialName(value = TxEncodeAminoRequest.TYPE_URL)
public data class TxEncodeAminoRequest(
  @ProtobufIndex(index = 1)
  public val aminoJson: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.TxEncodeAminoRequest"
  }

  public object KotlinxSerializer : KSerializer<TxEncodeAminoRequest> {
    private val delegator: KSerializer<TxEncodeAminoRequest> = TxEncodeAminoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxEncodeAminoRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxEncodeAminoRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxEncodeAminoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return TxEncodeAminoRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxEncodeAminoResponse.KotlinxSerializer::class)
@SerialName(value = TxEncodeAminoResponse.TYPE_URL)
public data class TxEncodeAminoResponse(
  @ProtobufIndex(index = 1)
  public val aminoBinary: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.TxEncodeAminoResponse"
  }

  public object KotlinxSerializer : KSerializer<TxEncodeAminoResponse> {
    private val delegator: KSerializer<TxEncodeAminoResponse> = TxEncodeAminoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxEncodeAminoResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxEncodeAminoResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxEncodeAminoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return TxEncodeAminoResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxDecodeAminoRequest.KotlinxSerializer::class)
@SerialName(value = TxDecodeAminoRequest.TYPE_URL)
public data class TxDecodeAminoRequest(
  @ProtobufIndex(index = 1)
  public val aminoBinary: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.TxDecodeAminoRequest"
  }

  public object KotlinxSerializer : KSerializer<TxDecodeAminoRequest> {
    private val delegator: KSerializer<TxDecodeAminoRequest> = TxDecodeAminoRequest.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxDecodeAminoRequest): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxDecodeAminoRequestConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxDecodeAminoRequest {
      if (decoder is ProtobufMapperDecoder) {
        return TxDecodeAminoRequestConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxDecodeAminoResponse.KotlinxSerializer::class)
@SerialName(value = TxDecodeAminoResponse.TYPE_URL)
public data class TxDecodeAminoResponse(
  @ProtobufIndex(index = 1)
  public val aminoJson: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.TxDecodeAminoResponse"
  }

  public object KotlinxSerializer : KSerializer<TxDecodeAminoResponse> {
    private val delegator: KSerializer<TxDecodeAminoResponse> = TxDecodeAminoResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxDecodeAminoResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxDecodeAminoResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxDecodeAminoResponse {
      if (decoder is ProtobufMapperDecoder) {
        return TxDecodeAminoResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

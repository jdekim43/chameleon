// Transform from cosmos/base/abci/v1beta1/abci.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.abci.v1beta1

import google.protobuf.Any
import kotlin.ByteArray
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Long
import kotlin.ReplaceWith
import kotlin.String
import kotlin.UInt
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
import tendermint.abci.Event

@Serializable(with = TxResponse.KotlinxSerializer::class)
@SerialName(value = TxResponse.TYPE_URL)
public data class TxResponse(
  @ProtobufIndex(index = 1)
  public val height: Long,
  @ProtobufIndex(index = 2)
  public val txhash: String,
  @ProtobufIndex(index = 3)
  public val codespace: String,
  @ProtobufIndex(index = 4)
  public val code: UInt,
  @ProtobufIndex(index = 5)
  public val `data`: String,
  @ProtobufIndex(index = 6)
  public val rawLog: String,
  @ProtobufIndex(index = 7)
  public val logs: List<ABCIMessageLog>,
  @ProtobufIndex(index = 8)
  public val info: String,
  @ProtobufIndex(index = 9)
  public val gasWanted: Long,
  @ProtobufIndex(index = 10)
  public val gasUsed: Long,
  @ProtobufIndex(index = 11)
  public val tx: Any,
  @ProtobufIndex(index = 12)
  public val timestamp: String,
  @ProtobufIndex(index = 13)
  public val events: List<Event>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.abci.v1beta1.TxResponse"
  }

  public object KotlinxSerializer : KSerializer<TxResponse> {
    private val delegator: KSerializer<TxResponse> = TxResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxResponse {
      if (decoder is ProtobufMapperDecoder) {
        return TxResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ABCIMessageLog.KotlinxSerializer::class)
@SerialName(value = ABCIMessageLog.TYPE_URL)
public data class ABCIMessageLog(
  @ProtobufIndex(index = 1)
  public val msgIndex: UInt,
  @ProtobufIndex(index = 2)
  public val log: String,
  @ProtobufIndex(index = 3)
  public val events: List<StringEvent>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.abci.v1beta1.ABCIMessageLog"
  }

  public object KotlinxSerializer : KSerializer<ABCIMessageLog> {
    private val delegator: KSerializer<ABCIMessageLog> = ABCIMessageLog.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ABCIMessageLog): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ABCIMessageLogConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ABCIMessageLog {
      if (decoder is ProtobufMapperDecoder) {
        return ABCIMessageLogConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = StringEvent.KotlinxSerializer::class)
@SerialName(value = StringEvent.TYPE_URL)
public data class StringEvent(
  @ProtobufIndex(index = 1)
  public val type: String,
  @ProtobufIndex(index = 2)
  public val attributes: List<Attribute>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.abci.v1beta1.StringEvent"
  }

  public object KotlinxSerializer : KSerializer<StringEvent> {
    private val delegator: KSerializer<StringEvent> = StringEvent.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: StringEvent): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(StringEventConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): StringEvent {
      if (decoder is ProtobufMapperDecoder) {
        return StringEventConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Attribute.KotlinxSerializer::class)
@SerialName(value = Attribute.TYPE_URL)
public data class Attribute(
  @ProtobufIndex(index = 1)
  public val key: String,
  @ProtobufIndex(index = 2)
  public val `value`: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.abci.v1beta1.Attribute"
  }

  public object KotlinxSerializer : KSerializer<Attribute> {
    private val delegator: KSerializer<Attribute> = Attribute.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Attribute): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AttributeConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Attribute {
      if (decoder is ProtobufMapperDecoder) {
        return AttributeConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = GasInfo.KotlinxSerializer::class)
@SerialName(value = GasInfo.TYPE_URL)
public data class GasInfo(
  @ProtobufIndex(index = 1)
  public val gasWanted: ULong,
  @ProtobufIndex(index = 2)
  public val gasUsed: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.abci.v1beta1.GasInfo"
  }

  public object KotlinxSerializer : KSerializer<GasInfo> {
    private val delegator: KSerializer<GasInfo> = GasInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: GasInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(GasInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): GasInfo {
      if (decoder is ProtobufMapperDecoder) {
        return GasInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Result.KotlinxSerializer::class)
@SerialName(value = Result.TYPE_URL)
public data class Result(
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 1)
  public val `data`: ByteArray,
  @ProtobufIndex(index = 2)
  public val log: String,
  @ProtobufIndex(index = 3)
  public val events: List<Event>,
  @ProtobufIndex(index = 4)
  public val msgResponses: List<Any>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.abci.v1beta1.Result"
  }

  public object KotlinxSerializer : KSerializer<Result> {
    private val delegator: KSerializer<Result> = Result.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Result): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ResultConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Result {
      if (decoder is ProtobufMapperDecoder) {
        return ResultConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SimulationResponse.KotlinxSerializer::class)
@SerialName(value = SimulationResponse.TYPE_URL)
public data class SimulationResponse(
  @ProtobufIndex(index = 1)
  public val gasInfo: GasInfo,
  @ProtobufIndex(index = 2)
  public val result: Result,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.abci.v1beta1.SimulationResponse"
  }

  public object KotlinxSerializer : KSerializer<SimulationResponse> {
    private val delegator: KSerializer<SimulationResponse> = SimulationResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SimulationResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SimulationResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SimulationResponse {
      if (decoder is ProtobufMapperDecoder) {
        return SimulationResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgData.KotlinxSerializer::class)
@SerialName(value = MsgData.TYPE_URL)
public data class MsgData(
  @ProtobufIndex(index = 1)
  public val msgType: String,
  @ProtobufIndex(index = 2)
  public val `data`: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.abci.v1beta1.MsgData"
  }

  public object KotlinxSerializer : KSerializer<MsgData> {
    private val delegator: KSerializer<MsgData> = MsgData.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgData): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgDataConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgData {
      if (decoder is ProtobufMapperDecoder) {
        return MsgDataConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxMsgData.KotlinxSerializer::class)
@SerialName(value = TxMsgData.TYPE_URL)
public data class TxMsgData(
  @Deprecated(
    message = "",
    replaceWith = ReplaceWith(""),
    level = DeprecationLevel.WARNING,
  )
  @ProtobufIndex(index = 1)
  public val `data`: List<MsgData>,
  @ProtobufIndex(index = 2)
  public val msgResponses: List<Any>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.abci.v1beta1.TxMsgData"
  }

  public object KotlinxSerializer : KSerializer<TxMsgData> {
    private val delegator: KSerializer<TxMsgData> = TxMsgData.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxMsgData): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxMsgDataConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxMsgData {
      if (decoder is ProtobufMapperDecoder) {
        return TxMsgDataConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SearchTxsResult.KotlinxSerializer::class)
@SerialName(value = SearchTxsResult.TYPE_URL)
public data class SearchTxsResult(
  @ProtobufIndex(index = 1)
  public val totalCount: ULong,
  @ProtobufIndex(index = 2)
  public val count: ULong,
  @ProtobufIndex(index = 3)
  public val pageNumber: ULong,
  @ProtobufIndex(index = 4)
  public val pageTotal: ULong,
  @ProtobufIndex(index = 5)
  public val limit: ULong,
  @ProtobufIndex(index = 6)
  public val txs: List<TxResponse>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.base.abci.v1beta1.SearchTxsResult"
  }

  public object KotlinxSerializer : KSerializer<SearchTxsResult> {
    private val delegator: KSerializer<SearchTxsResult> = SearchTxsResult.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SearchTxsResult): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SearchTxsResultConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SearchTxsResult {
      if (decoder is ProtobufMapperDecoder) {
        return SearchTxsResultConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

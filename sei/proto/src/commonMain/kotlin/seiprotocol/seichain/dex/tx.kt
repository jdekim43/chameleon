// Transform from dex/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.dex

import cosmos.base.v1beta1.Coin
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

@Serializable(with = MsgPlaceOrders.KotlinxSerializer::class)
@SerialName(value = MsgPlaceOrders.TYPE_URL)
public data class MsgPlaceOrders(
  @ProtobufIndex(index = 1)
  public val creator: String,
  @ProtobufIndex(index = 2)
  public val orders: List<Order>,
  @ProtobufIndex(index = 3)
  public val contractAddr: String,
  @ProtobufIndex(index = 4)
  public val funds: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.MsgPlaceOrders"
  }

  public object KotlinxSerializer : KSerializer<MsgPlaceOrders> {
    private val delegator: KSerializer<MsgPlaceOrders> = MsgPlaceOrders.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgPlaceOrders): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgPlaceOrdersConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgPlaceOrders {
      if (decoder is ProtobufMapperDecoder) {
        return MsgPlaceOrdersConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgPlaceOrdersResponse.KotlinxSerializer::class)
@SerialName(value = MsgPlaceOrdersResponse.TYPE_URL)
public data class MsgPlaceOrdersResponse(
  @ProtobufIndex(index = 1)
  public val orderIds: List<ULong>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.MsgPlaceOrdersResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgPlaceOrdersResponse> {
    private val delegator: KSerializer<MsgPlaceOrdersResponse> = MsgPlaceOrdersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgPlaceOrdersResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgPlaceOrdersResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgPlaceOrdersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgPlaceOrdersResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCancelOrders.KotlinxSerializer::class)
@SerialName(value = MsgCancelOrders.TYPE_URL)
public data class MsgCancelOrders(
  @ProtobufIndex(index = 1)
  public val creator: String,
  @ProtobufIndex(index = 2)
  public val cancellations: List<Cancellation>,
  @ProtobufIndex(index = 3)
  public val contractAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.MsgCancelOrders"
  }

  public object KotlinxSerializer : KSerializer<MsgCancelOrders> {
    private val delegator: KSerializer<MsgCancelOrders> = MsgCancelOrders.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCancelOrders): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCancelOrdersConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCancelOrders {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCancelOrdersConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCancelOrdersResponse.KotlinxSerializer::class)
@SerialName(value = MsgCancelOrdersResponse.TYPE_URL)
public class MsgCancelOrdersResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.MsgCancelOrdersResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCancelOrdersResponse> {
    private val delegator: KSerializer<MsgCancelOrdersResponse> =
        MsgCancelOrdersResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCancelOrdersResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCancelOrdersResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCancelOrdersResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCancelOrdersResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRegisterContract.KotlinxSerializer::class)
@SerialName(value = MsgRegisterContract.TYPE_URL)
public data class MsgRegisterContract(
  @ProtobufIndex(index = 1)
  public val creator: String,
  @ProtobufIndex(index = 2)
  public val contract: ContractInfoV2,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.MsgRegisterContract"
  }

  public object KotlinxSerializer : KSerializer<MsgRegisterContract> {
    private val delegator: KSerializer<MsgRegisterContract> = MsgRegisterContract.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRegisterContract): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRegisterContractConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRegisterContract {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRegisterContractConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRegisterContractResponse.KotlinxSerializer::class)
@SerialName(value = MsgRegisterContractResponse.TYPE_URL)
public class MsgRegisterContractResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.MsgRegisterContractResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgRegisterContractResponse> {
    private val delegator: KSerializer<MsgRegisterContractResponse> =
        MsgRegisterContractResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRegisterContractResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRegisterContractResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRegisterContractResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRegisterContractResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgContractDepositRent.KotlinxSerializer::class)
@SerialName(value = MsgContractDepositRent.TYPE_URL)
public data class MsgContractDepositRent(
  @ProtobufIndex(index = 1)
  public val contractAddr: String,
  @ProtobufIndex(index = 2)
  public val amount: ULong,
  @ProtobufIndex(index = 3)
  public val sender: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.MsgContractDepositRent"
  }

  public object KotlinxSerializer : KSerializer<MsgContractDepositRent> {
    private val delegator: KSerializer<MsgContractDepositRent> = MsgContractDepositRent.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgContractDepositRent): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgContractDepositRentConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgContractDepositRent {
      if (decoder is ProtobufMapperDecoder) {
        return MsgContractDepositRentConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgContractDepositRentResponse.KotlinxSerializer::class)
@SerialName(value = MsgContractDepositRentResponse.TYPE_URL)
public class MsgContractDepositRentResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.MsgContractDepositRentResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgContractDepositRentResponse> {
    private val delegator: KSerializer<MsgContractDepositRentResponse> =
        MsgContractDepositRentResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgContractDepositRentResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgContractDepositRentResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgContractDepositRentResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgContractDepositRentResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUnregisterContract.KotlinxSerializer::class)
@SerialName(value = MsgUnregisterContract.TYPE_URL)
public data class MsgUnregisterContract(
  @ProtobufIndex(index = 1)
  public val creator: String,
  @ProtobufIndex(index = 2)
  public val contractAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.MsgUnregisterContract"
  }

  public object KotlinxSerializer : KSerializer<MsgUnregisterContract> {
    private val delegator: KSerializer<MsgUnregisterContract> = MsgUnregisterContract.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUnregisterContract): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUnregisterContractConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUnregisterContract {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUnregisterContractConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUnregisterContractResponse.KotlinxSerializer::class)
@SerialName(value = MsgUnregisterContractResponse.TYPE_URL)
public class MsgUnregisterContractResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.MsgUnregisterContractResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgUnregisterContractResponse> {
    private val delegator: KSerializer<MsgUnregisterContractResponse> =
        MsgUnregisterContractResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUnregisterContractResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUnregisterContractResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUnregisterContractResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUnregisterContractResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRegisterPairs.KotlinxSerializer::class)
@SerialName(value = MsgRegisterPairs.TYPE_URL)
public data class MsgRegisterPairs(
  @ProtobufIndex(index = 1)
  public val creator: String,
  @ProtobufIndex(index = 3)
  public val batchcontractpair: List<BatchContractPair>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.MsgRegisterPairs"
  }

  public object KotlinxSerializer : KSerializer<MsgRegisterPairs> {
    private val delegator: KSerializer<MsgRegisterPairs> = MsgRegisterPairs.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRegisterPairs): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRegisterPairsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRegisterPairs {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRegisterPairsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgRegisterPairsResponse.KotlinxSerializer::class)
@SerialName(value = MsgRegisterPairsResponse.TYPE_URL)
public class MsgRegisterPairsResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.MsgRegisterPairsResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgRegisterPairsResponse> {
    private val delegator: KSerializer<MsgRegisterPairsResponse> =
        MsgRegisterPairsResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgRegisterPairsResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgRegisterPairsResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgRegisterPairsResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgRegisterPairsResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdatePriceTickSize.KotlinxSerializer::class)
@SerialName(value = MsgUpdatePriceTickSize.TYPE_URL)
public data class MsgUpdatePriceTickSize(
  @ProtobufIndex(index = 1)
  public val creator: String,
  @ProtobufIndex(index = 2)
  public val tickSizeList: List<TickSize>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.MsgUpdatePriceTickSize"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdatePriceTickSize> {
    private val delegator: KSerializer<MsgUpdatePriceTickSize> = MsgUpdatePriceTickSize.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdatePriceTickSize): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdatePriceTickSizeConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdatePriceTickSize {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdatePriceTickSizeConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateQuantityTickSize.KotlinxSerializer::class)
@SerialName(value = MsgUpdateQuantityTickSize.TYPE_URL)
public data class MsgUpdateQuantityTickSize(
  @ProtobufIndex(index = 1)
  public val creator: String,
  @ProtobufIndex(index = 2)
  public val tickSizeList: List<TickSize>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.MsgUpdateQuantityTickSize"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateQuantityTickSize> {
    private val delegator: KSerializer<MsgUpdateQuantityTickSize> =
        MsgUpdateQuantityTickSize.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateQuantityTickSize): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateQuantityTickSizeConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateQuantityTickSize {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateQuantityTickSizeConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUpdateTickSizeResponse.KotlinxSerializer::class)
@SerialName(value = MsgUpdateTickSizeResponse.TYPE_URL)
public class MsgUpdateTickSizeResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.MsgUpdateTickSizeResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgUpdateTickSizeResponse> {
    private val delegator: KSerializer<MsgUpdateTickSizeResponse> =
        MsgUpdateTickSizeResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUpdateTickSizeResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUpdateTickSizeResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUpdateTickSizeResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUpdateTickSizeResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUnsuspendContract.KotlinxSerializer::class)
@SerialName(value = MsgUnsuspendContract.TYPE_URL)
public data class MsgUnsuspendContract(
  @ProtobufIndex(index = 1)
  public val creator: String,
  @ProtobufIndex(index = 2)
  public val contractAddr: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.MsgUnsuspendContract"
  }

  public object KotlinxSerializer : KSerializer<MsgUnsuspendContract> {
    private val delegator: KSerializer<MsgUnsuspendContract> = MsgUnsuspendContract.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUnsuspendContract): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUnsuspendContractConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUnsuspendContract {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUnsuspendContractConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgUnsuspendContractResponse.KotlinxSerializer::class)
@SerialName(value = MsgUnsuspendContractResponse.TYPE_URL)
public class MsgUnsuspendContractResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/seiprotocol.seichain.dex.MsgUnsuspendContractResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgUnsuspendContractResponse> {
    private val delegator: KSerializer<MsgUnsuspendContractResponse> =
        MsgUnsuspendContractResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgUnsuspendContractResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgUnsuspendContractResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgUnsuspendContractResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgUnsuspendContractResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

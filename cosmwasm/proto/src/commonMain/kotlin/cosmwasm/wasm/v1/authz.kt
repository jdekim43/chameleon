// Transform from cosmwasm/wasm/v1/authz.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmwasm.wasm.v1

import cosmos.base.v1beta1.Coin
import google.protobuf.Any
import kotlin.ByteArray
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

@Serializable(with = ContractExecutionAuthorization.KotlinxSerializer::class)
@SerialName(value = ContractExecutionAuthorization.TYPE_URL)
public data class ContractExecutionAuthorization(
  @ProtobufIndex(index = 1)
  public val grants: List<ContractGrant>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.ContractExecutionAuthorization"
  }

  public object KotlinxSerializer : KSerializer<ContractExecutionAuthorization> {
    private val delegator: KSerializer<ContractExecutionAuthorization> =
        ContractExecutionAuthorization.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ContractExecutionAuthorization): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ContractExecutionAuthorizationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ContractExecutionAuthorization {
      if (decoder is ProtobufMapperDecoder) {
        return ContractExecutionAuthorizationConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ContractMigrationAuthorization.KotlinxSerializer::class)
@SerialName(value = ContractMigrationAuthorization.TYPE_URL)
public data class ContractMigrationAuthorization(
  @ProtobufIndex(index = 1)
  public val grants: List<ContractGrant>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.ContractMigrationAuthorization"
  }

  public object KotlinxSerializer : KSerializer<ContractMigrationAuthorization> {
    private val delegator: KSerializer<ContractMigrationAuthorization> =
        ContractMigrationAuthorization.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ContractMigrationAuthorization): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ContractMigrationAuthorizationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ContractMigrationAuthorization {
      if (decoder is ProtobufMapperDecoder) {
        return ContractMigrationAuthorizationConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ContractGrant.KotlinxSerializer::class)
@SerialName(value = ContractGrant.TYPE_URL)
public data class ContractGrant(
  @ProtobufIndex(index = 1)
  public val contract: String,
  @ProtobufIndex(index = 2)
  public val limit: Any,
  @ProtobufIndex(index = 3)
  public val filter: Any,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.ContractGrant"
  }

  public object KotlinxSerializer : KSerializer<ContractGrant> {
    private val delegator: KSerializer<ContractGrant> = ContractGrant.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ContractGrant): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ContractGrantConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ContractGrant {
      if (decoder is ProtobufMapperDecoder) {
        return ContractGrantConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MaxCallsLimit.KotlinxSerializer::class)
@SerialName(value = MaxCallsLimit.TYPE_URL)
public data class MaxCallsLimit(
  @ProtobufIndex(index = 1)
  public val remaining: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MaxCallsLimit"
  }

  public object KotlinxSerializer : KSerializer<MaxCallsLimit> {
    private val delegator: KSerializer<MaxCallsLimit> = MaxCallsLimit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MaxCallsLimit): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MaxCallsLimitConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MaxCallsLimit {
      if (decoder is ProtobufMapperDecoder) {
        return MaxCallsLimitConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MaxFundsLimit.KotlinxSerializer::class)
@SerialName(value = MaxFundsLimit.TYPE_URL)
public data class MaxFundsLimit(
  @ProtobufIndex(index = 1)
  public val amounts: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.MaxFundsLimit"
  }

  public object KotlinxSerializer : KSerializer<MaxFundsLimit> {
    private val delegator: KSerializer<MaxFundsLimit> = MaxFundsLimit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MaxFundsLimit): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MaxFundsLimitConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MaxFundsLimit {
      if (decoder is ProtobufMapperDecoder) {
        return MaxFundsLimitConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = CombinedLimit.KotlinxSerializer::class)
@SerialName(value = CombinedLimit.TYPE_URL)
public data class CombinedLimit(
  @ProtobufIndex(index = 1)
  public val callsRemaining: ULong,
  @ProtobufIndex(index = 2)
  public val amounts: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.CombinedLimit"
  }

  public object KotlinxSerializer : KSerializer<CombinedLimit> {
    private val delegator: KSerializer<CombinedLimit> = CombinedLimit.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: CombinedLimit): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(CombinedLimitConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): CombinedLimit {
      if (decoder is ProtobufMapperDecoder) {
        return CombinedLimitConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AllowAllMessagesFilter.KotlinxSerializer::class)
@SerialName(value = AllowAllMessagesFilter.TYPE_URL)
public class AllowAllMessagesFilter() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.AllowAllMessagesFilter"
  }

  public object KotlinxSerializer : KSerializer<AllowAllMessagesFilter> {
    private val delegator: KSerializer<AllowAllMessagesFilter> = AllowAllMessagesFilter.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AllowAllMessagesFilter): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AllowAllMessagesFilterConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AllowAllMessagesFilter {
      if (decoder is ProtobufMapperDecoder) {
        return AllowAllMessagesFilterConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AcceptedMessageKeysFilter.KotlinxSerializer::class)
@SerialName(value = AcceptedMessageKeysFilter.TYPE_URL)
public data class AcceptedMessageKeysFilter(
  @ProtobufIndex(index = 1)
  public val keys: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.AcceptedMessageKeysFilter"
  }

  public object KotlinxSerializer : KSerializer<AcceptedMessageKeysFilter> {
    private val delegator: KSerializer<AcceptedMessageKeysFilter> =
        AcceptedMessageKeysFilter.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AcceptedMessageKeysFilter): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AcceptedMessageKeysFilterConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AcceptedMessageKeysFilter {
      if (decoder is ProtobufMapperDecoder) {
        return AcceptedMessageKeysFilterConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AcceptedMessagesFilter.KotlinxSerializer::class)
@SerialName(value = AcceptedMessagesFilter.TYPE_URL)
public data class AcceptedMessagesFilter(
  @ProtobufIndex(index = 1)
  public val messages: List<ByteArray>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmwasm.wasm.v1.AcceptedMessagesFilter"
  }

  public object KotlinxSerializer : KSerializer<AcceptedMessagesFilter> {
    private val delegator: KSerializer<AcceptedMessagesFilter> = AcceptedMessagesFilter.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AcceptedMessagesFilter): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AcceptedMessagesFilterConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AcceptedMessagesFilter {
      if (decoder is ProtobufMapperDecoder) {
        return AcceptedMessagesFilterConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

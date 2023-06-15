// Transform from cosmos/vesting/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.vesting.v1beta1

import cosmos.base.v1beta1.Coin
import kotlin.Boolean
import kotlin.Long
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

@Serializable(with = MsgCreateVestingAccount.KotlinxSerializer::class)
@SerialName(value = MsgCreateVestingAccount.TYPE_URL)
public data class MsgCreateVestingAccount(
  @ProtobufIndex(index = 1)
  public val fromAddress: String,
  @ProtobufIndex(index = 2)
  public val toAddress: String,
  @ProtobufIndex(index = 3)
  public val amount: List<Coin>,
  @ProtobufIndex(index = 4)
  public val endTime: Long,
  @ProtobufIndex(index = 5)
  public val delayed: Boolean,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.vesting.v1beta1.MsgCreateVestingAccount"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateVestingAccount> {
    private val delegator: KSerializer<MsgCreateVestingAccount> =
        MsgCreateVestingAccount.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateVestingAccount): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateVestingAccountConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateVestingAccount {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateVestingAccountConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreateVestingAccountResponse.KotlinxSerializer::class)
@SerialName(value = MsgCreateVestingAccountResponse.TYPE_URL)
public class MsgCreateVestingAccountResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.vesting.v1beta1.MsgCreateVestingAccountResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCreateVestingAccountResponse> {
    private val delegator: KSerializer<MsgCreateVestingAccountResponse> =
        MsgCreateVestingAccountResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreateVestingAccountResponse):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreateVestingAccountResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreateVestingAccountResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreateVestingAccountResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreatePermanentLockedAccount.KotlinxSerializer::class)
@SerialName(value = MsgCreatePermanentLockedAccount.TYPE_URL)
public data class MsgCreatePermanentLockedAccount(
  @ProtobufIndex(index = 1)
  public val fromAddress: String,
  @ProtobufIndex(index = 2)
  public val toAddress: String,
  @ProtobufIndex(index = 3)
  public val amount: List<Coin>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.vesting.v1beta1.MsgCreatePermanentLockedAccount"
  }

  public object KotlinxSerializer : KSerializer<MsgCreatePermanentLockedAccount> {
    private val delegator: KSerializer<MsgCreatePermanentLockedAccount> =
        MsgCreatePermanentLockedAccount.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreatePermanentLockedAccount):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreatePermanentLockedAccountConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreatePermanentLockedAccount {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreatePermanentLockedAccountConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreatePermanentLockedAccountResponse.KotlinxSerializer::class)
@SerialName(value = MsgCreatePermanentLockedAccountResponse.TYPE_URL)
public class MsgCreatePermanentLockedAccountResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.vesting.v1beta1.MsgCreatePermanentLockedAccountResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCreatePermanentLockedAccountResponse> {
    private val delegator: KSerializer<MsgCreatePermanentLockedAccountResponse> =
        MsgCreatePermanentLockedAccountResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: MsgCreatePermanentLockedAccountResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreatePermanentLockedAccountResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreatePermanentLockedAccountResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreatePermanentLockedAccountResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreatePeriodicVestingAccount.KotlinxSerializer::class)
@SerialName(value = MsgCreatePeriodicVestingAccount.TYPE_URL)
public data class MsgCreatePeriodicVestingAccount(
  @ProtobufIndex(index = 1)
  public val fromAddress: String,
  @ProtobufIndex(index = 2)
  public val toAddress: String,
  @ProtobufIndex(index = 3)
  public val startTime: Long,
  @ProtobufIndex(index = 4)
  public val vestingPeriods: List<Period>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.vesting.v1beta1.MsgCreatePeriodicVestingAccount"
  }

  public object KotlinxSerializer : KSerializer<MsgCreatePeriodicVestingAccount> {
    private val delegator: KSerializer<MsgCreatePeriodicVestingAccount> =
        MsgCreatePeriodicVestingAccount.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: MsgCreatePeriodicVestingAccount):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreatePeriodicVestingAccountConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreatePeriodicVestingAccount {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreatePeriodicVestingAccountConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = MsgCreatePeriodicVestingAccountResponse.KotlinxSerializer::class)
@SerialName(value = MsgCreatePeriodicVestingAccountResponse.TYPE_URL)
public class MsgCreatePeriodicVestingAccountResponse() : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/cosmos.vesting.v1beta1.MsgCreatePeriodicVestingAccountResponse"
  }

  public object KotlinxSerializer : KSerializer<MsgCreatePeriodicVestingAccountResponse> {
    private val delegator: KSerializer<MsgCreatePeriodicVestingAccountResponse> =
        MsgCreatePeriodicVestingAccountResponse.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder,
        `value`: MsgCreatePeriodicVestingAccountResponse): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(MsgCreatePeriodicVestingAccountResponseConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): MsgCreatePeriodicVestingAccountResponse {
      if (decoder is ProtobufMapperDecoder) {
        return MsgCreatePeriodicVestingAccountResponseConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

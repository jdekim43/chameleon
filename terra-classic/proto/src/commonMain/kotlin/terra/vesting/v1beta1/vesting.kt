// Transform from terra/vesting/v1beta1/vesting.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package terra.vesting.v1beta1

import cosmos.vesting.v1beta1.BaseVestingAccount
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

@Serializable(with = LazyGradedVestingAccount.KotlinxSerializer::class)
@SerialName(value = LazyGradedVestingAccount.TYPE_URL)
public data class LazyGradedVestingAccount(
  @ProtobufIndex(index = 1)
  public val baseVestingAccount: BaseVestingAccount,
  @ProtobufIndex(index = 2)
  public val vestingSchedules: List<VestingSchedule>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.vesting.v1beta1.LazyGradedVestingAccount"
  }

  public object KotlinxSerializer : KSerializer<LazyGradedVestingAccount> {
    private val delegator: KSerializer<LazyGradedVestingAccount> =
        LazyGradedVestingAccount.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: LazyGradedVestingAccount): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(LazyGradedVestingAccountConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): LazyGradedVestingAccount {
      if (decoder is ProtobufMapperDecoder) {
        return LazyGradedVestingAccountConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Schedule.KotlinxSerializer::class)
@SerialName(value = Schedule.TYPE_URL)
public data class Schedule(
  @ProtobufIndex(index = 1)
  public val startTime: Long,
  @ProtobufIndex(index = 2)
  public val endTime: Long,
  @ProtobufIndex(index = 3)
  public val ratio: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.vesting.v1beta1.Schedule"
  }

  public object KotlinxSerializer : KSerializer<Schedule> {
    private val delegator: KSerializer<Schedule> = Schedule.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Schedule): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ScheduleConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Schedule {
      if (decoder is ProtobufMapperDecoder) {
        return ScheduleConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = VestingSchedule.KotlinxSerializer::class)
@SerialName(value = VestingSchedule.TYPE_URL)
public data class VestingSchedule(
  @ProtobufIndex(index = 1)
  public val denom: String,
  @ProtobufIndex(index = 2)
  public val schedules: List<Schedule>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.vesting.v1beta1.VestingSchedule"
  }

  public object KotlinxSerializer : KSerializer<VestingSchedule> {
    private val delegator: KSerializer<VestingSchedule> = VestingSchedule.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: VestingSchedule): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(VestingScheduleConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): VestingSchedule {
      if (decoder is ProtobufMapperDecoder) {
        return VestingScheduleConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

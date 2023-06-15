// Transform from cosmos/staking/v1beta1/authz.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.staking.v1beta1

import cosmos.base.v1beta1.Coin
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmInline
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

@Serializable
@SerialName(value = "/cosmos.staking.v1beta1.AuthorizationType")
public enum class AuthorizationType(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  AUTHORIZATION_TYPE_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  AUTHORIZATION_TYPE_DELEGATE(1),
  @ProtobufIndex(index = 2)
  AUTHORIZATION_TYPE_UNDELEGATE(2),
  @ProtobufIndex(index = 3)
  AUTHORIZATION_TYPE_REDELEGATE(3),
  ;

  public companion object {
    public fun forNumber(number: Int): AuthorizationType = AuthorizationType.values()
    	.first { it.number == number }
  }
}

@Serializable(with = StakeAuthorization.KotlinxSerializer::class)
@SerialName(value = StakeAuthorization.TYPE_URL)
public data class StakeAuthorization(
  @ProtobufIndex(index = 1)
  public val maxTokens: Coin,
  @ProtobufIndex(index = 4)
  public val authorizationType: AuthorizationType,
  public val validators: ValidatorsOneOf,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.staking.v1beta1.StakeAuthorization"
  }

  @Serializable
  public sealed interface ValidatorsOneOf {
    @JvmInline
    public value class AllowList(
      @ProtobufIndex(index = 2)
      public val `value`: Validators,
    ) : ValidatorsOneOf

    @JvmInline
    public value class DenyList(
      @ProtobufIndex(index = 3)
      public val `value`: Validators,
    ) : ValidatorsOneOf
  }

  @Serializable(with = Validators.KotlinxSerializer::class)
  @SerialName(value = Validators.TYPE_URL)
  public data class Validators(
    @ProtobufIndex(index = 1)
    public val address: List<String>,
  ) : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String = "/cosmos.staking.v1beta1.StakeAuthorization.Validators"
    }

    public object KotlinxSerializer : KSerializer<Validators> {
      private val delegator: KSerializer<Validators> = Validators.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: Validators): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(StakeAuthorizationConverter.ValidatorsConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): Validators {
        if (decoder is ProtobufMapperDecoder) {
          return StakeAuthorizationConverter.ValidatorsConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  public object KotlinxSerializer : KSerializer<StakeAuthorization> {
    private val delegator: KSerializer<StakeAuthorization> = StakeAuthorization.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: StakeAuthorization): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(StakeAuthorizationConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): StakeAuthorization {
      if (decoder is ProtobufMapperDecoder) {
        return StakeAuthorizationConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

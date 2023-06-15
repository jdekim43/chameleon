// Transform from cosmos/tx/signing/v1beta1/signing.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.tx.signing.v1beta1

import cosmos.crypto.multisig.v1beta1.CompactBitArray
import google.protobuf.Any
import kotlin.ByteArray
import kotlin.Int
import kotlin.String
import kotlin.ULong
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
@SerialName(value = "/cosmos.tx.signing.v1beta1.SignMode")
public enum class SignMode(
  public val number: Int,
) {
  @ProtobufIndex(index = 0)
  SIGN_MODE_UNSPECIFIED(0),
  @ProtobufIndex(index = 1)
  SIGN_MODE_DIRECT(1),
  @ProtobufIndex(index = 2)
  SIGN_MODE_TEXTUAL(2),
  @ProtobufIndex(index = 3)
  SIGN_MODE_DIRECT_AUX(3),
  @ProtobufIndex(index = 127)
  SIGN_MODE_LEGACY_AMINO_JSON(127),
  @ProtobufIndex(index = 191)
  SIGN_MODE_EIP_191(191),
  ;

  public companion object {
    public fun forNumber(number: Int): SignMode = SignMode.values()
    	.first { it.number == number }
  }
}

@Serializable(with = SignatureDescriptors.KotlinxSerializer::class)
@SerialName(value = SignatureDescriptors.TYPE_URL)
public data class SignatureDescriptors(
  @ProtobufIndex(index = 1)
  public val signatures: List<SignatureDescriptor>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.signing.v1beta1.SignatureDescriptors"
  }

  public object KotlinxSerializer : KSerializer<SignatureDescriptors> {
    private val delegator: KSerializer<SignatureDescriptors> = SignatureDescriptors.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SignatureDescriptors): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SignatureDescriptorsConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SignatureDescriptors {
      if (decoder is ProtobufMapperDecoder) {
        return SignatureDescriptorsConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SignatureDescriptor.KotlinxSerializer::class)
@SerialName(value = SignatureDescriptor.TYPE_URL)
public data class SignatureDescriptor(
  @ProtobufIndex(index = 1)
  public val publicKey: Any,
  @ProtobufIndex(index = 2)
  public val `data`: Data,
  @ProtobufIndex(index = 3)
  public val sequence: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.signing.v1beta1.SignatureDescriptor"
  }

  @Serializable(with = Data.KotlinxSerializer::class)
  @SerialName(value = Data.TYPE_URL)
  public data class Data(
    public val sum: SumOneOf,
  ) : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String = "/cosmos.tx.signing.v1beta1.SignatureDescriptor.Data"
    }

    @Serializable
    public sealed interface SumOneOf {
      @JvmInline
      public value class Single(
        @ProtobufIndex(index = 1)
        public val `value`: Data.Single,
      ) : SumOneOf

      @JvmInline
      public value class Multi(
        @ProtobufIndex(index = 2)
        public val `value`: Data.Multi,
      ) : SumOneOf
    }

    @Serializable(with = Single.KotlinxSerializer::class)
    @SerialName(value = Single.TYPE_URL)
    public data class Single(
      @ProtobufIndex(index = 1)
      public val mode: SignMode,
      @ProtobufIndex(index = 2)
      public val signature: ByteArray,
    ) : ProtobufMessage {
      public companion object {
        public const val TYPE_URL: String =
            "/cosmos.tx.signing.v1beta1.SignatureDescriptor.Data.Single"
      }

      public object KotlinxSerializer : KSerializer<Single> {
        private val delegator: KSerializer<Single> = Single.serializer()

        public override val descriptor: SerialDescriptor = delegator.descriptor

        public override fun serialize(encoder: Encoder, `value`: Single): Unit {
          if (encoder is ProtobufConverterEncoder) {
            encoder.encodeValue(SignatureDescriptorConverter.DataConverter.SingleConverter.serialize(value))
            return
          }
          delegator.serialize(encoder, value)
        }

        public override fun deserialize(decoder: Decoder): Single {
          if (decoder is ProtobufMapperDecoder) {
            return SignatureDescriptorConverter.DataConverter.SingleConverter.deserialize(decoder.decodeByteArray())
          }
          return delegator.deserialize(decoder)
        }
      }
    }

    @Serializable(with = Multi.KotlinxSerializer::class)
    @SerialName(value = Multi.TYPE_URL)
    public data class Multi(
      @ProtobufIndex(index = 1)
      public val bitarray: CompactBitArray,
      @ProtobufIndex(index = 2)
      public val signatures: List<Data>,
    ) : ProtobufMessage {
      public companion object {
        public const val TYPE_URL: String =
            "/cosmos.tx.signing.v1beta1.SignatureDescriptor.Data.Multi"
      }

      public object KotlinxSerializer : KSerializer<Multi> {
        private val delegator: KSerializer<Multi> = Multi.serializer()

        public override val descriptor: SerialDescriptor = delegator.descriptor

        public override fun serialize(encoder: Encoder, `value`: Multi): Unit {
          if (encoder is ProtobufConverterEncoder) {
            encoder.encodeValue(SignatureDescriptorConverter.DataConverter.MultiConverter.serialize(value))
            return
          }
          delegator.serialize(encoder, value)
        }

        public override fun deserialize(decoder: Decoder): Multi {
          if (decoder is ProtobufMapperDecoder) {
            return SignatureDescriptorConverter.DataConverter.MultiConverter.deserialize(decoder.decodeByteArray())
          }
          return delegator.deserialize(decoder)
        }
      }
    }

    public object KotlinxSerializer : KSerializer<Data> {
      private val delegator: KSerializer<Data> = Data.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: Data): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(SignatureDescriptorConverter.DataConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): Data {
        if (decoder is ProtobufMapperDecoder) {
          return SignatureDescriptorConverter.DataConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  public object KotlinxSerializer : KSerializer<SignatureDescriptor> {
    private val delegator: KSerializer<SignatureDescriptor> = SignatureDescriptor.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SignatureDescriptor): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SignatureDescriptorConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SignatureDescriptor {
      if (decoder is ProtobufMapperDecoder) {
        return SignatureDescriptorConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

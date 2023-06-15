// Transform from cosmos/tx/v1beta1/tx.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.tx.v1beta1

import cosmos.base.v1beta1.Coin
import cosmos.crypto.multisig.v1beta1.CompactBitArray
import cosmos.tx.signing.v1beta1.SignMode
import google.protobuf.Any
import kotlin.ByteArray
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

@Serializable(with = Tx.KotlinxSerializer::class)
@SerialName(value = Tx.TYPE_URL)
public data class Tx(
  @ProtobufIndex(index = 1)
  public val body: TxBody,
  @ProtobufIndex(index = 2)
  public val authInfo: AuthInfo,
  @ProtobufIndex(index = 3)
  public val signatures: List<ByteArray>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.Tx"
  }

  public object KotlinxSerializer : KSerializer<Tx> {
    private val delegator: KSerializer<Tx> = Tx.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Tx): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Tx {
      if (decoder is ProtobufMapperDecoder) {
        return TxConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxRaw.KotlinxSerializer::class)
@SerialName(value = TxRaw.TYPE_URL)
public data class TxRaw(
  @ProtobufIndex(index = 1)
  public val bodyBytes: ByteArray,
  @ProtobufIndex(index = 2)
  public val authInfoBytes: ByteArray,
  @ProtobufIndex(index = 3)
  public val signatures: List<ByteArray>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.TxRaw"
  }

  public object KotlinxSerializer : KSerializer<TxRaw> {
    private val delegator: KSerializer<TxRaw> = TxRaw.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxRaw): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxRawConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxRaw {
      if (decoder is ProtobufMapperDecoder) {
        return TxRawConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SignDoc.KotlinxSerializer::class)
@SerialName(value = SignDoc.TYPE_URL)
public data class SignDoc(
  @ProtobufIndex(index = 1)
  public val bodyBytes: ByteArray,
  @ProtobufIndex(index = 2)
  public val authInfoBytes: ByteArray,
  @ProtobufIndex(index = 3)
  public val chainId: String,
  @ProtobufIndex(index = 4)
  public val accountNumber: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.SignDoc"
  }

  public object KotlinxSerializer : KSerializer<SignDoc> {
    private val delegator: KSerializer<SignDoc> = SignDoc.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SignDoc): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SignDocConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SignDoc {
      if (decoder is ProtobufMapperDecoder) {
        return SignDocConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SignDocDirectAux.KotlinxSerializer::class)
@SerialName(value = SignDocDirectAux.TYPE_URL)
public data class SignDocDirectAux(
  @ProtobufIndex(index = 1)
  public val bodyBytes: ByteArray,
  @ProtobufIndex(index = 2)
  public val publicKey: Any,
  @ProtobufIndex(index = 3)
  public val chainId: String,
  @ProtobufIndex(index = 4)
  public val accountNumber: ULong,
  @ProtobufIndex(index = 5)
  public val sequence: ULong,
  @ProtobufIndex(index = 6)
  public val tip: Tip,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.SignDocDirectAux"
  }

  public object KotlinxSerializer : KSerializer<SignDocDirectAux> {
    private val delegator: KSerializer<SignDocDirectAux> = SignDocDirectAux.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SignDocDirectAux): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SignDocDirectAuxConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SignDocDirectAux {
      if (decoder is ProtobufMapperDecoder) {
        return SignDocDirectAuxConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = TxBody.KotlinxSerializer::class)
@SerialName(value = TxBody.TYPE_URL)
public data class TxBody(
  @ProtobufIndex(index = 1)
  public val messages: List<Any>,
  @ProtobufIndex(index = 2)
  public val memo: String,
  @ProtobufIndex(index = 3)
  public val timeoutHeight: ULong,
  @ProtobufIndex(index = 1_023)
  public val extensionOptions: List<Any>,
  @ProtobufIndex(index = 2_047)
  public val nonCriticalExtensionOptions: List<Any>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.TxBody"
  }

  public object KotlinxSerializer : KSerializer<TxBody> {
    private val delegator: KSerializer<TxBody> = TxBody.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: TxBody): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TxBodyConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): TxBody {
      if (decoder is ProtobufMapperDecoder) {
        return TxBodyConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AuthInfo.KotlinxSerializer::class)
@SerialName(value = AuthInfo.TYPE_URL)
public data class AuthInfo(
  @ProtobufIndex(index = 1)
  public val signerInfos: List<SignerInfo>,
  @ProtobufIndex(index = 2)
  public val fee: Fee,
  @ProtobufIndex(index = 3)
  public val tip: Tip,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.AuthInfo"
  }

  public object KotlinxSerializer : KSerializer<AuthInfo> {
    private val delegator: KSerializer<AuthInfo> = AuthInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AuthInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AuthInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AuthInfo {
      if (decoder is ProtobufMapperDecoder) {
        return AuthInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = SignerInfo.KotlinxSerializer::class)
@SerialName(value = SignerInfo.TYPE_URL)
public data class SignerInfo(
  @ProtobufIndex(index = 1)
  public val publicKey: Any,
  @ProtobufIndex(index = 2)
  public val modeInfo: ModeInfo,
  @ProtobufIndex(index = 3)
  public val sequence: ULong,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.SignerInfo"
  }

  public object KotlinxSerializer : KSerializer<SignerInfo> {
    private val delegator: KSerializer<SignerInfo> = SignerInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: SignerInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(SignerInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): SignerInfo {
      if (decoder is ProtobufMapperDecoder) {
        return SignerInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = ModeInfo.KotlinxSerializer::class)
@SerialName(value = ModeInfo.TYPE_URL)
public data class ModeInfo(
  public val sum: SumOneOf,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.ModeInfo"
  }

  @Serializable
  public sealed interface SumOneOf {
    @JvmInline
    public value class Single(
      @ProtobufIndex(index = 1)
      public val `value`: ModeInfo.Single,
    ) : SumOneOf

    @JvmInline
    public value class Multi(
      @ProtobufIndex(index = 2)
      public val `value`: ModeInfo.Multi,
    ) : SumOneOf
  }

  @Serializable(with = Single.KotlinxSerializer::class)
  @SerialName(value = Single.TYPE_URL)
  public data class Single(
    @ProtobufIndex(index = 1)
    public val mode: SignMode,
  ) : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String = "/cosmos.tx.v1beta1.ModeInfo.Single"
    }

    public object KotlinxSerializer : KSerializer<Single> {
      private val delegator: KSerializer<Single> = Single.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: Single): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(ModeInfoConverter.SingleConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): Single {
        if (decoder is ProtobufMapperDecoder) {
          return ModeInfoConverter.SingleConverter.deserialize(decoder.decodeByteArray())
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
    public val modeInfos: List<ModeInfo>,
  ) : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String = "/cosmos.tx.v1beta1.ModeInfo.Multi"
    }

    public object KotlinxSerializer : KSerializer<Multi> {
      private val delegator: KSerializer<Multi> = Multi.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: Multi): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(ModeInfoConverter.MultiConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): Multi {
        if (decoder is ProtobufMapperDecoder) {
          return ModeInfoConverter.MultiConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  public object KotlinxSerializer : KSerializer<ModeInfo> {
    private val delegator: KSerializer<ModeInfo> = ModeInfo.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: ModeInfo): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(ModeInfoConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): ModeInfo {
      if (decoder is ProtobufMapperDecoder) {
        return ModeInfoConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Fee.KotlinxSerializer::class)
@SerialName(value = Fee.TYPE_URL)
public data class Fee(
  @ProtobufIndex(index = 1)
  public val amount: List<Coin>,
  @ProtobufIndex(index = 2)
  public val gasLimit: ULong,
  @ProtobufIndex(index = 3)
  public val payer: String,
  @ProtobufIndex(index = 4)
  public val granter: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.Fee"
  }

  public object KotlinxSerializer : KSerializer<Fee> {
    private val delegator: KSerializer<Fee> = Fee.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Fee): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(FeeConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Fee {
      if (decoder is ProtobufMapperDecoder) {
        return FeeConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = Tip.KotlinxSerializer::class)
@SerialName(value = Tip.TYPE_URL)
public data class Tip(
  @ProtobufIndex(index = 1)
  public val amount: List<Coin>,
  @ProtobufIndex(index = 2)
  public val tipper: String,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.Tip"
  }

  public object KotlinxSerializer : KSerializer<Tip> {
    private val delegator: KSerializer<Tip> = Tip.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Tip): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(TipConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Tip {
      if (decoder is ProtobufMapperDecoder) {
        return TipConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = AuxSignerData.KotlinxSerializer::class)
@SerialName(value = AuxSignerData.TYPE_URL)
public data class AuxSignerData(
  @ProtobufIndex(index = 1)
  public val address: String,
  @ProtobufIndex(index = 2)
  public val signDoc: SignDocDirectAux,
  @ProtobufIndex(index = 3)
  public val mode: SignMode,
  @ProtobufIndex(index = 4)
  public val sig: ByteArray,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.tx.v1beta1.AuxSignerData"
  }

  public object KotlinxSerializer : KSerializer<AuxSignerData> {
    private val delegator: KSerializer<AuxSignerData> = AuxSignerData.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AuxSignerData): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AuxSignerDataConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AuxSignerData {
      if (decoder is ProtobufMapperDecoder) {
        return AuxSignerDataConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

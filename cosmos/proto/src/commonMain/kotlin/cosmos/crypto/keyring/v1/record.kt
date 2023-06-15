// Transform from cosmos/crypto/keyring/v1/record.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package cosmos.crypto.keyring.v1

import cosmos.crypto.hd.v1.BIP44Params
import google.protobuf.Any
import kotlin.String
import kotlin.Unit
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

@Serializable(with = Record.KotlinxSerializer::class)
@SerialName(value = Record.TYPE_URL)
public data class Record(
  @ProtobufIndex(index = 1)
  public val name: String,
  @ProtobufIndex(index = 2)
  public val pubKey: Any,
  public val item: ItemOneOf,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/cosmos.crypto.keyring.v1.Record"
  }

  @Serializable
  public sealed interface ItemOneOf {
    @JvmInline
    public value class Local(
      @ProtobufIndex(index = 3)
      public val `value`: Record.Local,
    ) : ItemOneOf

    @JvmInline
    public value class Ledger(
      @ProtobufIndex(index = 4)
      public val `value`: Record.Ledger,
    ) : ItemOneOf

    @JvmInline
    public value class Multi(
      @ProtobufIndex(index = 5)
      public val `value`: Record.Multi,
    ) : ItemOneOf

    @JvmInline
    public value class Offline(
      @ProtobufIndex(index = 6)
      public val `value`: Record.Offline,
    ) : ItemOneOf
  }

  @Serializable(with = Local.KotlinxSerializer::class)
  @SerialName(value = Local.TYPE_URL)
  public data class Local(
    @ProtobufIndex(index = 1)
    public val privKey: Any,
  ) : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String = "/cosmos.crypto.keyring.v1.Record.Local"
    }

    public object KotlinxSerializer : KSerializer<Local> {
      private val delegator: KSerializer<Local> = Local.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: Local): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(RecordConverter.LocalConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): Local {
        if (decoder is ProtobufMapperDecoder) {
          return RecordConverter.LocalConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  @Serializable(with = Ledger.KotlinxSerializer::class)
  @SerialName(value = Ledger.TYPE_URL)
  public data class Ledger(
    @ProtobufIndex(index = 1)
    public val path: BIP44Params,
  ) : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String = "/cosmos.crypto.keyring.v1.Record.Ledger"
    }

    public object KotlinxSerializer : KSerializer<Ledger> {
      private val delegator: KSerializer<Ledger> = Ledger.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: Ledger): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(RecordConverter.LedgerConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): Ledger {
        if (decoder is ProtobufMapperDecoder) {
          return RecordConverter.LedgerConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  @Serializable(with = Multi.KotlinxSerializer::class)
  @SerialName(value = Multi.TYPE_URL)
  public class Multi() : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String = "/cosmos.crypto.keyring.v1.Record.Multi"
    }

    public object KotlinxSerializer : KSerializer<Multi> {
      private val delegator: KSerializer<Multi> = Multi.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: Multi): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(RecordConverter.MultiConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): Multi {
        if (decoder is ProtobufMapperDecoder) {
          return RecordConverter.MultiConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  @Serializable(with = Offline.KotlinxSerializer::class)
  @SerialName(value = Offline.TYPE_URL)
  public class Offline() : ProtobufMessage {
    public companion object {
      public const val TYPE_URL: String = "/cosmos.crypto.keyring.v1.Record.Offline"
    }

    public object KotlinxSerializer : KSerializer<Offline> {
      private val delegator: KSerializer<Offline> = Offline.serializer()

      public override val descriptor: SerialDescriptor = delegator.descriptor

      public override fun serialize(encoder: Encoder, `value`: Offline): Unit {
        if (encoder is ProtobufConverterEncoder) {
          encoder.encodeValue(RecordConverter.OfflineConverter.serialize(value))
          return
        }
        delegator.serialize(encoder, value)
      }

      public override fun deserialize(decoder: Decoder): Offline {
        if (decoder is ProtobufMapperDecoder) {
          return RecordConverter.OfflineConverter.deserialize(decoder.decodeByteArray())
        }
        return delegator.deserialize(decoder)
      }
    }
  }

  public object KotlinxSerializer : KSerializer<Record> {
    private val delegator: KSerializer<Record> = Record.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: Record): Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RecordConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): Record {
      if (decoder is ProtobufMapperDecoder) {
        return RecordConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

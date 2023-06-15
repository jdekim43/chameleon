// Transform from terra/treasury/v1beta1/gov.proto
@file:ProtobufSyntax(syntax = "PROTO3")
@file:GeneratorVersion(version = "0.3.1")

package terra.treasury.v1beta1

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

@Serializable(with = AddBurnTaxExemptionAddressProposal.KotlinxSerializer::class)
@SerialName(value = AddBurnTaxExemptionAddressProposal.TYPE_URL)
public data class AddBurnTaxExemptionAddressProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val addresses: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String = "/terra.treasury.v1beta1.AddBurnTaxExemptionAddressProposal"
  }

  public object KotlinxSerializer : KSerializer<AddBurnTaxExemptionAddressProposal> {
    private val delegator: KSerializer<AddBurnTaxExemptionAddressProposal> =
        AddBurnTaxExemptionAddressProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: AddBurnTaxExemptionAddressProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(AddBurnTaxExemptionAddressProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): AddBurnTaxExemptionAddressProposal {
      if (decoder is ProtobufMapperDecoder) {
        return AddBurnTaxExemptionAddressProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

@Serializable(with = RemoveBurnTaxExemptionAddressProposal.KotlinxSerializer::class)
@SerialName(value = RemoveBurnTaxExemptionAddressProposal.TYPE_URL)
public data class RemoveBurnTaxExemptionAddressProposal(
  @ProtobufIndex(index = 1)
  public val title: String,
  @ProtobufIndex(index = 2)
  public val description: String,
  @ProtobufIndex(index = 3)
  public val addresses: List<String>,
) : ProtobufMessage {
  public companion object {
    public const val TYPE_URL: String =
        "/terra.treasury.v1beta1.RemoveBurnTaxExemptionAddressProposal"
  }

  public object KotlinxSerializer : KSerializer<RemoveBurnTaxExemptionAddressProposal> {
    private val delegator: KSerializer<RemoveBurnTaxExemptionAddressProposal> =
        RemoveBurnTaxExemptionAddressProposal.serializer()

    public override val descriptor: SerialDescriptor = delegator.descriptor

    public override fun serialize(encoder: Encoder, `value`: RemoveBurnTaxExemptionAddressProposal):
        Unit {
      if (encoder is ProtobufConverterEncoder) {
        encoder.encodeValue(RemoveBurnTaxExemptionAddressProposalConverter.serialize(value))
        return
      }
      delegator.serialize(encoder, value)
    }

    public override fun deserialize(decoder: Decoder): RemoveBurnTaxExemptionAddressProposal {
      if (decoder is ProtobufMapperDecoder) {
        return RemoveBurnTaxExemptionAddressProposalConverter.deserialize(decoder.decodeByteArray())
      }
      return delegator.deserialize(decoder)
    }
  }
}

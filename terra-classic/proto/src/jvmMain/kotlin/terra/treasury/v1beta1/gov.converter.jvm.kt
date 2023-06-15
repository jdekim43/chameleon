// Transform from terra/treasury/v1beta1/gov.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.treasury.v1beta1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object AddBurnTaxExemptionAddressProposalJvmConverter :
    ProtobufTypeMapper<AddBurnTaxExemptionAddressProposal, Gov.AddBurnTaxExemptionAddressProposal> {
  public override val descriptor: Descriptors.Descriptor =
      Gov.AddBurnTaxExemptionAddressProposal.getDescriptor()

  public override val parser: Parser<Gov.AddBurnTaxExemptionAddressProposal> =
      Gov.AddBurnTaxExemptionAddressProposal.parser()

  public override fun convert(obj: Gov.AddBurnTaxExemptionAddressProposal):
      AddBurnTaxExemptionAddressProposal = AddBurnTaxExemptionAddressProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	addresses = obj.getAddressesList().map { it },
  )

  public override fun convert(obj: AddBurnTaxExemptionAddressProposal):
      Gov.AddBurnTaxExemptionAddressProposal {
    val builder = Gov.AddBurnTaxExemptionAddressProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllAddresses(obj.addresses.map { it })
    return builder.build()
  }
}

public object RemoveBurnTaxExemptionAddressProposalJvmConverter :
    ProtobufTypeMapper<RemoveBurnTaxExemptionAddressProposal, Gov.RemoveBurnTaxExemptionAddressProposal>
    {
  public override val descriptor: Descriptors.Descriptor =
      Gov.RemoveBurnTaxExemptionAddressProposal.getDescriptor()

  public override val parser: Parser<Gov.RemoveBurnTaxExemptionAddressProposal> =
      Gov.RemoveBurnTaxExemptionAddressProposal.parser()

  public override fun convert(obj: Gov.RemoveBurnTaxExemptionAddressProposal):
      RemoveBurnTaxExemptionAddressProposal = RemoveBurnTaxExemptionAddressProposal(
  	title = obj.getTitle(),
  	description = obj.getDescription(),
  	addresses = obj.getAddressesList().map { it },
  )

  public override fun convert(obj: RemoveBurnTaxExemptionAddressProposal):
      Gov.RemoveBurnTaxExemptionAddressProposal {
    val builder = Gov.RemoveBurnTaxExemptionAddressProposal.newBuilder()
    builder.setTitle(obj.title)
    builder.setDescription(obj.description)
    builder.addAllAddresses(obj.addresses.map { it })
    return builder.build()
  }
}

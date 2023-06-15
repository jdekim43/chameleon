// Transform from terra/treasury/v1beta1/gov.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.treasury.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object AddBurnTaxExemptionAddressProposalConverter :
    ProtobufConverter<AddBurnTaxExemptionAddressProposal>

public fun AddBurnTaxExemptionAddressProposal.toAny(): Any =
    Any(AddBurnTaxExemptionAddressProposal.TYPE_URL,
    with(AddBurnTaxExemptionAddressProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<AddBurnTaxExemptionAddressProposal>):
    AddBurnTaxExemptionAddressProposal {
  if (typeUrl != AddBurnTaxExemptionAddressProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object RemoveBurnTaxExemptionAddressProposalConverter :
    ProtobufConverter<RemoveBurnTaxExemptionAddressProposal>

public fun RemoveBurnTaxExemptionAddressProposal.toAny(): Any =
    Any(RemoveBurnTaxExemptionAddressProposal.TYPE_URL,
    with(RemoveBurnTaxExemptionAddressProposalConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<RemoveBurnTaxExemptionAddressProposal>):
    RemoveBurnTaxExemptionAddressProposal {
  if (typeUrl != RemoveBurnTaxExemptionAddressProposal.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

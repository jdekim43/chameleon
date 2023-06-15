// Transform from terra/treasury/v1beta1/gov.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.treasury.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object AddBurnTaxExemptionAddressProposalConverter :
    ProtobufConverter<AddBurnTaxExemptionAddressProposal> by
    AddBurnTaxExemptionAddressProposalJvmConverter

public actual object RemoveBurnTaxExemptionAddressProposalConverter :
    ProtobufConverter<RemoveBurnTaxExemptionAddressProposal> by
    RemoveBurnTaxExemptionAddressProposalJvmConverter

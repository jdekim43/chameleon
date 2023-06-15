// Transform from mint/v1beta1/gov.proto
@file:GeneratorVersion(version = "0.3.1")

package seiprotocol.seichain.mint

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object UpdateMinterProposalConverter : ProtobufConverter<UpdateMinterProposal> by
    UpdateMinterProposalJvmConverter

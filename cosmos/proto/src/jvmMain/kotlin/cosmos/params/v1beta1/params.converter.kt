// Transform from cosmos/params/v1beta1/params.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.params.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ParameterChangeProposalConverter : ProtobufConverter<ParameterChangeProposal>
    by ParameterChangeProposalJvmConverter

public actual object ParamChangeConverter : ProtobufConverter<ParamChange> by
    ParamChangeJvmConverter

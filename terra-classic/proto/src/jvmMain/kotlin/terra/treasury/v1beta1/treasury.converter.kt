// Transform from terra/treasury/v1beta1/treasury.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.treasury.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter

public actual object PolicyConstraintsConverter : ProtobufConverter<PolicyConstraints> by
    PolicyConstraintsJvmConverter

public actual object EpochTaxProceedsConverter : ProtobufConverter<EpochTaxProceeds> by
    EpochTaxProceedsJvmConverter

public actual object EpochInitialIssuanceConverter : ProtobufConverter<EpochInitialIssuance> by
    EpochInitialIssuanceJvmConverter

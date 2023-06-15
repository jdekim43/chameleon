// Transform from cosmos/bank/v1beta1/bank.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.bank.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ParamsConverter : ProtobufConverter<Params> by ParamsJvmConverter

public actual object SendEnabledConverter : ProtobufConverter<SendEnabled> by
    SendEnabledJvmConverter

public actual object InputConverter : ProtobufConverter<Input> by InputJvmConverter

public actual object OutputConverter : ProtobufConverter<Output> by OutputJvmConverter

public actual object SupplyConverter : ProtobufConverter<Supply> by SupplyJvmConverter

public actual object DenomUnitConverter : ProtobufConverter<DenomUnit> by DenomUnitJvmConverter

public actual object MetadataConverter : ProtobufConverter<Metadata> by MetadataJvmConverter

// Transform from cosmos/base/reflection/v1beta1/reflection.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.reflection.v1beta1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object ListAllInterfacesRequestConverter : ProtobufConverter<ListAllInterfacesRequest>
    by ListAllInterfacesRequestJvmConverter

public actual object ListAllInterfacesResponseConverter :
    ProtobufConverter<ListAllInterfacesResponse> by ListAllInterfacesResponseJvmConverter

public actual object ListImplementationsRequestConverter :
    ProtobufConverter<ListImplementationsRequest> by ListImplementationsRequestJvmConverter

public actual object ListImplementationsResponseConverter :
    ProtobufConverter<ListImplementationsResponse> by ListImplementationsResponseJvmConverter

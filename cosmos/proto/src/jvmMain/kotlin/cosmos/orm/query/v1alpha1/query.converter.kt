// Transform from cosmos/orm/query/v1alpha1/query.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.orm.query.v1alpha1

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object GetRequestConverter : ProtobufConverter<GetRequest> by GetRequestJvmConverter

public actual object GetResponseConverter : ProtobufConverter<GetResponse> by
    GetResponseJvmConverter

public actual object ListRequestConverter : ProtobufConverter<ListRequest> by
    ListRequestJvmConverter {
  public actual object PrefixConverter : ProtobufConverter<ListRequest.Prefix> by
      ListRequestJvmConverter.PrefixJvmConverter

  public actual object RangeConverter : ProtobufConverter<ListRequest.Range> by
      ListRequestJvmConverter.RangeJvmConverter
}

public actual object ListResponseConverter : ProtobufConverter<ListResponse> by
    ListResponseJvmConverter

public actual object IndexValueConverter : ProtobufConverter<IndexValue> by IndexValueJvmConverter

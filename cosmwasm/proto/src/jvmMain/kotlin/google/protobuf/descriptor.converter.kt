// Transform from google/protobuf/descriptor.proto
@file:GeneratorVersion(version = "0.3.1")

package google.protobuf

import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter

public actual object FileDescriptorSetConverter : ProtobufConverter<FileDescriptorSet> by
    FileDescriptorSetJvmConverter

public actual object FileDescriptorProtoConverter : ProtobufConverter<FileDescriptorProto> by
    FileDescriptorProtoJvmConverter

public actual object DescriptorProtoConverter : ProtobufConverter<DescriptorProto> by
    DescriptorProtoJvmConverter {
  public actual object ExtensionRangeConverter : ProtobufConverter<DescriptorProto.ExtensionRange>
      by DescriptorProtoJvmConverter.ExtensionRangeJvmConverter

  public actual object ReservedRangeConverter : ProtobufConverter<DescriptorProto.ReservedRange> by
      DescriptorProtoJvmConverter.ReservedRangeJvmConverter
}

public actual object ExtensionRangeOptionsConverter : ProtobufConverter<ExtensionRangeOptions> by
    ExtensionRangeOptionsJvmConverter

public actual object FieldDescriptorProtoConverter : ProtobufConverter<FieldDescriptorProto> by
    FieldDescriptorProtoJvmConverter

public actual object OneofDescriptorProtoConverter : ProtobufConverter<OneofDescriptorProto> by
    OneofDescriptorProtoJvmConverter

public actual object EnumDescriptorProtoConverter : ProtobufConverter<EnumDescriptorProto> by
    EnumDescriptorProtoJvmConverter {
  public actual object EnumReservedRangeConverter :
      ProtobufConverter<EnumDescriptorProto.EnumReservedRange> by
      EnumDescriptorProtoJvmConverter.EnumReservedRangeJvmConverter
}

public actual object EnumValueDescriptorProtoConverter : ProtobufConverter<EnumValueDescriptorProto>
    by EnumValueDescriptorProtoJvmConverter

public actual object ServiceDescriptorProtoConverter : ProtobufConverter<ServiceDescriptorProto> by
    ServiceDescriptorProtoJvmConverter

public actual object MethodDescriptorProtoConverter : ProtobufConverter<MethodDescriptorProto> by
    MethodDescriptorProtoJvmConverter

public actual object FileOptionsConverter : ProtobufConverter<FileOptions> by
    FileOptionsJvmConverter

public actual object MessageOptionsConverter : ProtobufConverter<MessageOptions> by
    MessageOptionsJvmConverter

public actual object FieldOptionsConverter : ProtobufConverter<FieldOptions> by
    FieldOptionsJvmConverter

public actual object OneofOptionsConverter : ProtobufConverter<OneofOptions> by
    OneofOptionsJvmConverter

public actual object EnumOptionsConverter : ProtobufConverter<EnumOptions> by
    EnumOptionsJvmConverter

public actual object EnumValueOptionsConverter : ProtobufConverter<EnumValueOptions> by
    EnumValueOptionsJvmConverter

public actual object ServiceOptionsConverter : ProtobufConverter<ServiceOptions> by
    ServiceOptionsJvmConverter

public actual object MethodOptionsConverter : ProtobufConverter<MethodOptions> by
    MethodOptionsJvmConverter

public actual object UninterpretedOptionConverter : ProtobufConverter<UninterpretedOption> by
    UninterpretedOptionJvmConverter {
  public actual object NamePartConverter : ProtobufConverter<UninterpretedOption.NamePart> by
      UninterpretedOptionJvmConverter.NamePartJvmConverter
}

public actual object SourceCodeInfoConverter : ProtobufConverter<SourceCodeInfo> by
    SourceCodeInfoJvmConverter {
  public actual object LocationConverter : ProtobufConverter<SourceCodeInfo.Location> by
      SourceCodeInfoJvmConverter.LocationJvmConverter
}

public actual object GeneratedCodeInfoConverter : ProtobufConverter<GeneratedCodeInfo> by
    GeneratedCodeInfoJvmConverter {
  public actual object AnnotationConverter : ProtobufConverter<GeneratedCodeInfo.Annotation> by
      GeneratedCodeInfoJvmConverter.AnnotationJvmConverter
}

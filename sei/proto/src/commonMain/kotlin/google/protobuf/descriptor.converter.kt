// Transform from google/protobuf/descriptor.proto
@file:GeneratorVersion(version = "0.3.1")

package google.protobuf

import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object FileDescriptorSetConverter : ProtobufConverter<FileDescriptorSet>

public fun FileDescriptorSet.toAny(): Any = Any(FileDescriptorSet.TYPE_URL,
    with(FileDescriptorSetConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FileDescriptorSet>): FileDescriptorSet {
  if (typeUrl != FileDescriptorSet.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FileDescriptorProtoConverter : ProtobufConverter<FileDescriptorProto>

public fun FileDescriptorProto.toAny(): Any = Any(FileDescriptorProto.TYPE_URL,
    with(FileDescriptorProtoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FileDescriptorProto>): FileDescriptorProto {
  if (typeUrl != FileDescriptorProto.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object DescriptorProtoConverter : ProtobufConverter<DescriptorProto> {
  public object ExtensionRangeConverter : ProtobufConverter<DescriptorProto.ExtensionRange>

  public object ReservedRangeConverter : ProtobufConverter<DescriptorProto.ReservedRange>
}

public fun DescriptorProto.toAny(): Any = Any(DescriptorProto.TYPE_URL,
    with(DescriptorProtoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<DescriptorProto>): DescriptorProto {
  if (typeUrl != DescriptorProto.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ExtensionRangeOptionsConverter : ProtobufConverter<ExtensionRangeOptions>

public fun ExtensionRangeOptions.toAny(): Any = Any(ExtensionRangeOptions.TYPE_URL,
    with(ExtensionRangeOptionsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ExtensionRangeOptions>): ExtensionRangeOptions {
  if (typeUrl != ExtensionRangeOptions.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FieldDescriptorProtoConverter : ProtobufConverter<FieldDescriptorProto>

public fun FieldDescriptorProto.toAny(): Any = Any(FieldDescriptorProto.TYPE_URL,
    with(FieldDescriptorProtoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FieldDescriptorProto>): FieldDescriptorProto {
  if (typeUrl != FieldDescriptorProto.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OneofDescriptorProtoConverter : ProtobufConverter<OneofDescriptorProto>

public fun OneofDescriptorProto.toAny(): Any = Any(OneofDescriptorProto.TYPE_URL,
    with(OneofDescriptorProtoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<OneofDescriptorProto>): OneofDescriptorProto {
  if (typeUrl != OneofDescriptorProto.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EnumDescriptorProtoConverter : ProtobufConverter<EnumDescriptorProto> {
  public object EnumReservedRangeConverter :
      ProtobufConverter<EnumDescriptorProto.EnumReservedRange>
}

public fun EnumDescriptorProto.toAny(): Any = Any(EnumDescriptorProto.TYPE_URL,
    with(EnumDescriptorProtoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EnumDescriptorProto>): EnumDescriptorProto {
  if (typeUrl != EnumDescriptorProto.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EnumValueDescriptorProtoConverter : ProtobufConverter<EnumValueDescriptorProto>

public fun EnumValueDescriptorProto.toAny(): Any = Any(EnumValueDescriptorProto.TYPE_URL,
    with(EnumValueDescriptorProtoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EnumValueDescriptorProto>):
    EnumValueDescriptorProto {
  if (typeUrl != EnumValueDescriptorProto.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ServiceDescriptorProtoConverter : ProtobufConverter<ServiceDescriptorProto>

public fun ServiceDescriptorProto.toAny(): Any = Any(ServiceDescriptorProto.TYPE_URL,
    with(ServiceDescriptorProtoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ServiceDescriptorProto>): ServiceDescriptorProto {
  if (typeUrl != ServiceDescriptorProto.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MethodDescriptorProtoConverter : ProtobufConverter<MethodDescriptorProto>

public fun MethodDescriptorProto.toAny(): Any = Any(MethodDescriptorProto.TYPE_URL,
    with(MethodDescriptorProtoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MethodDescriptorProto>): MethodDescriptorProto {
  if (typeUrl != MethodDescriptorProto.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FileOptionsConverter : ProtobufConverter<FileOptions>

public fun FileOptions.toAny(): Any = Any(FileOptions.TYPE_URL, with(FileOptionsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FileOptions>): FileOptions {
  if (typeUrl != FileOptions.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MessageOptionsConverter : ProtobufConverter<MessageOptions>

public fun MessageOptions.toAny(): Any = Any(MessageOptions.TYPE_URL, with(MessageOptionsConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MessageOptions>): MessageOptions {
  if (typeUrl != MessageOptions.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object FieldOptionsConverter : ProtobufConverter<FieldOptions>

public fun FieldOptions.toAny(): Any = Any(FieldOptions.TYPE_URL, with(FieldOptionsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<FieldOptions>): FieldOptions {
  if (typeUrl != FieldOptions.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object OneofOptionsConverter : ProtobufConverter<OneofOptions>

public fun OneofOptions.toAny(): Any = Any(OneofOptions.TYPE_URL, with(OneofOptionsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<OneofOptions>): OneofOptions {
  if (typeUrl != OneofOptions.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EnumOptionsConverter : ProtobufConverter<EnumOptions>

public fun EnumOptions.toAny(): Any = Any(EnumOptions.TYPE_URL, with(EnumOptionsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EnumOptions>): EnumOptions {
  if (typeUrl != EnumOptions.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object EnumValueOptionsConverter : ProtobufConverter<EnumValueOptions>

public fun EnumValueOptions.toAny(): Any = Any(EnumValueOptions.TYPE_URL,
    with(EnumValueOptionsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<EnumValueOptions>): EnumValueOptions {
  if (typeUrl != EnumValueOptions.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object ServiceOptionsConverter : ProtobufConverter<ServiceOptions>

public fun ServiceOptions.toAny(): Any = Any(ServiceOptions.TYPE_URL, with(ServiceOptionsConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<ServiceOptions>): ServiceOptions {
  if (typeUrl != ServiceOptions.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object MethodOptionsConverter : ProtobufConverter<MethodOptions>

public fun MethodOptions.toAny(): Any = Any(MethodOptions.TYPE_URL, with(MethodOptionsConverter) {
    toByteArray() })

public fun Any.parse(converter: ProtobufConverter<MethodOptions>): MethodOptions {
  if (typeUrl != MethodOptions.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object UninterpretedOptionConverter : ProtobufConverter<UninterpretedOption> {
  public object NamePartConverter : ProtobufConverter<UninterpretedOption.NamePart>
}

public fun UninterpretedOption.toAny(): Any = Any(UninterpretedOption.TYPE_URL,
    with(UninterpretedOptionConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<UninterpretedOption>): UninterpretedOption {
  if (typeUrl != UninterpretedOption.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SourceCodeInfoConverter : ProtobufConverter<SourceCodeInfo> {
  public object LocationConverter : ProtobufConverter<SourceCodeInfo.Location>
}

public fun SourceCodeInfo.toAny(): Any = Any(SourceCodeInfo.TYPE_URL, with(SourceCodeInfoConverter)
    { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SourceCodeInfo>): SourceCodeInfo {
  if (typeUrl != SourceCodeInfo.TYPE_URL) throw IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object GeneratedCodeInfoConverter : ProtobufConverter<GeneratedCodeInfo> {
  public object AnnotationConverter : ProtobufConverter<GeneratedCodeInfo.Annotation>
}

public fun GeneratedCodeInfo.toAny(): Any = Any(GeneratedCodeInfo.TYPE_URL,
    with(GeneratedCodeInfoConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<GeneratedCodeInfo>): GeneratedCodeInfo {
  if (typeUrl != GeneratedCodeInfo.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

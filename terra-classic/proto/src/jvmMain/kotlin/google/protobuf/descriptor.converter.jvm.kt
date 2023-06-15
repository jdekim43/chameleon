// Transform from google/protobuf/descriptor.proto
@file:GeneratorVersion(version = "0.3.1")

package google.protobuf

import com.google.protobuf.ByteString
import com.google.protobuf.DescriptorProtos
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import kr.jadekim.protobuf.util.asJavaType
import kr.jadekim.protobuf.util.asKotlinType

public object FileDescriptorSetJvmConverter :
    ProtobufTypeMapper<FileDescriptorSet, DescriptorProtos.FileDescriptorSet> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.FileDescriptorSet.getDescriptor()

  public override val parser: Parser<DescriptorProtos.FileDescriptorSet> =
      DescriptorProtos.FileDescriptorSet.parser()

  public override fun convert(obj: DescriptorProtos.FileDescriptorSet): FileDescriptorSet =
      FileDescriptorSet(
  	`file` = obj.getFileList().map { FileDescriptorProtoJvmConverter.convert(it) },
  )

  public override fun convert(obj: FileDescriptorSet): DescriptorProtos.FileDescriptorSet {
    val builder = DescriptorProtos.FileDescriptorSet.newBuilder()
    builder.addAllFile(obj.`file`.map { FileDescriptorProtoJvmConverter.convert(it) })
    return builder.build()
  }
}

public object FileDescriptorProtoJvmConverter :
    ProtobufTypeMapper<FileDescriptorProto, DescriptorProtos.FileDescriptorProto> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.FileDescriptorProto.getDescriptor()

  public override val parser: Parser<DescriptorProtos.FileDescriptorProto> =
      DescriptorProtos.FileDescriptorProto.parser()

  public override fun convert(obj: DescriptorProtos.FileDescriptorProto): FileDescriptorProto =
      FileDescriptorProto(
  	name = obj.getName(),
  	`package` = obj.getPackage(),
  	dependency = obj.getDependencyList().map { it },
  	publicDependency = obj.getPublicDependencyList().map { it },
  	weakDependency = obj.getWeakDependencyList().map { it },
  	messageType = obj.getMessageTypeList().map { DescriptorProtoJvmConverter.convert(it) },
  	enumType = obj.getEnumTypeList().map { EnumDescriptorProtoJvmConverter.convert(it) },
  	service = obj.getServiceList().map { ServiceDescriptorProtoJvmConverter.convert(it) },
  	extension = obj.getExtensionList().map { FieldDescriptorProtoJvmConverter.convert(it) },
  	options = FileOptionsJvmConverter.convert(obj.getOptions()),
  	sourceCodeInfo = SourceCodeInfoJvmConverter.convert(obj.getSourceCodeInfo()),
  	syntax = obj.getSyntax(),
  	edition = obj.getEdition(),
  )

  public override fun convert(obj: FileDescriptorProto): DescriptorProtos.FileDescriptorProto {
    val builder = DescriptorProtos.FileDescriptorProto.newBuilder()
    val value0 = obj.name
    if (value0 != null) {
      builder.setName(value0)
    }
    val value1 = obj.`package`
    if (value1 != null) {
      builder.setPackage(value1)
    }
    builder.addAllDependency(obj.dependency.map { it })
    builder.addAllPublicDependency(obj.publicDependency.map { it })
    builder.addAllWeakDependency(obj.weakDependency.map { it })
    builder.addAllMessageType(obj.messageType.map { DescriptorProtoJvmConverter.convert(it) })
    builder.addAllEnumType(obj.enumType.map { EnumDescriptorProtoJvmConverter.convert(it) })
    builder.addAllService(obj.service.map { ServiceDescriptorProtoJvmConverter.convert(it) })
    builder.addAllExtension(obj.extension.map { FieldDescriptorProtoJvmConverter.convert(it) })
    val value9 = obj.options
    if (value9 != null) {
      builder.setOptions(FileOptionsJvmConverter.convert(value9))
    }
    val value10 = obj.sourceCodeInfo
    if (value10 != null) {
      builder.setSourceCodeInfo(SourceCodeInfoJvmConverter.convert(value10))
    }
    val value11 = obj.syntax
    if (value11 != null) {
      builder.setSyntax(value11)
    }
    val value12 = obj.edition
    if (value12 != null) {
      builder.setEdition(value12)
    }
    return builder.build()
  }
}

public object DescriptorProtoJvmConverter :
    ProtobufTypeMapper<DescriptorProto, DescriptorProtos.DescriptorProto> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.DescriptorProto.getDescriptor()

  public override val parser: Parser<DescriptorProtos.DescriptorProto> =
      DescriptorProtos.DescriptorProto.parser()

  public override fun convert(obj: DescriptorProtos.DescriptorProto): DescriptorProto =
      DescriptorProto(
  	name = obj.getName(),
  	`field` = obj.getFieldList().map { FieldDescriptorProtoJvmConverter.convert(it) },
  	extension = obj.getExtensionList().map { FieldDescriptorProtoJvmConverter.convert(it) },
  	nestedType = obj.getNestedTypeList().map { DescriptorProtoJvmConverter.convert(it) },
  	enumType = obj.getEnumTypeList().map { EnumDescriptorProtoJvmConverter.convert(it) },
  	extensionRange = obj.getExtensionRangeList().map { ExtensionRangeJvmConverter.convert(it) },
  	oneofDecl = obj.getOneofDeclList().map { OneofDescriptorProtoJvmConverter.convert(it) },
  	options = MessageOptionsJvmConverter.convert(obj.getOptions()),
  	reservedRange = obj.getReservedRangeList().map { ReservedRangeJvmConverter.convert(it) },
  	reservedName = obj.getReservedNameList().map { it },
  )

  public override fun convert(obj: DescriptorProto): DescriptorProtos.DescriptorProto {
    val builder = DescriptorProtos.DescriptorProto.newBuilder()
    val value0 = obj.name
    if (value0 != null) {
      builder.setName(value0)
    }
    builder.addAllField(obj.`field`.map { FieldDescriptorProtoJvmConverter.convert(it) })
    builder.addAllExtension(obj.extension.map { FieldDescriptorProtoJvmConverter.convert(it) })
    builder.addAllNestedType(obj.nestedType.map { DescriptorProtoJvmConverter.convert(it) })
    builder.addAllEnumType(obj.enumType.map { EnumDescriptorProtoJvmConverter.convert(it) })
    builder.addAllExtensionRange(obj.extensionRange.map { ExtensionRangeJvmConverter.convert(it) })
    builder.addAllOneofDecl(obj.oneofDecl.map { OneofDescriptorProtoJvmConverter.convert(it) })
    val value7 = obj.options
    if (value7 != null) {
      builder.setOptions(MessageOptionsJvmConverter.convert(value7))
    }
    builder.addAllReservedRange(obj.reservedRange.map { ReservedRangeJvmConverter.convert(it) })
    builder.addAllReservedName(obj.reservedName.map { it })
    return builder.build()
  }

  public object ExtensionRangeJvmConverter :
      ProtobufTypeMapper<DescriptorProto.ExtensionRange, DescriptorProtos.DescriptorProto.ExtensionRange>
      {
    public override val descriptor: Descriptors.Descriptor =
        DescriptorProtos.DescriptorProto.ExtensionRange.getDescriptor()

    public override val parser: Parser<DescriptorProtos.DescriptorProto.ExtensionRange> =
        DescriptorProtos.DescriptorProto.ExtensionRange.parser()

    public override fun convert(obj: DescriptorProtos.DescriptorProto.ExtensionRange):
        DescriptorProto.ExtensionRange = DescriptorProto.ExtensionRange(
    	start = obj.getStart(),
    	end = obj.getEnd(),
    	options = ExtensionRangeOptionsJvmConverter.convert(obj.getOptions()),
    )

    public override fun convert(obj: DescriptorProto.ExtensionRange):
        DescriptorProtos.DescriptorProto.ExtensionRange {
      val builder = DescriptorProtos.DescriptorProto.ExtensionRange.newBuilder()
      val value0 = obj.start
      if (value0 != null) {
        builder.setStart(value0)
      }
      val value1 = obj.end
      if (value1 != null) {
        builder.setEnd(value1)
      }
      val value2 = obj.options
      if (value2 != null) {
        builder.setOptions(ExtensionRangeOptionsJvmConverter.convert(value2))
      }
      return builder.build()
    }
  }

  public object ReservedRangeJvmConverter :
      ProtobufTypeMapper<DescriptorProto.ReservedRange, DescriptorProtos.DescriptorProto.ReservedRange>
      {
    public override val descriptor: Descriptors.Descriptor =
        DescriptorProtos.DescriptorProto.ReservedRange.getDescriptor()

    public override val parser: Parser<DescriptorProtos.DescriptorProto.ReservedRange> =
        DescriptorProtos.DescriptorProto.ReservedRange.parser()

    public override fun convert(obj: DescriptorProtos.DescriptorProto.ReservedRange):
        DescriptorProto.ReservedRange = DescriptorProto.ReservedRange(
    	start = obj.getStart(),
    	end = obj.getEnd(),
    )

    public override fun convert(obj: DescriptorProto.ReservedRange):
        DescriptorProtos.DescriptorProto.ReservedRange {
      val builder = DescriptorProtos.DescriptorProto.ReservedRange.newBuilder()
      val value0 = obj.start
      if (value0 != null) {
        builder.setStart(value0)
      }
      val value1 = obj.end
      if (value1 != null) {
        builder.setEnd(value1)
      }
      return builder.build()
    }
  }
}

public object ExtensionRangeOptionsJvmConverter :
    ProtobufTypeMapper<ExtensionRangeOptions, DescriptorProtos.ExtensionRangeOptions> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.ExtensionRangeOptions.getDescriptor()

  public override val parser: Parser<DescriptorProtos.ExtensionRangeOptions> =
      DescriptorProtos.ExtensionRangeOptions.parser()

  public override fun convert(obj: DescriptorProtos.ExtensionRangeOptions): ExtensionRangeOptions =
      ExtensionRangeOptions(
  	uninterpretedOption = obj.getUninterpretedOptionList().map {
      UninterpretedOptionJvmConverter.convert(it) },
  )

  public override fun convert(obj: ExtensionRangeOptions): DescriptorProtos.ExtensionRangeOptions {
    val builder = DescriptorProtos.ExtensionRangeOptions.newBuilder()
    builder.addAllUninterpretedOption(obj.uninterpretedOption.map {
        UninterpretedOptionJvmConverter.convert(it) })
    return builder.build()
  }
}

public object FieldDescriptorProtoJvmConverter :
    ProtobufTypeMapper<FieldDescriptorProto, DescriptorProtos.FieldDescriptorProto> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.FieldDescriptorProto.getDescriptor()

  public override val parser: Parser<DescriptorProtos.FieldDescriptorProto> =
      DescriptorProtos.FieldDescriptorProto.parser()

  public override fun convert(obj: DescriptorProtos.FieldDescriptorProto): FieldDescriptorProto =
      FieldDescriptorProto(
  	name = obj.getName(),
  	number = obj.getNumber(),
  	label = FieldDescriptorProto.Label.forNumber(obj.getLabel().number),
  	type = FieldDescriptorProto.Type.forNumber(obj.getType().number),
  	typeName = obj.getTypeName(),
  	extendee = obj.getExtendee(),
  	defaultValue = obj.getDefaultValue(),
  	oneofIndex = obj.getOneofIndex(),
  	jsonName = obj.getJsonName(),
  	options = FieldOptionsJvmConverter.convert(obj.getOptions()),
  	proto3Optional = obj.getProto3Optional(),
  )

  public override fun convert(obj: FieldDescriptorProto): DescriptorProtos.FieldDescriptorProto {
    val builder = DescriptorProtos.FieldDescriptorProto.newBuilder()
    val value0 = obj.name
    if (value0 != null) {
      builder.setName(value0)
    }
    val value1 = obj.number
    if (value1 != null) {
      builder.setNumber(value1)
    }
    val value2 = obj.label
    if (value2 != null) {
      builder.setLabel(DescriptorProtos.FieldDescriptorProto.Label.forNumber(value2.number))
    }
    val value3 = obj.type
    if (value3 != null) {
      builder.setType(DescriptorProtos.FieldDescriptorProto.Type.forNumber(value3.number))
    }
    val value4 = obj.typeName
    if (value4 != null) {
      builder.setTypeName(value4)
    }
    val value5 = obj.extendee
    if (value5 != null) {
      builder.setExtendee(value5)
    }
    val value6 = obj.defaultValue
    if (value6 != null) {
      builder.setDefaultValue(value6)
    }
    val value7 = obj.oneofIndex
    if (value7 != null) {
      builder.setOneofIndex(value7)
    }
    val value8 = obj.jsonName
    if (value8 != null) {
      builder.setJsonName(value8)
    }
    val value9 = obj.options
    if (value9 != null) {
      builder.setOptions(FieldOptionsJvmConverter.convert(value9))
    }
    val value10 = obj.proto3Optional
    if (value10 != null) {
      builder.setProto3Optional(value10)
    }
    return builder.build()
  }
}

public object OneofDescriptorProtoJvmConverter :
    ProtobufTypeMapper<OneofDescriptorProto, DescriptorProtos.OneofDescriptorProto> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.OneofDescriptorProto.getDescriptor()

  public override val parser: Parser<DescriptorProtos.OneofDescriptorProto> =
      DescriptorProtos.OneofDescriptorProto.parser()

  public override fun convert(obj: DescriptorProtos.OneofDescriptorProto): OneofDescriptorProto =
      OneofDescriptorProto(
  	name = obj.getName(),
  	options = OneofOptionsJvmConverter.convert(obj.getOptions()),
  )

  public override fun convert(obj: OneofDescriptorProto): DescriptorProtos.OneofDescriptorProto {
    val builder = DescriptorProtos.OneofDescriptorProto.newBuilder()
    val value0 = obj.name
    if (value0 != null) {
      builder.setName(value0)
    }
    val value1 = obj.options
    if (value1 != null) {
      builder.setOptions(OneofOptionsJvmConverter.convert(value1))
    }
    return builder.build()
  }
}

public object EnumDescriptorProtoJvmConverter :
    ProtobufTypeMapper<EnumDescriptorProto, DescriptorProtos.EnumDescriptorProto> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.EnumDescriptorProto.getDescriptor()

  public override val parser: Parser<DescriptorProtos.EnumDescriptorProto> =
      DescriptorProtos.EnumDescriptorProto.parser()

  public override fun convert(obj: DescriptorProtos.EnumDescriptorProto): EnumDescriptorProto =
      EnumDescriptorProto(
  	name = obj.getName(),
  	`value` = obj.getValueList().map { EnumValueDescriptorProtoJvmConverter.convert(it) },
  	options = EnumOptionsJvmConverter.convert(obj.getOptions()),
  	reservedRange = obj.getReservedRangeList().map { EnumReservedRangeJvmConverter.convert(it) },
  	reservedName = obj.getReservedNameList().map { it },
  )

  public override fun convert(obj: EnumDescriptorProto): DescriptorProtos.EnumDescriptorProto {
    val builder = DescriptorProtos.EnumDescriptorProto.newBuilder()
    val value0 = obj.name
    if (value0 != null) {
      builder.setName(value0)
    }
    builder.addAllValue(obj.`value`.map { EnumValueDescriptorProtoJvmConverter.convert(it) })
    val value2 = obj.options
    if (value2 != null) {
      builder.setOptions(EnumOptionsJvmConverter.convert(value2))
    }
    builder.addAllReservedRange(obj.reservedRange.map { EnumReservedRangeJvmConverter.convert(it) })
    builder.addAllReservedName(obj.reservedName.map { it })
    return builder.build()
  }

  public object EnumReservedRangeJvmConverter :
      ProtobufTypeMapper<EnumDescriptorProto.EnumReservedRange, DescriptorProtos.EnumDescriptorProto.EnumReservedRange>
      {
    public override val descriptor: Descriptors.Descriptor =
        DescriptorProtos.EnumDescriptorProto.EnumReservedRange.getDescriptor()

    public override val parser: Parser<DescriptorProtos.EnumDescriptorProto.EnumReservedRange> =
        DescriptorProtos.EnumDescriptorProto.EnumReservedRange.parser()

    public override fun convert(obj: DescriptorProtos.EnumDescriptorProto.EnumReservedRange):
        EnumDescriptorProto.EnumReservedRange = EnumDescriptorProto.EnumReservedRange(
    	start = obj.getStart(),
    	end = obj.getEnd(),
    )

    public override fun convert(obj: EnumDescriptorProto.EnumReservedRange):
        DescriptorProtos.EnumDescriptorProto.EnumReservedRange {
      val builder = DescriptorProtos.EnumDescriptorProto.EnumReservedRange.newBuilder()
      val value0 = obj.start
      if (value0 != null) {
        builder.setStart(value0)
      }
      val value1 = obj.end
      if (value1 != null) {
        builder.setEnd(value1)
      }
      return builder.build()
    }
  }
}

public object EnumValueDescriptorProtoJvmConverter :
    ProtobufTypeMapper<EnumValueDescriptorProto, DescriptorProtos.EnumValueDescriptorProto> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.EnumValueDescriptorProto.getDescriptor()

  public override val parser: Parser<DescriptorProtos.EnumValueDescriptorProto> =
      DescriptorProtos.EnumValueDescriptorProto.parser()

  public override fun convert(obj: DescriptorProtos.EnumValueDescriptorProto):
      EnumValueDescriptorProto = EnumValueDescriptorProto(
  	name = obj.getName(),
  	number = obj.getNumber(),
  	options = EnumValueOptionsJvmConverter.convert(obj.getOptions()),
  )

  public override fun convert(obj: EnumValueDescriptorProto):
      DescriptorProtos.EnumValueDescriptorProto {
    val builder = DescriptorProtos.EnumValueDescriptorProto.newBuilder()
    val value0 = obj.name
    if (value0 != null) {
      builder.setName(value0)
    }
    val value1 = obj.number
    if (value1 != null) {
      builder.setNumber(value1)
    }
    val value2 = obj.options
    if (value2 != null) {
      builder.setOptions(EnumValueOptionsJvmConverter.convert(value2))
    }
    return builder.build()
  }
}

public object ServiceDescriptorProtoJvmConverter :
    ProtobufTypeMapper<ServiceDescriptorProto, DescriptorProtos.ServiceDescriptorProto> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.ServiceDescriptorProto.getDescriptor()

  public override val parser: Parser<DescriptorProtos.ServiceDescriptorProto> =
      DescriptorProtos.ServiceDescriptorProto.parser()

  public override fun convert(obj: DescriptorProtos.ServiceDescriptorProto): ServiceDescriptorProto
      = ServiceDescriptorProto(
  	name = obj.getName(),
  	method = obj.getMethodList().map { MethodDescriptorProtoJvmConverter.convert(it) },
  	options = ServiceOptionsJvmConverter.convert(obj.getOptions()),
  )

  public override fun convert(obj: ServiceDescriptorProto):
      DescriptorProtos.ServiceDescriptorProto {
    val builder = DescriptorProtos.ServiceDescriptorProto.newBuilder()
    val value0 = obj.name
    if (value0 != null) {
      builder.setName(value0)
    }
    builder.addAllMethod(obj.method.map { MethodDescriptorProtoJvmConverter.convert(it) })
    val value2 = obj.options
    if (value2 != null) {
      builder.setOptions(ServiceOptionsJvmConverter.convert(value2))
    }
    return builder.build()
  }
}

public object MethodDescriptorProtoJvmConverter :
    ProtobufTypeMapper<MethodDescriptorProto, DescriptorProtos.MethodDescriptorProto> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.MethodDescriptorProto.getDescriptor()

  public override val parser: Parser<DescriptorProtos.MethodDescriptorProto> =
      DescriptorProtos.MethodDescriptorProto.parser()

  public override fun convert(obj: DescriptorProtos.MethodDescriptorProto): MethodDescriptorProto =
      MethodDescriptorProto(
  	name = obj.getName(),
  	inputType = obj.getInputType(),
  	outputType = obj.getOutputType(),
  	options = MethodOptionsJvmConverter.convert(obj.getOptions()),
  	clientStreaming = obj.getClientStreaming(),
  	serverStreaming = obj.getServerStreaming(),
  )

  public override fun convert(obj: MethodDescriptorProto): DescriptorProtos.MethodDescriptorProto {
    val builder = DescriptorProtos.MethodDescriptorProto.newBuilder()
    val value0 = obj.name
    if (value0 != null) {
      builder.setName(value0)
    }
    val value1 = obj.inputType
    if (value1 != null) {
      builder.setInputType(value1)
    }
    val value2 = obj.outputType
    if (value2 != null) {
      builder.setOutputType(value2)
    }
    val value3 = obj.options
    if (value3 != null) {
      builder.setOptions(MethodOptionsJvmConverter.convert(value3))
    }
    val value4 = obj.clientStreaming
    if (value4 != null) {
      builder.setClientStreaming(value4)
    }
    val value5 = obj.serverStreaming
    if (value5 != null) {
      builder.setServerStreaming(value5)
    }
    return builder.build()
  }
}

public object FileOptionsJvmConverter :
    ProtobufTypeMapper<FileOptions, DescriptorProtos.FileOptions> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.FileOptions.getDescriptor()

  public override val parser: Parser<DescriptorProtos.FileOptions> =
      DescriptorProtos.FileOptions.parser()

  public override fun convert(obj: DescriptorProtos.FileOptions): FileOptions = FileOptions(
  	javaPackage = obj.getJavaPackage(),
  	javaOuterClassname = obj.getJavaOuterClassname(),
  	javaMultipleFiles = obj.getJavaMultipleFiles(),
  	javaGenerateEqualsAndHash = obj.getJavaGenerateEqualsAndHash(),
  	javaStringCheckUtf8 = obj.getJavaStringCheckUtf8(),
  	optimizeFor = FileOptions.OptimizeMode.forNumber(obj.getOptimizeFor().number),
  	goPackage = obj.getGoPackage(),
  	ccGenericServices = obj.getCcGenericServices(),
  	javaGenericServices = obj.getJavaGenericServices(),
  	pyGenericServices = obj.getPyGenericServices(),
  	phpGenericServices = obj.getPhpGenericServices(),
  	deprecated = obj.getDeprecated(),
  	ccEnableArenas = obj.getCcEnableArenas(),
  	objcClassPrefix = obj.getObjcClassPrefix(),
  	csharpNamespace = obj.getCsharpNamespace(),
  	swiftPrefix = obj.getSwiftPrefix(),
  	phpClassPrefix = obj.getPhpClassPrefix(),
  	phpNamespace = obj.getPhpNamespace(),
  	phpMetadataNamespace = obj.getPhpMetadataNamespace(),
  	rubyPackage = obj.getRubyPackage(),
  	uninterpretedOption = obj.getUninterpretedOptionList().map {
      UninterpretedOptionJvmConverter.convert(it) },
  )

  public override fun convert(obj: FileOptions): DescriptorProtos.FileOptions {
    val builder = DescriptorProtos.FileOptions.newBuilder()
    val value0 = obj.javaPackage
    if (value0 != null) {
      builder.setJavaPackage(value0)
    }
    val value1 = obj.javaOuterClassname
    if (value1 != null) {
      builder.setJavaOuterClassname(value1)
    }
    val value2 = obj.javaMultipleFiles
    if (value2 != null) {
      builder.setJavaMultipleFiles(value2)
    }
    val value3 = obj.javaGenerateEqualsAndHash
    if (value3 != null) {
      builder.setJavaGenerateEqualsAndHash(value3)
    }
    val value4 = obj.javaStringCheckUtf8
    if (value4 != null) {
      builder.setJavaStringCheckUtf8(value4)
    }
    val value5 = obj.optimizeFor
    if (value5 != null) {
      builder.setOptimizeFor(DescriptorProtos.FileOptions.OptimizeMode.forNumber(value5.number))
    }
    val value6 = obj.goPackage
    if (value6 != null) {
      builder.setGoPackage(value6)
    }
    val value7 = obj.ccGenericServices
    if (value7 != null) {
      builder.setCcGenericServices(value7)
    }
    val value8 = obj.javaGenericServices
    if (value8 != null) {
      builder.setJavaGenericServices(value8)
    }
    val value9 = obj.pyGenericServices
    if (value9 != null) {
      builder.setPyGenericServices(value9)
    }
    val value10 = obj.phpGenericServices
    if (value10 != null) {
      builder.setPhpGenericServices(value10)
    }
    val value11 = obj.deprecated
    if (value11 != null) {
      builder.setDeprecated(value11)
    }
    val value12 = obj.ccEnableArenas
    if (value12 != null) {
      builder.setCcEnableArenas(value12)
    }
    val value13 = obj.objcClassPrefix
    if (value13 != null) {
      builder.setObjcClassPrefix(value13)
    }
    val value14 = obj.csharpNamespace
    if (value14 != null) {
      builder.setCsharpNamespace(value14)
    }
    val value15 = obj.swiftPrefix
    if (value15 != null) {
      builder.setSwiftPrefix(value15)
    }
    val value16 = obj.phpClassPrefix
    if (value16 != null) {
      builder.setPhpClassPrefix(value16)
    }
    val value17 = obj.phpNamespace
    if (value17 != null) {
      builder.setPhpNamespace(value17)
    }
    val value18 = obj.phpMetadataNamespace
    if (value18 != null) {
      builder.setPhpMetadataNamespace(value18)
    }
    val value19 = obj.rubyPackage
    if (value19 != null) {
      builder.setRubyPackage(value19)
    }
    builder.addAllUninterpretedOption(obj.uninterpretedOption.map {
        UninterpretedOptionJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MessageOptionsJvmConverter :
    ProtobufTypeMapper<MessageOptions, DescriptorProtos.MessageOptions> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.MessageOptions.getDescriptor()

  public override val parser: Parser<DescriptorProtos.MessageOptions> =
      DescriptorProtos.MessageOptions.parser()

  public override fun convert(obj: DescriptorProtos.MessageOptions): MessageOptions =
      MessageOptions(
  	messageSetWireFormat = obj.getMessageSetWireFormat(),
  	noStandardDescriptorAccessor = obj.getNoStandardDescriptorAccessor(),
  	deprecated = obj.getDeprecated(),
  	mapEntry = obj.getMapEntry(),
  	deprecatedLegacyJsonFieldConflicts = obj.getDeprecatedLegacyJsonFieldConflicts(),
  	uninterpretedOption = obj.getUninterpretedOptionList().map {
      UninterpretedOptionJvmConverter.convert(it) },
  )

  public override fun convert(obj: MessageOptions): DescriptorProtos.MessageOptions {
    val builder = DescriptorProtos.MessageOptions.newBuilder()
    val value0 = obj.messageSetWireFormat
    if (value0 != null) {
      builder.setMessageSetWireFormat(value0)
    }
    val value1 = obj.noStandardDescriptorAccessor
    if (value1 != null) {
      builder.setNoStandardDescriptorAccessor(value1)
    }
    val value2 = obj.deprecated
    if (value2 != null) {
      builder.setDeprecated(value2)
    }
    val value3 = obj.mapEntry
    if (value3 != null) {
      builder.setMapEntry(value3)
    }
    val value4 = obj.deprecatedLegacyJsonFieldConflicts
    if (value4 != null) {
      builder.setDeprecatedLegacyJsonFieldConflicts(value4)
    }
    builder.addAllUninterpretedOption(obj.uninterpretedOption.map {
        UninterpretedOptionJvmConverter.convert(it) })
    return builder.build()
  }
}

public object FieldOptionsJvmConverter :
    ProtobufTypeMapper<FieldOptions, DescriptorProtos.FieldOptions> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.FieldOptions.getDescriptor()

  public override val parser: Parser<DescriptorProtos.FieldOptions> =
      DescriptorProtos.FieldOptions.parser()

  public override fun convert(obj: DescriptorProtos.FieldOptions): FieldOptions = FieldOptions(
  	ctype = FieldOptions.CType.forNumber(obj.getCtype().number),
  	packed = obj.getPacked(),
  	jstype = FieldOptions.JSType.forNumber(obj.getJstype().number),
  	lazy = obj.getLazy(),
  	unverifiedLazy = obj.getUnverifiedLazy(),
  	deprecated = obj.getDeprecated(),
  	weak = obj.getWeak(),
  	debugRedact = obj.getDebugRedact(),
  	retention = FieldOptions.OptionRetention.forNumber(obj.getRetention().number),
  	target = FieldOptions.OptionTargetType.forNumber(obj.getTarget().number),
  	uninterpretedOption = obj.getUninterpretedOptionList().map {
      UninterpretedOptionJvmConverter.convert(it) },
  )

  public override fun convert(obj: FieldOptions): DescriptorProtos.FieldOptions {
    val builder = DescriptorProtos.FieldOptions.newBuilder()
    val value0 = obj.ctype
    if (value0 != null) {
      builder.setCtype(DescriptorProtos.FieldOptions.CType.forNumber(value0.number))
    }
    val value1 = obj.packed
    if (value1 != null) {
      builder.setPacked(value1)
    }
    val value2 = obj.jstype
    if (value2 != null) {
      builder.setJstype(DescriptorProtos.FieldOptions.JSType.forNumber(value2.number))
    }
    val value3 = obj.lazy
    if (value3 != null) {
      builder.setLazy(value3)
    }
    val value4 = obj.unverifiedLazy
    if (value4 != null) {
      builder.setUnverifiedLazy(value4)
    }
    val value5 = obj.deprecated
    if (value5 != null) {
      builder.setDeprecated(value5)
    }
    val value6 = obj.weak
    if (value6 != null) {
      builder.setWeak(value6)
    }
    val value7 = obj.debugRedact
    if (value7 != null) {
      builder.setDebugRedact(value7)
    }
    val value8 = obj.retention
    if (value8 != null) {
      builder.setRetention(DescriptorProtos.FieldOptions.OptionRetention.forNumber(value8.number))
    }
    val value9 = obj.target
    if (value9 != null) {
      builder.setTarget(DescriptorProtos.FieldOptions.OptionTargetType.forNumber(value9.number))
    }
    builder.addAllUninterpretedOption(obj.uninterpretedOption.map {
        UninterpretedOptionJvmConverter.convert(it) })
    return builder.build()
  }
}

public object OneofOptionsJvmConverter :
    ProtobufTypeMapper<OneofOptions, DescriptorProtos.OneofOptions> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.OneofOptions.getDescriptor()

  public override val parser: Parser<DescriptorProtos.OneofOptions> =
      DescriptorProtos.OneofOptions.parser()

  public override fun convert(obj: DescriptorProtos.OneofOptions): OneofOptions = OneofOptions(
  	uninterpretedOption = obj.getUninterpretedOptionList().map {
      UninterpretedOptionJvmConverter.convert(it) },
  )

  public override fun convert(obj: OneofOptions): DescriptorProtos.OneofOptions {
    val builder = DescriptorProtos.OneofOptions.newBuilder()
    builder.addAllUninterpretedOption(obj.uninterpretedOption.map {
        UninterpretedOptionJvmConverter.convert(it) })
    return builder.build()
  }
}

public object EnumOptionsJvmConverter :
    ProtobufTypeMapper<EnumOptions, DescriptorProtos.EnumOptions> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.EnumOptions.getDescriptor()

  public override val parser: Parser<DescriptorProtos.EnumOptions> =
      DescriptorProtos.EnumOptions.parser()

  public override fun convert(obj: DescriptorProtos.EnumOptions): EnumOptions = EnumOptions(
  	allowAlias = obj.getAllowAlias(),
  	deprecated = obj.getDeprecated(),
  	deprecatedLegacyJsonFieldConflicts = obj.getDeprecatedLegacyJsonFieldConflicts(),
  	uninterpretedOption = obj.getUninterpretedOptionList().map {
      UninterpretedOptionJvmConverter.convert(it) },
  )

  public override fun convert(obj: EnumOptions): DescriptorProtos.EnumOptions {
    val builder = DescriptorProtos.EnumOptions.newBuilder()
    val value0 = obj.allowAlias
    if (value0 != null) {
      builder.setAllowAlias(value0)
    }
    val value1 = obj.deprecated
    if (value1 != null) {
      builder.setDeprecated(value1)
    }
    val value2 = obj.deprecatedLegacyJsonFieldConflicts
    if (value2 != null) {
      builder.setDeprecatedLegacyJsonFieldConflicts(value2)
    }
    builder.addAllUninterpretedOption(obj.uninterpretedOption.map {
        UninterpretedOptionJvmConverter.convert(it) })
    return builder.build()
  }
}

public object EnumValueOptionsJvmConverter :
    ProtobufTypeMapper<EnumValueOptions, DescriptorProtos.EnumValueOptions> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.EnumValueOptions.getDescriptor()

  public override val parser: Parser<DescriptorProtos.EnumValueOptions> =
      DescriptorProtos.EnumValueOptions.parser()

  public override fun convert(obj: DescriptorProtos.EnumValueOptions): EnumValueOptions =
      EnumValueOptions(
  	deprecated = obj.getDeprecated(),
  	uninterpretedOption = obj.getUninterpretedOptionList().map {
      UninterpretedOptionJvmConverter.convert(it) },
  )

  public override fun convert(obj: EnumValueOptions): DescriptorProtos.EnumValueOptions {
    val builder = DescriptorProtos.EnumValueOptions.newBuilder()
    val value0 = obj.deprecated
    if (value0 != null) {
      builder.setDeprecated(value0)
    }
    builder.addAllUninterpretedOption(obj.uninterpretedOption.map {
        UninterpretedOptionJvmConverter.convert(it) })
    return builder.build()
  }
}

public object ServiceOptionsJvmConverter :
    ProtobufTypeMapper<ServiceOptions, DescriptorProtos.ServiceOptions> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.ServiceOptions.getDescriptor()

  public override val parser: Parser<DescriptorProtos.ServiceOptions> =
      DescriptorProtos.ServiceOptions.parser()

  public override fun convert(obj: DescriptorProtos.ServiceOptions): ServiceOptions =
      ServiceOptions(
  	deprecated = obj.getDeprecated(),
  	uninterpretedOption = obj.getUninterpretedOptionList().map {
      UninterpretedOptionJvmConverter.convert(it) },
  )

  public override fun convert(obj: ServiceOptions): DescriptorProtos.ServiceOptions {
    val builder = DescriptorProtos.ServiceOptions.newBuilder()
    val value0 = obj.deprecated
    if (value0 != null) {
      builder.setDeprecated(value0)
    }
    builder.addAllUninterpretedOption(obj.uninterpretedOption.map {
        UninterpretedOptionJvmConverter.convert(it) })
    return builder.build()
  }
}

public object MethodOptionsJvmConverter :
    ProtobufTypeMapper<MethodOptions, DescriptorProtos.MethodOptions> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.MethodOptions.getDescriptor()

  public override val parser: Parser<DescriptorProtos.MethodOptions> =
      DescriptorProtos.MethodOptions.parser()

  public override fun convert(obj: DescriptorProtos.MethodOptions): MethodOptions = MethodOptions(
  	deprecated = obj.getDeprecated(),
  	idempotencyLevel = MethodOptions.IdempotencyLevel.forNumber(obj.getIdempotencyLevel().number),
  	uninterpretedOption = obj.getUninterpretedOptionList().map {
      UninterpretedOptionJvmConverter.convert(it) },
  )

  public override fun convert(obj: MethodOptions): DescriptorProtos.MethodOptions {
    val builder = DescriptorProtos.MethodOptions.newBuilder()
    val value0 = obj.deprecated
    if (value0 != null) {
      builder.setDeprecated(value0)
    }
    val value1 = obj.idempotencyLevel
    if (value1 != null) {
      builder.setIdempotencyLevel(DescriptorProtos.MethodOptions.IdempotencyLevel.forNumber(value1.number))
    }
    builder.addAllUninterpretedOption(obj.uninterpretedOption.map {
        UninterpretedOptionJvmConverter.convert(it) })
    return builder.build()
  }
}

public object UninterpretedOptionJvmConverter :
    ProtobufTypeMapper<UninterpretedOption, DescriptorProtos.UninterpretedOption> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.UninterpretedOption.getDescriptor()

  public override val parser: Parser<DescriptorProtos.UninterpretedOption> =
      DescriptorProtos.UninterpretedOption.parser()

  public override fun convert(obj: DescriptorProtos.UninterpretedOption): UninterpretedOption =
      UninterpretedOption(
  	name = obj.getNameList().map { NamePartJvmConverter.convert(it) },
  	identifierValue = obj.getIdentifierValue(),
  	positiveIntValue = obj.getPositiveIntValue().asKotlinType,
  	negativeIntValue = obj.getNegativeIntValue(),
  	doubleValue = obj.getDoubleValue(),
  	stringValue = obj.getStringValue().toByteArray(),
  	aggregateValue = obj.getAggregateValue(),
  )

  public override fun convert(obj: UninterpretedOption): DescriptorProtos.UninterpretedOption {
    val builder = DescriptorProtos.UninterpretedOption.newBuilder()
    builder.addAllName(obj.name.map { NamePartJvmConverter.convert(it) })
    val value1 = obj.identifierValue
    if (value1 != null) {
      builder.setIdentifierValue(value1)
    }
    val value2 = obj.positiveIntValue
    if (value2 != null) {
      builder.setPositiveIntValue(value2.asJavaType)
    }
    val value3 = obj.negativeIntValue
    if (value3 != null) {
      builder.setNegativeIntValue(value3)
    }
    val value4 = obj.doubleValue
    if (value4 != null) {
      builder.setDoubleValue(value4)
    }
    val value5 = obj.stringValue
    if (value5 != null) {
      builder.setStringValue(ByteString.copyFrom(value5))
    }
    val value6 = obj.aggregateValue
    if (value6 != null) {
      builder.setAggregateValue(value6)
    }
    return builder.build()
  }

  public object NamePartJvmConverter :
      ProtobufTypeMapper<UninterpretedOption.NamePart, DescriptorProtos.UninterpretedOption.NamePart>
      {
    public override val descriptor: Descriptors.Descriptor =
        DescriptorProtos.UninterpretedOption.NamePart.getDescriptor()

    public override val parser: Parser<DescriptorProtos.UninterpretedOption.NamePart> =
        DescriptorProtos.UninterpretedOption.NamePart.parser()

    public override fun convert(obj: DescriptorProtos.UninterpretedOption.NamePart):
        UninterpretedOption.NamePart = UninterpretedOption.NamePart(
    	namePart = obj.getNamePart(),
    	isExtension = obj.getIsExtension(),
    )

    public override fun convert(obj: UninterpretedOption.NamePart):
        DescriptorProtos.UninterpretedOption.NamePart {
      val builder = DescriptorProtos.UninterpretedOption.NamePart.newBuilder()
      builder.setNamePart(obj.namePart)
      builder.setIsExtension(obj.isExtension)
      return builder.build()
    }
  }
}

public object SourceCodeInfoJvmConverter :
    ProtobufTypeMapper<SourceCodeInfo, DescriptorProtos.SourceCodeInfo> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.SourceCodeInfo.getDescriptor()

  public override val parser: Parser<DescriptorProtos.SourceCodeInfo> =
      DescriptorProtos.SourceCodeInfo.parser()

  public override fun convert(obj: DescriptorProtos.SourceCodeInfo): SourceCodeInfo =
      SourceCodeInfo(
  	location = obj.getLocationList().map { LocationJvmConverter.convert(it) },
  )

  public override fun convert(obj: SourceCodeInfo): DescriptorProtos.SourceCodeInfo {
    val builder = DescriptorProtos.SourceCodeInfo.newBuilder()
    builder.addAllLocation(obj.location.map { LocationJvmConverter.convert(it) })
    return builder.build()
  }

  public object LocationJvmConverter :
      ProtobufTypeMapper<SourceCodeInfo.Location, DescriptorProtos.SourceCodeInfo.Location> {
    public override val descriptor: Descriptors.Descriptor =
        DescriptorProtos.SourceCodeInfo.Location.getDescriptor()

    public override val parser: Parser<DescriptorProtos.SourceCodeInfo.Location> =
        DescriptorProtos.SourceCodeInfo.Location.parser()

    public override fun convert(obj: DescriptorProtos.SourceCodeInfo.Location):
        SourceCodeInfo.Location = SourceCodeInfo.Location(
    	path = obj.getPathList().map { it },
    	span = obj.getSpanList().map { it },
    	leadingComments = obj.getLeadingComments(),
    	trailingComments = obj.getTrailingComments(),
    	leadingDetachedComments = obj.getLeadingDetachedCommentsList().map { it },
    )

    public override fun convert(obj: SourceCodeInfo.Location):
        DescriptorProtos.SourceCodeInfo.Location {
      val builder = DescriptorProtos.SourceCodeInfo.Location.newBuilder()
      builder.addAllPath(obj.path.map { it })
      builder.addAllSpan(obj.span.map { it })
      val value2 = obj.leadingComments
      if (value2 != null) {
        builder.setLeadingComments(value2)
      }
      val value3 = obj.trailingComments
      if (value3 != null) {
        builder.setTrailingComments(value3)
      }
      builder.addAllLeadingDetachedComments(obj.leadingDetachedComments.map { it })
      return builder.build()
    }
  }
}

public object GeneratedCodeInfoJvmConverter :
    ProtobufTypeMapper<GeneratedCodeInfo, DescriptorProtos.GeneratedCodeInfo> {
  public override val descriptor: Descriptors.Descriptor =
      DescriptorProtos.GeneratedCodeInfo.getDescriptor()

  public override val parser: Parser<DescriptorProtos.GeneratedCodeInfo> =
      DescriptorProtos.GeneratedCodeInfo.parser()

  public override fun convert(obj: DescriptorProtos.GeneratedCodeInfo): GeneratedCodeInfo =
      GeneratedCodeInfo(
  	`annotation` = obj.getAnnotationList().map { AnnotationJvmConverter.convert(it) },
  )

  public override fun convert(obj: GeneratedCodeInfo): DescriptorProtos.GeneratedCodeInfo {
    val builder = DescriptorProtos.GeneratedCodeInfo.newBuilder()
    builder.addAllAnnotation(obj.`annotation`.map { AnnotationJvmConverter.convert(it) })
    return builder.build()
  }

  public object AnnotationJvmConverter :
      ProtobufTypeMapper<GeneratedCodeInfo.Annotation, DescriptorProtos.GeneratedCodeInfo.Annotation>
      {
    public override val descriptor: Descriptors.Descriptor =
        DescriptorProtos.GeneratedCodeInfo.Annotation.getDescriptor()

    public override val parser: Parser<DescriptorProtos.GeneratedCodeInfo.Annotation> =
        DescriptorProtos.GeneratedCodeInfo.Annotation.parser()

    public override fun convert(obj: DescriptorProtos.GeneratedCodeInfo.Annotation):
        GeneratedCodeInfo.Annotation = GeneratedCodeInfo.Annotation(
    	path = obj.getPathList().map { it },
    	sourceFile = obj.getSourceFile(),
    	begin = obj.getBegin(),
    	end = obj.getEnd(),
    	semantic = GeneratedCodeInfo.Annotation.Semantic.forNumber(obj.getSemantic().number),
    )

    public override fun convert(obj: GeneratedCodeInfo.Annotation):
        DescriptorProtos.GeneratedCodeInfo.Annotation {
      val builder = DescriptorProtos.GeneratedCodeInfo.Annotation.newBuilder()
      builder.addAllPath(obj.path.map { it })
      val value1 = obj.sourceFile
      if (value1 != null) {
        builder.setSourceFile(value1)
      }
      val value2 = obj.begin
      if (value2 != null) {
        builder.setBegin(value2)
      }
      val value3 = obj.end
      if (value3 != null) {
        builder.setEnd(value3)
      }
      val value4 = obj.semantic
      if (value4 != null) {
        builder.setSemantic(DescriptorProtos.GeneratedCodeInfo.Annotation.Semantic.forNumber(value4.number))
      }
      return builder.build()
    }
  }
}

// Transform from cosmos/reflection/v1/reflection.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.reflection.v1

import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import google.protobuf.FileDescriptorProtoJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object FileDescriptorsRequestJvmConverter :
    ProtobufTypeMapper<FileDescriptorsRequest, Reflection.FileDescriptorsRequest> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.FileDescriptorsRequest.getDescriptor()

  public override val parser: Parser<Reflection.FileDescriptorsRequest> =
      Reflection.FileDescriptorsRequest.parser()

  public override fun convert(obj: Reflection.FileDescriptorsRequest): FileDescriptorsRequest =
      FileDescriptorsRequest(
  )

  public override fun convert(obj: FileDescriptorsRequest): Reflection.FileDescriptorsRequest {
    val builder = Reflection.FileDescriptorsRequest.newBuilder()
    return builder.build()
  }
}

public object FileDescriptorsResponseJvmConverter :
    ProtobufTypeMapper<FileDescriptorsResponse, Reflection.FileDescriptorsResponse> {
  public override val descriptor: Descriptors.Descriptor =
      Reflection.FileDescriptorsResponse.getDescriptor()

  public override val parser: Parser<Reflection.FileDescriptorsResponse> =
      Reflection.FileDescriptorsResponse.parser()

  public override fun convert(obj: Reflection.FileDescriptorsResponse): FileDescriptorsResponse =
      FileDescriptorsResponse(
  	files = obj.getFilesList().map { FileDescriptorProtoJvmConverter.convert(it) },
  )

  public override fun convert(obj: FileDescriptorsResponse): Reflection.FileDescriptorsResponse {
    val builder = Reflection.FileDescriptorsResponse.newBuilder()
    builder.addAllFiles(obj.files.map { FileDescriptorProtoJvmConverter.convert(it) })
    return builder.build()
  }
}

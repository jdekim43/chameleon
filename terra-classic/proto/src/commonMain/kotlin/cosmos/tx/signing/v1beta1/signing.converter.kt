// Transform from cosmos/tx/signing/v1beta1/signing.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.tx.signing.v1beta1

import google.protobuf.Any
import java.lang.IllegalStateException
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.ProtobufConverter
import kr.jadekim.protobuf.converter.parseProtobuf

public expect object SignatureDescriptorsConverter : ProtobufConverter<SignatureDescriptors>

public fun SignatureDescriptors.toAny(): Any = Any(SignatureDescriptors.TYPE_URL,
    with(SignatureDescriptorsConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SignatureDescriptors>): SignatureDescriptors {
  if (typeUrl != SignatureDescriptors.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

public expect object SignatureDescriptorConverter : ProtobufConverter<SignatureDescriptor> {
  public object DataConverter : ProtobufConverter<SignatureDescriptor.Data> {
    public object SingleConverter : ProtobufConverter<SignatureDescriptor.Data.Single>

    public object MultiConverter : ProtobufConverter<SignatureDescriptor.Data.Multi>
  }
}

public fun SignatureDescriptor.toAny(): Any = Any(SignatureDescriptor.TYPE_URL,
    with(SignatureDescriptorConverter) { toByteArray() })

public fun Any.parse(converter: ProtobufConverter<SignatureDescriptor>): SignatureDescriptor {
  if (typeUrl != SignatureDescriptor.TYPE_URL) throw
      IllegalStateException("Please check the type_url")
  return value.parseProtobuf(converter)
}

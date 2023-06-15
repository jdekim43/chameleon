// Transform from terra/tx/v1beta1/service.proto
@file:GeneratorVersion(version = "0.3.1")

package terra.tx.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import cosmos.base.v1beta1.CoinJvmConverter
import cosmos.tx.v1beta1.TxJvmConverter
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper

public object ComputeTaxRequestJvmConverter :
    ProtobufTypeMapper<ComputeTaxRequest, ServiceOuterClass.ComputeTaxRequest> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.ComputeTaxRequest.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.ComputeTaxRequest> =
      ServiceOuterClass.ComputeTaxRequest.parser()

  public override fun convert(obj: ServiceOuterClass.ComputeTaxRequest): ComputeTaxRequest =
      ComputeTaxRequest(
  	tx = TxJvmConverter.convert(obj.getTx()),
  	txBytes = obj.getTxBytes().toByteArray(),
  )

  public override fun convert(obj: ComputeTaxRequest): ServiceOuterClass.ComputeTaxRequest {
    val builder = ServiceOuterClass.ComputeTaxRequest.newBuilder()
    builder.setTx(TxJvmConverter.convert(obj.tx))
    builder.setTxBytes(ByteString.copyFrom(obj.txBytes))
    return builder.build()
  }
}

public object ComputeTaxResponseJvmConverter :
    ProtobufTypeMapper<ComputeTaxResponse, ServiceOuterClass.ComputeTaxResponse> {
  public override val descriptor: Descriptors.Descriptor =
      ServiceOuterClass.ComputeTaxResponse.getDescriptor()

  public override val parser: Parser<ServiceOuterClass.ComputeTaxResponse> =
      ServiceOuterClass.ComputeTaxResponse.parser()

  public override fun convert(obj: ServiceOuterClass.ComputeTaxResponse): ComputeTaxResponse =
      ComputeTaxResponse(
  	taxAmount = obj.getTaxAmountList().map { CoinJvmConverter.convert(it) },
  )

  public override fun convert(obj: ComputeTaxResponse): ServiceOuterClass.ComputeTaxResponse {
    val builder = ServiceOuterClass.ComputeTaxResponse.newBuilder()
    builder.addAllTaxAmount(obj.taxAmount.map { CoinJvmConverter.convert(it) })
    return builder.build()
  }
}

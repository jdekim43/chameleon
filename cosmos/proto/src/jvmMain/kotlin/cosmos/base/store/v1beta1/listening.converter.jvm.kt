// Transform from cosmos/base/store/v1beta1/listening.proto
@file:GeneratorVersion(version = "0.3.1")

package cosmos.base.store.v1beta1

import com.google.protobuf.ByteString
import com.google.protobuf.Descriptors
import com.google.protobuf.Parser
import kr.jadekim.protobuf.`annotation`.GeneratorVersion
import kr.jadekim.protobuf.converter.mapper.ProtobufTypeMapper
import tendermint.abci.RequestBeginBlockJvmConverter
import tendermint.abci.RequestDeliverTxJvmConverter
import tendermint.abci.RequestEndBlockJvmConverter
import tendermint.abci.ResponseBeginBlockJvmConverter
import tendermint.abci.ResponseCommitJvmConverter
import tendermint.abci.ResponseDeliverTxJvmConverter
import tendermint.abci.ResponseEndBlockJvmConverter

public object StoreKVPairJvmConverter : ProtobufTypeMapper<StoreKVPair, Listening.StoreKVPair> {
  public override val descriptor: Descriptors.Descriptor = Listening.StoreKVPair.getDescriptor()

  public override val parser: Parser<Listening.StoreKVPair> = Listening.StoreKVPair.parser()

  public override fun convert(obj: Listening.StoreKVPair): StoreKVPair = StoreKVPair(
  	storeKey = obj.getStoreKey(),
  	delete = obj.getDelete(),
  	key = obj.getKey().toByteArray(),
  	`value` = obj.getValue().toByteArray(),
  )

  public override fun convert(obj: StoreKVPair): Listening.StoreKVPair {
    val builder = Listening.StoreKVPair.newBuilder()
    builder.setStoreKey(obj.storeKey)
    builder.setDelete(obj.delete)
    builder.setKey(ByteString.copyFrom(obj.key))
    builder.setValue(ByteString.copyFrom(obj.`value`))
    return builder.build()
  }
}

public object BlockMetadataJvmConverter : ProtobufTypeMapper<BlockMetadata, Listening.BlockMetadata>
    {
  public override val descriptor: Descriptors.Descriptor = Listening.BlockMetadata.getDescriptor()

  public override val parser: Parser<Listening.BlockMetadata> = Listening.BlockMetadata.parser()

  public override fun convert(obj: Listening.BlockMetadata): BlockMetadata = BlockMetadata(
  	requestBeginBlock = RequestBeginBlockJvmConverter.convert(obj.getRequestBeginBlock()),
  	responseBeginBlock = ResponseBeginBlockJvmConverter.convert(obj.getResponseBeginBlock()),
  	deliverTxs = obj.getDeliverTxsList().map { DeliverTxJvmConverter.convert(it) },
  	requestEndBlock = RequestEndBlockJvmConverter.convert(obj.getRequestEndBlock()),
  	responseEndBlock = ResponseEndBlockJvmConverter.convert(obj.getResponseEndBlock()),
  	responseCommit = ResponseCommitJvmConverter.convert(obj.getResponseCommit()),
  )

  public override fun convert(obj: BlockMetadata): Listening.BlockMetadata {
    val builder = Listening.BlockMetadata.newBuilder()
    builder.setRequestBeginBlock(RequestBeginBlockJvmConverter.convert(obj.requestBeginBlock))
    builder.setResponseBeginBlock(ResponseBeginBlockJvmConverter.convert(obj.responseBeginBlock))
    builder.addAllDeliverTxs(obj.deliverTxs.map { DeliverTxJvmConverter.convert(it) })
    builder.setRequestEndBlock(RequestEndBlockJvmConverter.convert(obj.requestEndBlock))
    builder.setResponseEndBlock(ResponseEndBlockJvmConverter.convert(obj.responseEndBlock))
    builder.setResponseCommit(ResponseCommitJvmConverter.convert(obj.responseCommit))
    return builder.build()
  }

  public object DeliverTxJvmConverter :
      ProtobufTypeMapper<BlockMetadata.DeliverTx, Listening.BlockMetadata.DeliverTx> {
    public override val descriptor: Descriptors.Descriptor =
        Listening.BlockMetadata.DeliverTx.getDescriptor()

    public override val parser: Parser<Listening.BlockMetadata.DeliverTx> =
        Listening.BlockMetadata.DeliverTx.parser()

    public override fun convert(obj: Listening.BlockMetadata.DeliverTx): BlockMetadata.DeliverTx =
        BlockMetadata.DeliverTx(
    	request = RequestDeliverTxJvmConverter.convert(obj.getRequest()),
    	response = ResponseDeliverTxJvmConverter.convert(obj.getResponse()),
    )

    public override fun convert(obj: BlockMetadata.DeliverTx): Listening.BlockMetadata.DeliverTx {
      val builder = Listening.BlockMetadata.DeliverTx.newBuilder()
      builder.setRequest(RequestDeliverTxJvmConverter.convert(obj.request))
      builder.setResponse(ResponseDeliverTxJvmConverter.convert(obj.response))
      return builder.build()
    }
  }
}

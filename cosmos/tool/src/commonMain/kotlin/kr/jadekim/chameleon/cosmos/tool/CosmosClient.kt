package kr.jadekim.chameleon.cosmos.tool

import kr.jadekim.chameleon.cosmos.tool.broadcaster.TransactionApi
import kr.jadekim.protobuf.type.ProtobufServiceClient
import kr.jadekim.protobuf.type.ProtobufServiceClientOption

interface CosmosClient<ClientOption : ProtobufServiceClientOption> : ProtobufServiceClient<ClientOption> {

    fun accountInfoProvider(): AccountInfoProvider

    fun transactionApi(): TransactionApi
}
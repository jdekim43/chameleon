package kr.jadekim.chameleon.cosmos.client.grpc

import kr.jadekim.chameleon.cosmos.tool.CosmosClient
import kr.jadekim.protobuf.grpc.GrpcClient
import kr.jadekim.protobuf.grpc.GrpcClientOption
import kr.jadekim.protobuf.type.ProtobufService
import kr.jadekim.protobuf.type.ProtobufServiceFactory

open class CosmosGrpcClient : GrpcClient, CosmosClient<GrpcClientOption> {

    companion object {
        val DEFAULT_PORT = 9090
    }

    constructor(option: GrpcClientOption) : super(option)

    constructor(host: String, port: Int = DEFAULT_PORT, useTls: Boolean = false) : super(host, port, useTls)

    override fun accountInfoProvider() = GrpcAccountInfoProvider(this)

    override fun transactionApi() = GrpcTransactionApi(this)
}

open class CachedCosmosGrpcClient : CosmosGrpcClient {

    constructor(option: GrpcClientOption) : super(option)

    constructor(host: String, port: Int = DEFAULT_PORT, useTls: Boolean = false) : super(host, port, useTls)

    private val clients = mutableMapOf<ProtobufServiceFactory<*, *, GrpcClientOption>, ProtobufService>()

    override fun <I : ProtobufService, C : I, SF : ProtobufServiceFactory<I, C, GrpcClientOption>> service(factory: SF): C {
        @Suppress("UNCHECKED_CAST")
        return clients.getOrPut(factory) { super.service(factory) } as C
    }
}

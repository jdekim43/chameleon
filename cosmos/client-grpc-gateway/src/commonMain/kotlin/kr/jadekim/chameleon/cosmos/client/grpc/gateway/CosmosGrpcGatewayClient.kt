package kr.jadekim.chameleon.cosmos.client.grpc.gateway

import io.ktor.client.*
import kr.jadekim.chameleon.cosmos.tool.CosmosClient
import kr.jadekim.protobuf.grpc.gateway.GrpcGatewayClient
import kr.jadekim.protobuf.grpc.gateway.GrpcGatewayClientOption
import kr.jadekim.protobuf.type.ProtobufService
import kr.jadekim.protobuf.type.ProtobufServiceFactory

open class CosmosGrpcGatewayClient : GrpcGatewayClient, CosmosClient<GrpcGatewayClientOption> {

    companion object {
        val DEFAULT_PORT = 1317
    }

    constructor(option: GrpcGatewayClientOption) : super(option)

    constructor(httpClient: HttpClient) : super(httpClient)

    constructor(
        url: String,
        configure: HttpClientConfig<*>.() -> Unit = {},
    ) : super(DefaultCosmosGrpcGatewayClientOption(url, configure))

    constructor(
        host: String,
        port: Int,
        isHttps: Boolean = false,
        configure: HttpClientConfig<*>.() -> Unit = {},
    ) : this("${if (isHttps) "https" else "http"}://$host:$port", configure)

    override fun accountInfoProvider() = GrpcGatewayAccountInfoProvider(this)

    override fun transactionApi() = GrpcGatewayTransactionApi(this)
}

open class CachedCosmosGrpcGatewayClient : GrpcGatewayClient {

    constructor(option: GrpcGatewayClientOption) : super(option)

    constructor(httpClient: HttpClient) : super(httpClient)

    constructor(
        url: String,
        configure: HttpClientConfig<*>.() -> Unit = {},
    ) : super(DefaultCosmosGrpcGatewayClientOption(url, configure))

    constructor(
        host: String,
        port: Int,
        isHttps: Boolean = false,
        configure: HttpClientConfig<*>.() -> Unit = {},
    ) : this("${if (isHttps) "https" else "http"}://$host:$port", configure)

    private val clients = mutableMapOf<ProtobufServiceFactory<*, *, GrpcGatewayClientOption>, ProtobufService>()

    override fun <I : ProtobufService, C : I, SF : ProtobufServiceFactory<I, C, GrpcGatewayClientOption>> service(
        factory: SF
    ): C {
        @Suppress("UNCHECKED_CAST")
        return clients.getOrPut(factory) { super.service(factory) } as C
    }
}

internal expect fun DefaultCosmosGrpcGatewayClientOption(
    url: String,
    configure: HttpClientConfig<*>.() -> Unit = {},
): GrpcGatewayClientOption

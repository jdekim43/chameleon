package kr.jadekim.chameleon.cosmos.client.grpc

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kr.jadekim.protobuf.grpc.ClientOption
import kr.jadekim.protobuf.grpc.GrpcService
import kotlin.coroutines.CoroutineContext

interface CosmosGrpcClient : CoroutineScope {

    companion object {
        val DEFAULT_PORT: Int = 9090
    }

    val option: ClientOption

    fun <Client : Any, Service : GrpcService<*, Client>> service(service: Service): Client =
        service.createClient(option)
}

class SimpleCosmosGrpcClient(
    override val option: ClientOption,
    coroutineContext: CoroutineContext? = null,
) : CosmosGrpcClient {

    override val coroutineContext: CoroutineContext = coroutineContext ?: CoroutineName("CosmosGrpcClient")

    private val clients = mutableMapOf<GrpcService<*, *>, Any>()

    override fun <Client : Any, Service : GrpcService<*, Client>> service(service: Service): Client {
        @Suppress("UNCHECKED_CAST")
        return clients.getOrPut(service) { super.service(service) } as Client
    }
}

fun CosmosGrpcClient(
    host: String,
    port: Int = CosmosGrpcClient.DEFAULT_PORT,
    coroutineContext: CoroutineContext? = null,
): CosmosGrpcClient = CosmosGrpcClient(DefaultCosmosGrpcClientOption(host, port), coroutineContext)

fun CosmosGrpcClient(
    option: ClientOption,
    coroutineContext: CoroutineContext? = null,
): CosmosGrpcClient = SimpleCosmosGrpcClient(option, coroutineContext)

expect fun DefaultCosmosGrpcClientOption(
    host: String,
    port: Int,
): ClientOption

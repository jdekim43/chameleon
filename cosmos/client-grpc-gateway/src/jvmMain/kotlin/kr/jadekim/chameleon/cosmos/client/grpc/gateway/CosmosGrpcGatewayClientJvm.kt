package kr.jadekim.chameleon.cosmos.client.grpc.gateway

import cosmos.sdk.JvmTypeRegistry
import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import kr.jadekim.protobuf.grpc.gateway.GrpcGatewayClientOption
import kr.jadekim.protobuf.kotlinx.ProtobufJsonFormat

internal actual fun DefaultCosmosGrpcGatewayClientOption(
    url: String,
    configure: HttpClientConfig<*>.() -> Unit,
): GrpcGatewayClientOption = GrpcGatewayClientOption(url, OkHttp.create(), ProtobufJsonFormat(JvmTypeRegistry.messages), configure)

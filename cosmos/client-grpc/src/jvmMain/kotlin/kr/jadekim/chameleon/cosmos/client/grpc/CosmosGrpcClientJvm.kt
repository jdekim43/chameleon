package kr.jadekim.chameleon.cosmos.client.grpc

import io.grpc.ManagedChannelBuilder
import kr.jadekim.protobuf.grpc.ClientOption

actual fun DefaultCosmosGrpcClientOption(
    host: String,
    port: Int,
) = ClientOption(
    ManagedChannelBuilder.forAddress(host, port)
        .usePlaintext()
        .build(),
)

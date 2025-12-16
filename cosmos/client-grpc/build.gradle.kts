kotlin {
    sourceSets {

        val commonMain by getting {
            dependencies {
                val chameleonProtoBuildVersion: String by project
                val cosmosSdkVersion: String by project
                val kotlinProtobufVersion: String by project
                val kotlinxCoroutineVersion: String by project

                implementation(project(":chameleon-cosmos:chameleon-cosmos-tool"))

                implementation("kr.jadekim:chameleon-proto-cosmos-sdk:$cosmosSdkVersion-$chameleonProtoBuildVersion")
                implementation("kr.jadekim:kotlin-protobuf-grpc:$kotlinProtobufVersion")

                implementation(libs.kotlinx.coroutine.core)
            }
        }

        val jvmMain by getting {
            dependencies {
                val grpcVersion: String by project
                val grpcKotlinVersion: String by project

                api("io.grpc:grpc-kotlin-stub:$grpcKotlinVersion")
                runtimeOnly("io.grpc:grpc-netty:$grpcVersion")
            }
        }
    }
}
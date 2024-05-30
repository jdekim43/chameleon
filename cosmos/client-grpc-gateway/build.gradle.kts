kotlin {
    sourceSets {

        val commonMain by getting {
            dependencies {
                val chameleonProtoBuildVersion: String by project
                val cosmosSdkVersion: String by project
                val kotlinProtobufVersion: String by project
                val kotlinxCoroutineVersion: String by project
                val kotlinxSerializationVersion: String by project

                implementation(project(":chameleon-cosmos:chameleon-cosmos-tool"))

                implementation("kr.jadekim:chameleon-proto-cosmos-sdk:$cosmosSdkVersion-$chameleonProtoBuildVersion")
                implementation("kr.jadekim:kotlin-protobuf-grpc-gateway:$kotlinProtobufVersion")

                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutineVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$kotlinxSerializationVersion")
            }
        }

        val jvmMain by getting {
            dependencies {
                val ktorVersion: String by project

                implementation("io.ktor:ktor-client-okhttp:$ktorVersion")
            }
        }
    }
}
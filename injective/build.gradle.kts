kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                val kotlinxCoroutineVersion: String by project

                api(project(":chameleon-cosmos:chameleon-cosmos-tool"))
                api(project(":chameleon-cosmos:chameleon-cosmos-client-grpc")) {
                    exclude("kr.jadekim", "chameleon-proto-cosmos-sdk")
                }
                api(project(":chameleon-injective:chameleon-injective-type"))
                api(project(":chameleon-injective:chameleon-injective-wallet"))

                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutineVersion")
            }
        }

        val jvmMain by getting {
            dependencies {
                val protobufVersion: String by project

                implementation("com.google.protobuf:protobuf-java-util:$protobufVersion")
            }
        }
    }
}
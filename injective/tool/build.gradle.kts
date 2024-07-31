kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                val kotlinProtobufVersion: String by project
                val kotlinxCoroutineVersion: String by project

                api(project(":chameleon-cosmos:chameleon-cosmos-tool"))
                implementation(project(":chameleon-injective:chameleon-injective-type"))
                implementation(project(":chameleon-injective:chameleon-injective-wallet"))
                implementation("kr.jadekim:kotlin-protobuf-core:$kotlinProtobufVersion")

                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutineVersion")
            }
        }
    }
}
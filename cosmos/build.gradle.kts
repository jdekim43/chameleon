kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                val kotlinxCoroutineVersion: String by project

                api(project(":chameleon-cosmos:chameleon-cosmos-type"))
                api(project(":chameleon-cosmos:chameleon-cosmos-wallet"))
                api(project(":chameleon-cosmos:chameleon-cosmos-client-grpc"))
                api(project(":chameleon-cosmos:chameleon-cosmos-tool"))

                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutineVersion")
            }
        }
    }
}
kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                val kotlinxCoroutineVersion: String by project

                api(project(":chameleon-cosmos:chameleon-cosmos-tool"))
                api(project(":chameleon-cosmos:chameleon-cosmos-client-grpc"))
                api(project(":chameleon-sei:chameleon-sei-type"))
                api(project(":chameleon-sei:chameleon-sei-wallet"))

                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutineVersion")
            }
        }
    }
}
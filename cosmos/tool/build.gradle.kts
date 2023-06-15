kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                val kotlinxCoroutineVersion: String by project

                api(project(":chameleon-core:chameleon-core-tool"))
                implementation(project(":chameleon-cosmos:chameleon-cosmos-type"))
                implementation(project(":chameleon-cosmos:chameleon-cosmos-wallet"))

                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutineVersion")
            }
        }
    }
}
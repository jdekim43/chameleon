kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                val kotlinxCoroutineVersion: String by project
                val commonUtilVersion: String by project

                api(project(":chameleon-cosmos:chameleon-cosmos-wallet"))

                implementation(project(":chameleon-core:chameleon-core-crypto"))

                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutineVersion")

                implementation("kr.jadekim:common-util:$commonUtilVersion")
                implementation("kr.jadekim:common-hash:$commonUtilVersion")
                implementation("kr.jadekim:common-encoder:$commonUtilVersion")
            }
        }
    }
}
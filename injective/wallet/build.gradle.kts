kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                val kotlinxCoroutineVersion: String by project
                val commonUtilVersion: String by project

                api(project(":chameleon-cosmos:chameleon-cosmos-wallet"))

                api(project(":chameleon-core:chameleon-core-crypto"))

                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutineVersion")

                api("kr.jadekim:common-util:$commonUtilVersion")
                api("kr.jadekim:common-hash:$commonUtilVersion")
                api("kr.jadekim:common-encoder:$commonUtilVersion")

                compileOnly(project(":chameleon-cosmos:chameleon-cosmos-type"))
            }
        }
    }
}
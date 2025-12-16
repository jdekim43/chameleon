kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                val kotlinxCoroutineVersion: String by project

                api(project(":chameleon-core:chameleon-core-wallet"))

                api(project(":chameleon-core:chameleon-core-crypto"))

                implementation(libs.kotlinx.coroutine.core)

                implementation(libs.jade.common.util)
                implementation(libs.jade.common.encoder)
                implementation(libs.jade.common.crypto)

//                compileOnly(project(":chameleon-cosmos:chameleon-cosmos-type"))
            }
        }
    }
}
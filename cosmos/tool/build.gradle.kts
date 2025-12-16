kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                val kotlinProtobufVersion: String by project
                val kotlinxCoroutineVersion: String by project

                api(project(":chameleon-core:chameleon-core-tool"))
                implementation(project(":chameleon-cosmos:chameleon-cosmos-type"))
                implementation(project(":chameleon-cosmos:chameleon-cosmos-wallet"))
                implementation("kr.jadekim:kotlin-protobuf-core:$kotlinProtobufVersion")

                implementation(libs.kotlinx.coroutine.core)
            }
        }
    }
}
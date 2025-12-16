kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                val kotlinProtobufVersion: String by project
                val kotlinxCoroutineVersion: String by project

                api(project(":chameleon-cosmos:chameleon-cosmos-tool"))
                implementation(project(":chameleon-initia:chameleon-initia-type"))
                implementation(project(":chameleon-initia:chameleon-initia-wallet"))
                implementation("kr.jadekim:kotlin-protobuf-core:$kotlinProtobufVersion")

                implementation(libs.kotlinx.coroutine.core)
            }
        }
    }
}
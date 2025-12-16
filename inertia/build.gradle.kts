kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                val kotlinxCoroutineVersion: String by project

                api(project(":chameleon-cosmos:chameleon-cosmos-tool"))
                api(project(":chameleon-inertia:chameleon-inertia-type"))
                api(project(":chameleon-initia:chameleon-initia-wallet"))

                implementation(libs.kotlinx.coroutine.core)
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
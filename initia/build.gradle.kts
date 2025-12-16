kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                val kotlinxCoroutineVersion: String by project

                api(project(":chameleon-initia:chameleon-initia-type"))
                api(project(":chameleon-initia:chameleon-initia-wallet"))
                api(project(":chameleon-initia:chameleon-initia-tool"))

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
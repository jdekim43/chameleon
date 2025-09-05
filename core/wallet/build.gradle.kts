kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                val kotlinxCoroutineVersion: String by project
                val commonUtilVersion: String by project

                implementation(project(":chameleon-core:chameleon-core-crypto"))

                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutineVersion")

                implementation("kr.jadekim:common-util:$commonUtilVersion")
                implementation("kr.jadekim:common-encoder:$commonUtilVersion")
            }
        }
    }
}
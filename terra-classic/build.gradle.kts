kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                val kotlinxCoroutineVersion: String by project

                api(project(":chameleon-cosmos:chameleon-cosmos-tool"))
                api(project(":chameleon-terra:chameleon-terra-wallet"))
                api(project(":chameleon-terra-classic:chameleon-terra-classic-type"))

                implementation(libs.kotlinx.coroutine.core)
            }
        }
    }
}
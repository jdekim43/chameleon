kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(project(":chameleon-core:chameleon-core-type"))
            implementation(project(":chameleon-core:chameleon-core-wallet"))

            implementation(libs.kotlinx.coroutine.core)
        }
    }
}
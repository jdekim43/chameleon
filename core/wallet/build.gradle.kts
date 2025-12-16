kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(project(":chameleon-core:chameleon-core-crypto"))

            implementation(libs.kotlinx.coroutine.core)

            implementation(libs.jade.common.util)
            implementation(libs.jade.common.encoder)
            implementation(libs.jade.common.crypto)

            implementation(libs.doistx.normalize)
            implementation(libs.cryptography.core)
            implementation(libs.cryptography.provider.optimal)
        }
    }
}
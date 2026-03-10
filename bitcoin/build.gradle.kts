kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":chameleon-bitcoin:chameleon-bitcoin-wallet"))
            }
        }
    }
}
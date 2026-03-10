kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":chameleon-solana:chameleon-solana-wallet"))
            }
        }
    }
}
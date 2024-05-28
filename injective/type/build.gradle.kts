kotlin {
    sourceSets {
//        all {
//            languageSettings {
//                optIn("kotlin.RequiresOptIn")
//            }
//        }

        val commonMain by getting {
            dependencies {
                val cosmosSdkVersion: String by project
                val cosmwasmWasmdVersion: String by project
                val injectiveCoreVersion: String by project

                api(project(":chameleon-cosmos:chameleon-cosmos-type")) {
                    exclude("kr.jadekim", "chameleon-proto-cosmos-sdk")
                }
                api("kr.jadekim:chameleon-proto-cosmos-sdk:$cosmosSdkVersion")
                api("kr.jadekim:chameleon-proto-cosmwasm-wasmd:$cosmwasmWasmdVersion")
                api("kr.jadekim:chameleon-proto-injective-core:$injectiveCoreVersion")
            }
        }

        val jvmMain by getting {
            dependencies {
            }
        }
    }
}
kotlin {
    sourceSets {
//        all {
//            languageSettings {
//                optIn("kotlin.RequiresOptIn")
//            }
//        }

        val commonMain by getting {
            dependencies {
                val chameleonProtoBuildVersion: String by project
                val cosmosSdkVersion: String by project
                val cosmosIbcVersion: String by project
                val cosmwasmWasmdVersion: String by project
                val terraClassicCoreVersion: String by project

                api(project(":chameleon-cosmos:chameleon-cosmos-type")) {
                    exclude("kr.jadekim", "chameleon-proto-cosmos-sdk")
                }
                api("kr.jadekim:chameleon-proto-cosmos-sdk:$cosmosSdkVersion-$chameleonProtoBuildVersion")
                api("kr.jadekim:chameleon-proto-cosmos-ibc:$cosmosIbcVersion-$chameleonProtoBuildVersion")
                api("kr.jadekim:chameleon-proto-cosmwasm-wasmd:$cosmwasmWasmdVersion-$chameleonProtoBuildVersion")
                api("kr.jadekim:chameleon-proto-terra-classic-core:$terraClassicCoreVersion-$chameleonProtoBuildVersion")
            }
        }

        val jvmMain by getting {
            dependencies {
            }
        }
    }
}
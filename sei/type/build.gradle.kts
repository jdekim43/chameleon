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
                val seiCosmosSdkVersion: String by project
                val cosmwasmWasmdVersion: String by project
                val seiVersion: String by project

                api(project(":chameleon-cosmos:chameleon-cosmos-type")) {
                    exclude("kr.jadekim", "chameleon-proto-cosmos-sdk")
                }
                api("kr.jadekim:chameleon-proto-sei-cosmos:$seiCosmosSdkVersion-$chameleonProtoBuildVersion")
                api("kr.jadekim:chameleon-proto-cosmwasm-wasmd:$cosmwasmWasmdVersion-$chameleonProtoBuildVersion")
                api("kr.jadekim:chameleon-proto-sei-chain:$seiVersion-$chameleonProtoBuildVersion")
            }
        }

        val jvmMain by getting {
            dependencies {
            }
        }
    }
}
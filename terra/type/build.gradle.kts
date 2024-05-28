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
                val terraAllianceVersion: String by project

                api(project(":chameleon-cosmos:chameleon-cosmos-type")) {
                    exclude("kr.jadekim", "chameleon-proto-cosmos-sdk")
                }
                api("kr.jadekim:chameleon-proto-cosmos-sdk:$cosmosSdkVersion")
                api("kr.jadekim:chameleon-proto-cosmwasm-wasmd:$cosmwasmWasmdVersion")
                api("kr.jadekim:chameleon-proto-terra-alliance:$terraAllianceVersion")
            }
        }

        val jvmMain by getting {
            dependencies {
            }
        }
    }
}
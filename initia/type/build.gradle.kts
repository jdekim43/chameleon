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
                val skipConnectVersion: String by project
                val initiaOpinitVersion: String by project
                val initiaVersion: String by project

                api(project(":chameleon-cosmos:chameleon-cosmos-type")) {
                    exclude("kr.jadekim", "chameleon-proto-cosmos-sdk")
                }
                api("kr.jadekim:chameleon-proto-cosmos-sdk:$cosmosSdkVersion-$chameleonProtoBuildVersion")
                api("kr.jadekim:chameleon-proto-cosmos-ibc:$cosmosIbcVersion-$chameleonProtoBuildVersion")
                api("kr.jadekim:chameleon-proto-skip-connect:$skipConnectVersion-$chameleonProtoBuildVersion")
                api("kr.jadekim:chameleon-proto-initia-opinit:$initiaOpinitVersion-$chameleonProtoBuildVersion")
                api("kr.jadekim:chameleon-proto-initia:$initiaVersion-$chameleonProtoBuildVersion")
            }
        }

        val jvmMain by getting {
            dependencies {
            }
        }
    }
}
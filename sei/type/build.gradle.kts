kotlin {
    sourceSets {
//        all {
//            languageSettings {
//                optIn("kotlin.RequiresOptIn")
//            }
//        }

        val commonMain by getting {
            dependencies {
                api(project(":chameleon-cosmos:chameleon-cosmos-type"))
                api(project(":chameleon-cosmwasm:chameleon-cosmwasm-proto"))
                api(project(":chameleon-sei:chameleon-sei-proto"))
            }
        }

        val jvmMain by getting {
            dependencies {
            }
        }
    }
}
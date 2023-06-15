rootProject.name = "chameleon"

include(
    ":core",
    ":core:crypto",
    ":core:tool",
    ":core:type",
    ":core:wallet",
    ":cosmos",
    ":cosmos:proto",
    ":cosmos:type",
    ":cosmos:tool",
    ":cosmos:wallet",
//    ":cosmos:format-amino",
//    ":cosmos:format-proto",
    ":cosmos:client-grpc",
    ":cosmwasm",
    ":cosmwasm:proto",
    ":terra",
    ":terra:proto",
    ":terra:type",
    ":terra:wallet",
    ":terra-classic",
    ":terra-classic:proto",
    ":terra-classic:type",
    ":sei",
    ":sei:proto",
    ":sei:type",
    ":sei:wallet",
)

fun ProjectDescriptor.renameChildren() {
    children.forEach {
        val origin = it.name
        if (it.parent != null) {
            it.name = it.parent!!.name + "-" + it.name
        }
        println("$origin to ${it.name} : ${it.path}")
        it.renameChildren()
    }
}

rootProject.renameChildren()

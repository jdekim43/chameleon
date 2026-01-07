import org.jetbrains.dokka.gradle.tasks.DokkaGeneratePublicationTask
import org.jreleaser.model.Active
import org.jreleaser.model.Signing

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.dokka)
    alias(libs.plugins.dokka.javadoc)
    alias(libs.plugins.jreleaser)
    alias(libs.plugins.kotest)
    alias(libs.plugins.ksp)
    alias(libs.plugins.goncalossilva.resources)

    id("maven-publish")
}

allprojects {
    repositories {
        mavenCentral()
        mavenLocal()
    }

    group = "kr.jadekim"
    version = "0.6.0-beta1"
}

configure(allprojects.filter { !it.hasProperty("IGNORE_GLOBAL_CONFIGURATION") }) {
    apply {
        plugin("kotlin-multiplatform")
        plugin("org.jetbrains.dokka")
        plugin("maven-publish")
        plugin("io.kotest")
        plugin("com.google.devtools.ksp")
        plugin("com.goncalossilva.resources")
    }

    kotlin {
        jvmToolchain(21)
        jvm {
            testRuns["test"].executionTask.configure {
                useJUnitPlatform()
            }
        }

        sourceSets {
            commonTest.dependencies {
                implementation(rootProject.libs.kotest.framework.engine)
                implementation(rootProject.libs.kotest.assertions.core)
                implementation(rootProject.libs.goncalossilva.resources)
            }
            jvmTest.dependencies {
                implementation(rootProject.libs.kotest.runner.junit5)
            }
        }
    }

    val javadocJar: TaskProvider<Jar> by tasks.registering(Jar::class) {
        dependsOn(tasks.named<DokkaGeneratePublicationTask>("dokkaGeneratePublicationHtml"))
        archiveClassifier.set("javadoc")
        from(tasks.named<DokkaGeneratePublicationTask>("dokkaGeneratePublicationHtml").flatMap { it.outputDirectory })
    }

    publishing {
        publications.withType<MavenPublication> {
            artifact(javadocJar)
            pom {
                name.set(project.name)
                description.set("Crypto Wallet SDK for multiple blockchains")
                url.set("https://github.com/jdekim43/chameleon")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("jdekim43")
                        name.set("Jade Kim")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/jdekim43/chameleon.git")
                    developerConnection.set("scm:git:git://github.com/jdekim43/chameleon.git")
                    url.set("https://github.com/jdekim43/chameleon")
                }
            }
        }

        repositories {
            maven {
                setUrl(layout.buildDirectory.dir("staging-deploy"))
            }
        }
    }
}

configure(subprojects.filter {
    it.hasProperty("SUPPORT_FULL_MPP") && it.property("SUPPORT_FULL_MPP")?.toString()?.toBoolean() == true
}) {
    kotlin {
//        js {
//            browser()
//            nodejs()
//        }

        iosArm64()
        iosSimulatorArm64()
    }
}

jreleaser {
    project {
        author("Jade Kim")
        license.set("Apache-2.0")
        links {
            vcsBrowser.set("https://github.com/jdekim43/chameleon")
        }
        inceptionYear.set("2021")
    }

    signing {
        active.set(Active.ALWAYS)
        armored.set(true)
        mode.set(Signing.Mode.FILE)
    }

    deploy {
        maven {
            mavenCentral {
                create("release") {
                    active.set(Active.RELEASE)
                    url.set("https://central.sonatype.com/api/v1/publisher")

                    subprojects.forEach {
                        stagingRepository(it.layout.buildDirectory.dir("staging-deploy").get().asFile.absolutePath)
                    }
                }
            }
            nexus2 {
                create("snapshot") {
                    active.set(Active.SNAPSHOT)
                    url.set("https://central.sonatype.com/repository/maven-snapshots")
                    snapshotUrl.set("https://central.sonatype.com/repository/maven-snapshots")
                    applyMavenCentralRules.set(true)
                    snapshotSupported.set(true)
                    closeRepository.set(true)
                    releaseRepository.set(true)

                    subprojects.forEach {
                        stagingRepository(it.layout.buildDirectory.dir("staging-deploy").get().asFile.absolutePath)
                    }
                }
            }
        }
    }

    release {
        github {
            repoOwner = "jdekim43"
        }
    }
}

tasks.named("publish") {
    doFirst {
        layout.buildDirectory.dir("staging-deploy").get().asFile.delete()

        subprojects.forEach {
            it.layout.buildDirectory.dir("staging-deploy").get().asFile.delete()
        }
    }

    subprojects.forEach {
        dependsOn(":${it.path}:publish")
    }

    finalizedBy(":jreleaserFullRelease")
}

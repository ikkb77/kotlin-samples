pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "grpc-hello-world-gradle"

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

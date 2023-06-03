plugins {
    application
    kotlin("jvm") version "1.8.21"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("reflect"))
    implementation("com.google.cloud:google-cloud-vision:3.16.0")
    testImplementation("junit:junit:4.13.2")
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("com.google.vision.QuickstartKt")
}

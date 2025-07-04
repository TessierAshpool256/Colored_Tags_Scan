plugins {
    id("buildsrc.convention.kotlin-jvm")
    id("com.github.johnrengelman.shadow") version "8.1.1"

    alias(libs.plugins.kotlinPluginSerialization)
    application
}

dependencies {
    implementation(libs.kotlinxSerialization)
}

application {
    mainClass = "org.obsidian.tags.app.AppKt"
}

tasks.shadowJar {
    manifest {
        attributes["Main-Class"] = "org.obsidian.tags.app.AppKt"
    }
    mergeServiceFiles()
}

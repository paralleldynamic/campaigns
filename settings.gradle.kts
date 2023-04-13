pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }

    plugins {
        val kotlinVersion: String by settings
        val ktorVersion: String by settings
        val composeVersion: String by settings

        kotlin("jvm").version(kotlinVersion)
        kotlin("multiplatform").version(kotlinVersion)
        kotlin("plugin.serialization").version(kotlinVersion)
        id("io.ktor.plugin").version(ktorVersion)
        id("org.jetbrains.compose").version(composeVersion)
    }
}

rootProject.name = "campaigns"
include("backend", "frontend:desktop", "frontend:web")

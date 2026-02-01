enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "perspective-momentary-button"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://nexus.inductiveautomation.com/repository/public")
    }
    plugins{
        id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
    }
}

includeBuild(
    "build-logic"
)
include(
    ":common",
    ":gateway",
    ":designer",
    ":web"
)

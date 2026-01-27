// this file configures settings for the gradle build tools, as well as the project structure.
// Generally this doesn't need to be altered unless you are adding/removing sub-projects.

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven {
            url = uri("https://nexus.inductiveautomation.com/repository/public/")
        }
    }
}

dependencyResolutionManagement {
    repositories {
        mavenLocal()
        maven { url = uri("https://nexus.inductiveautomation.com/repository/public/") }
        maven { url = uri("https://nexus.inductiveautomation.com/repository/inductiveautomation-thirdparty/") }
        maven { url = uri("https://nexus.inductiveautomation.com/repository/inductiveautomation-releases/") }
        maven { url = uri("https://nexus.inductiveautomation.com/repository/inductiveautomation-snapshots/") }
        mavenCentral()
        google()
    }
}

rootProject.name = "perspective-momentary-button"

// link up our subprojects as part of this multi-project build.  Add/remove subprojects gradle path notation.
include(":common", ":gateway", ":designer", ":web")

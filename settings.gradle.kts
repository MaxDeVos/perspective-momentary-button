// this file configures settings for the gradle build tools, as well as the project structure.
// Generally this doesn't need to be altered unless you are adding/removing sub-projects.
rootProject.name = "perspective-momentary-button"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://nexus.inductiveautomation.com/repository/public/")
    }
}

dependencyResolutionManagement {
    repositories {
        maven("https://nexus.inductiveautomation.com/repository/public/")
    }
}

// link up our subprojects as part of this multi-project build.  Add/remove subprojects gradle path notation.
include(
    ":common",
    ":gateway",
    ":designer",
    ":web"
)

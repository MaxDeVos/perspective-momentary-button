package org.imdc.conventions

import libs

plugins {
    base
    alias(libs.plugins.spotless)
}

group = "org.imdc.perspective.momentarybutton"

repositories {
    maven("https://nexus.inductiveautomation.com/repository/public/")
    gradlePluginPortal()
    mavenCentral()
}

spotless {
    ratchetFrom("HEAD")
    format("misc") {
        target("*.gradle", ".gitattributes", ".gitignore")
        trimTrailingWhitespace()
        endWithNewline()
    }
}

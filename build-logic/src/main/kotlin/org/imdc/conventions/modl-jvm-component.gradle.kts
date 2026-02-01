package org.imdc.conventions

import com.diffplug.gradle.spotless.SpotlessExtension
import libs

plugins {
    id("org.imdc.conventions.modl-component")
    `java-library`
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(libs.versions.java.get()))
    }
}

configure<SpotlessExtension> {
    java {
        palantirJavaFormat()
        formatAnnotations()
    }
    kotlin {
        ktlint()
    }
    kotlinGradle {
        ktlint()
    }
}
